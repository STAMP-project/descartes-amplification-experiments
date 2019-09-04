/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 * Portions Copyright 2013-2018 Philip Helger + contributors
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.helger.jcodemodel;


/**
 * {@link JSynchronizedBlock} tests.
 *
 * @author Philip Helger
 */
public final class JSynchronizedBlockTest {
    private static final java.lang.String CRLF = com.helger.jcodemodel.writer.JCMWriter.getDefaultNewLine();

    @org.junit.Test
    public void testBasic() {
        org.junit.Assert.assertEquals(((("synchronized (a)" + (com.helger.jcodemodel.JSynchronizedBlockTest.CRLF)) + "{}") + (com.helger.jcodemodel.JSynchronizedBlockTest.CRLF)), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|2", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSynchronizedBlock>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|1", com.helger.jcodemodel.JSynchronizedBlock.class, new com.helger.jcodemodel.JSynchronizedBlock(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|0", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref("a")))))));
        final com.helger.jcodemodel.JSynchronizedBlock aSB = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSynchronizedBlock>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|4", com.helger.jcodemodel.JSynchronizedBlock.class, new com.helger.jcodemodel.JSynchronizedBlock(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|3", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref("abc"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|9", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|6", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSynchronizedBlock>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|5", com.helger.jcodemodel.JSynchronizedBlock.class, aSB).body()).assign(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|7", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref("x")), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|8", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref("y"))));
        org.junit.Assert.assertEquals((((((((("synchronized (abc)" + (com.helger.jcodemodel.JSynchronizedBlockTest.CRLF)) + "{") + (com.helger.jcodemodel.JSynchronizedBlockTest.CRLF)) + (com.helger.jcodemodel.writer.JCMWriter.DEFAULT_INDENT_STRING)) + "x = y;") + (com.helger.jcodemodel.JSynchronizedBlockTest.CRLF)) + "}") + (com.helger.jcodemodel.JSynchronizedBlockTest.CRLF)), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|11", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSynchronizedBlock>observeState("com.helger.jcodemodel.JSynchronizedBlockTest|testBasic()|10", com.helger.jcodemodel.JSynchronizedBlock.class, aSB))));
    }
}

