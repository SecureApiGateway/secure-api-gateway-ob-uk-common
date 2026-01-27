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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRDirectDebitData;
import org.joda.time.DateTime;

import java.util.UUID;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.FRMandateRelatedInformationTestDataFactory.aValidFRMandateRelatedInformation;

/**
 * Test data factory for {@link FRDirectDebitData}.
 */
public class FRDirectDebitDataTestDataFactory {

    /**
     * @return a valid instance of {@link FRDirectDebitData}
     */
    public static FRDirectDebitData aValidFRDirectDebitData() {
        return aValidFRDirectDebitData(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FRDirectDebitData FRDirectDebitData's} account.
     * @return a valid instance of {@link FRDirectDebitData}
     */
    public static FRDirectDebitData aValidFRDirectDebitData(String accountId) {
        return FRDirectDebitData.builder()
                .accountId(accountId)
                .directDebitId(UUID.randomUUID().toString())
                .mandateRelatedInformation(aValidFRMandateRelatedInformation())
                .directDebitStatusCode(FRDirectDebitData.FRDirectDebitStatus.ACTIVE)
                .name("DD name")
                .previousPaymentDateTime(DateTime.now())
                .previousPaymentAmount(aValidFRAmount())
                .build();
    }
}
