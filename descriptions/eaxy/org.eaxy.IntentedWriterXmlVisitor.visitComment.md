
**Method:** `org.eaxy.IntentedWriterXmlVisitor.visitComment(Lorg/eaxy/Xml$CommentElement;)V`
**Transformations:** `void`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| N         | N           | I        |

# Environment

Covered by 1 test classes.

## Method

```Java
public class IntentedWriterXmlVisitor extends WriterXmlVisitor implements XmlVisitor {
    @Override
    public void visitComment(CommentElement comment) throws IOException {
        writer.write(currentIndent + "<!--" + comment.text() + "-->" + Document.LINE_SEPARATOR);
    }
}
```

## Tests

```Java
@RunWith(Parameterized.class)
public class SoapXmlBuilderDirectoryTest {...}
```

## Observations
The test class checks only that no exception is thrown. It is the same as other
transformations.
It could be tested by comparing a simple value with a comment.