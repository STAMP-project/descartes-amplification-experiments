package com.cronutils.model.field.expression.visitor;


public class ValueMappingFieldExpressionVisitorTest {
    private com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitor valueMappingFieldExpressionVisitor;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        com.cronutils.Function<com.cronutils.model.field.value.FieldValue, com.cronutils.model.field.value.FieldValue> transform = new com.cronutils.Function<com.cronutils.model.field.value.FieldValue, com.cronutils.model.field.value.FieldValue>() {
            @java.lang.Override
            public com.cronutils.model.field.value.FieldValue apply(com.cronutils.model.field.value.FieldValue input) {
                return eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.FieldValue>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|setUp()|1", com.cronutils.model.field.value.FieldValue.class, input);
            }
        };
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitor>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|setUp()|3", com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitor.class, (this.valueMappingFieldExpressionVisitor = new com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.value.FieldValue, com.cronutils.model.field.value.FieldValue>>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|setUp()|2", com.cronutils.Function.class, transform))));
    }

    @org.junit.Test
    public void testVisitQuestionMark() throws java.lang.Exception {
        com.cronutils.model.field.expression.QuestionMark param = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.QuestionMark>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|testVisitQuestionMark()|0", com.cronutils.model.field.expression.QuestionMark.class, new com.cronutils.model.field.expression.QuestionMark());
        com.cronutils.model.field.expression.QuestionMark questionMark = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.QuestionMark>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|testVisitQuestionMark()|3", com.cronutils.model.field.expression.QuestionMark.class, ((com.cronutils.model.field.expression.QuestionMark) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitor>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|testVisitQuestionMark()|1", com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitor.class, valueMappingFieldExpressionVisitor).visit(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.QuestionMark>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|testVisitQuestionMark()|2", com.cronutils.model.field.expression.QuestionMark.class, param)))));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.QuestionMark>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|testVisitQuestionMark()|4", com.cronutils.model.field.expression.QuestionMark.class, param)) != (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.QuestionMark>observeState("com.cronutils.model.field.expression.visitor.ValueMappingFieldExpressionVisitorTest|testVisitQuestionMark()|5", com.cronutils.model.field.expression.QuestionMark.class, questionMark))));// not same instance

    }
}

