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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteDomesticStandingOrderConsentConverter.toFRWriteDomesticStandingOrderDataInitiation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteDomesticStandingOrderConsentConverter.toOBWriteDomesticStandingOrder3DataInitiation;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDataDomesticStandingOrder;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticStandingOrder;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3Data;

public class FRWriteDomesticStandingOrderConverter {

    // OB to FR
    public static FRWriteDomesticStandingOrder toFRWriteDomesticStandingOrder(OBWriteDomesticStandingOrder3 obWriteDomesticStandingOrder3) {
        return obWriteDomesticStandingOrder3 == null ? null : FRWriteDomesticStandingOrder.builder()
                .data(toFRWriteDataDomesticStandingOrder(obWriteDomesticStandingOrder3.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteDomesticStandingOrder3.getRisk()))
                .build();
    }

    public static FRWriteDataDomesticStandingOrder toFRWriteDataDomesticStandingOrder(OBWriteDomesticStandingOrder3Data data) {
        return data == null ? null : FRWriteDataDomesticStandingOrder.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteDomesticStandingOrderDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteDomesticStandingOrder3 toOBWriteDomesticDomesticStandingOrder3(FRWriteDomesticStandingOrder domesticStandingOrderPayment) {
        return domesticStandingOrderPayment == null ? null : new OBWriteDomesticStandingOrder3()
                .data(toOBWriteDataDomesticDomesticStandingOrder3(domesticStandingOrderPayment.getData()))
                .risk(FRRiskConverter.toOBRisk1(domesticStandingOrderPayment.getRisk()));
    }

    public static OBWriteDomesticStandingOrder3Data toOBWriteDataDomesticDomesticStandingOrder3(FRWriteDataDomesticStandingOrder data) {
        return data == null ? null : new OBWriteDomesticStandingOrder3Data()
                .consentId(data.getConsentId())
                .initiation(toOBWriteDomesticStandingOrder3DataInitiation(data.getInitiation()));
    }
}
