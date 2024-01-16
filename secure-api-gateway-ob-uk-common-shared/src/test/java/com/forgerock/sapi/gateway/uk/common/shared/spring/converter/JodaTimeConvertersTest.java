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
package com.forgerock.sapi.gateway.uk.common.shared.spring.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.uk.common.shared.spring.converter.JodaTimeConverters.DateTimeToDateConverter;
import com.forgerock.sapi.gateway.uk.common.shared.spring.converter.JodaTimeConverters.DateToDateTimeConverter;
import com.forgerock.sapi.gateway.uk.common.shared.spring.converter.JodaTimeConverters.DateToLocalDateConverter;
import com.forgerock.sapi.gateway.uk.common.shared.spring.converter.JodaTimeConverters.LocalDateToDateConverter;

public class JodaTimeConvertersTest {

    @Test
    void testConvertLocalDate() {
        final LocalDate now = LocalDate.now();
        assertEquals(now, DateToLocalDateConverter.INSTANCE.convert(LocalDateToDateConverter.INSTANCE.convert(now)));
    }

    @Test
    void testConvertDateTime() {
        final DateTime now = DateTime.now().withZone(DateTimeZone.UTC);
        final DateTime result = DateToDateTimeConverter.INSTANCE.convert(DateTimeToDateConverter.INSTANCE.convert(now));
        assertEquals(now, result);
    }

}
