**Method:** `org.apache.commons.codec.language.Soundex.hasMarkers()`
**Transformations:** `true`, `false`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | Y         | Y           | I        |
| `false`        | Y         | Y           | I        |

```Java
public class Soundex implements StringEncoder {

    private final char[] soundexMapping;

    public Soundex(final char[] mapping) {
        this.soundexMapping = new char[mapping.length];
        System.arraycopy(mapping, 0, this.soundexMapping, 0, mapping.length);
        this.specialCaseHW = !hasMarker(this.soundexMapping);
    }

    private boolean hasMarker(final char[] mapping) {
        for(final char ch : mapping) {
            if (ch == SILENT_MARKER) {
                return true;
            }
        }
        return false;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        str = SoundexUtils.clean(str);
        if (str.length() == 0) {
            return str;
        }
        final char out[] = {'0', '0', '0', '0'};
        int count = 0;
        final char first = str.charAt(0);
        out[count++] = first;
        char lastDigit = map(first); // previous digit
        for(int i = 1; i < str.length() && count < out.length ; i++) {
            final char ch = str.charAt(i);
            if ((this.specialCaseHW) && (ch == 'H' || ch == 'W')) { // these are ignored completely
                continue;
            }
            final char digit = map(ch);
            if (digit == SILENT_MARKER) {
                continue;
            }
            if (digit != '0' && digit != lastDigit) { // don't store vowels or repeats
                out[count++] = digit;
            }
            lastDigit = digit;
        }
        return new String(out);
    }

    private char map(final char ch) {
        final int index = ch - 'A';
        if (index < 0 || index >= this.soundexMapping.length) {
            throw new IllegalArgumentException("The character is not mapped: " + ch + " (index=" + index + ")");
        }
        return this.soundexMapping[index];
    }

}

```

# Test example

```Java
 @Test
public void testNewInstance3() {
    Assert.assertEquals("W452", new Soundex(Soundex.US_ENGLISH_MAPPING_STRING).soundex("Williams"));
}
```

# Observations

The `hasMarker` method can be replaced by `return true` or `return false` 
and the test cases do not notice the change. The transformation has an effect on
`specialCaseHW`. This has only an effect in the `soundex` method, specifically 
in the following condition: `(this.specialCaseHW) && (ch == 'H' || ch == 'W')`.

The result of the `soundex` is not affected as `map(ch)`, two lines below, 
converts `H` and `W` into `0` and those are then are not taken into account 
anyways.

The infection propagates as it can be noticed in the `specialCaseHW` field.

The transformation is testable, but requires a mapping that does not transform
`H` and `W` into 0 and a string that has `H` or `W` after the second character.


