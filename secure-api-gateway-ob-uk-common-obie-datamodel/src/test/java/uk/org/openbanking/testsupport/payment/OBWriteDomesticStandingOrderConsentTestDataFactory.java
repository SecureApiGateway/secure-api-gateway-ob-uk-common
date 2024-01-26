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

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;

import org.joda.time.DateTime;

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRFrequencyType;

import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent4DataPermission;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrder3DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrderConsent5;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrderConsent5Data;

/**
 * Test data factory for the various "OBWriteDomesticStandingOrderConsent" classes.
 */
public class OBWriteDomesticStandingOrderConsentTestDataFactory {

    private static final String FREQUENCY = FRFrequencyType.EVERYWORKINGDAY.getFrequencyStr();
    private static final String REFERENCE = "Ipsum Non Arcu Inc.";
    private static final String NUMBER_OF_PAYMENTS = "1";

    public static OBWriteDomesticStandingOrderConsent5 aValidOBWriteDomesticStandingOrderConsent5() {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(aValidOBWriteDomesticStandingOrderConsent5Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticStandingOrderConsent5 aValidOBWriteDomesticStandingOrderConsent5MandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(aValidOBWriteDomesticStandingOrderConsent5DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteDomesticStandingOrderConsent5Data aValidOBWriteDomesticStandingOrderConsent5Data() {
        return (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1())
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
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .recurringPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .firstPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .recurringPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .finalPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .creditorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation aValidOBWriteDomesticStandingOrder3DataInitiation(DateTime dateTime) {
        return (new OBWriteDomesticStandingOrder3DataInitiation())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(dateTime)
                .recurringPaymentDateTime(dateTime)
                .finalPaymentDateTime(dateTime)
                .firstPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .recurringPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .finalPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .creditorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation aValidOBWriteDomesticStandingOrder3DataInitiationMandatoryFields() {
        DateTime now = now();
        return (new OBWriteDomesticStandingOrder3DataInitiation())
                .frequency(FREQUENCY)
                .firstPaymentDateTime(now)
                .firstPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .creditorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount());
    }
}
