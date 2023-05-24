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
package uk.org.openbanking.datamodel.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.*;

/**
 * Unit test for {@link EqualityVerificationUtil}
 */
public class EqualityVerificationUtilTest {

    private static Stream<Arguments> argumentsProviderTrue() {
        return Stream.of(
                Arguments.arguments(
                        null,
                        null
                ),
                Arguments.arguments(
                        new BigDecimal("13.0000"),
                        new BigDecimal("13.000")
                ),
                Arguments.arguments(
                        new BigDecimal("13.0"),
                        new BigDecimal("13.000")
                ),
                Arguments.arguments(
                        new BigDecimal("13"),
                        new BigDecimal("13.0")
                ),
                Arguments.arguments(
                        new BigDecimal("234.56789"),
                        new BigDecimal("234.5678900000")
                ),
                Arguments.arguments(
                        new BigDecimal("234.000000"),
                        new BigDecimal("234")
                ),
                Arguments.arguments(
                        new BigDecimal("234000000000.000000"),
                        new BigDecimal("234000000000")
                )
        );
    }

    @ParameterizedTest(name = "{0} compare to {1}")
    @MethodSource("argumentsProviderTrue")
    public void shouldReturnTrue(BigDecimal compareTo, BigDecimal toCompare) {
        assertThat(BigDecimalUtil.isEqual(compareTo, toCompare)).isTrue();
    }

    private static Stream<Arguments> argumentsProviderFalse() {
        return Stream.of(
                Arguments.arguments(
                        null,
                        new BigDecimal("13")
                ), Arguments.arguments(
                        new BigDecimal("13"),
                        null
                ),
                Arguments.arguments(
                        new BigDecimal("13.1"),
                        new BigDecimal("13.000000")
                ),
                Arguments.arguments(
                        new BigDecimal("13.100"),
                        new BigDecimal("13.000")
                ),
                Arguments.arguments(
                        new BigDecimal("1"),
                        new BigDecimal("0")
                ),
                Arguments.arguments(
                        new BigDecimal("1234"),
                        new BigDecimal("1234.10000")
                ),
                Arguments.arguments(
                        new BigDecimal("234000000000.000000"),
                        new BigDecimal("234000000000.100000")
                )
        );
    }

    @ParameterizedTest(name = "{0} compare to {1}")
    @MethodSource("argumentsProviderFalse")
    public void shouldReturnFalse(BigDecimal compareTo, BigDecimal toCompare) {
        assertThat(BigDecimalUtil.isEqual(compareTo, toCompare)).isFalse();
    }
}
