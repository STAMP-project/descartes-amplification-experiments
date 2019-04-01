
**Method:** `org.springframework.samples.petclinic.owner.VisitController.setAllowedFields(Lorg/springframework/web/bind/WebDataBinder;)V`
**Transformations:** `void`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `void`         | Y         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
@Controller
class VisitController {
    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}
```

## Observations
The method seems to be invoked by the testing framework.
