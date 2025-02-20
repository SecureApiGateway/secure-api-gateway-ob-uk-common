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
package com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Unit Test for {@link FRFrequency}
 */
public class FRFrequencyTest {

    private static Stream<Arguments> frequencies() {
        return Stream.of(
                Arguments.of(FRFrequencyType.EVERYDAY.getFrequencyStr(), FRFrequencyType.EVERYDAY.getSentence()),
                Arguments.of(FRFrequencyType.EVERYWORKINGDAY.getFrequencyStr(), FRFrequencyType.EVERYWORKINGDAY.getSentence()),
                Arguments.of(
                        FRFrequencyType.INTERVALWEEKDAY.getFrequencyStr() + ":02:04",
                        String.format(FRFrequencyType.INTERVALWEEKDAY.getSentence(), "2nd", "4th")
                ),
                Arguments.of(
                        FRFrequencyType.WEEKINMONTHDAY.getFrequencyStr() + ":01:05",
                        String.format(FRFrequencyType.WEEKINMONTHDAY.getSentence(), "1st", "5th")
                ),
                Arguments.of(
                        FRFrequencyType.INTERVALMONTHDAY.getFrequencyStr() + ":12:08",
                        String.format(FRFrequencyType.INTERVALMONTHDAY.getSentence(), "12th", "8th")
                ),
                Arguments.of(
                        FRFrequencyType.QUARTERDAY.getFrequencyStr() + ":ENGLISH",
                        "Paid on the 25th March, 24th June, 29th September and 25th December."
                ),
                Arguments.of(
                        FRFrequencyType.QUARTERDAY.getFrequencyStr() + ":SCOTTISH",
                        "Paid on the 2nd February, 15th May, 1st August and 11th November."
                ),
                Arguments.of(
                        FRFrequencyType.QUARTERDAY.getFrequencyStr() + ":RECEIVED",
                        "Paid on the 20th March, 19th June, 24th September and 20th December."
                ),
                Arguments.of(
                        FRFrequencyType.INTERVALDAY.getFrequencyStr() + ":05",
                        String.format(FRFrequencyType.INTERVALDAY.getSentence(), "5th")
                ),
                Arguments.of(FRFrequencyType.WEEK.getFrequencyStr(), FRFrequencyType.WEEK.getSentence())
        );
    }

    @ParameterizedTest(name = "Frequency: {0}")
    @MethodSource("frequencies")
    void tested(String frequency, String expectedSentence) {
        FRFrequency frFrequency = new FRFrequency(frequency);
        assertThat(frFrequency.getFormattedSentence()).isEqualTo(expectedSentence);
    }
}
