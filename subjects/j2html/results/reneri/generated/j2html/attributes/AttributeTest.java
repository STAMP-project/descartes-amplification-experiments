package j2html.attributes;


public class AttributeTest {
    @org.junit.Test
    public void testRender() throws java.lang.Exception {
        j2html.attributes.Attribute attributeWithValue = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attribute>observeState("j2html.attributes.AttributeTest|testRender()|0", j2html.attributes.Attribute.class, new j2html.attributes.Attribute("href", "http://example.com"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttributeTest|testRender()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attribute>observeState("j2html.attributes.AttributeTest|testRender()|1", j2html.attributes.Attribute.class, attributeWithValue).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttributeTest|testRender()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(" href=\"http://example.com\"")));
        j2html.attributes.Attribute attribute = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attribute>observeState("j2html.attributes.AttributeTest|testRender()|4", j2html.attributes.Attribute.class, new j2html.attributes.Attribute("required", null));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttributeTest|testRender()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attribute>observeState("j2html.attributes.AttributeTest|testRender()|5", j2html.attributes.Attribute.class, attribute).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttributeTest|testRender()|7", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(" required")));
        j2html.attributes.Attribute nullAttribute = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attribute>observeState("j2html.attributes.AttributeTest|testRender()|8", j2html.attributes.Attribute.class, new j2html.attributes.Attribute(null, null));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttributeTest|testRender()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attribute>observeState("j2html.attributes.AttributeTest|testRender()|9", j2html.attributes.Attribute.class, nullAttribute).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttributeTest|testRender()|11", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("")));
    }

    @org.junit.Test
    public void testSetAttribute() throws java.lang.Exception {
        j2html.tags.ContainerTag testTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttributeTest|testSetAttribute()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttributeTest|testSetAttribute()|2", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttributeTest|testSetAttribute()|1", j2html.tags.ContainerTag.class, testTag).attr("href", "http://example.com"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttributeTest|testSetAttribute()|4", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttributeTest|testSetAttribute()|3", j2html.tags.ContainerTag.class, testTag).attr("href", "http://example.org"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttributeTest|testSetAttribute()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttributeTest|testSetAttribute()|5", j2html.tags.ContainerTag.class, testTag).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttributeTest|testSetAttribute()|7", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a href=\"http://example.org\"></a>")));
    }
}

