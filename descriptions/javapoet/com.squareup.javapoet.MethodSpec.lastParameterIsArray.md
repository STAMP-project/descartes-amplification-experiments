
**Method:** `com.squareup.javapoet.MethodSpec.lastParameterIsArray(Ljava/util/List;)Z`
**Transformations:** `true`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | N         | N           | I        |


# Environment

Covered by 3 test classes.

## Method

```Java
public final class MethodSpec {
  private MethodSpec(Builder builder) {
    CodeBlock code = builder.code.build();
    checkArgument(code.isEmpty() || !builder.modifiers.contains(Modifier.ABSTRACT),
        "abstract method %s cannot have code", builder.name);
    checkArgument(!builder.varargs || lastParameterIsArray(builder.parameters),
        "last parameter of varargs method %s must be an array", builder.name);

    this.name = checkNotNull(builder.name, "name == null");
    this.javadoc = builder.javadoc.build();
    this.annotations = Util.immutableList(builder.annotations);
    this.modifiers = Util.immutableSet(builder.modifiers);
    this.typeVariables = Util.immutableList(builder.typeVariables);
    this.returnType = builder.returnType;
    this.parameters = Util.immutableList(builder.parameters);
    this.varargs = builder.varargs;
    this.exceptions = Util.immutableList(builder.exceptions);
    this.defaultValue = builder.defaultValue;
    this.code = code;
  }
private boolean lastParameterIsArray(List<ParameterSpec> parameters) {
    return !parameters.isEmpty()
        && TypeName.asArray((parameters.get(parameters.size() - 1).type)) != null;
  }
}
```

## Tests
```Java
class JavaFileTest {
@Test public void importStaticMixed() {
    JavaFile source = JavaFile.builder("com.squareup.tacos",
        TypeSpec.classBuilder("Taco")
            .addStaticBlock(CodeBlock.builder()
                .addStatement("assert $1T.valueOf(\"BLOCKED\") == $1T.BLOCKED", Thread.State.class)
                .addStatement("$T.gc()", System.class)
                .addStatement("$1T.out.println($1T.nanoTime())", System.class)
                .build())
            .addMethod(MethodSpec.constructorBuilder()
                .addParameter(Thread.State[].class, "states")
                .varargs(true)
                .build())
            .build())
        .addStaticImport(Thread.State.BLOCKED)
        .addStaticImport(System.class, "*")
        .addStaticImport(Thread.State.class, "valueOf")
        .build();
    assertThat(source.toString()).isEqualTo(""
        + "package com.squareup.tacos;\n"
        + "\n"
        + "import static java.lang.System.*;\n"
        + "import static java.lang.Thread.State.BLOCKED;\n"
        + "import static java.lang.Thread.State.valueOf;\n"
        + "\n"
        + "import java.lang.Thread;\n"
        + "\n"
        + "class Taco {\n"
        + "  static {\n"
        + "    assert valueOf(\"BLOCKED\") == BLOCKED;\n"
        + "    gc();\n"
        + "    out.println(nanoTime());\n"
        + "  }\n"
        + "\n"
        + "  Taco(Thread.State... states) {\n"
        + "  }\n"
        + "}\n");
  }
}
class TypeSpecTest {
    @Test public void varargs() throws Exception {
    TypeSpec taqueria = TypeSpec.classBuilder("Taqueria")
        .addMethod(MethodSpec.methodBuilder("prepare")
            .addParameter(int.class, "workers")
            .addParameter(Runnable[].class, "jobs")
            .varargs()
            .build())
        .build();
    assertThat(toString(taqueria)).isEqualTo(""
        + "package com.squareup.tacos;\n"
        + "\n"
        + "import java.lang.Runnable;\n"
        + "\n"
        + "class Taqueria {\n"
        + "  void prepare(int workers, Runnable... jobs) {\n"
        + "  }\n"
        + "}\n");
  }
}
```

## Observations

The method is only tested in scenarios where there is no `vargars` and when there is, the last parameter is an array.
A test case where with `varargs` and no array as a final parameter is missing.
The method is not accessible but can be tested through the constructor which is accessible through the inner `Builder` class.
The test case should expect the exception.