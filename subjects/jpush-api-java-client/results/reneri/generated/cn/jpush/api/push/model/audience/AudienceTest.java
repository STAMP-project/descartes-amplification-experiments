package cn.jpush.api.push.model.audience;


@org.junit.experimental.categories.Category(cn.jpush.api.FastTests.class)
public class AudienceTest {
    @org.junit.Test
    public void testAll() {
        cn.jpush.api.push.model.audience.Audience audience = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAll()|0", cn.jpush.api.push.model.audience.Audience.class, cn.jpush.api.push.model.audience.Audience.all());
        org.junit.Assert.assertEquals("test", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAll()|1", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("all")), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAll()|3", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAll()|2", cn.jpush.api.push.model.audience.Audience.class, audience).toJSON()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testAllMore() {
        try {
            cn.jpush.api.push.model.audience.AudienceTarget target = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|0", cn.jpush.api.push.model.audience.AudienceTarget.class, cn.jpush.api.push.model.audience.AudienceTarget.alias("aaaa"));
            cn.jpush.api.push.model.audience.Audience audience = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|5", cn.jpush.api.push.model.audience.Audience.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|4", cn.jpush.api.push.model.audience.Audience.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|2", cn.jpush.api.push.model.audience.Audience.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|1", cn.jpush.api.push.model.audience.Audience.Builder.class, cn.jpush.api.push.model.audience.Audience.newBuilder()).setAll(true)).addAudienceTarget(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|3", cn.jpush.api.push.model.audience.AudienceTarget.class, target))).build());
            org.junit.Assert.assertEquals("test", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|6", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("all")), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|8", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|7", cn.jpush.api.push.model.audience.Audience.class, audience).toJSON()));
        } catch (java.lang.IllegalArgumentException a1552641512153) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.push.model.audience.AudienceTest|testAllMore()|!", a1552641512153);
            throw a1552641512153;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testNotAll() {
        try {
            cn.jpush.api.push.model.audience.Audience audience = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|2", cn.jpush.api.push.model.audience.Audience.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|1", cn.jpush.api.push.model.audience.Audience.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|0", cn.jpush.api.push.model.audience.Audience.Builder.class, cn.jpush.api.push.model.audience.Audience.newBuilder()).setAll(false)).build());
            org.junit.Assert.assertEquals("test", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|3", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("all")), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|5", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|4", cn.jpush.api.push.model.audience.Audience.class, audience).toJSON()));
        } catch (java.lang.IllegalArgumentException a1552641512160) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.push.model.audience.AudienceTest|testNotAll()|!", a1552641512160);
            throw a1552641512160;
        }
    }

    @org.junit.Test
    public void testAudience() {
        com.google.gson.JsonObject json = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|0", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        com.google.gson.JsonArray arr = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|1", com.google.gson.JsonArray.class, new com.google.gson.JsonArray());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|2", com.google.gson.JsonArray.class, arr).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|3", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("aaaa")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|4", com.google.gson.JsonObject.class, json).add("alias", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|5", com.google.gson.JsonArray.class, arr));
        cn.jpush.api.push.model.audience.AudienceTarget target = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|6", cn.jpush.api.push.model.audience.AudienceTarget.class, cn.jpush.api.push.model.audience.AudienceTarget.alias("aaaa"));
        cn.jpush.api.push.model.audience.Audience audience = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|10", cn.jpush.api.push.model.audience.Audience.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|9", cn.jpush.api.push.model.audience.Audience.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|7", cn.jpush.api.push.model.audience.Audience.Builder.class, cn.jpush.api.push.model.audience.Audience.newBuilder()).addAudienceTarget(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|8", cn.jpush.api.push.model.audience.AudienceTarget.class, target))).build());
        org.junit.Assert.assertEquals("test", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|11", com.google.gson.JsonObject.class, json), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|13", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.Audience>observeState("cn.jpush.api.push.model.audience.AudienceTest|testAudience()|12", cn.jpush.api.push.model.audience.Audience.class, audience).toJSON()));
    }
}

