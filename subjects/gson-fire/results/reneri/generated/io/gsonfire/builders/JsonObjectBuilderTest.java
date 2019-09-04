package io.gsonfire.builders;


/**
 * Created by julio on 8/18/16.
 */
public class JsonObjectBuilderTest {
    @org.junit.Test
    public void setString() throws java.lang.Exception {
        com.google.gson.JsonObject built = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|1", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("a", "aa")).set("b", "bb")).build());
        com.google.gson.JsonObject expected = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|4", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|5", com.google.gson.JsonObject.class, expected).addProperty("a", "aa");
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|6", com.google.gson.JsonObject.class, expected).addProperty("b", "bb");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|7", com.google.gson.JsonObject.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setString()|8", com.google.gson.JsonObject.class, built));
    }

    @org.junit.Test
    public void setNumber() throws java.lang.Exception {
        com.google.gson.JsonObject built = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|5", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|4", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|3", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|1", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("a", 1)).set("b", 2.0F)).set("c", 3.1F)).set("d", 4L)).build());
        com.google.gson.JsonObject expected = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|6", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|7", com.google.gson.JsonObject.class, expected).addProperty("a", 1);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|8", com.google.gson.JsonObject.class, expected).addProperty("b", 2.0F);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|9", com.google.gson.JsonObject.class, expected).addProperty("c", 3.1F);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|10", com.google.gson.JsonObject.class, expected).addProperty("d", 4L);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|11", com.google.gson.JsonObject.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNumber()|12", com.google.gson.JsonObject.class, built));
    }

    @org.junit.Test
    public void setBoolean() throws java.lang.Exception {
        com.google.gson.JsonObject built = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|1", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("a", true)).set("b", false)).build());
        com.google.gson.JsonObject expected = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|4", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|5", com.google.gson.JsonObject.class, expected).addProperty("a", true);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|6", com.google.gson.JsonObject.class, expected).addProperty("b", false);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|7", com.google.gson.JsonObject.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBoolean()|8", com.google.gson.JsonObject.class, built));
    }

    @org.junit.Test
    public void setJsonElement() throws java.lang.Exception {
        com.google.gson.JsonObject built = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|11", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|10", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|8", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|4", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("a", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|1", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("x", 1)).build()))).set("b", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|7", com.google.gson.JsonArray.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonArrayBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|6", io.gsonfire.builders.JsonArrayBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonArrayBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|5", io.gsonfire.builders.JsonArrayBuilder.class, io.gsonfire.builders.JsonArrayBuilder.start()).add("something")).build()))).set("c", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|9", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive(1)))).build());
        com.google.gson.JsonObject a = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|12", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|13", com.google.gson.JsonObject.class, a).addProperty("x", 1);
        com.google.gson.JsonArray b = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|14", com.google.gson.JsonArray.class, new com.google.gson.JsonArray());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|15", com.google.gson.JsonArray.class, b).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|16", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive("something")));
        com.google.gson.JsonObject expected = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|17", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|18", com.google.gson.JsonObject.class, expected).add("a", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|19", com.google.gson.JsonObject.class, a));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|20", com.google.gson.JsonObject.class, expected).add("b", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonArray>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|21", com.google.gson.JsonArray.class, b));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|22", com.google.gson.JsonObject.class, expected).add("c", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonPrimitive>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|23", com.google.gson.JsonPrimitive.class, new com.google.gson.JsonPrimitive(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|24", com.google.gson.JsonObject.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setJsonElement()|25", com.google.gson.JsonObject.class, built));
    }

    @org.junit.Test
    public void setBuildImmutable() throws java.lang.Exception {
        io.gsonfire.builders.JsonObjectBuilder builder = eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder());
        com.google.gson.JsonObject jsonObject1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|3", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|1", io.gsonfire.builders.JsonObjectBuilder.class, builder).set("a", 1)).build());
        com.google.gson.JsonObject jsonObject2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|6", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|5", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|4", io.gsonfire.builders.JsonObjectBuilder.class, builder).set("b", 2)).build());
        com.google.gson.JsonObject expected1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|7", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|8", com.google.gson.JsonObject.class, expected1).addProperty("a", 1);
        com.google.gson.JsonObject expected2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|9", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|10", com.google.gson.JsonObject.class, expected2).addProperty("a", 1);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|11", com.google.gson.JsonObject.class, expected2).addProperty("b", 2);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|12", com.google.gson.JsonObject.class, expected1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|13", com.google.gson.JsonObject.class, jsonObject1));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|14", com.google.gson.JsonObject.class, expected2), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setBuildImmutable()|15", com.google.gson.JsonObject.class, jsonObject2));
    }

    @org.junit.Test
    public void setNull() throws java.lang.Exception {
        com.google.gson.JsonObject built = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|2", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|1", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).setNull("a")).build());
        com.google.gson.JsonObject expected = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|3", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|4", com.google.gson.JsonObject.class, expected).add("a", null);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|5", com.google.gson.JsonObject.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|setNull()|6", com.google.gson.JsonObject.class, built));
    }

    @org.junit.Test
    public void merge() throws java.lang.Exception {
        com.google.gson.JsonObject built = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|8", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|7", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|2", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|1", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|0", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("a", 1)).set("b", "b")).merge(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|6", com.google.gson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|5", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|4", io.gsonfire.builders.JsonObjectBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<io.gsonfire.builders.JsonObjectBuilder>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|3", io.gsonfire.builders.JsonObjectBuilder.class, new io.gsonfire.builders.JsonObjectBuilder()).set("b", "b2")).set("c", true)).build()))).build());
        com.google.gson.JsonObject expected = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|9", com.google.gson.JsonObject.class, new com.google.gson.JsonObject());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|10", com.google.gson.JsonObject.class, expected).addProperty("a", 1);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|11", com.google.gson.JsonObject.class, expected).addProperty("b", "b2");
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|12", com.google.gson.JsonObject.class, expected).addProperty("c", true);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|13", com.google.gson.JsonObject.class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.gson.JsonObject>observeState("io.gsonfire.builders.JsonObjectBuilderTest|merge()|14", com.google.gson.JsonObject.class, built));
    }
}
