package cn.jpush.api.push.model.audience;


@org.junit.experimental.categories.Category(cn.jpush.api.FastTests.class)
public class AudienceTargetTest {
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testIllegal() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal()|3", cn.jpush.api.push.model.audience.AudienceTarget.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal()|2", cn.jpush.api.push.model.audience.AudienceTarget.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal()|0", cn.jpush.api.push.model.audience.AudienceTarget.Builder.class, cn.jpush.api.push.model.audience.AudienceTarget.newBuilder()).setAudienceType(eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceType>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal()|1", cn.jpush.api.push.model.audience.AudienceType.class, cn.jpush.api.push.model.audience.AudienceType.ALIAS))).build());
        } catch (java.lang.IllegalArgumentException a1552641512146) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal()|!", a1552641512146);
            throw a1552641512146;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testIllegal2() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal2()|2", cn.jpush.api.push.model.audience.AudienceTarget.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal2()|1", cn.jpush.api.push.model.audience.AudienceTarget.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget.Builder>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal2()|0", cn.jpush.api.push.model.audience.AudienceTarget.Builder.class, cn.jpush.api.push.model.audience.AudienceTarget.newBuilder()).addAudienceTargetValue("aaa")).build());
        } catch (java.lang.IllegalArgumentException a1552641512148) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("cn.jpush.api.push.model.audience.AudienceTargetTest|testIllegal2()|!", a1552641512148);
            throw a1552641512148;
        }
    }

    @org.junit.Test
    public void testAlias() {
        com.google.gson.JsonArray arr = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|0", com.google.gson.JsonArray.class, new com.google.gson.JsonArray());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|1", com.google.gson.JsonArray.class, arr).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|2", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("aaa")));
        cn.jpush.api.push.model.audience.AudienceTarget target = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|3", cn.jpush.api.push.model.audience.AudienceTarget.class, cn.jpush.api.push.model.audience.AudienceTarget.alias("aaa"));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|4", com.google.gson.JsonArray.class, arr), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonElement>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|6", com.google.gson.JsonElement.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.push.model.audience.AudienceTarget>observeState("cn.jpush.api.push.model.audience.AudienceTargetTest|testAlias()|5", cn.jpush.api.push.model.audience.AudienceTarget.class, target).toJSON()));
    }
}

