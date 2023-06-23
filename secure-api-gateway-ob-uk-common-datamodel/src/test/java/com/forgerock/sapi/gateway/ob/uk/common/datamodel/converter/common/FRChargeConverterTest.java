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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAmount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRCharge;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRChargeBearerType;

import uk.org.openbanking.datamodel.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsentResponse5DataCharges;

class FRChargeConverterTest {

    @Test
    void testConvertOBWriteDomesticConsentResponse5DataChargesToFrCharge() {
        final OBWriteDomesticConsentResponse5DataCharges obCharge = new OBWriteDomesticConsentResponse5DataCharges()
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .amount(new OBActiveOrHistoricCurrencyAndAmount()
                        .currency("GBP").amount("999.12"))
                .type("transaction fee");

        final FRCharge frCharge = FRChargeConverter.toFRCharge(obCharge);
        assertEquals("transaction fee", frCharge.getType());
        assertEquals(FRChargeBearerType.SHARED, frCharge.getChargeBearer());
        assertEquals(new FRAmount("999.12", "GBP"), frCharge.getAmount());
    }

    @Test
    void testConvertNullToFrCharge() {
        assertNull(FRChargeConverter.toFRCharge(null));
    }

    @Test
    void testConvertFrChargeToOBWriteDomesticConsentResponse5DataCharges() {
        final FRCharge frCharge = FRCharge.builder()
                .chargeBearer(FRChargeBearerType.BORNEBYDEBTOR)
                .type("fee")
                .amount(FRAmount.builder()
                        .amount("0.01")
                        .currency("EUR").
                        build())
                .build();

        final OBWriteDomesticConsentResponse5DataCharges obCharge = FRChargeConverter.toOBWriteDomesticConsentResponse5DataCharges(frCharge);
        assertEquals("fee", obCharge.getType());
        assertEquals(OBChargeBearerType1Code.BORNEBYDEBTOR, obCharge.getChargeBearer());
        assertEquals(new OBActiveOrHistoricCurrencyAndAmount().amount("0.01").currency("EUR"), obCharge.getAmount());
    }

    @Test
    void testConvertNullToOBWriteDomesticConsentResponse5DataCharges() {
        assertNull(FRChargeConverter.toOBWriteDomesticConsentResponse5DataCharges(null));
    }

}