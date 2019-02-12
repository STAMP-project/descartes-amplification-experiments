
**Method:** `org.eaxy.XmlIterator.currentLineNumber()I`
**Transformations:** `1`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | Y           | A        |

# Environment

Covered by 1 test classes.

## Method

```Java
@SuppressWarnings("restriction")
public class XmlIterator implements XMLStreamConstants, Iterator<Element> {
    public int currentLineNumber() {
        return streamReader.getLocation().getLineNumber();
    }
}

```
## Tests

```Java

class ElementFinderTest {
        @Test
    public void shouldIterateOverFiles() {
        URL file = getClass().getResource("/medsample-mini.xml");
        XmlIterator it = Xml.filter("MedlineCitation").iterate(file).iterator();
        int count = 0;
        while (it.hasNext()) {
            assertThat(it.currentCharacterOffset()).isPositive();
            assertThat(it.currentLineNumber()).isPositive();
            assertThat(it.currentColumnNumber()).isPositive();
            it.next();
            count++;
        }
        assertThat(count).isEqualTo(1);
    }
}
```

## Observations
Not used in the class by any other method. It is covered by only one test class
and one test case inside this class. The assertion only checks that the number
is positive. So if it does return the same positive (non zero) value the test
still passes.