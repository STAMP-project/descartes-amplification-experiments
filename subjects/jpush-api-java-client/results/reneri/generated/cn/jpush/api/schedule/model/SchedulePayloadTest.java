package cn.jpush.api.schedule.model;


/**
 * SchedulePayload Tester.
 *
 * @version 1.0
 */
@org.junit.experimental.categories.Category(cn.jpush.api.FastTests.class)
public class SchedulePayloadTest {
    @org.junit.Test
    public void testToJson() {
        java.lang.String name = "test_schedule";
        cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|2", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|1", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime("2015-07-25 12:20:30")).buildSingle());
        cn.jpush.api.push.model.PushPayload push = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|3", cn.jpush.api.push.model.PushPayload.class, cn.jpush.api.push.model.PushPayload.alertAll("test schedule"));
        cn.jpush.api.schedule.model.SchedulePayload payload = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|12", cn.jpush.api.schedule.model.SchedulePayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|11", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|9", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|7", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|6", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|4", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, cn.jpush.api.schedule.model.SchedulePayload.newBuilder()).setName(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|5", name))).setEnabled(true)).setTrigger(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|8", cn.jpush.api.schedule.model.TriggerPayload.class, trigger))).setPush(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|10", cn.jpush.api.push.model.PushPayload.class, push))).build());
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|13", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|14", com.google.gson.JsonObject.class, json).addProperty("name", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|15", name));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|16", com.google.gson.JsonObject.class, json).addProperty("enabled", true);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|17", com.google.gson.JsonObject.class, json).add("trigger", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|19", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|18", cn.jpush.api.schedule.model.TriggerPayload.class, trigger).toJSON()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|20", com.google.gson.JsonObject.class, json).add("push", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|22", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|21", cn.jpush.api.push.model.PushPayload.class, push).toJSON()));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|23", com.google.gson.JsonObject.class, json), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|25", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload>observeState("cn.jpush.api.schedule.model.SchedulePayloadTest|testToJson()|24", cn.jpush.api.schedule.model.SchedulePayload.class, payload).toJSON()));
    }
}

