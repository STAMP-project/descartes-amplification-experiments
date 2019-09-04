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


public final class InnerClassFuncTest {
    @org.junit.Test
    public void innerClassesAreImported() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass aClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("org.test.DaTestClass"));
        final com.helger.jcodemodel.JDefinedClass daInner1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|4", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|3", com.helger.jcodemodel.JDefinedClass.class, aClass)._class("Inner"));
        final com.helger.jcodemodel.JDefinedClass daInnerInner = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|6", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|5", com.helger.jcodemodel.JDefinedClass.class, daInner1)._class("InnerInner"));
        final com.helger.jcodemodel.JDefinedClass daInner2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|8", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|7", com.helger.jcodemodel.JDefinedClass.class, aClass)._class("DaTestClassInner"));
        final com.helger.jcodemodel.JDefinedClass daInner2Inner = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|10", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|9", com.helger.jcodemodel.JDefinedClass.class, daInner2)._class("Inner2"));
        org.junit.Assert.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|11", com.helger.jcodemodel.JDefinedClass.class, daInner2Inner), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|12", com.helger.jcodemodel.JDefinedClass.class, daInner2).getInnerClass("Inner2"));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|13", com.helger.jcodemodel.JDefinedClass.class, daInner2).getInnerClass("Inner3"));
        org.junit.Assert.assertEquals("Inner", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|14", com.helger.jcodemodel.JDefinedClass.class, daInner1).name()));
        org.junit.Assert.assertEquals("org.test.DaTestClass.Inner", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|16", com.helger.jcodemodel.JDefinedClass.class, daInner1).fullName()));
        org.junit.Assert.assertEquals("org.test.DaTestClass$Inner", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|18", com.helger.jcodemodel.JDefinedClass.class, daInner1).binaryName()));
        org.junit.Assert.assertEquals("InnerInner", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|20", com.helger.jcodemodel.JDefinedClass.class, daInnerInner).name()));
        org.junit.Assert.assertEquals("org.test.DaTestClass.Inner.InnerInner", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|22", com.helger.jcodemodel.JDefinedClass.class, daInnerInner).fullName()));
        org.junit.Assert.assertEquals("org.test.DaTestClass$Inner$InnerInner", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|24", com.helger.jcodemodel.JDefinedClass.class, daInnerInner).binaryName()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|28", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|26", com.helger.jcodemodel.JDefinedClass.class, aClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|27", com.helger.jcodemodel.JDefinedClass.class, daInner1), "getInner"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|31", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|29", com.helger.jcodemodel.JDefinedClass.class, aClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|30", com.helger.jcodemodel.JDefinedClass.class, daInnerInner), "getInnerInner"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|34", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|32", com.helger.jcodemodel.JDefinedClass.class, aClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|33", com.helger.jcodemodel.JDefinedClass.class, daInner2), "getInner2"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|37", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|35", com.helger.jcodemodel.JDefinedClass.class, aClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|36", com.helger.jcodemodel.JDefinedClass.class, daInner2Inner), "getInner2Inner"));
        final com.helger.jcodemodel.JDefinedClass otherClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|39", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|38", com.helger.jcodemodel.JCodeModel.class, cm)._class("org.test.OtherClass"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|42", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|40", com.helger.jcodemodel.JDefinedClass.class, otherClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|41", com.helger.jcodemodel.JDefinedClass.class, daInner1), "getInner"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|45", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|43", com.helger.jcodemodel.JDefinedClass.class, otherClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|44", com.helger.jcodemodel.JDefinedClass.class, daInnerInner), "getInnerInner"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|48", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|46", com.helger.jcodemodel.JDefinedClass.class, otherClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|47", com.helger.jcodemodel.JDefinedClass.class, daInner2Inner), "getInner2Inner"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|51", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|49", com.helger.jcodemodel.JDefinedClass.class, otherClass).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|50", com.helger.jcodemodel.JDefinedClass.class, aClass), "getOuter"));
        com.helger.jcodemodel.util.CodeModelTestsHelper.printCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.InnerClassFuncTest|innerClassesAreImported()|52", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

