/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How often is the overdraft fee/charge calculated for the account.
 */
public enum OBFeeFrequency1Code1 {

    FEAC("FEAC"),

    FEAO("FEAO"),

    FECP("FECP"),

    FEDA("FEDA"),

    FEHO("FEHO"),

    FEI("FEI"),

    FEMO("FEMO"),

    FEOA("FEOA"),

    FEOT("FEOT"),

    FEPC("FEPC"),

    FEPH("FEPH"),

    FEPO("FEPO"),

    FEPS("FEPS"),

    FEPT("FEPT"),

    FEPTA("FEPTA"),

    FEPTP("FEPTP"),

    FEQU("FEQU"),

    FESM("FESM"),

    FEST("FEST"),

    FEWE("FEWE"),

    FEYE("FEYE");

    private String value;

    OBFeeFrequency1Code1(String value) {
        this.value = value;
    }

    @JsonCreator
    public static OBFeeFrequency1Code1 fromValue(String text) {
        for (OBFeeFrequency1Code1 b : OBFeeFrequency1Code1.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
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

