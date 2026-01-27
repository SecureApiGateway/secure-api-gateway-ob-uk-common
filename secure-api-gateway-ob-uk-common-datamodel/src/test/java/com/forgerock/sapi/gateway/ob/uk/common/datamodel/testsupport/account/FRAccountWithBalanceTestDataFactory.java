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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountWithBalance;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCashBalance;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRFinancialAccount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAccountIdentifierTestDataFactory;

import java.util.List;

/**
 * Test data factory for {@link FRAccountWithBalance}.
 */
public class FRAccountWithBalanceTestDataFactory {

    public static FRAccountWithBalance aValidFRAccountWithBalance() {
        FRFinancialAccount financialAccount = FRFinancialAccountTestDataFactory.aValidFRFinancialAccountBuilder()
                .accounts(List.of(FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier()))
                .build();
        FRAccount bankAccount = FRAccount.builder()
                .id("123456")
                .account(financialAccount)
                .build();
        List<FRCashBalance> balances = List.of(FRCashBalanceTestDataFactory.aValidFRCashBalance());
        return new FRAccountWithBalance(bankAccount, balances);
    }
}
