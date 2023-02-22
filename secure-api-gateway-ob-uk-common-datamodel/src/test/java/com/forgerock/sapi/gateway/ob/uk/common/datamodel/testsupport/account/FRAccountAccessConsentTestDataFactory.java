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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountAccessConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountAccessConsent.FRAccountAccessConsentBuilder;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRExternalPermissionsCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRExternalRequestStatusCode;
import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

/**
 * Test data factory for {@link FRAccountAccessConsent}.
 */
public class FRAccountAccessConsentTestDataFactory {

    public static FRAccountAccessConsent aValidFRAccountAccessConsent() {
        return aValidFRAccountAccessConsentBuilder().build();
    }

    public static FRAccountAccessConsentBuilder aValidFRAccountAccessConsentBuilder() {
        return FRAccountAccessConsent.builder()
        .id(UUID.randomUUID().toString())
        .clientId(UUID.randomUUID().toString())
        .userId(UUID.randomUUID().toString())
        .aispId(UUID.randomUUID().toString())
        .aispName("AISP Name")
        .status(FRExternalRequestStatusCode.AWAITINGAUTHORISATION)
        .accountIds(List.of(UUID.randomUUID().toString()))
        .permissions(List.of(
                FRExternalPermissionsCode.READACCOUNTSDETAIL,
                FRExternalPermissionsCode.READBENEFICIARIESDETAIL,
                FRExternalPermissionsCode.READSCHEDULEDPAYMENTSDETAIL,
                FRExternalPermissionsCode.READSTANDINGORDERSDETAIL,
                FRExternalPermissionsCode.READSTATEMENTSDETAIL,
                FRExternalPermissionsCode.READTRANSACTIONSDETAIL))
        .expirationDateTime(DateTime.now().plusDays(1))
        .transactionFromDateTime(DateTime.now().minusDays(1))
        .transactionToDateTime(DateTime.now());
    }
}
