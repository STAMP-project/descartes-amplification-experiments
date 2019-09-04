package cn.jpush.api.push.model;


@org.junit.experimental.categories.Category(cn.jpush.api.FastTests.class)
public class PlatformTesst {
    @org.junit.Test
    public void testAll() {
        cn.jpush.api.push.model.Platform all = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.model.PlatformTesst|testAll()|0", cn.jpush.api.push.model.Platform.class, cn.jpush.api.push.model.Platform.all());
        org.junit.Assert.assertEquals("test", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.PlatformTesst|testAll()|1", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("all")), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.PlatformTesst|testAll()|3", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.model.PlatformTesst|testAll()|2", cn.jpush.api.push.model.Platform.class, all).toJSON()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testNotAll() {
        try {
            cn.jpush.api.push.model.Platform all = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|2", cn.jpush.api.push.model.Platform.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform.Builder>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|1", cn.jpush.api.push.model.Platform.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform.Builder>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|0", cn.jpush.api.push.model.Platform.Builder.class, cn.jpush.api.push.model.Platform.newBuilder()).setAll(false)).build());
            org.junit.Assert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|4", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|3", cn.jpush.api.push.model.Platform.class, all).toJSON()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<com.google.gson.JsonElement>>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|6", org.hamcrest.Matcher.class, org.hamcrest.CoreMatchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.PlatformTesst|testNotAll()|5", com.google.gson.JsonElement.class, ((com.google.gson.JsonElement) (new com.google.gson.JsonPrimitive("all")))))));
        } catch (java.lang.IllegalArgumentException a1552641512275) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.push.model.PlatformTesst|testNotAll()|!", a1552641512275);
            throw a1552641512275;
        }
    }

    @org.junit.Test
    public void testAndroid() {
        cn.jpush.api.push.model.Platform android = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|3", cn.jpush.api.push.model.Platform.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform.Builder>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|2", cn.jpush.api.push.model.Platform.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform.Builder>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|0", cn.jpush.api.push.model.Platform.Builder.class, cn.jpush.api.push.model.Platform.newBuilder()).addDeviceType(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.DeviceType>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|1", cn.jiguang.common.DeviceType.class, cn.jiguang.common.DeviceType.Android))).build());
        com.google.gson.JsonArray array = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|4", com.google.gson.JsonArray.class, new com.google.gson.JsonArray());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|5", com.google.gson.JsonArray.class, array).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|6", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("android")));
        org.junit.Assert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|8", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.Platform>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|7", cn.jpush.api.push.model.Platform.class, android).toJSON()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<com.google.gson.JsonElement>>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|10", org.hamcrest.Matcher.class, org.hamcrest.CoreMatchers.is(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.PlatformTesst|testAndroid()|9", com.google.gson.JsonElement.class, ((com.google.gson.JsonElement) (array))))));
    }
}

