package com.squareup.javapoet;


import com.google.common.truth.Truth;
import com.google.testing.compile.CompilationRule;
import javax.lang.model.element.Modifier;
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
    public void annotationWithFields_mg59() throws Exception {
        FieldSpec __DSPOT_o_0 = null;
        FieldSpec field = FieldSpec.builder(int.class, "FOO").addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer("$L", 101).build();
        Truth.assertThat(((FieldSpec) (field)).toString()).isEqualTo("public static final int FOO = 101;\n");
        Truth.assertThat(((int) (((FieldSpec) (field)).hashCode()))).isEqualTo(-449343922);
        TypeSpec anno = TypeSpec.annotationBuilder("Anno").addField(field).build();
        Truth.assertThat(((TypeSpec) (anno)).toString()).isEqualTo("@interface Anno {\n  int FOO = 101;\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (anno)).hashCode()))).isEqualTo(1023254950);
        boolean o_annotationWithFields_mg59__11 = field.equals(__DSPOT_o_0);
        Truth.assertThat(o_annotationWithFields_mg59__11).isFalse();
        Truth.assertThat(((FieldSpec) (field)).toString()).isEqualTo("public static final int FOO = 101;\n");
        Truth.assertThat(((int) (((FieldSpec) (field)).hashCode()))).isEqualTo(-449343922);
        Truth.assertThat(((TypeSpec) (anno)).toString()).isEqualTo("@interface Anno {\n  int FOO = 101;\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (anno)).hashCode()))).isEqualTo(1023254950);
    }

    @Test(timeout = 10000)
    public void annotationWithFields_mg61() throws Exception {
        TypeSpec __DSPOT_o_1 = null;
        FieldSpec field = FieldSpec.builder(int.class, "FOO").addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).initializer("$L", 101).build();
        Truth.assertThat(((FieldSpec) (field)).toString()).isEqualTo("public static final int FOO = 101;\n");
        Truth.assertThat(((int) (((FieldSpec) (field)).hashCode()))).isEqualTo(-449343922);
        TypeSpec anno = TypeSpec.annotationBuilder("Anno").addField(field).build();
        Truth.assertThat(((TypeSpec) (anno)).toString()).isEqualTo("@interface Anno {\n  int FOO = 101;\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (anno)).hashCode()))).isEqualTo(1023254950);
        boolean o_annotationWithFields_mg61__11 = anno.equals(__DSPOT_o_1);
        Truth.assertThat(o_annotationWithFields_mg61__11).isFalse();
        Truth.assertThat(((FieldSpec) (field)).toString()).isEqualTo("public static final int FOO = 101;\n");
        Truth.assertThat(((int) (((FieldSpec) (field)).hashCode()))).isEqualTo(-449343922);
        Truth.assertThat(((TypeSpec) (anno)).toString()).isEqualTo("@interface Anno {\n  int FOO = 101;\n}\n");
        Truth.assertThat(((int) (((TypeSpec) (anno)).hashCode()))).isEqualTo(1023254950);
    }

    private String toString(TypeSpec typeSpec) {
        return JavaFile.builder(tacosPackage, typeSpec).build().toString();
    }
}

