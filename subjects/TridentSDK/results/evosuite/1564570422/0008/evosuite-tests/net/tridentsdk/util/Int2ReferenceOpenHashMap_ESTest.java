/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 11:05:05 GMT 2019
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
  public void test0()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      Object object0 = int2ReferenceOpenHashMap0.put(1, "Tl}5n#)Xe eXFzF");
      int2ReferenceOpenHashMap0.put((-236), "Tl}5n#)Xe eXFzF");
      int2ReferenceOpenHashMap0.put((-14), (Object) null);
      Object object1 = int2ReferenceOpenHashMap0.put((-23), object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.maxFill = 1;
      int2ReferenceOpenHashMap0.put((-236), "]X*4U");
      int2ReferenceOpenHashMap0.put(1, "h\"");
      String string0 = int2ReferenceOpenHashMap0.put((-2043), "o'F)Q|8;'1d-w+&");
      assertNull(string0);
      
      String string1 = int2ReferenceOpenHashMap0.put((-2043), "h\"");
      assertEquals("o'F)Q|8;'1d-w+&", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap0.put(0, "Tl}5n#)Xe eXFzF");
      Object object0 = int2ReferenceOpenHashMap0.put(0, (Object) null);
      assertEquals("Tl}5n#)Xe eXFzF", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap0.put(1, "Tl}5n#)Xe eXFzF");
      int2ReferenceOpenHashMap0.put((-230), (Object) null);
      int2ReferenceOpenHashMap0.maxFill = (-23);
      Object object0 = int2ReferenceOpenHashMap0.put(0, "Tl}5n#)Xe eXFzF");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap0.size = (-23);
      int2ReferenceOpenHashMap0.maxFill = (-23);
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(0, "Tl}5n#)Xe eXFzF");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap0.put(1, "Tl}5n#)Xe eXFzF");
      Object object0 = int2ReferenceOpenHashMap0.put(1, "Tl}5n#)Xe eXFzF");
      assertEquals("Tl}5n#)Xe eXFzF", object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>(1, 1);
      int[] intArray0 = new int[2];
      intArray0[0] = (-2740);
      intArray0[1] = (-2740);
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.put(1, (Integer) intArray0[0]);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.value = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put((-1), (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.size = 2144914887;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(1, "h\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2144914889 expected elements with load factor 0.75)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }
}
