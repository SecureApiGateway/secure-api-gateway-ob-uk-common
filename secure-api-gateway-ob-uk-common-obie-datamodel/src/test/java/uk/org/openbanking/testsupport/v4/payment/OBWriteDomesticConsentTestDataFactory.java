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
import static uk.org.openbanking.testsupport.v4.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.v4.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsentDataAuthorisation;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBPostalAddress7;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBRisk1;

import java.util.UUID;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2Data;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticConsent4;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticConsent4Data;

/**
 * Test data factory for the various "OBWriteDomesticConsent" classes.
 */
public class OBWriteDomesticConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM021";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.02";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.CHAPS";

    public static OBWriteDomestic2 aValidOBWriteDomestic2() {
        return (new OBWriteDomestic2())
                .data(aValidOBWriteDataDomestic2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticConsent4 aValidOBWriteDomesticConsent4() {
        return (new OBWriteDomesticConsent4())
                .data(aValidOBWriteDomesticConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomestic2Data aValidOBWriteDataDomestic2() {
        return (new OBWriteDomestic2Data())
                .consentId(UUID.randomUUID().toString())
                .initiation(aValidOBWriteDomestic2DataInitiation());
    }

    public static OBWriteDomesticConsent4Data aValidOBWriteDomesticConsent4Data() {
        return (new OBWriteDomesticConsent4Data())
                .initiation(aValidOBWriteDomestic2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsentDataAuthorisation())
                .scASupportData(OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    public static OBWriteDomestic2DataInitiation aValidOBWriteDomestic2DataInitiation() {
        return (new OBWriteDomestic2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .creditorPostalAddress(aValidOBPostalAddress7())
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .supplementaryData(new OBSupplementaryData1());
    }
}
