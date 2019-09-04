package io.gsonfire.gson;


/**
 *
 *
 * @unknown julio
 */
public class TypeSelectorTest {
    @org.junit.Test
    public void test() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.TypeSelectorTest|test()|12", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.TypeSelectorTest|test()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerTypeSelector(io.gsonfire.gson.TypeSelectorTest.Base.class, new io.gsonfire.TypeSelector<io.gsonfire.gson.TypeSelectorTest.Base>() {
            @java.lang.Override
            public java.lang.Class<? extends io.gsonfire.gson.TypeSelectorTest.Base> getClassForElement(com.google.gson.JsonElement readElement) {
                java.lang.String kind = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.TypeSelectorTest|test()|4", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.TypeSelectorTest|test()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.TypeSelectorTest|test()|2", com.google.gson.JsonElement.class, readElement).getAsJsonObject()).get("kind")).getAsString());
                if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|6", kind).equals("a"))) {
                    return io.gsonfire.gson.TypeSelectorTest.A.class;
                }else
                    if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|9", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|8", kind).equals("b"))) {
                        return io.gsonfire.gson.TypeSelectorTest.B.class;
                    }else
                        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|11", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|10", kind).equals("aa"))) {
                            return io.gsonfire.gson.TypeSelectorTest.AA.class;
                        }else {
                            return null;
                        }


            }
        }));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|14", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.TypeSelectorTest|test()|13", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        io.gsonfire.gson.TypeSelectorTest.A a = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|15", io.gsonfire.gson.TypeSelectorTest.A.class, new io.gsonfire.gson.TypeSelectorTest.A());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|17", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|16", io.gsonfire.gson.TypeSelectorTest.A.class, a).kind = "a"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|19", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|18", io.gsonfire.gson.TypeSelectorTest.A.class, a).a = "im a"));
        io.gsonfire.gson.TypeSelectorTest.B b = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.B>observeState("io.gsonfire.gson.TypeSelectorTest|test()|20", io.gsonfire.gson.TypeSelectorTest.B.class, new io.gsonfire.gson.TypeSelectorTest.B());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|22", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.B>observeState("io.gsonfire.gson.TypeSelectorTest|test()|21", io.gsonfire.gson.TypeSelectorTest.B.class, b).kind = "b"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|24", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.B>observeState("io.gsonfire.gson.TypeSelectorTest|test()|23", io.gsonfire.gson.TypeSelectorTest.B.class, b).b = "im b"));
        io.gsonfire.gson.TypeSelectorTest.AA aa = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.AA>observeState("io.gsonfire.gson.TypeSelectorTest|test()|25", io.gsonfire.gson.TypeSelectorTest.AA.class, new io.gsonfire.gson.TypeSelectorTest.AA());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|27", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.AA>observeState("io.gsonfire.gson.TypeSelectorTest|test()|26", io.gsonfire.gson.TypeSelectorTest.AA.class, aa).kind = "aa"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|29", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.AA>observeState("io.gsonfire.gson.TypeSelectorTest|test()|28", io.gsonfire.gson.TypeSelectorTest.AA.class, aa).aa = "im aa"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|31", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.AA>observeState("io.gsonfire.gson.TypeSelectorTest|test()|30", io.gsonfire.gson.TypeSelectorTest.AA.class, aa).a = "im a(subclass)"));
        io.gsonfire.gson.TypeSelectorTest.C c = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|32", io.gsonfire.gson.TypeSelectorTest.C.class, new io.gsonfire.gson.TypeSelectorTest.C());
        eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|34", io.gsonfire.gson.TypeSelectorTest.A.class, (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|33", io.gsonfire.gson.TypeSelectorTest.C.class, c).a = aa));
        io.gsonfire.gson.TypeSelectorTest.Base base = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|35", io.gsonfire.gson.TypeSelectorTest.Base.class, new io.gsonfire.gson.TypeSelectorTest.Base());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|37", (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|36", io.gsonfire.gson.TypeSelectorTest.Base.class, base).kind = "im base"));
        java.lang.String jsona = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|40", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|38", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|39", io.gsonfire.gson.TypeSelectorTest.A.class, a)));
        java.lang.String jsonb = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|43", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|41", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.B>observeState("io.gsonfire.gson.TypeSelectorTest|test()|42", io.gsonfire.gson.TypeSelectorTest.B.class, b)));
        java.lang.String jsonc = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|46", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|44", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|45", io.gsonfire.gson.TypeSelectorTest.C.class, c)));
        java.lang.String jsonbase = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|49", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|47", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|48", io.gsonfire.gson.TypeSelectorTest.Base.class, base)));
        io.gsonfire.gson.TypeSelectorTest.Base ba = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|52", io.gsonfire.gson.TypeSelectorTest.Base.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|50", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|51", jsona), io.gsonfire.gson.TypeSelectorTest.Base.class));
        io.gsonfire.gson.TypeSelectorTest.Base bb = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|55", io.gsonfire.gson.TypeSelectorTest.Base.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|53", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|54", jsonb), io.gsonfire.gson.TypeSelectorTest.Base.class));
        io.gsonfire.gson.TypeSelectorTest.C cc = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|58", io.gsonfire.gson.TypeSelectorTest.C.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|56", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|57", jsonc), io.gsonfire.gson.TypeSelectorTest.C.class));
        io.gsonfire.gson.TypeSelectorTest.Base bbase = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|61", io.gsonfire.gson.TypeSelectorTest.Base.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|test()|59", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|60", jsonbase), io.gsonfire.gson.TypeSelectorTest.Base.class));
        junit.framework.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|62", io.gsonfire.gson.TypeSelectorTest.Base.class, ba)) instanceof io.gsonfire.gson.TypeSelectorTest.A));
        junit.framework.Assert.assertEquals("im a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|64", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|63", io.gsonfire.gson.TypeSelectorTest.A.class, ((io.gsonfire.gson.TypeSelectorTest.A) (ba))).a));
        junit.framework.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|65", io.gsonfire.gson.TypeSelectorTest.Base.class, bb)) instanceof io.gsonfire.gson.TypeSelectorTest.B));
        junit.framework.Assert.assertEquals("im b", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|67", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.B>observeState("io.gsonfire.gson.TypeSelectorTest|test()|66", io.gsonfire.gson.TypeSelectorTest.B.class, ((io.gsonfire.gson.TypeSelectorTest.B) (bb))).b));
        junit.framework.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.A>observeState("io.gsonfire.gson.TypeSelectorTest|test()|69", io.gsonfire.gson.TypeSelectorTest.A.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|68", io.gsonfire.gson.TypeSelectorTest.C.class, cc).a)) instanceof io.gsonfire.gson.TypeSelectorTest.A));
        junit.framework.Assert.assertEquals("im aa", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|72", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.AA>observeState("io.gsonfire.gson.TypeSelectorTest|test()|71", io.gsonfire.gson.TypeSelectorTest.AA.class, ((io.gsonfire.gson.TypeSelectorTest.AA) (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|70", io.gsonfire.gson.TypeSelectorTest.C.class, c).a))).aa));
        junit.framework.Assert.assertEquals("im a(subclass)", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|test()|75", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.AA>observeState("io.gsonfire.gson.TypeSelectorTest|test()|74", io.gsonfire.gson.TypeSelectorTest.AA.class, ((io.gsonfire.gson.TypeSelectorTest.AA) (eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.C>observeState("io.gsonfire.gson.TypeSelectorTest|test()|73", io.gsonfire.gson.TypeSelectorTest.C.class, c).a))).a));
        junit.framework.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.TypeSelectorTest.Base>observeState("io.gsonfire.gson.TypeSelectorTest|test()|76", io.gsonfire.gson.TypeSelectorTest.Base.class, bbase).getClass()) == (io.gsonfire.gson.TypeSelectorTest.Base.class)));
    }

    @org.junit.Test
    public void testNull() {
        io.gsonfire.GsonFireBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|2", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerTypeSelector(io.gsonfire.gson.TypeSelectorTest.Base.class, new io.gsonfire.TypeSelector<io.gsonfire.gson.TypeSelectorTest.Base>() {
            @java.lang.Override
            public java.lang.Class<? extends io.gsonfire.gson.TypeSelectorTest.Base> getClassForElement(com.google.gson.JsonElement readElement) {
                return io.gsonfire.gson.TypeSelectorTest.AA.class;
            }
        }));
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|4", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|3", io.gsonfire.GsonFireBuilder.class, builder).createGson());
        com.google.gson.JsonElement json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|6", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|5", com.google.gson.Gson.class, gson).toJsonTree(null, io.gsonfire.gson.TypeSelectorTest.AA.class));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.TypeSelectorTest|testNull()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.TypeSelectorTest|testNull()|7", com.google.gson.JsonElement.class, json).isJsonNull()));
    }

    private class Base {
        public java.lang.String kind;
    }

    private class A extends io.gsonfire.gson.TypeSelectorTest.Base {
        public java.lang.String a;
    }

    private class B extends io.gsonfire.gson.TypeSelectorTest.Base {
        public java.lang.String b;
    }

    private class AA extends io.gsonfire.gson.TypeSelectorTest.A {
        public java.lang.String aa;
    }

    private class C {
        public io.gsonfire.gson.TypeSelectorTest.A a;
    }
}

