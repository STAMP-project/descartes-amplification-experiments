package io.gsonfire.gson;


public class NaNTest {
    public static com.google.gson.Gson getGson(boolean allowNan) {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|3", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|1", io.gsonfire.GsonFireBuilder.class, builder).registerPostProcessor(io.gsonfire.gson.NaNTest.Buggy.class, new io.gsonfire.PostProcessor<io.gsonfire.gson.NaNTest.Buggy>() {
            @java.lang.Override
            public void postDeserialize(io.gsonfire.gson.NaNTest.Buggy result, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
            }

            @java.lang.Override
            public void postSerialize(com.google.gson.JsonElement result, io.gsonfire.gson.NaNTest.Buggy src, com.google.gson.Gson gson) {
            }
        }));
        eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|6", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|4", io.gsonfire.GsonFireBuilder.class, builder).registerTypeSelector(java.lang.Object.class, new io.gsonfire.TypeSelector<java.lang.Object>() {
            @java.lang.Override
            public java.lang.Class<?> getClassForElement(com.google.gson.JsonElement readElement) {
                return null;
            }
        }));
        com.google.gson.GsonBuilder gb = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|8", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|7", io.gsonfire.GsonFireBuilder.class, builder).createGsonBuilder());
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|getGson(boolean)|9", allowNan)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|11", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|10", com.google.gson.GsonBuilder.class, gb).serializeSpecialFloatingPointValues());
        }
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|13", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|12", com.google.gson.GsonBuilder.class, gb).create());
        return eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|getGson(boolean)|14", com.google.gson.Gson.class, gson);
    }

    @org.junit.Test
    public void testNanAllow() {
        io.gsonfire.gson.NaNTest.Buggy fm = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|0", io.gsonfire.gson.NaNTest.Buggy.class, new io.gsonfire.gson.NaNTest.Buggy());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|1", com.google.gson.Gson.class, io.gsonfire.gson.NaNTest.getGson(true));
        java.lang.String json = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanAllow()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|2", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|3", io.gsonfire.gson.NaNTest.Buggy.class, fm)));
        org.junit.Assert.assertEquals("{\"a\":NaN}", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanAllow()|5", json));
        io.gsonfire.gson.NaNTest.Buggy to = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|8", io.gsonfire.gson.NaNTest.Buggy.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|6", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanAllow()|7", json), io.gsonfire.gson.NaNTest.Buggy.class));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanAllow()|13", java.lang.Double.compare(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanAllow()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|9", io.gsonfire.gson.NaNTest.Buggy.class, fm).a), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanAllow()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanAllow()|11", io.gsonfire.gson.NaNTest.Buggy.class, to).a)))) == 0));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testNanDisallowSerializing() {
        try {
            io.gsonfire.gson.NaNTest.Buggy fm = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanDisallowSerializing()|0", io.gsonfire.gson.NaNTest.Buggy.class, new io.gsonfire.gson.NaNTest.Buggy());
            com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|testNanDisallowSerializing()|1", com.google.gson.Gson.class, io.gsonfire.gson.NaNTest.getGson(false));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.NaNTest|testNanDisallowSerializing()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.NaNTest|testNanDisallowSerializing()|2", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.NaNTest.Buggy>observeState("io.gsonfire.gson.NaNTest|testNanDisallowSerializing()|3", io.gsonfire.gson.NaNTest.Buggy.class, fm)));
        } catch (java.lang.IllegalArgumentException a1552650930265) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("io.gsonfire.gson.NaNTest|testNanDisallowSerializing()|!", a1552650930265);
            throw a1552650930265;
        }
    }

    public static class Buggy {
        double a = java.lang.Double.NaN;
    }
}

