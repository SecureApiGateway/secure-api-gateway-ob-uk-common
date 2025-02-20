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

import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiationInstructedAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount;

/**
 * Test data factory for the various OB classes that represent money.
 */
public class OBAmountTestDataFactory {

    private static final String GBP = "GBP";
    private static final String AMOUNT = "10.01";

    public static OBWriteDomestic2DataInitiationInstructedAmount aValidOBWriteDomestic2DataInitiationInstructedAmount() {
        return (new OBWriteDomestic2DataInitiationInstructedAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount aValidOBDomesticStandingOrder3FinalPaymentAmount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount aValidOBDomesticStandingOrder3RecurringPaymentAmount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount aValidOBDomesticStandingOrder3FirstPaymentAmount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBActiveOrHistoricCurrencyAndAmount aValidOBActiveOrHistoricCurrencyAndAmount() {
        return (new OBActiveOrHistoricCurrencyAndAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }

    public static OBWriteDomestic2DataInitiationInstructedAmount aValidOBDomestic2InstructedAmount() {
        return (new OBWriteDomestic2DataInitiationInstructedAmount())
                .currency(GBP)
                .amount(AMOUNT);
    }
}
