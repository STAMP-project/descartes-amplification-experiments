/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.cli;


public class TypeHandlerTest {
    @org.junit.Test
    public void testCreateValueString() throws java.lang.Exception {
        org.junit.Assert.assertEquals("String", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueString()|1", org.apache.commons.cli.TypeHandler.createValue("String", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.lang.String>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueString()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE))));
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueObject_unknownClass() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_unknownClass()|0", java.lang.Object.class, org.apache.commons.cli.TypeHandler.createValue("unknown", org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE));
        } catch (org.apache.commons.cli.ParseException a1552645020276) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_unknownClass()|!", a1552645020276);
            throw a1552645020276;
        }
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueObject_notInstantiableClass() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_notInstantiableClass()|1", java.lang.Object.class, org.apache.commons.cli.TypeHandler.createValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_notInstantiableClass()|0", org.apache.commons.cli.TypeHandlerTest.NotInstantiable.class.getName()), org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE));
        } catch (org.apache.commons.cli.ParseException a1552645020276) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_notInstantiableClass()|!", a1552645020276);
            throw a1552645020276;
        }
    }

    @org.junit.Test
    public void testCreateValueObject_InstantiableClass() throws java.lang.Exception {
        java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_InstantiableClass()|1", java.lang.Object.class, org.apache.commons.cli.TypeHandler.createValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_InstantiableClass()|0", org.apache.commons.cli.TypeHandlerTest.Instantiable.class.getName()), org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueObject_InstantiableClass()|2", java.lang.Object.class, result)) instanceof org.apache.commons.cli.TypeHandlerTest.Instantiable));
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueNumber_noNumber() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Number>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_noNumber()|1", java.lang.Number.class, org.apache.commons.cli.TypeHandler.createValue("not a number", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.lang.Number>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_noNumber()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.NUMBER_VALUE)));
        } catch (org.apache.commons.cli.ParseException a1552645020275) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_noNumber()|!", a1552645020275);
            throw a1552645020275;
        }
    }

    @org.junit.Test
    public void testCreateValueNumber_Double() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1.5, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Number>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_Double()|1", java.lang.Number.class, org.apache.commons.cli.TypeHandler.createValue("1.5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.lang.Number>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_Double()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.NUMBER_VALUE))));
    }

    @org.junit.Test
    public void testCreateValueNumber_Long() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_Long()|0", java.lang.Long.valueOf(15)), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Number>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_Long()|2", java.lang.Number.class, org.apache.commons.cli.TypeHandler.createValue("15", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.lang.Number>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueNumber_Long()|1", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.NUMBER_VALUE))));
    }

    @org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
    public void testCreateValueDate() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueDate()|1", java.util.Date.class, org.apache.commons.cli.TypeHandler.createValue("what ever", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.util.Date>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueDate()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.DATE_VALUE)));
        } catch (java.lang.UnsupportedOperationException a1552645020272) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueDate()|!", a1552645020272);
            throw a1552645020272;
        }
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueClass_notFound() throws java.lang.Exception {
        try {
            org.apache.commons.cli.TypeHandler.createValue("what ever", org.apache.commons.cli.PatternOptionBuilder.CLASS_VALUE);
        } catch (org.apache.commons.cli.ParseException a1552645020272) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueClass_notFound()|!", a1552645020272);
            throw a1552645020272;
        }
    }

    @org.junit.Test
    public void testCreateValueClass() throws java.lang.Exception {
        java.lang.Object clazz = org.apache.commons.cli.TypeHandler.createValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueClass()|0", org.apache.commons.cli.TypeHandlerTest.Instantiable.class.getName()), org.apache.commons.cli.PatternOptionBuilder.CLASS_VALUE);
        org.junit.Assert.assertEquals(org.apache.commons.cli.TypeHandlerTest.Instantiable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueClass()|1", java.lang.Object.class, clazz));
    }

    @org.junit.Test
    public void testCreateValueFile() throws java.lang.Exception {
        java.io.File result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueFile()|1", java.io.File.class, org.apache.commons.cli.TypeHandler.createValue("some-file.txt", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.io.File>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueFile()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE)));
        org.junit.Assert.assertEquals("some-file.txt", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueFile()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueFile()|2", java.io.File.class, result).getName()));
    }

    @org.junit.Test
    public void testCreateValueExistingFile() throws java.lang.Exception {
        java.io.FileInputStream result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueExistingFile()|1", java.io.FileInputStream.class, org.apache.commons.cli.TypeHandler.createValue("src/test/resources/existing-readable.file", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.io.FileInputStream>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueExistingFile()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.EXISTING_FILE_VALUE)));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueExistingFile()|2", java.io.FileInputStream.class, result));
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueExistingFile_nonExistingFile() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueExistingFile_nonExistingFile()|1", java.io.FileInputStream.class, org.apache.commons.cli.TypeHandler.createValue("non-existing.file", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.io.FileInputStream>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueExistingFile_nonExistingFile()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.EXISTING_FILE_VALUE)));
        } catch (org.apache.commons.cli.ParseException a1552645020273) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueExistingFile_nonExistingFile()|!", a1552645020273);
            throw a1552645020273;
        }
    }

    @org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
    public void testCreateValueFiles() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File[]>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueFiles()|1", java.io.File[].class, org.apache.commons.cli.TypeHandler.createValue("some.files", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.io.File[]>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueFiles()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.FILES_VALUE)));
        } catch (java.lang.UnsupportedOperationException a1552645020274) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueFiles()|!", a1552645020274);
            throw a1552645020274;
        }
    }

    @org.junit.Test
    public void testCreateValueURL() throws java.lang.Exception {
        java.lang.String urlString = "http://commons.apache.org";
        java.net.URL result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL()|2", java.net.URL.class, org.apache.commons.cli.TypeHandler.createValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL()|0", urlString), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.net.URL>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL()|1", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.URL_VALUE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL()|3", urlString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL()|4", java.net.URL.class, result).toString()));
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueURL_malformed() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL_malformed()|1", java.net.URL.class, org.apache.commons.cli.TypeHandler.createValue("malformed-url", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Class<java.net.URL>>observeState("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL_malformed()|0", java.lang.Class.class, org.apache.commons.cli.PatternOptionBuilder.URL_VALUE)));
        } catch (org.apache.commons.cli.ParseException a1552645020277) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueURL_malformed()|!", a1552645020277);
            throw a1552645020277;
        }
    }

    @org.junit.Test(expected = org.apache.commons.cli.ParseException.class)
    public void testCreateValueInteger_failure() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.TypeHandlerTest|testCreateValueInteger_failure()|0", org.apache.commons.cli.TypeHandler.createValue("just-a-string", java.lang.Integer.class));
        } catch (org.apache.commons.cli.ParseException a1552645020274) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.TypeHandlerTest|testCreateValueInteger_failure()|!", a1552645020274);
            throw a1552645020274;
        }
    }

    public static class Instantiable {}

    public static class NotInstantiable {
        private NotInstantiable() {
        }
    }
}

