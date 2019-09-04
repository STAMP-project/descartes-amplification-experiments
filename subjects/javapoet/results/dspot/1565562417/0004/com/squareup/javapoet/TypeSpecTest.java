package com.squareup.javapoet;


import com.google.common.truth.Truth;
import com.google.testing.compile.CompilationRule;
import javax.lang.model.element.TypeElement;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public final class TypeSpecTest {
    private final String tacosPackage = "com.squareup.tacos";

    private static final String donutsPackage = "com.squareup.donuts";

    @Rule
    public final CompilationRule compilation = new CompilationRule();

    private TypeElement getElement(Class<?> clazz) {
        return compilation.getElements().getTypeElement(clazz.getCanonicalName());
    }

    @Test(timeout = 10000)
    public void varargs_mg78() throws Exception {
        TypeSpec __DSPOT_o_0 = null;
        TypeSpec taqueria = TypeSpec.classBuilder("Taqueria").addMethod(MethodSpec.methodBuilder("prepare").addParameter(int.class, "workers").addParameter(Runnable[].class, "jobs").varargs().build()).build();
        Truth.assertThat(((TypeSpec) (taqueria)).toString()).isEqualTo("class Taqueria {\n  void prepare(int workers, java.lang.Runnable... jobs) {\n  }\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (taqueria)).hashCode()))).isEqualTo(314176917);
        boolean o_varargs_mg78__11 = taqueria.equals(__DSPOT_o_0);
        Truth.assertThat(o_varargs_mg78__11).isFalse();
        Truth.assertThat(((TypeSpec) (taqueria)).toString()).isEqualTo("class Taqueria {\n  void prepare(int workers, java.lang.Runnable... jobs) {\n  }\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (taqueria)).hashCode()))).isEqualTo(314176917);
    }

    private String toString(TypeSpec typeSpec) {
        return JavaFile.builder(tacosPackage, typeSpec).build().toString();
    }
}

