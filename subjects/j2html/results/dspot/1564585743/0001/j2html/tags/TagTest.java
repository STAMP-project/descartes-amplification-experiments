package j2html.tags;


import j2html.TagCreator;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class TagTest {
    @Test(timeout = 10000)
    public void testEquals_mg42() throws Exception {
        Tag __DSPOT_obj_7 = null;
        Tag tagOne = TagCreator.tag("p").withClass("class").withText("Test");
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagOne)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagOne)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isRequired())).getTagName());
        Tag tagTwo = TagCreator.p("Test").withClass("class");
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagTwo)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagTwo)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isRequired())).getTagName());
        MatcherAssert.assertThat(tagOne.equals(tagTwo), Matchers.is(true));
        boolean o_testEquals_mg42__12 = tagOne.equals(__DSPOT_obj_7);
        Assert.assertFalse(o_testEquals_mg42__12);
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagOne)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagOne)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagTwo)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagTwo)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isRequired())).getTagName());
    }
}

