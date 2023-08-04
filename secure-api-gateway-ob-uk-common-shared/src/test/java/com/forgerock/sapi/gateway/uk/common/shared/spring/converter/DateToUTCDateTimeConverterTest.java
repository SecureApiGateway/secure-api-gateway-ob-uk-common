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
package com.forgerock.sapi.gateway.uk.common.shared.spring.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;

class DateToUTCDateTimeConverterTest {

    @Test
    void testConversion() {
        final long[] testUnixEpochMillisParams = new long[] {
                -100, 0, 23232323, System.currentTimeMillis(), System.currentTimeMillis() + 23452345
        };
        final DateToUTCDateTimeConverter converter = new DateToUTCDateTimeConverter();

        for (final long testUnixEpochMillis : testUnixEpochMillisParams) {
            final DateTime dateTime = converter.convert(new Date(testUnixEpochMillis));
            assertThat(dateTime.getZone()).isEqualTo(DateTimeZone.UTC);
            assertThat(dateTime.getMillis()).isEqualTo(testUnixEpochMillis);
        }
    }

}