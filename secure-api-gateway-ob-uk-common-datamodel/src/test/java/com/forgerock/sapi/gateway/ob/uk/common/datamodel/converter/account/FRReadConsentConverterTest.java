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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.account;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRReadConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.account.FRReadConsentConverter;

import uk.org.openbanking.datamodel.v3.common.OBExternalPermissions1Code;
import uk.org.openbanking.datamodel.v3.account.OBReadConsent1;
import uk.org.openbanking.datamodel.v3.account.OBReadConsent1Data;
import uk.org.openbanking.datamodel.v3.account.OBRisk2;

class FRReadConsentConverterTest {

    @Test
    void testConvert() {
        OBReadConsent1 consent1 = new OBReadConsent1().
                data(new OBReadConsent1Data()
                        .permissions(List.of(OBExternalPermissions1Code.READACCOUNTSBASIC,
                                             OBExternalPermissions1Code.READBALANCES))
                        .expirationDateTime(DateTime.now().plusDays(30))
                        .transactionToDateTime(DateTime.now())
                        .transactionFromDateTime(DateTime.now().minusDays(90)))
                .risk(new OBRisk2());

        final FRReadConsent frConsent = FRReadConsentConverter.toFRReadConsent(consent1);
        Assertions.assertThat(FRReadConsentConverter.toOBReadConsent1(frConsent)).isEqualTo(consent1);
    }
}