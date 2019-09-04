package com.cronutils.model.field.expression;


/* Copyright 2015 jmrozanec
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
public class FieldExpressionTest {
    private com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression testCronFieldExpression;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression>observeState("com.cronutils.model.field.expression.FieldExpressionTest|setUp()|0", com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression.class, (this.testCronFieldExpression = new com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression()));
    }

    @org.junit.Test
    public void testAnd() throws java.lang.Exception {
        com.cronutils.model.field.expression.FieldExpression mockExpression = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|0", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class));
        com.cronutils.model.field.expression.And and = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|3", com.cronutils.model.field.expression.And.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|1", com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression.class, testCronFieldExpression).and(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|2", com.cronutils.model.field.expression.FieldExpression.class, mockExpression)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|5", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|4", com.cronutils.model.field.expression.And.class, and).getExpressions()).contains(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|6", com.cronutils.model.field.expression.FieldExpression.class, mockExpression))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|9", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|8", com.cronutils.model.field.expression.And.class, and).getExpressions()).contains(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression>observeState("com.cronutils.model.field.expression.FieldExpressionTest|testAnd()|10", com.cronutils.model.field.expression.FieldExpressionTest.TestFieldExpression.class, testCronFieldExpression))));
    }

    class TestFieldExpression extends com.cronutils.model.field.expression.FieldExpression {
        @java.lang.Override
        public java.lang.String asString() {
            return "test";
        }
    }
}

