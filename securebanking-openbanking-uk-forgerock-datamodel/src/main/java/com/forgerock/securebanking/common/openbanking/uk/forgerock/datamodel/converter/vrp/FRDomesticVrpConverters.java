/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.vrp;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRiskConverter;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.vrp.FRDomesticVrpInstruction;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.vrp.FRDomesticVrpRequest;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.vrp.FRDomesticVrpRequestData;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.vrp.FRWriteDomesticVrpDataInitiation;
import lombok.extern.slf4j.Slf4j;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPInitiation;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPInstruction;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPRequest;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPRequestData;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAccountIdentifierConverter.toFRAccountIdentifier;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAccountIdentifierConverter.toOBCashAccountCreditor3;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAccountIdentifierConverter.toOBCashAccountDebtorWithName;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAmountConverter.toFRAmount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRFinancialInstrumentConverter.toFRFinancialAgent;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification6;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRemittanceInformationConverter.toFRRemittanceInformation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRemittanceInformationConverter.toOBDomesticVRPInitiationRemittanceInformation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRemittanceInformationConverter.toOBVRPRemittanceInformation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRiskConverter.toOBRisk1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRSupplementaryDataConverter.toOBSupplementaryData1;

@Slf4j
public class FRDomesticVrpConverters {

    // OB to FR
    public static FRDomesticVrpRequest toFRDomesticVRPRequest(
            OBDomesticVRPRequest obDomesticVRPRequest
    ) {
        FRDomesticVrpRequest frDomesticVRPRequest = obDomesticVRPRequest == null ? null : FRDomesticVrpRequest.builder()
                .data(toFRDomesticVRPRequestData(obDomesticVRPRequest.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obDomesticVRPRequest.getRisk()))
                .build();
        log.trace("toFRDomesticVRPRequest() converted OBDomesticVRPRequest to FRDomesticVrpRequest; '{}'",
                frDomesticVRPRequest);
        return frDomesticVRPRequest;
    }

    public static FRDomesticVrpRequestData toFRDomesticVRPRequestData(OBDomesticVRPRequestData obDomesticVRPRequestData){
        return obDomesticVRPRequestData == null ? null : FRDomesticVrpRequestData.builder()
                .consentId(obDomesticVRPRequestData.getConsentId())
                .initiation(toFRDomesticVRPInitiation(obDomesticVRPRequestData.getInitiation()))
                .psuAuthenticationMethod(obDomesticVRPRequestData.getPsUAuthenticationMethod())
                .instruction(toFRDomesticVRPInstruction(obDomesticVRPRequestData.getInstruction()))
                .build();
    }

    public static FRDomesticVrpInstruction toFRDomesticVRPInstruction(OBDomesticVRPInstruction instruction) {
        FRDomesticVrpInstruction frInstruction = FRDomesticVrpInstruction.builder()
                .creditorAccount(toFRAccountIdentifier(instruction.getCreditorAccount()))
                .instructionIdentification(instruction.getInstructionIdentification())
                .endToEndIdentification(instruction.getEndToEndIdentification())
                .creditorAgent(toFRFinancialAgent(instruction.getCreditorAgent()))
                .instructedAmount(toFRAmount(instruction.getInstructedAmount()))
                .localInstrument(instruction.getLocalInstrument())
                .remittanceInformation(toFRRemittanceInformation(instruction.getRemittanceInformation()))
                .supplementaryData(toFRSupplementaryData(instruction.getSupplementaryData()))
                .build();
        return frInstruction;
    }



    public static FRWriteDomesticVrpDataInitiation toFRDomesticVRPInitiation(OBDomesticVRPInitiation initiation) {
        FRWriteDomesticVrpDataInitiation frInitiation = FRWriteDomesticVrpDataInitiation.builder()
                .creditorAccount(toFRAccountIdentifier(initiation.getCreditorAccount()))
                .debtorAccount(toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditorAgent(toFRFinancialAgent(initiation.getCreditorAgent()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .build();
        return frInitiation;
    }

    public static OBDomesticVRPRequest toOBDomesticVRPRequest(FRDomesticVrpRequest frDomesticVRPRequest){
        return frDomesticVRPRequest == null ? null : new OBDomesticVRPRequest()
                .data(toOBDomesticVRPRequestData(frDomesticVRPRequest.getData()))
                .risk(toOBRisk1(frDomesticVRPRequest.getRisk()));
    }

    public static OBDomesticVRPRequestData toOBDomesticVRPRequestData(FRDomesticVrpRequestData data){
        return data == null ? null : new OBDomesticVRPRequestData()
                .consentId(data.getConsentId())
                .initiation(toOBDomesticVRPInitiation(data.getInitiation()))
                .instruction(toOBDomesticVRPInstruction(data.getInstruction()));
    }

    public static OBDomesticVRPInitiation toOBDomesticVRPInitiation(FRWriteDomesticVrpDataInitiation initiation){
        return initiation == null ? null : new OBDomesticVRPInitiation()
                .creditorAccount(toOBCashAccountCreditor3(initiation.getCreditorAccount()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification6(initiation.getCreditorAgent()))
                .debtorAccount(toOBCashAccountDebtorWithName(initiation.getDebtorAccount()))
                .remittanceInformation(
                        toOBDomesticVRPInitiationRemittanceInformation(initiation.getRemittanceInformation())
                );
    }

    public static OBDomesticVRPInstruction toOBDomesticVRPInstruction(FRDomesticVrpInstruction instruction){
        return instruction == null ? null : new OBDomesticVRPInstruction()
                .endToEndIdentification(instruction.getEndToEndIdentification())
                .instructionIdentification(instruction.getInstructionIdentification())
                .localInstrument(instruction.getLocalInstrument())
                .creditorAccount(toOBCashAccountCreditor3(instruction.getCreditorAccount()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification6(instruction.getCreditorAgent()))
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(instruction.getInstructedAmount()))
                .remittanceInformation(toOBVRPRemittanceInformation(instruction.getRemittanceInformation()))
                .supplementaryData(toOBSupplementaryData1(instruction.getSupplementaryData()));
    }

}
