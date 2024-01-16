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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.vrp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp.FRDomesticVRPConsent;

import uk.org.openbanking.datamodel.vrp.OBDomesticVRPConsentRequest;
import uk.org.openbanking.testsupport.vrp.OBDomesticVrpConsentRequestTestDataFactory;

class FRDomesticVRPConsentConvertersTest {

    @Test
    void convertToFRRepresentation() {
        // Convert from OB to FR type and back, verify we get back to the original object
        final OBDomesticVRPConsentRequest obConsent = OBDomesticVrpConsentRequestTestDataFactory.aValidOBDomesticVRPConsentRequest();
        final FRDomesticVRPConsent frDomesticVRPConsent = FRDomesticVRPConsentConverters.toFRDomesticVRPConsent(obConsent);
        assertEquals(obConsent, FRDomesticVRPConsentConverters.toOBDomesticVRPConsentRequest(frDomesticVRPConsent));
    }

}