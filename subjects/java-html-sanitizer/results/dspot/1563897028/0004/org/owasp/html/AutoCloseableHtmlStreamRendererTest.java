package org.owasp.html;


import java.io.Closeable;
import java.io.IOException;
import junit.framework.TestCase;
import org.junit.Test;


@SuppressWarnings("javadoc")
public class AutoCloseableHtmlStreamRendererTest extends TestCase {
    static final class SimpleCloseable implements Closeable {
        boolean closed;

        public void close() throws IOException {
            this.closed = true;
        }
    }

    @Test
    public static void testThatCloseablesAreClosednull5() throws IOException {
        @SuppressWarnings("resource")
        AutoCloseableHtmlStreamRendererTest.SimpleCloseable closeable = new AutoCloseableHtmlStreamRendererTest.SimpleCloseable();
        boolean o_testThatCloseablesAreClosednull5__3 = AutoCloseableHtmlStreamRenderer.isAutoCloseable(null);
        TestCase.assertFalse(o_testThatCloseablesAreClosednull5__3);
        AutoCloseableHtmlStreamRenderer.closeIfAnyCloseable(closeable);
        TestCase.assertFalse(o_testThatCloseablesAreClosednull5__3);
    }
}

