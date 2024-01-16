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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPaymentRisk;
import uk.org.openbanking.datamodel.common.OBRisk1DeliveryAddress;

public class FRRisk1DeliveryAddressConverter {

    public static FRPaymentRisk.FRRiskDeliveryAddress toFRRiskDeliveryAddress(OBRisk1DeliveryAddress obRisk1DeliveryAddress) {
        return obRisk1DeliveryAddress == null ? null : FRPaymentRisk.FRRiskDeliveryAddress.builder()
                .addressLine(obRisk1DeliveryAddress.getAddressLine())
                .streetName(obRisk1DeliveryAddress.getStreetName())
                .buildingNumber(obRisk1DeliveryAddress.getBuildingNumber())
                .postCode(obRisk1DeliveryAddress.getPostCode())
                .townName(obRisk1DeliveryAddress.getTownName())
                .countrySubDivision(obRisk1DeliveryAddress.getCountrySubDivision())
                .country(obRisk1DeliveryAddress.getCountry())
                .build();
    }

    public static OBRisk1DeliveryAddress toOBRisk1DeliveryAddress(FRPaymentRisk.FRRiskDeliveryAddress frDeliveryAddress) {
        return frDeliveryAddress == null ? null : new OBRisk1DeliveryAddress()
                .addressLine(frDeliveryAddress.getAddressLine())
                .streetName(frDeliveryAddress.getStreetName())
                .buildingNumber(frDeliveryAddress.getBuildingNumber())
                .postCode(frDeliveryAddress.getPostCode())
                .townName(frDeliveryAddress.getTownName())
                .countrySubDivision(frDeliveryAddress.getCountrySubDivision())
                .country(frDeliveryAddress.getCountry());
    }
}
