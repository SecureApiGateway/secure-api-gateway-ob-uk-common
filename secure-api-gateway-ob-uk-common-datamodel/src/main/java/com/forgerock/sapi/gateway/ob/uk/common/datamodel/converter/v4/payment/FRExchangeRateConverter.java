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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRExchangeRateInformation;

import uk.org.openbanking.datamodel.v4.payment.OBExchangeRateType;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalConsentResponse6DataExchangeRateInformation;

public class FRExchangeRateConverter {

    // OB to FR
    public static FRExchangeRateInformation toFRExchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        return exchangeRateInformation == null ? null : FRExchangeRateInformation.builder()
                .unitCurrency(exchangeRateInformation.getUnitCurrency())
                .exchangeRate(exchangeRateInformation.getExchangeRate())
                .rateType(toFRRateType(exchangeRateInformation.getRateType()))
                .contractIdentification(exchangeRateInformation.getContractIdentification())
                .build();
    }

    public static FRExchangeRateInformation toFRExchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
        return exchangeRateInformation == null ? null : FRExchangeRateInformation.builder()
                .unitCurrency(exchangeRateInformation.getUnitCurrency())
                .exchangeRate(exchangeRateInformation.getExchangeRate())
                .rateType(toFRRateType(exchangeRateInformation.getRateType()))
                .contractIdentification(exchangeRateInformation.getContractIdentification())
                .build();
    }

    public static FRExchangeRateInformation.FRRateType toFRRateType(OBExchangeRateType rateType) {
        return rateType == null ? null : FRExchangeRateInformation.FRRateType.valueOf(rateType.name());
    }

    // FR to OB
    public static OBWriteInternational3DataInitiationExchangeRateInformation toOBWriteInternational3DataInitiationExchangeRateInformation(FRExchangeRateInformation frExchangeRateInformation) {
        return frExchangeRateInformation == null ? null : new OBWriteInternational3DataInitiationExchangeRateInformation()
                .unitCurrency(frExchangeRateInformation.getUnitCurrency())
                .exchangeRate(frExchangeRateInformation.getExchangeRate())
                .rateType(toOBRateType(frExchangeRateInformation.getRateType()))
                .contractIdentification(frExchangeRateInformation.getContractIdentification());
    }

    public static OBWriteInternationalConsentResponse6DataExchangeRateInformation toOBWriteInternationalConsentResponse6DataExchangeRateInformation(FRExchangeRateInformation exchangeRateInformation) {
        return exchangeRateInformation == null ? null : new OBWriteInternationalConsentResponse6DataExchangeRateInformation()
                .unitCurrency(exchangeRateInformation.getUnitCurrency())
                .exchangeRate(exchangeRateInformation.getExchangeRate())
                .rateType(toOBRateType(exchangeRateInformation.getRateType()))
                .contractIdentification(exchangeRateInformation.getContractIdentification())
                .expirationDateTime(exchangeRateInformation.getExpirationDateTime());
    }

    public static OBExchangeRateType toOBRateType(FRExchangeRateInformation.FRRateType rateType) {
        return rateType == null ? null : OBExchangeRateType.valueOf(rateType.name());
    }
}
