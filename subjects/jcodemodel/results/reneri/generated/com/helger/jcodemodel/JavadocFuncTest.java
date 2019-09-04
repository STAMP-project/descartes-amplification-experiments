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
 */
public final class JavadocFuncTest {
    @org.junit.Test
    public void testOnPackage() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JPackage pkg = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("foo"));
        final com.helger.jcodemodel.JDocComment aComment = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|4", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|3", com.helger.jcodemodel.JPackage.class, pkg).javadoc());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|5", com.helger.jcodemodel.JDocComment.class, aComment).add("Package description"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|8", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|7", com.helger.jcodemodel.JDocComment.class, aComment).addTag("since")).add("1.0"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|11", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|10", com.helger.jcodemodel.JDocComment.class, aComment).addAuthor()).add("JCodeModel unit test"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|14", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|13", com.helger.jcodemodel.JDocComment.class, aComment).addDeprecated()).add("Just for testing"));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnPackage()|16", com.helger.jcodemodel.JCodeModel.class, cm));
    }

    @org.junit.Test
    public void testOnClass() throws java.lang.Exception {
        final com.helger.jcodemodel.JCodeModel cm = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|0", com.helger.jcodemodel.JCodeModel.class, new com.helger.jcodemodel.JCodeModel());
        final com.helger.jcodemodel.JPackage pkg = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|2", com.helger.jcodemodel.JPackage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|1", com.helger.jcodemodel.JCodeModel.class, cm)._package("foo"));
        final com.helger.jcodemodel.JDefinedClass cls = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|4", com.helger.jcodemodel.JDefinedClass.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JPackage>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|3", com.helger.jcodemodel.JPackage.class, pkg)._class(((com.helger.jcodemodel.JMod.PUBLIC) | (com.helger.jcodemodel.JMod.FINAL)), "Dummy"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|6", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|5", com.helger.jcodemodel.JDefinedClass.class, cls).javadoc()).add("Class comment"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|10", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|9", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|8", com.helger.jcodemodel.JDefinedClass.class, cls).javadoc()).addAuthor()).add("JavadocFuncTest"));
        final com.helger.jcodemodel.JMethod method = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|13", com.helger.jcodemodel.JMethod.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDefinedClass>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|12", com.helger.jcodemodel.JDefinedClass.class, cls).method(((com.helger.jcodemodel.JMod.PUBLIC) | (com.helger.jcodemodel.JMod.STATIC)), java.lang.String.class, "getPlusX"));
        final com.helger.jcodemodel.JVar aParam = eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|15", com.helger.jcodemodel.JVar.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|14", com.helger.jcodemodel.JMethod.class, method).param(java.lang.String.class, "any"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JReturn>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|20", com.helger.jcodemodel.JReturn.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JBlock>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|17", com.helger.jcodemodel.JBlock.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|16", com.helger.jcodemodel.JMethod.class, method).body())._return(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.IJExpression>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|19", com.helger.jcodemodel.IJExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|18", com.helger.jcodemodel.JVar.class, aParam).plus("X"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|22", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|21", com.helger.jcodemodel.JMethod.class, method).javadoc()).add("Description"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|28", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|27", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|25", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|24", com.helger.jcodemodel.JMethod.class, method).javadoc()).addParam(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JVar>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|26", com.helger.jcodemodel.JVar.class, aParam))).add("Input value"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|32", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|31", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|30", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|29", com.helger.jcodemodel.JMethod.class, method).javadoc()).addReturn()).add("Input value plus \"X\"."));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|36", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|35", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|34", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|33", com.helger.jcodemodel.JMethod.class, method).javadoc()).addThrows(java.lang.NullPointerException.class)).add("If input is null"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|40", eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCommentPart>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|39", com.helger.jcodemodel.JCommentPart.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JDocComment>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|38", com.helger.jcodemodel.JDocComment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JMethod>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|37", com.helger.jcodemodel.JMethod.class, method).javadoc()).addTag("since")).add("JCodeModel 2.8.5"));
        com.helger.jcodemodel.util.CodeModelTestsHelper.parseCodeModel(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JCodeModel>observeState("com.helger.jcodemodel.JavadocFuncTest|testOnClass()|41", com.helger.jcodemodel.JCodeModel.class, cm));
    }
}

