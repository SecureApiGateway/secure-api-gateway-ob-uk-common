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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.common;

import java.util.stream.Stream;

public enum FRExternalExtendedAccountTypeCode {

    BUSINESS("Business"),

    BUSINESSSAVINGSACCOUNT("BusinessSavingsAccount"),

    CHARITY("Charity"),

    COLLECTION("Collection"),

    CORPORATE("Corporate"),

    EWALLET("Ewallet"),

    GOVERNMENT("Government"),

    INVESTMENT("Investment"),

    ISA("ISA"),

    JOINTPERSONAL("JointPersonal"),

    PENSION("Pension"),

    PERSONAL("Personal"),

    PERSONALSAVINGSACCOUNT("PersonalSavingsAccount"),

    PREMIER("Premier"),

    WEALTH("Wealth");

    private String value;

    FRExternalExtendedAccountTypeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }

    public static FRExternalExtendedAccountTypeCode fromValue(String value) {
        return Stream.of(values())
                .filter(v -> v.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }
}
