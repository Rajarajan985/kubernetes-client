/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.crd.generator.approvaltests.k8svalidation;

import io.fabric8.crd.generator.approvaltests.AbstractCRDGeneratorApprovalTest;
import io.fabric8.kubernetes.client.CustomResource;

class K8sValidationApprovalTest extends AbstractCRDGeneratorApprovalTest {

  protected Class<? extends CustomResource<?, ?>>[] crClasses() {
    return new Class[] {
        io.fabric8.crd.generator.approvaltests.k8svalidation.api.K8sValidation.class
    };
  }

  protected String[] expectedCRDs() {
    return new String[] {
        "k8svalidations.samples.fabric8.io"
    };
  }
}