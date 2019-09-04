package org.eaxy;


@org.junit.runner.RunWith(org.eaxy.FileTestRunner.class)
@org.eaxy.FileTestRunner.Directory("src/test/xml/samples")
public class XmlSerializationTest {
    private final java.io.File xmlFile;

    public XmlSerializationTest(java.io.File xmlFile) {
        this.xmlFile = xmlFile;
    }

    @org.junit.Test
    public void shouldReadWithStax() throws java.lang.Exception {
        try (java.io.InputStreamReader input = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStreamReader>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|0", java.io.InputStreamReader.class, input())) {
            org.eaxy.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|2", org.eaxy.Document.class, org.eaxy.StaxReader.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStreamReader>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|1", java.io.InputStreamReader.class, input)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStreamReader>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|3", java.io.InputStreamReader.class, input).close();
            org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithStax()|7", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithStax()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|5", org.eaxy.Document.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|4", org.eaxy.Document.class, doc).copy()).toXML())))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithStax()|10", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithStax()|9", org.eaxy.utils.IOUtils.slurp(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldReadWithStax()|8", java.io.File.class, xmlFile))))));
        }
    }

    @org.junit.Test
    public void shouldReadWithSax() throws java.lang.Exception {
        try (java.io.InputStream input = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|1", java.io.FileInputStream.class, new java.io.FileInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|0", java.io.File.class, xmlFile)))) {
            org.eaxy.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|3", org.eaxy.Document.class, org.eaxy.SaxReader.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|2", java.io.InputStream.class, input)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|4", java.io.InputStream.class, input).close();
            org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithSax()|8", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithSax()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|6", org.eaxy.Document.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|5", org.eaxy.Document.class, doc).copy()).toXML())))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithSax()|11", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldReadWithSax()|10", org.eaxy.utils.IOUtils.slurp(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldReadWithSax()|9", java.io.File.class, xmlFile))))));
        }
    }

    private java.io.InputStreamReader input() throws java.io.FileNotFoundException {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStreamReader>observeState("org.eaxy.XmlSerializationTest|input()|2", java.io.InputStreamReader.class, new java.io.InputStreamReader(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.eaxy.XmlSerializationTest|input()|1", java.io.FileInputStream.class, new java.io.FileInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|input()|0", java.io.File.class, xmlFile)))));
    }

    @org.junit.Test
    public void shouldTransformSerializedViaDom() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.StringAssert>observeState("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|6", org.assertj.core.api.StringAssert.class, assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|3", org.eaxy.Document.class, org.eaxy.DomSerializedTransformer.fromDom(eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|2", org.w3c.dom.Document.class, org.eaxy.DomSerializedTransformer.toDom(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|1", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|0", java.io.File.class, xmlFile))))))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|5", org.eaxy.utils.IOUtils.slurp(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldTransformSerializedViaDom()|4", java.io.File.class, xmlFile)))));
    }

    @org.junit.Test
    public void shouldTransformViaDom() throws java.lang.Exception {
        org.eaxy.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|3", org.eaxy.Document.class, org.eaxy.Xml.fromDom(eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|2", org.w3c.dom.Document.class, org.eaxy.Xml.toDom(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|1", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|0", java.io.File.class, xmlFile)))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.StringAssert>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|9", org.assertj.core.api.StringAssert.class, assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|6", org.eaxy.Document.class, org.eaxy.Xml.fromDom(eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|5", org.w3c.dom.Document.class, org.eaxy.Xml.toDom(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|4", org.eaxy.Document.class, doc))))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|8", org.eaxy.utils.IOUtils.slurp(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldTransformViaDom()|7", java.io.File.class, xmlFile)))));
    }

    @org.junit.Test
    public void shouldIterate() throws java.io.IOException {
        int elementCount = 0;
        org.eaxy.ElementQuery filter = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementQuery>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|0", org.eaxy.ElementQuery.class, org.eaxy.Xml.filter("*"));
        for (@java.lang.SuppressWarnings("unused")
        org.eaxy.Element element : eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.XmlIterable>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|5", org.eaxy.XmlIterable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementQuery>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|1", org.eaxy.ElementQuery.class, filter).iterate(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|4", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URI>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|3", java.net.URI.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|2", java.io.File.class, xmlFile).toURI()).toURL())))) {
            elementCount++;
        }
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldIterate()|6", elementCount)).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|shouldIterate()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|10", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|8", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|7", java.io.File.class, xmlFile))).find(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementQuery>observeState("org.eaxy.XmlSerializationTest|shouldIterate()|9", org.eaxy.ElementQuery.class, filter))).size()));
    }

    private org.assertj.core.api.StringAssert assertEquals(org.eaxy.Document document, java.lang.String fileContents) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.StringAssert>observeState("org.eaxy.XmlSerializationTest|assertEquals(org.eaxy.Document,java.lang.String)|5", org.assertj.core.api.StringAssert.class, ((org.assertj.core.api.StringAssert) (org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|assertEquals(org.eaxy.Document,java.lang.String)|2", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|assertEquals(org.eaxy.Document,java.lang.String)|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.XmlSerializationTest|assertEquals(org.eaxy.Document,java.lang.String)|0", org.eaxy.Document.class, document).toXML())))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|assertEquals(org.eaxy.Document,java.lang.String)|4", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|assertEquals(org.eaxy.Document,java.lang.String)|3", fileContents)))))));
    }

    protected java.lang.String normalize(java.lang.String text) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|normalize(java.lang.String)|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|normalize(java.lang.String)|1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.XmlSerializationTest|normalize(java.lang.String)|0", text).trim()).replaceAll("\\s+", " "));
    }
}

