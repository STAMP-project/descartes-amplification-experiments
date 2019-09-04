package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class NodeTest {
    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg79() throws Exception {
        String __DSPOT_keyPrefix_28 = "J!][,J^uy}s#6CE3#^t ";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg79__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg79__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg79__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg79__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg79__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg79__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg79__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg79__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg79__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg79__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__16);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg79__17 = el.getElementsByAttributeStarting(__DSPOT_keyPrefix_28);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg79__17.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg79__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg79__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg79__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg79__16);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg87() throws Exception {
        int __DSPOT_index_42 = 974525135;
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg87__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg87__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg87__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg87__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg87__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg87__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg87__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg87__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg87__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg87__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__16);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg87__17 = el.getElementsByIndexEquals(__DSPOT_index_42);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg87__17.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg87__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg87__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg87__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg87__16);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg55() throws Exception {
        String __DSPOT_tagName_16 = "*:lKC*+{5@T5!^MYU(dM";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg55__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg55__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg55__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg55__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg55__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg55__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg55__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg55__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg55__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg55__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__16);
        Element o_orphanNodeReturnsNullForSiblingElements_mg55__17 = el.appendElement(__DSPOT_tagName_16);
        Assert.assertFalse(((Element) (o_orphanNodeReturnsNullForSiblingElements_mg55__17)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_orphanNodeReturnsNullForSiblingElements_mg55__17)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_orphanNodeReturnsNullForSiblingElements_mg55__17)).hasText());
        Assert.assertTrue(((Element) (o_orphanNodeReturnsNullForSiblingElements_mg55__17)).hasParent());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg55__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg55__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg55__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg55__16);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg94() throws Exception {
        String __DSPOT_regex_49 = ">K`HNw]f4QDhB+ _ 2&p";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg94__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg94__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg94__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg94__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg94__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg94__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg94__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg94__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg94__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg94__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__16);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg94__17 = el.getElementsMatchingText(__DSPOT_regex_49);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg94__17.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg94__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg94__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg94__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg94__16);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg82() throws Exception {
        String __DSPOT_valueSuffix_34 = "@y;s?/OCDfviVTx>DODA";
        String __DSPOT_key_33 = "m&)<4oK[>Va&1`i[aMe!";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg82__9 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg82__9)));
        int o_orphanNodeReturnsNullForSiblingElements_mg82__10 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg82__10)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg82__12 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__12);
        Node o_orphanNodeReturnsNullForSiblingElements_mg82__13 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__13);
        int o_orphanNodeReturnsNullForSiblingElements_mg82__14 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg82__14)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg82__16 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__16);
        Element o_orphanNodeReturnsNullForSiblingElements_mg82__17 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__17);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg82__18 = el.getElementsByAttributeValueEnding(__DSPOT_key_33, __DSPOT_valueSuffix_34);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg82__18.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg82__9)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg82__10)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__12);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__13);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg82__14)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__16);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg82__17);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg93() throws Exception {
        String __DSPOT_regex_48 = "Cxu?!rIXp5pNO|oPq,r5";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg93__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg93__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg93__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg93__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg93__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg93__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg93__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg93__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg93__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg93__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__16);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg93__17 = el.getElementsMatchingOwnText(__DSPOT_regex_48);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg93__17.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg93__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg93__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg93__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg93__16);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg85() throws Exception {
        String __DSPOT_valuePrefix_40 = "%=])JWOM_4gdsL9rC)A6";
        String __DSPOT_key_39 = "ZRy/=u eShD9P/&h4]]s";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg85__9 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg85__9)));
        int o_orphanNodeReturnsNullForSiblingElements_mg85__10 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg85__10)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg85__12 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__12);
        Node o_orphanNodeReturnsNullForSiblingElements_mg85__13 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__13);
        int o_orphanNodeReturnsNullForSiblingElements_mg85__14 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg85__14)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg85__16 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__16);
        Element o_orphanNodeReturnsNullForSiblingElements_mg85__17 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__17);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg85__18 = el.getElementsByAttributeValueStarting(__DSPOT_key_39, __DSPOT_valuePrefix_40);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg85__18.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg85__9)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg85__10)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__12);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__13);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg85__14)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__16);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg85__17);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg84() throws Exception {
        String __DSPOT_value_38 = "*{9Gi}cRQHCH3r6EO;&F";
        String __DSPOT_key_37 = ">).BmtV)2[gaNZ#S&Gu4";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg84__9 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg84__9)));
        int o_orphanNodeReturnsNullForSiblingElements_mg84__10 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg84__10)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg84__12 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__12);
        Node o_orphanNodeReturnsNullForSiblingElements_mg84__13 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__13);
        int o_orphanNodeReturnsNullForSiblingElements_mg84__14 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg84__14)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg84__16 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__16);
        Element o_orphanNodeReturnsNullForSiblingElements_mg84__17 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__17);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg84__18 = el.getElementsByAttributeValueNot(__DSPOT_key_37, __DSPOT_value_38);
        Assert.assertFalse(o_orphanNodeReturnsNullForSiblingElements_mg84__18.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg84__9)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg84__10)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__12);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__13);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg84__14)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__16);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg84__17);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg83_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_36 = "^r@)C1RND7C-6y}W`_*s";
            String __DSPOT_key_35 = "!L#vK5WR{oE1L&q_{{l>";
            Node node = new Element(Tag.valueOf("p"), "");
            Element el = new Element(Tag.valueOf("p"), "");
            node.siblingIndex();
            node.siblingNodes().size();
            node.previousSibling();
            node.nextSibling();
            el.siblingElements().size();
            el.previousElementSibling();
            el.nextElementSibling();
            el.getElementsByAttributeValueMatching(__DSPOT_key_35, __DSPOT_regex_36);
            org.junit.Assert.fail("orphanNodeReturnsNullForSiblingElements_mg83 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ^r@)C1RND7C-6y}W`_*s", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg81() throws Exception {
        String __DSPOT_match_32 = "/GGUV@1wly$),bA%.UJu";
        String __DSPOT_key_31 = "2Y][1u)p]QM-k,I]-r8/";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg81__9 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg81__9)));
        int o_orphanNodeReturnsNullForSiblingElements_mg81__10 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg81__10)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg81__12 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__12);
        Node o_orphanNodeReturnsNullForSiblingElements_mg81__13 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__13);
        int o_orphanNodeReturnsNullForSiblingElements_mg81__14 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg81__14)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg81__16 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__16);
        Element o_orphanNodeReturnsNullForSiblingElements_mg81__17 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__17);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg81__18 = el.getElementsByAttributeValueContaining(__DSPOT_key_31, __DSPOT_match_32);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg81__18.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg81__9)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg81__10)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__12);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__13);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg81__14)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__16);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg81__17);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg92() throws Exception {
        String __DSPOT_searchText_47 = "#nkib%A@IY:Wo-9M/^zO";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg92__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg92__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg92__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg92__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg92__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg92__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg92__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg92__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg92__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg92__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__16);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg92__17 = el.getElementsContainingText(__DSPOT_searchText_47);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg92__17.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg92__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg92__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg92__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg92__16);
    }

    @Test(timeout = 10000)
    public void orphanNodeReturnsNullForSiblingElements_mg91() throws Exception {
        String __DSPOT_searchText_46 = "6{+DN-eV8<Or;(?xw0]W";
        Node node = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        int o_orphanNodeReturnsNullForSiblingElements_mg91__8 = node.siblingIndex();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg91__8)));
        int o_orphanNodeReturnsNullForSiblingElements_mg91__9 = node.siblingNodes().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg91__9)));
        Node o_orphanNodeReturnsNullForSiblingElements_mg91__11 = node.previousSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__11);
        Node o_orphanNodeReturnsNullForSiblingElements_mg91__12 = node.nextSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__12);
        int o_orphanNodeReturnsNullForSiblingElements_mg91__13 = el.siblingElements().size();
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg91__13)));
        Element o_orphanNodeReturnsNullForSiblingElements_mg91__15 = el.previousElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__15);
        Element o_orphanNodeReturnsNullForSiblingElements_mg91__16 = el.nextElementSibling();
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__16);
        Elements o_orphanNodeReturnsNullForSiblingElements_mg91__17 = el.getElementsContainingOwnText(__DSPOT_searchText_46);
        Assert.assertTrue(o_orphanNodeReturnsNullForSiblingElements_mg91__17.isEmpty());
        Assert.assertTrue(((Element) (node)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (node)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (node)).hasText());
        Assert.assertFalse(((Element) (node)).hasParent());
        Assert.assertTrue(((Element) (el)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (el)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (el)).hasText());
        Assert.assertFalse(((Element) (el)).hasParent());
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg91__8)));
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg91__9)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__11);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__12);
        Assert.assertEquals(0, ((int) (o_orphanNodeReturnsNullForSiblingElements_mg91__13)));
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__15);
        Assert.assertNull(o_orphanNodeReturnsNullForSiblingElements_mg91__16);
    }

    private Attributes getAttributesCaseInsensitive(Element element, String attributeName) {
        Attributes matches = new Attributes();
        for (Attribute attribute : element.attributes()) {
            if (attribute.getKey().equalsIgnoreCase(attributeName)) {
                matches.put(attribute);
            }
        }
        return matches;
    }

    private Attributes singletonAttributes(String key, String value) {
        Attributes attributes = new Attributes();
        attributes.put(key, value);
        return attributes;
    }
}

