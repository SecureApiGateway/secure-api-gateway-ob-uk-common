/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.account;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRBankAccount;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRBankAccountWithBalance;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRCashBalance;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRFinancialAccount;

import java.util.List;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.account.FRCashBalanceTestDataFactory.aValidFRCashBalance;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.account.FRFinancialAccountTestDataFactory.aValidFRFinancialAccountBuilder;

/**
 * Test data factory for {@link FRBankAccountWithBalance}.
 */
public class FRBankAccountWithBalanceTestDataFactory {

    public static FRBankAccountWithBalance aValidFRBankAccountWithBalance() {
        FRFinancialAccount financialAccount = aValidFRFinancialAccountBuilder()
                .accounts(List.of(aValidFRAccountIdentifier()))
                .build();
        FRBankAccount bankAccount = FRBankAccount.builder()
                .id("123456")
                .account(financialAccount)
                .build();
        List<FRCashBalance> balances = List.of(aValidFRCashBalance());
        return new FRBankAccountWithBalance(bankAccount, balances);
    }
}
