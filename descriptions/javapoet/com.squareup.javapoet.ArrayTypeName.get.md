
**Method:** `com.squareup.javapoet.ArrayTypeName.get(Ljava/lang/reflect/GenericArrayType;Ljava/util/Map;)Lcom/squareup/javapoet/ArrayTypeName;`
**Transformations:** `null`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `null`         | Y         | Y           | A        |


# Environment

Covered by 1 test classes.

## Method

```Java

public final class ArrayTypeName extends TypeName {
  /** Returns an array type equivalent to {@code type}. */
  public static ArrayTypeName get(GenericArrayType type) {
    return get(type, new LinkedHashMap<>());
  }

  static ArrayTypeName get(GenericArrayType type, Map<Type, TypeVariableName> map) {
    return ArrayTypeName.of(get(type.getGenericComponentType(), map));
  }
}
```

## Tests
class TypeNameTest {
```Java
@Test public void genericType() throws Exception {
    Method recursiveEnum = getClass().getDeclaredMethod("generic", Enum[].class);
    TypeName.get(recursiveEnum.getReturnType());
    TypeName.get(recursiveEnum.getGenericReturnType());
    TypeName genericTypeName = TypeName.get(recursiveEnum.getParameterTypes()[0]);
    TypeName.get(recursiveEnum.getGenericParameterTypes()[0]);

    // Make sure the generic argument is present
    assertThat(genericTypeName.toString()).contains("Enum");
  }
}
```

## Observations

The method is invoked only once.
The transformation produces an infection as the method should not return `null`. It produces other side effects on fields from the `type` parameters.
See how the result of `TypeName.get(recursiveEnum.getGenericReturnType());` is not being asserted by the test case.


