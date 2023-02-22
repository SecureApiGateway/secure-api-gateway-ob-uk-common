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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRPartyData;

import java.util.List;
import java.util.UUID;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRPostalAddressTestDataFactory.aValidFRPostalAddress;

/**
 * Test data factory for {@link FRPartyData}.
 */
public class FRPartyDataTestDataFactory {

    /**
     * @return a valid instance of {@link FRPartyData}.
     */
    public static FRPartyData aValidFRPartyData() {
        return FRPartyData.builder()
                .partyId(UUID.randomUUID().toString())
                .partyNumber("1")
                .partyType(FRPartyData.FRPartyType.JOINT)
                .name("An account party")
                .fullLegalName("The party's full legal name")
                .mobile("07970712345")
                .addresses(List.of(aValidFRPostalAddress()))
                .build();
    }
}
