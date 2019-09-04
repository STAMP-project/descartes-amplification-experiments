package org.owasp.html;


@java.lang.SuppressWarnings("javadoc")
public class AutoCloseableHtmlStreamRendererTest extends junit.framework.TestCase {
    static final class SimpleCloseable implements java.io.Closeable {
        boolean closed;

        public void close() throws java.io.IOException {
            this.closed = true;
        }
    }

    @org.junit.Test
    public static void testThatCloseablesAreClosed() throws java.io.IOException {
        @java.lang.SuppressWarnings("resource")
        org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable closeable = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|0", org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable.class, new org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable());
        junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|1", org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable.class, closeable).closed));
        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|4", org.owasp.html.AutoCloseableHtmlStreamRenderer.isAutoCloseable(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|3", org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable.class, closeable))));
        junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|5", org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable.class, closeable).closed));
        org.owasp.html.AutoCloseableHtmlStreamRenderer.closeIfAnyCloseable(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|7", org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable.class, closeable));
        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatCloseablesAreClosed()|8", org.owasp.html.AutoCloseableHtmlStreamRendererTest.SimpleCloseable.class, closeable).closed));
    }

    @org.junit.Test
    public static void testThatAutoCloseablesAreClosed() throws java.io.IOException {
        // We need a way to create an AutoCloseable instance that we can compile.
        // JDK6 so that our tests are portable.
        java.lang.Class<?> autoCloseableClass;
        try {
            autoCloseableClass = java.lang.Class.forName("java.lang.AutoCloseable");
        } catch (java.lang.ClassNotFoundException ex) {
            // OK on JDK 6.
            return;
        }
        final java.util.Map<java.lang.Object, java.lang.Boolean> closed = new java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean>();
        java.lang.Object autoCloseableProxyInstance = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|13", java.lang.Object.class, java.lang.reflect.Proxy.newProxyInstance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.ClassLoader>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|0", java.lang.ClassLoader.class, autoCloseableClass.getClassLoader()), new java.lang.Class<?>[]{ autoCloseableClass }, new java.lang.reflect.InvocationHandler() {
            public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable {
                if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|4", "close".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Method>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|2", java.lang.reflect.Method.class, method).getName())))) {
                    junit.framework.TestCase.assertTrue((((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|5", java.lang.Object[].class, args)) == null) || ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|6", java.lang.Object[].class, args).length)) == 0)));
                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|9", closed.put(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|8", java.lang.Object.class, proxy), true));
                    return null;
                }else {
                    return eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|12", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Method>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|10", java.lang.reflect.Method.class, method).invoke(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|11", java.lang.Object.class, new java.lang.Object())));
                }
            }
        }));
        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|15", org.owasp.html.AutoCloseableHtmlStreamRenderer.isAutoCloseable(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|14", java.lang.Object.class, autoCloseableProxyInstance))));
        junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|17", closed.containsKey(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|16", java.lang.Object.class, autoCloseableProxyInstance))));
        org.owasp.html.AutoCloseableHtmlStreamRenderer.closeIfAnyCloseable(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|18", java.lang.Object.class, autoCloseableProxyInstance));
        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|20", closed.containsKey(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.AutoCloseableHtmlStreamRendererTest|testThatAutoCloseablesAreClosed()|19", java.lang.Object.class, autoCloseableProxyInstance))));
    }
}

