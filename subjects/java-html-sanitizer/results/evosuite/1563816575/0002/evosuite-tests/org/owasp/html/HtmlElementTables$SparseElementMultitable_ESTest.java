/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:32:59 GMT 2019
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
      int[][][] intArray0 = new int[4][4][4];
      int[][] intArray1 = new int[2][9];
      int[] intArray2 = new int[2];
      intArray2[0] = 537;
      intArray1[1] = intArray2;
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      intArray0[2] = intArray1;
      intArray0[3] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray3 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 537);
      assertArrayEquals(new int[] {0}, intArray3);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][][] intArray0 = new int[0][3][7];
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray1 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][][] intArray0 = new int[1][9][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      // Undeclared exception!
      try { 
        htmlElementTables_SparseElementMultitable0.getElementIndexList((-346), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -346
         //
         verifyException("org.owasp.html.HtmlElementTables$SparseElementMultitable", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][][] intArray0 = new int[1][9][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 3543);
      assertEquals(0, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][][] intArray0 = new int[1][9][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 0);
      assertEquals(7, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][][] intArray0 = new int[1][9][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(320, 0);
      assertArrayEquals(new int[] {}, intArray2);
  }
}