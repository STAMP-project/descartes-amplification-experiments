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
 * Test class for class {@link JDefinedClass}.
 *
 * @author Philip Helger
 */
public final class JDefinedClassTest {
    @org.junit.Test
    public void generatesInstanceInit() throws java.lang.Exception {
        /**
         * <pre>
         * /-**
         * * Line 1
         * * Line 2
         * * Line 3
         * *-/
         * package myPackage;
         *
         * class MyClass
         * {
         *   private String myField;
         *
         *   {
         *     this.myField = "myValue";
         *   }
         * }
         * </pre>
         */
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass c = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("myPackage"))._class(0, "MyClass"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|5", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|4", com.helger.jcodemodel.JDefinedClass.class, c).headerComment()).add("Line 1\nLine 2\nLine 3"));
        final com.helger.jcodemodel.JFieldVar myField = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|8", com.helger.jcodemodel.JFieldVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|7", com.helger.jcodemodel.JDefinedClass.class, c).field(com.helger.jcodemodel.JMod.PRIVATE, java.lang.String.class, "myField"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|15", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|10", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|9", com.helger.jcodemodel.JDefinedClass.class, c).instanceInit()).assign(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|13", com.helger.jcodemodel.JFieldRef.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtom>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|11", com.helger.jcodemodel.JAtom.class, com.helger.jcodemodel.JExpr._this()).ref(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|12", com.helger.jcodemodel.JFieldVar.class, myField))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JStringLiteral>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|14", com.helger.jcodemodel.JStringLiteral.class, com.helger.jcodemodel.JExpr.lit("myValue"))));
        final com.github.javaparser.ast.CompilationUnit aCU = eu.stamp_project.reneri.instrumentation.StateObserver.<com.github.javaparser.ast.CompilationUnit>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|17", com.github.javaparser.ast.CompilationUnit.class, com.helger.jcodemodel.util.CodeModelTestsHelper.parseAndGetSingleClassCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|16", com.helger.jcodemodel.JCodeModel.class, cm)));
        final com.github.javaparser.ast.body.TypeDeclaration<?> typeDeclaration = eu.stamp_project.reneri.instrumentation.StateObserver.<com.github.javaparser.ast.CompilationUnit>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|18", com.github.javaparser.ast.CompilationUnit.class, aCU).getTypes().get(0);
        final com.github.javaparser.ast.body.ClassOrInterfaceDeclaration classDeclaration = eu.stamp_project.reneri.instrumentation.StateObserver.<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|19", com.github.javaparser.ast.body.ClassOrInterfaceDeclaration.class, ((com.github.javaparser.ast.body.ClassOrInterfaceDeclaration) (typeDeclaration)));
        final com.github.javaparser.ast.body.InitializerDeclaration initializerDeclaration = eu.stamp_project.reneri.instrumentation.StateObserver.<com.github.javaparser.ast.body.InitializerDeclaration>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|21", com.github.javaparser.ast.body.InitializerDeclaration.class, ((com.github.javaparser.ast.body.InitializerDeclaration) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|20", com.github.javaparser.ast.body.ClassOrInterfaceDeclaration.class, classDeclaration).getMembers().get(1))));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.github.javaparser.ast.body.InitializerDeclaration>observeState("com.helger.jcodemodel.JDefinedClassTest|generatesInstanceInit()|22", com.github.javaparser.ast.body.InitializerDeclaration.class, initializerDeclaration));
    }

    @org.junit.Test
    public void testCallSuper() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        // Base class
        final com.helger.jcodemodel.JDefinedClass c1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("myPackage"))._class(0, "BaseClass"));
        final com.helger.jcodemodel.JMethod con1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|5", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|4", com.helger.jcodemodel.JDefinedClass.class, c1).constructor(com.helger.jcodemodel.JMod.PUBLIC));
        final com.helger.jcodemodel.JVar p1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|9", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|6", com.helger.jcodemodel.JMethod.class, con1).param(com.helger.jcodemodel.JMod.FINAL, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|8", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|7", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.String.class)), "str"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|20", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|11", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|10", com.helger.jcodemodel.JMethod.class, con1).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|19", com.helger.jcodemodel.JInvocation.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|15", com.helger.jcodemodel.JInvocation.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|14", com.helger.jcodemodel.JFieldRef.class, new com.helger.jcodemodel.JFieldRef(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|13", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|12", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.System.class)), "out")).invoke("println")).arg(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJExpression>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|18", com.helger.jcodemodel.IJExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JStringLiteral>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|16", com.helger.jcodemodel.JStringLiteral.class, com.helger.jcodemodel.JExpr.lit("Got ")).plus(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|17", com.helger.jcodemodel.JVar.class, p1)))))));
        // Derived class
        final com.helger.jcodemodel.JDefinedClass c2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|23", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|22", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|21", com.helger.jcodemodel.JCodeModel.class, cm)._package("myPackage"))._class(0, "DerivedClass"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|26", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|24", com.helger.jcodemodel.JDefinedClass.class, c2)._extends(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|25", com.helger.jcodemodel.JDefinedClass.class, c1)));
        final com.helger.jcodemodel.JMethod con2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|28", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|27", com.helger.jcodemodel.JDefinedClass.class, c2).constructor(com.helger.jcodemodel.JMod.PUBLIC));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|33", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|30", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|29", com.helger.jcodemodel.JMethod.class, con2).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|32", com.helger.jcodemodel.JInvocation.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|31", com.helger.jcodemodel.JInvocation.class, com.helger.jcodemodel.JExpr.invokeSuper()).arg("Test"))));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JDefinedClassTest|testCallSuper()|34", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

