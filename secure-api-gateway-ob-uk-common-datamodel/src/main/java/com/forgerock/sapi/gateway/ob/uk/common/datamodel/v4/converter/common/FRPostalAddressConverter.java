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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRPostalAddress;
import uk.org.openbanking.datamodel.v3.account.OBParty2AddressInner;
import uk.org.openbanking.datamodel.v3.common.OBAddressTypeCode;
import uk.org.openbanking.datamodel.v3.common.OBPostalAddress6;
import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class FRPostalAddressConverter {

    /**
     * Contains mappings of {@link OBAddressTypeCode} to {@link OBAddressType2Code} String values.
     * This collection can also be used to determine if a value is a v3 value by testing if matching key exists.
     */
    private static final Map<String, String> v3tov4AddressType;
    /**
     * Contains mappings of {@link OBAddressType2Code} to {@link OBAddressTypeCode} String values.
     * This collection can also be used to determine if a value is a v4 value by testing if matching key exists.
     */
    private static final Map<String, String> v4tov3AddressType;

    static {
        final Map<String, String> addressTypeTranslations = new HashMap<>();
        addressTypeTranslations.put("BUSINESS", "BIZZ");
        addressTypeTranslations.put("CORRESPONDENCE", "CORR");
        addressTypeTranslations.put("DELIVERYTO", "DLVY");
        addressTypeTranslations.put("MAILTO", "MLTO");
        addressTypeTranslations.put("POBOX", "PBOX");
        addressTypeTranslations.put("POSTAL", "ADDR");
        addressTypeTranslations.put("RESIDENTIAL", "HOME");
        addressTypeTranslations.put("STATEMENT", "STAT");

        v3tov4AddressType = Collections.unmodifiableMap(addressTypeTranslations);
        // v4 is the inverse of the v3 mappings
        v4tov3AddressType = addressTypeTranslations.entrySet().stream().collect(toMap(Entry::getValue, Entry::getKey));
    }

    // OB to FR
    public static List<FRPostalAddress> toFRPostalAddressList(List<OBParty2AddressInner> addresses) {
        return addresses == null ? null : addresses.stream()
                .map(FRPostalAddressConverter::toFRPostalAddress)
                .collect(Collectors.toList());
    }

    public static FRPostalAddress toFRPostalAddress(OBParty2AddressInner address) {
        return address == null ? null : FRPostalAddress.builder()
                .addressType(toAddressType(address.getAddressType()))
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
                .addressType(toAddressType(address.getAddressType()))
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

    public static FRPostalAddress toFRPostalAddress(OBPostalAddress7 address) {
        return address == null ? null : FRPostalAddress.builder()
                .addressType(toAddressType(address.getAddressType()))
                .department(address.getDepartment())
                .subDepartment(address.getSubDepartment())
                .streetName(address.getStreetName())
                .buildingNumber(address.getBuildingNumber())
                .postCode(address.getPostCode())
                .townName(address.getTownName())
                .countrySubDivision(address.getCountrySubDivision())
                .country(address.getCountry())
                .addressLine(address.getAddressLine())
                .buildingName(address.getBuildingName())
                .floor(address.getFloor())
                .unitNumber(address.getUnitNumber())
                .room(address.getRoom())
                .postBox(address.getPostBox())
                .townLocationName(address.getTownLocationName())
                .districtName(address.getDistrictName())
                .careOf(address.getCareOf())
                .build();
    }

    public static String toAddressType(OBAddressTypeCode addressType) {
        return addressType == null ? null : addressType.name();
    }

    public static String toAddressType(OBAddressType2Code addressType) {
        return addressType == null ? null : addressType.name();
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

    public static OBPostalAddress7 toOBPostalAddress7(FRPostalAddress address) {
        return address == null ? null : new OBPostalAddress7()
                .addressType(toOBAddressType2Code(address.getAddressType()))
                .department(address.getDepartment())
                .subDepartment(address.getSubDepartment())
                .streetName(address.getStreetName())
                .buildingNumber(address.getBuildingNumber())
                .postCode(address.getPostCode())
                .townName(address.getTownName())
                .countrySubDivision(address.getCountrySubDivision())
                .country(address.getCountry())
                .addressLine(address.getAddressLine())
                .buildingName(address.getBuildingName())
                .floor(address.getFloor())
                .unitNumber(address.getUnitNumber())
                .room(address.getRoom())
                .postBox(address.getPostBox())
                .townLocationName(address.getTownLocationName())
                .districtName(address.getDistrictName())
                .careOf(address.getCareOf());
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

    public static OBAddressTypeCode toOBAddressTypeCode(String addressType) {
        if (addressType == null) {
            return null;
        }
        if (v3tov4AddressType.containsKey(addressType)) {
            return OBAddressTypeCode.valueOf(addressType);
        } else if (v4tov3AddressType.containsKey(addressType)) {
            return OBAddressTypeCode.valueOf(v4tov3AddressType.get(addressType));
        }
        throw new IllegalArgumentException("Unknown address type: " + addressType);
    }

    public static OBAddressType2Code toOBAddressType2Code(String addressType) {
        if (addressType == null) {
            return null;
        }
        if (v4tov3AddressType.containsKey(addressType)) {
            return OBAddressType2Code.fromValue(addressType);
        } else if (v3tov4AddressType.containsKey(addressType)) {
            return OBAddressType2Code.fromValue(v3tov4AddressType.get(addressType));
        }
        throw new IllegalArgumentException("Unknown address type: " + addressType);
    }

}
