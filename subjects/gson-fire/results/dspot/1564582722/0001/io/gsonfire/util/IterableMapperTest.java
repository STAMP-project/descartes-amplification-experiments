package io.gsonfire.util;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class IterableMapperTest {
    @Test(timeout = 10000)
    public void testEqualsWithNull_add1_mg53() throws Exception {
        SimpleIterable<Integer> __DSPOT_o_0 = null;
        SimpleIterable<Integer> o_testEqualsWithNull_add1__1 = SimpleIterable.of(((Integer) (null)), 1);
        Assert.assertEquals("[null, 1]", ((SimpleIterable) (o_testEqualsWithNull_add1__1)).toString());
        Assert.assertEquals(962, ((int) (((SimpleIterable) (o_testEqualsWithNull_add1__1)).hashCode())));
        Iterable<Integer> integerIterable = SimpleIterable.of(((Integer) (null)), 1);
        Iterable<String> iterableMapper1 = IterableMapper.create(integerIterable, new IterableMapperTest.IntegerToStringMapper());
        Iterable<String> iterableMapper2 = IterableMapper.create(integerIterable, new IterableMapperTest.IntegerToStringMapper());
        boolean o_testEqualsWithNull_add1_mg53__13 = o_testEqualsWithNull_add1__1.equals(__DSPOT_o_0);
        Assert.assertFalse(o_testEqualsWithNull_add1_mg53__13);
        Assert.assertEquals("[null, 1]", ((SimpleIterable) (o_testEqualsWithNull_add1__1)).toString());
        Assert.assertEquals(962, ((int) (((SimpleIterable) (o_testEqualsWithNull_add1__1)).hashCode())));
    }

    private static <T> Collection<T> toCollection(Iterable<T> iterable) {
        List<T> list = new ArrayList<T>();
        for (T v : iterable) {
            list.add(v);
        }
        return list;
    }

    private static class IntegerToStringMapper implements Mapper<Integer, String> {
        @Override
        public String map(Integer from) {
            if (from == null) {
                return null;
            } else {
                return from.toString();
            }
        }
    }

    private static class CountedMapper<F, T> implements Mapper<F, T> {
        private final Mapper<F, T> mapper;

        private int mapCount = 0;

        private CountedMapper(Mapper<F, T> mapper) {
            this.mapper = mapper;
        }

        @Override
        public T map(F from) {
            (mapCount)++;
            return mapper.map(from);
        }

        public int getMapCount() {
            return mapCount;
        }
    }
}

