package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class HooksTest {
    @org.junit.Test
    public void testPreSerialize() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|2", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.HooksTest.A.class)).createGson());
        io.gsonfire.gson.HooksTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|3", io.gsonfire.gson.HooksTest.A.class, new io.gsonfire.gson.HooksTest.A(0));
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|7", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|6", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|4", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|5", io.gsonfire.gson.HooksTest.A.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPreSerialize()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|9", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPreSerialize()|8", com.google.gson.JsonObject.class, json).get("count")).getAsInt()));
    }

    @org.junit.Test
    public void testPostDeserialize() {
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|0", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|1", com.google.gson.JsonObject.class, json).addProperty("count", 10);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|2", com.google.gson.JsonObject.class, json).addProperty("nonSerializable", 20);
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|5", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|4", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|3", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.HooksTest.A.class)).createGson());
        io.gsonfire.gson.HooksTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|8", io.gsonfire.gson.HooksTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|6", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|7", com.google.gson.JsonObject.class, json), io.gsonfire.gson.HooksTest.A.class));
        org.junit.Assert.assertEquals(20, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPostDeserialize()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|9", io.gsonfire.gson.HooksTest.A.class, a).getNonSerializable()));
        org.junit.Assert.assertEquals(9, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPostDeserialize()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|11", io.gsonfire.gson.HooksTest.A.class, a).get()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|13", com.google.gson.Gson.class, gson), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|15", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserialize()|14", io.gsonfire.gson.HooksTest.A.class, a).getGson()));
    }

    @org.junit.Test
    public void testRecursion() {
        io.gsonfire.gson.HooksTest.B b = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|0", io.gsonfire.gson.HooksTest.B.class, new io.gsonfire.gson.HooksTest.B(0));
        eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|2", io.gsonfire.gson.HooksTest.B.class, (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|1", io.gsonfire.gson.HooksTest.B.class, b).b = new io.gsonfire.gson.HooksTest.B(10)));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testRecursion()|5", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testRecursion()|4", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testRecursion()|3", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.HooksTest.B.class)).createGson());
        com.google.gson.JsonObject bjson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testRecursion()|9", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testRecursion()|8", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testRecursion()|6", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|7", io.gsonfire.gson.HooksTest.B.class, b))).getAsJsonObject());
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testRecursion()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testRecursion()|11", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testRecursion()|10", com.google.gson.JsonObject.class, bjson).get("count")).getAsInt()));
        org.junit.Assert.assertEquals(11, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testRecursion()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testRecursion()|16", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testRecursion()|15", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testRecursion()|14", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testRecursion()|13", com.google.gson.JsonObject.class, bjson).get("b")).getAsJsonObject()).get("count")).getAsInt()));
        io.gsonfire.gson.HooksTest.B b2 = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|20", io.gsonfire.gson.HooksTest.B.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testRecursion()|18", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testRecursion()|19", com.google.gson.JsonObject.class, bjson), io.gsonfire.gson.HooksTest.B.class));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testRecursion()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|21", io.gsonfire.gson.HooksTest.B.class, b2).get()));
        org.junit.Assert.assertEquals(10, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testRecursion()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|24", io.gsonfire.gson.HooksTest.B.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.B>observeState("io.gsonfire.gson.HooksTest|testRecursion()|23", io.gsonfire.gson.HooksTest.B.class, b2).b).get()));
    }

    @org.junit.Test
    public void testNull() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testNull()|2", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testNull()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testNull()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.HooksTest.A.class)).createGson());
        com.google.gson.JsonElement json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testNull()|4", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testNull()|3", com.google.gson.Gson.class, gson).toJsonTree(null, io.gsonfire.gson.HooksTest.A.class));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testNull()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testNull()|5", com.google.gson.JsonElement.class, json).isJsonNull()));
    }

    @org.junit.Test
    public void testNonEnabled() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|1", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).createGson());
        io.gsonfire.gson.HooksTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|2", io.gsonfire.gson.HooksTest.A.class, new io.gsonfire.gson.HooksTest.A(0));
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|6", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|5", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|3", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|4", io.gsonfire.gson.HooksTest.A.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testNonEnabled()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|8", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|7", com.google.gson.JsonObject.class, json).get("count")).getAsInt()));
        io.gsonfire.gson.HooksTest.A a2 = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|12", io.gsonfire.gson.HooksTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|10", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|11", com.google.gson.JsonObject.class, json), io.gsonfire.gson.HooksTest.A.class));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testNonEnabled()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testNonEnabled()|13", io.gsonfire.gson.HooksTest.A.class, a).get()));
    }

    @org.junit.Test
    public void testPostDeserializeOrder() {
        final java.util.concurrent.atomic.AtomicInteger countWhenDeserialize = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|0", java.util.concurrent.atomic.AtomicInteger.class, new java.util.concurrent.atomic.AtomicInteger(0));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|15", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|14", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|7", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|6", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|1", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerPostProcessor(io.gsonfire.gson.HooksTest.A.class, new io.gsonfire.PostProcessor<io.gsonfire.gson.HooksTest.A>() {
            @java.lang.Override
            public void postDeserialize(io.gsonfire.gson.HooksTest.A result, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|3", java.util.concurrent.atomic.AtomicInteger.class, countWhenDeserialize).set(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|4", io.gsonfire.gson.HooksTest.A.class, result).get()));
            }

            @java.lang.Override
            public void postSerialize(com.google.gson.JsonElement result, io.gsonfire.gson.HooksTest.A src, com.google.gson.Gson gson) {
            }
        })).enableHooks(io.gsonfire.gson.HooksTest.A.class)).registerPostProcessor(io.gsonfire.gson.HooksTest.A.class, new io.gsonfire.PostProcessor<io.gsonfire.gson.HooksTest.A>() {
            @java.lang.Override
            public void postDeserialize(io.gsonfire.gson.HooksTest.A result, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|9", java.util.concurrent.atomic.AtomicInteger.class, countWhenDeserialize).set(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|10", io.gsonfire.gson.HooksTest.A.class, result).get())) + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|12", java.util.concurrent.atomic.AtomicInteger.class, countWhenDeserialize).get()))));
            }

            @java.lang.Override
            public void postSerialize(com.google.gson.JsonElement result, io.gsonfire.gson.HooksTest.A src, com.google.gson.Gson gson) {
            }
        })).createGson());
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|18", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|17", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|16", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("count", 1)).build());
        eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.HooksTest.A>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|21", io.gsonfire.gson.HooksTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|19", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|20", com.google.gson.JsonObject.class, json), io.gsonfire.gson.HooksTest.A.class));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.HooksTest|testPostDeserializeOrder()|22", java.util.concurrent.atomic.AtomicInteger.class, countWhenDeserialize).get()));
    }

    private class A {
        private int count = 0;

        private transient int nonSerializable = -1;

        private com.google.gson.Gson gson;

        private A(int count) {
            this.count = count;
        }

        @io.gsonfire.annotations.PreSerialize
        public void inc() {
            (count)++;
        }

        @io.gsonfire.annotations.PostDeserialize
        public void dec() {
            (count)--;
        }

        @io.gsonfire.annotations.PostDeserialize
        public void setNonSerializable(com.google.gson.Gson gson, com.google.gson.JsonElement jsonElement) {
            com.google.gson.JsonElement nonSerializable = jsonElement.getAsJsonObject().get("nonSerializable");
            this.nonSerializable = (nonSerializable == null) ? -1 : nonSerializable.getAsInt();
            this.gson = gson;
        }

        public int get() {
            return count;
        }

        public int getNonSerializable() {
            return nonSerializable;
        }

        public com.google.gson.Gson getGson() {
            return gson;
        }
    }

    private class B extends io.gsonfire.gson.HooksTest.A {
        public io.gsonfire.gson.HooksTest.B b;

        private B(int count) {
            super(count);
        }
    }
}

