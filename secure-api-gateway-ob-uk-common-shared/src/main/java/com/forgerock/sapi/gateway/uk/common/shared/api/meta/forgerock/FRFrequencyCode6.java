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
package com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the frequency of the payments for a Standing Order Payment
 */
public enum FRFrequencyCode6 {

    ADHO("ADHO"),

    YEAR("YEAR"),

    DAIL("DAIL"),

    FRTN("FRTN"),

    INDA("INDA"),

    MNTH("MNTH"),

    QURT("QURT"),

    MIAN("MIAN"),

    WEEK("WEEK");

    private String value;

    FRFrequencyCode6(String value) {
        this.value = value;
    }

    @JsonCreator
    public static FRFrequencyCode6 fromValue(String value) {
        for (FRFrequencyCode6 b : FRFrequencyCode6.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
