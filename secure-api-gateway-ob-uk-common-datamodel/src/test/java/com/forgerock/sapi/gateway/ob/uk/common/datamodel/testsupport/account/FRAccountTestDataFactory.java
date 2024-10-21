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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.account.FRAccount;

import java.util.UUID;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.account.FRFinancialAccountTestDataFactory.aValidFRFinancialAccount;

/**
 * Test data factory for {@link FRAccount}.
 */
public class FRAccountTestDataFactory {

    public static FRAccount aValidFRAccount() {
        return aValidFRAccountBuilder().build();
    }

    public static FRAccount.FRAccountBuilder aValidFRAccountBuilder() {
        return FRAccount.builder()
                .id(UUID.randomUUID().toString())
                .userId(UUID.randomUUID().toString())
                .account(aValidFRFinancialAccount())
                .latestStatementId(UUID.randomUUID().toString());
    }
}
