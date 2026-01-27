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
package uk.org.openbanking.testsupport.v3.payment;

import static uk.org.openbanking.testsupport.v3.payment.OBAccountTestDataFactory.aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.v3.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.v3.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.v3.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;

import org.joda.time.DateTime;

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.forgerock.FRFrequencyType;

import uk.org.openbanking.datamodel.v3.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.v3.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticScheduledConsent4DataPermission;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrder4DataInitiation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrderConsent6;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrderConsent6Data;

/**
 * Test data factory for the various "OBWriteInternationalStandingOrderConsent" classes.
 */
public class OBWriteInternationalStandingOrderConsentTestDataFactory {

    private static final String FREQUENCY = FRFrequencyType.EVERYWORKINGDAY.getFrequencyStr();
    private static final String REFERENCE = "Ipsum Non Arcu Inc.";
    private static final String NUMBER_OF_PAYMENTS = "1";
    private static final String PURPOSE = "CDCD";
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
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
                .initiation(aValidOBWriteInternationalStandingOrder4DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccount.NO);
    }

    public static OBWriteInternationalStandingOrderConsent6Data aValidOBWriteInternationalStandingOrderConsent6DataMandatoryFields() {
        return (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteDomesticScheduledConsent4DataPermission.CREATE)
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
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(firstPaymentDateTime)
                .finalPaymentDateTime(finalPaymentDateTime)
                .purpose(PURPOSE)
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .destinationCountryCode("GB")
                .instructedAmount(OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditor(OBInternationalIdentifierTestDataFactory.aValidOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor())
                .creditorAgent(OBInternationalIdentifierTestDataFactory.aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteInternationalStandingOrder4DataInitiation aValidOBWriteInternationalStandingOrder4DataInitiationMandatoryFields() {
        DateTime now = DateTime.now();
        return (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(FREQUENCY)
                .firstPaymentDateTime(now)
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount());
    }
}
