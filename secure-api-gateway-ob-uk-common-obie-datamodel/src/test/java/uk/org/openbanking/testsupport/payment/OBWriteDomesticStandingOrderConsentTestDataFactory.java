/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRFrequencyType;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.*;

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBWriteDomesticConsent3DataSCASupportData;

/**
 * Test data factory for the various "OBWriteDomesticStandingOrderConsent" classes.
 */
public class OBWriteDomesticStandingOrderConsentTestDataFactory {

    private static final String FREQUENCY = FRFrequencyType.EVERYWORKINGDAY.getFrequencyStr();
    private static final String REFERENCE = "Ipsum Non Arcu Inc.";
    private static final String NUMBER_OF_PAYMENTS = "1";

    public static OBWriteDomesticStandingOrderConsent2 aValidOBWriteDomesticStandingOrderConsent2() {
        return (new OBWriteDomesticStandingOrderConsent2())
                .data(aValidOBWriteDataDomesticStandingOrderConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticStandingOrderConsent2 aValidOBWriteDomesticStandingOrderConsent2MandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent2())
                .data(aValidOBWriteDataDomesticStandingOrderConsent2MandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteDomesticStandingOrderConsent3 aValidOBWriteDomesticStandingOrderConsent3() {
        return (new OBWriteDomesticStandingOrderConsent3())
                .data(aValidOBWriteDataDomesticStandingOrderConsent3())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticStandingOrderConsent3 aValidOBWriteDomesticStandingOrderConsent3MandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent3())
                .data(aValidOBWriteDataDomesticStandingOrderConsent3MandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteDomesticStandingOrderConsent4 aValidOBWriteDomesticStandingOrderConsent4() {
        return (new OBWriteDomesticStandingOrderConsent4())
                .data(aValidOBWriteDomesticStandingOrderConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticStandingOrderConsent4 aValidOBWriteDomesticStandingOrderConsent4MandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent4())
                .data(aValidOBWriteDomesticStandingOrderConsent4DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

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

    public static OBWriteDataDomesticStandingOrderConsent2 aValidOBWriteDataDomesticStandingOrderConsent2() {
        return (new OBWriteDataDomesticStandingOrderConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticStandingOrder2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDataDomesticStandingOrderConsent2 aValidOBWriteDataDomesticStandingOrderConsent2MandatoryFields() {
        return (new OBWriteDataDomesticStandingOrderConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticStandingOrder2MandatoryFields());
    }

    public static OBWriteDataDomesticStandingOrderConsent3 aValidOBWriteDataDomesticStandingOrderConsent3() {
        return (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticStandingOrder3())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDataDomesticStandingOrderConsent3 aValidOBWriteDataDomesticStandingOrderConsent3MandatoryFields() {
        return (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticStandingOrder3MandatoryFields());
    }

    public static OBWriteDomesticStandingOrderConsent4Data aValidOBWriteDomesticStandingOrderConsent4Data() {
        return (new OBWriteDomesticStandingOrderConsent4Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteDomesticStandingOrderConsent4Data aValidOBWriteDomesticStandingOrderConsent4DataMandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent4Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiationMandatoryFields());
    }

    public static OBWriteDomesticStandingOrderConsent5Data aValidOBWriteDomesticStandingOrderConsent5Data() {
        return (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccountEnum.NO);
    }

    public static OBWriteDomesticStandingOrderConsent5Data aValidOBWriteDomesticStandingOrderConsent5DataMandatoryFields() {
        return (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiationMandatoryFields());
    }

    public static OBDomesticStandingOrder1 aValidOBDomesticStandingOrder1() {
        DateTime now = now();
        return (new OBDomesticStandingOrder1())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .recurringPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .firstPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .recurringPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .finalPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditorAccount(aValidOBCashAccount3());
    }

    public static OBDomesticStandingOrder2 aValidOBDomesticStandingOrder2() {
        DateTime now = now();
        return (new OBDomesticStandingOrder2())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .recurringPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .firstPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .recurringPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .finalPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .creditorAccount(aValidOBCashAccount3())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBDomesticStandingOrder2 aValidOBDomesticStandingOrder2MandatoryFields() {
        DateTime now = now();
        return (new OBDomesticStandingOrder2())
                .frequency(FREQUENCY)
                .firstPaymentDateTime(now)
                .firstPaymentAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .creditorAccount(aValidOBCashAccount3());
    }

    public static OBDomesticStandingOrder3 aValidOBDomesticStandingOrder3() {
        DateTime now = now();
        return (new OBDomesticStandingOrder3())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .recurringPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .firstPaymentAmount(aValidOBDomesticStandingOrder3FirstPaymentAmount())
                .recurringPaymentAmount(aValidOBDomesticStandingOrder3RecurringPaymentAmount())
                .finalPaymentAmount(aValidOBDomesticStandingOrder3FinalPaymentAmount())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBDomesticStandingOrder3 aValidOBDomesticStandingOrder3MandatoryFields() {
        DateTime now = now();
        return (new OBDomesticStandingOrder3())
                .frequency(FREQUENCY)
                .firstPaymentDateTime(now)
                .firstPaymentAmount(aValidOBDomesticStandingOrder3FirstPaymentAmount())
                .creditorAccount(aValidOBCashAccountCreditor3());
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
