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
package com.helger.jcodemodel.util;


/**
 *
 *
 * @author Ben Fagin
 * @version 2013-04-01
 */
public final class JCNameUtilitiesTest {
    public static class Inner {}

    @org.junit.Test
    public void testInnerClassNaming() {
        final java.lang.String expected = ((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.util.JCNameUtilitiesTest|testInnerClassNaming()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Package>observeState("com.helger.jcodemodel.util.JCNameUtilitiesTest|testInnerClassNaming()|0", java.lang.Package.class, com.helger.jcodemodel.util.JCNameUtilitiesTest.class.getPackage()).getName())) + ".") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.util.JCNameUtilitiesTest|testInnerClassNaming()|2", com.helger.jcodemodel.util.JCNameUtilitiesTest.class.getSimpleName()))) + ".") + "Inner";
        final java.lang.String name = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.util.JCNameUtilitiesTest|testInnerClassNaming()|3", com.helger.jcodemodel.util.JCNameUtilities.getFullName(com.helger.jcodemodel.util.JCNameUtilitiesTest.Inner.class));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.util.JCNameUtilitiesTest|testInnerClassNaming()|4", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.util.JCNameUtilitiesTest|testInnerClassNaming()|5", name));
    }
}

