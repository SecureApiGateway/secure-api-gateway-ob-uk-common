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
package uk.org.openbanking.datamodel.account;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import uk.org.openbanking.datamodel.v3.account.OBReadConsent1;
import uk.org.openbanking.datamodel.v3.account.OBReadConsentResponse1;
import uk.org.openbanking.datamodel.v3.account.OBRisk2;

public class AccountOBRisk2FieldTests {

    /**
     * Test OBReadConsent1.risk is the correct type.
     *
     * The code-gen by default produces a field of type Object, the generated code has been edited to use the
     * common OBRisk2 type.
     *
     * If this test fails then update OBReadConsent1.risk field to be OBRisk2
     */
    @Test
    void ensureOBReadConsent1RiskFieldIsCorrectType() throws Exception {
        final Field riskField = OBReadConsent1.class.getDeclaredField("risk");
        assertEquals(OBRisk2.class, riskField.getType());
    }

    /**
     * Test OBReadConsentResponse1.risk is the correct type.
     *
     * The code-gen by default produces a field of type Object, the generated code has been edited to use the
     * common OBRisk2 type.
     *
     * If this test fails then update OBReadConsentResponse1.risk field to be OBRisk2
     */
    @Test
    void ensureOBReadConsentResponse1RiskFieldIsCorrectType() throws Exception {
        final Field riskField = OBReadConsentResponse1.class.getDeclaredField("risk");
        assertEquals(OBRisk2.class, riskField.getType());
    }

}
