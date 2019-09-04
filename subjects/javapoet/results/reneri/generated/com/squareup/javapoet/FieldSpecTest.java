/**
 * Copyright (C) 2015 Square, Inc.
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


public class FieldSpecTest {
    @org.junit.Test
    public void equalsAndHashCode() {
        com.squareup.javapoet.FieldSpec a = eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|1", com.squareup.javapoet.FieldSpec.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec.Builder>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|0", com.squareup.javapoet.FieldSpec.Builder.class, com.squareup.javapoet.FieldSpec.builder(int.class, "foo")).build());
        com.squareup.javapoet.FieldSpec b = eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|3", com.squareup.javapoet.FieldSpec.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec.Builder>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|2", com.squareup.javapoet.FieldSpec.Builder.class, com.squareup.javapoet.FieldSpec.builder(int.class, "foo")).build());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.BooleanSubject>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|7", com.google.common.truth.BooleanSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|4", com.squareup.javapoet.FieldSpec.class, a).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|5", com.squareup.javapoet.FieldSpec.class, b))))).isTrue();
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.IntegerSubject>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|10", com.google.common.truth.IntegerSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|8", com.squareup.javapoet.FieldSpec.class, a).hashCode()))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|11", com.squareup.javapoet.FieldSpec.class, b).hashCode()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.StringSubject>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|15", com.google.common.truth.StringSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|13", com.squareup.javapoet.FieldSpec.class, a).toString()))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|16", com.squareup.javapoet.FieldSpec.class, b).toString()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|21", com.squareup.javapoet.FieldSpec.class, (a = eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec.Builder>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|20", com.squareup.javapoet.FieldSpec.Builder.class, com.squareup.javapoet.FieldSpec.builder(int.class, "FOO", eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.element.Modifier>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|18", javax.lang.model.element.Modifier.class, javax.lang.model.element.Modifier.PUBLIC), eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.element.Modifier>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|19", javax.lang.model.element.Modifier.class, javax.lang.model.element.Modifier.STATIC))).build()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|25", com.squareup.javapoet.FieldSpec.class, (b = eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec.Builder>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|24", com.squareup.javapoet.FieldSpec.Builder.class, com.squareup.javapoet.FieldSpec.builder(int.class, "FOO", eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.element.Modifier>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|22", javax.lang.model.element.Modifier.class, javax.lang.model.element.Modifier.PUBLIC), eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.element.Modifier>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|23", javax.lang.model.element.Modifier.class, javax.lang.model.element.Modifier.STATIC))).build()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.BooleanSubject>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|29", com.google.common.truth.BooleanSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|28", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|26", com.squareup.javapoet.FieldSpec.class, a).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|27", com.squareup.javapoet.FieldSpec.class, b))))).isTrue();
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.IntegerSubject>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|32", com.google.common.truth.IntegerSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|31", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|30", com.squareup.javapoet.FieldSpec.class, a).hashCode()))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|34", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|33", com.squareup.javapoet.FieldSpec.class, b).hashCode()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.StringSubject>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|37", com.google.common.truth.StringSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|36", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|35", com.squareup.javapoet.FieldSpec.class, a).toString()))).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|39", eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec>observeState("com.squareup.javapoet.FieldSpecTest|equalsAndHashCode()|38", com.squareup.javapoet.FieldSpec.class, b).toString()));
    }

    @org.junit.Test
    public void nullAnnotationsAddition() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec.Builder>observeState("com.squareup.javapoet.FieldSpecTest|nullAnnotationsAddition()|1", com.squareup.javapoet.FieldSpec.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.FieldSpec.Builder>observeState("com.squareup.javapoet.FieldSpecTest|nullAnnotationsAddition()|0", com.squareup.javapoet.FieldSpec.Builder.class, com.squareup.javapoet.FieldSpec.builder(int.class, "foo")).addAnnotations(null));
            org.junit.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.truth.StringSubject>observeState("com.squareup.javapoet.FieldSpecTest|nullAnnotationsAddition()|4", com.google.common.truth.StringSubject.class, com.google.common.truth.Truth.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.FieldSpecTest|nullAnnotationsAddition()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.IllegalArgumentException>observeState("com.squareup.javapoet.FieldSpecTest|nullAnnotationsAddition()|2", java.lang.IllegalArgumentException.class, expected).getMessage()))).isEqualTo("annotationSpecs == null");
        }
    }
}

