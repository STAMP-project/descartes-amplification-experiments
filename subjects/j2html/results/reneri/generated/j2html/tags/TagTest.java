package j2html.tags;


public class TagTest {
    @org.junit.Test
    public void testRender() throws java.lang.Exception {
        j2html.tags.ContainerTag testTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testRender()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|1", j2html.tags.ContainerTag.class, testTag).setAttribute("href", "http://example.com"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testRender()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|3", j2html.tags.ContainerTag.class, testTag).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testRender()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a href=\"http://example.com\"></a>")));
        j2html.tags.ContainerTag complexTestTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|16", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|6", j2html.tags.ContainerTag.class, j2html.TagCreator.html()).with(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|15", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|7", j2html.tags.ContainerTag.class, j2html.TagCreator.body()).with(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|8", j2html.tags.ContainerTag.class, j2html.TagCreator.header()), eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|11", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|9", j2html.tags.ContainerTag.class, j2html.TagCreator.main()).with(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|10", j2html.tags.ContainerTag.class, j2html.TagCreator.p("Main stuff...")))), eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|14", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|12", j2html.tags.ContainerTag.class, j2html.TagCreator.footer()).condWith((1 == 1), eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|13", j2html.tags.ContainerTag.class, j2html.TagCreator.p("Conditional with!"))))))));
        java.lang.String expectedResult = "<html><body><header></header><main><p>Main stuff...</p></main><footer><p>Conditional with!</p></footer></body></html>";
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testRender()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testRender()|17", j2html.tags.ContainerTag.class, complexTestTag).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testRender()|20", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testRender()|19", expectedResult))));
    }

    @org.junit.Test
    public void testOpenTag() throws java.lang.Exception {
        j2html.tags.ContainerTag testTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testOpenTag()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|1", j2html.tags.ContainerTag.class, testTag).renderOpenTag()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testOpenTag()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a>")));
        j2html.tags.ContainerTag complexTestTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|4", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("input"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|10", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|9", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|8", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|7", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|6", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|5", j2html.tags.ContainerTag.class, complexTestTag).withType("password")).withId("password")).withName("password")).withPlaceholder("Password")).isRequired());
        java.lang.String expectedResult = "<input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Password\" required>";
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testOpenTag()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testOpenTag()|11", j2html.tags.ContainerTag.class, complexTestTag).renderOpenTag()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testOpenTag()|14", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testOpenTag()|13", expectedResult))));
    }

    @org.junit.Test
    public void testCloseTag() throws java.lang.Exception {
        j2html.tags.ContainerTag testTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testCloseTag()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testCloseTag()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testCloseTag()|1", j2html.tags.ContainerTag.class, testTag).renderCloseTag()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testCloseTag()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("</a>")));
    }

    @org.junit.Test
    public void testSelfClosingTags() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testSelfClosingTags()|0", (j2html.Config.closeEmptyTags = true));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testSelfClosingTags()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.EmptyTag>observeState("j2html.tags.TagTest|testSelfClosingTags()|2", j2html.tags.EmptyTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.EmptyTag>observeState("j2html.tags.TagTest|testSelfClosingTags()|1", j2html.tags.EmptyTag.class, j2html.TagCreator.img()).withSrc("/test.png")).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testSelfClosingTags()|4", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<img src=\"/test.png\"/>")));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testSelfClosingTags()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.EmptyTag>observeState("j2html.tags.TagTest|testSelfClosingTags()|6", j2html.tags.EmptyTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.EmptyTag>observeState("j2html.tags.TagTest|testSelfClosingTags()|5", j2html.tags.EmptyTag.class, j2html.TagCreator.input()).withType("text")).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testSelfClosingTags()|8", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<input type=\"text\"/>")));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testSelfClosingTags()|9", (j2html.Config.closeEmptyTags = false));
    }

    @org.junit.Test
    public void testFormattedTags() throws java.lang.Exception {
        // better test in ComplexRenderTest.java
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testFormattedTags()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testFormattedTags()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testFormattedTags()|0", j2html.tags.ContainerTag.class, j2html.TagCreator.p("Hello")))).renderFormatted()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testFormattedTags()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<div>\n    <p>\n        Hello\n    </p>\n</div>\n")));
    }

    @org.junit.Test
    public void testEquals() throws java.lang.Exception {
        j2html.tags.Tag tagOne = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEquals()|2", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEquals()|1", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEquals()|0", j2html.tags.ContainerTag.class, j2html.TagCreator.tag("p")).withClass("class")).withText("Test"));
        j2html.tags.Tag tagTwo = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEquals()|4", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEquals()|3", j2html.tags.ContainerTag.class, j2html.TagCreator.p("Test")).withClass("class"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testEquals()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.Tag>observeState("j2html.tags.TagTest|testEquals()|5", j2html.tags.Tag.class, tagOne).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.Tag>observeState("j2html.tags.TagTest|testEquals()|6", j2html.tags.Tag.class, tagTwo))), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.Boolean>>observeState("j2html.tags.TagTest|testEquals()|8", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(true)));
    }

    @org.junit.Test
    public void testAcceptObjectValueAttribute() throws java.lang.Exception {
        j2html.tags.ContainerTag complexTestTag = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testAcceptObjectValueAttribute()|3", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testAcceptObjectValueAttribute()|2", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testAcceptObjectValueAttribute()|1", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testAcceptObjectValueAttribute()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("input")).attr("attr1", "value1")).attr("attr2", 2)).attr("attr3", null));
        java.lang.String expectedResult = "<input attr1=\"value1\" attr2=\"2\" attr3>";
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testAcceptObjectValueAttribute()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testAcceptObjectValueAttribute()|4", j2html.tags.ContainerTag.class, complexTestTag).renderOpenTag()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testAcceptObjectValueAttribute()|7", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testAcceptObjectValueAttribute()|6", expectedResult))));
    }

    @org.junit.Test
    public void testWithClasses() throws java.lang.Exception {
        java.lang.String expected = "<div class=\"c1 c2\"></div>";
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testWithClasses()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testWithClasses()|3", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testWithClasses()|0", j2html.tags.ContainerTag.class, j2html.TagCreator.div()).withClasses("c1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testWithClasses()|1", j2html.TagCreator.iff((1 == 1), "c2")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testWithClasses()|2", j2html.TagCreator.iff((1 == 2), "c3")))).render());
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testWithClasses()|5", actual), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testWithClasses()|7", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testWithClasses()|6", expected))));
    }

    @org.junit.Test
    public void testEmptyAttribute() throws java.lang.Exception {
        j2html.tags.ContainerTag testTagWithAttrValueNull = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEmptyAttribute()|1", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEmptyAttribute()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a")).attr("attribute", null));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testEmptyAttribute()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEmptyAttribute()|2", j2html.tags.ContainerTag.class, testTagWithAttrValueNull).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testEmptyAttribute()|4", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a attribute></a>")));
        j2html.tags.ContainerTag testTagAttrWithoutAttr = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEmptyAttribute()|6", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEmptyAttribute()|5", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a")).attr("attribute"));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testEmptyAttribute()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testEmptyAttribute()|7", j2html.tags.ContainerTag.class, testTagAttrWithoutAttr).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testEmptyAttribute()|9", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a attribute></a>")));
    }

    @org.junit.Test
    public void testDynamicAttribute() throws java.lang.Exception {
        j2html.tags.ContainerTag testTagWithAttrValueNull = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttribute()|2", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttribute()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a")).attr(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.model.DynamicHrefAttribute>observeState("j2html.tags.TagTest|testDynamicAttribute()|1", j2html.model.DynamicHrefAttribute.class, new j2html.model.DynamicHrefAttribute())));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testDynamicAttribute()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttribute()|3", j2html.tags.ContainerTag.class, testTagWithAttrValueNull).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testDynamicAttribute()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a href=\"/\"></a>")));
    }

    @org.junit.Test
    public void testDynamicAttributeReplacement() throws java.lang.Exception {
        j2html.tags.ContainerTag testTagWithAttrValueNull = eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttributeReplacement()|3", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttributeReplacement()|1", j2html.tags.ContainerTag.class, eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttributeReplacement()|0", j2html.tags.ContainerTag.class, new j2html.tags.ContainerTag("a")).attr("href", "/link")).attr(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.model.DynamicHrefAttribute>observeState("j2html.tags.TagTest|testDynamicAttributeReplacement()|2", j2html.model.DynamicHrefAttribute.class, new j2html.model.DynamicHrefAttribute())));
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.TagTest|testDynamicAttributeReplacement()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.TagTest|testDynamicAttributeReplacement()|4", j2html.tags.ContainerTag.class, testTagWithAttrValueNull).render()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.TagTest|testDynamicAttributeReplacement()|6", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<a href=\"/\"></a>")));
    }
}
