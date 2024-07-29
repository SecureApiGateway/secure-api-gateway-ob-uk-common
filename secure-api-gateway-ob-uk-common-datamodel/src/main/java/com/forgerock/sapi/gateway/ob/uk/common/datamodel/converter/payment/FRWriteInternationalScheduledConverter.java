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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalScheduled;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalScheduledData;

import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduled3;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduled3Data;

public class FRWriteInternationalScheduledConverter {

    // OB to FR
    public static FRWriteInternationalScheduled toFRWriteInternationalScheduled(OBWriteInternationalScheduled3 internationalScheduledPayment) {
        return internationalScheduledPayment == null ? null : FRWriteInternationalScheduled.builder()
                .data(toFRWriteInternationalScheduledData(internationalScheduledPayment.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(internationalScheduledPayment.getRisk()))
                .build();
    }

    public static FRWriteInternationalScheduledData toFRWriteInternationalScheduledData(OBWriteInternationalScheduled3Data data) {
        return data == null ? null : FRWriteInternationalScheduledData.builder()
                .consentId(data.getConsentId())
                .initiation(FRWriteInternationalScheduledConsentConverter.toFRWriteInternationalScheduledDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteInternationalScheduled3 toOBWriteInternationalScheduled3(FRWriteInternationalScheduled internationalScheduledPayment) {
        return internationalScheduledPayment == null ? null : new OBWriteInternationalScheduled3()
                .data(toOBWriteDataInternationalScheduled3(internationalScheduledPayment.getData()))
                .risk(FRRiskConverter.toOBRisk1(internationalScheduledPayment.getRisk()));
    }

    public static OBWriteInternationalScheduled3Data toOBWriteDataInternationalScheduled3(FRWriteInternationalScheduledData data) {
        return data == null ? null : new OBWriteInternationalScheduled3Data()
                .consentId(data.getConsentId())
                .initiation(FRWriteInternationalScheduledConsentConverter.toOBWriteInternationalScheduled3DataInitiation(data.getInitiation()));
    }
}
