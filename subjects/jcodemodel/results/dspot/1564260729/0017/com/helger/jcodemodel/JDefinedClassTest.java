package com.helger.jcodemodel;


import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.InitializerDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import org.junit.Assert;
import org.junit.Test;


public final class JDefinedClassTest {
    @Test(timeout = 10000)
    public void generatesInstanceInit_rv141_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_42 = 1160956515;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c = cm._package("myPackage")._class(0, "MyClass");
            c.headerComment().add("Line 1\nLine 2\nLine 3");
            final JFieldVar myField = c.field(JMod.PRIVATE, String.class, "myField");
            JBlock __DSPOT_invoc_11 = c.instanceInit().assign(JExpr._this().ref(myField), JExpr.lit("myValue"));
            final CompilationUnit aCU = CodeModelTestsHelper.parseAndGetSingleClassCodeModel(cm);
            final TypeDeclaration<?> typeDeclaration = aCU.getTypes().get(0);
            final ClassOrInterfaceDeclaration classDeclaration = ((ClassOrInterfaceDeclaration) (typeDeclaration));
            final InitializerDeclaration initializerDeclaration = ((InitializerDeclaration) (classDeclaration.getMembers().get(1)));
            __DSPOT_invoc_11.pos(__DSPOT_nNewPos_42);
            org.junit.Assert.fail("generatesInstanceInit_rv141 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 1160956515", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void generatesInstanceInit_rv142_failAssert0() throws Exception {
        try {
            int __DSPOT_index_43 = -338994308;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c = cm._package("myPackage")._class(0, "MyClass");
            c.headerComment().add("Line 1\nLine 2\nLine 3");
            final JFieldVar myField = c.field(JMod.PRIVATE, String.class, "myField");
            JBlock __DSPOT_invoc_11 = c.instanceInit().assign(JExpr._this().ref(myField), JExpr.lit("myValue"));
            final CompilationUnit aCU = CodeModelTestsHelper.parseAndGetSingleClassCodeModel(cm);
            final TypeDeclaration<?> typeDeclaration = aCU.getTypes().get(0);
            final ClassOrInterfaceDeclaration classDeclaration = ((ClassOrInterfaceDeclaration) (typeDeclaration));
            final InitializerDeclaration initializerDeclaration = ((InitializerDeclaration) (classDeclaration.getMembers().get(1)));
            __DSPOT_invoc_11.remove(__DSPOT_index_43);
            org.junit.Assert.fail("generatesInstanceInit_rv142 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -338994308 out of bounds for length 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void generatesInstanceInit_mg107_failAssert0() throws Exception {
        try {
            String __DSPOT_sNewName_31 = "6;bU#J;!9+7]6k!Ld8U4";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c = cm._package("myPackage")._class(0, "MyClass");
            c.headerComment().add("Line 1\nLine 2\nLine 3");
            final JFieldVar myField = c.field(JMod.PRIVATE, String.class, "myField");
            c.instanceInit().assign(JExpr._this().ref(myField), JExpr.lit("myValue"));
            final CompilationUnit aCU = CodeModelTestsHelper.parseAndGetSingleClassCodeModel(cm);
            final TypeDeclaration<?> typeDeclaration = aCU.getTypes().get(0);
            final ClassOrInterfaceDeclaration classDeclaration = ((ClassOrInterfaceDeclaration) (typeDeclaration));
            final InitializerDeclaration initializerDeclaration = ((InitializerDeclaration) (classDeclaration.getMembers().get(1)));
            myField.name(__DSPOT_sNewName_31);
            org.junit.Assert.fail("generatesInstanceInit_mg107 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'6;bU#J;!9+7]6k!Ld8U4\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void generatesInstanceInit_literalMutationNumber25_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c = cm._package("myPackage")._class(-1, "MyClass");
            c.headerComment().add("Line 1\nLine 2\nLine 3");
            final JFieldVar myField = c.field(JMod.PRIVATE, String.class, "myField");
            c.instanceInit().assign(JExpr._this().ref(myField), JExpr.lit("myValue"));
            final CompilationUnit aCU = CodeModelTestsHelper.parseAndGetSingleClassCodeModel(cm);
            final TypeDeclaration<?> typeDeclaration = aCU.getTypes().get(0);
            final ClassOrInterfaceDeclaration classDeclaration = ((ClassOrInterfaceDeclaration) (typeDeclaration));
            final InitializerDeclaration initializerDeclaration = ((InitializerDeclaration) (classDeclaration.getMembers().get(1)));
            org.junit.Assert.fail("generatesInstanceInit_literalMutationNumber25 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void generatesInstanceInit_literalMutationString40_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c = cm._package("myPackage")._class(0, "MyClass");
            c.headerComment().add("Line 1\nLine 2\nLine 3");
            final JFieldVar myField = c.field(JMod.PRIVATE, String.class, "");
            c.instanceInit().assign(JExpr._this().ref(myField), JExpr.lit("myValue"));
            final CompilationUnit aCU = CodeModelTestsHelper.parseAndGetSingleClassCodeModel(cm);
            final TypeDeclaration<?> typeDeclaration = aCU.getTypes().get(0);
            final ClassOrInterfaceDeclaration classDeclaration = ((ClassOrInterfaceDeclaration) (typeDeclaration));
            final InitializerDeclaration initializerDeclaration = ((InitializerDeclaration) (classDeclaration.getMembers().get(1)));
            org.junit.Assert.fail("generatesInstanceInit_literalMutationString40 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }
}

