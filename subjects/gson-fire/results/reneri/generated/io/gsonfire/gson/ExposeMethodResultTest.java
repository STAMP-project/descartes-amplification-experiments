package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class ExposeMethodResultTest {
    @org.junit.Test
    public void test() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableExposeMethodResult());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|3", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|2", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.ExposeMethodResultTest.B a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.B>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|4", io.gsonfire.gson.ExposeMethodResultTest.B.class, new io.gsonfire.gson.ExposeMethodResultTest.B());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|6", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.B>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|5", io.gsonfire.gson.ExposeMethodResultTest.B.class, a).a = "a"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|8", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.B>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|7", io.gsonfire.gson.ExposeMethodResultTest.B.class, a).b = "b"));
        com.google.gson.JsonObject obj = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|12", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|11", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|9", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.B>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|10", io.gsonfire.gson.ExposeMethodResultTest.B.class, a))).getAsJsonObject());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|14", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|13", com.google.gson.JsonObject.class, obj).get("a")).getAsString()), "a");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|17", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|16", com.google.gson.JsonObject.class, obj).get("pub")).getAsString()), "a-pub");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|20", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|19", com.google.gson.JsonObject.class, obj).get("pro")).getAsString()), "a-pro");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|23", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|22", com.google.gson.JsonObject.class, obj).get("pri")).getAsString()), "a-pri");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|27", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|26", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|25", com.google.gson.JsonObject.class, obj).get("b")).getAsString()), "b");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|30", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|29", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|28", com.google.gson.JsonObject.class, obj).get("pub2")).getAsString()), "b-pub2");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|33", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|32", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|31", com.google.gson.JsonObject.class, obj).get("pro2")).getAsString()), "b-pro2");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|test()|36", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|35", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|test()|34", com.google.gson.JsonObject.class, obj).get("pri2")).getAsString()), "b-pri2");
    }

    @org.junit.Test
    public void testError() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableExposeMethodResult());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|3", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|2", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.ExposeMethodResultTest.ForError a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForError>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|4", io.gsonfire.gson.ExposeMethodResultTest.ForError.class, new io.gsonfire.gson.ExposeMethodResultTest.ForError());
        try {
            com.google.gson.JsonObject obj = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|8", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|7", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|5", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForError>observeState("io.gsonfire.gson.ExposeMethodResultTest|testError()|6", io.gsonfire.gson.ExposeMethodResultTest.ForError.class, a))).getAsJsonObject());
            org.junit.Assert.fail();
        } catch (java.lang.IllegalArgumentException ex) {
            junit.framework.Assert.assertTrue(true);
        }
    }

    @org.junit.Test
    public void testConflictResolution() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableExposeMethodResult());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|3", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|2", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.ExposeMethodResultTest.ForConflict c = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|4", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, new io.gsonfire.gson.ExposeMethodResultTest.ForConflict());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|6", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|5", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c).a = "A"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|8", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|7", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c).b = "B"));
        com.google.gson.JsonObject obj = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|12", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|11", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|9", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|10", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c))).getAsJsonObject());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|13", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c).getA()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|16", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|15", com.google.gson.JsonObject.class, obj).get("a")).getAsString()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|18", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c).b), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|21", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|20", com.google.gson.JsonObject.class, obj).get("b")).getAsString()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|23", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c).getC()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|27", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|26", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|25", com.google.gson.JsonObject.class, obj).get("c")).getAsString()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|29", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.ForConflict>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|28", io.gsonfire.gson.ExposeMethodResultTest.ForConflict.class, c).getD()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|32", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|31", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testConflictResolution()|30", com.google.gson.JsonObject.class, obj).get("d")).getAsString()));
    }

    @org.junit.Test
    public void testInterfaceMethodsMapping() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|1", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableExposeMethodResult());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|3", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|2", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl impl = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|4", io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl.class, new io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl());
        com.google.gson.JsonObject obj = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|8", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|7", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|5", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|6", io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl.class, impl))).getAsJsonObject());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|9", io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl.class, impl).a()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|12", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|11", com.google.gson.JsonObject.class, obj).get("a")).getAsString()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|14", io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Impl.class, impl).b()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|17", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ExposeMethodResultTest|testInterfaceMethodsMapping()|16", com.google.gson.JsonObject.class, obj).get("b")).getAsString()));
    }

    private class A {
        public java.lang.String a;

        @io.gsonfire.annotations.ExposeMethodResult("pub")
        public java.lang.String pub() {
            return (a) + "-pub";
        }

        @io.gsonfire.annotations.ExposeMethodResult("pro")
        protected java.lang.String pro() {
            return (a) + "-pro";
        }

        @io.gsonfire.annotations.ExposeMethodResult("pri")
        private java.lang.String pri() {
            return (a) + "-pri";
        }
    }

    private class B extends io.gsonfire.gson.ExposeMethodResultTest.A {
        public java.lang.String b;

        @io.gsonfire.annotations.ExposeMethodResult("pub2")
        public java.lang.String pub2() {
            return (b) + "-pub2";
        }

        @io.gsonfire.annotations.ExposeMethodResult("pro2")
        protected java.lang.String pro2() {
            return (b) + "-pro2";
        }

        @io.gsonfire.annotations.ExposeMethodResult("pri2")
        private java.lang.String pri2() {
            return (b) + "-pri2";
        }
    }

    private class ForError {
        @io.gsonfire.annotations.ExposeMethodResult("error")
        public java.lang.String error(int a) {
            return "error";
        }
    }

    private class ForConflict {
        public java.lang.String a;

        public java.lang.String b;

        @io.gsonfire.annotations.ExposeMethodResult(value = "a", conflictResolution = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.OVERWRITE)
        public java.lang.String getA() {
            return (a) + "_method";
        }

        @io.gsonfire.annotations.ExposeMethodResult(value = "b", conflictResolution = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP)
        public java.lang.String getB() {
            return (b) + "_method";
        }

        @io.gsonfire.annotations.ExposeMethodResult(value = "c", conflictResolution = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.OVERWRITE)
        public java.lang.String getC() {
            return "c_method";
        }

        @io.gsonfire.annotations.ExposeMethodResult(value = "d", conflictResolution = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP)
        public java.lang.String getD() {
            return "d_method";
        }
    }

    private static class InterfaceTest {
        public interface Interface {
            @io.gsonfire.annotations.ExposeMethodResult("a")
            java.lang.String a();

            java.lang.String b();
        }

        public static class Impl implements io.gsonfire.gson.ExposeMethodResultTest.InterfaceTest.Interface {
            @java.lang.Override
            public java.lang.String a() {
                return "a";
            }

            @java.lang.Override
            @io.gsonfire.annotations.ExposeMethodResult("b")
            public java.lang.String b() {
                return "b";
            }
        }
    }
}

