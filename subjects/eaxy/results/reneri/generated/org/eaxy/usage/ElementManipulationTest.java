package org.eaxy.usage;


public class ElementManipulationTest {
    @org.junit.Test
    public void shouldUpdateText() {
        org.eaxy.Element xml = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|4", org.eaxy.Element.class, org.eaxy.Xml.el("div", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|3", org.eaxy.Element.class, org.eaxy.Xml.el("p", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Node>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|0", org.eaxy.Node.class, org.eaxy.Xml.text("hello ")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|1", org.eaxy.Element.class, org.eaxy.Xml.el("b", "world (in bold)")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Node>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|2", org.eaxy.Node.class, org.eaxy.Xml.text(" whassup?"))))));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|5", org.eaxy.Element.class, xml).text())).isEqualTo("hello world (in bold) whassup?");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|8", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|7", org.eaxy.Element.class, xml).text("New text"));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateText()|9", org.eaxy.Element.class, xml).text())).isEqualTo("New text");
    }

    @org.junit.Test
    public void shouldAppendElements() {
        org.eaxy.Element xml = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|0", org.eaxy.Element.class, org.eaxy.Xml.el("div"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|5", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|1", org.eaxy.Element.class, xml).addAll(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Node>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|2", org.eaxy.Node.class, org.eaxy.Xml.text("hello ")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|3", org.eaxy.Element.class, org.eaxy.Xml.el("b", "brave")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Node>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|4", org.eaxy.Node.class, org.eaxy.Xml.text(" world"))));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|6", org.eaxy.Element.class, xml).text())).isEqualTo("hello brave world");
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|10", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|9", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldAppendElements()|8", org.eaxy.Element.class, xml).find("b")).single()).text())).isEqualTo("brave");
    }

    @org.junit.Test
    public void shouldUpdateAttributes() {
        org.eaxy.Element xml = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|3", org.eaxy.Element.class, org.eaxy.Xml.el("ul", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|0", org.eaxy.Element.class, org.eaxy.Xml.el("li", "first")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|1", org.eaxy.Element.class, org.eaxy.Xml.el("li", "second")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|2", org.eaxy.Element.class, org.eaxy.Xml.el("li", "third"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|6", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|5", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|4", org.eaxy.Element.class, xml).find("li")).attr("class", "new-class"));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|9", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|8", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUpdateAttributes()|7", org.eaxy.Element.class, xml).find("li")).first()).className())).isEqualTo("new-class");
    }

    @org.junit.Test
    public void shouldUseFragmentAsTemplate() throws java.lang.Exception {
        org.eaxy.Element xml = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|2", org.eaxy.Element.class, org.eaxy.Xml.el("ul", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|0", org.eaxy.Element.class, org.eaxy.Xml.el("li", "some text")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|1", org.eaxy.Element.class, org.eaxy.Xml.el("p", "other text"))));
        org.eaxy.Element template = eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|4", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|3", org.eaxy.Element.class, xml).take("li"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|9", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|5", org.eaxy.Element.class, xml).add(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|8", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|7", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|6", org.eaxy.Element.class, template).copy()).text("foo"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|14", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|10", org.eaxy.Element.class, xml).add(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|13", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|12", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|11", org.eaxy.Element.class, template).copy()).text("bar"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|19", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|15", org.eaxy.Element.class, xml).add(eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|18", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|17", org.eaxy.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|16", org.eaxy.Element.class, template).copy()).text("baz"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|25", org.assertj.core.api.ListAssert.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|24", org.assertj.core.api.ListAssert.class, org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|23", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|22", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|21", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|20", org.eaxy.Element.class, xml).find("li")).check()).texts()))).containsExactly("foo", "bar", "baz"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|31", org.assertj.core.api.ListAssert.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.assertj.core.api.ListAssert<java.lang.String>>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|30", org.assertj.core.api.ListAssert.class, org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|29", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|28", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.ElementSet>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|27", org.eaxy.ElementSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Element>observeState("org.eaxy.usage.ElementManipulationTest|shouldUseFragmentAsTemplate()|26", org.eaxy.Element.class, xml).find("p")).check()).texts()))).containsExactly("other text"));
    }
}

