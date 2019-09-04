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
 * Test class for class {@link JFieldRef}
 *
 * @author Philip Helger
 */
public final class JFieldRefTest {
    @org.junit.Test
    public void testBasic() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JDefinedClass cls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|2", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|1", com.helger.jcodemodel.JCodeModel.class, cm)._class(com.helger.jcodemodel.JMod.FINAL, "Test"));
        final com.helger.jcodemodel.JFieldVar f1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|6", com.helger.jcodemodel.JFieldVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|3", com.helger.jcodemodel.JDefinedClass.class, cls).field(com.helger.jcodemodel.JMod.PRIVATE, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|5", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|4", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.Integer.class)), "field"));
        final com.helger.jcodemodel.JFieldVar f2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|10", com.helger.jcodemodel.JFieldVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|7", com.helger.jcodemodel.JDefinedClass.class, cls).field(com.helger.jcodemodel.JMod.PRIVATE, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.AbstractJClass>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|9", com.helger.jcodemodel.AbstractJClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|8", com.helger.jcodemodel.JCodeModel.class, cm).ref(java.lang.String.class)), "field2"));
        final com.helger.jcodemodel.JMethod m = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|14", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|11", com.helger.jcodemodel.JDefinedClass.class, cls).method(com.helger.jcodemodel.JMod.PUBLIC, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPrimitiveType>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|13", com.helger.jcodemodel.JPrimitiveType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|12", com.helger.jcodemodel.JCodeModel.class, cm).VOID), "foo"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|20", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|16", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|15", com.helger.jcodemodel.JMethod.class, m).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAssignment>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|19", com.helger.jcodemodel.JAssignment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|18", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|17", com.helger.jcodemodel.JFieldVar.class, f1))).assign(5))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|26", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|22", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|21", com.helger.jcodemodel.JMethod.class, m).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAssignment>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|25", com.helger.jcodemodel.JAssignment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|24", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.ref(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|23", com.helger.jcodemodel.JFieldVar.class, f2))).assign("Test"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|32", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|28", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|27", com.helger.jcodemodel.JMethod.class, m).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAssignment>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|31", com.helger.jcodemodel.JAssignment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|30", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.refthis(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|29", com.helger.jcodemodel.JFieldVar.class, f1))).assign(6))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|38", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|34", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|33", com.helger.jcodemodel.JMethod.class, m).body()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAssignment>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|37", com.helger.jcodemodel.JAssignment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldRef>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|36", com.helger.jcodemodel.JFieldRef.class, com.helger.jcodemodel.JExpr.refthis(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JFieldVar>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|35", com.helger.jcodemodel.JFieldVar.class, f2))).assign("Call"))));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JFieldRefTest|testBasic()|39", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

