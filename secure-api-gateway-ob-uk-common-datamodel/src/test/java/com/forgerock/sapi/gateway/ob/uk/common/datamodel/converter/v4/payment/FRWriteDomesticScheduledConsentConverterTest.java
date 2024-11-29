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

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticScheduledConsent;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4;
import uk.org.openbanking.testsupport.v4.payment.OBWriteDomesticScheduledConsentTestDataFactory;

public class FRWriteDomesticScheduledConsentConverterTest {

    @Test
    public void testConvert() {
        
        // Test converting from OB model to FR and back, verify we got back to the original object
        final OBWriteDomesticScheduledConsent4 originalObConsent = OBWriteDomesticScheduledConsentTestDataFactory.aValidOBWriteDomesticScheduledConsent4();
        final FRWriteDomesticScheduledConsent frConsent = FRWriteDomesticScheduledConsentConverter.toFRWriteDomesticScheduledConsent(originalObConsent);
        assertEquals(originalObConsent, FRWriteDomesticScheduledConsentConverter.toOBWriteDomesticScheduledConsent4(frConsent));
    }
}
