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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toAddressType;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBAddressType2Code;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBAddressTypeCode;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBPostalAddress6;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBPostalAddress7;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPostalAddress;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRPostalAddressTestDataFactory;

import uk.org.openbanking.datamodel.v3.common.OBAddressTypeCode;
import uk.org.openbanking.datamodel.v3.common.OBPostalAddress6;
import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

class FRPostalAddressConverterTest {

    @Test
    public void testConvertingOBPostalAddress6() {
        final FRPostalAddress frPostalAddress = FRPostalAddressTestDataFactory.aValidFRPostalAddress();
        final OBPostalAddress6 obPostalAddress6 = toOBPostalAddress6(frPostalAddress);
        assertEquals(frPostalAddress, FRPostalAddressConverter.toFRPostalAddress(obPostalAddress6));
    }

    @Test
    public void testConvertingOBPostalAddress7() {
        final FRPostalAddress frPostalAddress = FRPostalAddressTestDataFactory.aValidFRPostalAddress7();
        final OBPostalAddress7 obPostalAddress6 = toOBPostalAddress7(frPostalAddress);
        assertEquals(frPostalAddress, FRPostalAddressConverter.toFRPostalAddress(obPostalAddress6));
    }

    @Test
    public void testAddressTypeTranslations() {
        // Verify converting from v3 to v4
        for (OBAddressTypeCode obAddressTypeCode : OBAddressTypeCode.values()) {
            final String addressType = toAddressType(obAddressTypeCode);
            final OBAddressType2Code addressType2Code = toOBAddressType2Code(addressType);
            assertEquals(obAddressTypeCode, toOBAddressTypeCode(toAddressType(addressType2Code)));
        }
        // Verify converting v4 to v3
        for (OBAddressType2Code obAddressType2Code : OBAddressType2Code.values()) {
            final String addressType = toAddressType(obAddressType2Code);
            final OBAddressTypeCode addressTypeCode = toOBAddressTypeCode(addressType);
            assertEquals(obAddressType2Code, toOBAddressType2Code(toAddressType(addressTypeCode)));
        }
    }

}