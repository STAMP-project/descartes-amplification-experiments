package cn.jpush.api.schedule.model;


/**
 * TriggerPayload Tester.
 *
 * @author liucy
 * @version 1.0
 */
@org.junit.experimental.categories.Category(cn.jpush.api.FastTests.class)
public class TriggerPayloadTest {
    /**
     * Method: buildSingle()
     */
    @org.junit.Test
    public void testBuildSingle() {
        java.lang.String time = "2015-07-30 10:12:23";
        cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|3", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|2", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|1", time))).buildSingle());
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|4", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        com.google.gson.JsonObject single = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|5", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|6", com.google.gson.JsonObject.class, single).addProperty("time", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|7", time));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|8", com.google.gson.JsonObject.class, json).add("single", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|9", com.google.gson.JsonObject.class, single));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|10", com.google.gson.JsonObject.class, json), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|12", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildSingle()|11", cn.jpush.api.schedule.model.TriggerPayload.class, trigger).toJSON()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void test_null_time() {
        try {
            java.lang.String time = null;
            cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_time()|3", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_time()|2", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_time()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_time()|1", time))).buildSingle());
        } catch (java.lang.IllegalArgumentException a1552641512777) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_time()|!", a1552641512777);
            throw a1552641512777;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void test_empty_time() {
        try {
            java.lang.String time = "";
            cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_time()|3", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_time()|2", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_time()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_time()|1", time))).buildSingle());
        } catch (java.lang.IllegalArgumentException a1552641512771) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_time()|!", a1552641512771);
            throw a1552641512771;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void test_invalid_time() {
        try {
            java.lang.String time = "2015-07-32 10:12:23";
            cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_invalid_time()|3", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_invalid_time()|2", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_invalid_time()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_invalid_time()|1", time))).buildSingle());
        } catch (java.lang.IllegalArgumentException a1552641512773) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.schedule.model.TriggerPayloadTest|test_invalid_time()|!", a1552641512773);
            throw a1552641512773;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void test_incorrect_time_format() {
        try {
            java.lang.String time = "2015-07-30T10:12:23";
            cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_incorrect_time_format()|3", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_incorrect_time_format()|2", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_incorrect_time_format()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_incorrect_time_format()|1", time))).buildSingle());
        } catch (java.lang.IllegalArgumentException a1552641512772) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.schedule.model.TriggerPayloadTest|test_incorrect_time_format()|!", a1552641512772);
            throw a1552641512772;
        }
    }

    /**
     * Method: buildPeriodical()
     */
    @org.junit.Test
    public void testBuildPeriodical() {
        java.lang.String start = "2015-07-30 10:12:23";
        java.lang.String end = "2015-08-30 10:12:23";
        java.lang.String time = "10:12:00";
        java.lang.String[] point = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|0", java.lang.String[].class, new java.lang.String[]{ "MON", "TUE" });
        cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|9", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|8", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|5", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|1", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setPeriodTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|2", start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|3", end), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|4", time))).setTimeFrequency(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.TimeUnit>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|6", cn.jiguang.common.TimeUnit.class, cn.jiguang.common.TimeUnit.WEEK), 2, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|7", java.lang.String[].class, point))).buildPeriodical());
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|10", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        com.google.gson.JsonObject periodical = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|11", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|12", com.google.gson.JsonObject.class, periodical).addProperty("start", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|13", start));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|14", com.google.gson.JsonObject.class, periodical).addProperty("end", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|15", end));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|16", com.google.gson.JsonObject.class, periodical).addProperty("time", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|17", time));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|18", com.google.gson.JsonObject.class, periodical).addProperty("time_unit", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|21", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.TimeUnit>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|19", cn.jiguang.common.TimeUnit.class, cn.jiguang.common.TimeUnit.WEEK).name()).toLowerCase()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|22", com.google.gson.JsonObject.class, periodical).addProperty("frequency", 2);
        com.google.gson.JsonArray array = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|23", com.google.gson.JsonArray.class, new com.google.gson.JsonArray());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|24", com.google.gson.JsonArray.class, array).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|25", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("MON")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|26", com.google.gson.JsonArray.class, array).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|27", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("TUE")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|28", com.google.gson.JsonObject.class, periodical).add("point", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|29", com.google.gson.JsonArray.class, array));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|30", com.google.gson.JsonObject.class, json).add("periodical", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|31", com.google.gson.JsonObject.class, periodical));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|32", com.google.gson.JsonObject.class, json), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|34", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|testBuildPeriodical()|33", cn.jpush.api.schedule.model.TriggerPayload.class, trigger).toJSON()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void test_null_start() {
        try {
            java.lang.String start = null;
            java.lang.String end = "2015-08-30 10:12:23";
            java.lang.String time = "10:12:00";
            java.lang.String[] point = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|0", java.lang.String[].class, new java.lang.String[]{ "MON", "TUE" });
            cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|9", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|8", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|5", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|1", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setPeriodTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|2", start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|3", end), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|4", time))).setTimeFrequency(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.TimeUnit>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|6", cn.jiguang.common.TimeUnit.class, cn.jiguang.common.TimeUnit.WEEK), 2, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|7", java.lang.String[].class, point))).buildPeriodical());
        } catch (java.lang.IllegalArgumentException a1552641512776) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.schedule.model.TriggerPayloadTest|test_null_start()|!", a1552641512776);
            throw a1552641512776;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void test_empty_end() {
        try {
            java.lang.String start = "2015-08-30 10:12:23";
            java.lang.String end = "";
            java.lang.String time = "10:12:00";
            java.lang.String[] point = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|0", java.lang.String[].class, new java.lang.String[]{ "MON", "TUE" });
            cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|9", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|8", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|5", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|1", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setPeriodTime(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|2", start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|3", end), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|4", time))).setTimeFrequency(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.TimeUnit>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|6", cn.jiguang.common.TimeUnit.class, cn.jiguang.common.TimeUnit.WEEK), 2, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|7", java.lang.String[].class, point))).buildPeriodical());
        } catch (java.lang.IllegalArgumentException a1552641512770) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.schedule.model.TriggerPayloadTest|test_empty_end()|!", a1552641512770);
            throw a1552641512770;
        }
    }
}

