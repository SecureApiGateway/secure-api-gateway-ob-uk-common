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
package uk.org.openbanking.testsupport.v4.payment;

import static uk.org.openbanking.testsupport.v4.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.v4.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccountMandatoryFields;
import static uk.org.openbanking.testsupport.v4.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.v4.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsentDataAuthorisation;
import static uk.org.openbanking.testsupport.v4.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAgent;
import static uk.org.openbanking.testsupport.v4.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditor;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;

import java.util.Collections;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBInternalChargeBearerType1Code;
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3DataInitiationInstructionPriority;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalConsent5;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalConsent5Data;

/**
 * Test data factory for the various "OBWriteInternationalConsent" classes.
 */
public class OBWriteInternationalConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM020";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.01";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.BACS";
    private static final String CURRENCY = "USD";

    public static OBWriteInternationalConsent5 aValidOBWriteInternationalConsent5() {
        return (new OBWriteInternationalConsent5())
                .data(aValidOBWriteInternationalConsent5Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalConsent5 aValidOBWriteInternationalConsent5MandatoryFields() {
        return (new OBWriteInternationalConsent5())
                .data(aValidOBWriteInternationalConsent5DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalConsent5Data aValidOBWriteInternationalConsent5Data() {
        return (new OBWriteInternationalConsent5Data())
                .initiation(aValidOBWriteInternational3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsentDataAuthorisation())
                .scASupportData(OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    public static OBWriteInternationalConsent5Data aValidOBWriteInternationalConsent5DataMandatoryFields() {
        return (new OBWriteInternationalConsent5Data())
                .initiation(aValidOBWriteInternational3DataInitiationMandatoryFields());
    }

    public static OBWriteInternational3DataInitiation aValidOBWriteInternational3DataInitiation() {
        return (new OBWriteInternational3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBWriteInternational3DataInitiationInstructionPriority.NORMAL)
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBInternalChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .destinationCountryCode("GB")
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .exchangeRateInformation(OBExchangeRateTestDataFactory.aValidOBWriteInternational3DataInitiationExchangeRateInformation())
                .creditor(aValidOBWriteInternational3DataInitiationCreditor())
                .creditorAgent(aValidOBWriteDomestic2DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1())
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .regulatoryReporting(Collections.singletonList(OBRegulatoryReporting1TestDataFactory.aValidOBRegulatoryReporting1()))
                .ultimateCreditor(OBUltimateCreditor1TestDataFactory.aValidOBUltimateCreditor1())
                .ultimateDebtor(OBUltimateDebtor1TestDataFactory.aValidOBUltimateDebtor1());
    }

    public static OBWriteInternational3DataInitiation aValidOBWriteInternational3DataInitiationMandatoryFields() {
        return (new OBWriteInternational3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccountMandatoryFields());
    }
}
