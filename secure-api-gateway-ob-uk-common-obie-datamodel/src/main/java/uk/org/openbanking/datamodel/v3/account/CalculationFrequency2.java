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
package uk.org.openbanking.datamodel.v3.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * How frequently the fee/charge is calculated
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum CalculationFrequency2 {

    ONCLOSING("OnClosing"),

    ONOPENING("OnOpening"),

    CHARGINGPERIOD("ChargingPeriod"),

    DAILY("Daily"),

    PERITEM("PerItem"),

    MONTHLY("Monthly"),

    ONANNIVERSARY("OnAnniversary"),

    OTHER("Other"),

    PERHUNDREDPOUNDS("PerHundredPounds"),

    PERHOUR("PerHour"),

    PEROCCURRENCE("PerOccurrence"),

    PERSHEET("PerSheet"),

    PERTRANSACTION("PerTransaction"),

    PERTRANSACTIONAMOUNT("PerTransactionAmount"),

    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

    QUARTERLY("Quarterly"),

    SIXMONTHLY("SixMonthly"),

    STATEMENTMONTHLY("StatementMonthly"),

    WEEKLY("Weekly"),

    YEARLY("Yearly");

    private String value;

    CalculationFrequency2(String value) {
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
    public static CalculationFrequency2 fromValue(String value) {
        for (CalculationFrequency2 b : CalculationFrequency2.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

