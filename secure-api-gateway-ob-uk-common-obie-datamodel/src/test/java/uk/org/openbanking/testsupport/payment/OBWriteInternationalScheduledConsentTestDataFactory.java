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
package uk.org.openbanking.testsupport.payment;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBWriteInternational3DataInitiationExchangeRateInformation;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditor;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditorAgent;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent4DataPermission;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationInstructionPriority;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduled3DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduledConsent5;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduledConsent5Data;

/**
 * Test data factory for the various "OBWriteInternationalScheduledConsent" classes.
 */
public class OBWriteInternationalScheduledConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM020";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.01";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.BACS";
    private static final String PURPOSE = "CDCD";
    private static final String CURRENCY = "USD";

    public static OBWriteInternationalScheduledConsent5 aValidOBWriteInternationalScheduledConsent5() {
        return (new OBWriteInternationalScheduledConsent5())
                .data(aValidOBWriteInternationalScheduledConsent5Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalScheduledConsent5 aValidOBWriteInternationalScheduledConsent5MandatoryFields() {
        return (new OBWriteInternationalScheduledConsent5())
                .data(aValidOBWriteInternationalScheduledConsent5DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent5Data aValidOBWriteInternationalScheduledConsent5Data() {
        return (new OBWriteInternationalScheduledConsent5Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    public static OBWriteInternationalScheduledConsent5Data aValidOBWriteInternationalScheduledConsent5DataMandatoryFields() {
        return (new OBWriteInternationalScheduledConsent5Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiationMandatoryFields());
    }

    public static OBWriteInternationalScheduled3DataInitiation aValidOBWriteInternationalScheduled3DataInitiation() {
        return aValidOBWriteInternationalScheduled3DataInitiation(DateTime.now().plusDays(1));
    }

    public static OBWriteInternationalScheduled3DataInitiation aValidOBWriteInternationalScheduled3DataInitiation(DateTime requestedExecutionDateTime) {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBWriteInternational3DataInitiationInstructionPriority.URGENT)
                .purpose(PURPOSE)
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .requestedExecutionDateTime(requestedExecutionDateTime)
                .currencyOfTransfer(CURRENCY)
                .destinationCountryCode("GB")
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .exchangeRateInformation(aValidOBWriteInternational3DataInitiationExchangeRateInformation())
                .creditor(aValidOBWriteInternational3DataInitiationCreditor())
                .creditorAgent(aValidOBWriteInternational3DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteInternationalScheduled3DataInitiation aValidOBWriteInternationalScheduled3DataInitiationMandatoryFields() {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount());
    }
}
