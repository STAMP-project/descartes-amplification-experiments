/**
 * Copyright 2016-2017 the original author or authors.
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
package org.springframework.samples.petclinic.vet;


/**
 *
 *
 * @author Dave Syer
 */
public class VetTests {
    @org.junit.Test
    public void testSerialization() {
        org.springframework.samples.petclinic.vet.Vet vet = eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|0", org.springframework.samples.petclinic.vet.Vet.class, new org.springframework.samples.petclinic.vet.Vet());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|1", org.springframework.samples.petclinic.vet.Vet.class, vet).setFirstName("Zaphod");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|2", org.springframework.samples.petclinic.vet.Vet.class, vet).setLastName("Beeblebrox");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|3", org.springframework.samples.petclinic.vet.Vet.class, vet).setId(123);
        org.springframework.samples.petclinic.vet.Vet other = eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|6", org.springframework.samples.petclinic.vet.Vet.class, ((org.springframework.samples.petclinic.vet.Vet) (org.springframework.util.SerializationUtils.deserialize(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|5", byte[].class, org.springframework.util.SerializationUtils.serialize(eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|4", org.springframework.samples.petclinic.vet.Vet.class, vet)))))));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|7", org.springframework.samples.petclinic.vet.Vet.class, other).getFirstName())).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|9", org.springframework.samples.petclinic.vet.Vet.class, vet).getFirstName()));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|11", org.springframework.samples.petclinic.vet.Vet.class, other).getLastName())).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|13", org.springframework.samples.petclinic.vet.Vet.class, vet).getLastName()));
        org.assertj.core.api.Assertions.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|15", org.springframework.samples.petclinic.vet.Vet.class, other).getId())).isEqualTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.springframework.samples.petclinic.vet.Vet>observeState("org.springframework.samples.petclinic.vet.VetTests|testSerialization()|17", org.springframework.samples.petclinic.vet.Vet.class, vet).getId()));
    }
}

