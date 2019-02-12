**Method:** `io.gsonfire.util.reflection.AnnotationInspector.getFromCache(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Collection;`
**Transformations:** `null`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `null`          | Y         | N           | N        |

# Environment

Covered by 8 test classes.

## Method

```Java
public abstract class AnnotationInspector<T extends AccessibleObject, M> {

    private final ConcurrentMap<Class, ConcurrentMap<Class<? extends Annotation>, Collection<M>>> cache = new ConcurrentHashMap<Class, ConcurrentMap<Class<? extends Annotation>, Collection<M>>>();

    private Collection<M> getFromCache(Class clazz, Class<? extends Annotation> annotation) {
        Map<Class<? extends Annotation>, Collection<M>> annotationMap = cache.get(clazz);
        if(annotationMap != null){
            Collection<M> methods = annotationMap.get(annotation);
            if(methods != null){
                return methods;
            }
        }
        return null;
    }

    public Collection<M> getAnnotatedMembers(Class clazz, Class<? extends Annotation> annotation){
        if(clazz != null) {
            Collection<M> members = getFromCache(clazz, annotation);
            if (members != null) {
                return members;
            }

            //Cache miss, we need to use reflections to get the fields
            members = getFromCache(clazz, annotation);
            if (members == null) {

                Set<M> memberList = new LinkedHashSet<M>();
                //Add methods declared in the class
                for (T m : getDeclaredMembers(clazz)) {
                    if (m.isAnnotationPresent(annotation)) {
                        m.setAccessible(true);
                        memberList.add(map(m));
                    }
                }

                //Add methods from super class
                memberList.addAll(getAnnotatedMembers(clazz.getSuperclass(), annotation));

                //Add methods from interfaces
                for (Class interfaceClass : clazz.getInterfaces()) {
                    memberList.addAll(getAnnotatedMembers(interfaceClass, annotation));
                }

                ConcurrentMap<Class<? extends Annotation>, Collection<M>> newAnnotationMap = new ConcurrentHashMap<Class<? extends Annotation>, Collection<M>>();
                ConcurrentMap<Class<? extends Annotation>, Collection<M>> storedAnnotationMap = cache.putIfAbsent(clazz, newAnnotationMap);
                storedAnnotationMap = storedAnnotationMap == null ? newAnnotationMap : storedAnnotationMap;
                storedAnnotationMap.put(annotation, memberList);
                return memberList;
            }
        }


        return Collections.emptyList();
    }
}
```

## Tests

```Java
 @Test
    public void testConflictResolution(){
        GsonFireBuilder builder = new GsonFireBuilder()
            .enableExposeMethodResult();

        Gson gson = builder.createGson();

        ForConflict c = new ForConflict();
        c.a = "A";
        c.b = "B";

        JsonObject obj = gson.toJsonTree(c).getAsJsonObject();

        assertEquals(c.getA(), obj.get("a").getAsString());
        assertEquals(c.b, obj.get("b").getAsString());
        assertEquals(c.getC(), obj.get("c").getAsString());
        assertEquals(c.getD(), obj.get("d").getAsString());
    }

```

## Observations
Since the method is a cache search implementation, then, when the cache misses
(i.e. the method returns `null`) then, it populates the cache again, so no
side-effect is produced.
This is a case where the class is not designed to be tested. Both, the method and
the cache are private.
The infection comes from the result value. It should not be `null` for two executions.