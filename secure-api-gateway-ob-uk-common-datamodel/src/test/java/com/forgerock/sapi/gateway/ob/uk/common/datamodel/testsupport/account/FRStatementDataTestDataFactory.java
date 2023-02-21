/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditDebitIndicator;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRStatementData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory;
import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

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
                .type(FRStatementData.FRStatementType.REGULARPERIODIC)
                .startDateTime(DateTime.now().minusMonths(1))
                .endDateTime(DateTime.now())
                .creationDateTime(DateTime.now())
                .statementDescriptions(List.of("Feb 2021 Statement"))
                .statementAmounts(List.of(
                        FRStatementData.FRStatementAmount.builder()
                                .creditDebitIndicator(FRCreditDebitIndicator.CREDIT)
                                .type("PreviousClosingBalance")
                                .amount(FRAmountTestDataFactory.aValidFRAmount())
                                .build(),
                        FRStatementData.FRStatementAmount.builder()
                                .creditDebitIndicator(FRCreditDebitIndicator.CREDIT)
                                .type("ClosingBalance")
                                .amount(FRAmountTestDataFactory.aValidFRAmount())
                                .build()
                ))
                .build();
    }
}
