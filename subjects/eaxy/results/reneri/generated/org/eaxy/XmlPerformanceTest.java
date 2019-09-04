package org.eaxy;


@org.junit.runner.RunWith(org.eaxy.FileTestRunner.class)
@org.eaxy.FileTestRunner.Directory("src/test/xml/performance-suite")
public class XmlPerformanceTest {
    private final java.lang.String contents;

    private java.io.File xmlFile;

    public XmlPerformanceTest(java.io.File xmlFile) throws java.io.IOException {
        this.xmlFile = xmlFile;
        long startTime = java.lang.System.currentTimeMillis();
        this.contents = org.eaxy.utils.IOUtils.slurp(xmlFile);
        long duration = (java.lang.System.currentTimeMillis()) - startTime;
        if (duration > (timeout())) {
            java.lang.System.err.println(((((("Warning: " + xmlFile) + " read in ") + (duration / 1000.0)) + "s - length: ") + (contents.length())));
        }
    }

    private int timeout() {
        // 1.5 second + 0.2 seconds/MB
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|timeout()|2", java.lang.Math.min((1500 + ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|timeout()|1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|timeout()|0", contents).length())) / 5000)), 10000));
    }

    @org.junit.Test
    public void readDocument() throws java.io.IOException {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlPerformanceTest|readDocument()|1", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlPerformanceTest|readDocument()|0", java.io.File.class, xmlFile)));
    }

    @org.junit.Test
    public void readsShouldBeFast() {
        long startTime = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|readsShouldBeFast()|0", java.lang.System.currentTimeMillis());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlPerformanceTest|readsShouldBeFast()|2", org.eaxy.Document.class, org.eaxy.Xml.xml(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|readsShouldBeFast()|1", contents)));
        org.assertj.core.api.Assertions.assertThat(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|readsShouldBeFast()|3", java.lang.System.currentTimeMillis())) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|readsShouldBeFast()|4", startTime)))).as("millis").isLessThan(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|readsShouldBeFast()|5", timeout()));
    }

    @org.junit.Test
    public void writesShouldBeFast() {
        org.eaxy.Document element = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|1", org.eaxy.Document.class, org.eaxy.Xml.xml(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|0", contents)));
        long startTime = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|2", java.lang.System.currentTimeMillis());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|3", org.eaxy.Document.class, element).toXML());
        org.assertj.core.api.Assertions.assertThat(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|5", java.lang.System.currentTimeMillis())) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|6", startTime)))).as("millis").isLessThan(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|writesShouldBeFast()|7", timeout()));
    }

    protected java.lang.String normalize(java.lang.String text) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|normalize(java.lang.String)|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|normalize(java.lang.String)|1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlPerformanceTest|normalize(java.lang.String)|0", text).trim()).replaceAll("\\s+", " "));
    }
}

