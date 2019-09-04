package org.eaxy.usage;


public class FileDecodingTest {
    public static final java.lang.String EOF = "\\Z";

    private static java.lang.String oldSystemDefaultEncoding;

    @org.junit.BeforeClass
    public static void saveDefaultEncoding() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|saveDefaultEncoding()|0", (org.eaxy.usage.FileDecodingTest.oldSystemDefaultEncoding = java.lang.System.getProperty("file.encoding")));
    }

    @org.junit.After
    public void restoreDefaultEncoding() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        org.eaxy.usage.FileDecodingTest.setSystemDefaultEncoding(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|restoreDefaultEncoding()|0", org.eaxy.usage.FileDecodingTest.oldSystemDefaultEncoding));
    }

    @org.junit.Test
    public void shouldReadUtf8DespiteDefault() throws java.io.IOException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.net.URISyntaxException {
        org.eaxy.usage.FileDecodingTest.setSystemDefaultEncoding("ISO-8859-1");
        java.io.File file = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|2", java.io.File.class, new java.io.File(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URI>observeState("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|1", java.net.URI.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|0", java.net.URL.class, getClass().getResource("/testdocument.html")).toURI())));
        java.lang.String reference = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|4", slurp(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|3", java.io.File.class, file)));
        java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.eaxy.Document>observeState("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|6", org.eaxy.Document.class, org.eaxy.Xml.read(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|5", java.io.File.class, file))).toXML());
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|8", reference)).contains("nÃ¸rwÃ¦giÃ¥n");
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|shouldReadUtf8DespiteDefault()|9", result)).contains("nørwægiån");
    }

    private static void setSystemDefaultEncoding(java.lang.String encoding) {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|setSystemDefaultEncoding(java.lang.String)|1", java.lang.System.setProperty("file.encoding", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|setSystemDefaultEncoding(java.lang.String)|0", encoding)));
        org.eaxy.usage.FileDecodingTest.invalidateFieldCache(java.nio.charset.Charset.class, "defaultCharset");
    }

    private static void invalidateFieldCache(java.lang.Class<?> classObject, java.lang.String fieldName) {
        try {
            java.lang.reflect.Field field = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|1", java.lang.reflect.Field.class, classObject.getDeclaredField(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|0", fieldName)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|2", java.lang.reflect.Field.class, field).setAccessible(true);
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|3", java.lang.reflect.Field.class, field).set(null, null);
        } catch (java.lang.NoSuchFieldException e) {
            throw eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.RuntimeException>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|5", java.lang.RuntimeException.class, new java.lang.RuntimeException(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.NoSuchFieldException>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|4", java.lang.NoSuchFieldException.class, e)));
        } catch (java.lang.IllegalAccessException e) {
            throw eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.RuntimeException>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|7", java.lang.RuntimeException.class, new java.lang.RuntimeException(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.IllegalAccessException>observeState("org.eaxy.usage.FileDecodingTest|invalidateFieldCache(java.lang.Class,java.lang.String)|6", java.lang.IllegalAccessException.class, e)));
        }
    }

    private java.lang.String slurp(java.io.File file) throws java.io.FileNotFoundException {
        try (java.util.Scanner scanner = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Scanner>observeState("org.eaxy.usage.FileDecodingTest|slurp(java.io.File)|1", java.util.Scanner.class, new java.util.Scanner(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.eaxy.usage.FileDecodingTest|slurp(java.io.File)|0", java.io.File.class, file)))) {
            return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.eaxy.usage.FileDecodingTest|slurp(java.io.File)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Scanner>observeState("org.eaxy.usage.FileDecodingTest|slurp(java.io.File)|3", java.util.Scanner.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Scanner>observeState("org.eaxy.usage.FileDecodingTest|slurp(java.io.File)|2", java.util.Scanner.class, scanner).useDelimiter(org.eaxy.usage.FileDecodingTest.EOF)).next());
        }
    }
}

