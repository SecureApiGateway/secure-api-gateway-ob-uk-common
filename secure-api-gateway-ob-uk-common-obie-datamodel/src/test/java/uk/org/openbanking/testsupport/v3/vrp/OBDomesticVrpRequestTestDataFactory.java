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
package uk.org.openbanking.testsupport.v3.vrp;

import static uk.org.openbanking.testsupport.v3.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.v3.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.v3.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBCashAccountCreditor3;
import static uk.org.openbanking.testsupport.v3.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBDomesticVRPInitiation;
import static uk.org.openbanking.testsupport.v3.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBPostalAddress6;
import static uk.org.openbanking.testsupport.v3.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBSupplementaryData1;
import static uk.org.openbanking.testsupport.v3.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBVRPRemittanceInformation;

import java.util.UUID;

import uk.org.openbanking.datamodel.v3.common.OBVRPAuthenticationMethods;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInstruction;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPRequest;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPRequestData;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPInteractionTypes;

public class OBDomesticVrpRequestTestDataFactory {

    public static OBDomesticVRPRequest aValidOBDomesticVRPRequest() {
        return (new OBDomesticVRPRequest())
                .data(aValidOBDomesticVRPRequestData())
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPRequest aValidOBDomesticVRPRequest(String consentId) {
        return (new OBDomesticVRPRequest())
                .data(aValidOBDomesticVRPRequestData(consentId))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPRequestData aValidOBDomesticVRPRequestData() {
        return (new OBDomesticVRPRequestData())
                .consentId(ConstantsVrpTestData.CONSENT_PREFIX + UUID.randomUUID())
                .psUAuthenticationMethod(OBVRPAuthenticationMethods.SCA_NOT_REQUIRED.getValue())
                .psUInteractionType(OBVRPInteractionTypes.INSESSION)
                .initiation(aValidOBDomesticVRPInitiation())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    public static OBDomesticVRPRequestData aValidOBDomesticVRPRequestData(String consentId) {
        return (new OBDomesticVRPRequestData())
                .consentId(consentId)
                .psUAuthenticationMethod(OBVRPAuthenticationMethods.SCA_NOT_REQUIRED.getValue())
                .psUInteractionType(OBVRPInteractionTypes.INSESSION)
                .initiation(aValidOBDomesticVRPInitiation())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    public static OBDomesticVRPInstruction aValidOBDomesticVRPInstruction() {
        return (new OBDomesticVRPInstruction())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .instructionIdentification(ConstantsVrpTestData.INSTRUCTION_IDENTIFICATION)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .endToEndIdentification(ConstantsVrpTestData.END_TO_END_IDENTIFICATION)
                .localInstrument(ConstantsVrpTestData.LOCAL_INSTRUMENT)
                .remittanceInformation(aValidOBVRPRemittanceInformation())
                .supplementaryData(aValidOBSupplementaryData1());
    }
}
