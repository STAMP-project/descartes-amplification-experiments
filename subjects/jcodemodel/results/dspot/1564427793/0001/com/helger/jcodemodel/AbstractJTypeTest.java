package com.helger.jcodemodel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;


public final class AbstractJTypeTest {
    private static final class AssignmentTypes {
        private final AbstractJClass m_aVariable;

        private final AbstractJClass m_aValue;

        public AssignmentTypes(final AbstractJClass aVariable, final AbstractJClass aValue) {
            m_aVariable = aVariable;
            m_aValue = aValue;
        }
    }

    private List<AbstractJClass> freshTypes = new ArrayList<>();

    private List<AbstractJTypeTest.AssignmentTypes> freshAssignableTypes = new ArrayList<>();

    @Nonnull
    private void _registerType(final AbstractJClass type) {
        freshTypes.add(type);
    }

    @Nonnull
    private List<AbstractJClass> _refreshTypes() {
        final List<AbstractJClass> result = freshTypes;
        freshTypes = new ArrayList<>();
        return result;
    }

    @Nonnull
    private List<AbstractJTypeTest.AssignmentTypes> _refreshAssignableTypes() {
        final List<AbstractJTypeTest.AssignmentTypes> result = freshAssignableTypes;
        freshAssignableTypes = new ArrayList<>();
        return result;
    }

    private void _assertIsAssignableInTopLevelPositionOnly(final AbstractJClass variable, final AbstractJClass value) {
        final boolean result = variable.isAssignableFrom(value);
        Assert.assertTrue(((("Expecting " + variable) + " to be assignable from ") + value), result);
    }

    private void _assertIsAssignable(final AbstractJClass variable, final AbstractJClass value) {
        freshAssignableTypes.add(new AbstractJTypeTest.AssignmentTypes(variable, value));
        _assertIsAssignableInTopLevelPositionOnly(variable, value);
    }

    private void _assertIsNotAssignable(final AbstractJClass variable, final AbstractJClass value) {
        final boolean result = variable.isAssignableFrom(value);
        Assert.assertFalse(((("Expecting " + variable) + " not to be assignable from ") + value), result);
    }

