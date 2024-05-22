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

import java.util.List;
import java.util.stream.Collectors;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPostalAddress;

import uk.org.openbanking.datamodel.account.OBParty2AddressInner;
import uk.org.openbanking.datamodel.common.OBAddressTypeCode;
import uk.org.openbanking.datamodel.common.OBPostalAddress6;

public class FRPostalAddressConverter {

    // OB to FR
    public static List<FRPostalAddress> toFRPostalAddressList(List<OBParty2AddressInner> addresses) {
        return addresses == null ? null : addresses.stream()
                .map(a -> toFRPostalAddress(a))
                .collect(Collectors.toList());
    }

    public static FRPostalAddress toFRPostalAddress(OBParty2AddressInner address) {
        return address == null ? null : FRPostalAddress.builder()
                .addressType(toAddressTypeCode(address.getAddressType()))
                .streetName(address.getStreetName())
                .buildingNumber(address.getBuildingNumber())
                .postCode(address.getPostCode())
                .townName(address.getTownName())
                .countrySubDivision(address.getCountrySubDivision())
                .country(address.getCountry())
                .addressLine(address.getAddressLine())
                .build();
    }

    public static FRPostalAddress toFRPostalAddress(OBPostalAddress6 address) {
        return address == null ? null : FRPostalAddress.builder()
                .addressType(toAddressTypeCode(address.getAddressType()))
                .department(address.getDepartment())
                .subDepartment(address.getSubDepartment())
                .streetName(address.getStreetName())
                .buildingNumber(address.getBuildingNumber())
                .postCode(address.getPostCode())
                .townName(address.getTownName())
                .countrySubDivision(address.getCountrySubDivision())
                .country(address.getCountry())
                .addressLine(address.getAddressLine())
                .build();
    }

    public static FRPostalAddress.AddressTypeCode toAddressTypeCode(OBAddressTypeCode addressType) {
        return addressType == null ? null : FRPostalAddress.AddressTypeCode.valueOf(addressType.name());
    }

    // FR to OB
    public static List<OBParty2AddressInner> toOBParty2AddressList(List<FRPostalAddress> addresses) {
        return addresses == null ? null : addresses.stream()
                .map(FRPostalAddressConverter::toOBParty2Address)
                .collect(Collectors.toList());
    }

    public static OBPostalAddress6 toOBPostalAddress6(FRPostalAddress address) {
        return address == null ? null : new OBPostalAddress6()
                .addressType(toOBAddressTypeCode(address.getAddressType()))
                .department(address.getDepartment())
                .subDepartment(address.getSubDepartment())
                .streetName(address.getStreetName())
                .buildingNumber(address.getBuildingNumber())
                .postCode(address.getPostCode())
                .townName(address.getTownName())
                .countrySubDivision(address.getCountrySubDivision())
                .country(address.getCountry())
                .addressLine(address.getAddressLine());
    }

    private static OBParty2AddressInner toOBParty2Address(FRPostalAddress address) {
        return address == null ? null : new OBParty2AddressInner()
                .addressType(toOBAddressTypeCode(address.getAddressType()))
                .addressLine(address.getAddressLine())
                .streetName(address.getStreetName())
                .buildingNumber(address.getBuildingNumber())
                .postCode(address.getPostCode())
                .townName(address.getTownName())
                .countrySubDivision(address.getCountrySubDivision())
                .country(address.getCountry());
    }

    public static OBAddressTypeCode toOBAddressTypeCode(FRPostalAddress.AddressTypeCode addressType) {
        return addressType == null ? null : OBAddressTypeCode.valueOf(addressType.name());
    }

    public static FRPostalAddress.AddressTypeCode toFRAddressTypeCode(OBAddressTypeCode obAddressTypeCode) {
        return obAddressTypeCode == null ? null : FRPostalAddress.AddressTypeCode.valueOf(obAddressTypeCode.name());
    }

}
