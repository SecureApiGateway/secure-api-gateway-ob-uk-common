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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.OBExchangeRate1;
import uk.org.openbanking.datamodel.payment.OBExchangeRateType2Code;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalConsentResponse6DataExchangeRateInformation;

public class OBExchangeRateConverter {

    public static OBExchangeRate1 toOBExchangeRate1(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        return exchangeRateInformation == null ? null : (new OBExchangeRate1())
                .unitCurrency(exchangeRateInformation.getUnitCurrency())
                .exchangeRate(exchangeRateInformation.getExchangeRate())
                .rateType(toOBExchangeRateType2Code(exchangeRateInformation.getRateType()))
                .contractIdentification(exchangeRateInformation.getContractIdentification());
    }

    public static OBWriteInternational3DataInitiationExchangeRateInformation toOBWriteInternational3DataInitiationExchangeRateInformation(OBExchangeRate1 exchangeRateInformation) {
        return exchangeRateInformation == null ? null : (new OBWriteInternational3DataInitiationExchangeRateInformation())
                .unitCurrency(exchangeRateInformation.getUnitCurrency())
                .exchangeRate(exchangeRateInformation.getExchangeRate())
                .rateType(toDataInitiationRateType(exchangeRateInformation.getRateType()))
                .contractIdentification(exchangeRateInformation.getContractIdentification());
    }

    public static OBExchangeRateType2Code toOBExchangeRateType2Code(OBWriteInternational3DataInitiationExchangeRateInformation.RateTypeEnum rateType) {
        return rateType == null ? null : OBExchangeRateType2Code.fromValue(rateType.getValue());
    }

    public static OBWriteInternationalConsentResponse6DataExchangeRateInformation.RateTypeEnum toConsentRateType(OBExchangeRateType2Code rateType2Code) {
        return rateType2Code == null ? null : OBWriteInternationalConsentResponse6DataExchangeRateInformation.RateTypeEnum.fromValue(rateType2Code.toString());
    }

    public static OBWriteInternational3DataInitiationExchangeRateInformation.RateTypeEnum toDataInitiationRateType(OBExchangeRateType2Code rateType2Code) {
        return rateType2Code == null ? null : OBWriteInternational3DataInitiationExchangeRateInformation.RateTypeEnum.fromValue(rateType2Code.toString());
    }
}
