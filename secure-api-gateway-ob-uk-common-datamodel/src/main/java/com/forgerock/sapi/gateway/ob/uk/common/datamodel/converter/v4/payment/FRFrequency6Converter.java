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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRFrequency;
import com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRFrequencyCode6;
import com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRFrequencyType;

import uk.org.openbanking.datamodel.v4.payment.OBFrequency6;
import uk.org.openbanking.datamodel.v4.payment.OBFrequency6Code;

public class FRFrequency6Converter {
    public static FRFrequency toFRFrequency(OBFrequency6 frequency) {
        return frequency == null ? null : FRFrequency.builder()
                .frequencyType(FRFrequencyType.fromFrequencyString(frequency.getType().getValue()))
                .type(FRFrequencyCode6.fromValue(frequency.getType().getValue()))
                .countPerPeriod(frequency.getCountPerPeriod())
                .pointInTime(frequency.getPointInTime())
                .build();
    }

    public static OBFrequency6 toOBFrequency6(FRFrequency frequency) {
        return frequency == null ? null : new OBFrequency6()
                .type(OBFrequency6Code.fromValue(frequency.getType().getValue()))
                .countPerPeriod(frequency.getCountPerPeriod())
                .pointInTime(frequency.getPointInTime());
    }
}
