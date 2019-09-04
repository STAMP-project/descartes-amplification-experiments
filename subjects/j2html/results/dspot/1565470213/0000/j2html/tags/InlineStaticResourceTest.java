package j2html.tags;


import j2html.TagCreator;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class InlineStaticResourceTest {
    private static final String EOL = System.getProperty("line.separator");

    @Test(timeout = 10000)
    public void testAllTags_add7_mg23828() throws Exception {
        DomContent[] __DSPOT_children_17 = new DomContent[]{  };
        boolean __DSPOT_condition_16 = true;
        String expectedCss = "<style>body{background:#daa520;margin-bottom:10px;margin-left:10px;margin-right:10px;margin-top:10px}</style>";
        String expectedJs = "<script>(function(){var test=5;var tast=10;var testTast=test+tast;console.log(testTast);})();</script>";
        String expectedHtml = (((("<body>" + (InlineStaticResourceTest.EOL)) + "    Any content") + (InlineStaticResourceTest.EOL)) + "</body>") + (InlineStaticResourceTest.EOL);
        Assert.assertEquals("<body>\n    Any content\n</body>\n", expectedHtml);
        String expectedEscapedHtml = (((("&lt;body&gt;" + (InlineStaticResourceTest.EOL)) + "    Any content") + (InlineStaticResourceTest.EOL)) + "&lt;/body&gt;") + (InlineStaticResourceTest.EOL);
        Assert.assertEquals("&lt;body&gt;\n    Any content\n&lt;/body&gt;\n", expectedEscapedHtml);
        String expectedAnyContent = "public class AnyContent{}" + (InlineStaticResourceTest.EOL);
        Assert.assertEquals("public class AnyContent{}\n", expectedAnyContent);
        MatcherAssert.assertThat(TagCreator.styleWithInlineFile_min("/test.css").render(), Matchers.is(expectedCss));
        ContainerTag o_testAllTags_add7__11 = TagCreator.styleWithInlineFile_min("/test-without-trailing-semis.css");
        Assert.assertEquals(1, ((int) (((ContainerTag) (o_testAllTags_add7__11)).getNumChildren())));
        Assert.assertEquals("style", ((ContainerTag) (o_testAllTags_add7__11)).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isHidden())).getTagName());
        MatcherAssert.assertThat(TagCreator.styleWithInlineFile_min("/test-without-trailing-semis.css").render(), Matchers.is(expectedCss));
        MatcherAssert.assertThat(TagCreator.scriptWithInlineFile_min("/test.js").render(), Matchers.is(expectedJs));
        MatcherAssert.assertThat(TagCreator.fileAsString("/test.html").render(), Matchers.is(expectedHtml));
        MatcherAssert.assertThat(TagCreator.fileAsEscapedString("/test.html").render(), Matchers.is(expectedEscapedHtml));
        MatcherAssert.assertThat(TagCreator.fileAsString("/AnyContent.java").render(), Matchers.is(expectedAnyContent));
        MatcherAssert.assertThat(TagCreator.styleWithInlineFile_min("src/test/files/test.css").render(), Matchers.is(expectedCss));
        MatcherAssert.assertThat(TagCreator.scriptWithInlineFile_min("src/test/files/test.js").render(), Matchers.is(expectedJs));
        MatcherAssert.assertThat(TagCreator.fileAsString("src/test/files/test.html").render(), Matchers.is(expectedHtml));
        MatcherAssert.assertThat(TagCreator.fileAsEscapedString("src/test/files/test.html").render(), Matchers.is(expectedEscapedHtml));
        MatcherAssert.assertThat(TagCreator.fileAsString("src/test/files/AnyContent.java").render(), Matchers.is(expectedAnyContent));
        ContainerTag o_testAllTags_add7_mg23828__57 = o_testAllTags_add7__11.condWith(__DSPOT_condition_16, __DSPOT_children_17);
        Assert.assertEquals(1, ((int) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).getNumChildren())));
        Assert.assertEquals("style", ((ContainerTag) (o_testAllTags_add7_mg23828__57)).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7_mg23828__57)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals("<body>\n    Any content\n</body>\n", expectedHtml);
        Assert.assertEquals("&lt;body&gt;\n    Any content\n&lt;/body&gt;\n", expectedEscapedHtml);
        Assert.assertEquals("public class AnyContent{}\n", expectedAnyContent);
        Assert.assertEquals(1, ((int) (((ContainerTag) (o_testAllTags_add7__11)).getNumChildren())));
        Assert.assertEquals("style", ((ContainerTag) (o_testAllTags_add7__11)).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("style", ((Tag) (((Tag) (((ContainerTag) (o_testAllTags_add7__11)).isHidden())).isHidden())).getTagName());
    }
}

