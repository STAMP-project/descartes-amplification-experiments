**Class:** `j2html.utils.Part`
**Methods:** `simplifyFontWeights`, `simplifyHexColours`, `simplifyParameters`, `simplifyQuotesAndCaps`
**Transformations:** `void`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| NNNN      | NNNNN       | IIII     |

# Environment

Covered by 1 test class.

## Methods

```Java
public class CSSMin {

    class Property implements Comparable<Property> {
        private Part[] parts;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.property).append(":");
            for (Part p : this.parts) {
                sb.append(p.toString()).append(",");
            }
            sb.deleteCharAt(sb.length() - 1); // Delete the trailing comma.
            sb.append(";");
            if (CSSMin.debugLogging) {
                LOG.info(sb.toString());
            }
            return sb.toString();
        }
    }

    class Part {
        Part(String contents, String property) throws Exception {
            this.contents = " " + contents;
            this.property = property;
            simplify();
        }

        private void simplify() {

            // !important doesn't need to be spaced
            this.contents = this.contents.replaceAll(" !important", "!important");

            // Replace 0in, 0cm, etc. with just 0
            this.contents = this.contents.replaceAll("(\\s)(0)(px|em|%|in|cm|mm|pc|pt|ex)", "$1$2");

            this.contents = this.contents.trim();

            // Simplify multiple zeroes
            if (this.contents.equals("0 0 0 0")) {
                this.contents = "0";
            }
            if (this.contents.equals("0 0 0")) {
                this.contents = "0";
            }
            if (this.contents.equals("0 0")) {
                this.contents = "0";
            }

            // Simplify multiple-parameter properties
            simplifyParameters();

            // Simplify font weights
            simplifyFontWeights();

            // Strip unnecessary quotes from url() and single-word parts, and make as much lowercase as possible.
            simplifyQuotesAndCaps();

            // Simplify colours
            simplifyColourNames();
            simplifyHexColours();
        }

        public String toString() {
            return this.contents;
        }
    }
}


```

## Test

```Java
 @Test
    public void testAllTags() throws Exception {

        String expectedCss = "<style>body{background:#daa520;margin-bottom:10px;margin-left:10px;margin-right:10px;margin-top:10px}</style>";
        String expectedJs = "<script>(function(){var test=5;var tast=10;var testTast=test+tast;console.log(testTast);})();</script>";
        String expectedHtml = "<body>" + EOL + "    Any content" + EOL + "</body>" + EOL;
        String expectedEscapedHtml = "&lt;body&gt;" + EOL + "    Any content" + EOL + "&lt;/body&gt;" + EOL;
        String expectedAnyContent = "public class AnyContent{}" + EOL;

        // classpath files
        assertThat(styleWithInlineFile_min("/test.css").render(), is(expectedCss));
        assertThat(styleWithInlineFile_min("/test-without-trailing-semis.css").render(), is(expectedCss));
        assertThat(scriptWithInlineFile_min("/test.js").render(), is(expectedJs));
        assertThat(fileAsString("/test.html").render(), is(expectedHtml));
        assertThat(fileAsEscapedString("/test.html").render(), is(expectedEscapedHtml));
        assertThat(fileAsString("/AnyContent.java").render(), is(expectedAnyContent));

        // files outside classpath
        assertThat(styleWithInlineFile_min("src/test/files/test.css").render(), is(expectedCss));
        assertThat(scriptWithInlineFile_min("src/test/files/test.js").render(), is(expectedJs));
        assertThat(fileAsString("src/test/files/test.html").render(), is(expectedHtml));
        assertThat(fileAsEscapedString("src/test/files/test.html").render(), is(expectedEscapedHtml));
        assertThat(fileAsString("src/test/files/AnyContent.java").render(), is(expectedAnyContent));
    }

```

## Observations
These methods are covered only by the previous test case.
It seems that the input used in the test requires no simplification. Although 
the methods in question are declared in a deep place inside the code, they could 
be tested, even directly by creating a `Part` instance, which is package visible
and then asserting the `toString` result.