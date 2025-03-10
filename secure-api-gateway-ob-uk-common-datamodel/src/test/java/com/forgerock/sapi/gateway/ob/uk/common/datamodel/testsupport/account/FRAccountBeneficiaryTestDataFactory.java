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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountBeneficiary;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAccountIdentifierTestDataFactory;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRFinancialAgentTestDataFactory;

import java.util.UUID;

/**
 * Test data factory for {@link FRAccountBeneficiary}.
 */
public class FRAccountBeneficiaryTestDataFactory {

    /**
     * @return a valid instance of {@link FRAccountBeneficiary}.
     */
    public static FRAccountBeneficiary aValidFRAccountBeneficiary() {
        return aValidFRAccountBeneficiary(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FRAccountBeneficiary FRAccountBeneficiary's} account.
     * @return a valid instance of {@link FRAccountBeneficiary}.
     */
    public static FRAccountBeneficiary aValidFRAccountBeneficiary(String accountId) {
        return FRAccountBeneficiary.builder()
                .accountId(accountId)
                .beneficiaryId(UUID.randomUUID().toString())
                .beneficiaryType(FRAccountBeneficiary.FRBeneficiaryType.TRUSTED)
                .reference("A Reference")
                .creditorAgent(FRFinancialAgentTestDataFactory.aValidFRFinancialAgent())
                .creditorAccount(FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier())
                .build();
    }
}
