/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteInternationalConsentConverter.toFRWriteInternationalDataInitiation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteInternationalConsentConverter.toOBWriteInternational3DataInitiation;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternational;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalData;

import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3Data;

public class FRWriteInternationalConverter {

    // OB to FR
    public static FRWriteInternational toFRWriteInternational(OBWriteInternational3 internationalPayment) {
        return internationalPayment == null ? null : FRWriteInternational.builder()
                .data(toFRWriteInternationalData(internationalPayment.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(internationalPayment.getRisk()))
                .build();
    }

    public static FRWriteInternationalData toFRWriteInternationalData(OBWriteInternational3Data data) {
        return data == null ? null : FRWriteInternationalData.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteInternationalDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteInternational3 toOBWriteInternational3(FRWriteInternational internationalPayment) {
        return internationalPayment == null ? null : new OBWriteInternational3()
                .data(toOBWriteInternational3Data(internationalPayment.getData()))
                .risk(FRRiskConverter.toOBRisk1(internationalPayment.getRisk()));
    }

    public static OBWriteInternational3Data toOBWriteInternational3Data(FRWriteInternationalData data) {
        return data == null ? null : new OBWriteInternational3Data()
                .consentId(data.getConsentId())
                .initiation(toOBWriteInternational3DataInitiation(data.getInitiation()));
    }
}
