package org.jsoup.nodes;


/**
 * Tests for FormElement
 *
 * @author Jonathan Hedley
 */
public class FormElementTest {
    @org.junit.Test
    public void hasAssociatedControls() {
        // "button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
        java.lang.String html = "<form id=1><button id=1><fieldset id=2 /><input id=3><keygen id=4><object id=5><output id=6>" + "<select id=7><option></select><textarea id=8><p id=9>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|0", html)));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|4", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|2", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        org.junit.Assert.assertEquals(8, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|6", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|hasAssociatedControls()|5", org.jsoup.nodes.FormElement.class, form).elements()).size()));
    }

    @org.junit.Test
    public void createsFormData() {
        java.lang.String html = "<form><input name='one' value='two'><select name='three'><option value='not'>" + (((("<option value='four' selected><option value='five' selected><textarea name=six>seven</textarea>" + "<input name='seven' type='radio' value='on' checked><input name='seven' type='radio' value='off'>") + "<input name='eight' type='checkbox' checked><input name='nine' type='checkbox' value='unset'>") + "<input name='ten' value='text' disabled>") + "</form>");
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|0", html)));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|4", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|2", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        java.util.List<org.jsoup.Connection.KeyVal> data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|6", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|5", org.jsoup.nodes.FormElement.class, form).formData());
        org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|7", java.util.List.class, data).size()));
        org.junit.Assert.assertEquals("one=two", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|10", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|9", java.util.List.class, data).get(0)).toString()));
        org.junit.Assert.assertEquals("three=four", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|13", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|12", java.util.List.class, data).get(1)).toString()));
        org.junit.Assert.assertEquals("three=five", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|16", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|15", java.util.List.class, data).get(2)).toString()));
        org.junit.Assert.assertEquals("six=seven", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|19", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|18", java.util.List.class, data).get(3)).toString()));
        org.junit.Assert.assertEquals("seven=on", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|22", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|21", java.util.List.class, data).get(4)).toString()));// set

        org.junit.Assert.assertEquals("eight=on", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsFormData()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|25", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsFormData()|24", java.util.List.class, data).get(5)).toString()));// default

        // nine should not appear, not checked checkbox
        // ten should not appear, disabled
    }

    @org.junit.Test
    public void createsSubmitableConnection() {
        java.lang.String html = "<form action='/search'><input name='q'></form>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|0", html), "http://example.com/"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|4", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|2", org.jsoup.nodes.Document.class, doc).select("[name=q]")).attr("value", "jsoup"));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|7", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|6", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|5", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        org.jsoup.Connection con = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|9", org.jsoup.Connection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|8", org.jsoup.nodes.FormElement.class, form).submit());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Method>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|10", org.jsoup.Connection.Method.class, org.jsoup.Connection.Method.GET), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Method>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|13", org.jsoup.Connection.Method.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Request>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|12", org.jsoup.Connection.Request.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|11", org.jsoup.Connection.class, con).request()).method()));
        org.junit.Assert.assertEquals("http://example.com/search", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|16", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Request>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|15", org.jsoup.Connection.Request.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|14", org.jsoup.Connection.class, con).request()).url()).toExternalForm()));
        java.util.List<org.jsoup.Connection.KeyVal> dataList = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|20", java.util.List.class, ((java.util.List<org.jsoup.Connection.KeyVal>) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Request>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|19", org.jsoup.Connection.Request.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|18", org.jsoup.Connection.class, con).request()).data())));
        org.junit.Assert.assertEquals("q=jsoup", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|22", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|21", java.util.List.class, dataList).get(0)).toString()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|26", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|25", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|24", org.jsoup.nodes.Document.class, doc).select("form")).attr("method", "post"));
        org.jsoup.Connection con2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|28", org.jsoup.Connection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|27", org.jsoup.nodes.FormElement.class, form).submit());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Method>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|29", org.jsoup.Connection.Method.class, org.jsoup.Connection.Method.POST), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Method>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|32", org.jsoup.Connection.Method.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Request>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|31", org.jsoup.Connection.Request.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|createsSubmitableConnection()|30", org.jsoup.Connection.class, con2).request()).method()));
    }

    @org.junit.Test
    public void actionWithNoValue() {
        java.lang.String html = "<form><input name='q'></form>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|actionWithNoValue()|0", html), "http://example.com/"));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|4", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|2", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        org.jsoup.Connection con = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|6", org.jsoup.Connection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|5", org.jsoup.nodes.FormElement.class, form).submit());
        org.junit.Assert.assertEquals("http://example.com/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|actionWithNoValue()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|9", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.Request>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|8", org.jsoup.Connection.Request.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|actionWithNoValue()|7", org.jsoup.Connection.class, con).request()).url()).toExternalForm()));
    }

    @org.junit.Test
    public void actionWithNoBaseUri() {
        java.lang.String html = "<form><input name='q'></form>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|0", html)));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|4", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|2", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        boolean threw = false;
        try {
            org.jsoup.Connection con = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|6", org.jsoup.Connection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|5", org.jsoup.nodes.FormElement.class, form).submit());
        } catch (java.lang.IllegalArgumentException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|7", (threw = true));
            org.junit.Assert.assertEquals("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.IllegalArgumentException>observeState("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|8", java.lang.IllegalArgumentException.class, e).getMessage()));
        }
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|actionWithNoBaseUri()|10", threw));
    }

    @org.junit.Test
    public void formsAddedAfterParseAreFormElements() {
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|0", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse("<body />"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|3", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|2", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|1", org.jsoup.nodes.Document.class, doc).body()).html("<form action='http://example.com/search'><input name='q' value='search'>"));
        org.jsoup.nodes.Element formEl = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|6", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|5", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|4", org.jsoup.nodes.Document.class, doc).select("form")).first());
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|7", org.jsoup.nodes.Element.class, formEl)) instanceof org.jsoup.nodes.FormElement));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|8", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (formEl)));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|10", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|formsAddedAfterParseAreFormElements()|9", org.jsoup.nodes.FormElement.class, form).elements()).size()));
    }

    @org.junit.Test
    public void controlsAddedAfterParseAreLinkedWithForms() {
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|0", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse("<body />"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|3", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|2", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|1", org.jsoup.nodes.Document.class, doc).body()).html("<form />"));
        org.jsoup.nodes.Element formEl = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|6", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|5", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|4", org.jsoup.nodes.Document.class, doc).select("form")).first());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|8", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|7", org.jsoup.nodes.Element.class, formEl).append("<input name=foo value=bar>"));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|9", org.jsoup.nodes.Element.class, formEl)) instanceof org.jsoup.nodes.FormElement));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|10", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (formEl)));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|12", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|11", org.jsoup.nodes.FormElement.class, form).elements()).size()));
        java.util.List<org.jsoup.Connection.KeyVal> data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|15", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|14", org.jsoup.nodes.FormElement.class, form).formData());
        org.junit.Assert.assertEquals("foo=bar", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|17", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|controlsAddedAfterParseAreLinkedWithForms()|16", java.util.List.class, data).get(0)).toString()));
    }

    @org.junit.Test
    public void usesOnForCheckboxValueIfNoValueSet() {
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|0", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse("<form><input type=checkbox checked name=foo></form>"));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|3", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|2", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|1", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        java.util.List<org.jsoup.Connection.KeyVal> data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|5", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|4", org.jsoup.nodes.FormElement.class, form).formData());
        org.junit.Assert.assertEquals("on", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|7", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|6", java.util.List.class, data).get(0)).value()));
        org.junit.Assert.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|10", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|usesOnForCheckboxValueIfNoValueSet()|9", java.util.List.class, data).get(0)).key()));
    }

    @org.junit.Test
    public void adoptedFormsRetainInputs() {
        // test for https://github.com/jhy/jsoup/issues/249
        java.lang.String html = "<html>\n" + ((((((((("<body>  \n" + "  <table>\n") + "      <form action=\"/hello.php\" method=\"post\">\n") + "      <tr><td>User:</td><td> <input type=\"text\" name=\"user\" /></td></tr>\n") + "      <tr><td>Password:</td><td> <input type=\"password\" name=\"pass\" /></td></tr>\n") + "      <tr><td><input type=\"submit\" name=\"login\" value=\"login\" /></td></tr>\n") + "   </form>\n") + "  </table>\n") + "</body>\n") + "</html>");
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|0", html)));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|4", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|2", org.jsoup.nodes.Document.class, doc).select("form")).first())));
        java.util.List<org.jsoup.Connection.KeyVal> data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|6", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|5", org.jsoup.nodes.FormElement.class, form).formData());
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|7", java.util.List.class, data).size()));
        org.junit.Assert.assertEquals("user", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|10", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|9", java.util.List.class, data).get(0)).key()));
        org.junit.Assert.assertEquals("pass", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|13", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|12", java.util.List.class, data).get(1)).key()));
        org.junit.Assert.assertEquals("login", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|16", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|adoptedFormsRetainInputs()|15", java.util.List.class, data).get(2)).key()));
    }

    @org.junit.Test
    public void removeFormElement() {
        java.lang.String html = "<html>\n" + ((((((("  <body> \n" + "      <form action=\"/hello.php\" method=\"post\">\n") + "      User:<input type=\"text\" name=\"user\" />\n") + "      Password:<input type=\"password\" name=\"pass\" />\n") + "      <input type=\"submit\" name=\"login\" value=\"login\" />\n") + "   </form>\n") + "  </body>\n") + "</html>  ");
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|removeFormElement()|0", html)));
        org.jsoup.nodes.FormElement form = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|3", org.jsoup.nodes.FormElement.class, ((org.jsoup.nodes.FormElement) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|2", org.jsoup.nodes.Document.class, doc).selectFirst("form"))));
        org.jsoup.nodes.Element pass = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|5", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|4", org.jsoup.nodes.FormElement.class, form).selectFirst("input[name=pass]"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|6", org.jsoup.nodes.Element.class, pass).remove();
        java.util.List<org.jsoup.Connection.KeyVal> data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|8", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.FormElement>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|7", org.jsoup.nodes.FormElement.class, form).formData());
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|removeFormElement()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|9", java.util.List.class, data).size()));
        org.junit.Assert.assertEquals("user", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|removeFormElement()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|12", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|11", java.util.List.class, data).get(0)).key()));
        org.junit.Assert.assertEquals("login", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.nodes.FormElementTest|removeFormElement()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.Connection.KeyVal>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|15", org.jsoup.Connection.KeyVal.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.Connection.KeyVal>>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|14", java.util.List.class, data).get(1)).key()));
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|18", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.nodes.FormElementTest|removeFormElement()|17", org.jsoup.nodes.Document.class, doc).selectFirst("input[name=pass]")));
    }
}

