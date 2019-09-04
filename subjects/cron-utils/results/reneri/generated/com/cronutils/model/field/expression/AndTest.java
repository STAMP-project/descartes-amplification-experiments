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
public class AndTest {
    private com.cronutils.model.field.expression.And and;

    private com.cronutils.model.field.expression.FieldExpression expression1;

    private com.cronutils.model.field.expression.FieldExpression expression2;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|setUp()|0", com.cronutils.model.field.expression.And.class, (and = new com.cronutils.model.field.expression.And()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|setUp()|1", com.cronutils.model.field.expression.FieldExpression.class, (expression1 = org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|setUp()|2", com.cronutils.model.field.expression.FieldExpression.class, (expression2 = org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)));
    }

    @org.junit.Test
    public void testAnd() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|4", com.cronutils.model.field.expression.And.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|2", com.cronutils.model.field.expression.And.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|0", com.cronutils.model.field.expression.And.class, and).and(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|1", com.cronutils.model.field.expression.FieldExpression.class, expression1))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|3", com.cronutils.model.field.expression.FieldExpression.class, expression2)));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAnd()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|6", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|5", com.cronutils.model.field.expression.And.class, and).getExpressions()).size()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|8", com.cronutils.model.field.expression.FieldExpression.class, expression1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|11", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|10", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|9", com.cronutils.model.field.expression.And.class, and).getExpressions()).get(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|12", com.cronutils.model.field.expression.FieldExpression.class, expression2), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|15", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|14", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAnd()|13", com.cronutils.model.field.expression.And.class, and).getExpressions()).get(1)));
    }

    @org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
    public void testGetExpressionsImmutable() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|2", com.cronutils.model.field.expression.And.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|0", com.cronutils.model.field.expression.And.class, and).and(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|1", com.cronutils.model.field.expression.FieldExpression.class, expression1))).getExpressions()).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|4", com.cronutils.model.field.expression.FieldExpression.class, expression2)));
        } catch (java.lang.UnsupportedOperationException a1552674205372) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.field.expression.AndTest|testGetExpressionsImmutable()|!", a1552674205372);
            throw a1552674205372;
        }
    }

    @org.junit.Test
    public void testAString() throws java.lang.Exception {
        java.lang.String expression1String = "expression1";
        java.lang.String expression2String = "expression2";
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.lang.String>>observeState("com.cronutils.model.field.expression.AndTest|testAString()|4", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.lang.String>>observeState("com.cronutils.model.field.expression.AndTest|testAString()|2", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAString()|0", com.cronutils.model.field.expression.FieldExpression.class, expression1).asString()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|3", expression1String)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.lang.String>>observeState("com.cronutils.model.field.expression.AndTest|testAString()|9", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.lang.String>>observeState("com.cronutils.model.field.expression.AndTest|testAString()|7", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAString()|5", com.cronutils.model.field.expression.FieldExpression.class, expression2).asString()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|8", expression2String)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAString()|14", com.cronutils.model.field.expression.And.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAString()|12", com.cronutils.model.field.expression.And.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAString()|10", com.cronutils.model.field.expression.And.class, and).and(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAString()|11", com.cronutils.model.field.expression.FieldExpression.class, expression1))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.expression.AndTest|testAString()|13", com.cronutils.model.field.expression.FieldExpression.class, expression2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|17", java.lang.String.format("%s,%s", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|15", expression1String), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|16", expression2String))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.AndTest|testAString()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.And>observeState("com.cronutils.model.field.expression.AndTest|testAString()|18", com.cronutils.model.field.expression.And.class, and).asString()));
    }
}
