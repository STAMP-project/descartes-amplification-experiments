
**Method:** `org.eaxy.Element.hasClass(Ljava/lang/String;)Z`
**Transformations:** `true`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `true`          | Y         | N           | A        |

# Environment

Covered by 1 test classes.

## Method

```Java

@ParametersAreNonnullByDefault
public class Element implements Node {
    
    public boolean hasClass(String className) {
        return className().matches(".*\\b" + className + "\\b.*");
    }

    public Element removeClass(String classToRemove) {
        if (hasClass(classToRemove)) {
            attr("class", className().replaceAll("\\s*\\b" + classToRemove + "\\b", ""));
        }
        return this;
    }

    public String className() {
        return attr("class");
    }

    //@Nullable
    public String attr(String attrName) {
        return attr(new QualifiedName(attrName));
    }

    @Nullable
    public String attr(QualifiedName key) {
        if (!key.hasNamespace()) {
            for (Attribute attr : attributes.values()) {
                if (attr.getKey().matches(key)) return attr.getValue();
            }
        }
        Attribute attribute = attributes.get(key);
        return attribute != null ? attribute.getValue() : null;
    }
}

```

## Tests

```Java
@Test
public void shouldManipulateHtmlClass() {
    Element div = el("div");
    assertThat(div.className()).isNull();
    div.addClass("important");
    div.addClass("hidden");
    assertThat(div.className()).isEqualTo("important hidden");
    div.removeClass("hidden");
    div.removeClass("hidden");
    assertThat(div.className()).isEqualTo("important");
    div.removeClass("important");
    assertThat(div.className()).isEmpty();
}
```

## Observations
The method is covered by invoking `removeClass` but it is not covered directly. 
The immediate state is infected as the result should return false instead of 
true in the second `div.removeClass("hidden")`. However, the result has no 
effect, as `replaceAll` searches the required element.
The issue could be solved by adding `assertFalse(div.hasClass("hidden"))` right
after the assertion checking the class is only `"important"`.
There is no observed propagation, as the change in the state is only observed
through a getter method `className` that calls in turn another method. This 
getter can not be recognized by the name.