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

import static com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRQuarterType.fromQuarterTypeString;

import java.util.Arrays;

import org.joda.time.DateTime;

import lombok.Data;

/**
 * Represents the frequency of the payments for a Standing Order Payment
 */
@Data
public class FRFrequency {
    private FRFrequencyType frequencyType;
    private String recurrence;
    private String day;

    /**
     * Initialize an @{link FRFrequency} object
     *
     * @param frequency the String containing the frequency values
     */
    public FRFrequency(String frequency) {
        String[] frequencyElements = frequency.split(":");
        switch (frequencyElements.length) {
        case 1: {
            this.frequencyType = FRFrequencyType.fromFrequencyString(frequencyElements[0]);
            break;
        }
        case 2: {
            this.frequencyType = FRFrequencyType.fromFrequencyString(frequencyElements[0]);
            this.recurrence = frequencyElements[1];
            break;
        }
        case 3: {
            this.frequencyType = FRFrequencyType.fromFrequencyString(frequencyElements[0]);
            this.recurrence = frequencyElements[1];
            this.day = frequencyElements[2];
            break;
        }
        default: {
            throw new IllegalStateException("The frequency doesn't match the regex format.");
        }
        }
    }

    /**
     * Provides the corresponding sentence for each {@link FRFrequencyType}.
     * Replaces the placeholders from the template sentences with the recurrence and the day in which the standing order payments are made.
     *
     * @return the corresponding sentence for each {@link FRFrequencyType}
     */
    public String getFormattedSentence() {
        switch (frequencyType) {
        case EVERYDAY:
        case EVERYWORKINGDAY: {
            return frequencyType.getSentence();
        }
        case INTERVALDAY: {
            return String.format(frequencyType.getSentence(), getTheOrdinalNumberForRecurrence(recurrence));
        }
        case INTERVALWEEKDAY:
        case INTERVALMONTHDAY:
        case WEEKINMONTHDAY: {
            return String.format(frequencyType.getSentence(), getTheOrdinalNumberForRecurrence(recurrence), getTheOrdinalNumberForDay(day));
        }
        case QUARTERDAY: {
            FRQuarterType quarterType = fromQuarterTypeString(recurrence);
            return String.format(frequencyType.getSentence(), fromDateTimeToString(quarterType.getQuarter1()), fromDateTimeToString(quarterType.getQuarter2()), fromDateTimeToString(quarterType.getQuarter3()), fromDateTimeToString(quarterType.getQuarter4()));
        }
        default:
            throw new IllegalStateException("Frequency type not identified");
        }
    }

    /**
     * Parse the {@link DateTime} to {@link String} using the day and month format
     * e.g. 4th June
     *
     * @param date the date
     * @return the date in the right format
     */
    private String fromDateTimeToString(DateTime date) {
        String dateTemplate = date.toString("'%d%s' MMMM");
        int day = date.getDayOfMonth();
        String ordinalSuffix = getOrdinalSuffix(day);
        return String.format(dateTemplate, day, ordinalSuffix);
    }

    /**
     * Get the ordinal number for the recurrence property
     *
     * @param number the number having the regex expression: (0?[1-9])|([1-2][0-9]|3[0-1])
     * @return the ordinal number
     */
    private String getTheOrdinalNumberForRecurrence(String number) {
        int intNumber = number.startsWith("0") ? Integer.parseInt(number.substring(1)) : Integer.parseInt(number);
        return intNumber + getOrdinalSuffix(intNumber);
    }

    /**
     * Get the ordinal number for the day property
     *
     * @param number the number having the regex expression: (-0[1-5]|0[1-9]|[12][0-9]|3[01])
     * @return the ordinal number
     */
    private String getTheOrdinalNumberForDay(String number) {
        switch (number) {
        case "-01":
        case "-1":
            return "last";
        case "-02":
        case "-2":
            return "penultimate";
        case "-03":
        case "-3":
            return "antepenultimate";
        case "-4":
        case "-04":
            return "preantepenultimate";
        case "-5":
        case "-05":
            return "propreantepenultimate";
        default: {
            int intNumber = number.startsWith("0") ? Integer.parseInt(number.substring(1)) : Integer.parseInt(number);
            return intNumber + getOrdinalSuffix(intNumber);
        }
        }
    }

    /**
     * Get the right ordinal suffix for a number
     *
     * @param number the number
     * @return the ordinal suffix
     */
    private static String getOrdinalSuffix(int number) {
        if (Arrays.asList(11, 12, 13).contains(number)) {
            return "th";
        } else if (number % 10 == 1) {
            return "st";
        } else if (number % 10 == 2) {
            return "nd";
        } else if (number % 10 == 3) {
            return "rd";
        } else {
            return "th";
        }
    }
}
