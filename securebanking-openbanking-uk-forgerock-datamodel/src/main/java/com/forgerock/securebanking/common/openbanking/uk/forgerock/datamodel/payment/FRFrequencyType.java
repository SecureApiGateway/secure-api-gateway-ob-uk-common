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

import java.util.regex.Pattern;

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