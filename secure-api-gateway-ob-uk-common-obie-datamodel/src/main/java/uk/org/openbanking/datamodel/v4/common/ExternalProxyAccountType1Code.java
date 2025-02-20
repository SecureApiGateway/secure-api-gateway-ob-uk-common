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
package uk.org.openbanking.datamodel.v4.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Specifies the external proxy account type code, as published in the proxy account type external code set.<br> For more information and a full list of values see `ExternalProxyAccountType1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum ExternalProxyAccountType1Code {

    TELE("TELE"),

    EMAL("EMAL"),

    DNAM("DNAM"),

    CINC("CINC"),

    COTX("COTX"),

    COID("COID"),

    CUST("CUST"),

    DRLC("DRLC"),

    EIDN("EIDN"),

    EWAL("EWAL"),

    PVTX("PVTX"),

    LEIC("LEIC"),

    MBNO("MBNO"),

    NIDN("NIDN"),

    CCPT("CCPT"),

    SHID("SHID"),

    SOSE("SOSE"),

    TOKN("TOKN"),

    UBIL("UBIL"),

    VIPN("VIPN"),

    BIID("BIID");

    private String value;

    ExternalProxyAccountType1Code(String value) {
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
    public static ExternalProxyAccountType1Code fromValue(String value) {
        for (ExternalProxyAccountType1Code b : ExternalProxyAccountType1Code.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

