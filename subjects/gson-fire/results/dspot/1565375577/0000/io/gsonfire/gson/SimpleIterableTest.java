package io.gsonfire.gson;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.util.SimpleIterable;
import org.junit.Assert;
import org.junit.Test;


public class SimpleIterableTest {
    @Test(timeout = 10000)
    public void testSimpleIterated_mg23() throws Exception {
        SimpleIterable<Integer> __DSPOT_o_1 = null;
        Gson gson = new GsonFireBuilder().createGson();
        SimpleIterable<Integer> originalIterable = SimpleIterable.of(1, 2, 3);
        Assert.assertEquals("[1, 2, 3]", ((SimpleIterable) (originalIterable)).toString());
        Assert.assertEquals(30817, ((int) (((SimpleIterable) (originalIterable)).hashCode())));
        String json = gson.toJson(originalIterable);
        Assert.assertEquals("[1,2,3]", json);
        SimpleIterable<Integer> deserializedIterable = gson.fromJson(json, new TypeToken<SimpleIterable<Integer>>() {}.getType());
        Assert.assertEquals("[1, 2, 3]", ((SimpleIterable) (deserializedIterable)).toString());
        Assert.assertEquals(30817, ((int) (((SimpleIterable) (deserializedIterable)).hashCode())));
        boolean o_testSimpleIterated_mg23__16 = deserializedIterable.equals(__DSPOT_o_1);
        Assert.assertFalse(o_testSimpleIterated_mg23__16);
        Assert.assertEquals("[1, 2, 3]", ((SimpleIterable) (originalIterable)).toString());
        Assert.assertEquals(30817, ((int) (((SimpleIterable) (originalIterable)).hashCode())));
        Assert.assertEquals("[1,2,3]", json);
        Assert.assertEquals("[1, 2, 3]", ((SimpleIterable) (deserializedIterable)).toString());
        Assert.assertEquals(30817, ((int) (((SimpleIterable) (deserializedIterable)).hashCode())));
    }

    public static class GenericContainer<T> {
        public final T value;

        public GenericContainer(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if ((this) == o) {
                return true;
            }
            if ((o == null) || ((getClass()) != (o.getClass()))) {
                return false;
            }
            SimpleIterableTest.GenericContainer<?> that = ((SimpleIterableTest.GenericContainer<?>) (o));
            return !((value) != null ? !(value.equals(that.value)) : (that.value) != null);
        }

        @Override
        public int hashCode() {
            return (value) != null ? value.hashCode() : 0;
        }
    }

    public static class SimpleIterableContainer extends SimpleIterableTest.GenericContainer<SimpleIterable<Integer>> {
        public SimpleIterableContainer(SimpleIterable<Integer> value) {
            super(value);
        }
    }
}

