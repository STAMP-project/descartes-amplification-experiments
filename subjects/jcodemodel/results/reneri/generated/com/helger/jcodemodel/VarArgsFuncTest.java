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
 * Simple program to test the generation of the varargs feature in jdk 1.5
 *
 * @author Bhakti Mehta Bhakti.Mehta@sun.com
 */
/* ====================================================== This is how the output
from this program looks like Still need to learn how to work on instantiation
and args ========================================================= public
class Test { public void foo(java.lang.String param1, java.lang.Integer
param2, java.lang.String param5, java.lang.Object... param3) { for (int count
= 0; (count<(param3.length)); count ++) {
java.lang.System.out.println((param3[count])); } } public static void
main(java.lang.String[] args) { } }
==========================================================
 */
public final class VarArgsFuncTest {
    @org.junit.Test
    public void testBasic() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass cls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("Test"));
        final com.helger.jcodemodel.JMethod m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|6", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|3", com.helger.jcodemodel.JDefinedClass.class, cls).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|5", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|4", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "foo"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|8", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|7", com.helger.jcodemodel.JMethod.class, m).param(java.lang.String.class, "param1"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|10", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|9", com.helger.jcodemodel.JMethod.class, m).param(java.lang.Integer.class, "param2"));
        final com.helger.jcodemodel.JVar var = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|12", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|11", com.helger.jcodemodel.JMethod.class, m).varParam(java.lang.Object.class, "param3"));
        if (false)
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|13", java.io.PrintStream.class, java.lang.System.out).println(("First varParam " + (eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|14", com.helger.jcodemodel.JVar.class, var))));

        // checking for param after varParam it behaves ok
        // JVar[] var1 = m.varParam(Float.class, "param4");
        final com.helger.jcodemodel.AbstractJClass string = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|16", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|15", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.String.class));
        final com.helger.jcodemodel.AbstractJClass stringArray = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JArrayClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|18", com.helger.jcodemodel.JArrayClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|17", com.helger.jcodemodel.AbstractJClass.class, string).array());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|20", com.helger.jcodemodel.JVar.class, // JVar param5 =
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|19", com.helger.jcodemodel.JMethod.class, m).param(java.lang.String.class, "param5"));
        final com.helger.jcodemodel.JForLoop forloop = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForLoop>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|23", com.helger.jcodemodel.JForLoop.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|22", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|21", com.helger.jcodemodel.JMethod.class, m).body())._for());
        final com.helger.jcodemodel.JVar jcount = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|28", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForLoop>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|24", com.helger.jcodemodel.JForLoop.class, forloop).init(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|26", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|25", com.helger.jcodemodel.JCodeModel.class, cm).INT), "count", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomInt>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|27", com.helger.jcodemodel.JAtomInt.class, com.helger.jcodemodel.JExpr.lit(0))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForLoop>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|29", com.helger.jcodemodel.JForLoop.class, forloop).test(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJExpression>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|32", com.helger.jcodemodel.IJExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|30", com.helger.jcodemodel.JVar.class, jcount).lt(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJExpression>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|31", com.helger.jcodemodel.IJExpression.class, com.helger.jcodemodel.JExpr.direct("param3.length")))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForLoop>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|33", com.helger.jcodemodel.JForLoop.class, forloop).update(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJExpression>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|35", com.helger.jcodemodel.IJExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|34", com.helger.jcodemodel.JVar.class, jcount).incr()));
        final com.helger.jcodemodel.JFieldRef out = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|38", com.helger.jcodemodel.JFieldRef.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|37", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|36", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.System.class)).staticRef("out"));
        final com.helger.jcodemodel.JVar typearray = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|40", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|39", com.helger.jcodemodel.JMethod.class, m).varParam());
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|41", com.helger.jcodemodel.JVar.class, typearray));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|48", com.helger.jcodemodel.JBlock.class, // JInvocation invocation =
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|43", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JForLoop>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|42", com.helger.jcodemodel.JForLoop.class, forloop).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|47", com.helger.jcodemodel.JInvocation.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|45", com.helger.jcodemodel.JInvocation.class, com.helger.jcodemodel.JExpr.invoke(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|44", com.helger.jcodemodel.JFieldRef.class, out), "println")).arg(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJExpression>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|46", com.helger.jcodemodel.IJExpression.class, com.helger.jcodemodel.JExpr.direct("param3[count]"))))));
        final com.helger.jcodemodel.JMethod main = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|52", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|49", com.helger.jcodemodel.JDefinedClass.class, cls).method(((com.helger.jcodemodel.JMod.PUBLIC) | (com.helger.jcodemodel.JMod.STATIC)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|51", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|50", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "main"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|55", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|53", com.helger.jcodemodel.JMethod.class, main).param(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|54", com.helger.jcodemodel.AbstractJClass.class, stringArray), "args"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJStatement>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|58", com.helger.jcodemodel.IJStatement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|57", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|56", com.helger.jcodemodel.JMethod.class, main).body()).directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));"));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.VarArgsFuncTest|testBasic()|59", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

