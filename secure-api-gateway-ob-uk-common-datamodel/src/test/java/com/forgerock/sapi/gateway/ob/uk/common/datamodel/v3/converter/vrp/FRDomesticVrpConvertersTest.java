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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.converter.vrp;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.converter.vrp.FRDomesticVrpConverters;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.vrp.FRDomesticVrpRequest;
import org.junit.jupiter.api.Test;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPRequest;
import uk.org.openbanking.testsupport.vrp.OBDomesticVrpRequestTestDataFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FRDomesticVrpConvertersTest {

    @Test
    void shouldConvertToFRDomesticVrpRequest() {
        final OBDomesticVRPRequest obDomesticVRPRequest = OBDomesticVrpRequestTestDataFactory.aValidOBDomesticVRPRequest();
        final FRDomesticVrpRequest frDomesticVrpRequest = FRDomesticVrpConverters.toFRDomesticVRPRequest(obDomesticVRPRequest);
        assertEquals(obDomesticVRPRequest, FRDomesticVrpConverters.toOBDomesticVRPRequest(frDomesticVrpRequest));
    }

}