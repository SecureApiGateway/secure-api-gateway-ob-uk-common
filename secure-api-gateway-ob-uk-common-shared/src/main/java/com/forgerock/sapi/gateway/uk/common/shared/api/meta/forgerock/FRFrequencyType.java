/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import java.util.regex.Pattern;

/**
 * Type: string
 * Description: Individual Definitions:
 * EvryDay - Every day
 * EvryWorkgDay - Every working day
 * IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07)
 * WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07)
 * IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31)
 * QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).
 * ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.
 * SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November.
 * RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.
 * Individual Patterns:
 * EvryDay (ScheduleCode)
 * EvryWorkgDay (ScheduleCode)
 * IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek)
 * WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek)
 * IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth)
 * QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay
 * The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here:
 * EvryDay
 * EvryWorkgDay
 * IntrvlWkDay:0[1-9]:0[1-7]
 * WkInMnthDay:0[1-5]:0[1-7]
 * IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01])
 * QtrDay:(ENGLISH|SCOTTISH|RECEIVED)
 * Full Regular Expression:
 * ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
 * Pattern: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
 */
public enum FRFrequencyType {
    EVERYDAY("EvryDay", null, "Every day."),
    EVERYWORKINGDAY("EvryWorkgDay", null, "Every working day."),
    INTERVALWEEKDAY("IntrvlWkDay", "0?([1-9]):0?([1-7])$", "Every %sweek, on the %s day of the week."),
    WEEKINMONTHDAY("WkInMnthDay", "0?([1-5]):0?([1-7])$", "Every month, on the %sweek of the month, and on the %s day of the week."),
    INTERVALMONTHDAY("IntrvlMnthDay", "(0?[1-6]|12|24):(-0?[1-5]|0?[1-9]|[12][0-9]|3[01])$", "Every %smonth, on the %s day of the month."),
    QUARTERDAY("QtrDay", "(ENGLISH|SCOTTISH|RECEIVED)$", "Paid on the %s, %s, %s and %s."),
    INTERVALDAY("IntrvlDay", "(0?[2-9]|[1-2][0-9]|3[0-1])$", "Every %s Calendar day.");

    private final String frequencyStr;
    private final Pattern pattern;
    private final String sentence;

    FRFrequencyType(String frequencyStr, String pattern, String sentence) {
        this.frequencyStr = frequencyStr;
        if (pattern == null) {
            this.pattern = Pattern.compile(frequencyStr);
        } else {
            this.pattern = Pattern.compile(frequencyStr + ":" + pattern);
        }
        this.sentence = sentence;
    }

    public String getFrequencyStr() {
        return frequencyStr;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public String getSentence() {
        return sentence;
    }

    public static FRFrequencyType fromFrequencyString(String freqStr) {
        for (FRFrequencyType frequencyType : FRFrequencyType.values()) {
            if (frequencyType.getFrequencyStr().equals(freqStr)) {
                return frequencyType;
            }
        }
        throw new IllegalArgumentException("Frequency type value not found: " + freqStr);
    }
}