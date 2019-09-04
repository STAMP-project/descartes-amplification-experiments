package org.owasp.html;


import com.google.common.base.Joiner;
import java.util.List;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.junit.Test;


@SuppressWarnings("javadoc")
public class HtmlPolicyBuilderTest extends TestCase {
    static final String EXAMPLE = Joiner.on('\n').join("<h1 id='foo'>Header</h1>", "<p onclick='alert(42)'>Paragraph 1<script>evil()</script></p>", ("<p><a href=\'java\u0000script:bad()\'>Click</a> <a href=\'foo.html\'>me</a>" + " <a href='http://outside.org/'>out</a></p>"), ("<p><img src=canary.png alt=local-canary>" + "<img src='http://canaries.org/canary.png'></p>"), "<p><b style=font-size:bigger>Fancy</b> with <i><b>soupy</i> tags</b>.", "<p style='color: expression(foo()); text-align: center;", "          /* direction: ltr */; font-weight: bold'>Stylish Para 1</p>", "<p style='color: red; font-weight; expression(foo());", "          direction: rtl; font-weight: bold'>Stylish Para 2</p>", "");

    @Test
    public static final void testDuplicateAttributesDoNotReachElementPolicy_add10_failAssert0_add1890_failAssert0() throws Exception {
        try {
            {
                final int[] idCount = new int[1];
                new HtmlPolicyBuilder().allowElements(new ElementPolicy() {
                    public String apply(String elementName, List<String> attrs) {
                        int nAttrs = (attrs.size()) / 2;
                        attrs.add("attr-count");
                        attrs.add(("" + nAttrs));
                        attrs.add("id-count");
                        attrs.add("id-count");
                        attrs.add(("" + (idCount[0])));
                        return elementName;
                    }
                }, "a").allowAttributes("id").matching(new AttributePolicy() {
                    public String apply(String elementName, String attributeName, String value) {
                        ++(idCount[0]);
                        value.startsWith("b");
                        return value.startsWith("b") ? value : null;
                    }
                }).onElements("a").allowAttributes("href").onElements("a");
                new HtmlPolicyBuilder().allowElements(new ElementPolicy() {
                    public String apply(String elementName, List<String> attrs) {
                        int nAttrs = (attrs.size()) / 2;
                        attrs.add("attr-count");
                        attrs.add(("" + nAttrs));
                        attrs.add("id-count");
                        attrs.add("id-count");
                        attrs.add(("" + (idCount[0])));
                        return elementName;
                    }
                }, "a").allowAttributes("id").matching(new AttributePolicy() {
                    public String apply(String elementName, String attributeName, String value) {
                        ++(idCount[0]);
                        return value.startsWith("b") ? value : null;
                    }
                }).onElements("a").allowAttributes("href").onElements("a");
                junit.framework.TestCase.fail("testDuplicateAttributesDoNotReachElementPolicy_add10 should have thrown NoSuchElementException");
            }
            junit.framework.TestCase.fail("testDuplicateAttributesDoNotReachElementPolicy_add10_failAssert0_add1890 should have thrown AssertionFailedError");
        } catch (AssertionFailedError expected) {
            TestCase.assertEquals("testDuplicateAttributesDoNotReachElementPolicy_add10 should have thrown NoSuchElementException", expected.getMessage());
        }
    }

    private static String apply(HtmlPolicyBuilder b) {
        return HtmlPolicyBuilderTest.apply(b, HtmlPolicyBuilderTest.EXAMPLE);
    }

    private static String apply(HtmlPolicyBuilder b, String src) {
        return b.toFactory().sanitize(src, null, new Handler<String>() {
            public void handle(String x) {
                TestCase.fail(x);
            }
        });
    }
}

