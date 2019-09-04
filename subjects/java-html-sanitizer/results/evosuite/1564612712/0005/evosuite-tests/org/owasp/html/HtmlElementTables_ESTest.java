/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 22:44:59 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.HtmlElementTables;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlElementTables_ESTest extends HtmlElementTables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][][] intArray0 = new int[7][1][0];
      int[][] intArray1 = new int[7][6];
      int[] intArray2 = new int[2];
      intArray2[0] = 132;
      intArray1[1] = intArray2;
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = null;
      try {
        htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][][] intArray0 = new int[2][2][2];
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = null;
      try {
        htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[4][7];
      int[] intArray1 = new int[3];
      intArray1[1] = (-2274);
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [I@6338336c
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[6][6];
      int[] intArray1 = new int[9];
      intArray1[0] = (-936);
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[2][3];
      int[] intArray1 = new int[2];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[2][3];
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [I@3ecdcefd
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = null;
      try {
        htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = null;
      try {
        htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 6564);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      HtmlElementTables.HtmlElementNames htmlElementTables_HtmlElementNames0 = new HtmlElementTables.HtmlElementNames(linkedList0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "li";
      stringArray0[1] = "";
      HtmlElementTables.HtmlElementNames htmlElementTables_HtmlElementNames0 = new HtmlElementTables.HtmlElementNames(stringArray0);
      boolean[] booleanArray0 = new boolean[0];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 0);
      int[][] intArray0 = new int[0][8];
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
      int[][][] intArray1 = new int[8][5][4];
      int[][] intArray2 = new int[0][5];
      intArray1[0] = intArray2;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray1);
      byte[] byteArray0 = new byte[6];
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel(byteArray0);
      HtmlElementTables.DenseElementSet htmlElementTables_DenseElementSet0 = new HtmlElementTables.DenseElementSet(booleanArray0);
      HtmlElementTables htmlElementTables0 = null;
      try {
        htmlElementTables0 = new HtmlElementTables(htmlElementTables_HtmlElementNames0, htmlElementTables_DenseElementBinaryMatrix0, htmlElementTables_DenseElementBinaryMatrix0, htmlElementTables_DenseElementBinaryMatrix0, htmlElementTables_SparseElementToElements0, htmlElementTables_SparseElementMultitable0, htmlElementTables_TextContentModel0, htmlElementTables_DenseElementSet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}