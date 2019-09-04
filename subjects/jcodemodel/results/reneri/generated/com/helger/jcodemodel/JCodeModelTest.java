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
 *
 *
 * @author Kohsuke Kawaguchi
 * @author Philip Helger
 */
public final class JCodeModelTest {
    @org.junit.Test
    public void testParseArray() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJType>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|2", com.helger.jcodemodel.AbstractJType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|1", com.helger.jcodemodel.JCodeModel.class, cm).parseType("java.util.ArrayList<java.lang.String[]>[]")));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJType>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|4", com.helger.jcodemodel.AbstractJType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|3", com.helger.jcodemodel.JCodeModel.class, cm).parseType("java.util.ArrayList<java.util.ArrayList<java.util.ArrayList<java.lang.String[]>[]>[]>[]")));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJType>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|6", com.helger.jcodemodel.AbstractJType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testParseArray()|5", com.helger.jcodemodel.JCodeModel.class, cm).parseType("java.util.Comparator<? super java.lang.CharSequence[]>[]")));
    }

    @org.junit.Test
    public void testIssue28() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass aEnumClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("com.helger.issue28"))._enum("DummyEnum"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|12", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|8", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|7", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|6", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|5", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|4", com.helger.jcodemodel.JCodeModel.class, cm)._package("com.helger.issue28.other"))._class("Class")).constructor(com.helger.jcodemodel.JMod.PUBLIC)).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|11", com.helger.jcodemodel.JInvocation.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstantRef>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|10", com.helger.jcodemodel.JEnumConstantRef.class, com.helger.jcodemodel.JExpr.enumConstantRef(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|9", com.helger.jcodemodel.JDefinedClass.class, aEnumClass), "CONSTANT")).invoke("toString"))));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testIssue28()|13", com.helger.jcodemodel.JCodeModel.class, cm));
    }

    @org.junit.Test
    public void testRefClass() {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testRefClass()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        org.junit.Assert.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.JCodeModelTest|testRefClass()|2", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testRefClass()|1", com.helger.jcodemodel.JCodeModel.class, cm).INT), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJType>observeState("com.helger.jcodemodel.JCodeModelTest|testRefClass()|4", com.helger.jcodemodel.AbstractJType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testRefClass()|3", com.helger.jcodemodel.JCodeModel.class, cm)._ref(int.class)));
    }

    @org.junit.Test
    public void testCODEMODEL24() throws com.helger.jcodemodel.JClassAlreadyExistsException {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass jClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("dummy", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.EClassType>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|2", com.helger.jcodemodel.EClassType.class, com.helger.jcodemodel.EClassType.INTERFACE)));
        org.junit.Assert.assertEquals("dummy", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|4", com.helger.jcodemodel.JDefinedClass.class, jClass).name()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.EClassType>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|6", com.helger.jcodemodel.EClassType.class, com.helger.jcodemodel.EClassType.INTERFACE), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.EClassType>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|8", com.helger.jcodemodel.EClassType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testCODEMODEL24()|7", com.helger.jcodemodel.JDefinedClass.class, jClass).getClassType()));
    }

    @org.junit.Test
    public void testEmptyNarrowed() throws com.helger.jcodemodel.JClassAlreadyExistsException {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass jClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|3", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("EmptyNarrowed", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.EClassType>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|2", com.helger.jcodemodel.EClassType.class, com.helger.jcodemodel.EClassType.INTERFACE)));
        final com.helger.jcodemodel.AbstractJClass hashMap = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|6", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|5", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|4", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.util.HashMap.class)).narrowEmpty());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|13", com.helger.jcodemodel.JFieldVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|7", com.helger.jcodemodel.JDefinedClass.class, jClass).field(com.helger.jcodemodel.JMod.PRIVATE, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JNarrowedClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|10", com.helger.jcodemodel.JNarrowedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|9", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|8", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.util.Map.class)).narrow(java.lang.String.class)), "strMap", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JInvocation>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|12", com.helger.jcodemodel.JInvocation.class, com.helger.jcodemodel.JExpr._new(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|11", com.helger.jcodemodel.AbstractJClass.class, hashMap)))));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JCodeModelTest|testEmptyNarrowed()|14", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

