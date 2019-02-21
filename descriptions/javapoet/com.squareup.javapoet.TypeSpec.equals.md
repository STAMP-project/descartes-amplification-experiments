
**Method:** `com.squareup.javapoet.TypeSpec.equals(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | N         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java

```

## Tests
```Java
public class TypeSpecTest {
  @Test public void equalsAndHashCode() {
    TypeSpec a = TypeSpec.interfaceBuilder("taco").build();
    TypeSpec b = TypeSpec.interfaceBuilder("taco").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    a = TypeSpec.classBuilder("taco").build();
    b = TypeSpec.classBuilder("taco").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    a = TypeSpec.enumBuilder("taco").addEnumConstant("SALSA").build();
    b = TypeSpec.enumBuilder("taco").addEnumConstant("SALSA").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    a = TypeSpec.annotationBuilder("taco").build();
    b = TypeSpec.annotationBuilder("taco").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
  }
}
```

## Observations

Textbook example of piggybacking.
The method is tested to return only `true`.