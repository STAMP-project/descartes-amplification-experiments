package com.cronutils.model.field.expression.visitor;


import com.cronutils.Function;
import com.cronutils.model.field.expression.QuestionMark;
import com.cronutils.model.field.value.FieldValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValueMappingFieldExpressionVisitorTest {
    private ValueMappingFieldExpressionVisitor valueMappingFieldExpressionVisitor;

    @Before
    public void setUp() throws Exception {
        Function<FieldValue, FieldValue> transform = new Function<FieldValue, FieldValue>() {
            @Override
            public FieldValue apply(FieldValue input) {
                return input;
            }
        };
        this.valueMappingFieldExpressionVisitor = new ValueMappingFieldExpressionVisitor(transform);
    }

    @Test(timeout = 10000)
    public void testVisitQuestionMark_mg3() throws Exception {
        QuestionMark param = new QuestionMark();
        QuestionMark questionMark = ((QuestionMark) (valueMappingFieldExpressionVisitor.visit(param)));
        boolean boolean_3 = param != questionMark;
        String o_testVisitQuestionMark_mg3__6 = questionMark.asString();
        Assert.assertEquals("?", o_testVisitQuestionMark_mg3__6);
    }
}

