package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class PreProcessorTest {
    @org.junit.Test
    public void test() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.PreProcessorTest|test()|4", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.PreProcessorTest|test()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerPreProcessor(io.gsonfire.gson.PreProcessorTest.A.class, new io.gsonfire.PreProcessor<io.gsonfire.gson.PreProcessorTest.A>() {
            @java.lang.Override
            public void preDeserialize(java.lang.Class<? extends io.gsonfire.gson.PreProcessorTest.A> clazz, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.PreProcessorTest|test()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.PreProcessorTest|test()|2", com.google.gson.JsonElement.class, src).getAsJsonObject()).addProperty("a", "changed");
            }
        }));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.PreProcessorTest|test()|6", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.PreProcessorTest|test()|5", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.PreProcessorTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|7", io.gsonfire.gson.PreProcessorTest.A.class, new io.gsonfire.gson.PreProcessorTest.A());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|9", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|8", io.gsonfire.gson.PreProcessorTest.A.class, a).a = "a"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|11", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|10", io.gsonfire.gson.PreProcessorTest.A.class, a).b = "b"));
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.PreProcessorTest|test()|15", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.PreProcessorTest|test()|14", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.PreProcessorTest|test()|12", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|13", io.gsonfire.gson.PreProcessorTest.A.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.PreProcessorTest|test()|17", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.PreProcessorTest|test()|16", com.google.gson.JsonObject.class, json).get("a")).getAsString()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|19", io.gsonfire.gson.PreProcessorTest.A.class, a).a));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.PreProcessorTest|test()|22", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.PreProcessorTest|test()|21", com.google.gson.JsonObject.class, json).get("b")).getAsString()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|24", io.gsonfire.gson.PreProcessorTest.A.class, a).b));
        io.gsonfire.gson.PreProcessorTest.A a2 = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|28", io.gsonfire.gson.PreProcessorTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.PreProcessorTest|test()|26", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.PreProcessorTest|test()|27", com.google.gson.JsonObject.class, json), io.gsonfire.gson.PreProcessorTest.A.class));
        org.junit.Assert.assertEquals("changed", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|30", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|29", io.gsonfire.gson.PreProcessorTest.A.class, a2).a));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|32", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|31", io.gsonfire.gson.PreProcessorTest.A.class, a).b), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.PreProcessorTest|test()|34", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.PreProcessorTest.A>observeState("io.gsonfire.gson.PreProcessorTest|test()|33", io.gsonfire.gson.PreProcessorTest.A.class, a2).b));
    }

    private class A {
        public java.lang.String a;

        public java.lang.String b;
    }

    private class B {}
}

