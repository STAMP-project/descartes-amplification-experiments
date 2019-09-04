/**
 * Copyright (c) 2011, Mike Samuel
 */
/**
 * All rights reserved.
 */
/**
 *
 */
/**
 * Redistribution and use in source and binary forms, with or without
 */
/**
 * modification, are permitted provided that the following conditions
 */
/**
 * are met:
 */
/**
 *
 */
/**
 * Redistributions of source code must retain the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer.
 */
/**
 * Redistributions in binary form must reproduce the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer in the
 */
/**
 * documentation and/or other materials provided with the distribution.
 */
/**
 * Neither the name of the OWASP nor the names of its contributors may
 */
/**
 * be used to endorse or promote products derived from this software
 */
/**
 * without specific prior written permission.
 */
/**
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 */
/**
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 */
/**
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 */
/**
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 */
/**
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 */
/**
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 */
/**
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 */
/**
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 */
/**
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 */
/**
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 */
/**
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 */
/**
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.owasp.html;


@java.lang.SuppressWarnings("javadoc")
public class StylingPolicyTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testNothingToOutput() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "/** no CSS here */");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "/* props: disabled; font-weight: bold */");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "position: fixed");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "background: url('javascript:alert%281337%29')");
    }

    @org.junit.Test
    public static final void testColors() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:red", "color: red");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-color:#f00", "background-color: #f00");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background:#f00", "background: #f00");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:#f00", "color: #F00");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color: #F000");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:#ff0000", "color: #ff0000");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:rgb( 255 , 0 , 0 )", "color: rgb(255, 0, 0)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background:rgb( 100% , 0 , 0 )", "background: rgb(100%, 0, 0)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:rgba( 100% , 0 , 0 , 100% )", "color: RGBA(100%, 0, 0, 100%)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color: transparent");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color: bogus");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color: expression(alert(1337))");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color: 000");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "background-color: 000");
        // Not colors.
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background:url('pic.jpg#sanitized')", "background: \"pic.jpg\"");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background:url('pic.jpg#sanitized')", "background: url(pic.jpg)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color:#urlabc");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "color:#urlabcd");
    }

    @org.junit.Test
    public static final void testFontWeight() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-weight:bold", "font-weight: bold");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:bold", "font: bold");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:bolder", "font: Bolder");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-weight:800", "font-weight: 800");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "font-weight: expression(alert(1337))");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'evil'", "font: 3execute evil");
    }

    @org.junit.Test
    public static final void testFontStyle() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-style:italic", "font-style: Italic");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:italic", "font: italic");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:oblique", "font: Oblique");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "font-style: expression(alert(1337))");
    }

    @org.junit.Test
    public static final void testFontFace() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'arial' , 'helvetica'", "font: Arial, Helvetica");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'arial' , 'helvetica' , sans-serif", "Font-family: Arial, Helvetica, sans-serif");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'monospace' , sans-serif", "Font-family: \"Monospace\", Sans-serif");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'arial bold' , 'helvetica' , monospace", "FONT: \"Arial Bold\", Helvetica, monospace");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'arial bold' , 'helvetica'", "font-family: \"Arial Bold\", Helvetica");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'arial bold' , 'helvetica'", "font-family: 'Arial Bold', Helvetica");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'evil'", "font-family: 3execute evil");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'arial bold' , , , 'helvetica' , sans-serif", "font-family: \'Arial Bold\',,\"\",Helvetica,sans-serif");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'chalkboardse-light' , 'helvetica' , monospace", "FONT: \"ChalkboardSE-Light\", Helvetica, monospace");
    }

    @org.junit.Test
    public static final void testFont() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'arial' 12pt bold oblique", "font: Arial 12pt bold oblique");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'times new roman' 24px bolder", "font: \"Times New Roman\" 24px bolder");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:24px", "font: 24px");
        // Non-ascii characters discarded.
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "font: 24ex\\pression");
        // Harmless garbage.
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:24ex 'pression'", "font: 24ex\u0000pression");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "font: expression(arial)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "font: rgb(\"expression(alert(1337))//\")");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-size:smaller", "font-size: smaller");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:smaller", "font: smaller");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font:'chalkboardse-light'", "font: 'ChalkboardSE-Light'");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "font: '---");
    }

    @org.junit.Test
    public static final void testBidiAndAlignmentAttributes() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("text-align:left;unicode-bidi:embed;direction:ltr", "Text-align: left; Unicode-bidi: Embed; Direction: LTR;");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "text-align:expression(left())");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "text-align: bogus");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("unicode-bidi:embed", "unicode-bidi:embed");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "unicode-bidi:expression(embed)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "unicode-bidi:bogus");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "direction:expression(ltr())");
    }

    @org.junit.Test
    public static final void testTextDecoration() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("text-decoration:underline", "Text-Decoration: Underline");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("text-decoration:overline", "text-decoration: overline");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("text-decoration:line-through", "text-decoration: line-through");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "text-decoration: expression(document.location=42)");
    }

    @org.junit.Test
    public static final void testBoxProperties() {
        // http://www.w3.org/TR/CSS2/box.html
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("height:0", "height:0");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("width:0", "width:0");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("width:20px", "width:20px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("width:20", "width:20");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("width:100%", "width:100%");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("height:6in", "height:6in");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "width:-20");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "width:url('foo')");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, "height:6fixed");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:2 2 2 2", "margin:2 2 2 2");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:2 2 2", "margin:2 2 2");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("padding:2 2", "padding:2 2");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:2", "margin:2");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:2px 4px 6px 8px", "margin:2px 4px 6px 8px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("padding:0 4px 6px", "padding:0 4px 6px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:2px 4px 6px 4px", "margin:2px 4px 6px 4px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:0 4px", "margin:0 4px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:0 4px", "margin:0 4 px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("padding-left:4px", "padding-left:4px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("padding-left:0.4em;padding-top:2px;margin-bottom:3px", "padding-left:0.4em;padding-top:2px;margin-bottom:3px");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("padding:0 1em 0.5in 1.5cm", "padding:00. 1EM +00.5 In 1.50cm");
        // Mixed.
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("margin:1em;margin-top:0.25em", "margin:1em; margin-top:.25em");
    }

    @org.junit.Test
    public static final void testLongUrls() {
        // Test that a long URL does not blow out the stack or consume quadratic
        // amounts of processor as when the CSS lexer was implemented as a bunch of
        // regular expressions.
        java.lang.String longUrl = "" + ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("background-image:url(data:image/gif;base64," + "R0lGODlhMgCaAPf/AO5ZOuRpTfXSyvro5Pz08uCEb+ShkeummPOMdPOqmdZdQvbEud1") + "UNuqmlvqbhchNMfnTyvXPxu6pmtFkTeJ6Y9JxXPR8YNRSNvyunP3Mwd1zW+iCau9dPt") + "BOMe69sutwVPGGbuFcPvmRefqAZuhiQ/rJv9pFJf3h2up0WttCItmBbv3r5/26q/bc1") + "v3XzvHOx8tML/nf2cpAI+hfQf3GufVbOvyrmvCkk/7r5vnm4t+BbPism/apmN9DI+hN") + "LrkrD/x4V98+HeFBIPt0U/x2VflaOfdwT/lzUvhYN/p2VfhWNd47Gvx5WPtyUflcO+J") + "EI/VsS/FjQvRpSPtwT/tuTebm5vpmRfppSPlePeRIJ8XFxdRQNPpsS8I9IYyMjOhQL+") + "xYN+ZMK/liQflgP+1dO+pUM//188RBJZGRkff39/718vFZOcA/JtVXO8VEKPvVzeuhk") + "Pynk/ermsdHK/7Yz/ehjvi2p9Z4ZPre2NRDJPVkRPzz8d9NLdR1YNM2F/SkksBBKOdX") + "OfaHbdhsVPFbO81cQs1UOO2HcPNTM/708dd7Zt1GJuFRMd1JKfBiQvyNcuF1XfqOd+6") + "gj+SDbPuJb/re1/TUzeReP+mHce1zWeOdjthYPOaSgO2LdOyllPFzWPezpPe7rfVzVO") + "6Hb/vz8f7f2eGJdOKMee54XeBiR/Z5XeNlSfyVfPJtT++ikf7i3POrnPGun9+VhOVSM") + "vzo499/as1EJup5YPvUy+abi+tjRPNrS91aPfCCafyxn/SCaNVZPeu7r+B+ad1WOOuy") + "pOm3rPt6W/OikPvq5vCmlt6Qf/ygivp2V/OTfPrb1eKfkP7Z0OyBaeibiuieju+ciu2") + "ejeKCbOatn+2YhOFVN+eRfedWNvWplvLRyuF4Xs5kTdlOL+3Eu+1mR/zp5fzq5dVMLt") + "JTOPvDtvKgjvy1pe9yVchFKeafj+WYh/nBs/HIvv3Ctd9YONdVOM5BI8pXP/jUzOqKd") + "OiMd9toUN1iSONuU8HBwYmJifX19f///////yH/C1hNUCBEYXRhWE1QPD94cGFja2V0") + "IGJlZ2luPSLvu78iIGlkPSJXNU0wTXBDZWhpSHpyZVN6TlRjemtjOWQiPz4gPHg6eG1") + "wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iQWRvYmUgWE1QIE") + "NvcmUgNS4wLWMwNjEgNjQuMTQwOTQ5LCAyMDEwLzEyLzA3LTEwOjU3OjAxICAgICAgI") + "CAiPiA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIv") + "MjItcmRmLXN5bnRheC1ucyMiPiA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIiB") + "4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbn") + "M6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZ") + "VJlZiMiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1w") + "TU06T3JpZ2luYWxEb2N1bWVudElEPSJ4bXAuZGlkOkEyRDgxODE2MkMyMDY4MTE4NzF") + "GRDNDMzU5QkE3OTE3IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOkMzMjA1M0I4Qk") + "M4RjExRTBCRDBEQkE0MTlGMTc4MDZGIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkO") + "jlFQzFFMTZFQkM4RDExRTBCRDBEQkE0MTlGMTc4MDZGIiB4bXA6Q3JlYXRvclRvb2w9") + "IkFkb2JlIFBob3Rvc2hvcCBDUzUuMSBNYWNpbnRvc2giPiA8eG1wTU06RGVyaXZlZEZ") + "yb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpDMjFGMUIwQjMyMjA2ODExODcxRk") + "QzQzM1OUJBNzkxNyIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpBMkQ4MTgxNjJDM") + "jA2ODExODcxRkQzQzM1OUJBNzkxNyIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6") + "UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PgH//v38+/r5+Pf29fT") + "z8vHw7+7t7Ovq6ejn5uXk4+Lh4N/e3dzb2tnY19bV1NPS0dDPzs3My8rJyMfGxcTDws") + "HAv769vLu6ubi3trW0s7KxsK+urayrqqmop6alpKOioaCfnp2cm5qZmJeWlZSTkpGQj") + "46NjIuKiYiHhoWEg4KBgH9+fXx7enl4d3Z1dHNycXBvbm1sa2ppaGdmZWRjYmFgX15d") + "XFtaWVhXVlVUU1JRUE9OTUxLSklIR0ZFRENCQUA/Pj08Ozo5ODc2NTQzMjEwLy4tLCs") + "qKSgnJiUkIyIhIB8eHRwbGhkYFxYVFBMSERAPDg0MCwoJCAcGBQQDAgEAACH5BAEAAP") + "8ALAAAAAAyAJoAAAj/AP+h8EGwoMGDCBMqXOgDxb8ZUphInEixosWLGDMykTLDB5CPI") + "EOKHEmypEmQBImoXMmypcuXMGOuJDikps2bOHPq3MnTJsEmQJv4G0rUX9CjSJMqXXqU") + "4JSnRaM+nWKMxtBXy6Y8gvZoqtevYL8SpEK2KJWiCsjSMIPNlCUC6lj5u7eLrN27ePO") + "SJcilb1EuaPvSQaZBnAUJGkT487DCTBwulOj4M8OCSxw6vvwxYzH5cV8uBK+IHiq69F") + "Bgoh0MPcHCAgnF7+zFIKArw4kAufxFw+AvBixiODo18IeqNEEryItaKdoGuRUEHgj4I") + "6Aqkr8CIeT422QF0wEX13f4/xvEi1y9A9ob6EF+PDnR5USbW8EQydElaf4aWC/giHcb") + "eGbYkcB12rWhhxkCSJBAAgXMwJ4PYkQYVVEXRIgDHp+IMYI/7Rzijw4c2ODPBf4kIw8") + "1H/IwohgZCJDKBxAcwkGEBI1h4xgTjniBjSMMQBQuF4DwYYgjpuMPBKX4c4qKO44wzl") + "AlDMOBjQRhYaWVW2Sp5RZXYkEIJLUosAUDWACwBQBYBMLlLfgwwMCZalr5pQZbZHMlQ") + "U7kqeeefOq5BgA19LnnGoEK6sQaa+xJUBGMNuroo5BGKumkjRKExKWYZqrpppx26imm") + "PsyAiBKklmrqqaimquqqSiAyw0MMxf8q66yv/lPID7jmquuuvPbq668/FPIPGyGcZOy") + "xyIbAxg9JNOvss9BGK+201DqL6xHYZqvtttx26+232eJqxLjklmvuueimqy65uELhLh") + "Q5vivvvPTWa6+8uEqhb45D6SuFKOes5oAUgrggiL8IJ6xwwrhG4bBZRRnisDtqaKNCN") + "wQEgMB1Mzjs8ccgh+xwww8TBRhREkfxxgCDXIJCA4NsHAw5atQRxS9v+KOGHVHU8YZ4") + "rdihs80e40rG0aSVdsVQDxzdzFB4gPLBMKP4E441LewRTwmVKCCLP95w408LnlwzziQ") + "G+KPP0WTgCsbbyhUFw9tgbFAMKf7s8YGQimz/cYM/cwtjAAT+KPL3BB0MIIABfz+zzd") + "u4liF53ETNIfkfvTBSjjL+aBKNP3cw8oc/c4SSSCxwgO4K6bMk8gI7cMBxBziS4/rF7") + "fz648bttLSwyheZ+KMMBf70wccxuvszzTqcFC+J7l8s8II5+URAAR+34xrG9mHkeMYZ") + "23+QA1ERnEF8H42g488ZsPgTgTP+qFDN+mGIP9QCtjSyPa5Z9N9/FwAMYBf8l4VFTKA") + "CD+iCDLJggi6YIAt5GCA+6CEDGTgwgv0z4De6MA//4eoJIAyhCEcYwhSkoAckFOEJUw") + "hCE4oQV0KIoQxnSMMa2vCGOJQhroLAwx768IdADKIQ/4fYwx8Awg9LSKISl8jEJjrxi") + "VBcgh8AMSxgWfGKWGTDP/6hhX148YtgDKMYx0jGMu5DC1zsR+7WyMY2FqUfXXSjHOc4") + "IS/S8Y5ztCMe97hGPfLxj1HxIyAHKchB/rGQhtwjIhN5x0UyMo/7eOQhIylJRVKyko2") + "8JCYhuclMdpKOjvxkjkIpykBqspS5IyUqh6LKVbYSla8sZSxFOctP1rKTt9xkLjG5y0") + "r2UpJnTMMqc5cGNHbRjGVU4xuRSUY0bvGZ0IymNLe4D2X6ox/7mKY2t8lNblbzmtnsp") + "jjHuc1IhpOc6EznP86pzmiigR/wjKc850nPetrznvxAwz+8UP+FfvjznwANqEAHStCC") + "9qMKXuCHQRfK0Ib6E54OjahE/wnRiVqUoRW9qEYHmtGNevShCv2oSDsqUo2StKQWPSl") + "KJarSlTq0pS7FaEhjOlGY0rSgNr0pR2eq04bmtKcA/SlQQTpUn/K0qAQV6lCVClSm9t") + "SpOoXqTaVKU6rG1KouxepKtYpSfvATqQVF6D7xic9+ArQKZLWnF9oZTX6Y9aD8YKtc2") + "9pPtM71rs90a1zxyte98vWZx2SmYL/oTHRqwZqPhGM6T/lIdoqTsYx0bDchm0jJehOX") + "i8UsOb+py80i1pfj5KxmvflZXoa2tMD0rC3RKVrQsna0oYXtY2U7WdplclMLwqxkMdU") + "Z2MEKtrDofGdahytPfabzqzEVKzqPutV0Mrerzo1qdKc63aou961XJadbnzrO7XK3m9") + "79Lnixa93ukjer15XuctWrXfZ2173ifG5J/TpO5LpUuehMKHH3u1ZxBgQAOw==);");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|testLongUrls()|0", longUrl));
    }

    @org.junit.Test
    public static final void testUrls() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-image:url('foo.gif#sanitized')", "background-image: \"foo.gif\"");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-image:url('foo.gif#sanitized')", "background-image: 'foo.gif'");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-image:url('foo.gif#sanitized')", "background-image:url(foo.gif)");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-image:url('foo.gif#sanitized')", "background-image : url( foo.gif )");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-image:url('foo.gif#sanitized')", "background-image: url('foo.gif')");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("background-image:url('foo.gif#sanitized')", "background-image: URL( \"foo.gif\" )");
    }

    @org.junit.Test
    public static final void testImportant() {
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:blue !important", "color:blue !important");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:red !important", "color:red ! IMPORTANT");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("color:purple", "color:purple !foo(bar) important");
    }

    @org.junit.Test
    public static final void testCdoCdc() {
        // No <!-- or --> in output.
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'a--' 'b'", "font-family: a--\\>b");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'a' '--b'", "font-family: a<\\!--b");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'a--' 'b'", "font-family: a-->b");
        org.owasp.html.StylingPolicyTest.assertSanitizedCss("font-family:'a b'", "font-family: a<!--b");
    }

    private static void assertSanitizedCss(@javax.annotation.Nullable
    java.lang.String expectedCss, java.lang.String css) {
        org.owasp.html.StylingPolicy stylingPolicy = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.StylingPolicy>observeState("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|7", org.owasp.html.StylingPolicy.class, new org.owasp.html.StylingPolicy(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|0", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.DEFAULT), new com.google.common.base.Function<java.lang.String, java.lang.String>() {
            public java.lang.String apply(java.lang.String url) {
                java.lang.String safeUrl = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.StandardUrlAttributePolicy>observeState("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|2", org.owasp.html.StandardUrlAttributePolicy.class, org.owasp.html.StandardUrlAttributePolicy.INSTANCE).apply("img", "src", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|3", url)));
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|5", safeUrl)) != null) {
                    return (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|6", safeUrl)) + "#sanitized";
                }
                return null;
            }
        }));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|8", expectedCss), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.StylingPolicy>observeState("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|9", org.owasp.html.StylingPolicy.class, stylingPolicy).sanitizeCssProperties(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.StylingPolicyTest|assertSanitizedCss(java.lang.String,java.lang.String)|10", css))));
    }
}

