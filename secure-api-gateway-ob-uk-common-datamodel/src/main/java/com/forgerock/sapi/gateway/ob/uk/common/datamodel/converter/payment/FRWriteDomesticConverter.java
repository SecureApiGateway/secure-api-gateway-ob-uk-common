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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.payment;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.payment.FRWriteDomesticConsentConverter.toFRWriteDomesticDataInitiation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.payment.FRWriteDomesticConsentConverter.toOBWriteDomestic2DataInitiation;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDataDomestic;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomestic;

import uk.org.openbanking.datamodel.payment.OBWriteDomestic2;
import uk.org.openbanking.datamodel.payment.OBWriteDomestic2Data;

public class FRWriteDomesticConverter {

    // OB to FR
    public static FRWriteDomestic toFRWriteDomestic(OBWriteDomestic2 obWriteDomestic2) {
        return obWriteDomestic2 == null ? null : FRWriteDomestic.builder()
                .data(toFRWriteDataDomestic(obWriteDomestic2.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteDomestic2.getRisk()))
                .build();
    }

    public static FRWriteDataDomestic toFRWriteDataDomestic(OBWriteDomestic2Data data) {
        return data == null ? null : FRWriteDataDomestic.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteDomesticDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteDomestic2 toOBWriteDomestic2(FRWriteDomestic domesticPayment) {
        return domesticPayment == null ? null : new OBWriteDomestic2()
                .data(toOBWriteDomestic2Data(domesticPayment.getData()))
                .risk(FRRiskConverter.toOBRisk1(domesticPayment.getRisk()));
    }

    public static OBWriteDomestic2Data toOBWriteDomestic2Data(FRWriteDataDomestic data) {
        return data == null ? null : new OBWriteDomestic2Data()
                .consentId(data.getConsentId())
                .initiation(toOBWriteDomestic2DataInitiation(data.getInitiation()));
    }
}
