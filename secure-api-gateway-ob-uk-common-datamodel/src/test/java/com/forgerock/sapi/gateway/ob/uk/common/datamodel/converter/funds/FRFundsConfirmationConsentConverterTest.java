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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.funds;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.funds.FRFundsConfirmationConsent;
import org.assertj.core.api.Assertions;
import org.joda.time.DateTime;


import org.junit.jupiter.api.Test;
import uk.org.openbanking.datamodel.common.OBCashAccount3;
import uk.org.openbanking.datamodel.fund.OBFundsConfirmationConsent1;
import uk.org.openbanking.datamodel.fund.OBFundsConfirmationConsentData1;

/**
 * Unit test for {@link FRFundsConfirmationConsentConverter}
 */
public class FRFundsConfirmationConsentConverterTest {

    @Test
    void testConvert() {
        OBFundsConfirmationConsent1 fundsConfirmationConsent1 = new OBFundsConfirmationConsent1()
                .data(new OBFundsConfirmationConsentData1()
                        .debtorAccount(new OBCashAccount3()
                                .schemeName("UK.OBIE.SortCodeAccountNumber")
                                .identification("40400422390112")
                                .name("Mrs B Smith")
                        )
                        .expirationDateTime(DateTime.now().plusDays(30))
                );
        final FRFundsConfirmationConsent frFundsConfirmationConsent = FRFundsConfirmationConsentConverter.toFRFundsConfirmationConsent(fundsConfirmationConsent1);
        Assertions.assertThat(FRFundsConfirmationConsentConverter.toOBFundsConfirmationConsent1(frFundsConfirmationConsent));
    }
}