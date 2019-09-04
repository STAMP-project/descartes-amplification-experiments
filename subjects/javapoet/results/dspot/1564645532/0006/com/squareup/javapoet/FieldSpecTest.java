package com.squareup.javapoet;


import com.google.common.truth.Truth;
import javax.lang.model.element.Modifier;
import org.junit.Test;


public class FieldSpecTest {
    @Test(timeout = 10000)
    public void equalsAndHashCode_mg55() throws Exception {
        FieldSpec __DSPOT_o_0 = null;
        FieldSpec a = FieldSpec.builder(int.class, "foo").build();
        Truth.assertThat(((FieldSpec) (a)).toString()).isEqualTo("int foo;\n");
        Truth.assertThat(((int) (((FieldSpec) (a)).hashCode()))).isEqualTo(-1483589884);
        FieldSpec b = FieldSpec.builder(int.class, "foo").build();
        Truth.assertThat(((FieldSpec) (b)).toString()).isEqualTo("int foo;\n");
        Truth.assertThat(((int) (((FieldSpec) (b)).hashCode()))).isEqualTo(-1483589884);
        a = FieldSpec.builder(int.class, "FOO", Modifier.PUBLIC, Modifier.STATIC).build();
        Truth.assertThat(((FieldSpec) (a)).toString()).isEqualTo("public static int FOO;\n");
        Truth.assertThat(((int) (((FieldSpec) (a)).hashCode()))).isEqualTo(-1882877815);
        b = FieldSpec.builder(int.class, "FOO", Modifier.PUBLIC, Modifier.STATIC).build();
        Truth.assertThat(((FieldSpec) (b)).toString()).isEqualTo("public static int FOO;\n");
        Truth.assertThat(((int) (((FieldSpec) (b)).hashCode()))).isEqualTo(-1882877815);
        boolean o_equalsAndHashCode_mg55__14 = a.equals(__DSPOT_o_0);
        Truth.assertThat(o_equalsAndHashCode_mg55__14).isFalse();
        Truth.assertThat(((FieldSpec) (a)).toString()).isEqualTo("public static int FOO;\n");
        Truth.assertThat(((int) (((FieldSpec) (a)).hashCode()))).isEqualTo(-1882877815);
        Truth.assertThat(((FieldSpec) (b)).toString()).isEqualTo("public static int FOO;\n");
        Truth.assertThat(((int) (((FieldSpec) (b)).hashCode()))).isEqualTo(-1882877815);
        Truth.assertThat(((FieldSpec) (a)).toString()).isEqualTo("public static int FOO;\n");
        Truth.assertThat(((int) (((FieldSpec) (a)).hashCode()))).isEqualTo(-1882877815);
        Truth.assertThat(((FieldSpec) (b)).toString()).isEqualTo("public static int FOO;\n");
        Truth.assertThat(((int) (((FieldSpec) (b)).hashCode()))).isEqualTo(-1882877815);
    }
}

