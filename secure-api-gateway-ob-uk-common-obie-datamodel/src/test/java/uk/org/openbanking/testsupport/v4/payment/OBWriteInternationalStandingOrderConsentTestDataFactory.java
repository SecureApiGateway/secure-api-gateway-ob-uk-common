/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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

import static uk.org.openbanking.testsupport.v4.payment.OBAccountTestDataFactory.aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.v4.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsentDataAuthorisation;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;

import java.util.Collections;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBInternalChargeBearerType1Code;
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduledConsent5DataPermission;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalStandingOrder4DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalStandingOrderConsent6;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalStandingOrderConsent6Data;

/**
 * Test data factory for the various "OBWriteInternationalStandingOrderConsent" classes.
 */
public class OBWriteInternationalStandingOrderConsentTestDataFactory {

    private static final String CURRENCY = "USD";

    public static OBWriteInternationalStandingOrderConsent6 aValidOBWriteInternationalStandingOrderConsent6() {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(aValidOBWriteInternationalStandingOrderConsent6Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalStandingOrderConsent6 aValidOBWriteInternationalStandingOrderConsent6MandatoryFields() {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(aValidOBWriteInternationalStandingOrderConsent6DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalStandingOrderConsent6Data aValidOBWriteInternationalStandingOrderConsent6Data() {
        return (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteInternationalScheduledConsent5DataPermission.CREATE)
                .initiation(aValidOBWriteInternationalStandingOrder4DataInitiation())
                .authorisation(aValidOBWriteDomesticConsentDataAuthorisation())
                .scASupportData(OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    public static OBWriteInternationalStandingOrderConsent6Data aValidOBWriteInternationalStandingOrderConsent6DataMandatoryFields() {
        return (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteInternationalScheduledConsent5DataPermission.CREATE)
                .initiation(aValidOBWriteInternationalStandingOrder4DataInitiationMandatoryFields());
    }

    public static OBWriteInternationalStandingOrder4DataInitiation aValidOBWriteInternationalStandingOrder4DataInitiation() {
        DateTime now = DateTime.now();
        return aValidOBWriteInternationalStandingOrder4DataInitiation(now, now);
    }

    public static OBWriteInternationalStandingOrder4DataInitiation aValidOBWriteInternationalStandingOrder4DataInitiation(
            DateTime firstPaymentDateTime,
            DateTime finalPaymentDateTime
    ) {
        return (new OBWriteInternationalStandingOrder4DataInitiation())
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBInternalChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .destinationCountryCode("GB")
                .instructedAmount(OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditor(OBInternationalIdentifierTestDataFactory.aValidOBWriteInternationalConsent5DataInitiationCreditor())
                .creditorAgent(OBInternationalIdentifierTestDataFactory.aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1())
                .mandateRelatedInformation(OBMandateRelatedInformationTestDataFactory.aValidOBMandateRelatedInformation1())
                .regulatoryReporting(Collections.singletonList(OBRegulatoryReporting1TestDataFactory.aValidOBRegulatoryReporting1()))
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .ultimateCreditor(OBUltimateCreditor1TestDataFactory.aValidOBUltimateCreditor1())
                .ultimateDebtor(OBUltimateDebtor1TestDataFactory.aValidOBUltimateDebtor1());
    }

    public static OBWriteInternationalStandingOrder4DataInitiation aValidOBWriteInternationalStandingOrder4DataInitiationMandatoryFields() {
        DateTime now = DateTime.now();
        return (new OBWriteInternationalStandingOrder4DataInitiation())
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                .mandateRelatedInformation(OBMandateRelatedInformationTestDataFactory.aValidOBMandateRelatedInformation1());
    }
}
