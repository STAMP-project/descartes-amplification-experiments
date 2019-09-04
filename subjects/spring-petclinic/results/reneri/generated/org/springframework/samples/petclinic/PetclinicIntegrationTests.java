/**
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic;


@org.junit.runner.RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@org.springframework.boot.test.context.SpringBootTest
public class PetclinicIntegrationTests {
    @org.springframework.beans.factory.annotation.Autowired
    private org.springframework.samples.petclinic.vet.VetRepository vets;

    @org.junit.Test
    public void testFindAll() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.springframework.samples.petclinic.vet.Vet>>observeState("org.springframework.samples.petclinic.PetclinicIntegrationTests|testFindAll()|1", java.util.Collection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.VetRepository>observeState("org.springframework.samples.petclinic.PetclinicIntegrationTests|testFindAll()|0", org.springframework.samples.petclinic.vet.VetRepository.class, vets).findAll());
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.springframework.samples.petclinic.vet.Vet>>observeState("org.springframework.samples.petclinic.PetclinicIntegrationTests|testFindAll()|3", java.util.Collection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.VetRepository>observeState("org.springframework.samples.petclinic.PetclinicIntegrationTests|testFindAll()|2", org.springframework.samples.petclinic.vet.VetRepository.class, vets).findAll()// served from cache
        );
    }
}

