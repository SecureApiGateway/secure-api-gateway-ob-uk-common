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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAmount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRLocalAmount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;

import uk.org.openbanking.datamodel.v4.account.*;
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v4.fund.OBFundsConfirmation1DataInstructedAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiationInstructedAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount;

public class FRAmountConverter {

    // OB to FR
    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount0 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount1 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount2 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount3 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount4 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount10 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount11 amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBWriteDomestic2DataInitiationInstructedAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBCurrencyExchange5InstructedAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBTransactionCashBalanceAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBReadOffer1DataOfferInnerAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBReadOffer1DataOfferInnerFee amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBReadBalance1DataBalanceInnerAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRAmount toFRAmount(OBFundsConfirmation1DataInstructedAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    // FR to OB
    public static OBActiveOrHistoricCurrencyAndAmount toOBActiveOrHistoricCurrencyAndAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount2 toOBActiveOrHistoricCurrencyAndAmount2(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount2.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount3 toOBActiveOrHistoricCurrencyAndAmount3(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount3.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount4 toOBActiveOrHistoricCurrencyAndAmount4(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount4.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount5 toOBActiveOrHistoricCurrencyAndAmount5(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount5.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount7 toOBActiveOrHistoricCurrencyAndAmount7(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount7.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount8 toOBActiveOrHistoricCurrencyAndAmount8(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount8.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount9 toOBActiveOrHistoricCurrencyAndAmount9(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount9.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount10 toOBActiveOrHistoricCurrencyAndAmount10(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount10.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount11 toOBActiveOrHistoricCurrencyAndAmount11(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount11.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount toAccountOBActiveOrHistoricCurrencyAndAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount0 toOBActiveOrHistoricCurrencyAndAmount0(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount0.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount1 toOBActiveOrHistoricCurrencyAndAmount1(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount1.class);
    }

    public static OBActiveOrHistoricCurrencyAndAmount6 toOBActiveOrHistoricCurrencyAndAmount6(FRAmount amount) {
        return FRModelMapper.map(amount, OBActiveOrHistoricCurrencyAndAmount6.class);
    }

    public static OBWriteDomestic2DataInitiationInstructedAmount toOBWriteDomestic2DataInitiationInstructedAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBWriteDomestic2DataInitiationInstructedAmount.class);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount toOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount.class);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount toOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount.class);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount toOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount.class);
    }

    public static OBCurrencyExchange5InstructedAmount toOBCurrencyExchange5InstructedAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBCurrencyExchange5InstructedAmount.class);
    }

    public static OBTransactionCashBalanceAmount toOBTransactionCashBalanceAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBTransactionCashBalanceAmount.class);
    }

    public static OBReadOffer1DataOfferInnerAmount toOBReadOffer1DataAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBReadOffer1DataOfferInnerAmount.class);
    }

    public static OBReadOffer1DataOfferInnerFee toOBReadOffer1DataFee(FRAmount amount) {
        return FRModelMapper.map(amount, OBReadOffer1DataOfferInnerFee.class);
    }

    public static OBReadBalance1DataBalanceInnerAmount toOBReadBalance1DataAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBReadBalance1DataBalanceInnerAmount.class);
    }

    public static OBReadBalance1DataBalanceInnerCreditLineInnerAmount toOBReadBalance1DataAmount1(FRAmount amount) {
        return FRModelMapper.map(amount, OBReadBalance1DataBalanceInnerCreditLineInnerAmount.class);
    }

    public static OBFundsConfirmation1DataInstructedAmount toOBFundsConfirmation1DataInstructedAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBFundsConfirmation1DataInstructedAmount.class);
    }

    public static OBStatement2StatementAmountInnerLocalAmount toOBStatement2StatementAmountInnerLocalAmount(FRLocalAmount amount) {
        return FRModelMapper.map(amount, OBStatement2StatementAmountInnerLocalAmount.class);
    }

    public static OBStatement2StatementAmountInnerAmount toOBStatement2StatementAmountInnerAmount(FRAmount amount) {
        return FRModelMapper.map(amount, OBStatement2StatementAmountInnerAmount.class);
    }

    public static OBReadBalance1DataBalanceInnerLocalAmount toOBReadBalance1DataBalanceInnerLocalAmount(FRLocalAmount amount) {
        return FRModelMapper.map(amount, OBReadBalance1DataBalanceInnerLocalAmount.class);
    }

    public static FRAmount toFRAmount(OBStatement2StatementAmountInnerAmount amount) {
        return FRModelMapper.map(amount, FRAmount.class);
    }

    public static FRLocalAmount toFRAmount(OBStatement2StatementAmountInnerLocalAmount amount) {
        return FRModelMapper.map(amount, FRLocalAmount.class);
    }

    public static FRLocalAmount toFRLocalAmount(OBReadBalance1DataBalanceInnerLocalAmount amount) {
        return FRModelMapper.map(amount, FRLocalAmount.class);
    }
}
