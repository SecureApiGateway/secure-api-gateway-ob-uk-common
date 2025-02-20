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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileConsent;

import uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsent3;
import uk.org.openbanking.testsupport.v3.payment.OBWriteFileConsentTestDataFactory;

class FRWriteFileConsentConverterTest {

    @Test
    void testConvertConsent() {
        // Test converting from OB model to FR and back, verify we got back to the original object
        final OBWriteFileConsent3 originalObConsent = OBWriteFileConsentTestDataFactory.aValidOBWriteFileConsent3(
                "test-file-type", "hash", "7", new BigDecimal("123.33"));
        final FRWriteFileConsent frConsent = FRWriteFileConsentConverter.toFRWriteFileConsent(originalObConsent);
        assertEquals(originalObConsent, FRWriteFileConsentConverter.toOBWriteFileConsent3(frConsent));
    }
}