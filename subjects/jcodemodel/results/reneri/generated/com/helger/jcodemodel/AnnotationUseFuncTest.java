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
 * A test program for the annotation use features Note: Not all the generated
 * code would make sense but just checking in all the different ways you can use
 * an annotation
 *
 * @author Bhakti Mehta
 */
public final class AnnotationUseFuncTest {
    @interface XmlElement {
        java.lang.String value();

        java.lang.String ns();
    }

    interface XmlElementW extends com.helger.jcodemodel.IJAnnotationWriter<com.helger.jcodemodel.AnnotationUseFuncTest.XmlElement> {
        com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW value(java.lang.String s);

        com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW ns(java.lang.String s);
    }

    /**
     * *********************************************************************
     * Generates this
     * **********************************************************************
     *
     * <pre>
     * import java.lang.annotation.Retention;
     * import java.lang.annotation.RetentionPolicy;
     * import java.lang.annotation.Target;
     * import com.helger.jcodemodel.tests.AnnotationUseTest;
     *
     * &#064;Retention (value = Test.Iamenum.GOOD, value1 = RetentionPolicy.RUNTIME)
     * &#064;AnnotationUseTest.XmlElement (ns = &quot;##default&quot;, value = &quot;foobar&quot;)
     * public class Test
     * {
     *   &#064;Retention (name = &quot;book&quot;,
     *               targetNamespace = 5,
     *               names = { &quot;Bob&quot;, &quot;Rob&quot;, &quot;Ted&quot; },
     *               namesno = { 4, 5, 6 },
     *               values = { @Target (type = java.lang.Integer.class), &#64;Target (type = java.lang.Float.class) },
     *               foo = @Target (junk = 7))
     *   private double y;
     *
     *   public void foo ()
     *   {}
     *
     *   public enum Iamenum
     *   {
     *     GOOD,
     *     BAD;
     *   }
     * }
     * </pre>
     *
     * @throws JClassAlreadyExistsException
     * 		internally only
     */
    @org.junit.Test
    public void testMain() throws com.helger.jcodemodel.JClassAlreadyExistsException {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass cls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class("Test"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|6", com.helger.jcodemodel.JMethod.class, // JMethod m =
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|3", com.helger.jcodemodel.JDefinedClass.class, cls).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|5", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|4", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "foo"));
        // Annotating a class
        // Using the existing Annotations from java.lang.annotation package
        final com.helger.jcodemodel.JAnnotationUse use = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|10", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|7", com.helger.jcodemodel.JDefinedClass.class, cls).annotate(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|9", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|8", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.annotation.Retention.class))));
        // declaring an enum class and an enumconstant as a membervaluepair
        final com.helger.jcodemodel.JDefinedClass enumcls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|12", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|11", com.helger.jcodemodel.JDefinedClass.class, cls)._enum("Iamenum"));
        final com.helger.jcodemodel.JEnumConstant ec = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|14", com.helger.jcodemodel.JEnumConstant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|13", com.helger.jcodemodel.JDefinedClass.class, enumcls).enumConstant("GOOD"));
        final com.helger.jcodemodel.JEnumConstant ec1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|16", com.helger.jcodemodel.JEnumConstant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|15", com.helger.jcodemodel.JDefinedClass.class, enumcls).enumConstant("BAD"));
        final com.helger.jcodemodel.JEnumConstant ec2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|18", com.helger.jcodemodel.JEnumConstant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|17", com.helger.jcodemodel.JDefinedClass.class, enumcls).enumConstant("BAD"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|19", com.helger.jcodemodel.JEnumConstant.class, ec1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|20", com.helger.jcodemodel.JEnumConstant.class, ec2));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|23", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|21", com.helger.jcodemodel.JAnnotationUse.class, use).param("value", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JEnumConstant>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|22", com.helger.jcodemodel.JEnumConstant.class, ec)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|26", com.helger.jcodemodel.JAnnotationUse.class, // adding another param as an enum
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|24", com.helger.jcodemodel.JAnnotationUse.class, use).param("value1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.annotation.RetentionPolicy>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|25", java.lang.annotation.RetentionPolicy.class, java.lang.annotation.RetentionPolicy.RUNTIME)));
        // Adding annotation for fields
        // will generate like
        // @String(name = "book") private double y;
        // 
        final com.helger.jcodemodel.JFieldVar field = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|30", com.helger.jcodemodel.JFieldVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|27", com.helger.jcodemodel.JDefinedClass.class, cls).field(com.helger.jcodemodel.JMod.PRIVATE, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|29", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|28", com.helger.jcodemodel.JCodeModel.class, cm).DOUBLE), "y"));
        // Adding more annotations which are member value pairs
        final com.helger.jcodemodel.JAnnotationUse aUse = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|32", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|31", com.helger.jcodemodel.JFieldVar.class, field).annotate(java.lang.annotation.Retention.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|34", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|33", com.helger.jcodemodel.JAnnotationUse.class, aUse).param("name", "book"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|36", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|35", com.helger.jcodemodel.JAnnotationUse.class, aUse).param("targetNamespace", 5));
        // Adding arrays as member value pairs
        final com.helger.jcodemodel.JAnnotationArrayMember arrayMember = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|38", com.helger.jcodemodel.JAnnotationArrayMember.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|37", com.helger.jcodemodel.JAnnotationUse.class, aUse).paramArray("names"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|40", com.helger.jcodemodel.JAnnotationArrayMember.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|39", com.helger.jcodemodel.JAnnotationArrayMember.class, arrayMember).param("Bob"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|42", com.helger.jcodemodel.JAnnotationArrayMember.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|41", com.helger.jcodemodel.JAnnotationArrayMember.class, arrayMember).param("Rob"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|44", com.helger.jcodemodel.JAnnotationArrayMember.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|43", com.helger.jcodemodel.JAnnotationArrayMember.class, arrayMember).param("Ted"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|47", com.helger.jcodemodel.JAnnotationUse.class, // Shortcut
        // Ambiguous on OpenJDK6 - explicit array needed
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|45", com.helger.jcodemodel.JAnnotationUse.class, aUse).paramArray("namesno", eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|46", int[].class, new int[]{ 4, 5, 6 })));
        final com.helger.jcodemodel.JAnnotationArrayMember arrayMember2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|49", com.helger.jcodemodel.JAnnotationArrayMember.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|48", com.helger.jcodemodel.JAnnotationUse.class, aUse).paramArray("values"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|52", com.helger.jcodemodel.JAnnotationUse.class, // adding an annotation as a member value pair
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|51", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|50", com.helger.jcodemodel.JAnnotationArrayMember.class, arrayMember2).annotate(java.lang.annotation.Target.class)).param("type", java.lang.Integer.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|55", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|54", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationArrayMember>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|53", com.helger.jcodemodel.JAnnotationArrayMember.class, arrayMember2).annotate(java.lang.annotation.Target.class)).param("type", java.lang.Float.class));
        // test typed annotation writer
        final com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW w = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|57", com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|56", com.helger.jcodemodel.JDefinedClass.class, cls).annotate2(com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|60", com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|59", com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|58", com.helger.jcodemodel.AnnotationUseFuncTest.XmlElementW.class, w).ns("##default")).value("foobar"));
        // adding an annotation as a member value pair
        final com.helger.jcodemodel.JAnnotationUse myuse = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|62", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|61", com.helger.jcodemodel.JAnnotationUse.class, aUse).annotationParam("foo", java.lang.annotation.Target.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|64", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|63", com.helger.jcodemodel.JAnnotationUse.class, myuse).param("junk", 7));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|66", com.helger.jcodemodel.JAnnotationUse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAnnotationUse>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|65", com.helger.jcodemodel.JAnnotationUse.class, myuse).param("value-value"));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.AnnotationUseFuncTest|testMain()|67", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

