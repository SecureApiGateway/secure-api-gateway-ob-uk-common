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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.account.FRStandingOrderData;
import org.joda.time.DateTime;

import java.util.UUID;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.payment.FRRemittanceInformationTestDataFactory.aValidFRRemittanceInformation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.FRMandateRelatedInformationTestDataFactory.aValidFRMandateRelatedInformation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.FRFinancialAgentTestDataFactory.aValidFRFinancialAgent;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.account.FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifierWithProxy;

/**
 * Test data factory for {@link FRStandingOrderData}.
 */
public class FRStandingOrderDataTestDataFactory {

    /**
     * @return a valid instance of {@link FRStandingOrderData}.
     */
    public static FRStandingOrderData aValidFRStandingOrderData() {
        return aValidFRStandingOrderData(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FRStandingOrderData FRStandingOrderData's} account.
     * @return a valid instance of {@link FRStandingOrderData}.
     */
    public static FRStandingOrderData aValidFRStandingOrderData(String accountId) {
        return FRStandingOrderData.builder()
                .accountId(accountId)
                .standingOrderId(UUID.randomUUID().toString())
                .frequency("IntrvlMnthDay:01:-01")
                .reference("A Direct Debit reference")
                .firstPaymentDateTime(DateTime.now())
                .nextPaymentDateTime(DateTime.now().plusMonths(1))
                .lastPaymentDateTime(DateTime.now().plusMonths(12))
                .finalPaymentDateTime(DateTime.now().plusMonths(12))
                .numberOfPayments("12")
                .standingOrderStatusCode(FRStandingOrderData.FRStandingOrderStatus.ACTIVE)
                .firstPaymentAmount(aValidFRAmount())
                .nextPaymentAmount(aValidFRAmount())
                .lastPaymentAmount(aValidFRAmount())
                .finalPaymentAmount(aValidFRAmount())
                .creditorAgent(aValidFRFinancialAgent())
                .creditorAccount(aValidFRAccountIdentifierWithProxy())
                .mandateRelatedInformation(aValidFRMandateRelatedInformation())
                .remittanceInformation(aValidFRRemittanceInformation())
                .build();
    }
}
