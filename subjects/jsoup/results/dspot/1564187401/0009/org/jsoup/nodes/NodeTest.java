package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;


public class NodeTest {
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

