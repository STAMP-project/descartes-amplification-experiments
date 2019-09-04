package io.gsonfire.gson;


/**
 * Created by julio on 6/23/15.
 */
public class SimpleIterableTest {
    @org.junit.Test
    public void testSimpleIterated() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|1", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).createGson());
        io.gsonfire.util.SimpleIterable<java.lang.Integer> originalIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|2", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(1, 2, 3));
        java.lang.String json = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|3", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|4", io.gsonfire.util.SimpleIterable.class, originalIterable)));
        org.junit.Assert.assertEquals("[1,2,3]", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|6", json));
        io.gsonfire.util.SimpleIterable<java.lang.Integer> deserializedIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|11", io.gsonfire.util.SimpleIterable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|7", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|8", json), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Type>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|10", java.lang.reflect.Type.class, new com.google.gson.reflect.TypeToken<io.gsonfire.util.SimpleIterable<java.lang.Integer>>() {}.getType())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|12", io.gsonfire.util.SimpleIterable.class, originalIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterated()|13", io.gsonfire.util.SimpleIterable.class, deserializedIterable));
    }

    @org.junit.Test
    public void testGenericIterated() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|1", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).createGson());
        io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>> originalIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|4", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|2", io.gsonfire.gson.SimpleIterableTest.GenericContainer.class, new io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>("a")), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|3", io.gsonfire.gson.SimpleIterableTest.GenericContainer.class, new io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>("b"))));
        java.lang.String json = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|5", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|6", io.gsonfire.util.SimpleIterable.class, originalIterable)));
        org.junit.Assert.assertEquals("[{\"value\":\"a\"},{\"value\":\"b\"}]", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|8", json));
        io.gsonfire.util.SimpleIterable<java.lang.Integer> deserializedIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|13", io.gsonfire.util.SimpleIterable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|9", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|10", json), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Type>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|12", java.lang.reflect.Type.class, new com.google.gson.reflect.TypeToken<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>>>() {}.getType())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.String>>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|14", io.gsonfire.util.SimpleIterable.class, originalIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testGenericIterated()|15", io.gsonfire.util.SimpleIterable.class, deserializedIterable));
    }

    @org.junit.Test
    public void testRecursiveGenericIterated() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|1", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).createGson());
        io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>> originalIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|6", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|3", io.gsonfire.gson.SimpleIterableTest.GenericContainer.class, new io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|2", io.gsonfire.gson.SimpleIterableTest.GenericContainer.class, new io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>(1)))), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|5", io.gsonfire.gson.SimpleIterableTest.GenericContainer.class, new io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|4", io.gsonfire.gson.SimpleIterableTest.GenericContainer.class, new io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>(2))))));
        java.lang.String json = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|7", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|8", io.gsonfire.util.SimpleIterable.class, originalIterable)));
        org.junit.Assert.assertEquals("[{\"value\":{\"value\":1}},{\"value\":{\"value\":2}}]", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|10", json));
        io.gsonfire.util.SimpleIterable<java.lang.Integer> deserializedIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|15", io.gsonfire.util.SimpleIterable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|11", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|12", json), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Type>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|14", java.lang.reflect.Type.class, new com.google.gson.reflect.TypeToken<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>>>() {}.getType())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.gson.SimpleIterableTest.GenericContainer<java.lang.Integer>>>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|16", io.gsonfire.util.SimpleIterable.class, originalIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testRecursiveGenericIterated()|17", io.gsonfire.util.SimpleIterable.class, deserializedIterable));
    }

    @org.junit.Test
    public void testSimpleIterableContainer() {
        com.google.gson.Gson gson = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|1", com.google.gson.Gson.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.GsonFireBuilder>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|0", io.gsonfire.GsonFireBuilder.class, new io.gsonfire.GsonFireBuilder()).createGson());
        io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer container = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|3", io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer.class, new io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|2", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(1, 2, 3))));
        java.lang.String json = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|4", com.google.gson.Gson.class, gson).toJson(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|5", io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer.class, container)));
        org.junit.Assert.assertEquals("{\"value\":[1,2,3]}", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|7", json));
        io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer deserializedContainer = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|10", io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.Gson>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|8", com.google.gson.Gson.class, gson).fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|9", json), io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer.class));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|11", io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer.class, container), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer>observeState("io.gsonfire.gson.SimpleIterableTest|testSimpleIterableContainer()|12", io.gsonfire.gson.SimpleIterableTest.SimpleIterableContainer.class, deserializedContainer));
    }

    public static class GenericContainer<T> {
        public final T value;

        public GenericContainer(T value) {
            this.value = value;
        }

        @java.lang.Override
        public boolean equals(java.lang.Object o) {
            if ((this) == o)
                return true;

            if ((o == null) || ((getClass()) != (o.getClass())))
                return false;

            io.gsonfire.gson.SimpleIterableTest.GenericContainer<?> that = ((io.gsonfire.gson.SimpleIterableTest.GenericContainer<?>) (o));
            return !((value) != null ? !(value.equals(that.value)) : (that.value) != null);
        }

        @java.lang.Override
        public int hashCode() {
            return (value) != null ? value.hashCode() : 0;
        }
    }

    public static class SimpleIterableContainer extends io.gsonfire.gson.SimpleIterableTest.GenericContainer<io.gsonfire.util.SimpleIterable<java.lang.Integer>> {
        public SimpleIterableContainer(io.gsonfire.util.SimpleIterable<java.lang.Integer> value) {
            super(value);
        }
    }
}

