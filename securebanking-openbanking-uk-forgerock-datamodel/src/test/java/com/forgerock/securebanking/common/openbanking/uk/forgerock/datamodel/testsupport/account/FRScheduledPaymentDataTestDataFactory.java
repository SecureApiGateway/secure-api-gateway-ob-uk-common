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

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRScheduledPaymentData;

import java.time.OffsetDateTime;
import java.util.UUID;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRScheduledPaymentData.FRScheduleType.EXECUTION;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRFinancialAgentTestDataFactory.aValidFRFinancialAgent;

/**
 * Test data factory for {@link FRScheduledPaymentData}.
 */
public class FRScheduledPaymentDataTestDataFactory {

    /**
     * @return a valid instance of {@link FRScheduledPaymentData}.
     */
    public static FRScheduledPaymentData aValidFRScheduledPaymentData() {
        return aValidFRScheduledPaymentData(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FRScheduledPaymentData FRScheduledPaymentData's} account.
     * @return a valid instance of {@link FRScheduledPaymentData}.
     */
    public static FRScheduledPaymentData aValidFRScheduledPaymentData(String accountId) {
        return FRScheduledPaymentData.builder()
                .accountId(accountId)
                .scheduledPaymentId(UUID.randomUUID().toString())
                .scheduledPaymentDateTime(OffsetDateTime.now())
                .scheduledType(EXECUTION)
                .reference("A reference")
                .debtorReference("A debtor reference")
                .instructedAmount(aValidFRAmount())
                .creditorAgent(aValidFRFinancialAgent())
                .creditorAccount(aValidFRAccountIdentifier())
                .build();
    }
}
