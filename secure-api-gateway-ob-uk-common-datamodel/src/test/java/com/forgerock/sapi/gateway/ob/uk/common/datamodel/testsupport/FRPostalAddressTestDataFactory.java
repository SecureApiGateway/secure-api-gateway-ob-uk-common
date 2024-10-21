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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport;

import java.util.List;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.common.FRPostalAddress;

import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBAddressTypeCode;

/**
 * Test data factory for {@link FRPostalAddress}.
 */
public class FRPostalAddressTestDataFactory {

    /**
     * @return a valid instance of {@link FRPostalAddress}.
     */
    public static FRPostalAddress aValidFRPostalAddress() {
        return FRPostalAddress.builder()
                .addressType(OBAddressTypeCode.RESIDENTIAL.name())
                .buildingNumber("21")
                .streetName("Jagger Road")
                .townName("Stroud")
                .postCode("GL5 3AA")
                .countrySubDivision("Gloucestershire")
                .country("UK")
                .build();
    }

    public static FRPostalAddress aValidFRPostalAddress7() {
        return FRPostalAddress.builder()
                .addressType(OBAddressType2Code.HOME.name())
                .buildingNumber("21")
                .streetName("Jagger Road")
                .townName("Stroud")
                .postCode("GL5 3AA")
                .countrySubDivision("Gloucestershire")
                .country("UK")
                .room("1")
                .careOf("Dave")
                .floor("Ground")
                .districtName("Somewhere")
                .townLocationName("Outskirts")
                .postBox("POBOX123")
                .unitNumber("42")
                .buildingName("The Lodge")
                .addressLine(List.of("Extra Address Line1", "Extra Address Line2"))
                .build();
    }
}
