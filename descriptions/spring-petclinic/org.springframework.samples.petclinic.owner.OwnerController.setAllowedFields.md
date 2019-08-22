
**Method:** `org.springframework.samples.petclinic.owner.OwnerController.setAllowedFields(Lorg/springframework/web/bind/WebDataBinder;)V`
**Transformations:** `void`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `void`         | Y         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
@Controller
class OwnerController {

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}
```

## Observations
It is used in the `OwnerControllerTests` as part of the mechanism as it is not being called directly. 
This seems to be a common practice: https://stackoverflow.com/questions/15031049/using-the-setallowedfields-method-in-spring
The effects can be checked in the instance of `WebDataBinder`.