package j2html.attributes;


public class AttrShortFormTest {
    @org.junit.Test
    public void addTo_emptyTag() throws java.lang.Exception {
        java.lang.String expected = "<input id=\"some-id\" class=\"some-class\">";
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_emptyTag()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.EmptyTag>observeState("j2html.attributes.AttrShortFormTest|addTo_emptyTag()|1", j2html.tags.EmptyTag.class, j2html.TagCreator.input(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_emptyTag()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs("#some-id.some-class")))).render());
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_emptyTag()|3", actual), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttrShortFormTest|addTo_emptyTag()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_emptyTag()|4", expected))));
    }

    @org.junit.Test
    public void addTo_containerTag() throws java.lang.Exception {
        java.lang.String expected = "<div id=\"some-id\" class=\"some-class\"></div>";
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_containerTag()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_containerTag()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_containerTag()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs("#some-id.some-class")))).render());
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_containerTag()|3", actual), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttrShortFormTest|addTo_containerTag()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_containerTag()|4", expected))));
    }

    @org.junit.Test
    public void addTo_justId() throws java.lang.Exception {
        java.lang.String expected = "<div id=\"some-id\"></div>";
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_justId()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_justId()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_justId()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs("#some-id")))).render());
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_justId()|3", actual), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttrShortFormTest|addTo_justId()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_justId()|4", expected))));
    }

    @org.junit.Test
    public void addTo_justClass() throws java.lang.Exception {
        java.lang.String expected = "<div class=\"some-class\"></div>";
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_justClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_justClass()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_justClass()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs(".some-class")))).render());
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_justClass()|3", actual), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttrShortFormTest|addTo_justClass()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_justClass()|4", expected))));
    }

    @org.junit.Test
    public void addTo_addTwoClasses() throws java.lang.Exception {
        java.lang.String expected = "<div class=\"some-class some-other-class\"></div>";
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_addTwoClasses()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_addTwoClasses()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_addTwoClasses()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs(".some-class.some-other-class")))).render());
        org.hamcrest.MatcherAssert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_addTwoClasses()|3", actual), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("j2html.attributes.AttrShortFormTest|addTo_addTwoClasses()|5", org.hamcrest.Matcher.class, org.hamcrest.Matchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_addTwoClasses()|4", expected))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void addTo_stringWithoutIdOrClass() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_stringWithoutIdOrClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_stringWithoutIdOrClass()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_stringWithoutIdOrClass()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs("some-class")))).render());
        } catch (java.lang.IllegalArgumentException a1552647648887) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("j2html.attributes.AttrShortFormTest|addTo_stringWithoutIdOrClass()|!", a1552647648887);
            throw a1552647648887;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void addTo_stringWithTwoIds() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_stringWithTwoIds()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_stringWithTwoIds()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_stringWithTwoIds()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs("#id1#id2")))).render());
        } catch (java.lang.IllegalArgumentException a1552647648886) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("j2html.attributes.AttrShortFormTest|addTo_stringWithTwoIds()|!", a1552647648886);
            throw a1552647648886;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void addTo_stringWithStupidlyPlacedId() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.attributes.AttrShortFormTest|addTo_stringWithStupidlyPlacedId()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.tags.ContainerTag>observeState("j2html.attributes.AttrShortFormTest|addTo_stringWithStupidlyPlacedId()|1", j2html.tags.ContainerTag.class, j2html.TagCreator.div(eu.stamp_project.reneri.instrumentation.StateObserver.<j2html.attributes.Attr.ShortForm>observeState("j2html.attributes.AttrShortFormTest|addTo_stringWithStupidlyPlacedId()|0", j2html.attributes.Attr.ShortForm.class, j2html.TagCreator.attrs("id1#id2")))).render());
        } catch (java.lang.IllegalArgumentException a1552647648885) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("j2html.attributes.AttrShortFormTest|addTo_stringWithStupidlyPlacedId()|!", a1552647648885);
            throw a1552647648885;
        }
    }
}

