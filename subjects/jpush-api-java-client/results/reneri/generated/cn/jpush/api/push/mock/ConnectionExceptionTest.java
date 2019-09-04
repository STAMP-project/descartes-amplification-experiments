package cn.jpush.api.push.mock;


/**
 * Record: MockResponse.throttleBody will delay response body, but sometimes has no effect.
 * MockResponse.setBodyDelayTimeMs has no effect for delay test.
 */
public class ConnectionExceptionTest implements cn.jpush.api.push.mock.IMockTest {
    private cn.jpush.api.push.PushClient _client = null;

    private com.squareup.okhttp.mockwebserver.MockWebServer _server = new com.squareup.okhttp.mockwebserver.MockWebServer();

    private static final java.lang.String SIMPLE_CONTNET = cn.jpush.api.push.model.PushPayload.alertAll("alert").toString();

    @org.junit.Test
    public void test_read_timeout_disconnect_at_start() throws java.lang.Exception {
        // disconnect at start. This will cause "Read timed out"
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockWebServer>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_read_timeout_disconnect_at_start()|0", com.squareup.okhttp.mockwebserver.MockWebServer.class, _server).enqueue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockResponse>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_read_timeout_disconnect_at_start()|3", com.squareup.okhttp.mockwebserver.MockResponse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockResponse>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_read_timeout_disconnect_at_start()|1", com.squareup.okhttp.mockwebserver.MockResponse.class, new com.squareup.okhttp.mockwebserver.MockResponse()).setSocketPolicy(eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.SocketPolicy>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_read_timeout_disconnect_at_start()|2", com.squareup.okhttp.mockwebserver.SocketPolicy.class, com.squareup.okhttp.mockwebserver.SocketPolicy.DISCONNECT_AT_START))));
        connect_read_timeout();
    }

    @org.junit.Test
    public void test_connect_timeout_and_retry() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockWebServer>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|0", com.squareup.okhttp.mockwebserver.MockWebServer.class, _server).enqueue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockResponse>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|2", com.squareup.okhttp.mockwebserver.MockResponse.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockResponse>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|1", com.squareup.okhttp.mockwebserver.MockResponse.class, new com.squareup.okhttp.mockwebserver.MockResponse()).setBody(cn.jpush.api.push.mock.ConnectionExceptionTest.SIMPLE_CONTNET)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockWebServer>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|3", com.squareup.okhttp.mockwebserver.MockWebServer.class, _server).play();
        eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushClient>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|4", cn.jpush.api.push.PushClient.class, (_client = new cn.jpush.api.push.PushClient(cn.jpush.api.push.mock.IMockTest.masterSecret, cn.jpush.api.push.mock.IMockTest.appKey)));
        // connecting to a un-existed address will cause "connect timed out"
        eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushClient>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|5", cn.jpush.api.push.PushClient.class, _client).setBaseUrl(("http://192.132.143.11" + ":81/"));
        long start = eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|6", java.lang.System.currentTimeMillis());
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|8", cn.jpush.api.push.PushResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushClient>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|7", cn.jpush.api.push.PushClient.class, _client).sendPush(cn.jpush.api.push.mock.ConnectionExceptionTest.SIMPLE_CONTNET));
            org.junit.Assert.fail("Should not go here for connection exception.");
        } catch (cn.jiguang.common.resp.APIConnectionException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|9", cn.jiguang.common.resp.APIConnectionException.class, e).printStackTrace();
            org.junit.Assert.assertFalse("connect timed out", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|10", cn.jiguang.common.resp.APIConnectionException.class, e).isReadTimedout()));
            org.junit.Assert.assertEquals("Retried", cn.jiguang.common.connection.IHttpClient.DEFAULT_MAX_RETRY_TIMES, eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|12", cn.jiguang.common.resp.APIConnectionException.class, e).getDoneRetriedTimes()));
            long end = eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|14", java.lang.System.currentTimeMillis());
            org.junit.Assert.assertTrue("Retried", (((eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|15", end)) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|test_connect_timeout_and_retry()|16", start))) > ((cn.jiguang.common.connection.IHttpClient.DEFAULT_CONNECTION_TIMEOUT) * (cn.jiguang.common.connection.IHttpClient.DEFAULT_MAX_RETRY_TIMES))));
        } catch (cn.jiguang.common.resp.APIRequestException e) {
        }
    }

    public void connect_read_timeout() throws java.io.IOException {
        init();
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushResult>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|connect_read_timeout()|1", cn.jpush.api.push.PushResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushClient>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|connect_read_timeout()|0", cn.jpush.api.push.PushClient.class, _client).sendPush(cn.jpush.api.push.mock.ConnectionExceptionTest.SIMPLE_CONTNET));
            org.junit.Assert.fail("Should not go here for connection exception.");
        } catch (cn.jiguang.common.resp.APIConnectionException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|connect_read_timeout()|2", cn.jiguang.common.resp.APIConnectionException.class, e).printStackTrace();
            org.junit.Assert.assertTrue("Read timed out", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|connect_read_timeout()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.APIConnectionException>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|connect_read_timeout()|3", cn.jiguang.common.resp.APIConnectionException.class, e).isReadTimedout()));
        } catch (cn.jiguang.common.resp.APIRequestException e) {
        }
    }

    public void init() throws java.io.IOException {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockWebServer>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|0", com.squareup.okhttp.mockwebserver.MockWebServer.class, _server).play();
        java.net.URL mockUrl = eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|2", java.net.URL.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockWebServer>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|1", com.squareup.okhttp.mockwebserver.MockWebServer.class, _server).getUrl("/v3/push/"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|3", java.io.PrintStream.class, java.lang.System.out).println(("Server Url - " + (eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|4", java.net.URL.class, mockUrl))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushClient>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|5", cn.jpush.api.push.PushClient.class, (_client = new cn.jpush.api.push.PushClient(cn.jpush.api.push.mock.IMockTest.masterSecret, cn.jpush.api.push.mock.IMockTest.appKey)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.PushClient>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|6", cn.jpush.api.push.PushClient.class, _client).setBaseUrl(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|init()|7", java.net.URL.class, mockUrl).toString()));
    }

    @org.junit.After
    public void after() throws java.io.IOException {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.squareup.okhttp.mockwebserver.MockWebServer>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|after()|0", com.squareup.okhttp.mockwebserver.MockWebServer.class, _server).shutdown();
    }

    protected java.lang.String getResponseOK(int msgid, int sendno) {
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|0", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|1", com.google.gson.JsonObject.class, json).add("msg_id", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|3", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|2", msgid))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|4", com.google.gson.JsonObject.class, json).add("sendno", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|6", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|5", sendno))));
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|8", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.mock.ConnectionExceptionTest|getResponseOK(int,int)|7", com.google.gson.JsonObject.class, json).toString());
    }
}

