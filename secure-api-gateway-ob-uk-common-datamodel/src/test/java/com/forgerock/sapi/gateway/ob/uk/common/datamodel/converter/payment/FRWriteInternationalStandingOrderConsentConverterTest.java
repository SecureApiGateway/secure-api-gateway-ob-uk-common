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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalStandingOrderConsent;

import uk.org.openbanking.datamodel.payment.OBWriteInternationalStandingOrderConsent6;
import uk.org.openbanking.testsupport.payment.OBWriteInternationalStandingOrderConsentTestDataFactory;

class FRWriteInternationalStandingOrderConsentConverterTest {

    @Test
    void testConvert() {
        // Test converting from OB model to FR and back, verify we got back to the original object
        final OBWriteInternationalStandingOrderConsent6 originalObConsent = OBWriteInternationalStandingOrderConsentTestDataFactory.aValidOBWriteInternationalStandingOrderConsent6();
        final FRWriteInternationalStandingOrderConsent frConsent = FRWriteInternationalStandingOrderConsentConverter.toFRWriteInternationalStandingOrderConsent(originalObConsent);
        assertEquals(originalObConsent, FRWriteInternationalStandingOrderConsentConverter.toOBWriteInternationalStandingOrderConsent6(frConsent));
    }
}