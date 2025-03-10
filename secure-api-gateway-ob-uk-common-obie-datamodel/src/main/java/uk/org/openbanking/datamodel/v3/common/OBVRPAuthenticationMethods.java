/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v3.common;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBVRPAuthenticationMethods {

    SCA("UK.OBIE.SCA"),
    SCA_NOT_REQUIRED("UK.OBIE.SCANotRequired");

    private String value;

    OBVRPAuthenticationMethods(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBVRPAuthenticationMethods fromValue(String value) {
        for (OBVRPAuthenticationMethods enum_ : OBVRPAuthenticationMethods.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
