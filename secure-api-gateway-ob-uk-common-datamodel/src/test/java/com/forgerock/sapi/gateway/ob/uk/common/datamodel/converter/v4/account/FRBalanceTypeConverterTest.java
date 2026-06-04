/*
 * Copyright © 2020-2026 Ping Identity Corporation (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRBalanceType;

import uk.org.openbanking.datamodel.v4.account.OBBalanceType1Code;

class FRBalanceTypeConverterTest {

    static Stream<Arguments> frBalanceTypeToOBBalanceType1CodeMappings() {
        return Stream.of(
                Arguments.of(FRBalanceType.CLOSINGAVAILABLE,      OBBalanceType1Code.CLAV),
                Arguments.of(FRBalanceType.CLOSINGBOOKED,         OBBalanceType1Code.CLBD),
                Arguments.of(FRBalanceType.CLOSINGCLEARED,        OBBalanceType1Code.CLCL),
                Arguments.of(FRBalanceType.EXPECTED,              OBBalanceType1Code.XPCD),
                Arguments.of(FRBalanceType.FORWARDAVAILABLE,      OBBalanceType1Code.FWAV),
                Arguments.of(FRBalanceType.INFORMATION,           OBBalanceType1Code.INFO),
                Arguments.of(FRBalanceType.INTERIMAVAILABLE,      OBBalanceType1Code.ITAV),
                Arguments.of(FRBalanceType.INTERIMBOOKED,         OBBalanceType1Code.ITBD),
                Arguments.of(FRBalanceType.INTERIMCLEARED,        OBBalanceType1Code.ITCL),
                Arguments.of(FRBalanceType.OPENINGAVAILABLE,      OBBalanceType1Code.OPAV),
                Arguments.of(FRBalanceType.OPENINGBOOKED,         OBBalanceType1Code.OPBD),
                Arguments.of(FRBalanceType.OPENINGCLEARED,        OBBalanceType1Code.OPCL),
                Arguments.of(FRBalanceType.PREVIOUSLYCLOSEDBOOKED, OBBalanceType1Code.PRCD)
        );
    }

    static Stream<Arguments> longFormToOBBalanceType1CodeMappings() {
        return Stream.of(
                Arguments.of("ClosingAvailable",       OBBalanceType1Code.CLAV),
                Arguments.of("ClosingBooked",          OBBalanceType1Code.CLBD),
                Arguments.of("ClosingCleared",         OBBalanceType1Code.CLCL),
                Arguments.of("Expected",               OBBalanceType1Code.XPCD),
                Arguments.of("ForwardAvailable",       OBBalanceType1Code.FWAV),
                Arguments.of("Information",            OBBalanceType1Code.INFO),
                Arguments.of("InterimAvailable",       OBBalanceType1Code.ITAV),
                Arguments.of("InterimBooked",          OBBalanceType1Code.ITBD),
                Arguments.of("InterimCleared",         OBBalanceType1Code.ITCL),
                Arguments.of("OpeningAvailable",       OBBalanceType1Code.OPAV),
                Arguments.of("OpeningBooked",          OBBalanceType1Code.OPBD),
                Arguments.of("OpeningCleared",         OBBalanceType1Code.OPCL),
                Arguments.of("PreviouslyClosedBooked", OBBalanceType1Code.PRCD)
        );
    }

    static Stream<Arguments> shortCodeToFRBalanceTypeMappings() {
        return Stream.of(
                Arguments.of("CLAV", FRBalanceType.CLOSINGAVAILABLE.getValue()),
                Arguments.of("CLBD", FRBalanceType.CLOSINGBOOKED.getValue()),
                Arguments.of("CLCL", FRBalanceType.CLOSINGCLEARED.getValue()),
                Arguments.of("XPCD", FRBalanceType.EXPECTED.getValue()),
                Arguments.of("FWAV", FRBalanceType.FORWARDAVAILABLE.getValue()),
                Arguments.of("INFO", FRBalanceType.INFORMATION.getValue()),
                Arguments.of("ITAV", FRBalanceType.INTERIMAVAILABLE.getValue()),
                Arguments.of("ITBD", FRBalanceType.INTERIMBOOKED.getValue()),
                Arguments.of("ITCL", FRBalanceType.INTERIMCLEARED.getValue()),
                Arguments.of("OPAV", FRBalanceType.OPENINGAVAILABLE.getValue()),
                Arguments.of("OPBD", FRBalanceType.OPENINGBOOKED.getValue()),
                Arguments.of("OPCL", FRBalanceType.OPENINGCLEARED.getValue()),
                Arguments.of("PRCD", FRBalanceType.PREVIOUSLYCLOSEDBOOKED.getValue())
        );
    }

    @ParameterizedTest
    @MethodSource("frBalanceTypeToOBBalanceType1CodeMappings")
    void toOBBalanceType1Code_mapsAllFRBalanceTypesToExpectedCode(FRBalanceType frBalanceType,
                                                                   OBBalanceType1Code expectedCode) {
        assertThat(FRBalanceTypeConverter.toOBBalanceType1Code(frBalanceType)).isEqualTo(expectedCode);
    }

    @ParameterizedTest
    @MethodSource("longFormToOBBalanceType1CodeMappings")
    void toOBBalanceType1CodeV4_mapsAllLongFormStringsToExpectedCode(String longForm,
                                                                      OBBalanceType1Code expectedCode) {
        assertThat(FRBalanceTypeConverter.toOBBalanceType1CodeV4(longForm)).isEqualTo(expectedCode);
    }

    @ParameterizedTest
    @MethodSource("shortCodeToFRBalanceTypeMappings")
    void toFRBalanceTypeV3_mapsAllShortCodesToExpectedLongForm(String shortCode, String expectedLongForm) {
        assertThat(FRBalanceTypeConverter.toFRBalanceTypeV3(shortCode).getValue()).isEqualTo(expectedLongForm);
    }

    @Test
    void toOBBalanceType1Code_returnsNullForNullInput() {
        assertNull(FRBalanceTypeConverter.toOBBalanceType1Code(null));
    }

    @Test
    void toOBBalanceType1CodeV4_throwsIllegalArgumentExceptionForUnknownValue() {
        assertThrows(IllegalArgumentException.class,
                () -> FRBalanceTypeConverter.toOBBalanceType1CodeV4("UnknownBalanceType"));
    }

    @Test
    void toFRBalanceTypeV3_throwsIllegalArgumentExceptionForUnknownValue() {
        assertThrows(IllegalArgumentException.class,
                () -> FRBalanceTypeConverter.toFRBalanceTypeV3("XXXX"));
    }
}