/**
 * Copyright (C) 2014 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.javapoet;


@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public final class TypesEclipseTest extends com.squareup.javapoet.AbstractTypesTest {
    /**
     * A {@link JUnit4} {@link Rule} that executes tests such that a instances of {@link Elements} and
     * {@link Types} are available during execution.
     *
     * <p>To use this rule in a test, just add the following field: <pre>   {@code
     *
     * @unknown public CompilationRule compilationRule = new CompilationRule();}
     * @author Gregory Kick
     */
    public static final class CompilationRule implements org.junit.rules.TestRule {
        private javax.lang.model.util.Elements elements;

        private javax.lang.model.util.Types types;

        @java.lang.Override
        public org.junit.runners.model.Statement apply(final org.junit.runners.model.Statement base, org.junit.runner.Description description) {
            return new org.junit.runners.model.Statement() {
                @java.lang.Override
                public void evaluate() throws java.lang.Throwable {
                    final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> thrown = new java.util.concurrent.atomic.AtomicReference<>();
                    boolean successful = com.squareup.javapoet.TypesEclipseTest.CompilationRule.compile(com.google.common.collect.ImmutableList.of(new javax.annotation.processing.AbstractProcessor() {
                        @java.lang.Override
                        public javax.lang.model.SourceVersion getSupportedSourceVersion() {
                            return javax.lang.model.SourceVersion.latest();
                        }

                        @java.lang.Override
                        public java.util.Set<java.lang.String> getSupportedAnnotationTypes() {
                            return com.google.common.collect.ImmutableSet.of("*");
                        }

                        @java.lang.Override
                        public synchronized void init(javax.annotation.processing.ProcessingEnvironment processingEnv) {
                            super.init(processingEnv);
                            elements = processingEnv.getElementUtils();
                            types = processingEnv.getTypeUtils();
                        }

                        @java.lang.Override
                        public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> annotations, javax.annotation.processing.RoundEnvironment roundEnv) {
                            // just run the test on the last round after compilation is over
                            if (roundEnv.processingOver()) {
                                try {
                                    base.evaluate();
                                } catch (java.lang.Throwable e) {
                                    thrown.set(e);
                                }
                            }
                            return false;
                        }
                    }));
                    com.google.common.base.Preconditions.checkState(successful);
                    java.lang.Throwable t = thrown.get();
                    if (t != null) {
                        throw t;
                    }
                }
            };
        }

        /**
         * Returns the {@link Elements} instance associated with the current execution of the rule.
         *
         * @throws IllegalStateException
         * 		if this method is invoked outside the execution of the rule.
         */
        public javax.lang.model.util.Elements getElements() {
            com.google.common.base.Preconditions.checkState(((elements) != null), "Not running within the rule");
            return elements;
        }

        /**
         * Returns the {@link Types} instance associated with the current execution of the rule.
         *
         * @throws IllegalStateException
         * 		if this method is invoked outside the execution of the rule.
         */
        public javax.lang.model.util.Types getTypes() {
            com.google.common.base.Preconditions.checkState(((elements) != null), "Not running within the rule");
            return types;
        }

        private static boolean compile(java.lang.Iterable<? extends javax.annotation.processing.Processor> processors) {
            javax.tools.JavaCompiler compiler = new org.eclipse.jdt.internal.compiler.tool.EclipseCompiler();
            javax.tools.DiagnosticCollector<javax.tools.JavaFileObject> diagnosticCollector = new javax.tools.DiagnosticCollector<>();
            javax.tools.JavaFileManager fileManager = compiler.getStandardFileManager(diagnosticCollector, java.util.Locale.getDefault(), com.google.common.base.Charsets.UTF_8);
            javax.tools.JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnosticCollector, com.google.common.collect.ImmutableSet.of(), com.google.common.collect.ImmutableSet.of(com.squareup.javapoet.TypesEclipseTest.class.getCanonicalName()), com.google.common.collect.ImmutableSet.of());
            task.setProcessors(processors);
            return task.call();
        }
    }

    @org.junit.Rule
    public final com.squareup.javapoet.TypesEclipseTest.CompilationRule compilation = new com.squareup.javapoet.TypesEclipseTest.CompilationRule();

    @java.lang.Override
    protected javax.lang.model.util.Elements getElements() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.util.Elements>observeState("com.squareup.javapoet.TypesEclipseTest|getElements()|1", javax.lang.model.util.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.TypesEclipseTest.CompilationRule>observeState("com.squareup.javapoet.TypesEclipseTest|getElements()|0", com.squareup.javapoet.TypesEclipseTest.CompilationRule.class, compilation).getElements());
    }

    @java.lang.Override
    protected javax.lang.model.util.Types getTypes() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<javax.lang.model.util.Types>observeState("com.squareup.javapoet.TypesEclipseTest|getTypes()|1", javax.lang.model.util.Types.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.javapoet.TypesEclipseTest.CompilationRule>observeState("com.squareup.javapoet.TypesEclipseTest|getTypes()|0", com.squareup.javapoet.TypesEclipseTest.CompilationRule.class, compilation).getTypes());
    }
}

