package org.owasp.html;


import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Random;
import junit.framework.TestCase;
import nu.validator.htmlparser.dom.HtmlDocumentBuilder;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


@SuppressWarnings("javadoc")
public class HtmlPolicyBuilderFuzzerTest extends FuzzyTestCase {
    final Function<HtmlStreamEventReceiver, HtmlSanitizer.Policy> policyFactory = new HtmlPolicyBuilder().allowElements("a", "b", "xmp", "pre").allowAttributes("href").onElements("a").allowAttributes("title").globally().allowStandardUrlProtocols().toFactory();

    static final String[] CHUNKS = new String[]{ "Hello, World!", "<b>", "</b>", "<a onclick='doEvil()' href=javascript:alert(1337)>", "</a>", "<script>", "</script>", "<xmp>", "</xmp>", "javascript:alert(1337)", "<style>", "</style>", "<plaintext>", "<!--", "-->", "<![CDATA[", "]]>" };

    static final String[] ELEMENT_NAMES = new String[]{ "a", "A", "b", "B", "script", "SCRipT", "style", "STYLE", "object", "Object", "noscript", "noScript", "xmp", "XMP" };

    static final String[] ATTR_NAMES = new String[]{ "href", "id", "class", "onclick", "checked", "style" };

    public final void testFuzzedOutput_add19_failAssert0() throws IOException, SAXException {
        try {
            boolean passed = false;
            {
                for (int i = 1000; (--i) >= 0;) {
                    StringBuilder sb = new StringBuilder();
                    HtmlSanitizer.Policy policy = policyFactory.apply(HtmlStreamRenderer.create(sb, Handler.DO_NOTHING));
                    policy.openDocument();
                    List<String> attributes = Lists.newArrayList();
                    for (int j = 50; (--j) >= 0;) {
                        int r = rnd.nextInt(3);
                        switch (r) {
                            case 0 :
                                attributes.clear();
                                if (rnd.nextBoolean()) {
                                    for (int k = rnd.nextInt(4); (--k) >= 0;) {
                                        attributes.add(HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.ATTR_NAMES));
                                        attributes.add(HtmlPolicyBuilderFuzzerTest.pickChunk(rnd));
                                    }
                                }
                                policy.openTag(HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.ELEMENT_NAMES), attributes);
                                break;
                            case 1 :
                                policy.closeTag(HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.ELEMENT_NAMES));
                                break;
                            case 2 :
                                policy.text(HtmlPolicyBuilderFuzzerTest.pickChunk(rnd));
                                break;
                            default :
                                throw new AssertionError(("Randomly chosen number in [0-3) was " + r));
                        }
                    }
                    policy.closeDocument();
                    policy.closeDocument();
                    String html = sb.toString();
                    HtmlDocumentBuilder parser = new HtmlDocumentBuilder();
                    Node node = parser.parseFragment(new InputSource(new StringReader(html)), "body");
                }
                passed = true;
            }
            junit.framework.TestCase.fail("testFuzzedOutput_add19 should have thrown IllegalStateException");
        } catch (IllegalStateException expected) {
            TestCase.assertEquals(null, expected.getMessage());
        }
    }

    public final void testFuzzedOutput_add11_failAssert0null649_failAssert0() throws IOException, SAXException {
        try {
            {
                boolean passed = false;
                {
                    for (int i = 1000; (--i) >= 0;) {
                        StringBuilder sb = new StringBuilder();
                        HtmlSanitizer.Policy policy = policyFactory.apply(HtmlStreamRenderer.create(null, Handler.DO_NOTHING));
                        policy.openDocument();
                        List<String> attributes = Lists.newArrayList();
                        for (int j = 50; (--j) >= 0;) {
                            int r = rnd.nextInt(3);
                            switch (r) {
                                case 0 :
                                    attributes.clear();
                                    if (rnd.nextBoolean()) {
                                        for (int k = rnd.nextInt(4); (--k) >= 0;) {
                                            attributes.add(HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.ATTR_NAMES));
                                            attributes.add(HtmlPolicyBuilderFuzzerTest.pickChunk(rnd));
                                            attributes.add(HtmlPolicyBuilderFuzzerTest.pickChunk(rnd));
                                        }
                                    }
                                    policy.openTag(HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.ELEMENT_NAMES), attributes);
                                    break;
                                case 1 :
                                    policy.closeTag(HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.ELEMENT_NAMES));
                                    break;
                                case 2 :
                                    policy.text(HtmlPolicyBuilderFuzzerTest.pickChunk(rnd));
                                    break;
                                default :
                                    throw new AssertionError(("Randomly chosen number in [0-3) was " + r));
                            }
                        }
                        policy.closeDocument();
                        String html = sb.toString();
                        HtmlDocumentBuilder parser = new HtmlDocumentBuilder();
                        Node node = parser.parseFragment(new InputSource(new StringReader(html)), "body");
                    }
                    passed = true;
                }
                junit.framework.TestCase.fail("testFuzzedOutput_add11 should have thrown NoSuchElementException");
            }
            junit.framework.TestCase.fail("testFuzzedOutput_add11_failAssert0null649 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            TestCase.assertEquals(null, expected.getMessage());
        }
    }

    private static void checkSafe(Node node, String html) {
        switch (node.getNodeType()) {
            case Node.ELEMENT_NODE :
                String name = node.getNodeName();
                if (((!("a".equals(name))) && (!("b".equals(name)))) && (!("pre".equals(name)))) {
                    TestCase.fail(((("Illegal element name " + name) + " : ") + html));
                }
                NamedNodeMap attrs = node.getAttributes();
                for (int i = 0, n = attrs.getLength(); i < n; ++i) {
                    Attr a = ((Attr) (attrs.item(i)));
                    if ("title".equals(a.getName())) {

                    } else {
                        if ("href".equals(a.getName())) {
                            TestCase.assertEquals(html, "a", name);
                            TestCase.assertFalse(html, Strings.toLowerCase(a.getValue()).contains("script:"));
                        }
                    }
                }
                break;
        }
        for (Node child = node.getFirstChild(); child != null; child = child.getNextSibling()) {
            HtmlPolicyBuilderFuzzerTest.checkSafe(child, html);
        }
    }

    private static String pick(Random rnd, String[] choices) {
        return choices[rnd.nextInt(choices.length)];
    }

    private static String pickChunk(Random rnd) {
        String chunk = HtmlPolicyBuilderFuzzerTest.pick(rnd, HtmlPolicyBuilderFuzzerTest.CHUNKS);
        int start = 0;
        int end = chunk.length();
        if (rnd.nextBoolean()) {
            start = rnd.nextInt((end - 1));
        }
        if (((end - start) < 2) && (rnd.nextBoolean())) {
            end = start + (rnd.nextInt((end - start)));
        }
        return chunk.substring(start, end);
    }
}

