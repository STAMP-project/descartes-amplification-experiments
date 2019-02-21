
**Method:** `com.squareup.javapoet.CodeBlock.equals(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | N         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
public class CodeBlock {
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
public final class CodeBlockTest {
  @Test public void equalsAndHashCode() {
    CodeBlock a = CodeBlock.builder().build();
    CodeBlock b = CodeBlock.builder().build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
    a = CodeBlock.builder().add("$L", "taco").build();
    b = CodeBlock.builder().add("$L", "taco").build();
    assertThat(a.equals(b)).isTrue();
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
  }
}
```

## Observations

Same as other `equals`, this one is being tested to return `true` by only one test case.
All these `equals` could be fixed with a `default` from an interface. They all have the same code.

