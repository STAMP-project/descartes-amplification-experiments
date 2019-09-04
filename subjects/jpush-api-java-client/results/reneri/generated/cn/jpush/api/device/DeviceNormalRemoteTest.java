package cn.jpush.api.device;


@org.junit.runner.RunWith(cn.jpush.api.JUnitOrderedRunner.class)
public class DeviceNormalRemoteTest extends cn.jpush.api.BaseTest {
    // ------------------ device
    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 100)
    public void testUpdateDeviceTagAlias_add_remove_tags() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        java.util.Set<java.lang.String> tagsToAdd = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|0", java.util.HashSet.class, new java.util.HashSet<java.lang.String>());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|1", java.util.Set.class, tagsToAdd).add("tag1"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|3", java.util.Set.class, tagsToAdd).add("tag2"));
        java.util.Set<java.lang.String> tagsToRemove = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|5", java.util.HashSet.class, new java.util.HashSet<java.lang.String>());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|6", java.util.Set.class, tagsToRemove).add("tag1"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|8", java.util.Set.class, tagsToRemove).add("tag2"));
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|13", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|10", cn.jpush.api.JPushClient.class, jpushClient).updateDeviceTagAlias(cn.jpush.api.BaseTest.REGISTRATION_ID3, "alias1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|11", java.util.Set.class, tagsToAdd), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|12", java.util.Set.class, tagsToRemove)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_add_remove_tags()|14", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 110)
    public void testGetDeviceTagAlias_1() throws java.lang.Exception {
        cn.jpush.api.device.TagAliasResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|1", cn.jpush.api.device.TagAliasResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|0", cn.jpush.api.JPushClient.class, jpushClient).getDeviceTagAlias(cn.jpush.api.BaseTest.REGISTRATION_ID3));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|2", cn.jpush.api.device.TagAliasResult.class, result).isResultOK()));
        org.junit.Assert.assertEquals("alias not equals", "alias1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|4", cn.jpush.api.device.TagAliasResult.class, result).alias));
        org.junit.Assert.assertTrue("tag contains", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|7", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|6", cn.jpush.api.device.TagAliasResult.class, result).tags).contains("tag1")));
        org.junit.Assert.assertTrue("tag contains", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|10", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|9", cn.jpush.api.device.TagAliasResult.class, result).tags).contains("tag2")));
        org.junit.Assert.assertFalse("tag not contains", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|13", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|12", cn.jpush.api.device.TagAliasResult.class, result).tags).contains("tag3")));
        org.junit.Assert.assertFalse("tag not contains", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|16", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_1()|15", cn.jpush.api.device.TagAliasResult.class, result).tags).contains("tag4")));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 111)
    public void testGetAliasDeviceList_1() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jpush.api.device.AliasDeviceListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_1()|1", cn.jpush.api.device.AliasDeviceListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_1()|0", cn.jpush.api.JPushClient.class, jpushClient).getAliasDeviceList("alias1", null));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_1()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_1()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_1()|2", cn.jpush.api.device.AliasDeviceListResult.class, result).registration_ids).contains(cn.jpush.api.BaseTest.REGISTRATION_ID1)));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 120)
    public void testUpdateDeviceTagAlias_clear() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_clear()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_clear()|0", cn.jpush.api.JPushClient.class, jpushClient).updateDeviceTagAlias(cn.jpush.api.BaseTest.REGISTRATION_ID1, true, true));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_clear()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testUpdateDeviceTagAlias_clear()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 130)
    public void testGetDeviceTagAlias_cleard() throws java.lang.Exception {
        cn.jpush.api.device.TagAliasResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|1", cn.jpush.api.device.TagAliasResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|0", cn.jpush.api.JPushClient.class, jpushClient).getDeviceTagAlias(cn.jpush.api.BaseTest.REGISTRATION_ID1));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|2", cn.jpush.api.device.TagAliasResult.class, result).isResultOK()));
        org.junit.Assert.assertEquals("alias cleared", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|4", cn.jpush.api.device.TagAliasResult.class, result).alias));
        org.junit.Assert.assertEquals("tags cleared", 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|7", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagAliasResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetDeviceTagAlias_cleard()|6", cn.jpush.api.device.TagAliasResult.class, result).tags).size()));
    }

    // ------------------ tags
    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 203)
    public void testAddRemoveDevicesFromTag() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        java.util.Set<java.lang.String> toAddUsers = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|0", java.util.HashSet.class, new java.util.HashSet<java.lang.String>());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|1", java.util.Set.class, toAddUsers).add(cn.jpush.api.BaseTest.REGISTRATION_ID1));
        java.util.Set<java.lang.String> toRemoveUsers = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|3", java.util.HashSet.class, new java.util.HashSet<java.lang.String>());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|4", java.util.Set.class, toRemoveUsers).add(cn.jpush.api.BaseTest.REGISTRATION_ID2));
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|9", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|6", cn.jpush.api.JPushClient.class, jpushClient).addRemoveDevicesFromTag("tag3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|7", java.util.Set.class, toAddUsers), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|8", java.util.Set.class, toRemoveUsers)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTag()|10", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 210)
    public void testIsDeviceInTag() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.BooleanResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.BooleanResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testIsDeviceInTag()|1", cn.jiguang.common.resp.BooleanResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testIsDeviceInTag()|0", cn.jpush.api.JPushClient.class, jpushClient).isDeviceInTag("tag2", cn.jpush.api.BaseTest.REGISTRATION_ID3));
        org.junit.Assert.assertTrue("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testIsDeviceInTag()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.BooleanResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testIsDeviceInTag()|2", cn.jiguang.common.resp.BooleanResult.class, result).result));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 211)
    public void testAddRemoveDevicesFromTagResult() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jpush.api.device.TagListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTagResult()|1", cn.jpush.api.device.TagListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTagResult()|0", cn.jpush.api.JPushClient.class, jpushClient).getTagList());
        org.junit.Assert.assertTrue("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTagResult()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTagResult()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testAddRemoveDevicesFromTagResult()|2", cn.jpush.api.device.TagListResult.class, result).tags).contains("tag3")));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 220)
    public void testGetTagList_1() throws java.lang.Exception {
        cn.jpush.api.device.TagListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetTagList_1()|1", cn.jpush.api.device.TagListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetTagList_1()|0", cn.jpush.api.JPushClient.class, jpushClient).getTagList());
        org.junit.Assert.assertTrue("", ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetTagList_1()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetTagList_1()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetTagList_1()|2", cn.jpush.api.device.TagListResult.class, result).tags).size())) > 0));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 250)
    public void testDeleteTag() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteTag()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteTag()|0", cn.jpush.api.JPushClient.class, jpushClient).deleteTag("tag3", null));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteTag()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteTag()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 251)
    public void testDeleteResult() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jpush.api.device.TagListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteResult()|1", cn.jpush.api.device.TagListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteResult()|0", cn.jpush.api.JPushClient.class, jpushClient).getTagList());
        org.junit.Assert.assertFalse("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteResult()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteResult()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.TagListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteResult()|2", cn.jpush.api.device.TagListResult.class, result).tags).contains("tag3")));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 260)
    public void testDeletetag2() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeletetag2()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeletetag2()|0", cn.jpush.api.JPushClient.class, jpushClient).deleteTag("tag3", null));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testDeletetag2()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeletetag2()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    // --------------------- alias
    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 230)
    public void testGetAliasDevices_1() throws java.lang.Exception {
        cn.jpush.api.device.AliasDeviceListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDevices_1()|1", cn.jpush.api.device.AliasDeviceListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDevices_1()|0", cn.jpush.api.JPushClient.class, jpushClient).getAliasDeviceList("alias1", null));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDevices_1()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDevices_1()|2", cn.jpush.api.device.AliasDeviceListResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 300)
    public void testGetAliasDeviceList() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jpush.api.device.AliasDeviceListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList()|1", cn.jpush.api.device.AliasDeviceListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList()|0", cn.jpush.api.JPushClient.class, jpushClient).getAliasDeviceList("alias1", "android"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList()|2", cn.jpush.api.device.AliasDeviceListResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 310)
    public void testGetAliasDeviceList_2() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jpush.api.device.AliasDeviceListResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_2()|1", cn.jpush.api.device.AliasDeviceListResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_2()|0", cn.jpush.api.JPushClient.class, jpushClient).getAliasDeviceList("alias1", null));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_2()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_2()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.AliasDeviceListResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testGetAliasDeviceList_2()|2", cn.jpush.api.device.AliasDeviceListResult.class, result).registration_ids).size())) == 0));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 320)
    public void testDeleteAlias() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias()|0", cn.jpush.api.JPushClient.class, jpushClient).deleteAlias("alias2", "android"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 330)
    public void testDeleteAlias_2() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias_2()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias_2()|0", cn.jpush.api.JPushClient.class, jpushClient).deleteAlias("alias2", null));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias_2()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testDeleteAlias_2()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 340)
    public void testTetUserOnlineStatus() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        java.util.Map<java.lang.String, cn.jpush.api.device.OnlineStatus> result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, cn.jpush.api.device.OnlineStatus>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testTetUserOnlineStatus()|1", java.util.Map.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testTetUserOnlineStatus()|0", cn.jpush.api.JPushClient.class, jpushClient).getUserOnlineStatus(cn.jpush.api.BaseTest.REGISTRATION_ID1, cn.jpush.api.BaseTest.REGISTRATION_ID2));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.device.OnlineStatus>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testTetUserOnlineStatus()|3", cn.jpush.api.device.OnlineStatus.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Map<java.lang.String, cn.jpush.api.device.OnlineStatus>>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testTetUserOnlineStatus()|2", java.util.Map.class, result).get(cn.jpush.api.BaseTest.REGISTRATION_ID1))) != null));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 360)
    public void testBindMobile() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile()|0", cn.jpush.api.JPushClient.class, jpushClient).bindMobile(cn.jpush.api.BaseTest.REGISTRATION_ID1, "13000000000"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 361)
    public void testBindMobile_null() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_null()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_null()|0", cn.jpush.api.JPushClient.class, jpushClient).bindMobile(cn.jpush.api.BaseTest.REGISTRATION_ID1, null));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_null()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_null()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }

    @org.junit.Test
    @cn.jpush.api.TestOrder(order = 362)
    public void testBindMobile_empty() throws cn.jiguang.common.resp.APIConnectionException, cn.jiguang.common.resp.APIRequestException {
        cn.jiguang.common.resp.DefaultResult result = eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_empty()|1", cn.jiguang.common.resp.DefaultResult.class, eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jpush.api.JPushClient>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_empty()|0", cn.jpush.api.JPushClient.class, jpushClient).bindMobile(cn.jpush.api.BaseTest.REGISTRATION_ID1, ""));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_empty()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<cn.jiguang.common.resp.DefaultResult>observeState("cn.jpush.api.device.DeviceNormalRemoteTest|testBindMobile_empty()|2", cn.jiguang.common.resp.DefaultResult.class, result).isResultOK()));
    }
}

