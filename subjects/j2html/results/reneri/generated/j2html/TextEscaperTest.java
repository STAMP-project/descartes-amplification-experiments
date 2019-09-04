package j2html;


public class TextEscaperTest {
    @org.junit.Test
    public void testTextEscaper() throws java.lang.Exception {
        java.lang.String expected = "&lt;div&gt;&lt;/div&gt;";
        org.hamcrest.MatcherAssert.assertThat("default text escaper works", eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.TextEscaperTest|testTextEscaper()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.utils.TextEscaper>observeState("j2html.TextEscaperTest|testTextEscaper()|0", j2html.utils.TextEscaper.class, j2html.Config.textEscaper).escape("<div></div>")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.TextEscaperTest|testTextEscaper()|3", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.TextEscaperTest|testTextEscaper()|2", expected))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.utils.TextEscaper>observeState("j2html.TextEscaperTest|testTextEscaper()|4", j2html.utils.TextEscaper.class, (j2html.Config.textEscaper = new j2html.TextEscaperTest.NoOpEscaper()));
        org.hamcrest.MatcherAssert.assertThat("user can change text escaper implementation", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.utils.TextEscaper>observeState("j2html.TextEscaperTest|testTextEscaper()|5", j2html.utils.TextEscaper.class, j2html.Config.textEscaper), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<j2html.utils.TextEscaper>>observeState("j2html.TextEscaperTest|testTextEscaper()|7", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<j2html.utils.TextEscaper>>observeState("j2html.TextEscaperTest|testTextEscaper()|6", org.hamcrest.Matcher.class, org.hamcrest.Matchers.instanceOf(j2html.TextEscaperTest.NoOpEscaper.class)))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.TextEscaperTest|testTextEscaper()|8", (expected = "<div></div>"));
        org.hamcrest.MatcherAssert.assertThat("user provided text escaper actually works", eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.TextEscaperTest|testTextEscaper()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.utils.TextEscaper>observeState("j2html.TextEscaperTest|testTextEscaper()|9", j2html.utils.TextEscaper.class, j2html.Config.textEscaper).escape("<div></div>")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.TextEscaperTest|testTextEscaper()|12", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.TextEscaperTest|testTextEscaper()|11", expected))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.utils.TextEscaper>observeState("j2html.TextEscaperTest|testTextEscaper()|13", j2html.utils.TextEscaper.class, (j2html.Config.textEscaper = j2html.utils.EscapeUtil::escape)// reset escaper
        );
    }

    private static class NoOpEscaper implements j2html.utils.TextEscaper {
        @java.lang.Override
        public java.lang.String escape(java.lang.String text) {
            return text;
        }
    }
}

