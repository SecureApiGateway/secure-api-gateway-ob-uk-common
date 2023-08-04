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

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.core.convert.converter.Converter;

/**
 * Converter which converts a java.util.Date to org.joda.time.DateTime, specifying the timezone as UTC.
 *
 * Can be used instead of the default Joda converter which use the system default timezone:
 * org.springframework.format.datetime.joda.JodaTimeConverters.DateToReadableInstantConverter
 */
public class DateToUTCDateTimeConverter implements Converter<Date, DateTime> {

    @Override
    public DateTime convert(Date source) {
        return new DateTime(source.getTime(), DateTimeZone.UTC);
    }

}
