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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.funds;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.funds.FRFundsConfirmationConsent;

import uk.org.openbanking.datamodel.v3.fund.OBFundsConfirmationConsent1;
import uk.org.openbanking.datamodel.v3.fund.OBFundsConfirmationConsent1Data;
import uk.org.openbanking.datamodel.v3.fund.OBFundsConfirmationConsent1DataDebtorAccount;

/**
 * Unit test for {@link FRFundsConfirmationConsentConverter}
 */
public class FRFundsConfirmationConsentConverterTest {

    @Test
    void testConvert() {
        OBFundsConfirmationConsent1 fundsConfirmationConsent1 = new OBFundsConfirmationConsent1()
                .data(new OBFundsConfirmationConsent1Data()
                        .debtorAccount(new OBFundsConfirmationConsent1DataDebtorAccount()
                                .schemeName("UK.OBIE.SortCodeAccountNumber")
                                .identification("40400422390112")
                                .name("Mrs B Smith")
                        )
                );
        final FRFundsConfirmationConsent frFundsConfirmationConsent = FRFundsConfirmationConsentConverter.toFRFundsConfirmationConsent(fundsConfirmationConsent1);
        Assertions.assertThat(FRFundsConfirmationConsentConverter.toOBFundsConfirmationConsent1(frFundsConfirmationConsent)).isEqualTo(fundsConfirmationConsent1);
    }
}
