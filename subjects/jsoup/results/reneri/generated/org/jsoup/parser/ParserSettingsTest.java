package org.jsoup.parser;


public class ParserSettingsTest {
    @org.junit.Rule
    public org.jsoup.MultiLocaleRule rule = new org.jsoup.MultiLocaleRule();

    @org.junit.Test
    @org.jsoup.MultiLocaleRule.MultiLocaleTest
    public void caseSupport() {
        org.jsoup.parser.ParseSettings bothOn = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|0", org.jsoup.parser.ParseSettings.class, new org.jsoup.parser.ParseSettings(true, true));
        org.jsoup.parser.ParseSettings bothOff = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|1", org.jsoup.parser.ParseSettings.class, new org.jsoup.parser.ParseSettings(false, false));
        org.jsoup.parser.ParseSettings tagOn = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|2", org.jsoup.parser.ParseSettings.class, new org.jsoup.parser.ParseSettings(true, false));
        org.jsoup.parser.ParseSettings attrOn = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|3", org.jsoup.parser.ParseSettings.class, new org.jsoup.parser.ParseSettings(false, true));
        org.junit.Assert.assertEquals("IMG", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|4", org.jsoup.parser.ParseSettings.class, bothOn).normalizeTag("IMG")));
        org.junit.Assert.assertEquals("ID", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|6", org.jsoup.parser.ParseSettings.class, bothOn).normalizeAttribute("ID")));
        org.junit.Assert.assertEquals("img", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|8", org.jsoup.parser.ParseSettings.class, bothOff).normalizeTag("IMG")));
        org.junit.Assert.assertEquals("id", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|10", org.jsoup.parser.ParseSettings.class, bothOff).normalizeAttribute("ID")));
        org.junit.Assert.assertEquals("IMG", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|12", org.jsoup.parser.ParseSettings.class, tagOn).normalizeTag("IMG")));
        org.junit.Assert.assertEquals("id", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|14", org.jsoup.parser.ParseSettings.class, tagOn).normalizeAttribute("ID")));
        org.junit.Assert.assertEquals("img", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|16", org.jsoup.parser.ParseSettings.class, attrOn).normalizeTag("IMG")));
        org.junit.Assert.assertEquals("ID", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|caseSupport()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|caseSupport()|18", org.jsoup.parser.ParseSettings.class, attrOn).normalizeAttribute("ID")));
    }

    @org.junit.Test
    @org.jsoup.MultiLocaleRule.MultiLocaleTest
    public void attributeCaseNormalization() throws java.lang.Exception {
        org.jsoup.parser.ParseSettings parseSettings = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|attributeCaseNormalization()|0", org.jsoup.parser.ParseSettings.class, new org.jsoup.parser.ParseSettings(false, false));
        java.lang.String normalizedAttribute = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|attributeCaseNormalization()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|attributeCaseNormalization()|1", org.jsoup.parser.ParseSettings.class, parseSettings).normalizeAttribute("HIDDEN"));
        org.junit.Assert.assertEquals("hidden", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|attributeCaseNormalization()|3", normalizedAttribute));
    }

    @org.junit.Test
    @org.jsoup.MultiLocaleRule.MultiLocaleTest
    public void attributesCaseNormalization() throws java.lang.Exception {
        org.jsoup.parser.ParseSettings parseSettings = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|0", org.jsoup.parser.ParseSettings.class, new org.jsoup.parser.ParseSettings(false, false));
        org.jsoup.nodes.Attributes attributes = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attributes>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|1", org.jsoup.nodes.Attributes.class, new org.jsoup.nodes.Attributes());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attributes>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|3", org.jsoup.nodes.Attributes.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attributes>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|2", org.jsoup.nodes.Attributes.class, attributes).put("ITEM", "1"));
        org.jsoup.nodes.Attributes normalizedAttributes = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attributes>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|6", org.jsoup.nodes.Attributes.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|4", org.jsoup.parser.ParseSettings.class, parseSettings).normalizeAttributes(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attributes>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|5", org.jsoup.nodes.Attributes.class, attributes)));
        org.junit.Assert.assertEquals("item", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attribute>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|9", org.jsoup.nodes.Attribute.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.jsoup.nodes.Attribute>>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|8", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Attributes>observeState("org.jsoup.parser.ParserSettingsTest|attributesCaseNormalization()|7", org.jsoup.nodes.Attributes.class, normalizedAttributes).asList()).get(0)).getKey()));
    }
}

