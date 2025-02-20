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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRBalanceType;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCashBalance;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditDebitIndicator;
import org.joda.time.DateTime;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;

/**
 * Test data factory for {@link FRCashBalance}.
 */
public class FRCashBalanceTestDataFactory {

    /**
     * @return a valid instance of {@link FRCashBalance}.
     */
    public static FRCashBalance aValidFRCashBalance() {
        return aValidFRCashBalanceBuilder()
                .build();
    }

    /**
     * @param accountId The ID of the {@link FRCashBalance FRCashBalance's} account.
     * @return a valid instance of {@link FRCashBalance}.
     */
    public static FRCashBalance aValidFRCashBalance(String accountId) {
        return aValidFRCashBalanceBuilder()
                .accountId(accountId)
                .build();
    }

    /**
     * @return an instance of {@link FRCashBalance.FRCashBalanceBuilder} with the required values populated.
     */
    public static FRCashBalance.FRCashBalanceBuilder aValidFRCashBalanceBuilder() {
        return FRCashBalance.builder()
                .accountId("12345")
                .creditDebitIndicator(FRCreditDebitIndicator.CREDIT)
                .type(FRBalanceType.INTERIMAVAILABLE)
                .dateTime(DateTime.now())
                .amount(aValidFRAmount());
    }
}
