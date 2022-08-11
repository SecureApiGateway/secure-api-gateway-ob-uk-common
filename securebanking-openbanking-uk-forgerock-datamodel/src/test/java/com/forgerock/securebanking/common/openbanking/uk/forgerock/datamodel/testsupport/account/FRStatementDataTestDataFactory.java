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

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRStatementData;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRCreditDebitIndicator.CREDIT;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRStatementData.FRStatementType.REGULARPERIODIC;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;

/**
 * Test data factory for {@link FRStatementData}.
 */
public class FRStatementDataTestDataFactory {

    /**
     * @return a valid instance of {@link FRStatementData}.
     */
    public static FRStatementData aValidFRStatementData() {
        return aValidFRStatementData(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FRStatementData FRStatementData's} account.
     * @return a valid instance of {@link FRStatementData}.
     */
    public static FRStatementData aValidFRStatementData(String accountId) {
        return FRStatementData.builder()
                .accountId(accountId)
                .statementId(UUID.randomUUID().toString())
                .statementReference("Feb 2021")
                .type(REGULARPERIODIC)
                .startDateTime(OffsetDateTime.now().minusMonths(1))
                .endDateTime(OffsetDateTime.now())
                .creationDateTime(OffsetDateTime.now())
                .statementDescriptions(List.of("Feb 2021 Statement"))
                .statementAmounts(List.of(
                        FRStatementData.FRStatementAmount.builder()
                                .creditDebitIndicator(CREDIT)
                                .type("PreviousClosingBalance")
                                .amount(aValidFRAmount())
                                .build(),
                        FRStatementData.FRStatementAmount.builder()
                                .creditDebitIndicator(CREDIT)
                                .type("ClosingBalance")
                                .amount(aValidFRAmount())
                                .build()
                ))
                .build();
    }
}
