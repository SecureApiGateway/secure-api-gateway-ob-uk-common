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
package uk.org.openbanking.datamodel.v4.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Specifies the status of resource in code form. For a list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBWriteInternationalStandingOrderResponse7DataStatus {

    RCVD("RCVD"),

    CANC("CANC"),

    ACTC("ACTC"),

    PATC("PATC"),

    PDNG("PDNG"),

    INFA("INFA"),

    INCO("INCO"),

    RJCT("RJCT");

    private String value;

    OBWriteInternationalStandingOrderResponse7DataStatus(String value) {
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
    public static OBWriteInternationalStandingOrderResponse7DataStatus fromValue(String value) {
        for (OBWriteInternationalStandingOrderResponse7DataStatus b : OBWriteInternationalStandingOrderResponse7DataStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

