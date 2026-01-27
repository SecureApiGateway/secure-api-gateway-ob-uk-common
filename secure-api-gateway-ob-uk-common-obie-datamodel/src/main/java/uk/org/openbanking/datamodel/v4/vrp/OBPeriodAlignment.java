/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
 * Specifies whether the period starts on the date of consent creation or lines up with a calendar. As the ISO calendar does not support or provide any guidance on when a fortnight should start, a `PeriodType` of `Fortnight` the `PeriodAlignment` must be `Consent`.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBPeriodAlignment {

    CONSENT("Consent"),

    CALENDAR("Calendar");

    private String value;

    OBPeriodAlignment(String value) {
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
    public static OBPeriodAlignment fromValue(String value) {
        for (OBPeriodAlignment b : OBPeriodAlignment.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

