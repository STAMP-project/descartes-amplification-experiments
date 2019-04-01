
**Method:** `org.springframework.samples.petclinic.owner.PetController.initOwnerBinder(Lorg/springframework/web/bind/WebDataBinder;)V`
**Transformations:** `void`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `void`         | Y         | N           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
@Controller
@RequestMapping("/owners/{ownerId}")
class PetController {
    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}

```

## Observations
The infection can be observed at the end of the method invocation in the state of the parameter. 
The method can be tested directly. It is not directly tested by the class.