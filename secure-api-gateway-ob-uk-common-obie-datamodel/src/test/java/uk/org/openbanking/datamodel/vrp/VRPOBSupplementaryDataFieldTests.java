/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.vrp;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPControlParameters;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInstruction;

class VRPOBSupplementaryDataFieldTests {

    /**
     * Test OBDomesticVRPControlParameters.supplementaryData is the correct type.
     *
     * The code-gen by default produces a field of type Object, the generated code has been edited to use the
     * common OBSupplementaryData1 type.
     *
     * If this test fails then update OBDomesticVRPControlParameters.supplementaryData field to be OBSupplementaryData1
     */
    @Test
    void ensureControlParametersSupplementaryDataFieldIsCorrectType() throws Exception {
        final Field supplementaryDataField = OBDomesticVRPControlParameters.class.getDeclaredField("supplementaryData");
        assertEquals(OBSupplementaryData1.class, supplementaryDataField.getType());
    }

    /**
     * Test OBDomesticVRPInstruction.supplementaryData is the correct type.
     *
     * The code-gen by default produces a field of type Object, the generated code has been edited to use the
     * common OBSupplementaryData1 type.
     *
     * If this test fails then update OBDomesticVRPInstruction.supplementaryData field to be OBSupplementaryData1
     */
    @Test
    void ensureVRPInstructionSupplementaryDataFieldIsCorrectType() throws Exception {
        final Field supplementaryDataField = OBDomesticVRPInstruction.class.getDeclaredField("supplementaryData");
        assertEquals(OBSupplementaryData1.class, supplementaryDataField.getType());
    }



}