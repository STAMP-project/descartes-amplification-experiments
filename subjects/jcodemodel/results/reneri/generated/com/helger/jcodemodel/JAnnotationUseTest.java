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
 * Unit test for class {@link JAnnotationUse}.
 *
 * @author Philip Helger
 */
public final class JAnnotationUseTest {
    @org.junit.Test
    public void generatesGenericParam() throws com.helger.jcodemodel.JClassAlreadyExistsException {
        final com.helger.jcodemodel.JCodeModel codeModel = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass testClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|1", com.helger.jcodemodel.JCodeModel.class, codeModel)._class("Test"));
        final com.helger.jcodemodel.JAnnotationUse suppressWarningAnnotation = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|4", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|3", com.helger.jcodemodel.JDefinedClass.class, testClass).annotate(java.lang.SuppressWarnings.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|6", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|5", com.helger.jcodemodel.JAnnotationUse.class, suppressWarningAnnotation).param(com.helger.jcodemodel.JAnnotationUse.SPECIAL_KEY_VALUE, "unused"));
        org.junit.Assert.assertEquals("@java.lang.SuppressWarnings(\"unused\")", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|8", com.helger.jcodemodel.util.CodeModelTestsHelper.generate(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam()|7", com.helger.jcodemodel.JAnnotationUse.class, suppressWarningAnnotation))));
    }

    @org.junit.Test
    public void generatesGenericParam2() throws com.helger.jcodemodel.JClassAlreadyExistsException {
        final com.helger.jcodemodel.JCodeModel codeModel = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass testClass = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|1", com.helger.jcodemodel.JCodeModel.class, codeModel)._class("Test"));
        final com.helger.jcodemodel.JAnnotationUse suppressWarningAnnotation = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|4", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|3", com.helger.jcodemodel.JDefinedClass.class, testClass).annotate(java.lang.SuppressWarnings.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|6", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|5", com.helger.jcodemodel.JAnnotationUse.class, suppressWarningAnnotation).paramArray(com.helger.jcodemodel.JAnnotationUse.SPECIAL_KEY_VALUE, "unused", "deprecation"));
        final java.lang.String sCRLF = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|7", com.helger.jcodemodel.writer.JCMWriter.getDefaultNewLine());
        org.junit.Assert.assertEquals((((((("@java.lang.SuppressWarnings({" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|8", sCRLF))) + "    \"unused\",") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|9", sCRLF))) + "    \"deprecation\"") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|10", sCRLF))) + "})"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|12", com.helger.jcodemodel.util.CodeModelTestsHelper.generate(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|generatesGenericParam2()|11", com.helger.jcodemodel.JAnnotationUse.class, suppressWarningAnnotation))));
    }

    @org.junit.Test
    public void testOnMethodAndField() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass cls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("Test"));
        final com.helger.jcodemodel.JMethod m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|6", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|3", com.helger.jcodemodel.JDefinedClass.class, cls).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|5", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|4", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "foo"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|8", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|7", com.helger.jcodemodel.JMethod.class, m).annotate(java.lang.Deprecated.class));
        final com.helger.jcodemodel.JFieldVar field = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|12", com.helger.jcodemodel.JFieldVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|9", com.helger.jcodemodel.JDefinedClass.class, cls).field(com.helger.jcodemodel.JMod.PRIVATE, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|11", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|10", com.helger.jcodemodel.JCodeModel.class, cm).DOUBLE), "y"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|14", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|13", com.helger.jcodemodel.JFieldVar.class, field).annotate(java.lang.Deprecated.class));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testOnMethodAndField()|15", com.helger.jcodemodel.JCodeModel.class, cm));
    }

    @org.junit.Test
    public void testPackageAnnotation() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testPackageAnnotation()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.JAnnotationUseTest|testPackageAnnotation()|3", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JAnnotationUseTest|testPackageAnnotation()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testPackageAnnotation()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("foo")).annotate(java.lang.annotation.Inherited.class));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JAnnotationUseTest|testPackageAnnotation()|4", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

