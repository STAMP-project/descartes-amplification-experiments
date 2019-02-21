
**Method:** `com.squareup.javapoet.AnnotationSpec.equals(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | N         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
class AnnotationSpec {
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
class AnnotationSpecTest {
      @Test public void equalsAndHashCode() {
    AnnotationSpec a = AnnotationSpec.builder(AnnotationC.class).build();
    AnnotationSpec b = AnnotationSpec.builder(AnnotationC.class).build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    a = AnnotationSpec.builder(AnnotationC.class).addMember("value", "$S", "123").build();
    b = AnnotationSpec.builder(AnnotationC.class).addMember("value", "$S", "123").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
  }
}
```

## Observations

Same case as other `equals` methods. Tested only to return `true`. 