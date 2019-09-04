/**
 * Copyright (c) 2011, Mike Samuel
 */
/**
 * All rights reserved.
 */
/**
 *
 */
/**
 * Redistribution and use in source and binary forms, with or without
 */
/**
 * modification, are permitted provided that the following conditions
 */
/**
 * are met:
 */
/**
 *
 */
/**
 * Redistributions of source code must retain the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer.
 */
/**
 * Redistributions in binary form must reproduce the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer in the
 */
/**
 * documentation and/or other materials provided with the distribution.
 */
/**
 * Neither the name of the OWASP nor the names of its contributors may
 */
/**
 * be used to endorse or promote products derived from this software
 */
/**
 * without specific prior written permission.
 */
/**
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 */
/**
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 */
/**
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 */
/**
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 */
/**
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 */
/**
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 */
/**
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 */
/**
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 */
/**
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 */
/**
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 */
/**
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 */
/**
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.owasp.html;


@java.lang.SuppressWarnings("javadoc")
public class HtmlSanitizerTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testEmpty() {
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testEmpty()|0", org.owasp.html.HtmlSanitizerTest.sanitize("")));
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testEmpty()|1", org.owasp.html.HtmlSanitizerTest.sanitize(null)));
    }

    @org.junit.Test
    public static final void testSimpleText() {
        junit.framework.TestCase.assertEquals("hello world", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testSimpleText()|0", org.owasp.html.HtmlSanitizerTest.sanitize("hello world")));
    }

    @org.junit.Test
    public static final void testEntities1() {
        junit.framework.TestCase.assertEquals("&lt;hello world&gt;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testEntities1()|0", org.owasp.html.HtmlSanitizerTest.sanitize("&lt;hello world&gt;")));
    }

    @org.junit.Test
    public static final void testEntities2() {
        junit.framework.TestCase.assertEquals("<b>hello <i>world</i></b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testEntities2()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b>hello <i>world</i></b>")));
    }

    @org.junit.Test
    public static final void testUnknownTagsRemoved() {
        junit.framework.TestCase.assertEquals("<b>hello <i>world</i></b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testUnknownTagsRemoved()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b>hello <bogus></bogus><i>world</i></b>")));
    }

    @org.junit.Test
    public static final void testUnsafeTagsRemoved() {
        junit.framework.TestCase.assertEquals("<b>hello <i>world</i></b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testUnsafeTagsRemoved()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("<b>hello <i>world</i>" + "<script src=foo.js></script></b>"))));
    }

    @org.junit.Test
    public static final void testUnsafeAttributesRemoved() {
        junit.framework.TestCase.assertEquals("<b>hello <i>world</i></b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testUnsafeAttributesRemoved()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b>hello <i onclick=\"takeOverWorld(this)\">world</i></b>")));
    }

    @org.junit.Test
    public static final void testCruftEscaped() {
        junit.framework.TestCase.assertEquals("<b>hello <i>world&lt;</i></b> &amp; tomorrow the universe", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testCruftEscaped()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b>hello <i>world<</i></b> & tomorrow the universe")));
    }

    @org.junit.Test
    public static final void testTagCruftRemoved() {
        junit.framework.TestCase.assertEquals("<b id=\"p-foo\">hello <i>world&lt;</i></b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testTagCruftRemoved()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b id=\"foo\" / -->hello <i>world<</i></b>")));
    }

    @org.junit.Test
    public static final void testIdsAndClassesPrefixed() {
        junit.framework.TestCase.assertEquals(("<b id=\"p-foo\" class=\"p-boo p-bar p-baz\">" + "hello <i>world&lt;</i></b>"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testIdsAndClassesPrefixed()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b id=\"foo\" class=\"boo bar baz\">hello <i>world<</i></b>")));
    }

    @org.junit.Test
    public static final void testSpecialCharsInAttributes() {
        junit.framework.TestCase.assertEquals("<b title=\"a&lt;b &amp;&amp; c&gt;b\">bar</b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testSpecialCharsInAttributes()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b title=\"a<b && c>b\">bar</b>")));
    }

    @org.junit.Test
    public static final void testUnclosedTags() {
        junit.framework.TestCase.assertEquals("<div id=\"p-foo\">Bar<br />Baz</div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testUnclosedTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<div id=\"foo\">Bar<br>Baz")));
    }

    @org.junit.Test
    public static final void testUnopenedTags() {
        junit.framework.TestCase.assertEquals("Foo<b>Bar</b>Baz", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testUnopenedTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize("Foo<b></select>Bar</b></b>Baz</select>")));
    }

    @org.junit.Test
    public static final void testUnsafeEndTags() {
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testUnsafeEndTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("</meta http-equiv=\"refesh\"" + " content=\"1;URL=http://evilgadget.com\">"))));
    }

    @org.junit.Test
    public static final void testEmptyEndTags() {
        junit.framework.TestCase.assertEquals("<input />", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testEmptyEndTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<input></input>")));
    }

    @org.junit.Test
    public static final void testOnLoadStripped() {
        junit.framework.TestCase.assertEquals("<img />", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testOnLoadStripped()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<img src=http://foo.com/bar ONLOAD=alert(1)>")));
    }

    @org.junit.Test
    public static final void testClosingTagParameters() {
        junit.framework.TestCase.assertEquals("<p>Hello world</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testClosingTagParameters()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<p>Hello world</b style=\"width:expression(alert(1))\">")));
    }

    @org.junit.Test
    public static final void testOptionalEndTags() {
        // Should not be
        // "<ol> <li>A</li> <li>B<li>C </li></li></ol>"
        // The difference is significant because in the first, the item contains no
        // space after 'A", but in the third, the item contains 'C' and a space.
        junit.framework.TestCase.assertEquals("<ol><li>A</li><li>B</li><li>C </li></ol>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testOptionalEndTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<ol> <li>A</li> <li>B<li>C </ol>")));
    }

    @org.junit.Test
    public static final void testFoldingOfHtmlAndBodyTags() {
        junit.framework.TestCase.assertEquals("<p>P 1</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testFoldingOfHtmlAndBodyTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("<html><head><title>Foo</title></head>" + "<body><p>P 1</p></body></html>"))));
        junit.framework.TestCase.assertEquals("Hello", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testFoldingOfHtmlAndBodyTags()|1", org.owasp.html.HtmlSanitizerTest.sanitize("<body bgcolor=\"blue\">Hello</body>")));
        junit.framework.TestCase.assertEquals("<p>Foo</p><p>One</p><p>Two</p>Three<p>Four</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testFoldingOfHtmlAndBodyTags()|2", org.owasp.html.HtmlSanitizerTest.sanitize(("<html>" + (((((((((("<head>" + "<title>Blah</title>") + "<p>Foo</p>") + "</head>") + "<body>") + "<p>One") + "<p>Two</p>") + "Three") + "<p>Four</p>") + "</body>") + "</html>")))));
    }

    @org.junit.Test
    public static final void testEmptyAndValuelessAttributes() {
        junit.framework.TestCase.assertEquals("<input checked=\"checked\" type=\"checkbox\" id=\"\" class=\"\" />", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testEmptyAndValuelessAttributes()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<input checked type=checkbox id=\"\" class=>")));
    }

    @org.junit.Test
    public static final void testSgmlShortTags() {
        // We make no attempt to correctly handle SGML short tags since they are
        // not implemented consistently across browsers, and have been removed from
        // HTML 5.
        // 
        // According to http://www.w3.org/QA/2007/10/shorttags.html
        // Shorttags - the odd side of HTML 4.01
        // ...
        // It uses an ill-known feature of SGML called shorthand markup, which
        // was authorized in HTML up to HTML 4.01. But what used to be a "cool"
        // feature for SGML experts becomes a liability in HTML, where the
        // construct is more likely to appear as a typo than as a conscious
        // choice.
        // 
        // All could be fine if this form typo-that-happens-to-be-legal was
        // properly implemented in contemporary HTML user-agents. It is not.
        junit.framework.TestCase.assertEquals("<p></p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testSgmlShortTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<p/b/")));// Short-tag discarded.

        junit.framework.TestCase.assertEquals("<p></p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testSgmlShortTags()|1", org.owasp.html.HtmlSanitizerTest.sanitize("<p<b>")));// Discard <b attribute

        // This behavior for short tags is not ideal, but it is safe.
        junit.framework.TestCase.assertEquals("<p href=\"/\">first part of the text&lt;/&gt; second part</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testSgmlShortTags()|2", org.owasp.html.HtmlSanitizerTest.sanitize("<p<a href=\"/\">first part of the text</> second part")));
    }

    @org.junit.Test
    public static final void testNul() {
        junit.framework.TestCase.assertEquals(("<a title=" + ("\"harmless  SCRIPT&#61;javascript:alert(1) ignored&#61;ignored\">" + "</a>")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNul()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("<A TITLE=" + "\"harmless\u0000  SCRIPT=javascript:alert(1) ignored=ignored\">"))));
    }

    @org.junit.Test
    public static final void testDigitsInAttrNames() {
        // See bug 614 for details.
        junit.framework.TestCase.assertEquals("<div>Hello</div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDigitsInAttrNames()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<div style1=\"expression(\'alert(1)\")\">Hello</div>")));
    }

    @org.junit.Test
    public static final void testSupplementaryCodepointEncoding() {
        // &#xd87e;&#xdc1a; is not appropriate.
        // &#x2f81a; is appropriate as is the unencoded form.
        junit.framework.TestCase.assertEquals("&#x2f81a; | &#x2f81a; | &#x2f81a;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testSupplementaryCodepointEncoding()|0", org.owasp.html.HtmlSanitizerTest.sanitize("&#x2F81A; | \ud87e\udc1a | &#xd87e;&#xdc1a;")));
    }

    @org.junit.Test
    public static final void testDeeplyNestedTagsDoS() {
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|1", org.owasp.html.HtmlSanitizerTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|0", org.owasp.html.HtmlSanitizerTest.stringRepeatedTimes("<div>", 20000))));
        int n = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|2", sanitized).length())) / (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|4", "<div></div>".length()));
        junit.framework.TestCase.assertTrue(("" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|5", n))), ((50 <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|6", n))) && ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|7", n)) <= 1000)));
        int middle = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|8", n)) * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|9", "<div>".length()));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|12", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|10", sanitized).substring(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|11", middle))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|14", org.owasp.html.HtmlSanitizerTest.stringRepeatedTimes("<div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|13", n))));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|17", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|15", sanitized).substring(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|16", middle))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|19", org.owasp.html.HtmlSanitizerTest.stringRepeatedTimes("</div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDeeplyNestedTagsDoS()|18", n))));
    }

    @org.junit.Test
    public static final void testInnerHTMLIE8() {
        // Apparently, in quirks mode, IE8 does a poor job producing innerHTML
        // values.  Given
        // <div attr="``foo=bar">
        // we encode &#96; but if JavaScript does:
        // nodeA.innerHTML = nodeB.innerHTML;
        // and nodeB contains the DIV above, then IE8 will produce
        // <div attr=``foo=bar>
        // as the value of nodeB.innerHTML and assign it to nodeA.
        // IE8's HTML parser treats `` as a blank attribute value and foo=bar
        // becomes a separate attribute.
        // Adding a space at the end of the attribute prevents this by forcing
        // IE8 to put double quotes around the attribute when computing
        // nodeB.innerHTML.
        junit.framework.TestCase.assertEquals("<div title=\"&#96;&#96;onmouseover&#61;alert(1337) \"></div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testInnerHTMLIE8()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<div title=\"``onmouseover=alert(1337)\">")));
    }

    @org.junit.Test
    public static final void testNabobsOfNegativism() {
        // Treating <noscript> as raw-text gains us nothing security-wise
        // and we don't want to push tag content outside.
        junit.framework.TestCase.assertEquals("<noscript></noscript>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<noscript><evil></noscript>")));
        junit.framework.TestCase.assertEquals("<noscript>I <b>&lt;3</b> Ponies</noscript>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|1", org.owasp.html.HtmlSanitizerTest.sanitize("<noscript>I <b><3</b> Ponies</noscript>")));
        junit.framework.TestCase.assertEquals("<noscript>I <b>&lt;3</b> Ponies</noscript>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|2", org.owasp.html.HtmlSanitizerTest.sanitize("<NOSCRIPT>I <b><3</b> Ponies</noscript><evil>")));
        junit.framework.TestCase.assertEquals("<noframes>I <b>&lt;3</b> Ponies</noframes>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|3", org.owasp.html.HtmlSanitizerTest.sanitize("<noframes>I <b><3</b> Ponies</noframes><evil>")));
        junit.framework.TestCase.assertEquals("<noembed>I <b>&lt;3</b> Ponies</noembed>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|4", org.owasp.html.HtmlSanitizerTest.sanitize("<noembed>I <b><3</b> Ponies</noembed><evil>")));
        junit.framework.TestCase.assertEquals("<noxss>I <b>&lt;3</b> Ponies</noxss>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|5", org.owasp.html.HtmlSanitizerTest.sanitize("<noxss>I <b><3</b> Ponies</noxss><evil>")));
        junit.framework.TestCase.assertEquals("&lt;noscript&gt;I &lt;b&gt;&lt;3&lt;/b&gt; Ponies&lt;/noscript&gt;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNabobsOfNegativism()|6", org.owasp.html.HtmlSanitizerTest.sanitize("<xmp><noscript>I <b><3</b> Ponies</noscript></xmp>")));
    }

    @org.junit.Test
    public static final void testNULs() {
        junit.framework.TestCase.assertEquals("<b>Hello, </b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNULs()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<b>Hello, \u0000</b>")));
        junit.framework.TestCase.assertEquals("<b>Hello, </b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNULs()|1", org.owasp.html.HtmlSanitizerTest.sanitize("<b>Hello, \u0000")));
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNULs()|2", org.owasp.html.HtmlSanitizerTest.sanitize("\u0000")));
        junit.framework.TestCase.assertEquals("<b>Hello, </b>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNULs()|3", org.owasp.html.HtmlSanitizerTest.sanitize("<b>Hello, &#0;</b>")));
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testNULs()|4", org.owasp.html.HtmlSanitizerTest.sanitize("&#0;")));
    }

    @org.junit.Test
    public static final void testQMarkMeta() {
        junit.framework.TestCase.assertEquals("Hello, <b>World</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testQMarkMeta()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("" + // An XML Prologue.
        // HTML5 treats it as ignorable content via the bogus comment state.
        (((((("<?xml version=\"1\" ?>" + "Hello, ") + // An XML Processing instruction.
        // HTML5 treats it as ignorable content via the bogus comment state.
        "<?processing instruction?>") + "<b>World") + // Appears in HTML copied from outlook.
        "<?xml:namespace prefix = o ns = ") + "\"urn:schemas-microsoft-com:office:office\" />") + "</b>!")))));
    }

    @org.junit.Test
    public static final void testScriptInIframe() {
        junit.framework.TestCase.assertEquals("<iframe></iframe>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testScriptInIframe()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("<iframe>\n" + ("  <script>alert(Hi)</script>\n" + "</iframe>")))));
    }

    @org.junit.Test
    public static final void testBalancingOfEmptyTags() {
        junit.framework.TestCase.assertEquals(("<span style=\"color:rgb( 72 , 72 , 72 );font-family:&#39;helveticaneue&#39;\">" + (((" " + "my \u00a0") + " list of style names or a ") + "</span>")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testBalancingOfEmptyTags()|0", org.owasp.html.HtmlSanitizerTest.sanitize(("<span style=\"color:rgb(72, 72, 72); font-family:helveticaneue\">" + (((" " + "<span>my &nbsp;</span>") + " list of style names or a ") + "</span>")))));
    }

    @org.junit.Test
    public static final void testDuplicateAttributes() {
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDuplicateAttributes()|0", org.owasp.html.HtmlSanitizerTest.sanitize("<br id=\"foo\">")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testDuplicateAttributes()|1", org.owasp.html.HtmlSanitizerTest.sanitize("<br id=foo id=bar>")));
    }

    @org.junit.Test
    public static final void testMacOSAndIOSQueryOfDeath() {
        // https://manishearth.github.io/blog/2018/02/15/picking-apart-the-crashing-ios-string/
        java.lang.String[][] tests = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|9", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|0", java.lang.String[].class, new java.lang.String[]{ "\u0c1c\u0c4d\u0c1e\u200c\u0c3e", "\u0c1c\u0c4d\u0c1e\u0c3e" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|1", java.lang.String[].class, new java.lang.String[]{ "\u09b8\u09cd\u09b0<interrupted>\u200c\u09c1", "\u09b8\u09cd\u09b0\u09c1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|2", java.lang.String[].class, new java.lang.String[]{ "\u0c1c\u0c4d\u0c1e\u200c\u0c3e", "\u0c1c\u0c4d\u0c1e\u0c3e" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|3", java.lang.String[].class, new java.lang.String[]{ "\u09b8\u09cd\u09b0\u200c<interrupted>\u09c1", "\u09b8\u09cd\u09b0\u09c1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|4", java.lang.String[].class, new java.lang.String[]{ "&#x0C1C;&#x0C4D;&#x0C1E;&#x200C;&#x0C3E;", "\u0c1c\u0c4d\u0c1e\u0c3e" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|5", java.lang.String[].class, new java.lang.String[]{ "&#x0C1C;&#x0C4D;&#x0C1E;<interrupted>&#x200C;&#x0C3E;", "\u0c1c\u0c4d\u0c1e\u0c3e" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|6", java.lang.String[].class, new java.lang.String[]{ "&#x09B8;&#x09CD;&#x09B0;&#x200C;&#x09C1;", "\u09b8\u09cd\u09b0\u09c1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|7", java.lang.String[].class, new java.lang.String[]{ "&#x09B8;&#x09CD;&#x09B0;&#x200C;<interrupted>&#x09C1;", "\u09b8\u09cd\u09b0\u09c1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|8", java.lang.String[].class, new java.lang.String[]{ "\u0915\u094d\u0930\u200c\u093e", "\u0915\u094d\u0930\u093e" }) });
        for (int i = 0, n = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|10", java.lang.String[][].class, tests).length); (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|12", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|13", n)); ++i) {
            java.lang.String[] test = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|16", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|14", java.lang.String[][].class, tests)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|15", i)]);
            junit.framework.TestCase.assertEquals((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|17", i)) + " : ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|18", java.lang.String[].class, test)[0]))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|20", java.lang.String[].class, test)[1]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|24", org.owasp.html.HtmlSanitizerTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlSanitizerTest|testMacOSAndIOSQueryOfDeath()|22", java.lang.String[].class, test)[0]))));
        }
    }

    private static java.lang.String sanitize(@javax.annotation.Nullable
    java.lang.String html) {
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.HtmlStreamRenderer renderer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|4", org.owasp.html.HtmlStreamRenderer.class, org.owasp.html.HtmlStreamRenderer.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|1", java.lang.StringBuilder.class, sb), new org.owasp.html.Handler<java.lang.String>() {
            public void handle(java.lang.String errorMessage) {
                junit.framework.TestCase.fail(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|3", errorMessage));
            }
        }));
        org.owasp.html.HtmlSanitizer.Policy policy = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|20", org.owasp.html.HtmlSanitizer.Policy.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|18", org.owasp.html.HtmlPolicyBuilder.class, // Don't throw out useless <img> and <input> elements to ease debugging.
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|17", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|16", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|15", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|9", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, // Cleanup IDs and CLASSes and prefix them with p- to move to a separate
        // name-space.
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|8", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|7", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, // And these attributes.
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|6", org.owasp.html.HtmlPolicyBuilder.class, // Allow these tags.
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|5", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowElements("a", "b", "br", "div", "i", "iframe", "img", "input", "li", "ol", "p", "span", "ul", "noscript", "noframes", "noembed", "noxss")).allowAttributes("dir", "checked", "class", "href", "id", "target", "title", "type")).globally()).allowAttributes("id", "class")).matching(new org.owasp.html.AttributePolicy() {
            public java.lang.String apply(java.lang.String elementName, java.lang.String attributeName, java.lang.String value) {
                return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|14", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|13", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|12", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|11", value).replaceAll("(?:^|\\s)([a-zA-Z])", " p-$1")).replaceAll("\\s+", " ")).trim());
            }
        })).globally()).allowStyling()).allowWithoutAttributes("img", "input")).build(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|19", org.owasp.html.HtmlStreamRenderer.class, renderer)));
        org.owasp.html.HtmlSanitizer.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|21", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|22", org.owasp.html.HtmlSanitizer.Policy.class, policy));
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|24", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|sanitize(java.lang.String)|23", java.lang.StringBuilder.class, sb).toString());
    }

    private static final java.lang.String stringRepeatedTimes(java.lang.String s, int n) {
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|3", java.lang.StringBuilder.class, new java.lang.StringBuilder(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|0", s).length())) * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|2", n)))));
        for (int nToAppend = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|4", n); (--nToAppend) >= 0;) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|7", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|5", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|6", s)));
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlSanitizerTest|stringRepeatedTimes(java.lang.String,int)|8", java.lang.StringBuilder.class, sb).toString());
    }
}

