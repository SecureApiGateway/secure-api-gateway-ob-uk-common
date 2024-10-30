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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditLine;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;

/**
 * Test data factory for {@link FRCreditLine}.
 */
public class FRCreditLineTestDataFactory {

    public static FRCreditLine aValidFRCreditLine() {
        return aValidFRCreditLineBuilder().build();
    }

    public static FRCreditLine.FRCreditLineBuilder aValidFRCreditLineBuilder() {
        return FRCreditLine.builder()
                .included(true)
                .amount(aValidFRAmount())
                .type(FRCreditLine.FRLimitType.fromValue("Temporary"));
    }
}
