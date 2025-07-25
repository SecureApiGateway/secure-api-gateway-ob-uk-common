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
package uk.org.openbanking.datamodel.v4.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * `OBFrequency6Code` on External Codset Repo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBFrequency6Code {

    ADHO("ADHO"),

    YEAR("YEAR"),

    DAIL("DAIL"),

    FRTN("FRTN"),

    INDA("INDA"),

    MNTH("MNTH"),

    QURT("QURT"),

    MIAN("MIAN"),

    WEEK("WEEK"),

    WEEK2("WEEK"),

    WODL("WODL"),

    FOWK("FOWK"),

    TWMH("TWMH"),

    FOMH("FOMH"),

    FIMH("FIMH"),

    ALMH("ALMH"),

    NONE("NONE");

    private String value;

    OBFrequency6Code(String value) {
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
    public static OBFrequency6Code fromValue(String value) {
        for (OBFrequency6Code b : OBFrequency6Code.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

