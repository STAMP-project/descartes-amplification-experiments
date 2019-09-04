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

    private String toString(TypeSpec typeSpec) {
        return JavaFile.builder(tacosPackage, typeSpec).build().toString();
    }

    @Test(timeout = 10000)
    public void equalsAndHashCode_mg109() throws Exception {
        TypeSpec __DSPOT_o_1 = null;
        TypeSpec a = TypeSpec.interfaceBuilder("taco").build();
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(-1079160740);
        TypeSpec b = TypeSpec.interfaceBuilder("taco").build();
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(-1079160740);
        a = TypeSpec.classBuilder("taco").build();
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("class taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(160074203);
        b = TypeSpec.classBuilder("taco").build();
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("class taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(160074203);
        a = TypeSpec.enumBuilder("taco").addEnumConstant("SALSA").build();
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("enum taco {\n  SALSA\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(968471202);
        b = TypeSpec.enumBuilder("taco").addEnumConstant("SALSA").build();
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("enum taco {\n  SALSA\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(968471202);
        a = TypeSpec.annotationBuilder("taco").build();
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(-1474107364);
        b = TypeSpec.annotationBuilder("taco").build();
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(-1474107364);
        boolean o_equalsAndHashCode_mg109__28 = b.equals(__DSPOT_o_1);
        Truth.assertThat(o_equalsAndHashCode_mg109__28).isFalse();
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (a)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (a)).hashCode()))).isEqualTo(-1474107364);
        Truth.assertThat(((TypeSpec) (b)).toString()).isEqualTo("@interface taco {\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (b)).hashCode()))).isEqualTo(-1474107364);
    }
}

