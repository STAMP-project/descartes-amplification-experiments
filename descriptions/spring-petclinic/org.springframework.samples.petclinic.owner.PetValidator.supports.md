
**Method:** `org.springframework.samples.petclinic.owner.PetValidator.supports(Ljava/lang/Class;)Z`
**Transformations:** `true`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `true`         | N         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
public class PetValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Pet.class.isAssignableFrom(clazz);
    }
}
```


## Observations
It is a very simple method. It is being tested from the `PetControllerTests` class only. It is easy to test directly.