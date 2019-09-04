package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class AnnotationInspectorTest {
    @org.junit.Test
    public void testGetAnnotatedMethods() throws java.lang.Exception {
        io.gsonfire.util.reflection.AnnotationInspector inspector = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.reflection.MethodInspector>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|0", io.gsonfire.util.reflection.MethodInspector.class, new io.gsonfire.util.reflection.MethodInspector());
        java.util.Collection<java.lang.reflect.Method> methods = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|2", java.util.Collection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.reflection.AnnotationInspector>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|1", io.gsonfire.util.reflection.AnnotationInspector.class, inspector).getAnnotatedMembers(io.gsonfire.gson.AnnotationInspectorTest.A.class, java.lang.Deprecated.class));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<java.lang.reflect.Method>>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|3", java.util.Collection.class, methods).size()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Method>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|5", java.lang.reflect.Method.class, io.gsonfire.gson.AnnotationInspectorTest.A.class.getMethod("b")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Method>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|8", java.lang.reflect.Method.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Iterator<java.lang.reflect.Method>>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|7", java.util.Iterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<java.lang.reflect.Method>>observeState("io.gsonfire.gson.AnnotationInspectorTest|testGetAnnotatedMethods()|6", java.util.Collection.class, methods).iterator()).next()));
    }

    private class A {
        public void a() {
        }

        @java.lang.Deprecated
        public void b() {
        }
    }
}

