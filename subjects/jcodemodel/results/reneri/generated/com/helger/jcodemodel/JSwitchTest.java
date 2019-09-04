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
 * {@link JSwitch} tests.
 *
 * @author Philip Helger
 */
public final class JSwitchTest {
    @org.junit.Test
    public void testGenerate() throws com.helger.jcodemodel.JClassAlreadyExistsException {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass c2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("myPackage"))._class("SwitchTest"));
        final com.helger.jcodemodel.JDefinedClass jEnumClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|5", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|4", com.helger.jcodemodel.JDefinedClass.class, c2)._enum("MyEnum"));
        final com.helger.jcodemodel.JEnumConstant ca = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|7", com.helger.jcodemodel.JEnumConstant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|6", com.helger.jcodemodel.JDefinedClass.class, jEnumClass).enumConstant("A"));
        final com.helger.jcodemodel.JEnumConstant cb = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|9", com.helger.jcodemodel.JEnumConstant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|8", com.helger.jcodemodel.JDefinedClass.class, jEnumClass).enumConstant("B"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|11", com.helger.jcodemodel.JEnumConstant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|10", com.helger.jcodemodel.JDefinedClass.class, jEnumClass).enumConstant("C"));
        final com.helger.jcodemodel.JMethod m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|15", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|12", com.helger.jcodemodel.JDefinedClass.class, c2).method(0, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|14", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|13", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "dummy"));
        final com.helger.jcodemodel.JVar p = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|18", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|16", com.helger.jcodemodel.JMethod.class, m).param(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|17", com.helger.jcodemodel.JDefinedClass.class, jEnumClass), "enumParam"));
        final com.helger.jcodemodel.JSwitch s = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSwitch>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|22", com.helger.jcodemodel.JSwitch.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|20", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|19", com.helger.jcodemodel.JMethod.class, m).body())._switch(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|21", com.helger.jcodemodel.JVar.class, p)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBreak>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|27", com.helger.jcodemodel.JBreak.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|26", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCase>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|25", com.helger.jcodemodel.JCase.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSwitch>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|23", com.helger.jcodemodel.JSwitch.class, s)._case(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|24", com.helger.jcodemodel.JEnumConstant.class, ca))).body())._break());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBreak>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|32", com.helger.jcodemodel.JBreak.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|31", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCase>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|30", com.helger.jcodemodel.JCase.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSwitch>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|28", com.helger.jcodemodel.JSwitch.class, s)._case(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|29", com.helger.jcodemodel.JEnumConstant.class, cb))).body())._break());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBreak>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|36", com.helger.jcodemodel.JBreak.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|35", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCase>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|34", com.helger.jcodemodel.JCase.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JSwitch>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|33", com.helger.jcodemodel.JSwitch.class, s)._default()).body())._break());
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JSwitchTest|testGenerate()|37", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

