package org.jsoup.safety;


/**
 * Tests for the cleaner.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class CleanerTest {
    @org.junit.Rule
    public org.jsoup.MultiLocaleRule rule = new org.jsoup.MultiLocaleRule();

    @org.junit.Test
    public void simpleBehaviourTest() {
        java.lang.String h = "<div><p class=foo><a href='http://evil.com'>Hello <b id=bar>there</b>!</a></div>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|simpleBehaviourTest()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.simpleText())));
        org.junit.Assert.assertEquals("Hello <b>there</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest()|4", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest()|3", cleanHtml))));
    }

    @org.junit.Test
    public void simpleBehaviourTest2() {
        java.lang.String h = "Hello <b>there</b>!";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest2()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest2()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|simpleBehaviourTest2()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.simpleText())));
        org.junit.Assert.assertEquals("Hello <b>there</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest2()|4", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|simpleBehaviourTest2()|3", cleanHtml))));
    }

    @org.junit.Test
    public void basicBehaviourTest() {
        java.lang.String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicBehaviourTest()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicBehaviourTest()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|basicBehaviourTest()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic())));
        org.junit.Assert.assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicBehaviourTest()|4", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicBehaviourTest()|3", cleanHtml))));
    }

    @org.junit.Test
    public void basicWithImagesTest() {
        java.lang.String h = "<div><p><img src='http://example.com/' alt=Image></p><p><img src='ftp://ftp.example.com'></p></div>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicWithImagesTest()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicWithImagesTest()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|basicWithImagesTest()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basicWithImages())));
        org.junit.Assert.assertEquals("<p><img src=\"http://example.com/\" alt=\"Image\"></p><p><img></p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicWithImagesTest()|4", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|basicWithImagesTest()|3", cleanHtml))));
    }

    @org.junit.Test
    public void testRelaxed() {
        java.lang.String h = "<h1>Head</h1><table><tr><td>One<td>Two</td></tr></table>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRelaxed()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRelaxed()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRelaxed()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<h1>Head</h1><table><tbody><tr><td>One</td><td>Two</td></tr></tbody></table>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRelaxed()|4", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRelaxed()|3", cleanHtml))));
    }

    @org.junit.Test
    public void testRemoveTags() {
        java.lang.String h = "<div><p><A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveTags()|3", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveTags()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveTags()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveTags()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()).removeTags("a"))));
        org.junit.Assert.assertEquals("<p>Nice</p><blockquote>Hello</blockquote>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveTags()|5", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveTags()|4", cleanHtml))));
    }

    @org.junit.Test
    public void testRemoveAttributes() {
        java.lang.String h = "<div><p>Nice</p><blockquote cite='http://example.com/quotations'>Hello</blockquote>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveAttributes()|3", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveAttributes()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveAttributes()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveAttributes()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()).removeAttributes("blockquote", "cite"))));
        org.junit.Assert.assertEquals("<p>Nice</p><blockquote>Hello</blockquote>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveAttributes()|5", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveAttributes()|4", cleanHtml))));
    }

    @org.junit.Test
    public void testRemoveEnforcedAttributes() {
        java.lang.String h = "<div><p><A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveEnforcedAttributes()|3", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveEnforcedAttributes()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveEnforcedAttributes()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveEnforcedAttributes()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()).removeEnforcedAttribute("a", "rel"))));
        org.junit.Assert.assertEquals("<p><a href=\"http://nice.com\">Nice</a></p><blockquote>Hello</blockquote>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveEnforcedAttributes()|5", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveEnforcedAttributes()|4", cleanHtml))));
    }

    @org.junit.Test
    public void testRemoveProtocols() {
        java.lang.String h = "<p>Contact me <a href='mailto:info@example.com'>here</a></p>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveProtocols()|3", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveProtocols()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveProtocols()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testRemoveProtocols()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()).removeProtocols("a", "href", "ftp", "mailto"))));
        org.junit.Assert.assertEquals("<p>Contact me <a rel=\"nofollow\">here</a></p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveProtocols()|5", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testRemoveProtocols()|4", cleanHtml))));
    }

    @org.junit.Test
    @org.jsoup.MultiLocaleRule.MultiLocaleTest
    public void whitelistedProtocolShouldBeRetained() {
        org.jsoup.safety.Whitelist whitelist = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|3", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|1", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|0", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.none()).addTags("a")).addAttributes("a", "href")).addProtocols("a", "href", "something"));
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|5", org.jsoup.Jsoup.clean("<a href=\"SOMETHING://x\"></a>", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|4", org.jsoup.safety.Whitelist.class, whitelist)));
        org.junit.Assert.assertEquals("<a href=\"SOMETHING://x\"></a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|7", org.jsoup.TextUtil.stripNewlines(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|whitelistedProtocolShouldBeRetained()|6", cleanHtml))));
    }

    @org.junit.Test
    public void testDropComments() {
        java.lang.String h = "<p>Hello<!-- no --></p>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropComments()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropComments()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testDropComments()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<p>Hello</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropComments()|3", cleanHtml));
    }

    @org.junit.Test
    public void testDropXmlProc() {
        java.lang.String h = "<?import namespace=\"xss\"><p>Hello</p>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropXmlProc()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropXmlProc()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testDropXmlProc()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<p>Hello</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropXmlProc()|3", cleanHtml));
    }

    @org.junit.Test
    public void testDropScript() {
        java.lang.String h = "<SCRIPT SRC=//ha.ckers.org/.j><SCRIPT>alert(/XSS/.source)</SCRIPT>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropScript()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropScript()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testDropScript()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropScript()|3", cleanHtml));
    }

    @org.junit.Test
    public void testDropImageScript() {
        java.lang.String h = "<IMG SRC=\"javascript:alert(\'XSS\')\">";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropImageScript()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropImageScript()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testDropImageScript()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<img>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropImageScript()|3", cleanHtml));
    }

    @org.junit.Test
    public void testCleanJavascriptHref() {
        java.lang.String h = "<A HREF=\"javascript:document.location=\'http://www.google.com/\'\">XSS</A>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanJavascriptHref()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanJavascriptHref()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanJavascriptHref()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<a>XSS</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanJavascriptHref()|3", cleanHtml));
    }

    @org.junit.Test
    public void testCleanAnchorProtocol() {
        java.lang.String validAnchor = "<a href=\"#valid\">Valid anchor</a>";
        java.lang.String invalidAnchor = "<a href=\"#anchor with spaces\">Invalid anchor</a>";
        // A Whitelist that does not allow anchors will strip them out.
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|0", validAnchor), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<a>Valid anchor</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|3", cleanHtml));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|6", (cleanHtml = org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|4", invalidAnchor), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|5", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed()))));
        org.junit.Assert.assertEquals("<a>Invalid anchor</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|7", cleanHtml));
        // A Whitelist that allows them will keep them.
        org.jsoup.safety.Whitelist relaxedWithAnchor = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|9", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|8", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed()).addProtocols("a", "href", "#"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|12", (cleanHtml = org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|10", validAnchor), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|11", org.jsoup.safety.Whitelist.class, relaxedWithAnchor))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|13", validAnchor), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|14", cleanHtml));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|17", // An invalid anchor is never valid.
        (cleanHtml = org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|15", invalidAnchor), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|16", org.jsoup.safety.Whitelist.class, relaxedWithAnchor))));
        org.junit.Assert.assertEquals("<a>Invalid anchor</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testCleanAnchorProtocol()|18", cleanHtml));
    }

    @org.junit.Test
    public void testDropsUnknownTags() {
        java.lang.String h = "<p><custom foo=true>Test</custom></p>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropsUnknownTags()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropsUnknownTags()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testDropsUnknownTags()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertEquals("<p>Test</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testDropsUnknownTags()|3", cleanHtml));
    }

    @org.junit.Test
    public void testHandlesEmptyAttributes() {
        java.lang.String h = "<img alt=\"\" src= unknown=\'\'>";
        java.lang.String cleanHtml = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testHandlesEmptyAttributes()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testHandlesEmptyAttributes()|0", h), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testHandlesEmptyAttributes()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basicWithImages())));
        org.junit.Assert.assertEquals("<img alt=\"\">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testHandlesEmptyAttributes()|3", cleanHtml));
    }

    @org.junit.Test
    public void testIsValidBodyHtml() {
        java.lang.String ok = "<p>Test <b><a href='http://example.com/' rel='nofollow'>OK</a></b></p>";
        java.lang.String ok1 = "<p>Test <b><a href='http://example.com/'>OK</a></b></p>";// missing enforced is OK because still needs run thru cleaner

        java.lang.String nok1 = "<p><script></script>Not <b>OK</b></p>";
        java.lang.String nok2 = "<p align=right>Test Not <b>OK</b></p>";
        java.lang.String nok3 = "<!-- comment --><p>Not OK</p>";// comments and the like will be cleaned

        java.lang.String nok4 = "<html><head>Foo</head><body><b>OK</b></body></html>";// not body html

        java.lang.String nok5 = "<p>Test <b><a href='http://example.com/' rel='nofollowme'>OK</a></b></p>";
        java.lang.String nok6 = "<p>Test <b><a href='http://example.com/'>OK</b></p>";// missing close tag

        java.lang.String nok7 = "</div>What";
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|2", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|0", ok), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|5", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|3", ok1), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|4", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|8", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|6", nok1), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|7", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|11", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|9", nok2), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|10", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|14", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|12", nok3), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|13", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|17", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|15", nok4), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|16", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|20", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|18", nok5), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|19", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|23", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|21", nok6), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|22", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|26", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|24", ok), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|25", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.none()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|29", org.jsoup.Jsoup.isValid(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|27", nok7), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidBodyHtml()|28", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))));
    }

    @org.junit.Test
    public void testIsValidDocument() {
        java.lang.String ok = "<html><head></head><body><p>Hello</p></body><html>";
        java.lang.String nok = "<html><head><script>woops</script><title>Hello</title></head><body><p>Hello</p></body><html>";
        org.jsoup.safety.Whitelist relaxed = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|0", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed());
        org.jsoup.safety.Cleaner cleaner = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Cleaner>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|2", org.jsoup.safety.Cleaner.class, new org.jsoup.safety.Cleaner(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|1", org.jsoup.safety.Whitelist.class, relaxed)));
        org.jsoup.nodes.Document okDoc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|4", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidDocument()|3", ok)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidDocument()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Cleaner>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|5", org.jsoup.safety.Cleaner.class, cleaner).isValid(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|6", org.jsoup.nodes.Document.class, okDoc))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidDocument()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Cleaner>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|8", org.jsoup.safety.Cleaner.class, cleaner).isValid(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|10", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidDocument()|9", nok))))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testIsValidDocument()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Cleaner>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|13", org.jsoup.safety.Cleaner.class, new org.jsoup.safety.Cleaner(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|12", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.none()))).isValid(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|testIsValidDocument()|14", org.jsoup.nodes.Document.class, okDoc))));
    }

    @org.junit.Test
    public void resolvesRelativeLinks() {
        java.lang.String html = "<a href='/foo'>Link</a><img src='/bar'>";
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|resolvesRelativeLinks()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|resolvesRelativeLinks()|0", html), "http://example.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|resolvesRelativeLinks()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basicWithImages())));
        org.junit.Assert.assertEquals("<a href=\"http://example.com/foo\" rel=\"nofollow\">Link</a>\n<img src=\"http://example.com/bar\">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|resolvesRelativeLinks()|3", clean));
    }

    @org.junit.Test
    public void preservesRelativeLinksIfConfigured() {
        java.lang.String html = "<a href='/foo'>Link</a><img src='/bar'> <img src='javascript:alert()'>";
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|preservesRelativeLinksIfConfigured()|3", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|preservesRelativeLinksIfConfigured()|0", html), "http://example.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|preservesRelativeLinksIfConfigured()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|preservesRelativeLinksIfConfigured()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basicWithImages()).preserveRelativeLinks(true))));
        org.junit.Assert.assertEquals("<a href=\"/foo\" rel=\"nofollow\">Link</a>\n<img src=\"/bar\"> \n<img>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|preservesRelativeLinksIfConfigured()|4", clean));
    }

    @org.junit.Test
    public void dropsUnresolvableRelativeLinks() {
        java.lang.String html = "<a href='/foo'>Link</a>";
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|dropsUnresolvableRelativeLinks()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|dropsUnresolvableRelativeLinks()|0", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|dropsUnresolvableRelativeLinks()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic())));
        org.junit.Assert.assertEquals("<a rel=\"nofollow\">Link</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|dropsUnresolvableRelativeLinks()|3", clean));
    }

    @org.junit.Test
    public void handlesCustomProtocols() {
        java.lang.String html = "<img src='cid:12345' /> <img src='data:gzzt' />";
        java.lang.String dropped = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|0", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basicWithImages())));
        org.junit.Assert.assertEquals("<img> \n<img>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|3", dropped));
        java.lang.String preserved = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|7", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|4", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|6", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|5", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basicWithImages()).addProtocols("img", "src", "cid", "data"))));
        org.junit.Assert.assertEquals("<img src=\"cid:12345\"> \n<img src=\"data:gzzt\">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesCustomProtocols()|8", preserved));
    }

    @org.junit.Test
    public void handlesAllPseudoTag() {
        java.lang.String html = "<p class='foo' src='bar'><a class='qux'>link</a></p>";
        org.jsoup.safety.Whitelist whitelist = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|3", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|1", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|0", org.jsoup.safety.Whitelist.class, new org.jsoup.safety.Whitelist()).addAttributes(":all", "class")).addAttributes("p", "style")).addTags("p", "a"));
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|6", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|4", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|5", org.jsoup.safety.Whitelist.class, whitelist)));
        org.junit.Assert.assertEquals("<p class=\"foo\"><a class=\"qux\">link</a></p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesAllPseudoTag()|7", clean));
    }

    @org.junit.Test
    public void addsTagOnAttributesIfNotSet() {
        java.lang.String html = "<p class='foo' src='bar'>One</p>";
        org.jsoup.safety.Whitelist whitelist = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|addsTagOnAttributesIfNotSet()|1", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|addsTagOnAttributesIfNotSet()|0", org.jsoup.safety.Whitelist.class, new org.jsoup.safety.Whitelist()).addAttributes("p", "class"));
        // ^^ whitelist does not have explicit tag add for p, inferred from add attributes.
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|addsTagOnAttributesIfNotSet()|4", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|addsTagOnAttributesIfNotSet()|2", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|addsTagOnAttributesIfNotSet()|3", org.jsoup.safety.Whitelist.class, whitelist)));
        org.junit.Assert.assertEquals("<p class=\"foo\">One</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|addsTagOnAttributesIfNotSet()|5", clean));
    }

    @org.junit.Test
    public void supplyOutputSettings() {
        // test that one can override the default document output settings
        org.jsoup.nodes.Document.OutputSettings os = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|0", org.jsoup.nodes.Document.OutputSettings.class, new org.jsoup.nodes.Document.OutputSettings());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|2", org.jsoup.nodes.Document.OutputSettings.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|1", org.jsoup.nodes.Document.OutputSettings.class, os).prettyPrint(false));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|5", org.jsoup.nodes.Document.OutputSettings.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|3", org.jsoup.nodes.Document.OutputSettings.class, os).escapeMode(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Entities.EscapeMode>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|4", org.jsoup.nodes.Entities.EscapeMode.class, org.jsoup.nodes.Entities.EscapeMode.extended)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|7", org.jsoup.nodes.Document.OutputSettings.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|6", org.jsoup.nodes.Document.OutputSettings.class, os).charset("ascii"));
        java.lang.String html = "<div><p>&bernou;</p></div>";
        java.lang.String customOut = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|11", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|8", html), "http://foo.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|9", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|10", org.jsoup.nodes.Document.OutputSettings.class, os)));
        java.lang.String defaultOut = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|14", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|12", html), "http://foo.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|13", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed())));
        org.junit.Assert.assertNotSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|15", defaultOut), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|16", customOut));
        org.junit.Assert.assertEquals("<div><p>&Bscr;</p></div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|17", customOut));// entities now prefers shorted names if aliased

        org.junit.Assert.assertEquals(("<div>\n" + (" <p>\u212c</p>\n" + "</div>")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|18", defaultOut));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|20", org.jsoup.nodes.Document.OutputSettings.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|19", org.jsoup.nodes.Document.OutputSettings.class, os).charset("ASCII"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|23", org.jsoup.nodes.Document.OutputSettings.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|21", org.jsoup.nodes.Document.OutputSettings.class, os).escapeMode(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Entities.EscapeMode>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|22", org.jsoup.nodes.Entities.EscapeMode.class, org.jsoup.nodes.Entities.EscapeMode.base)));
        java.lang.String customOut2 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|27", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|24", html), "http://foo.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|25", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.safety.CleanerTest|supplyOutputSettings()|26", org.jsoup.nodes.Document.OutputSettings.class, os)));
        org.junit.Assert.assertEquals("<div><p>&#x212c;</p></div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|supplyOutputSettings()|28", customOut2));
    }

    @org.junit.Test
    public void handlesFramesets() {
        java.lang.String dirty = "<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset></html>";
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesFramesets()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesFramesets()|0", dirty), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic())));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesFramesets()|3", clean));// nothing good can come out of that

        org.jsoup.nodes.Document dirtyDoc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|5", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesFramesets()|4", dirty)));
        org.jsoup.nodes.Document cleanDoc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|9", org.jsoup.nodes.Document.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Cleaner>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|7", org.jsoup.safety.Cleaner.class, new org.jsoup.safety.Cleaner(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|6", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic()))).clean(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|8", org.jsoup.nodes.Document.class, dirtyDoc)));
        org.junit.Assert.assertFalse(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|10", org.jsoup.nodes.Document.class, cleanDoc)) == null));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesFramesets()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|12", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.safety.CleanerTest|handlesFramesets()|11", org.jsoup.nodes.Document.class, cleanDoc).body()).childNodeSize()));
    }

    @org.junit.Test
    public void cleansInternationalText() {
        org.junit.Assert.assertEquals("привет", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|cleansInternationalText()|1", org.jsoup.Jsoup.clean("привет", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|cleansInternationalText()|0", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.none()))));
    }

    @org.junit.Test
    public void testScriptTagInWhiteList() {
        org.jsoup.safety.Whitelist whitelist = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testScriptTagInWhiteList()|0", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.relaxed());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testScriptTagInWhiteList()|2", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testScriptTagInWhiteList()|1", org.jsoup.safety.Whitelist.class, whitelist).addTags("script"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|testScriptTagInWhiteList()|4", org.jsoup.Jsoup.isValid("Hello<script>alert('Doh')</script>World !", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|testScriptTagInWhiteList()|3", org.jsoup.safety.Whitelist.class, whitelist))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void bailsIfRemovingProtocolThatsNotSet() {
        try {
            // a case that came up on the email list
            org.jsoup.safety.Whitelist w = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|bailsIfRemovingProtocolThatsNotSet()|0", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.none());
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|bailsIfRemovingProtocolThatsNotSet()|2", org.jsoup.safety.Whitelist.class, // note no add tag, and removing protocol without adding first
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|bailsIfRemovingProtocolThatsNotSet()|1", org.jsoup.safety.Whitelist.class, w).addAttributes("a", "href"));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|bailsIfRemovingProtocolThatsNotSet()|4", org.jsoup.safety.Whitelist.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|bailsIfRemovingProtocolThatsNotSet()|3", org.jsoup.safety.Whitelist.class, w).removeProtocols("a", "href", "javascript")// with no protocols enforced, this was a noop. Now validates.
            );
        } catch (java.lang.IllegalArgumentException a1552755453252) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.jsoup.safety.CleanerTest|bailsIfRemovingProtocolThatsNotSet()|!", a1552755453252);
            throw a1552755453252;
        }
    }

    @org.junit.Test
    public void handlesControlCharactersAfterTagName() {
        java.lang.String html = "<a/\u0006>";
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesControlCharactersAfterTagName()|2", org.jsoup.Jsoup.clean(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesControlCharactersAfterTagName()|0", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesControlCharactersAfterTagName()|1", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic())));
        org.junit.Assert.assertEquals("<a rel=\"nofollow\"></a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesControlCharactersAfterTagName()|3", clean));
    }

    @org.junit.Test
    public void handlesAttributesWithNoValue() {
        // https://github.com/jhy/jsoup/issues/973
        java.lang.String clean = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesAttributesWithNoValue()|1", org.jsoup.Jsoup.clean("<a href>Clean</a>", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.safety.Whitelist>observeState("org.jsoup.safety.CleanerTest|handlesAttributesWithNoValue()|0", org.jsoup.safety.Whitelist.class, org.jsoup.safety.Whitelist.basic())));
        org.junit.Assert.assertEquals("<a rel=\"nofollow\">Clean</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.safety.CleanerTest|handlesAttributesWithNoValue()|2", clean));
    }
}

