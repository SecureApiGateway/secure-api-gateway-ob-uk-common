/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPaymentRisk;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPaymentRisk.FRRiskDeliveryAddress;

import uk.org.openbanking.datamodel.v3.common.OBRisk1DeliveryAddress;
import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

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

    public static FRRiskDeliveryAddress toFRRiskDeliveryAddress(OBPostalAddress7 deliveryAddress) {
        return deliveryAddress == null ? null : FRRiskDeliveryAddress.builder()
                .addressLine(deliveryAddress.getAddressLine())
                .streetName(deliveryAddress.getStreetName())
                .buildingNumber(deliveryAddress.getBuildingNumber())
                .postCode(deliveryAddress.getPostCode())
                .townName(deliveryAddress.getTownName())
                .countrySubDivision(deliveryAddress.getCountrySubDivision())
                .country(deliveryAddress.getCountry())
                .addressType(String.valueOf(deliveryAddress.getAddressType()))
                .department(deliveryAddress.getDepartment())
                .subDepartment(deliveryAddress.getSubDepartment())
                .buildingName(deliveryAddress.getBuildingName())
                .floor(deliveryAddress.getFloor())
                .unitNumber(deliveryAddress.getUnitNumber())
                .room(deliveryAddress.getRoom())
                .postBox(deliveryAddress.getPostBox())
                .townLocationName(deliveryAddress.getTownLocationName())
                .districtName(deliveryAddress.getDistrictName())
                .careOf(deliveryAddress.getCareOf())
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

    public static OBPostalAddress7 toOBPostalAddress7(FRRiskDeliveryAddress deliveryAddress) {
        return deliveryAddress == null ? null : new OBPostalAddress7()
                .addressLine(deliveryAddress.getAddressLine())
                .streetName(deliveryAddress.getStreetName())
                .buildingNumber(deliveryAddress.getBuildingNumber())
                .postCode(deliveryAddress.getPostCode())
                .townName(deliveryAddress.getTownName())
                .countrySubDivision(deliveryAddress.getCountrySubDivision())
                .country(deliveryAddress.getCountry())
                .addressType(OBAddressType2Code.valueOf(deliveryAddress.getAddressType()))
                .department(deliveryAddress.getDepartment())
                .subDepartment(deliveryAddress.getSubDepartment())
                .buildingName(deliveryAddress.getBuildingName())
                .floor(deliveryAddress.getFloor())
                .unitNumber(deliveryAddress.getUnitNumber())
                .room(deliveryAddress.getRoom())
                .postBox(deliveryAddress.getPostBox())
                .townLocationName(deliveryAddress.getTownLocationName())
                .districtName(deliveryAddress.getDistrictName())
                .careOf(deliveryAddress.getCareOf());
    }
}
