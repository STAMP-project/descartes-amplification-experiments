package org.owasp.html;


@java.lang.SuppressWarnings("javadoc")
public final class IntVectorTest extends junit.framework.TestCase {
    @org.junit.Test
    public static void testIntVector() {
        java.util.Random r = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.IntVectorTest|testIntVector()|0", java.util.Random.class, new java.util.Random(-6900788808203712465L));
        org.owasp.html.IntVector iv = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|1", org.owasp.html.IntVector.class, new org.owasp.html.IntVector());
        java.util.LinkedList<java.lang.Integer> ad = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|2", java.util.LinkedList.class, new java.util.LinkedList<java.lang.Integer>());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|3", i)) < 200000; ++i) {
            switch (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.IntVectorTest|testIntVector()|4", java.util.Random.class, r).nextInt(4))) {
                case 0 :
                    {
                        int el = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.IntVectorTest|testIntVector()|6", java.util.Random.class, r).nextInt());
                        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|8", org.owasp.html.IntVector.class, iv).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|9", el));
                        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|10", java.util.LinkedList.class, ad).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|11", el)));
                        break;
                    }
                case 1 :
                    if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|13", java.util.LinkedList.class, ad).isEmpty())) {
                        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|15", org.owasp.html.IntVector.class, iv).isEmpty()));
                    }else {
                        int ix = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.IntVectorTest|testIntVector()|17", java.util.Random.class, r).nextInt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|18", java.util.LinkedList.class, ad).size())));
                        int el0 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|21", org.owasp.html.IntVector.class, iv).remove(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|22", ix)));
                        int el1 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|24", java.util.LinkedList.class, ad).remove(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|25", ix)));
                        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|27", el0), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|28", el1));
                    }
                    break;
                case 2 :
                case 3 :
                    if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|30", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|29", java.util.LinkedList.class, ad).isEmpty())) {
                        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|32", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|31", org.owasp.html.IntVector.class, iv).isEmpty()));
                    }else {
                        int ix = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|36", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.IntVectorTest|testIntVector()|33", java.util.Random.class, r).nextInt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|35", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|34", java.util.LinkedList.class, ad).size())));
                        int el0 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|39", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|37", org.owasp.html.IntVector.class, iv).get(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|38", ix)));
                        int el1 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|42", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|40", java.util.LinkedList.class, ad).get(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|41", ix)));
                        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|43", el0), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|44", el1));
                    }
                    break;
            }
        }
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|46", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<java.lang.Integer>>observeState("org.owasp.html.IntVectorTest|testIntVector()|45", java.util.LinkedList.class, ad).toString()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testIntVector()|48", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testIntVector()|47", org.owasp.html.IntVector.class, iv).toString()));
    }

    @org.junit.Test
    public static void testLastIndexOf() {
        org.owasp.html.IntVector v = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|0", org.owasp.html.IntVector.class, new org.owasp.html.IntVector());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|1", i)) < 30; ++i) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|2", org.owasp.html.IntVector.class, v).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|3", i));
        }
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|4", i)) < 10; ++i) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|5", org.owasp.html.IntVector.class, v).remove(0));
        }
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|7", i)) < 11; ++i) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|8", org.owasp.html.IntVector.class, v).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|9", i));
        }
        // State should now be [10 .. 29, 0 .. 10]
        // for indices         [0 .. 19, 20 .. 30]
        junit.framework.TestCase.assertEquals(31, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|10", org.owasp.html.IntVector.class, v).size()));
        int[] contentsLastOrNeg1 = eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|12", int[].class, new int[]{ -1// 10 appears at end too
        , 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|13", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|14", int[].class, contentsLastOrNeg1).length)); ++i) {
            int val = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|16", int[].class, contentsLastOrNeg1)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|17", i)]);
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|19", val)) == (-1)) {
                continue;
            }
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|20", i), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.IntVector>observeState("org.owasp.html.IntVectorTest|testLastIndexOf()|21", org.owasp.html.IntVector.class, v).lastIndexOf(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.IntVectorTest|testLastIndexOf()|22", val))));
        }
    }
}

