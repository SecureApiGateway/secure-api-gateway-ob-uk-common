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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCurrencyExchange;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAmountConverter;

import uk.org.openbanking.datamodel.v3.account.OBCurrencyExchange5;

public class FRCurrencyExchangeConverter {

    // FR to OB
    public static OBCurrencyExchange5 toOBCurrencyExchange5(FRCurrencyExchange currencyExchange) {
        return currencyExchange == null ? null : new OBCurrencyExchange5()
                .sourceCurrency(currencyExchange.getSourceCurrency())
                .targetCurrency(currencyExchange.getTargetCurrency())
                .unitCurrency(currencyExchange.getUnitCurrency())
                .exchangeRate(currencyExchange.getExchangeRate())
                .contractIdentification(currencyExchange.getContractIdentification())
                .quotationDate(currencyExchange.getQuotationDate())
                .instructedAmount(FRAmountConverter.toOBCurrencyExchange5InstructedAmount(currencyExchange.getInstructedAmount()));
    }

    // OB to FR
    public static FRCurrencyExchange toFRCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
        return currencyExchange == null ? null : FRCurrencyExchange.builder()
                .sourceCurrency(currencyExchange.getSourceCurrency())
                .targetCurrency(currencyExchange.getTargetCurrency())
                .unitCurrency(currencyExchange.getUnitCurrency())
                .exchangeRate(currencyExchange.getExchangeRate())
                .contractIdentification(currencyExchange.getContractIdentification())
                .quotationDate(currencyExchange.getQuotationDate())
                .instructedAmount(FRAmountConverter.toFRAmount(currencyExchange.getInstructedAmount()))
                .build();
    }
}
