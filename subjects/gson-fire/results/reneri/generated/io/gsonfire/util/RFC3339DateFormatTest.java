package io.gsonfire.util;


/**
 *
 *
 * @unknown julio
 */
public class RFC3339DateFormatTest {
    @org.junit.Test
    public void testParseSimple() throws java.lang.Exception {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseSimple()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseSimple()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseSimple()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2014-01-06T12:45:01-05:00"));
        org.junit.Assert.assertEquals(1389030301000L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseSimple()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseSimple()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseNoTZ() throws java.lang.Exception {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseNoTZ()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseNoTZ()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseNoTZ()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2014-01-06T17:45:01"));
        org.junit.Assert.assertEquals(1389030301000L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseNoTZ()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseNoTZ()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseTimezoneShiftDays() throws java.lang.Exception {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseTimezoneShiftDays()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseTimezoneShiftDays()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseTimezoneShiftDays()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2013-02-06T21:29:08-05:00"));
        org.junit.Assert.assertEquals(1360204148000L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseTimezoneShiftDays()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseTimezoneShiftDays()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseWithMillis() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseWithMillis()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseWithMillis()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseWithMillis()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2013-02-07T02:29:08.123Z"));
        org.junit.Assert.assertEquals(1360204148123L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseWithMillis()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseWithMillis()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseLowerCase() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseLowerCase()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseLowerCase()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseLowerCase()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2013-02-07t02:29:08.123z"));
        org.junit.Assert.assertEquals(1360204148123L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseLowerCase()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseLowerCase()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseDate_NoTime() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_NoTime()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat(false));
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_NoTime()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_NoTime()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2013-02-07"));
        org.junit.Assert.assertEquals(1360195200000L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_NoTime()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_NoTime()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseDateTime_NoTime() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDateTime_NoTime()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat(false));
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDateTime_NoTime()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDateTime_NoTime()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2013-02-07T02:29:08.123Z"));
        org.junit.Assert.assertEquals(1360204148123L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseDateTime_NoTime()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDateTime_NoTime()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testParseDate_Time() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_Time()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.util.Date date = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_Time()|2", java.util.Date.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_Time()|1", io.gsonfire.util.RFC3339DateFormat.class, format).parse("2013-02-07"));
        org.junit.Assert.assertEquals(1360195200000L, eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_Time()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testParseDate_Time()|3", java.util.Date.class, date).getTime()));// Unix timestamp created with http://www.unixtimestamp.com/index.php

    }

    @org.junit.Test
    public void testFormatWithoutMillis() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithoutMillis()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.lang.String formatted = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithoutMillis()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithoutMillis()|1", io.gsonfire.util.RFC3339DateFormat.class, format).format(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithoutMillis()|2", java.util.Date.class, new java.util.Date(1360204148000L))));
        org.junit.Assert.assertEquals("2013-02-07T02:29:08Z", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithoutMillis()|4", formatted));
    }

    @org.junit.Test
    public void testFormatWithMillis() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat());
        java.lang.String formatted = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis()|1", io.gsonfire.util.RFC3339DateFormat.class, format).format(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis()|2", java.util.Date.class, new java.util.Date(1360204148123L))));
        org.junit.Assert.assertEquals("2013-02-07T02:29:08.123Z", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis()|4", formatted));
    }

    @org.junit.Test
    public void testFormatWithMillis_NY() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_NY()|1", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.TimeZone>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_NY()|0", java.util.TimeZone.class, java.util.TimeZone.getTimeZone("America/New_York"))));
        java.lang.String formatted = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_NY()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_NY()|2", io.gsonfire.util.RFC3339DateFormat.class, format).format(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_NY()|3", java.util.Date.class, new java.util.Date(1360204148123L))));
        org.junit.Assert.assertEquals("2013-02-06T21:29:08.123-05:00", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_NY()|5", formatted));
    }

    @org.junit.Test
    public void testFormatWithMillis_CCS() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_CCS()|1", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.TimeZone>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_CCS()|0", java.util.TimeZone.class, java.util.TimeZone.getTimeZone("America/Caracas"))));
        java.lang.String formatted = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_CCS()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_CCS()|2", io.gsonfire.util.RFC3339DateFormat.class, format).format(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_CCS()|3", java.util.Date.class, new java.util.Date(1360204148123L))));
        org.junit.Assert.assertEquals("2013-02-06T21:59:08.123-04:30", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatWithMillis_CCS()|5", formatted));
    }

    @org.junit.Test
    public void testFormatNoTime() throws java.text.ParseException {
        io.gsonfire.util.RFC3339DateFormat format = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatNoTime()|0", io.gsonfire.util.RFC3339DateFormat.class, new io.gsonfire.util.RFC3339DateFormat(false));
        java.lang.String formatted = eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatNoTime()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.util.RFC3339DateFormat>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatNoTime()|1", io.gsonfire.util.RFC3339DateFormat.class, format).format(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Date>observeState("io.gsonfire.util.RFC3339DateFormatTest|testFormatNoTime()|2", java.util.Date.class, new java.util.Date(1360204148123L))));
        org.junit.Assert.assertEquals("2013-02-07", eu.stamp_project.reneri.instrumentation.StateObserver.observe("io.gsonfire.util.RFC3339DateFormatTest|testFormatNoTime()|4", formatted));
    }
}

