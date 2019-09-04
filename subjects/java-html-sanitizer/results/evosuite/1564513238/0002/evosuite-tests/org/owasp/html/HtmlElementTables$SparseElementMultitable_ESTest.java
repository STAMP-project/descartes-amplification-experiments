/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:03:21 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.HtmlElementTables;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlElementTables$SparseElementMultitable_ESTest extends HtmlElementTables$SparseElementMultitable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][][] intArray0 = new int[8][1][9];
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray1 = htmlElementTables_SparseElementMultitable0.getElementIndexList(1, 0);
      assertEquals(8, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[2][3];
      int[] intArray1 = new int[6];
      intArray1[0] = 1;
      intArray0[1] = intArray1;
      int[][][] intArray2 = new int[2][6][2];
      intArray2[0] = intArray0;
      intArray2[1] = intArray0;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray2);
      int[] intArray3 = htmlElementTables_SparseElementMultitable0.getElementIndexList(1, 1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray3);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][][] intArray0 = new int[0][8][8];
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray1 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][][] intArray0 = new int[1][3][3];
      int[][] intArray1 = new int[1][7];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      // Undeclared exception!
      try { 
        htmlElementTables_SparseElementMultitable0.getElementIndexList((-1931), 484);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1931
         //
         verifyException("org.owasp.html.HtmlElementTables$SparseElementMultitable", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][][] intArray0 = new int[1][3][3];
      int[][] intArray1 = new int[1][7];
      int[] intArray2 = new int[8];
      intArray2[0] = 32;
      intArray1[0] = intArray2;
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray3 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 32);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray3);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][][] intArray0 = new int[1][3][3];
      int[][] intArray1 = new int[1][7];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 32);
      assertEquals(0, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][][] intArray0 = new int[1][3][3];
      int[][] intArray1 = new int[1][7];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(1998, 2);
      assertEquals(0, intArray2.length);
  }
}