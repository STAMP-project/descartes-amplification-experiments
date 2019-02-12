**Method:** `j2html.tags.Tag.equals.(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| N         | N           | I        |

# Environment

Covered by 1 test class.

## Method

```Java
public abstract class Tag<T extends Tag<T>> extends DomContent {
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        return ((Tag) obj).render().equals(this.render());
    }
}
```

## Tests

```Java
 @Test
public void testEquals() throws Exception {
    Tag tagOne = tag("p").withClass("class").withText("Test");
    Tag tagTwo = p("Test").withClass("class");
    assertThat(tagOne.equals(tagTwo), is(true));
}
```

## Observations
The method is expected to return `true` in the one covering test case.
A new input could solve the issue.