/**
 * Copyright (C) 2014 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.javapoet;


@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public final class TypesTest extends com.squareup.javapoet.AbstractTypesTest {
    @org.junit.Rule
    public final com.google.testing.compile.CompilationRule compilation = new com.google.testing.compile.CompilationRule();

    @java.lang.Override
    protected javax.lang.model.util.Elements getElements() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.util.Elements>observeState("com.squareup.javapoet.TypesTest|getElements()|1", javax.lang.model.util.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.testing.compile.CompilationRule>observeState("com.squareup.javapoet.TypesTest|getElements()|0", com.google.testing.compile.CompilationRule.class, compilation).getElements());
    }

    @java.lang.Override
    protected javax.lang.model.util.Types getTypes() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.util.Types>observeState("com.squareup.javapoet.TypesTest|getTypes()|1", javax.lang.model.util.Types.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.testing.compile.CompilationRule>observeState("com.squareup.javapoet.TypesTest|getTypes()|0", com.google.testing.compile.CompilationRule.class, compilation).getTypes());
    }
}

