
**Method:** `org.springframework.samples.petclinic.vet.Vet.addSpecialty(Lorg/springframework/samples/petclinic/vet/Specialty;)V`
**Transformations:** `void`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
| `void`         | Y         | Y           | I        |


# Environment

Covered by 1 test classes.

## Method

```Java
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties;

    protected Set<Specialty> getSpecialtiesInternal() {
        if (this.specialties == null) {
            this.specialties = new HashSet<>();
        }
        return this.specialties;
    }
    public void addSpecialty(Specialty specialty) {
        getSpecialtiesInternal().add(specialty);
    }
```

## Tests

```Java
public class VetControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VetRepository vets;

    @Before
    public void setup() {
        Vet james = new Vet();
        james.setFirstName("James");
        james.setLastName("Carter");
        james.setId(1);
        Vet helen = new Vet();
        helen.setFirstName("Helen");
        helen.setLastName("Leary");
        helen.setId(2);
        Specialty radiology = new Specialty();
        radiology.setId(1);
        radiology.setName("radiology");
        helen.addSpecialty(radiology);
        given(this.vets.findAll()).willReturn(Lists.newArrayList(james, helen));
    }

    @Test
    public void testShowVetListHtml() throws Exception {
        mockMvc.perform(get("/vets.html"))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("vets"))
            .andExpect(view().name("vets/vetList"));
    }

    @Test
    public void testShowResourcesVetList() throws Exception {
        ResultActions actions = mockMvc.perform(get("/vets")
            .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
        actions.andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.vetList[0].id").value(1));
    }
}

```

## Observations
The propagation occurs in the `setup` method of the test class. The collection of specialties is observed to be null, but should be null.
That should be the result of `helen.addSpecialty(radiology)`. The method is a sort of delegation but it is delegated to the result of a method invocation.
The method is, of course, testable. It is easy to create such a test case with the same input as given by the mentioned test class. It is probably not in the interest of the developers to create a test case here to do that. There is a class to test `Vet` but the focus is on the serialization.
