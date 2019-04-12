
**Methods:** `com.squareup.javapoet.JavaFile$1.append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;`, `com.squareup.javapoet.JavaFile$1.append(C)Ljava/lang/Appendable;`
**Transformations:** `null`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `null`         | Y         | N           | N        |
| `null`         | Y         | N           | N        |


# Environment

Covered by 5 test classes.

## Method

```Java
public final class JavaFile {
  private static final Appendable NULL_APPENDABLE = new Appendable() {
    @Override public Appendable append(CharSequence charSequence) {
      return this;
    }
    @Override public Appendable append(CharSequence charSequence, int start, int end) {
      return this;
    }
    @Override public Appendable append(char c) {
      return this;
    }
  };

  public void writeTo(Appendable out) throws IOException {
    // First pass: emit the entire class, just to collect the types we'll need to import.
    CodeWriter importsCollector = new CodeWriter(NULL_APPENDABLE, indent, staticImports);
    emit(importsCollector);
    Map<String, ClassName> suggestedImports = importsCollector.suggestedImports();

    // Second pass: write the code, taking advantage of the imports.
    CodeWriter codeWriter = new CodeWriter(out, indent, suggestedImports, staticImports);
    emit(codeWriter);
  }
}
```


## Observations
The purpose of these methods is precisely to produce no side effect.
They are not testable but they are also not intended to be tested.
These methods are now skipped from the analysis.