package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class HooksExceptionTest {
    private static final java.lang.ThreadLocal<java.lang.Exception> EXCEPTION = new java.lang.ThreadLocal<java.lang.Exception>();

    @org.junit.Test
    public void testPreSerializeException() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|2", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.HooksExceptionTest.A.class)).createGson());
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.ThreadLocal<java.lang.Exception>>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|3", java.lang.ThreadLocal.class, io.gsonfire.gson.HooksExceptionTest.EXCEPTION).set(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|4", java.lang.Exception.class, new java.lang.Exception()));
        io.gsonfire.gson.HooksExceptionTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|5", io.gsonfire.gson.HooksExceptionTest.A.class, new io.gsonfire.gson.HooksExceptionTest.A());
        try {
            com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|9", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|8", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|6", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|7", io.gsonfire.gson.HooksExceptionTest.A.class, a))).getAsJsonObject());
            org.junit.Assert.fail();
        } catch (io.gsonfire.gson.HookInvocationException ex) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|11", java.lang.Exception.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.ThreadLocal<java.lang.Exception>>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|10", java.lang.ThreadLocal.class, io.gsonfire.gson.HooksExceptionTest.EXCEPTION).get()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|13", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HookInvocationException>observeState("io.gsonfire.gson.HooksExceptionTest|testPreSerializeException()|12", io.gsonfire.gson.HookInvocationException.class, ex).getCause()));
        } catch (java.lang.Throwable ex) {
            org.junit.Assert.fail();
        }
    }

    @org.junit.Test
    public void testPostDeserializeException() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.ThreadLocal<java.lang.Exception>>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|0", java.lang.ThreadLocal.class, io.gsonfire.gson.HooksExceptionTest.EXCEPTION).set(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|1", java.lang.Exception.class, new java.lang.Exception()));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|4", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|3", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|2", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.HooksExceptionTest.A.class)).createGson());
        try {
            io.gsonfire.gson.HooksExceptionTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|7", io.gsonfire.gson.HooksExceptionTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|5", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|6", com.google.gson.JsonObject.class, new com.google.gson.JsonObject()), io.gsonfire.gson.HooksExceptionTest.A.class));
            org.junit.Assert.fail();
        } catch (io.gsonfire.gson.HookInvocationException ex) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|9", java.lang.Exception.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.ThreadLocal<java.lang.Exception>>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|8", java.lang.ThreadLocal.class, io.gsonfire.gson.HooksExceptionTest.EXCEPTION).get()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|11", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HookInvocationException>observeState("io.gsonfire.gson.HooksExceptionTest|testPostDeserializeException()|10", io.gsonfire.gson.HookInvocationException.class, ex).getCause()));
        } catch (java.lang.Throwable ex) {
            org.junit.Assert.fail();
        }
    }

    @org.junit.Test
    public void testNonEnabled() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|1", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).createGson());
        java.lang.Exception expectedException = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|2", java.lang.Exception.class, new java.lang.Exception());
        io.gsonfire.gson.HooksExceptionTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|3", io.gsonfire.gson.HooksExceptionTest.A.class, new io.gsonfire.gson.HooksExceptionTest.A());
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|7", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|6", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|4", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|5", io.gsonfire.gson.HooksExceptionTest.A.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|9", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|8", com.google.gson.JsonObject.class, json).get("count")).getAsInt()));
        io.gsonfire.gson.HooksExceptionTest.A a2 = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|13", io.gsonfire.gson.HooksExceptionTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|11", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|12", com.google.gson.JsonObject.class, json), io.gsonfire.gson.HooksExceptionTest.A.class));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksExceptionTest.A>observeState("io.gsonfire.gson.HooksExceptionTest|testNonEnabled()|14", io.gsonfire.gson.HooksExceptionTest.A.class, a).get()));
    }

    private static class A {
        private int count;

        private A() {
        }

        @io.gsonfire.annotations.PreSerialize
        public void preSerialize() throws java.lang.Exception {
            throw io.gsonfire.gson.HooksExceptionTest.EXCEPTION.get();
        }

        @io.gsonfire.annotations.PostDeserialize
        public void postDeserialize() throws java.lang.Exception {
            throw io.gsonfire.gson.HooksExceptionTest.EXCEPTION.get();
        }

        public int get() {
            return count;
        }
    }
}

