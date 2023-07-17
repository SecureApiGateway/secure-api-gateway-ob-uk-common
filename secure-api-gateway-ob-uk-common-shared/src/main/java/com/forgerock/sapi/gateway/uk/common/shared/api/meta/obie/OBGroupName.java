/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.forgerock.sapi.gateway.uk.common.shared.api.meta.obie;

public enum OBGroupName {

    AISP("aisp"),
    PISP("pisp"),
    CBPII("cbpii"),
    INFO("info"),
    EVENT(""),
    NONE("");

    private String reference;

    OBGroupName(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }
}
