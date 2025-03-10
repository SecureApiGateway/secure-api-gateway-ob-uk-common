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

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPaymentRisk;

import uk.org.openbanking.datamodel.v4.common.OBRisk1;
import uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory;

public class FRRiskConverterTest {

    @Test
    void shouldConvertOBRisk1() {
        final OBRisk1[] testData = new OBRisk1[]{
                OBRisk1TestDataFactory.aValidOBRisk1(),
        };

        for (OBRisk1 obRisk : testData) {
            // Encode, Decode, then validate we got back to the original
            final FRPaymentRisk frRisk = FRRiskConverter.toFRPaymentRisk(obRisk);
            assertEquals(obRisk, FRRiskConverter.toOBRisk1(frRisk));
        }
    }
}
