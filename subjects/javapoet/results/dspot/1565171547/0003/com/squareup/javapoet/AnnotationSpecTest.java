package com.squareup.javapoet;


import com.google.common.truth.Truth;
import com.google.testing.compile.CompilationRule;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.Rule;
import org.junit.Test;


public final class AnnotationSpecTest {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationA {}

    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationB {}

    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationC {
        String value();
    }

    public enum Breakfast {

        WAFFLES,
        PANCAKES;
        public String toString() {
            return (name()) + " with cherries!";
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface HasDefaultsAnnotation {
        byte a() default 5;

        short b() default 6;

        int c() default 7;

        long d() default 8;

        float e() default 9.0F;

        double f() default 10.0;

        char[] g() default { 0, 51966, 'z', '€', 'ℕ', '"', '\'', '\t', '\n' };

        boolean h() default true;

        AnnotationSpecTest.Breakfast i() default AnnotationSpecTest.Breakfast.WAFFLES;

        AnnotationSpecTest.AnnotationA j() default @AnnotationSpecTest.AnnotationA;

        String k() default "maple";

        Class<? extends Annotation> l() default AnnotationSpecTest.AnnotationB.class;

        int[] m() default { 1, 2, 3 };

        AnnotationSpecTest.Breakfast[] n() default { AnnotationSpecTest.Breakfast.WAFFLES, AnnotationSpecTest.Breakfast.PANCAKES };

        AnnotationSpecTest.Breakfast o();

        int p();

        AnnotationSpecTest.AnnotationC q() default @AnnotationSpecTest.AnnotationC("foo");

        Class<? extends Number>[] r() default { Byte.class, Short.class, Integer.class, Long.class };
    }

    @AnnotationSpecTest.HasDefaultsAnnotation(o = AnnotationSpecTest.Breakfast.PANCAKES, p = 1701, f = 11.1, m = { 9, 8, 1 }, l = Override.class, j = @AnnotationSpecTest.AnnotationA, q = @AnnotationSpecTest.AnnotationC("bar"), r = { Float.class, Double.class })
    public class IsAnnotated {}

    @Rule
    public final CompilationRule compilation = new CompilationRule();

    @Test(timeout = 10000)
    public void equalsAndHashCode_mg55() throws Exception {
        Object __DSPOT_o_0 = new Object();
        AnnotationSpec a = AnnotationSpec.builder(AnnotationSpecTest.AnnotationC.class).build();
        Truth.assertThat(((AnnotationSpec) (a)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC");
        Truth.assertThat(((int) (((AnnotationSpec) (a)).hashCode()))).isEqualTo(-624003465);
        AnnotationSpec b = AnnotationSpec.builder(AnnotationSpecTest.AnnotationC.class).build();
        Truth.assertThat(((AnnotationSpec) (b)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC");
        Truth.assertThat(((int) (((AnnotationSpec) (b)).hashCode()))).isEqualTo(-624003465);
        a = AnnotationSpec.builder(AnnotationSpecTest.AnnotationC.class).addMember("value", "$S", "123").build();
        Truth.assertThat(((AnnotationSpec) (a)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC(\"123\")");
        Truth.assertThat(((int) (((AnnotationSpec) (a)).hashCode()))).isEqualTo(-1768641816);
        b = AnnotationSpec.builder(AnnotationSpecTest.AnnotationC.class).addMember("value", "$S", "123").build();
        Truth.assertThat(((AnnotationSpec) (b)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC(\"123\")");
        Truth.assertThat(((int) (((AnnotationSpec) (b)).hashCode()))).isEqualTo(-1768641816);
        boolean o_equalsAndHashCode_mg55__17 = a.equals(__DSPOT_o_0);
        Truth.assertThat(o_equalsAndHashCode_mg55__17).isFalse();
        Truth.assertThat(((AnnotationSpec) (a)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC(\"123\")");
        Truth.assertThat(((int) (((AnnotationSpec) (a)).hashCode()))).isEqualTo(-1768641816);
        Truth.assertThat(((AnnotationSpec) (b)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC(\"123\")");
        Truth.assertThat(((int) (((AnnotationSpec) (b)).hashCode()))).isEqualTo(-1768641816);
        Truth.assertThat(((AnnotationSpec) (a)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC(\"123\")");
        Truth.assertThat(((int) (((AnnotationSpec) (a)).hashCode()))).isEqualTo(-1768641816);
        Truth.assertThat(((AnnotationSpec) (b)).toString()).isEqualTo("@com.squareup.javapoet.AnnotationSpecTest.AnnotationC(\"123\")");
        Truth.assertThat(((int) (((AnnotationSpec) (b)).hashCode()))).isEqualTo(-1768641816);
    }

    private String toString(TypeSpec typeSpec) {
        return JavaFile.builder("com.squareup.tacos", typeSpec).build().toString();
    }
}

