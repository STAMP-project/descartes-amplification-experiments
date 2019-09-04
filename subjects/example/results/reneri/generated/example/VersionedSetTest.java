package example;


public class VersionedSetTest {
    @org.junit.Test
    public void testAdd() {
        example.VersionedSet list = eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testAdd()|0", example.VersionedSet.class, new example.VersionedSet());
        eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testAdd()|1", example.VersionedSet.class, list).add(1);
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("example.VersionedSetTest|testAdd()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testAdd()|2", example.VersionedSet.class, list).size()));
    }

    @org.junit.Test
    public void testEquals() {
        example.VersionedSet one = eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testEquals()|0", example.VersionedSet.class, new example.VersionedSet());
        example.VersionedSet two = eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testEquals()|1", example.VersionedSet.class, new example.VersionedSet());
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("example.VersionedSetTest|testEquals()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testEquals()|2", example.VersionedSet.class, one).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testEquals()|3", example.VersionedSet.class, two))));
    }

    @org.junit.Test
    public void testIntersection() {
        example.VersionedSet one = eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|0", example.VersionedSet.class, new example.VersionedSet());
        eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|1", example.VersionedSet.class, one).add(1);
        example.VersionedSet two = eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|2", example.VersionedSet.class, new example.VersionedSet());
        eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|3", example.VersionedSet.class, two).add(2);
        example.VersionedSet result = eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|6", example.VersionedSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|4", example.VersionedSet.class, one).intersect(eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|5", example.VersionedSet.class, two)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("example.VersionedSetTest|testIntersection()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|7", example.VersionedSet.class, result).contains(1)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("example.VersionedSetTest|testIntersection()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<example.VersionedSet>observeState("example.VersionedSetTest|testIntersection()|9", example.VersionedSet.class, result).contains(2)));
    }
}

