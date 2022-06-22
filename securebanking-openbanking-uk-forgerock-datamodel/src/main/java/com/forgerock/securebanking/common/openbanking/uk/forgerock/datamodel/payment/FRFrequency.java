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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRQuarterType.fromQuarterTypeString;

/**
 * Represents the frequency of the payments for a Standing Order Payment
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FRFrequency {
    private FRFrequencyType frequencyType;
    private String recurrence;
    private String day;

    public String getSentence() {
        switch (frequencyType) {
            case EVERYDAY, EVERYWORKINGDAY -> {
                return frequencyType.getSentence();
            }
            case INTERVALWEEKDAY, INTERVALMONTHDAY, WEEKINMONTHDAY, INTERVALDAY -> {
                return String.format(frequencyType.getSentence(), getTheOrdinalNumberForRecurrence(recurrence), getTheOrdinalNumberForDay(day));
            }
            case QUARTERDAY -> {
                FRQuarterType quarterType = fromQuarterTypeString(recurrence);
                return String.format(frequencyType.getSentence(), fromDateTimeToString(quarterType.getQuarter1()), fromDateTimeToString(quarterType.getQuarter2()), fromDateTimeToString(quarterType.getQuarter3()), fromDateTimeToString(quarterType.getQuarter4()));
            }
            default -> throw new IllegalStateException("Frequency type not identified");
        }
    }

    public String fromDateTimeToString(DateTime date) {
        String dateTemplate = date.toString("'%d%s' MMMM");
        int day = date.getDayOfMonth();
        String ordinalSuffix = getOrdinalSuffix(day);
        return String.format(dateTemplate, day, ordinalSuffix);
    }

    public String getTheOrdinalNumberForRecurrence(String number) {
        int intNumber = number.startsWith("0") ? Integer.parseInt(number.substring(1)) : Integer.parseInt(number);
        return intNumber + getOrdinalSuffix(intNumber) + " ";
    }

    public String getTheOrdinalNumberForDay(String number) {
        switch (number) {
            case "-01":
                return "last";
            case "-02":
                return "penultimate";
            case "-03":
                return "antepenultimate";
            case "-04":
                return "preantepenultimate";
            case "-05":
                return "propreantepenultimate";
            default: {
                int intNumber = number.startsWith("0") ? Integer.parseInt(number.substring(1)) : Integer.parseInt(number);
                return intNumber + getOrdinalSuffix(intNumber);
            }
        }
    }

    public static String getOrdinalSuffix(int number) {
        if (number < 1 || number > 31)
            throw new IllegalArgumentException(
                    String.format("Bad day of month (%s)", number));

        return switch (number) {
            case 1, 21, 31 -> "st";
            case 2, 22 -> "nd";
            case 3, 23 -> "rd";
            default -> "th";
        };
    }
}
