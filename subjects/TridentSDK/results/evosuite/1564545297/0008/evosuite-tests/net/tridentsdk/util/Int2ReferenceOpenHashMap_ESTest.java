/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 04:06:07 GMT 2019
 */

package net.tridentsdk.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.tridentsdk.util.Int2ReferenceOpenHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Int2ReferenceOpenHashMap_ESTest extends Int2ReferenceOpenHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.put((-907), "}g-*v>Y]YQrv:BP");
      int2ReferenceOpenHashMap0.put(2, "4.,");
      int2ReferenceOpenHashMap0.size = (-762);
      int2ReferenceOpenHashMap0.maxFill = (-1516);
      // Undeclared exception!
      int2ReferenceOpenHashMap0.put(32, (String) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.maxFill = 0;
      Object object0 = int2ReferenceOpenHashMap0.put((-1976), (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.maxFill = (-1976);
      int2ReferenceOpenHashMap0.put((-1976), (Object) null);
      int[] intArray0 = new int[8];
      intArray0[0] = (-2411);
      intArray0[1] = 3;
      intArray0[2] = (-2411);
      intArray0[3] = (-16);
      int2ReferenceOpenHashMap0.key = intArray0;
      Object object0 = int2ReferenceOpenHashMap0.put((-16), "AP");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-2946));
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      int2ReferenceOpenHashMap0.put(2433, integer0);
      Integer integer1 = int2ReferenceOpenHashMap0.put(1890, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      Integer integer0 = new Integer(0);
      int2ReferenceOpenHashMap0.put(0, integer0);
      Integer integer1 = int2ReferenceOpenHashMap0.put(0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.put(0, "K.HLAHfK{=fP*/ECP");
      int2ReferenceOpenHashMap0.maxFill = 0;
      Integer integer0 = new Integer(0);
      Object object0 = int2ReferenceOpenHashMap0.put((-1), integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.size = (-762);
      int2ReferenceOpenHashMap0.maxFill = (-1516);
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(32, (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(0, 0.75F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      int2ReferenceOpenHashMap0.key = null;
      Integer integer0 = new Integer(4);
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(1, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.size = 2138904009;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put((-1976), (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2138904011 expected elements with load factor 0.75)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.put(1637, "Load factor must be greater than 0 and smaller than or equal to 1");
      Object object1 = int2ReferenceOpenHashMap0.put(1637, object0);
      assertEquals("Load factor must be greater than 0 and smaller than or equal to 1", object1);
  }
}
