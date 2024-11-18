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
package uk.org.openbanking.testsupport.v4.payment;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v4.payment.OBExchangeRateType;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalConsentResponse6DataExchangeRateInformation;

public class OBExchangeRateTestDataFactory {

    private static final String CURRENCY = "USD";
    private static final String CONTRACT_IDENTIFICATION = "/tbill/2018/T102993";

    public static OBWriteInternational3DataInitiationExchangeRateInformation aValidOBWriteInternational3DataInitiationExchangeRateInformation() {
        return (new OBWriteInternational3DataInitiationExchangeRateInformation())
                .unitCurrency(CURRENCY)
                .exchangeRate(BigDecimal.TEN.setScale(4, RoundingMode.HALF_EVEN))
                .rateType(OBExchangeRateType.AGREED)
                .contractIdentification(CONTRACT_IDENTIFICATION);
    }

    public static OBWriteInternationalConsentResponse6DataExchangeRateInformation aValidOBWriteInternationalConsentResponse6DataExchangeRateInformation() {
        return (new OBWriteInternationalConsentResponse6DataExchangeRateInformation())
                .unitCurrency(CURRENCY)
                .exchangeRate(BigDecimal.TEN.setScale(4, RoundingMode.HALF_EVEN))
                .rateType(OBExchangeRateType.AGREED)
                .contractIdentification(CONTRACT_IDENTIFICATION)
                .expirationDateTime(DateTime.now().plusDays(1));
    }
}
