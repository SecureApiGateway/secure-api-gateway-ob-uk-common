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

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditLine.FRLimitType;

import uk.org.openbanking.datamodel.v4.account.OBReadBalance1DataBalanceInnerCreditLineInnerType;

class FRCashBalanceConverterTest {

    static Stream<Arguments> frLimitTypeToOBCreditLineTypeMappings() {
        return Stream.of(
                Arguments.of(FRLimitType.AVAILABLE,  OBReadBalance1DataBalanceInnerCreditLineInnerType.AVAILABLE),
                Arguments.of(FRLimitType.CREDIT,     OBReadBalance1DataBalanceInnerCreditLineInnerType.CREDIT),
                Arguments.of(FRLimitType.EMERGENCY,  OBReadBalance1DataBalanceInnerCreditLineInnerType.EMERGENCY),
                Arguments.of(FRLimitType.PRE_AGREED, OBReadBalance1DataBalanceInnerCreditLineInnerType.PRE_AGREED),
                Arguments.of(FRLimitType.TEMPORARY,  OBReadBalance1DataBalanceInnerCreditLineInnerType.TEMPORARY)
        );
    }

    static Stream<Arguments> obCreditLineTypeToFRLimitTypeMappings() {
        return Stream.of(
                Arguments.of(OBReadBalance1DataBalanceInnerCreditLineInnerType.AVAILABLE,  FRLimitType.AVAILABLE),
                Arguments.of(OBReadBalance1DataBalanceInnerCreditLineInnerType.CREDIT,     FRLimitType.CREDIT),
                Arguments.of(OBReadBalance1DataBalanceInnerCreditLineInnerType.EMERGENCY,  FRLimitType.EMERGENCY),
                Arguments.of(OBReadBalance1DataBalanceInnerCreditLineInnerType.PRE_AGREED, FRLimitType.PRE_AGREED),
                Arguments.of(OBReadBalance1DataBalanceInnerCreditLineInnerType.TEMPORARY,  FRLimitType.TEMPORARY)
        );
    }

    @ParameterizedTest
    @MethodSource("frLimitTypeToOBCreditLineTypeMappings")
    void toOBReadBalance1DataCreditLineType_mapsAllFRLimitTypesToExpectedOBType(FRLimitType frLimitType,
                                                                                OBReadBalance1DataBalanceInnerCreditLineInnerType expectedType) {
        assertThat(FRCashBalanceConverter.toOBReadBalance1DataCreditLineType(frLimitType)).isEqualTo(expectedType);
    }

    @ParameterizedTest
    @MethodSource("obCreditLineTypeToFRLimitTypeMappings")
    void toFRLimitType_mapsAllOBCreditLineTypesToExpectedFRLimitType(OBReadBalance1DataBalanceInnerCreditLineInnerType obType,
                                                                      FRLimitType expectedFRLimitType) {
        assertThat(FRCashBalanceConverter.toFRLimitType(obType)).isEqualTo(expectedFRLimitType);
    }

    @Test
    void toOBReadBalance1DataCreditLineType_returnsNullForNullInput() {
        assertNull(FRCashBalanceConverter.toOBReadBalance1DataCreditLineType(null));
    }

    @Test
    void toFRLimitType_returnsNullForNullInput() {
        assertNull(FRCashBalanceConverter.toFRLimitType(null));
    }
}