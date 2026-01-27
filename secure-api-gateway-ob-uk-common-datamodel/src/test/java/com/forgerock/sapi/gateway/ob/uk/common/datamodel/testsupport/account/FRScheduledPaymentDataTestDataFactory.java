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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRScheduledPaymentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAccountIdentifierTestDataFactory;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRFinancialAgentTestDataFactory;
import org.joda.time.DateTime;

import java.util.UUID;

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
                .scheduledPaymentDateTime(DateTime.now())
                .scheduledType(FRScheduledPaymentData.FRScheduleType.EXECUTION)
                .reference("A reference")
                .debtorReference("A debtor reference")
                .instructedAmount(FRAmountTestDataFactory.aValidFRAmount())
                .creditorAgent(FRFinancialAgentTestDataFactory.aValidFRFinancialAgent())
                .creditorAccount(FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier())
                .build();
    }
}
