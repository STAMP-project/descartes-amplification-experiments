package org.springframework.samples.petclinic.owner;


/**
 * Test class for {@link PetTypeFormatter}
 *
 * @author Colin But
 */
@org.junit.runner.RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class PetTypeFormatterTests {
    @org.mockito.Mock
    private org.springframework.samples.petclinic.owner.PetRepository pets;

    private org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter;

    @org.junit.Before
    public void setup() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetTypeFormatter>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|setup()|1", org.springframework.samples.petclinic.owner.PetTypeFormatter.class, (this.petTypeFormatter = new org.springframework.samples.petclinic.owner.PetTypeFormatter(eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetRepository>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|setup()|0", org.springframework.samples.petclinic.owner.PetRepository.class, pets))));
    }

    @org.junit.Test
    public void testPrint() {
        org.springframework.samples.petclinic.owner.PetType petType = eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetType>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|0", org.springframework.samples.petclinic.owner.PetType.class, new org.springframework.samples.petclinic.owner.PetType());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetType>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|1", org.springframework.samples.petclinic.owner.PetType.class, petType).setName("Hamster");
        java.lang.String petTypeName = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetTypeFormatter>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|2", org.springframework.samples.petclinic.owner.PetTypeFormatter.class, this.petTypeFormatter).print(eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetType>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|3", org.springframework.samples.petclinic.owner.PetType.class, petType), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|4", java.util.Locale.class, java.util.Locale.ENGLISH)));
        org.junit.Assert.assertEquals("Hamster", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|testPrint()|6", petTypeName));
    }

    @org.junit.Test
    public void shouldParse() throws java.text.ParseException {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.util.List<org.springframework.samples.petclinic.owner.PetType>>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|4", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.util.List<org.springframework.samples.petclinic.owner.PetType>>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|2", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|1", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetRepository>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|0", org.springframework.samples.petclinic.owner.PetRepository.class, this.pets).findPetTypes()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|3", java.util.List.class, makePetTypes())));
        org.springframework.samples.petclinic.owner.PetType petType = eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetType>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|7", org.springframework.samples.petclinic.owner.PetType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetTypeFormatter>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|5", org.springframework.samples.petclinic.owner.PetTypeFormatter.class, petTypeFormatter).parse("Bird", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|6", java.util.Locale.class, java.util.Locale.ENGLISH)));
        org.junit.Assert.assertEquals("Bird", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetType>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldParse()|8", org.springframework.samples.petclinic.owner.PetType.class, petType).getName()));
    }

    @org.junit.Test(expected = java.text.ParseException.class)
    public void shouldThrowParseException() throws java.text.ParseException {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.util.List<org.springframework.samples.petclinic.owner.PetType>>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|4", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.util.List<org.springframework.samples.petclinic.owner.PetType>>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|2", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|1", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetRepository>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|0", org.springframework.samples.petclinic.owner.PetRepository.class, this.pets).findPetTypes()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|3", java.util.List.class, makePetTypes())));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetType>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|7", org.springframework.samples.petclinic.owner.PetType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.owner.PetTypeFormatter>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|5", org.springframework.samples.petclinic.owner.PetTypeFormatter.class, petTypeFormatter).parse("Fish", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|6", java.util.Locale.class, java.util.Locale.ENGLISH)));
        } catch (java.text.ParseException a1552789878892) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|shouldThrowParseException()|!", a1552789878892);
            throw a1552789878892;
        }
    }

    /**
     * Helper method to produce some sample pet types just for test purpose
     *
     * @return {@link Collection} of {@link PetType}
     */
    private java.util.List<org.springframework.samples.petclinic.owner.PetType> makePetTypes() {
        java.util.List<org.springframework.samples.petclinic.owner.PetType> petTypes = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|makePetTypes()|0", java.util.ArrayList.class, new java.util.ArrayList<>());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|makePetTypes()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|makePetTypes()|1", java.util.List.class, petTypes).add(new org.springframework.samples.petclinic.owner.PetType() {
            {
                setName("Dog");
            }
        }));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|makePetTypes()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|makePetTypes()|4", java.util.List.class, petTypes).add(new org.springframework.samples.petclinic.owner.PetType() {
            {
                setName("Bird");
            }
        }));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.springframework.samples.petclinic.owner.PetType>>observeState("org.springframework.samples.petclinic.owner.PetTypeFormatterTests|makePetTypes()|7", java.util.List.class, petTypes);
    }
}

