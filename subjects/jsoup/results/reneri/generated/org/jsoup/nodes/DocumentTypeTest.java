package org.jsoup.nodes;


/**
 * Tests for the DocumentType node
 *
 * @author Jonathan Hedley, http://jonathanhedley.com/
 */
public class DocumentTypeTest {
    @org.junit.Test
    public void constructorValidationOkWithBlankName() {
        org.jsoup.nodes.DocumentType fail = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|constructorValidationOkWithBlankName()|0", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("", "", ""));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void constructorValidationThrowsExceptionOnNulls() {
        try {
            org.jsoup.nodes.DocumentType fail = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|constructorValidationThrowsExceptionOnNulls()|0", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("html", null, null));
        } catch (java.lang.IllegalArgumentException a1552755452735) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.jsoup.nodes.DocumentTypeTest|constructorValidationThrowsExceptionOnNulls()|!", a1552755452735);
            throw a1552755452735;
        }
    }

    @org.junit.Test
    public void constructorValidationOkWithBlankPublicAndSystemIds() {
        org.jsoup.nodes.DocumentType fail = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|constructorValidationOkWithBlankPublicAndSystemIds()|0", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("html", "", ""));
    }

    @org.junit.Test
    public void outerHtmlGeneration() {
        org.jsoup.nodes.DocumentType html5 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|0", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("html", "", ""));
        org.junit.Assert.assertEquals("<!doctype html>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|1", org.jsoup.nodes.DocumentType.class, html5).outerHtml()));
        org.jsoup.nodes.DocumentType publicDocType = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|3", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("html", "-//IETF//DTD HTML//", ""));
        org.junit.Assert.assertEquals("<!DOCTYPE html PUBLIC \"-//IETF//DTD HTML//\">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|4", org.jsoup.nodes.DocumentType.class, publicDocType).outerHtml()));
        org.jsoup.nodes.DocumentType systemDocType = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|6", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("html", "", "http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd"));
        org.junit.Assert.assertEquals("<!DOCTYPE html \"http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd\">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|7", org.jsoup.nodes.DocumentType.class, systemDocType).outerHtml()));
        org.jsoup.nodes.DocumentType combo = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|9", org.jsoup.nodes.DocumentType.class, new org.jsoup.nodes.DocumentType("notHtml", "--public", "--system"));
        org.junit.Assert.assertEquals("<!DOCTYPE notHtml PUBLIC \"--public\" \"--system\">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|outerHtmlGeneration()|10", org.jsoup.nodes.DocumentType.class, combo).outerHtml()));
    }

    @org.junit.Test
    public void testRoundTrip() {
        java.lang.String base = "<!DOCTYPE html>";
        org.junit.Assert.assertEquals("<!doctype html>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|1", htmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|0", base))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|2", base), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|4", xmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|3", base))));
        java.lang.String publicDoc = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|5", publicDoc), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|7", htmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|6", publicDoc))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|8", publicDoc), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|10", xmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|9", publicDoc))));
        java.lang.String systemDoc = "<!DOCTYPE html SYSTEM \"exampledtdfile.dtd\">";
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|11", systemDoc), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|13", htmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|12", systemDoc))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|14", systemDoc), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|16", xmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|15", systemDoc))));
        java.lang.String legacyDoc = "<!DOCTYPE html SYSTEM \"about:legacy-compat\">";
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|17", legacyDoc), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|19", htmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|18", legacyDoc))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|20", legacyDoc), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|22", xmlOutput(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|testRoundTrip()|21", legacyDoc))));
    }

    private java.lang.String htmlOutput(java.lang.String in) {
        org.jsoup.nodes.DocumentType type = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|htmlOutput(java.lang.String)|2", org.jsoup.nodes.DocumentType.class, ((org.jsoup.nodes.DocumentType) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.DocumentTypeTest|htmlOutput(java.lang.String)|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|htmlOutput(java.lang.String)|0", in))).childNode(0))));
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|htmlOutput(java.lang.String)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.DocumentType>observeState("org.jsoup.nodes.DocumentTypeTest|htmlOutput(java.lang.String)|3", org.jsoup.nodes.DocumentType.class, type).outerHtml());
    }

    private java.lang.String xmlOutput(java.lang.String in) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|xmlOutput(java.lang.String)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Node>observeState("org.jsoup.nodes.DocumentTypeTest|xmlOutput(java.lang.String)|3", org.jsoup.nodes.Node.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.DocumentTypeTest|xmlOutput(java.lang.String)|2", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.DocumentTypeTest|xmlOutput(java.lang.String)|0", in), "", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Parser>observeState("org.jsoup.nodes.DocumentTypeTest|xmlOutput(java.lang.String)|1", org.jsoup.parser.Parser.class, org.jsoup.parser.Parser.xmlParser()))).childNode(0)).outerHtml());
    }
}

