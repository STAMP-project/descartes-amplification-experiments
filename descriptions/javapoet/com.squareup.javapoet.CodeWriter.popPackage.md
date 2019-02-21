
**Method:** `com.squareup.javapoet.CodeWriter.popPackage()Lcom/squareup/javapoet/CodeWriter;`
**Transformations:** `null`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `null`         | Y         | N           | I        |


# Environment

Covered by 5 test classes.

## Method

```Java
final class CodeWriter {
  public CodeWriter popPackage() {
    checkState(this.packageName != NO_PACKAGE, "package not set");
    this.packageName = NO_PACKAGE;
    return this;
  }
}
```

## Tests

```Java
@Test public void defaultPackageTypesAreNotImported() throws Exception {
    String source = JavaFile.builder("hello",
          TypeSpec.classBuilder("World").addSuperinterface(ClassName.get("", "Test")).build())
        .build()
        .toString();
    assertThat(source).isEqualTo(""
        + "package hello;\n"
        + "\n"
        + "class World implements Test {\n"
        + "}\n");
  }
```

## Observations

The result should not be null the invocations of the method. The method returns `this` to support a fluent API. 
The transformation also produces other side effects, for example, the `packageName` field is an empty `String` when it shouldn't. 
This second side effect is better from a developer's perspective. Tackling the result would detect the transformation but it is probably not interesting for developers.
There is no propagation. The differences in the test execution are due to cached values in the mocks at use and timestamped values.
Since the method is public, the effects can be tested directly. In particular it should be easy to create a test that calls `pushPackage` and then `popPackage` twice expecting the second to fail. Now, there is no

