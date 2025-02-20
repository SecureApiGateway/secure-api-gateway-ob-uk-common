/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAmount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRCharge;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRChargeBearerType;

import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v4.common.OBInternalChargeBearerType1Code;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticConsentResponse5DataChargesInner;

public class FRChargeConverterTest {

    @Test
    void testConvertOBWriteDomesticConsentResponse5DataChargesToFrCharge() {
        final OBWriteDomesticConsentResponse5DataChargesInner obCharge = new OBWriteDomesticConsentResponse5DataChargesInner()
                .chargeBearer(OBInternalChargeBearerType1Code.SHARED)
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
        assertNull(FRChargeConverter.toFRCharge((OBWriteDomesticConsentResponse5DataChargesInner) null));
        assertNull(FRChargeConverter.toFRCharge((List<OBWriteDomesticConsentResponse5DataChargesInner>) null));
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

        final OBWriteDomesticConsentResponse5DataChargesInner obCharge = FRChargeConverter.toOBWriteDomesticConsentResponse5DataCharges(frCharge);
        assertEquals("fee", obCharge.getType());
        assertEquals(OBInternalChargeBearerType1Code.BORNEBYDEBTOR, obCharge.getChargeBearer());
        assertEquals(new OBActiveOrHistoricCurrencyAndAmount().amount("0.01").currency("EUR"), obCharge.getAmount());
    }

    @Test
    void testConvertNullToOBWriteDomesticConsentResponse5DataCharges() {
        assertNull(FRChargeConverter.toOBWriteDomesticConsentResponse5DataCharges((FRCharge) null));
        assertNull(FRChargeConverter.toOBWriteDomesticConsentResponse5DataCharges((List<FRCharge>) null));
    }
}
