package org.owasp.html;


import junit.framework.TestCase;
import org.junit.Test;
import org.owasp.html.examples.EbayPolicyExample;


@SuppressWarnings("javadoc")
public class ExamplesTest extends TestCase {
    @Test
    public static final void testTextAllowedInLinks_literalMutationString4() throws Exception {
        String input = "<a href=\"../good.*tml\">click here</a>";
        String sanitized = EbayPolicyExample.POLICY_DEFINITION.sanitize(input);
        TestCase.assertEquals("click here", sanitized);
    }
}

