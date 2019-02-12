
**Method:** `org.eaxy.experimental.SampleSoapXmlBuilder.getFileName()Ljava/lang/String;`
**Transformations:** `"A", "", null`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | N           | I        |

# Environment

Covered by 0 test classes.

## Method

```Java
@Override
public String toString() {
    return getClass().getSimpleName() + "{" +
            getFilename() + " - " +
            operationElement.name() + "}";
}

private String getFilename() {
    try {
        return new File(wsdlFile.getBaseUrl().toURI()).getName();
    } catch (URISyntaxException e) {
        return wsdlFile.getBaseUrl().toString();
    }
}
```

## Observations
In this case the file names are not random. The infection can be confirmed.
The method is called by `toString` and only used in by the test runner to format the name of the test case.
