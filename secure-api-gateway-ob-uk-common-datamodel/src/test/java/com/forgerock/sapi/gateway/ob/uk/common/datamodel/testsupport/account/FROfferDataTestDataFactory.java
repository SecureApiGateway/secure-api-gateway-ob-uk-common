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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FROfferData;
import org.joda.time.DateTime;

import java.util.UUID;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory.aValidFRAmount;

/**
 * Test data factory for {@link FROfferData}.
 */
public class FROfferDataTestDataFactory {

    /**
     * @return a valid instance of {@link FROfferData}.
     */
    public static FROfferData aValidFROfferData() {
        return aValidFROfferData(UUID.randomUUID().toString());
    }

    /**
     * @param accountId The ID of the {@link FROfferData FROfferData's} account.
     * @return a valid instance of {@link FROfferData}.
     */
    public static FROfferData aValidFROfferData(String accountId) {
        return FROfferData.builder()
                .accountId(accountId)
                .offerId(UUID.randomUUID().toString())
                .offerType(FROfferData.FROfferType.LIMITINCREASE)
                .description("Credit limit increase for the account up to £10.00")
                .startDateTime(DateTime.now())
                .endDateTime(DateTime.now().plusDays(5))
                .amount(aValidFRAmount())
                .build();
    }
}
