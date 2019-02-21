
**Method:** `com.squareup.javapoet.Util.requireExactlyOneOf(Ljava/util/Set;[Ljavax/lang/model/element/Modifier;)V`
**Transformations:** `void`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `void`         | N         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
final class Util {
  private Util() {
  }

  static void requireExactlyOneOf(Set<Modifier> modifiers, Modifier... mutuallyExclusive) {
    int count = 0;
    for (Modifier modifier : mutuallyExclusive) {
      if (modifiers.contains(modifier)) count++;
    }
    checkArgument(count == 1, "modifiers %s must contain one of %s",
        modifiers, Arrays.toString(mutuallyExclusive));
  }
}
```

A user method:
```Java
public final class TypeSpec {
    public static final class Builder {
    public Builder addMethod(MethodSpec methodSpec) {
        if (kind == Kind.INTERFACE) {
            requireExactlyOneOf(methodSpec.modifiers, Modifier.ABSTRACT, Modifier.STATIC,
                Modifier.DEFAULT);
            requireExactlyOneOf(methodSpec.modifiers, Modifier.PUBLIC, Modifier.PRIVATE);
        } else if (kind == Kind.ANNOTATION) {
            checkState(methodSpec.modifiers.equals(kind.implicitMethodModifiers),
                "%s %s.%s requires modifiers %s",
                kind, name, methodSpec.name, kind.implicitMethodModifiers);
        }
        if (kind != Kind.ANNOTATION) {
            checkState(methodSpec.defaultValue == null, "%s %s.%s cannot have a default value",
                kind, name, methodSpec.name);
        }
        if (kind != Kind.INTERFACE) {
            checkState(!methodSpec.hasModifier(Modifier.DEFAULT), "%s %s.%s cannot be default",
                kind, name, methodSpec.name);
        }
        methodSpecs.add(methodSpec);
        return this;
        }
    }
}
```

## Tests

```Java

public class TypeSpecTest {
@Test public void basic() throws Exception {
    TypeSpec taco = TypeSpec.classBuilder("Taco")
        .addMethod(MethodSpec.methodBuilder("toString")
            .addAnnotation(Override.class)
            .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
            .returns(String.class)
            .addCode("return $S;\n", "taco")
            .build())
        .build();
    assertThat(toString(taco)).isEqualTo(""
        + "package com.squareup.tacos;\n"
        + "\n"
        + "import java.lang.Override;\n"
        + "import java.lang.String;\n"
        + "\n"
        + "class Taco {\n"
        + "  @Override\n"
        + "  public final String toString() {\n"
        + "    return \"taco\";\n"
        + "  }\n"
        + "}\n");
    assertEquals(472949424, taco.hashCode()); // update expected number if source changes
  }
}
```

## Observations

The method is a utility function. It is accessible from tests and can be tested by expecting an `IllegalArgumentException`.
Since it is not detected this means that it is never invoked with an incorrect number of parameters.

The method is covered by four test cases: `defaultModifiersForInterfaceMembers`, `interfaceStaticMethods`, `annotationWithFields`, `retroFitStyleInterface`, `interfaceDefaultMethods`.

For the user method `addMethod` it can be seen that, in fact, a test case in which a class is specified at the same time as `abstract` and `static` is missing.
Such a test is more interesting than testing the method in question, which is more general.

Note that, however, developers are testing the value of the `hashCode` method and even have a comment to manually change the number if the source changes. This might not be good for test maintenance.

