/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 17:48:05 GMT 2019
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
  public void test00()  throws Throwable  {
      int[][][] intArray0 = new int[2][8][5];
      int[][] intArray1 = new int[3][0];
      int[] intArray2 = new int[6];
      intArray1[0] = intArray2;
      int[] intArray3 = new int[4];
      intArray3[0] = 1987526137;
      intArray1[1] = intArray3;
      intArray1[2] = intArray2;
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
  public void test01()  throws Throwable  {
      int[][][] intArray0 = new int[4][1][4];
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[][] intArray0 = new int[5][7];
      int[] intArray1 = new int[4];
      intArray1[1] = 253;
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [I@53490c26
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[][] intArray0 = new int[6][3];
      int[] intArray1 = new int[2];
      intArray1[0] = (-621);
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
  public void test04()  throws Throwable  {
      int[][] intArray0 = new int[4][2];
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
  public void test05()  throws Throwable  {
      int[][] intArray0 = new int[8][4];
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [I@1bc4cfb3
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
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
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "hV";
      HtmlElementTables.HtmlElementNames htmlElementTables_HtmlElementNames0 = new HtmlElementTables.HtmlElementNames(stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel((byte[]) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[][] intArray0 = new int[0][9];
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[][][] intArray0 = new int[4][8][9];
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
  public void test12()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      HtmlElementTables.HtmlElementNames htmlElementTables_HtmlElementNames0 = new HtmlElementTables.HtmlElementNames(linkedList0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      HtmlElementTables.DenseElementSet htmlElementTables_DenseElementSet0 = new HtmlElementTables.DenseElementSet(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = null;
      try {
        htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 930);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
