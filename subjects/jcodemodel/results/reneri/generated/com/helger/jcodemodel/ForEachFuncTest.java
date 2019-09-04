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
 * Simple program to test the generation of the enhanced for loop in jdk 1.5
 *
 * @author Bhakti Mehta Bhakti.Mehta@sun.com
 */
public final class ForEachFuncTest {
    @org.junit.Test
    public void testBasic() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass cls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("Test"));
        final com.helger.jcodemodel.JMethod m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|6", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|3", com.helger.jcodemodel.JDefinedClass.class, cls).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|5", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|4", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "foo"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|11", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|8", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|7", com.helger.jcodemodel.JMethod.class, m).body()).decl(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|10", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|9", com.helger.jcodemodel.JCodeModel.class, cm).INT), "getCount"));
        // This is not exactly right because we need to
        // support generics
        final com.helger.jcodemodel.AbstractJClass arrayListclass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|13", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|12", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.util.ArrayList.class));
        final com.helger.jcodemodel.JVar $list = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|19", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|15", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|14", com.helger.jcodemodel.JMethod.class, m).body()).decl(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|16", com.helger.jcodemodel.AbstractJClass.class, arrayListclass), "alist", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|18", com.helger.jcodemodel.JInvocation.class, com.helger.jcodemodel.JExpr._new(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|17", com.helger.jcodemodel.AbstractJClass.class, arrayListclass)))));
        final com.helger.jcodemodel.AbstractJClass $integerclass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|21", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|20", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.Integer.class));
        final com.helger.jcodemodel.JForEach foreach = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForEach>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|26", com.helger.jcodemodel.JForEach.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|23", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|22", com.helger.jcodemodel.JMethod.class, m).body()).forEach(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|24", com.helger.jcodemodel.AbstractJClass.class, $integerclass), "count", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|25", com.helger.jcodemodel.JVar.class, $list)));
        final com.helger.jcodemodel.JVar $count1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|28", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForEach>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|27", com.helger.jcodemodel.JForEach.class, foreach).var());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|33", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|30", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForEach>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|29", com.helger.jcodemodel.JForEach.class, foreach).body()).assign(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|31", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref("getCount")), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomInt>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|32", com.helger.jcodemodel.JAtomInt.class, com.helger.jcodemodel.JExpr.lit(10))));
        // printing out the variable
        final com.helger.jcodemodel.JFieldRef out1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|36", com.helger.jcodemodel.JFieldRef.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|35", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|34", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.System.class)).staticRef("out"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|43", com.helger.jcodemodel.JBlock.class, // JInvocation invocation =
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|38", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForEach>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|37", com.helger.jcodemodel.JForEach.class, foreach).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|42", com.helger.jcodemodel.JInvocation.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|40", com.helger.jcodemodel.JInvocation.class, com.helger.jcodemodel.JExpr.invoke(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|39", com.helger.jcodemodel.JFieldRef.class, out1), "println")).arg(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|41", com.helger.jcodemodel.JVar.class, $count1)))));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.ForEachFuncTest|testBasic()|44", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

