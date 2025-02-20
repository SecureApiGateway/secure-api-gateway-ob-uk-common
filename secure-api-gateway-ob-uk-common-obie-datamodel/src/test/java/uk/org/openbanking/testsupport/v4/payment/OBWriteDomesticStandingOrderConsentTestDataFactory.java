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

import static org.joda.time.DateTime.now;

import java.util.Collections;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4DataPermission;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrderConsent5;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrderConsent5Data;

/**
 * Test data factory for the various "OBWriteDomesticStandingOrderConsent" classes.
 */
public class OBWriteDomesticStandingOrderConsentTestDataFactory {

    public static OBWriteDomesticStandingOrderConsent5 aValidOBWriteDomesticStandingOrderConsent5() {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(aValidOBWriteDomesticStandingOrderConsent5Data())
                .risk(OBRisk1TestDataFactory.aValidOBRisk1());
    }

    public static OBWriteDomesticStandingOrderConsent5 aValidOBWriteDomesticStandingOrderConsent5MandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(aValidOBWriteDomesticStandingOrderConsent5DataMandatoryFields())
                .risk(OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields());
    }

    public static OBWriteDomesticStandingOrderConsent5Data aValidOBWriteDomesticStandingOrderConsent5Data() {
        return (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiation())
                .authorisation(OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsentDataAuthorisation())
                .scASupportData(OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    public static OBWriteDomesticStandingOrderConsent5Data aValidOBWriteDomesticStandingOrderConsent5DataMandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiationMandatoryFields());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation aValidOBWriteDomesticStandingOrder3DataInitiation() {
        DateTime now = now();
        return (new OBWriteDomesticStandingOrder3DataInitiation())
                .firstPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .recurringPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .finalPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .creditorAccount(OBAccountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1())
                .mandateRelatedInformation(OBMandateRelatedInformationTestDataFactory.aValidOBMandateRelatedInformation1())
                .regulatoryReporting(Collections.singletonList(OBRegulatoryReporting1TestDataFactory.aValidOBRegulatoryReporting1()))
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .ultimateCreditor(OBUltimateCreditor1TestDataFactory.aValidOBUltimateCreditor1())
                .ultimateDebtor(OBUltimateDebtor1TestDataFactory.aValidOBUltimateDebtor1());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation aValidOBWriteDomesticStandingOrder3DataInitiation(DateTime dateTime) {
        return (new OBWriteDomesticStandingOrder3DataInitiation())
                .firstPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .recurringPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .finalPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .creditorAccount(OBAccountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1())
                .mandateRelatedInformation(OBMandateRelatedInformationTestDataFactory.aValidOBMandateRelatedInformation1())
                .regulatoryReporting(Collections.singletonList(OBRegulatoryReporting1TestDataFactory.aValidOBRegulatoryReporting1()))
                .remittanceInformation(OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation2())
                .ultimateCreditor(OBUltimateCreditor1TestDataFactory.aValidOBUltimateCreditor1())
                .ultimateDebtor(OBUltimateDebtor1TestDataFactory.aValidOBUltimateDebtor1());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation aValidOBWriteDomesticStandingOrder3DataInitiationMandatoryFields() {
        DateTime now = now();
        return (new OBWriteDomesticStandingOrder3DataInitiation())
                .firstPaymentAmount(OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .creditorAccount(OBAccountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .mandateRelatedInformation(OBMandateRelatedInformationTestDataFactory.aValidOBMandateRelatedInformation1());
    }
}
