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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteDomesticScheduledConsentConverter.toFRWriteDomesticScheduledDataInitiation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteDomesticScheduledConsentConverter.toOBWriteDomesticScheduled2DataInitiation;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDataDomesticScheduled;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticScheduled;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduled2;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduled2Data;

public class FRWriteDomesticScheduledConverter {

    // OB to FR
    public static FRWriteDomesticScheduled toFRWriteDomesticScheduled(OBWriteDomesticScheduled2 obWriteDomesticScheduled2) {
        return obWriteDomesticScheduled2 == null ? null : FRWriteDomesticScheduled.builder()
                .data(toFRWriteDataDomesticScheduled(obWriteDomesticScheduled2.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteDomesticScheduled2.getRisk()))
                .build();
    }

    public static FRWriteDataDomesticScheduled toFRWriteDataDomesticScheduled(OBWriteDomesticScheduled2Data data) {
        return data == null ? null : FRWriteDataDomesticScheduled.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteDomesticScheduledDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteDomesticScheduled2 toOBWriteDomesticScheduled2(FRWriteDomesticScheduled domesticScheduledPayment) {
        return domesticScheduledPayment == null ? null : new OBWriteDomesticScheduled2()
                .data(toOBWriteDomesticScheduled2Data(domesticScheduledPayment.getData()))
                .risk(FRRiskConverter.toOBRisk1(domesticScheduledPayment.getRisk()));
    }

    public static OBWriteDomesticScheduled2Data toOBWriteDomesticScheduled2Data(FRWriteDataDomesticScheduled data) {
        return data == null ? null : new OBWriteDomesticScheduled2Data()
                .consentId(data.getConsentId())
                .initiation(toOBWriteDomesticScheduled2DataInitiation(data.getInitiation()));
    }
}
