
**Method:** `cn.jpush.api.push.model.Options.sendno()Lcn/jpush/api/push/model/Options;`
**Transformations:** `null`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `null`          | Y         | Y           | A        |

# Environment
Covered by 1 test class.
5 test cases. 

## Method

```Java
public class Options implements PushModel {

    public static Options sendno() {
        return newBuilder().setSendno(ServiceHelper.generateSendno()).build();
    }

}
```

```Java
class PushPayload {
    class Builder {
        public PushPayload build() {
            Preconditions.checkArgument(! (null == audience || null == platform), "audience and platform both should be set.");
            Preconditions.checkArgument(! (null == notification && null == message), "notification or message should be set at least one.");
            
            // if options is not set, a sendno will be generated for tracing easily
            if (null == options) {
                options = Options.sendno();
            }
            
            return new PushPayload(platform, audience, notification, message, options, sms, cid);
        }
    }

    public int getSendno() {
        if (null != options) {
            return options.getSendno();
        }
        return 0;
    }
}
```

## Tests

Covered by 5 similar test cases for example:

```Java
 public void testGlobalExceed() {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setMessage(Message.content(LONG_TEXT_2))
                .build();
    	System.out.println("Size: " + LONG_TEXT_2.getBytes().length);
        Assert.assertFalse("Shouldn't exceed - " + LONG_TEXT_2.getBytes().length, 
                payload.isGlobalExceedLength());
    }
```

The method is being used in the `build()` invocation.

## Observations

`options` can not be accessed directly but it could be checked using `getSendno()`.
However, a new test case could be better than adding an unrelated assertion.