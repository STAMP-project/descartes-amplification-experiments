package io.gsonfire.gson;


/**
 * Created by julio on 5/25/15.
 */
public class FireExclusionStrategyTest {
    @org.junit.Test
    public void testMethodExclusion() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|6", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableExposeMethodResult()).addSerializationExclusionStrategy(new io.gsonfire.gson.FireExclusionStrategy() {
            @java.lang.Override
            public boolean shouldSkipMethod(io.gsonfire.postprocessors.methodinvoker.MappedMethod method) {
                return eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.postprocessors.methodinvoker.MappedMethod>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|3", io.gsonfire.postprocessors.methodinvoker.MappedMethod.class, method).getSerializedName()).equals("excluded"));
            }
        }));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|8", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|7", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.FireExclusionStrategyTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.FireExclusionStrategyTest.A>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|9", io.gsonfire.gson.FireExclusionStrategyTest.A.class, new io.gsonfire.gson.FireExclusionStrategyTest.A());
        com.google.gson.JsonObject obj = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|13", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|12", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|10", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.FireExclusionStrategyTest.A>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|11", io.gsonfire.gson.FireExclusionStrategyTest.A.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>>>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|15", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|14", com.google.gson.JsonObject.class, obj).entrySet()).size()));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|17", com.google.gson.JsonObject.class, obj).has("excluded")));
        org.junit.Assert.assertEquals("included", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|20", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.FireExclusionStrategyTest|testMethodExclusion()|19", com.google.gson.JsonObject.class, obj).get("included")).getAsString()));
    }

    private class A {
        @io.gsonfire.annotations.ExposeMethodResult("included")
        public java.lang.String included() {
            return "included";
        }

        @io.gsonfire.annotations.ExposeMethodResult("excluded")
        public java.lang.String excluded() {
            return "excluded";
        }
    }
}

