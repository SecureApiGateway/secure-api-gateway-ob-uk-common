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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter.toFRAmount;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStructuredRegulatoryReporting;

import uk.org.openbanking.datamodel.v4.payment.OBStructuredRegulatoryReporting3;

public class FRStructuredRegulatoryReportingConverter {

    // OB to FR
    public static FRStructuredRegulatoryReporting toFRStructuredRegulatoryReporting(OBStructuredRegulatoryReporting3 structuredRegulatoryReporting) {
        return structuredRegulatoryReporting == null ? null : FRStructuredRegulatoryReporting.builder()
                .type(structuredRegulatoryReporting.getType())
                .date(structuredRegulatoryReporting.getDate())
                .country(structuredRegulatoryReporting.getCountry())
                .amount(toFRAmount(structuredRegulatoryReporting.getAmount()))
                .information(structuredRegulatoryReporting.getInformation())
                .build();
    }

    // FR to OB
    public static OBStructuredRegulatoryReporting3 toOBStructuredRegulatoryReporting3(FRStructuredRegulatoryReporting structuredRegulatoryReporting) {
        return structuredRegulatoryReporting == null ? null : new OBStructuredRegulatoryReporting3()
                .type(structuredRegulatoryReporting.getType())
                .date(structuredRegulatoryReporting.getDate())
                .country(structuredRegulatoryReporting.getCountry())
                .amount(toOBActiveOrHistoricCurrencyAndAmount(structuredRegulatoryReporting.getAmount()))
                .information(structuredRegulatoryReporting.getInformation());
    }
}
