/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRTransactionData;
import org.joda.time.DateTime;

import java.util.UUID;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRBalanceType.INTERIMBOOKED;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRCreditDebitIndicator.CREDIT;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRFinancialAgentTestDataFactory.aValidFRFinancialAgent;

/**
 * Test data factory for {@link FRTransactionData}.
 */
public class FRTransactionDataTestDataFactory {

    /**
     * @return a valid instance of {@link FRTransactionData}.
     */
    public static FRTransactionData aValidFRTransactionData() {
        return aValidFRTransactionData(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FRTransactionData FRTransactionData's} account.
     * @return a valid instance of {@link FRTransactionData}.
     */
    public static FRTransactionData aValidFRTransactionData(String accountId) {
        return FRTransactionData.builder()
                .accountId(accountId)
                .transactionId(UUID.randomUUID().toString())
                .transactionReference("Ref 001")
                .creditDebitIndicator(CREDIT)
                .status(FRTransactionData.FREntryStatus.BOOKED)
                .bookingDateTime(DateTime.now().minusDays(1))
                .valueDateTime(DateTime.now().minusDays(1))
                .transactionInformation("Cash from Fitzpatrick, Fitzgerald N.")
                .amount(aValidFRAmount())
                .bankTransactionCode(FRTransactionData.FRBankTransactionCodeStructure.builder()
                        .code("ReceivedCreditTransfer")
                        .subCode("DomesticCreditTransfer")
                        .build())
                .proprietaryBankTransactionCode(FRTransactionData.FRProprietaryBankTransactionCodeStructure.builder()
                        .code("Transfer")
                        .issuer("AlphaBank")
                        .build())
                .balance(FRTransactionData.FRTransactionCashBalance.builder()
                        .amount(aValidFRAmount())
                        .creditDebitIndicator(CREDIT)
                        .type(INTERIMBOOKED)
                        .build())
                .creditorAgent(aValidFRFinancialAgent())
                .creditorAccount(aValidFRAccountIdentifier())
                .build();
    }
}
