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

import java.util.List;

import org.joda.time.DateTime;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountServicer;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRFinancialAccount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAccountIdentifierTestDataFactory;

/**
 * Test data factory for {@link FRFinancialAccount}.
 */
public class FRFinancialAccountTestDataFactory {

    public static FRFinancialAccount aValidFRFinancialAccount() {
        return aValidFRFinancialAccountBuilder().build();
    }

    public static FRFinancialAccount.FRFinancialAccountBuilder aValidFRFinancialAccountBuilder() {
        return FRFinancialAccount.builder()
                .accountId("1234")
                .status(FRFinancialAccount.FRAccountStatusCode.ENABLED)
                .statusUpdateDateTime(DateTime.now())
                .currency("GBP")
                .accountType(FRFinancialAccount.FRAccountTypeCode.PERSONAL)
                .accountSubType(FRFinancialAccount.FRAccountSubTypeCode.CURRENTACCOUNT)
                .description("A personal current account")
                .nickname("House Account")
                .openingDate(DateTime.now().minusDays(1))
                .maturityDate(null)
                .accounts(List.of(FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier()))
                .servicer(FRAccountServicer.builder()
                        .schemeName("UK.OBIE.SortCodeAccountNumber")
                        .identification("9876")
                        .build());
    }
}
