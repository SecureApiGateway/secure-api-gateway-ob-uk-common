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
package uk.org.openbanking.datamodel.v3.payment;

import uk.org.openbanking.datamodel.v3.common.OBActiveOrHistoricCurrencyAndAmount;

public class OBAmountConverter {

    public static OBActiveOrHistoricCurrencyAndAmount toOBActiveOrHistoricCurrencyAndAmount(OBWriteDomestic2DataInitiationInstructedAmount amount) {
        return toAmount(new OBActiveOrHistoricCurrencyAndAmount(), amount);
    }

    public static OBActiveOrHistoricCurrencyAndAmount toOBActiveOrHistoricCurrencyAndAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount amount) {
        return toAmount(new OBActiveOrHistoricCurrencyAndAmount(), amount);
    }

    public static OBActiveOrHistoricCurrencyAndAmount toOBActiveOrHistoricCurrencyAndAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount amount) {
        return toAmount(new OBActiveOrHistoricCurrencyAndAmount(), amount);
    }

    public static OBActiveOrHistoricCurrencyAndAmount toOBActiveOrHistoricCurrencyAndAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount amount) {
        return toAmount(new OBActiveOrHistoricCurrencyAndAmount(), amount);
    }

    public static OBWriteDomestic2DataInitiationInstructedAmount toOBWriteDomestic2DataInitiationInstructedAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        return toAmount(new OBWriteDomestic2DataInitiationInstructedAmount(), amount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount toOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        return toAmount(new OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount(), amount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount toOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        return toAmount(new OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount(), amount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount toOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        return toAmount(new OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount(), amount);
    }

    public static OBActiveOrHistoricCurrencyAndAmount toAccountOBActiveOrHistoricCurrencyAndAmount(OBWriteDomestic2DataInitiationInstructedAmount amount) {
        return toAmount(new OBActiveOrHistoricCurrencyAndAmount(), amount);
    }

    private static <T, U> T toAmount(T newAmount, U originalAmount) {
        if (originalAmount == null) {
            return null;
        }
        ConverterHelper.copyField(newAmount, originalAmount, "currency");
        ConverterHelper.copyField(newAmount, originalAmount, "amount");
        return newAmount;
    }
}
