
**Method:** `com.squareup.javapoet.MethodSpec.equals(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | N         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
public class MethodSpec {
    @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (getClass() != o.getClass()) return false;
    return toString().equals(o.toString());
  }
}
```

## Tests

```Java
public class MethodSpecTest {
    @Test public void equalsAndHashCode() {
    MethodSpec a = MethodSpec.constructorBuilder().build();
    MethodSpec b = MethodSpec.constructorBuilder().build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    a = MethodSpec.methodBuilder("taco").build();
    b = MethodSpec.methodBuilder("taco").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    TypeElement classElement = getElement(Everything.class);
    ExecutableElement methodElement = getOnlyElement(methodsIn(classElement.getEnclosedElements()));
    a = MethodSpec.overriding(methodElement).build();
    b = MethodSpec.overriding(methodElement).build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
  }
}
```

## Observations

The method is tested to return only `true`. As other many cases of `equals` it can be tested with a different input.
