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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment;

import java.util.stream.Stream;

public enum FRStandingOrderFrequencyCode {
    ADHO("ADHO"),
    YEAR("YEAR"),
    DAIL("DAIL"),
    FRTN("FRTN"),
    INDA("INDA"),
    MNTH("MNTH"),
    QURT("QURT"),
    MIAN("MIAN"),
    WEEK("WEEK");

    private final String value;

    FRStandingOrderFrequencyCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }

    public static FRStandingOrderFrequencyCode fromValue(String value) {
        return Stream.of(values())
                .filter(code -> code.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }

}
