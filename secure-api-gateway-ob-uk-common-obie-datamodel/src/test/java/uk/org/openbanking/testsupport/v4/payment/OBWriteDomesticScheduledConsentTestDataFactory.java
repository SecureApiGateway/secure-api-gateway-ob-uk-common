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
package uk.org.openbanking.testsupport.v4.payment;

import static uk.org.openbanking.testsupport.v4.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.v4.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.v4.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsentDataAuthorisation;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBPostalAddress7;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBRisk1;

import java.util.Collections;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduled2DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4Data;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4DataPermission;

/**
 * Test data factory for the various "OBWriteDomesticScheduledConsent" classes.
 */
public class OBWriteDomesticScheduledConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM021";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.02";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.CHAPS";

    public static OBWriteDomesticScheduledConsent4 aValidOBWriteDomesticScheduledConsent4() {
        return (new OBWriteDomesticScheduledConsent4())
                .data(aValidOBWriteDomesticScheduledConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticScheduledConsent4Data aValidOBWriteDomesticScheduledConsent4Data() {
        return (new OBWriteDomesticScheduledConsent4Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteDomesticScheduled2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsentDataAuthorisation())
                .scASupportData(OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    private static OBWriteDomesticScheduled2DataInitiation aValidOBWriteDomesticScheduled2DataInitiation() {
        return (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .requestedExecutionDateTime(DateTime.now().plusDays(4))
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .creditorPostalAddress(aValidOBPostalAddress7())
                .supplementaryData(new OBSupplementaryData1())
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .regulatoryReporting(Collections.singletonList(OBRegulatoryReporting1TestDataFactory.aValidOBRegulatoryReporting1()))
                .ultimateCreditor(OBUltimateCreditor1TestDataFactory.aValidOBUltimateCreditor1())
                .ultimateDebtor(OBUltimateDebtor1TestDataFactory.aValidOBUltimateDebtor1());
    }

    public static OBWriteDomesticScheduled2DataInitiation aValidOBWriteDomesticScheduled2DataInitiation(DateTime dateTime) {
        return (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .requestedExecutionDateTime(dateTime)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .creditorPostalAddress(aValidOBPostalAddress7())
                .supplementaryData(new OBSupplementaryData1())
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .regulatoryReporting(Collections.singletonList(OBRegulatoryReporting1TestDataFactory.aValidOBRegulatoryReporting1()))
                .ultimateCreditor(OBUltimateCreditor1TestDataFactory.aValidOBUltimateCreditor1())
                .ultimateDebtor(OBUltimateDebtor1TestDataFactory.aValidOBUltimateDebtor1());
    }
}
