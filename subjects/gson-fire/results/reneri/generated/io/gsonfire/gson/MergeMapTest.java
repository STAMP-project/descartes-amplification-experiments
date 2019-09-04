package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class MergeMapTest {
    @org.junit.Test
    public void testMergeMap() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|4", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|3", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|2", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableMergeMaps(io.gsonfire.gson.MergeMapTest.A.class)).createGsonBuilder()).excludeFieldsWithoutExposeAnnotation()).create());
        io.gsonfire.gson.MergeMapTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.MergeMapTest.A>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|5", io.gsonfire.gson.MergeMapTest.A.class, new io.gsonfire.gson.MergeMapTest.A());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.MergeMapTest|testMergeMap()|7", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.MergeMapTest.A>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|6", io.gsonfire.gson.MergeMapTest.A.class, a).a = "hello"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|9", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.MergeMapTest.A>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|8", io.gsonfire.gson.MergeMapTest.A.class, a).b.put("name", "john"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|11", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.MergeMapTest.A>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|10", io.gsonfire.gson.MergeMapTest.A.class, a).b.put("age", 21));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|13", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.MergeMapTest.A>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|12", io.gsonfire.gson.MergeMapTest.A.class, a).c.put("ignored", "ignored"));
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|17", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|16", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|14", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.MergeMapTest.A>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|15", io.gsonfire.gson.MergeMapTest.A.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals("hello", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.MergeMapTest|testMergeMap()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|19", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|18", com.google.gson.JsonObject.class, json).get("a")).getAsString()));
        org.junit.Assert.assertEquals("john", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.MergeMapTest|testMergeMap()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|22", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|21", com.google.gson.JsonObject.class, json).get("name")).getAsString()));
        org.junit.Assert.assertEquals(21, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.MergeMapTest|testMergeMap()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|25", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|24", com.google.gson.JsonObject.class, json).get("age")).getAsInt()));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.MergeMapTest|testMergeMap()|28", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.MergeMapTest|testMergeMap()|27", com.google.gson.JsonObject.class, json).has("ignored")));
    }

    private class A {
        @com.google.gson.annotations.Expose
        public java.lang.String a;

        @io.gsonfire.annotations.MergeMap
        public java.util.Map<java.lang.String, java.lang.Object> b = new java.util.HashMap<java.lang.String, java.lang.Object>();

        public java.util.Map<java.lang.String, java.lang.Object> c = new java.util.HashMap<java.lang.String, java.lang.Object>();
    }
}