    @After
    public void cleanup() {
        _refreshTypes();
        _refreshAssignableTypes();
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg76() throws Exception {
        String __DSPOT_sName_13 = "}Lq8xal:7%uE_&Ml%;sG";
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type);
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        JDirectClass o_testIsAssignableFromRandomized_mg76__71 = codeModel.directClass(__DSPOT_sName_13);
        Assert.assertEquals(1800384935, ((int) (((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(}Lq8xal:7%uE_&Ml%;sG)", ((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isError());
        Assert.assertTrue(((JDirectClass) (o_testIsAssignableFromRandomized_mg76__71)).isReference());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg85() throws Exception {
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type);
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        JArrayClass o_testIsAssignableFromRandomized_mg85__70 = _Object.array();
        Assert.assertFalse(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isInterface());
        Assert.assertTrue(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isArray());
        Assert.assertFalse(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.Object[])", ((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isParameterized());
        Assert.assertTrue(((Collection) (((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isError());
        Assert.assertTrue(((JArrayClass) (o_testIsAssignableFromRandomized_mg85__70)).isReference());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg135() throws Exception {
        Class<?>[] __DSPOT_aClazzes_40 = new Class<?>[]{  };
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type);
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        AbstractJClass o_testIsAssignableFromRandomized_mg135__71 = _List.narrow(__DSPOT_aClazzes_40);
        Assert.assertTrue(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(java.util.List<>)", ((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).toString());
        Assert.assertNull(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).getPrimitiveType());
        Assert.assertTrue(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isParameterized());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg135__71)).isReference());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg123() throws Exception {
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        AbstractJType o_testIsAssignableFromRandomized_mg123__70 = _Integer.unboxify();
        Assert.assertTrue(((JPrimitiveType) (o_testIsAssignableFromRandomized_mg123__70)).isPrimitive());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(int)", ((JPrimitiveType) (o_testIsAssignableFromRandomized_mg123__70)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testIsAssignableFromRandomized_mg123__70)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testIsAssignableFromRandomized_mg123__70)).isError());
        Assert.assertFalse(((JPrimitiveType) (o_testIsAssignableFromRandomized_mg123__70)).isReference());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg145() throws Exception {
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type);
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        JTypeWildcard o_testIsAssignableFromRandomized_mg145__70 = _List.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.util.List)", ((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testIsAssignableFromRandomized_mg145__70)).isReference());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg94() throws Exception {
        List<? extends AbstractJClass> __DSPOT_aClazz_25 = Collections.emptyList();
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type);
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        AbstractJClass o_testIsAssignableFromRandomized_mg94__72 = _Object.narrow(__DSPOT_aClazz_25);
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(java.lang.Object<>)", ((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).toString());
        Assert.assertNull(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).getPrimitiveType());
        Assert.assertTrue(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isParameterized());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testIsAssignableFromRandomized_mg94__72)).isReference());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg159_failAssert0() throws Exception {
        try {
            final JCodeModel codeModel = new JCodeModel();
            final AbstractJClass _Object = codeModel.ref(Object.class);
            final AbstractJClass _Integer = codeModel.ref(Integer.class);
            final AbstractJClass _List = codeModel.ref(List.class);
            _registerType(_Object);
            _registerType(_Integer);
            _registerType(_List);
            for (int i = 0; i < 2; i++) {
                for (final AbstractJClass type : _refreshTypes()) {
                    _registerType(_List.narrow(type));
                    _registerType(_List.narrow(type.wildcardExtends()));
                    _registerType(_List.narrow(type.wildcardSuper()));
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type.wildcardExtends());
                    _List.narrow(type);
                    _List.narrow(type.wildcardExtends());
                    _List.narrow(type.wildcardSuper());
                    _List.narrow(type.wildcardSuper());
                    _List.narrow(type.wildcardExtends());
                    _List.narrow(type.wildcardSuper());
                    _List.narrow(type);
                    type.narrowEmpty();
                }
                for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                    if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                        _List.narrow(assignment.m_aVariable);
                        _List.narrow(assignment.m_aValue);
                    }
                    _List.narrow(assignment.m_aVariable.wildcardExtends());
                    _List.narrow(assignment.m_aValue);
                    _List.narrow(assignment.m_aVariable.wildcardExtends());
                    _List.narrow(assignment.m_aValue.wildcardExtends());
                    _List.narrow(assignment.m_aValue.wildcardSuper());
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue.wildcardSuper());
                    _List.narrow(assignment.m_aVariable.wildcardSuper());
                }
            }
            org.junit.Assert.fail("testIsAssignableFromRandomized_mg159 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(java.util.List<java.lang.Object>)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg69() throws Exception {
        String __DSPOT_sName_4 = "UgIvC=TU&zgYc TM1`_8";
        final JCodeModel codeModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass _Object = codeModel.ref(Object.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        final AbstractJClass _Integer = codeModel.ref(Integer.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        final AbstractJClass _List = codeModel.ref(List.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
        _registerType(_Object);
        _registerType(_Integer);
        _registerType(_List);
        for (int i = 0; i < 2; i++) {
            for (final AbstractJClass type : _refreshTypes()) {
                _registerType(_List.narrow(type));
                _registerType(_List.narrow(type.wildcardExtends()));
                _registerType(_List.narrow(type.wildcardSuper()));
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type);
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type.wildcardExtends());
                _List.narrow(type.wildcardSuper());
                _List.narrow(type);
            }
            for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue);
                }
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue);
                _List.narrow(assignment.m_aVariable.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardExtends());
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable);
                _List.narrow(assignment.m_aValue.wildcardSuper());
                _List.narrow(assignment.m_aVariable.wildcardSuper());
            }
        }
        JPackage o_testIsAssignableFromRandomized_mg69__71 = codeModel._package(__DSPOT_sName_4);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).isPackage());
        Assert.assertFalse(((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).isClass());
        Assert.assertFalse(((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIsAssignableFromRandomized_mg69__71)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (codeModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (codeModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (codeModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (codeModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (_Object)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Object)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Object)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Object)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Object)).isError());
        Assert.assertTrue(((JReferencedClass) (_Object)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Integer)", ((JReferencedClass) (_Integer)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_Integer)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isArray());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_Integer)).isError());
        Assert.assertTrue(((JReferencedClass) (_Integer)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.util.List)", ((JReferencedClass) (_List)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (_List)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (_List)).isArray());
        Assert.assertFalse(((JReferencedClass) (_List)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (_List)).isError());
        Assert.assertTrue(((JReferencedClass) (_List)).isReference());
    }

    @Test(timeout = 10000)
    public void testIsAssignableFromRandomized_mg100_failAssert0() throws Exception {
        try {
            String __DSPOT_sField_27 = "ND7C-6y}W`_*s>).BmtV";
            final JCodeModel codeModel = new JCodeModel();
            final AbstractJClass _Object = codeModel.ref(Object.class);
            final AbstractJClass _Integer = codeModel.ref(Integer.class);
            final AbstractJClass _List = codeModel.ref(List.class);
            _registerType(_Object);
            _registerType(_Integer);
            _registerType(_List);
            for (int i = 0; i < 2; i++) {
                for (final AbstractJClass type : _refreshTypes()) {
                    _registerType(_List.narrow(type));
                    _registerType(_List.narrow(type.wildcardExtends()));
                    _registerType(_List.narrow(type.wildcardSuper()));
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type);
                    _List.narrow(type.wildcardExtends());
                    _List.narrow(type);
                    _List.narrow(type.wildcardExtends());
                    _List.narrow(type.wildcardSuper());
                    _List.narrow(type.wildcardSuper());
                    _List.narrow(type.wildcardExtends());
                    _List.narrow(type.wildcardSuper());
                    _List.narrow(type);
                }
                for (final AbstractJTypeTest.AssignmentTypes assignment : _refreshAssignableTypes()) {
                    if (!(assignment.m_aValue.equals(assignment.m_aVariable))) {
                        _List.narrow(assignment.m_aVariable);
                        _List.narrow(assignment.m_aValue);
                    }
                    _List.narrow(assignment.m_aVariable.wildcardExtends());
                    _List.narrow(assignment.m_aValue);
                    _List.narrow(assignment.m_aVariable.wildcardExtends());
                    _List.narrow(assignment.m_aValue.wildcardExtends());
                    _List.narrow(assignment.m_aValue.wildcardSuper());
                    _List.narrow(assignment.m_aVariable);
                    _List.narrow(assignment.m_aValue.wildcardSuper());
                    _List.narrow(assignment.m_aVariable.wildcardSuper());
                }
            }
            _Object.staticRef(__DSPOT_sField_27);
            org.junit.Assert.fail("testIsAssignableFromRandomized_mg100 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Field name contains \'.\': ND7C-6y}W`_*s>).BmtV", expected.getMessage());
        }
    }
}

