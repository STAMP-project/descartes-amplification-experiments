package cn.jpush.api.schedule;


/**
 * ScheduleClient Tester.
 *
 * @author liucy
 * @version 1.0
 */
@org.junit.experimental.categories.Category(cn.jpush.api.SlowTests.class)
public class ScheduleClientTest extends cn.jpush.api.BaseTest {
    protected static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(cn.jpush.api.schedule.ScheduleClientTest.class);

    public static final int NOT_EXIST = 8104;

    public static final int AUTH_FAILED = 8101;

    public static final int INVALID_PARAM = 8100;

    private cn.jpush.api.schedule.ScheduleClient client;

    @java.lang.Override
    public void before() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|before()|0", cn.jpush.api.schedule.ScheduleClient.class, (client = new cn.jpush.api.schedule.ScheduleClient(cn.jpush.api.BaseTest.MASTER_SECRET, cn.jpush.api.BaseTest.APP_KEY)));
    }

    /**
     * Method: getScheduleList(int page)
     */
    @org.junit.Test
    public void testGetScheduleList() {
        try {
            cn.jpush.api.schedule.ScheduleListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleListResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|1", cn.jpush.api.schedule.ScheduleListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|0", cn.jpush.api.schedule.ScheduleClient.class, client).getScheduleList(1));
            org.junit.Assert.assertEquals("", 1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleListResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|2", cn.jpush.api.schedule.ScheduleListResult.class, result).page));
        } catch (cn.jiguang.common.resp.APIConnectionException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|4", cn.jiguang.common.resp.APIConnectionException.class, e).printStackTrace();
        } catch (cn.jiguang.common.resp.APIRequestException e) {
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetScheduleList()|5", cn.jiguang.common.resp.APIRequestException.class, e).getErrorMessage()), false);
        }
    }

    /**
     * Method: createSchedule(SchedulePayload payload)
     * Method: getSchedule(String scheduleId)
     * Method: updateSchedule(String scheduleId, SchedulePayload payload)
     * Method: deleteSchedule(String scheduleId)
     */
    @org.junit.Test
    public void testScheduleMethods() {
        java.lang.String name = "test_schedule";
        cn.jpush.api.schedule.model.TriggerPayload trigger = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|2", cn.jpush.api.schedule.model.TriggerPayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|1", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|0", cn.jpush.api.schedule.model.TriggerPayload.Builder.class, cn.jpush.api.schedule.model.TriggerPayload.newBuilder()).setSingleTime("2105-07-30 12:00:00")).buildSingle());
        cn.jpush.api.push.model.PushPayload push = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|3", cn.jpush.api.push.model.PushPayload.class, cn.jpush.api.push.model.PushPayload.alertAll("test schedule"));
        cn.jpush.api.schedule.model.SchedulePayload payload = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|12", cn.jpush.api.schedule.model.SchedulePayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|11", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|9", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|7", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|6", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|4", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, cn.jpush.api.schedule.model.SchedulePayload.newBuilder()).setName(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|5", name))).setEnabled(true)).setTrigger(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.TriggerPayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|8", cn.jpush.api.schedule.model.TriggerPayload.class, trigger))).setPush(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.PushPayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|10", cn.jpush.api.push.model.PushPayload.class, push))).build());
        cn.jpush.api.schedule.model.SchedulePayload update = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|15", cn.jpush.api.schedule.model.SchedulePayload.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|14", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload.Builder>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|13", cn.jpush.api.schedule.model.SchedulePayload.Builder.class, cn.jpush.api.schedule.model.SchedulePayload.newBuilder()).setEnabled(false)).build());
        cn.jpush.api.schedule.ScheduleResult result = null;
        boolean success = false;
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|18", cn.jpush.api.schedule.ScheduleResult.class, (result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|16", cn.jpush.api.schedule.ScheduleClient.class, client).createSchedule(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|17", cn.jpush.api.schedule.model.SchedulePayload.class, payload))));
            org.junit.Assert.assertNotNull("test createSchedule failed.", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|19", cn.jpush.api.schedule.ScheduleResult.class, result));
            cn.jpush.api.schedule.ScheduleResult getResult = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|23", cn.jpush.api.schedule.ScheduleResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|20", cn.jpush.api.schedule.ScheduleClient.class, client).getSchedule(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|21", cn.jpush.api.schedule.ScheduleResult.class, result).schedule_id)));
            org.junit.Assert.assertEquals("test getSchedule failed.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|24", cn.jpush.api.schedule.ScheduleResult.class, result).name), eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|27", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|26", cn.jpush.api.schedule.ScheduleResult.class, getResult).name));
            cn.jpush.api.schedule.ScheduleResult updateResult = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|32", cn.jpush.api.schedule.ScheduleResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|28", cn.jpush.api.schedule.ScheduleClient.class, client).updateSchedule(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|30", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|29", cn.jpush.api.schedule.ScheduleResult.class, result).schedule_id), eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.model.SchedulePayload>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|31", cn.jpush.api.schedule.model.SchedulePayload.class, update)));
            org.junit.Assert.assertEquals("test updateSchedule failed.", false, eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|34", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|33", cn.jpush.api.schedule.ScheduleResult.class, updateResult).enabled));
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|35", cn.jpush.api.schedule.ScheduleClient.class, client).deleteSchedule(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|37", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|36", cn.jpush.api.schedule.ScheduleResult.class, result).schedule_id));
            org.junit.Assert.assertTrue(true);
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|38", (success = true));
        } catch (cn.jiguang.common.resp.APIConnectionException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|39", cn.jiguang.common.resp.APIConnectionException.class, e).printStackTrace();
        } catch (cn.jiguang.common.resp.APIRequestException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|40", cn.jiguang.common.resp.APIRequestException.class, e).printStackTrace();
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|41", org.slf4j.Logger.class, cn.jpush.api.schedule.ScheduleClientTest.LOG).info(("HTTP Status: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|43", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|42", cn.jiguang.common.resp.APIRequestException.class, e).getStatus()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|44", org.slf4j.Logger.class, cn.jpush.api.schedule.ScheduleClientTest.LOG).info(("Error Code: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|46", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|45", cn.jiguang.common.resp.APIRequestException.class, e).getErrorCode()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|47", org.slf4j.Logger.class, cn.jpush.api.schedule.ScheduleClientTest.LOG).info(("Error Message: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|49", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|48", cn.jiguang.common.resp.APIRequestException.class, e).getErrorMessage()))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.slf4j.Logger>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|50", org.slf4j.Logger.class, cn.jpush.api.schedule.ScheduleClientTest.LOG).info(("Msg ID: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|52", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|51", cn.jiguang.common.resp.APIRequestException.class, e).getMsgId()))));
        } finally {
            if ((!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|53", success))) && (null != (eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|54", cn.jpush.api.schedule.ScheduleResult.class, result)))) {
                try {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|55", cn.jpush.api.schedule.ScheduleClient.class, client).deleteSchedule(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|57", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|56", cn.jpush.api.schedule.ScheduleResult.class, result).schedule_id));
                } catch (java.lang.Exception e) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("cn.jpush.api.schedule.ScheduleClientTest|testScheduleMethods()|58", java.lang.Exception.class, e).printStackTrace();
                }
            }
        }
    }

    @org.junit.Test
    public void testGetNotExist() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleResult>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetNotExist()|1", cn.jpush.api.schedule.ScheduleResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.schedule.ScheduleClient>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetNotExist()|0", cn.jpush.api.schedule.ScheduleClient.class, client).getSchedule("test-not-exist"));
        } catch (cn.jiguang.common.resp.APIConnectionException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetNotExist()|2", cn.jiguang.common.resp.APIConnectionException.class, e).printStackTrace();
        } catch (cn.jiguang.common.resp.APIRequestException e) {
            org.junit.Assert.assertEquals(cn.jpush.api.schedule.ScheduleClientTest.NOT_EXIST, eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.schedule.ScheduleClientTest|testGetNotExist()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIRequestException>observeState("cn.jpush.api.schedule.ScheduleClientTest|testGetNotExist()|3", cn.jiguang.common.resp.APIRequestException.class, e).getErrorCode()));
        }
    }
}

