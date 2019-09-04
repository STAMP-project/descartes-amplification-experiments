package io.gsonfire.util.reflection;


/**
 * Created by julio on 10/1/16.
 */
public class CachedReflectionFactoryTest {
    @org.junit.Test
    public void get() throws java.lang.Exception {
        io.gsonfire.util.reflection.CachedReflectionFactory factory = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.reflection.CachedReflectionFactory>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|0", io.gsonfire.util.reflection.CachedReflectionFactory.class, new io.gsonfire.util.reflection.CachedReflectionFactory());
        java.lang.Object obj1 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|2", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.reflection.CachedReflectionFactory>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|1", io.gsonfire.util.reflection.CachedReflectionFactory.class, factory).get(java.lang.Object.class));
        java.lang.Object obj2 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|4", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.reflection.CachedReflectionFactory>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|3", io.gsonfire.util.reflection.CachedReflectionFactory.class, factory).get(java.lang.Object.class));
        java.lang.Object obj3 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashMap>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|6", java.util.HashMap.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.reflection.CachedReflectionFactory>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|5", io.gsonfire.util.reflection.CachedReflectionFactory.class, factory).get(java.util.HashMap.class));
        // Test cache
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|7", java.lang.Object.class, obj1)) == (eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|8", java.lang.Object.class, obj2))));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|9", java.lang.Object.class, obj1)) != (eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|10", java.lang.Object.class, obj3))));
        // Test type of objects
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|11", java.lang.Object.class, obj1).getClass()) == (java.lang.Object.class)));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("io.gsonfire.util.reflection.CachedReflectionFactoryTest|get()|12", java.lang.Object.class, obj3).getClass()) == (java.util.HashMap.class)));
    }
}

