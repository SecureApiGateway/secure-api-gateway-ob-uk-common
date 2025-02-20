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
package uk.org.openbanking.datamodel.v4.vrp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Specifies the type of creditor reference as published in an external creditor reference type code set.  External code sets can be downloaded from www.iso20022.org. *`DISP`-Document is a dispatch advice. *`FXDR`-Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers. *`PUOR`-Document is a purchase order. *`RPIN`-Document is a linked payment instruction to which the current payment instruction is related, for example, in a cover scenario. *`RADM`-Document is a remittance advice sent separately from the current transaction. *`SCOR`-Document is a structured communication reference provided by the creditor to identify the referred transaction.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBExternalCreditorReferenceType1Code {

    DISP("DISP"),

    FXDR("FXDR"),

    PUOR("PUOR"),

    RPIN("RPIN"),

    RADM("RADM"),

    SCOR("SCOR");

    private String value;

    OBExternalCreditorReferenceType1Code(String value) {
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
    public static OBExternalCreditorReferenceType1Code fromValue(String value) {
        for (OBExternalCreditorReferenceType1Code b : OBExternalCreditorReferenceType1Code.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

