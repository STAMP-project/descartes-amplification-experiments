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
package com.helger.jcodemodel.supplementary.issues;


/**
 * Test for https://github.com/phax/jcodemodel/issues/61
 *
 * @author Flavio Baronti
 */
public class Issue61FuncTest {
    @org.junit.Test
    public void testIssue() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final java.nio.charset.Charset ascii = eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|1", java.nio.charset.Charset.class, java.nio.charset.Charset.forName("US-ASCII"));
        final java.io.ByteArrayOutputStream resOut = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|2", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        final com.helger.jcodemodel.fmt.JTextFile res = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.fmt.JTextFile>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|7", com.helger.jcodemodel.fmt.JTextFile.class, ((com.helger.jcodemodel.fmt.JTextFile) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|4", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|3", com.helger.jcodemodel.JCodeModel.class, cm).rootPackage()).addResourceFile(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.fmt.JTextFile>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|6", com.helger.jcodemodel.fmt.JTextFile.class, new com.helger.jcodemodel.fmt.JTextFile("example.txt", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|5", java.nio.charset.Charset.class, ascii)))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.fmt.JTextFile>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|8", com.helger.jcodemodel.fmt.JTextFile.class, res).setContents("Testing");
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.writer.JCMWriter>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|10", com.helger.jcodemodel.writer.JCMWriter.class, new com.helger.jcodemodel.writer.JCMWriter(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|9", com.helger.jcodemodel.JCodeModel.class, cm))).build(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.writer.SingleStreamCodeWriter>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|12", com.helger.jcodemodel.writer.SingleStreamCodeWriter.class, new com.helger.jcodemodel.writer.SingleStreamCodeWriter(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|11", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream()))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.writer.SingleStreamCodeWriter>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|14", com.helger.jcodemodel.writer.SingleStreamCodeWriter.class, new com.helger.jcodemodel.writer.SingleStreamCodeWriter(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|13", java.io.ByteArrayOutputStream.class, resOut))));
        final java.lang.String txtRes = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.CharBuffer>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|19", java.nio.CharBuffer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|15", java.nio.charset.Charset.class, ascii).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|18", java.nio.ByteBuffer.class, java.nio.ByteBuffer.wrap(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|17", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|16", java.io.ByteArrayOutputStream.class, resOut).toByteArray()))))).toString());
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|22", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.supplementary.issues.Issue61FuncTest|testIssue()|21", txtRes).contains("Testing")));
    }
}

