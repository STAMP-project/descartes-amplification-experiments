package org.eaxy.experimental;


public class SoapSimulatorWebAppTest {
    @org.junit.Test
    public void shouldShowWsdlFilesOnFrontPage() throws java.io.IOException {
        org.eaxy.experimental.SoapSimulatorWebApp server = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|0", org.eaxy.experimental.SoapSimulatorWebApp.class, new org.eaxy.experimental.SoapSimulatorWebApp(0));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|4", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|1", org.eaxy.experimental.SoapSimulatorWebApp.class, server).addSoapEndpoint("/soap/stockQuote", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SampleSoapXmlBuilder>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|3", org.eaxy.experimental.SampleSoapXmlBuilder.class, new org.eaxy.experimental.SampleSoapXmlBuilder(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|2", org.eaxy.Document.class, org.eaxy.Xml.readResource("/xsd/StockQuoteService.wsdl"))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|5", org.eaxy.experimental.SoapSimulatorWebApp.class, server).start();
        org.eaxy.Document frontPage = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|8", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|7", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|6", org.eaxy.experimental.SoapSimulatorWebApp.class, server).getUrl())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|15", org.assertj.core.api.ListAssert.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|14", org.assertj.core.api.ListAssert.class, org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|13", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|12", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|11", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|10", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldShowWsdlFilesOnFrontPage()|9", org.eaxy.Document.class, frontPage).find("...", "ul")).find("li", "a")).check()).texts()))).contains("StockQuoteService"));
    }

    @org.junit.Test
    public void shouldUploadDocument() throws java.io.IOException {
        org.eaxy.experimental.SoapSimulatorWebApp server = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|0", org.eaxy.experimental.SoapSimulatorWebApp.class, new org.eaxy.experimental.SoapSimulatorWebApp(0));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|1", org.eaxy.experimental.SoapSimulatorWebApp.class, server).start();
        java.net.HttpURLConnection connection = eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.HttpURLConnection>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|5", java.net.HttpURLConnection.class, ((java.net.HttpURLConnection) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|4", java.net.URL.class, new java.net.URL(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|3", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|2", org.eaxy.experimental.SoapSimulatorWebApp.class, server).getUrl()), "/doc/")).openConnection())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.HttpURLConnection>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|6", java.net.HttpURLConnection.class, connection).setRequestMethod("POST");
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.HttpURLConnection>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|7", java.net.HttpURLConnection.class, connection).setDoOutput(true);
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.HttpURLConnection>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|8", java.net.HttpURLConnection.class, connection).setRequestProperty("Content-type", "multipart/form-data; boundary=abc123");
        try (java.io.Writer writer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStreamWriter>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|11", java.io.OutputStreamWriter.class, new java.io.OutputStreamWriter(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|10", java.io.OutputStream.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.HttpURLConnection>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|9", java.net.HttpURLConnection.class, connection).getOutputStream())))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|12", java.io.Writer.class, writer).write("--abc123\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|13", java.io.Writer.class, writer).write("Content-disposition: form-data; name=\"soapRouterUrl\"\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|14", java.io.Writer.class, writer).write("/soap/testMessage\r\r");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|15", java.io.Writer.class, writer).write("\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|16", java.io.Writer.class, writer).write("--abc123\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|17", java.io.Writer.class, writer).write("Content-disposition: form-data; name=\"wsdlFile\"; content-type=text/xml\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|18", java.io.Writer.class, writer).write("\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|19", java.io.Writer.class, writer).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|20", org.eaxy.Document.class, org.eaxy.Xml.readResource("/xsd/greath-reservation.wsdl")).toIndentedXML()));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|22", java.io.Writer.class, writer).write("\r\n");
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.Writer>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|23", java.io.Writer.class, writer).write("--abc123--\r\n");
        }
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.HttpURLConnection>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|24", java.net.HttpURLConnection.class, connection).getResponseCode())).isEqualTo(200);
        org.eaxy.Document frontPage = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|28", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|27", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.experimental.SoapSimulatorWebApp>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|26", org.eaxy.experimental.SoapSimulatorWebApp.class, server).getUrl())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|35", org.assertj.core.api.ListAssert.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|34", org.assertj.core.api.ListAssert.class, org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|33", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|32", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|31", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|30", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.experimental.SoapSimulatorWebAppTest|shouldUploadDocument()|29", org.eaxy.Document.class, frontPage).find("...", "ul")).find("li", "a")).check()).texts()))).contains("reservationService"));
    }
}
