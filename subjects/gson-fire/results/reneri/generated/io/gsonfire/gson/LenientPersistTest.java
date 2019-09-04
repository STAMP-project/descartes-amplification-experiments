package io.gsonfire.gson;


public class LenientPersistTest {
    @org.junit.Test
    public void testLeninentPersist() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|5", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|4", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|3", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|2", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerPreProcessor(io.gsonfire.gson.LenientPersistTest.SimpleThing.class, new io.gsonfire.PreProcessor<io.gsonfire.gson.LenientPersistTest.SimpleThing>() {
            @java.lang.Override
            public void preDeserialize(java.lang.Class<? extends io.gsonfire.gson.LenientPersistTest.SimpleThing> clazz, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
            }
        })).createGsonBuilder()).setLenient()).create());
        java.lang.String json = "{\"name\":\"bob\",\"value\":\"NaN\"} /*comment*/";
        io.gsonfire.gson.LenientPersistTest.SimpleThing result = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.LenientPersistTest.SimpleThing>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|8", io.gsonfire.gson.LenientPersistTest.SimpleThing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|6", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|7", json), io.gsonfire.gson.LenientPersistTest.SimpleThing.class));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.LenientPersistTest.SimpleThing>observeState("io.gsonfire.gson.LenientPersistTest|testLeninentPersist()|9", io.gsonfire.gson.LenientPersistTest.SimpleThing.class, result).value), java.lang.Double.NaN, 0);
    }

    @org.junit.Test(expected = com.google.gson.JsonSyntaxException.class)
    public void testNonLeninentPersist() {
        try {
            com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|4", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.GsonBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|3", com.google.gson.GsonBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|2", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerPreProcessor(io.gsonfire.gson.LenientPersistTest.SimpleThing.class, new io.gsonfire.PreProcessor<io.gsonfire.gson.LenientPersistTest.SimpleThing>() {
                @java.lang.Override
                public void preDeserialize(java.lang.Class<? extends io.gsonfire.gson.LenientPersistTest.SimpleThing> clazz, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
                }
            })).createGsonBuilder()).create());
            java.lang.String json = "{\"name\":\"bob\",\"value\":\"NaN\"} /*comment*/";
            io.gsonfire.gson.LenientPersistTest.SimpleThing result = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.LenientPersistTest.SimpleThing>observeState("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|7", io.gsonfire.gson.LenientPersistTest.SimpleThing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|5", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|6", json), io.gsonfire.gson.LenientPersistTest.SimpleThing.class));
            org.junit.Assert.fail();
        } catch (com.google.gson.JsonSyntaxException a1552650930249) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("io.gsonfire.gson.LenientPersistTest|testNonLeninentPersist()|!", a1552650930249);
            throw a1552650930249;
        }
    }

    public static class SimpleThing {
        public java.lang.String name;

        public double value;
    }
}

