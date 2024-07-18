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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRRemittanceInformationConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp.FRDomesticVrpInstruction;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp.FRDomesticVrpRequest;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp.FRDomesticVrpRequestData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp.FRWriteDomesticVrpDataInitiation;
import lombok.extern.slf4j.Slf4j;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInitiation;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInstruction;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPRequest;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPRequestData;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAccountIdentifierConverter.*;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAmountConverter.toFRAmount;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter.toFRPostalAddress;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter.toOBPostalAddress6;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRRiskConverter.toOBRisk1;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRSupplementaryDataConverter.toOBSupplementaryData1;

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
                .psUInteractionType(FRVrpInteractionTypesConverter.toFRVRPInteractionTypes(obDomesticVRPRequestData.getPsUInteractionType()))
                .instruction(toFRDomesticVRPInstruction(obDomesticVRPRequestData.getInstruction()))
                .build();
    }

    public static FRDomesticVrpInstruction toFRDomesticVRPInstruction(OBDomesticVRPInstruction instruction) {
        FRDomesticVrpInstruction frInstruction = FRDomesticVrpInstruction.builder()
                .creditorAccount(toFRAccountIdentifier(instruction.getCreditorAccount()))
                .creditorPostalAddress(toFRPostalAddress(instruction.getCreditorPostalAddress()))
                .instructionIdentification(instruction.getInstructionIdentification())
                .endToEndIdentification(instruction.getEndToEndIdentification())
                .instructedAmount(toFRAmount(instruction.getInstructedAmount()))
                .localInstrument(instruction.getLocalInstrument())
                .remittanceInformation(FRRemittanceInformationConverter.toFRRemittanceInformation(instruction.getRemittanceInformation()))
                .supplementaryData(toFRSupplementaryData(instruction.getSupplementaryData()))
                .build();
        return frInstruction;
    }



    public static FRWriteDomesticVrpDataInitiation toFRDomesticVRPInitiation(OBDomesticVRPInitiation initiation) {
        FRWriteDomesticVrpDataInitiation frInitiation = FRWriteDomesticVrpDataInitiation.builder()
                .creditorAccount(toFRAccountIdentifier(initiation.getCreditorAccount()))
                .creditorPostalAddress(toFRPostalAddress(initiation.getCreditorPostalAddress()))
                .debtorAccount(toFRAccountIdentifier(initiation.getDebtorAccount()))
                .remittanceInformation(FRRemittanceInformationConverter.toFRRemittanceInformation(initiation.getRemittanceInformation()))
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
                .psUAuthenticationMethod(data.getPsuAuthenticationMethod())
                .psUInteractionType(FRVrpInteractionTypesConverter.toFRVRPInteractionTypes(data.getPsUInteractionType()))
                .initiation(toOBDomesticVRPInitiation(data.getInitiation()))
                .instruction(toOBDomesticVRPInstruction(data.getInstruction()));
    }

    public static OBDomesticVRPInitiation toOBDomesticVRPInitiation(FRWriteDomesticVrpDataInitiation initiation){
        return initiation == null ? null : new OBDomesticVRPInitiation()
                .creditorAccount(toOBCashAccountCreditor3(initiation.getCreditorAccount()))
                .creditorPostalAddress(toOBPostalAddress6(initiation.getCreditorPostalAddress()))
                .debtorAccount(toOBCashAccountDebtorWithName(initiation.getDebtorAccount()))
                .remittanceInformation(
                        FRRemittanceInformationConverter.toOBDomesticVRPInitiationRemittanceInformation(initiation.getRemittanceInformation()));

    }

    public static OBDomesticVRPInstruction toOBDomesticVRPInstruction(FRDomesticVrpInstruction instruction){
        return instruction == null ? null : new OBDomesticVRPInstruction()
                .endToEndIdentification(instruction.getEndToEndIdentification())
                .instructionIdentification(instruction.getInstructionIdentification())
                .localInstrument(instruction.getLocalInstrument())
                .creditorAccount(toOBCashAccountCreditor3(instruction.getCreditorAccount()))
                .creditorPostalAddress(toOBPostalAddress6(instruction.getCreditorPostalAddress()))
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(instruction.getInstructedAmount()))
                .remittanceInformation(FRRemittanceInformationConverter.toOBVRPRemittanceInformation(instruction.getRemittanceInformation()))
                .supplementaryData(toOBSupplementaryData1(instruction.getSupplementaryData()));
    }

}
