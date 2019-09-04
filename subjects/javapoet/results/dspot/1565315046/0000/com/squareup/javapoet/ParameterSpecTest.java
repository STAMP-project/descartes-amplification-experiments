package com.squareup.javapoet;


import com.google.common.truth.Truth;
import javax.lang.model.element.Modifier;
import org.junit.Test;


public class ParameterSpecTest {
    @Test(timeout = 10000)
    public void equalsAndHashCode_mg51() throws Exception {
        ParameterSpec __DSPOT_o_0 = null;
        ParameterSpec a = ParameterSpec.builder(int.class, "foo").build();
        Truth.assertThat(((ParameterSpec) (a)).toString()).isEqualTo("int foo");
        Truth.assertThat(((int) (((ParameterSpec) (a)).hashCode()))).isEqualTo(1955995925);
        ParameterSpec b = ParameterSpec.builder(int.class, "foo").build();
        Truth.assertThat(((ParameterSpec) (b)).toString()).isEqualTo("int foo");
        Truth.assertThat(((int) (((ParameterSpec) (b)).hashCode()))).isEqualTo(1955995925);
        a = ParameterSpec.builder(int.class, "i").addModifiers(Modifier.STATIC).build();
        Truth.assertThat(((ParameterSpec) (a)).toString()).isEqualTo("static int i");
        Truth.assertThat(((int) (((ParameterSpec) (a)).hashCode()))).isEqualTo(-130075578);
        b = ParameterSpec.builder(int.class, "i").addModifiers(Modifier.STATIC).build();
        Truth.assertThat(((ParameterSpec) (b)).toString()).isEqualTo("static int i");
        Truth.assertThat(((int) (((ParameterSpec) (b)).hashCode()))).isEqualTo(-130075578);
        boolean o_equalsAndHashCode_mg51__16 = a.equals(__DSPOT_o_0);
        Truth.assertThat(o_equalsAndHashCode_mg51__16).isFalse();
        Truth.assertThat(((ParameterSpec) (a)).toString()).isEqualTo("static int i");
        Truth.assertThat(((int) (((ParameterSpec) (a)).hashCode()))).isEqualTo(-130075578);
        Truth.assertThat(((ParameterSpec) (b)).toString()).isEqualTo("static int i");
        Truth.assertThat(((int) (((ParameterSpec) (b)).hashCode()))).isEqualTo(-130075578);
        Truth.assertThat(((ParameterSpec) (a)).toString()).isEqualTo("static int i");
        Truth.assertThat(((int) (((ParameterSpec) (a)).hashCode()))).isEqualTo(-130075578);
        Truth.assertThat(((ParameterSpec) (b)).toString()).isEqualTo("static int i");
        Truth.assertThat(((int) (((ParameterSpec) (b)).hashCode()))).isEqualTo(-130075578);
    }
}

