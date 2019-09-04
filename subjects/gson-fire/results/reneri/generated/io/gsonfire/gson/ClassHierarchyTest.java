package io.gsonfire.gson;


/**
 * Created by julio on 11/28/14.
 */
public class ClassHierarchyTest {
    @org.junit.Test
    public void test() {
        io.gsonfire.gson.ClassHierarchyTest.A aa = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.AA>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|0", io.gsonfire.gson.ClassHierarchyTest.AA.class, new io.gsonfire.gson.ClassHierarchyTest.AA());
        io.gsonfire.gson.ClassHierarchyTest.A bb = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.BB>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|1", io.gsonfire.gson.ClassHierarchyTest.BB.class, new io.gsonfire.gson.ClassHierarchyTest.BB());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|8", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|7", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|5", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|4", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|2", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).registerPostProcessor(io.gsonfire.gson.ClassHierarchyTest.BB.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessor>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|3", io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessor.class, new io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessor()))).enableExposeMethodResult()).registerPostProcessor(io.gsonfire.gson.ClassHierarchyTest.AA.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessor>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|6", io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessor.class, new io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessor()))).createGson());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|test()|11", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|test()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.A>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|9", io.gsonfire.gson.ClassHierarchyTest.A.class, aa).value()).toLowerCase()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|test()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|16", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|15", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|14", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|12", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.A>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|13", io.gsonfire.gson.ClassHierarchyTest.A.class, aa))).getAsJsonObject()).get("value_lower")).getAsString()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|test()|20", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|test()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.A>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|18", io.gsonfire.gson.ClassHierarchyTest.A.class, bb).value()).toLowerCase()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|test()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|25", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|24", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|23", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|21", com.google.gson.Gson.class, gson).toJsonTree(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.A>observeState("io.gsonfire.gson.ClassHierarchyTest|test()|22", io.gsonfire.gson.ClassHierarchyTest.A.class, bb))).getAsJsonObject()).get("value_lower")).getAsString()));
    }

    @org.junit.Test
    public void testTypeSelectorAndHierarchy() {
        final java.util.concurrent.atomic.AtomicInteger typeSelectorCount = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|0", java.util.concurrent.atomic.AtomicInteger.class, new java.util.concurrent.atomic.AtomicInteger(0));
        com.google.gson.JsonObject jsonObject = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|1", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("value", "A VALUE")).build());
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|12", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|11", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|9", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|5", io.gsonfire.GsonFireBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|4", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).enableHooks(io.gsonfire.gson.ClassHierarchyTest.CC.class)).registerTypeSelector(io.gsonfire.gson.ClassHierarchyTest.A.class, new io.gsonfire.TypeSelector<io.gsonfire.gson.ClassHierarchyTest.A>() {
            @java.lang.Override
            public java.lang.Class<? extends io.gsonfire.gson.ClassHierarchyTest.A> getClassForElement(com.google.gson.JsonElement readElement) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|7", java.util.concurrent.atomic.AtomicInteger.class, typeSelectorCount).incrementAndGet());
                return io.gsonfire.gson.ClassHierarchyTest.CC.class;
            }
        })).registerPostProcessor(io.gsonfire.gson.ClassHierarchyTest.CC.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessorCC>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|10", io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessorCC.class, new io.gsonfire.gson.ClassHierarchyTest.ValueLowerCasePostProcessorCC()))).createGson());
        io.gsonfire.gson.ClassHierarchyTest.CC aa = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.CC>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|15", io.gsonfire.gson.ClassHierarchyTest.CC.class, ((io.gsonfire.gson.ClassHierarchyTest.CC) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|13", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|14", com.google.gson.JsonObject.class, jsonObject), io.gsonfire.gson.ClassHierarchyTest.A.class))));
        org.junit.Assert.assertEquals("a value", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.CC>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|16", io.gsonfire.gson.ClassHierarchyTest.CC.class, aa).value()));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.ClassHierarchyTest.CC>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|18", io.gsonfire.gson.ClassHierarchyTest.CC.class, aa).autoIncremented));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.atomic.AtomicInteger>observeState("io.gsonfire.gson.ClassHierarchyTest|testTypeSelectorAndHierarchy()|20", java.util.concurrent.atomic.AtomicInteger.class, typeSelectorCount).get()));
    }

    interface A {
        java.lang.String value();
    }

    static class AA implements io.gsonfire.gson.ClassHierarchyTest.A {
        @java.lang.Override
        @io.gsonfire.annotations.ExposeMethodResult("value")
        public java.lang.String value() {
            return "AA";
        }

        @java.lang.Override
        public int hashCode() {
            return java.lang.Integer.MIN_VALUE;
        }
    }

    static class BB implements io.gsonfire.gson.ClassHierarchyTest.A {
        @java.lang.Override
        @io.gsonfire.annotations.ExposeMethodResult("value")
        public java.lang.String value() {
            return "BB";
        }

        @java.lang.Override
        public int hashCode() {
            return java.lang.Integer.MAX_VALUE;
        }
    }

    static class CC implements io.gsonfire.gson.ClassHierarchyTest.A {
        public java.lang.String value;

        public int autoIncremented = 0;

        @java.lang.Override
        public java.lang.String value() {
            return value;
        }

        @io.gsonfire.annotations.PostDeserialize
        public void inc() {
            (autoIncremented)++;
        }
    }

    static class ValueLowerCasePostProcessor implements io.gsonfire.PostProcessor<io.gsonfire.gson.ClassHierarchyTest.A> {
        @java.lang.Override
        public void postDeserialize(io.gsonfire.gson.ClassHierarchyTest.A result, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
        }

        @java.lang.Override
        public void postSerialize(com.google.gson.JsonElement result, io.gsonfire.gson.ClassHierarchyTest.A src, com.google.gson.Gson gson) {
            result.getAsJsonObject().addProperty("value_lower", result.getAsJsonObject().get("value").getAsString().toLowerCase());
        }
    }

    static class ValueLowerCasePostProcessorCC implements io.gsonfire.PostProcessor<io.gsonfire.gson.ClassHierarchyTest.CC> {
        @java.lang.Override
        public void postDeserialize(io.gsonfire.gson.ClassHierarchyTest.CC result, com.google.gson.JsonElement src, com.google.gson.Gson gson) {
            result.value = result.value.toLowerCase();
        }

        @java.lang.Override
        public void postSerialize(com.google.gson.JsonElement result, io.gsonfire.gson.ClassHierarchyTest.CC src, com.google.gson.Gson gson) {
            result.getAsJsonObject().addProperty("value_lower", result.getAsJsonObject().get("value").getAsString().toLowerCase());
        }
    }
}

