/*
 * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v4.vrp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Indicates interaction type, currently if customer is present or not present. If not provided the default is `'OffSession'` (customer is not present) when the individual VRP payment is made.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBVRPInteractionTypes {

    INSESSION("InSession"),

    OFFSESSION("OffSession");

    private String value;

    OBVRPInteractionTypes(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBVRPInteractionTypes fromValue(String value) {
        for (OBVRPInteractionTypes b : OBVRPInteractionTypes.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

