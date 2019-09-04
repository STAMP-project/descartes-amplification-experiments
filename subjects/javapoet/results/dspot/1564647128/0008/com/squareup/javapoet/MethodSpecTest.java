package com.squareup.javapoet;


import com.google.common.collect.Iterables;
import com.google.common.truth.Truth;
import com.google.testing.compile.CompilationRule;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public final class MethodSpecTest {
    @Rule
    public final CompilationRule compilation = new CompilationRule();

    private Elements elements;

    private Types types;

    @Before
    public void setUp() {
        elements = compilation.getElements();
        types = compilation.getTypes();
    }

    private TypeElement getElement(Class<?> clazz) {
        return elements.getTypeElement(clazz.getCanonicalName());
    }

    private ExecutableElement findFirst(Collection<ExecutableElement> elements, String name) {
        for (ExecutableElement executableElement : elements) {
            if (executableElement.getSimpleName().toString().equals(name)) {
                return executableElement;
            }
        }
        throw new IllegalArgumentException(((name + " not found in ") + elements));
    }

    @Target(ElementType.PARAMETER)
    @interface Nullable {}

    static abstract class Everything {
        @Deprecated
        protected abstract <T extends Runnable & Closeable> Runnable everything(@MethodSpecTest.Nullable
        String thing, List<? extends T> things) throws IOException, SecurityException;
    }

    static abstract class Generics {
        <T, R, V extends Throwable> T run(R param) throws V {
            return null;
        }
    }

    static abstract class HasAnnotation {
        @Override
        public abstract String toString();
    }

    interface Throws<R extends RuntimeException> {
        public abstract void fail() throws R;
    }

    interface ExtendsOthers extends MethodSpecTest.Throws<IllegalStateException> , Comparable<MethodSpecTest.ExtendsOthers> , Callable<Integer> {}

    interface ExtendsIterableWithDefaultMethods extends Iterable<Object> {}

    final class FinalClass {
        void method() {
        }
    }

    static abstract class InvalidOverrideMethods {
        final void finalMethod() {
        }

        private void privateMethod() {
        }

        static void staticMethod() {
        }
    }

    @Test(timeout = 10000)
    public void equalsAndHashCode_mg50() throws Exception {
        MethodSpec __DSPOT_o_0 = null;
        MethodSpec a = MethodSpec.constructorBuilder().build();
        Truth.assertThat(((MethodSpec) (a)).toString()).isEqualTo("Constructor() {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (a)).hashCode()))).isEqualTo(649189633);
        Truth.assertThat(((MethodSpec) (a)).isConstructor()).isTrue();
        MethodSpec b = MethodSpec.constructorBuilder().build();
        Truth.assertThat(((MethodSpec) (b)).toString()).isEqualTo("Constructor() {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (b)).hashCode()))).isEqualTo(649189633);
        Truth.assertThat(((MethodSpec) (b)).isConstructor()).isTrue();
        a = MethodSpec.methodBuilder("taco").build();
        Truth.assertThat(((MethodSpec) (a)).toString()).isEqualTo("void taco() {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (a)).hashCode()))).isEqualTo(-1456242730);
        Truth.assertThat(((MethodSpec) (a)).isConstructor()).isFalse();
        b = MethodSpec.methodBuilder("taco").build();
        Truth.assertThat(((MethodSpec) (b)).toString()).isEqualTo("void taco() {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (b)).hashCode()))).isEqualTo(-1456242730);
        Truth.assertThat(((MethodSpec) (b)).isConstructor()).isFalse();
        TypeElement classElement = getElement(MethodSpecTest.Everything.class);
        ExecutableElement methodElement = Iterables.getOnlyElement(ElementFilter.methodsIn(classElement.getEnclosedElements()));
        a = MethodSpec.overriding(methodElement).build();
        Truth.assertThat(((MethodSpec) (a)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (a)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (a)).isConstructor()).isFalse();
        b = MethodSpec.overriding(methodElement).build();
        Truth.assertThat(((MethodSpec) (b)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (b)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (b)).isConstructor()).isFalse();
        boolean o_equalsAndHashCode_mg50__26 = a.equals(__DSPOT_o_0);
        Truth.assertThat(o_equalsAndHashCode_mg50__26).isFalse();
        Truth.assertThat(((MethodSpec) (a)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (a)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (a)).isConstructor()).isFalse();
        Truth.assertThat(((MethodSpec) (b)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (b)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (b)).isConstructor()).isFalse();
        Truth.assertThat(((MethodSpec) (a)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (a)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (a)).isConstructor()).isFalse();
        Truth.assertThat(((MethodSpec) (b)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (b)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (b)).isConstructor()).isFalse();
        Truth.assertThat(((MethodSpec) (a)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (a)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (a)).isConstructor()).isFalse();
        Truth.assertThat(((MethodSpec) (b)).toString()).isEqualTo("@java.lang.Override\nprotected <T extends java.lang.Runnable & java.io.Closeable> java.lang.Runnable everything(\n    java.lang.String arg0, java.util.List<? extends T> arg1) throws java.io.IOException,\n    java.lang.SecurityException {\n}\n");
        Truth.assertThat(((int) (((MethodSpec) (b)).hashCode()))).isEqualTo(922942018);
        Truth.assertThat(((MethodSpec) (b)).isConstructor()).isFalse();
    }
}

