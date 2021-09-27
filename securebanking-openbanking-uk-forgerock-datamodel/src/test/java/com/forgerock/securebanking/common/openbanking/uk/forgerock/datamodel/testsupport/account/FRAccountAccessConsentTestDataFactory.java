/**
 * Copyright © 2021 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.account;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRAccountAccessConsent;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRAccountAccessConsent.FRAccountAccessConsentBuilder;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRExternalRequestStatusCode;
import org.joda.time.DateTime;

import java.util.List;
import java.util.UUID;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRExternalPermissionsCode.*;

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
                READACCOUNTSDETAIL,
                READBENEFICIARIESDETAIL,
                READSCHEDULEDPAYMENTSDETAIL,
                READSTANDINGORDERSDETAIL,
                READSTATEMENTSDETAIL,
                READTRANSACTIONSDETAIL))
        .expirationDateTime(DateTime.now().plusDays(1))
        .transactionFromDateTime(DateTime.now().minusDays(1))
        .transactionToDateTime(DateTime.now());
    }
}
