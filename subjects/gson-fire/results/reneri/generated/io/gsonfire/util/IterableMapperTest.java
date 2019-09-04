package io.gsonfire.util;


/**
 * Created by julio on 6/24/15.
 */
public class IterableMapperTest {
    @org.junit.Test
    public void testMapsCorrectly() throws java.lang.Exception {
        java.lang.Iterable<java.lang.Integer> integerIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|0", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(1, 2, 3));
        java.lang.Iterable<java.lang.String> iterableMapper = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|3", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|1", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|2", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        java.util.Collection<java.lang.String> expected = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|5", java.util.ArrayList.class, new java.util.ArrayList<java.lang.String>(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|4", java.util.List.class, java.util.Arrays.asList("1", "2", "3"))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|6", java.util.Collection.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|8", java.util.Collection.class, io.gsonfire.util.IterableMapperTest.toCollection(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsCorrectly()|7", java.lang.Iterable.class, iterableMapper))));
    }

    @org.junit.Test
    public void testMapsWhenIterates() throws java.lang.Exception {
        java.lang.Iterable<java.lang.Integer> integerIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|0", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(1, 2, 3));
        io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String> counterMapper = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|2", io.gsonfire.util.IterableMapperTest.CountedMapper.class, new io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String>(eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|1", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        java.lang.Iterable<java.lang.String> iterableMapper = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|5", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|3", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|4", io.gsonfire.util.IterableMapperTest.CountedMapper.class, counterMapper)));
        int mapCount = 0;
        int itemCount = 0;
        java.util.Iterator<java.lang.String> iterator1 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Iterator<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|7", java.util.Iterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|6", java.lang.Iterable.class, iterableMapper).iterator());
        while (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Iterator<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|8", java.util.Iterator.class, iterator1).hasNext())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|10", mapCount), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|11", io.gsonfire.util.IterableMapperTest.CountedMapper.class, counterMapper).getMapCount()));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Iterator<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|13", java.util.Iterator.class, iterator1).next());
            mapCount++;
            itemCount++;
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|15", mapCount), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|16", io.gsonfire.util.IterableMapperTest.CountedMapper.class, counterMapper).getMapCount()));
            java.util.Iterator<java.lang.String> iterator2 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Iterator<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|19", java.util.Iterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|18", java.lang.Iterable.class, iterableMapper).iterator());
            for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|20", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|21", itemCount)); i++) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Iterator<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|22", java.util.Iterator.class, iterator2).next());
                mapCount++;
            }
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|24", mapCount), eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.CountedMapper<java.lang.Integer, java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testMapsWhenIterates()|25", io.gsonfire.util.IterableMapperTest.CountedMapper.class, counterMapper).getMapCount()));
        } 
    }

    @org.junit.Test
    public void testEqualsWithValues() throws java.lang.Exception {
        java.lang.Iterable<java.lang.Integer> integerIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|0", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(1, 2, 3));
        java.lang.Iterable<java.lang.String> iterableMapper1 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|3", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|1", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|2", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        java.lang.Iterable<java.lang.String> iterableMapper2 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|6", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|4", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|5", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|7", java.lang.Iterable.class, iterableMapper1), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithValues()|8", java.lang.Iterable.class, iterableMapper2));
    }

    @org.junit.Test
    public void testEqualsEmpty() throws java.lang.Exception {
        java.lang.Iterable<java.lang.Integer> integerIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|0", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of());
        java.lang.Iterable<java.lang.String> iterableMapper1 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|3", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|1", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|2", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        java.lang.Iterable<java.lang.String> iterableMapper2 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|6", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|4", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|5", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|7", java.lang.Iterable.class, iterableMapper1), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsEmpty()|8", java.lang.Iterable.class, iterableMapper2));
    }

    @org.junit.Test
    public void testEqualsWithNull() throws java.lang.Exception {
        java.lang.Iterable<java.lang.Integer> integerIterable = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.SimpleIterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|0", io.gsonfire.util.SimpleIterable.class, io.gsonfire.util.SimpleIterable.of(((java.lang.Integer) (null)), 1));
        java.lang.Iterable<java.lang.String> iterableMapper1 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|3", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|1", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|2", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        java.lang.Iterable<java.lang.String> iterableMapper2 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|6", java.lang.Iterable.class, io.gsonfire.util.IterableMapper.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.Integer>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|4", java.lang.Iterable.class, integerIterable), eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.IterableMapperTest.IntegerToStringMapper>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|5", io.gsonfire.util.IterableMapperTest.IntegerToStringMapper.class, new io.gsonfire.util.IterableMapperTest.IntegerToStringMapper())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|7", java.lang.Iterable.class, iterableMapper1), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Iterable<java.lang.String>>observeState("io.gsonfire.util.IterableMapperTest|testEqualsWithNull()|8", java.lang.Iterable.class, iterableMapper2));
    }

    private static <T> java.util.Collection<T> toCollection(java.lang.Iterable<T> iterable) {
        java.util.List<T> list = new java.util.ArrayList<T>();
        for (T v : iterable) {
            list.add(v);
        }
        return list;
    }

    private static class IntegerToStringMapper implements io.gsonfire.util.Mapper<java.lang.Integer, java.lang.String> {
        @java.lang.Override
        public java.lang.String map(java.lang.Integer from) {
            if (from == null) {
                return null;
            }else {
                return from.toString();
            }
        }
    }

    private static class CountedMapper<F, T> implements io.gsonfire.util.Mapper<F, T> {
        private final io.gsonfire.util.Mapper<F, T> mapper;

        private int mapCount = 0;

        private CountedMapper(io.gsonfire.util.Mapper<F, T> mapper) {
            this.mapper = mapper;
        }

        @java.lang.Override
        public T map(F from) {
            (mapCount)++;
            return mapper.map(from);
        }

        public int getMapCount() {
            return mapCount;
        }
    }
}

