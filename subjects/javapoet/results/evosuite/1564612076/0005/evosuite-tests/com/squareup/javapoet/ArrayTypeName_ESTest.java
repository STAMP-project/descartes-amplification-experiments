/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 22:34:56 GMT 2019
 */

package com.squareup.javapoet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.TypeVariableName;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ArrayTypeName_ESTest extends ArrayTypeName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Type, TypeVariableName> hashMap0 = new HashMap<Type, TypeVariableName>();
      // Undeclared exception!
      try { 
        ArrayTypeName.get((GenericArrayType) null, (Map<Type, TypeVariableName>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.javapoet.ArrayTypeName", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Type, TypeVariableName> hashMap0 = new HashMap<Type, TypeVariableName>();
      Type[] typeArray0 = new Type[0];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getLowerBounds();
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      GenericMetadataSupport.WildCardBoundedType genericMetadataSupport_WildCardBoundedType0 = new GenericMetadataSupport.WildCardBoundedType(wildcardType0);
      GenericArrayType genericArrayType0 = mock(GenericArrayType.class, new ViolatedAssumptionAnswer());
      doReturn(genericMetadataSupport_WildCardBoundedType0).when(genericArrayType0).getGenericComponentType();
      // Undeclared exception!
      try { 
        ArrayTypeName.get(genericArrayType0, (Map<Type, TypeVariableName>) hashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.internal.util.reflection.GenericMetadataSupport$WildCardBoundedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenericArrayType genericArrayType0 = mock(GenericArrayType.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null).when(genericArrayType0).getGenericComponentType();
      HashMap<Type, TypeVariableName> hashMap0 = new HashMap<Type, TypeVariableName>();
      // Undeclared exception!
      try { 
        ArrayTypeName.get(genericArrayType0, (Map<Type, TypeVariableName>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unexpected type: null
         //
         verifyException("com.squareup.javapoet.TypeName", e);
      }
  }
}