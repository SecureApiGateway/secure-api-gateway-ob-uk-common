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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBWriteInternational3DataInitiationInstructionPriority {

    NORMAL("Normal"),

    URGENT("Urgent");

    private String value;

    OBWriteInternational3DataInitiationInstructionPriority(String value) {
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
    public static OBWriteInternational3DataInitiationInstructionPriority fromValue(String value) {
        for (OBWriteInternational3DataInitiationInstructionPriority b : OBWriteInternational3DataInitiationInstructionPriority.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

