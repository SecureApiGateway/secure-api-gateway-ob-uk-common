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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRInstructionPriority;
import uk.org.openbanking.datamodel.payment.OBPriority2Code;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiation.InstructionPriorityEnum;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduled3DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduledConsentResponse6DataInitiation;

public class FRInstructionPriorityConverter {

    // OB to FR
    public static FRInstructionPriority toFRInstructionPriority(OBPriority2Code instructionPriority) {
        return instructionPriority == null ? null : FRInstructionPriority.valueOf(instructionPriority.name());
    }

    public static FRInstructionPriority toFRInstructionPriority(InstructionPriorityEnum instructionPriority) {
        return instructionPriority == null ? null : FRInstructionPriority.fromValue(instructionPriority.getValue());
    }

    public static FRInstructionPriority toFRInstructionPriority(OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum instructionPriority) {
        return instructionPriority == null ? null : FRInstructionPriority.fromValue(instructionPriority.getValue());
    }

    public static FRInstructionPriority toFRInstructionPriority(OBWriteInternationalScheduledConsentResponse6DataInitiation.InstructionPriorityEnum instructionPriority) {
        return instructionPriority == null ? null : FRInstructionPriority.fromValue(instructionPriority.getValue());
    }

    // FR to OB
    public static OBPriority2Code toOBPriority2Code(FRInstructionPriority instructionPriority) {
        return instructionPriority == null ? null : OBPriority2Code.valueOf(instructionPriority.name());
    }

    public static InstructionPriorityEnum toInstructionPriorityEnum(FRInstructionPriority instructionPriority) {
        return instructionPriority == null ? null : InstructionPriorityEnum.fromValue(instructionPriority.getValue());
    }

    public static OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum toOBWriteInternationalScheduled3DataInitiationInstructionPriorityEnum(FRInstructionPriority instructionPriority) {
        return instructionPriority == null ? null : OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum.fromValue(instructionPriority.getValue());
    }

    public static OBWriteInternationalScheduledConsentResponse6DataInitiation.InstructionPriorityEnum toOBWriteInternationalScheduledConsentResponse6DataInitiationInstructionPriorityEnum(FRInstructionPriority instructionPriority) {
        return instructionPriority == null ? null : OBWriteInternationalScheduledConsentResponse6DataInitiation.InstructionPriorityEnum .fromValue(instructionPriority.getValue());
    }

}
