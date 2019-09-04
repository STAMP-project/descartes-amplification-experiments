package j2html.tags;


public class RenderFormattedTest {
    @org.junit.Test
    public void testFormattedTags() throws java.lang.Exception {
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.RenderFormattedTest|testFormattedTags()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags()|0", j2html.tags.ContainerTag.class, j2html.TagCreator.p("Hello")))).renderFormatted()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.RenderFormattedTest|testFormattedTags()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is("<div>\n    <p>\n        Hello\n    </p>\n</div>\n")));
    }

    @org.junit.Test
    public void testFormattedTags_doesntFormatPre() throws java.lang.Exception {
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatPre()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatPre()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatPre()|0", j2html.tags.ContainerTag.class, j2html.TagCreator.pre(("public void renderModel(Appendable writer, Object model) throws IOException {\n" + ("        writer.append(text);\n" + "    }")))))).renderFormatted()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatPre()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(("<div>\n" + ((("    <pre>public void renderModel(Appendable writer, Object model) throws IOException {\n" + "        writer.append(text);\n") + "    }</pre>\n") + "</div>\n")))));
    }

    @org.junit.Test
    public void testFormattedTags_doesntFormatTextArea() throws java.lang.Exception {
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatTextArea()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatTextArea()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatTextArea()|0", j2html.tags.ContainerTag.class, j2html.TagCreator.textarea("fred\ntom")))).renderFormatted()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_doesntFormatTextArea()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(("<div>\n" + (("    <textarea>fred\n" + "tom</textarea>\n") + "</div>\n")))));
    }

    @org.junit.Test
    public void testFormattedTags_each() throws java.lang.Exception {
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.RenderFormattedTest|testFormattedTags_each()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_each()|4", j2html.tags.ContainerTag.class, j2html.TagCreator.ul(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.DomContent>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_each()|3", j2html.tags.DomContent.class, j2html.TagCreator.each(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_each()|0", java.util.List.class, java.util.Arrays.asList(1, 2, 3)), ( i) -> eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_each()|2", j2html.tags.ContainerTag.class, j2html.TagCreator.li(("Number " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.tags.RenderFormattedTest|testFormattedTags_each()|1", i))))))))).renderFormatted()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.tags.RenderFormattedTest|testFormattedTags_each()|6", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(("<ul>\n" + ((((((((("    <li>\n" + "        Number 1\n") + "    </li>\n") + "    <li>\n") + "        Number 2\n") + "    </li>\n") + "    <li>\n") + "        Number 3\n") + "    </li>\n") + "</ul>\n")))));
    }
}

