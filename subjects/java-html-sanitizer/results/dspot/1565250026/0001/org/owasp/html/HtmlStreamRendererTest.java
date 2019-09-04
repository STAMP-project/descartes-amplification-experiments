package org.owasp.html;


import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import junit.framework.TestCase;


@SuppressWarnings("javadoc")
public class HtmlStreamRendererTest extends TestCase {
    private final List<String> errors = Lists.newArrayList();

    private final StringBuilder rendered = new StringBuilder();

    private final HtmlStreamRenderer renderer = HtmlStreamRenderer.create(rendered, new Handler<String>() {
        public void handle(String errorMessage) {
            @SuppressWarnings({ "hiding", "synthetic-access" })
            List<String> errors = HtmlStreamRendererTest.this.errors;
            errors.add(errorMessage);
        }
    });

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        errors.clear();
        rendered.setLength(0);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        TestCase.assertTrue(errors.isEmpty());
    }

    public final void testCdataContainsEndTag1_literalMutationString40() throws Exception {
        renderer.openDocument();
        renderer.openTag("script", ImmutableList.of("type", "text/javascript"));
        renderer.text("document.write(\'<SCRIPT>alert(42)</S|CRIPT>\')");
        renderer.closeTag("script");
        renderer.closeDocument();
        rendered.toString();
        String o_testCdataContainsEndTag1_literalMutationString40__8 = Joiner.on('\n').join(errors);
        TestCase.assertEquals("", o_testCdataContainsEndTag1_literalMutationString40__8);
        this.errors.clear();
        TestCase.assertEquals("", o_testCdataContainsEndTag1_literalMutationString40__8);
    }

    private void assertNormalized(String golden, String htmlInput) throws Exception {
        TestCase.assertEquals(golden, normalize(htmlInput));
        if (!(golden.equals(htmlInput))) {
            assertNormalized(golden, golden);
        }
    }

    private String normalize(String htmlInput) {
        @SuppressWarnings("hiding")
        final HtmlStreamRenderer renderer = this.renderer;
        HtmlSanitizer.sanitize(htmlInput, new HtmlSanitizer.Policy() {
            public void openTag(String elementName, List<String> attrs) {
                renderer.openTag(elementName, attrs);
            }

            public void closeTag(String elementName) {
                renderer.closeTag(elementName);
            }

            public void text(String textChunk) {
                renderer.text(textChunk);
            }

            public void openDocument() {
                renderer.openDocument();
            }

            public void closeDocument() {
                renderer.closeDocument();
            }
        });
        String result = rendered.toString();
        rendered.setLength(0);
        return result;
    }
}

