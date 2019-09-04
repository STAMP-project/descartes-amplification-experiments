package com.squareup.javapoet;


import com.google.common.truth.Truth;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.junit.Assert;
import org.junit.Test;


public class TypeNameTest {
    protected <E extends Enum<E>> E generic(E[] values) {
        return values[0];
    }

    protected static class TestGeneric<T> {
        class Inner {}

        class InnerGeneric<T2> {}

        static class NestedNonGeneric {}
    }

    protected static TypeNameTest.TestGeneric<String>.Inner testGenericStringInner() {
        return null;
    }

    protected static TypeNameTest.TestGeneric<Integer>.Inner testGenericIntInner() {
        return null;
    }

    protected static TypeNameTest.TestGeneric<Short>.InnerGeneric<Long> testGenericInnerLong() {
        return null;
    }

    protected static TypeNameTest.TestGeneric<Short>.InnerGeneric<Integer> testGenericInnerInt() {
        return null;
    }

    protected static TypeNameTest.TestGeneric.NestedNonGeneric testNestedNonGeneric() {
        return null;
    }

    @Test(timeout = 10000)
    public void genericType() throws Exception {
        Method recursiveEnum = getClass().getDeclaredMethod("generic", Enum[].class);
        TypeName o_genericType__4 = TypeName.get(recursiveEnum.getReturnType());
        Truth.assertThat(((ClassName) (o_genericType__4)).isAnnotated()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType__4)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType__4)).toString()).isEqualTo("java.lang.Enum");
        Truth.assertThat(((int) (((ClassName) (o_genericType__4)).hashCode()))).isEqualTo(398585941);
        Truth.assertThat(((ClassName) (o_genericType__4)).isPrimitive()).isFalse();
        TypeName o_genericType__6 = TypeName.get(recursiveEnum.getGenericReturnType());
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).isAnnotated()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).toString()).isEqualTo("E");
        Truth.assertThat(((int) (((TypeVariableName) (o_genericType__6)).hashCode()))).isEqualTo(69);
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).isPrimitive()).isFalse();
        TypeName genericTypeName = TypeName.get(recursiveEnum.getParameterTypes()[0]);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (genericTypeName)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isPrimitive()).isFalse();
        TypeName o_genericType__11 = TypeName.get(recursiveEnum.getGenericParameterTypes()[0]);
        Truth.assertThat(((ArrayTypeName) (o_genericType__11)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType__11)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType__11)).toString()).isEqualTo("E[]");
        Truth.assertThat(((int) (((ArrayTypeName) (o_genericType__11)).hashCode()))).isEqualTo(69223);
        Truth.assertThat(((ArrayTypeName) (o_genericType__11)).isPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType__4)).isAnnotated()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType__4)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType__4)).toString()).isEqualTo("java.lang.Enum");
        Truth.assertThat(((int) (((ClassName) (o_genericType__4)).hashCode()))).isEqualTo(398585941);
        Truth.assertThat(((ClassName) (o_genericType__4)).isPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).isAnnotated()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).toString()).isEqualTo("E");
        Truth.assertThat(((int) (((TypeVariableName) (o_genericType__6)).hashCode()))).isEqualTo(69);
        Truth.assertThat(((TypeVariableName) (o_genericType__6)).isPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (genericTypeName)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isPrimitive()).isFalse();
    }

    @Test(timeout = 10000)
    public void genericType_rv70() throws Exception {
        Method recursiveEnum = getClass().getDeclaredMethod("generic", Enum[].class);
        TypeName o_genericType_rv70__4 = TypeName.get(recursiveEnum.getReturnType());
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).isAnnotated()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).toString()).isEqualTo("java.lang.Enum");
        Truth.assertThat(((int) (((ClassName) (o_genericType_rv70__4)).hashCode()))).isEqualTo(398585941);
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).isPrimitive()).isFalse();
        TypeName __DSPOT_invoc_6 = TypeName.get(recursiveEnum.getGenericReturnType());
        TypeName genericTypeName = TypeName.get(recursiveEnum.getParameterTypes()[0]);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (genericTypeName)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isPrimitive()).isFalse();
        TypeName o_genericType_rv70__13 = TypeName.get(recursiveEnum.getGenericParameterTypes()[0]);
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).toString()).isEqualTo("E[]");
        Truth.assertThat(((int) (((ArrayTypeName) (o_genericType_rv70__13)).hashCode()))).isEqualTo(69223);
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).isPrimitive()).isFalse();
        TypeName o_genericType_rv70__15 = __DSPOT_invoc_6.withoutAnnotations();
        Truth.assertThat(((TypeVariableName) (o_genericType_rv70__15)).isAnnotated()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_rv70__15)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_rv70__15)).toString()).isEqualTo("E");
        Truth.assertThat(((int) (((TypeVariableName) (o_genericType_rv70__15)).hashCode()))).isEqualTo(69);
        Truth.assertThat(((TypeVariableName) (o_genericType_rv70__15)).isPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).isAnnotated()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).toString()).isEqualTo("java.lang.Enum");
        Truth.assertThat(((int) (((ClassName) (o_genericType_rv70__4)).hashCode()))).isEqualTo(398585941);
        Truth.assertThat(((ClassName) (o_genericType_rv70__4)).isPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (genericTypeName)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).toString()).isEqualTo("E[]");
        Truth.assertThat(((int) (((ArrayTypeName) (o_genericType_rv70__13)).hashCode()))).isEqualTo(69223);
        Truth.assertThat(((ArrayTypeName) (o_genericType_rv70__13)).isPrimitive()).isFalse();
    }

    @Test(timeout = 10000)
    public void genericType_mg44() throws Exception {
        Method recursiveEnum = getClass().getDeclaredMethod("generic", Enum[].class);
        TypeName o_genericType_mg44__4 = TypeName.get(recursiveEnum.getReturnType());
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).isAnnotated()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).toString()).isEqualTo("java.lang.Enum");
        Truth.assertThat(((int) (((ClassName) (o_genericType_mg44__4)).hashCode()))).isEqualTo(398585941);
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).isPrimitive()).isFalse();
        TypeName o_genericType_mg44__6 = TypeName.get(recursiveEnum.getGenericReturnType());
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).isAnnotated()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).toString()).isEqualTo("E");
        Truth.assertThat(((int) (((TypeVariableName) (o_genericType_mg44__6)).hashCode()))).isEqualTo(69);
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).isPrimitive()).isFalse();
        TypeName genericTypeName = TypeName.get(recursiveEnum.getParameterTypes()[0]);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (genericTypeName)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isPrimitive()).isFalse();
        TypeName o_genericType_mg44__11 = TypeName.get(recursiveEnum.getGenericParameterTypes()[0]);
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).toString()).isEqualTo("E[]");
        Truth.assertThat(((int) (((ArrayTypeName) (o_genericType_mg44__11)).hashCode()))).isEqualTo(69223);
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).isPrimitive()).isFalse();
        TypeName o_genericType_mg44__13 = genericTypeName.withoutAnnotations();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__13)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__13)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__13)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (o_genericType_mg44__13)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__13)).isPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).isAnnotated()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).toString()).isEqualTo("java.lang.Enum");
        Truth.assertThat(((int) (((ClassName) (o_genericType_mg44__4)).hashCode()))).isEqualTo(398585941);
        Truth.assertThat(((ClassName) (o_genericType_mg44__4)).isPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).isAnnotated()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).toString()).isEqualTo("E");
        Truth.assertThat(((int) (((TypeVariableName) (o_genericType_mg44__6)).hashCode()))).isEqualTo(69);
        Truth.assertThat(((TypeVariableName) (o_genericType_mg44__6)).isPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).toString()).isEqualTo("java.lang.Enum[]");
        Truth.assertThat(((int) (((ArrayTypeName) (genericTypeName)).hashCode()))).isEqualTo(789002871);
        Truth.assertThat(((ArrayTypeName) (genericTypeName)).isPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).isAnnotated()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).isBoxedPrimitive()).isFalse();
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).toString()).isEqualTo("E[]");
        Truth.assertThat(((int) (((ArrayTypeName) (o_genericType_mg44__11)).hashCode()))).isEqualTo(69223);
        Truth.assertThat(((ArrayTypeName) (o_genericType_mg44__11)).isPrimitive()).isFalse();
    }

    private void assertEqualsHashCodeAndToString(TypeName a, TypeName b) {
        Assert.assertEquals(a.toString(), b.toString());
        Truth.assertThat(a.equals(b)).isTrue();
        Truth.assertThat(a.hashCode()).isEqualTo(b.hashCode());
        Assert.assertFalse(a.equals(null));
    }
}

