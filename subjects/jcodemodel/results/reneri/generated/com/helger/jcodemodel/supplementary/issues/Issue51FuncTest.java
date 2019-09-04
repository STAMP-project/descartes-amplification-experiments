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
 * Test for https://github.com/phax/jcodemodel/issues/51
 *
 * @author Philip Helger
 */
public final class Issue51FuncTest {
    @org.junit.Test
    public void testDefaultMethod() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel generator = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass aInterface = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|1", com.helger.jcodemodel.JCodeModel.class, generator)._package("issue51"))._class("Test"));
        com.helger.jcodemodel.JMethod m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|7", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|4", com.helger.jcodemodel.JDefinedClass.class, aInterface).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|6", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|5", com.helger.jcodemodel.JCodeModel.class, generator).ref(java.net.URI.class)), "noURI"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JReturn>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|11", com.helger.jcodemodel.JReturn.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|9", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|8", com.helger.jcodemodel.JMethod.class, m).body())._return(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtom>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|10", com.helger.jcodemodel.JAtom.class, com.helger.jcodemodel.JExpr._null())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|15", com.helger.jcodemodel.JMethod.class, (m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|12", com.helger.jcodemodel.JDefinedClass.class, aInterface).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|14", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|13", com.helger.jcodemodel.JCodeModel.class, generator).ref(java.net.URL.class)), "noURL")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JReturn>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|19", com.helger.jcodemodel.JReturn.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|17", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|16", com.helger.jcodemodel.JMethod.class, m).body())._return(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtom>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|18", com.helger.jcodemodel.JAtom.class, com.helger.jcodemodel.JExpr._null())));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|20", com.helger.jcodemodel.JCodeModel.class, generator));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|21", com.helger.jcodemodel.JCodeModel.class, generator).addDontImportClass(java.net.URI.class));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.supplementary.issues.Issue51FuncTest|testDefaultMethod()|23", com.helger.jcodemodel.JCodeModel.class, generator));
    }
}

