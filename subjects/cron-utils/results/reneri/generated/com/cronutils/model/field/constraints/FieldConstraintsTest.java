package com.cronutils.model.field.constraints;


/* Copyright 2015 jmrozanec
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
public class FieldConstraintsTest {
    private java.util.Map<java.lang.String, java.lang.Integer> stringMapping;

    private java.util.Map<java.lang.Integer, java.lang.Integer> intMapping;

    private java.util.Set<com.cronutils.model.field.value.SpecialChar> specialCharSet;

    private int startRange;

    private int endRange;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.Integer, java.lang.Integer>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|setUp()|0", java.util.Map.class, (intMapping = com.google.common.collect.Maps.newHashMap()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, java.lang.Integer>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|setUp()|1", java.util.Map.class, (stringMapping = com.google.common.collect.Maps.newHashMap()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.value.SpecialChar>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|setUp()|2", java.util.Set.class, (specialCharSet = com.google.common.collect.Sets.newHashSet()));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|setUp()|3", (startRange = 0));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|setUp()|4", (endRange = 59));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorStringMappingNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorStringMappingNull()|4", com.cronutils.model.field.constraint.FieldConstraints.class, new com.cronutils.model.field.constraint.FieldConstraints(null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.Integer, java.lang.Integer>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorStringMappingNull()|0", java.util.Map.class, intMapping), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.value.SpecialChar>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorStringMappingNull()|1", java.util.Set.class, specialCharSet), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorStringMappingNull()|2", startRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorStringMappingNull()|3", endRange)));
        } catch (java.lang.NullPointerException a1552674205252) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorStringMappingNull()|!", a1552674205252);
            throw a1552674205252;
        }
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorIntMappingNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorIntMappingNull()|4", com.cronutils.model.field.constraint.FieldConstraints.class, new com.cronutils.model.field.constraint.FieldConstraints(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, java.lang.Integer>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorIntMappingNull()|0", java.util.Map.class, stringMapping), null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.value.SpecialChar>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorIntMappingNull()|1", java.util.Set.class, specialCharSet), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorIntMappingNull()|2", startRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorIntMappingNull()|3", endRange)));
        } catch (java.lang.NullPointerException a1552674205251) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.field.constraints.FieldConstraintsTest|testConstructorIntMappingNull()|!", a1552674205251);
            throw a1552674205251;
        }
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testSpecialCharsSetNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testSpecialCharsSetNull()|4", com.cronutils.model.field.constraint.FieldConstraints.class, new com.cronutils.model.field.constraint.FieldConstraints(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, java.lang.Integer>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testSpecialCharsSetNull()|0", java.util.Map.class, stringMapping), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.Integer, java.lang.Integer>>observeState("com.cronutils.model.field.constraints.FieldConstraintsTest|testSpecialCharsSetNull()|1", java.util.Map.class, intMapping), null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|testSpecialCharsSetNull()|2", startRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.constraints.FieldConstraintsTest|testSpecialCharsSetNull()|3", endRange)));
        } catch (java.lang.NullPointerException a1552674205253) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.field.constraints.FieldConstraintsTest|testSpecialCharsSetNull()|!", a1552674205253);
            throw a1552674205253;
        }
    }
}

