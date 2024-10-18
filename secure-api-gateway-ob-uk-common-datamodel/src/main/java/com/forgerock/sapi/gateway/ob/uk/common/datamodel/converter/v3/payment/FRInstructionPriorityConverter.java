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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRInstructionPriority;

import uk.org.openbanking.datamodel.v3.payment.OBWriteInternational3DataInitiationInstructionPriority;

public class FRInstructionPriorityConverter {

    // OB to FR
    public static FRInstructionPriority toFRInstructionPriority(OBWriteInternational3DataInitiationInstructionPriority instructionPriority) {
        return instructionPriority == null ? null : FRInstructionPriority.valueOf(instructionPriority.name());
    }


    // FR to OB
    public static OBWriteInternational3DataInitiationInstructionPriority toOBPriority2Code(FRInstructionPriority instructionPriority) {
        return instructionPriority == null ? null : OBWriteInternational3DataInitiationInstructionPriority.valueOf(instructionPriority.name());
    }

}
