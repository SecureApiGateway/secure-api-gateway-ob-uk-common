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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.converter.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.converter.payment.FRWriteInternationalScheduledConsentConverter;
import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.payment.FRWriteInternationalScheduledConsent;

import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalScheduledConsent5;
import uk.org.openbanking.testsupport.payment.OBWriteInternationalScheduledConsentTestDataFactory;

class FRWriteInternationalScheduledConsentConverterTest {

    @Test
    void testConvert() {
        // Test converting from OB model to FR and back, verify we got back to the original object
        final OBWriteInternationalScheduledConsent5 originalObConsent = OBWriteInternationalScheduledConsentTestDataFactory.aValidOBWriteInternationalScheduledConsent5();
        final FRWriteInternationalScheduledConsent frConsent = FRWriteInternationalScheduledConsentConverter.toFRWriteInternationalScheduledConsent(originalObConsent);
        assertEquals(originalObConsent, FRWriteInternationalScheduledConsentConverter.toOBWriteInternationalScheduledConsent5(frConsent));
    }

}