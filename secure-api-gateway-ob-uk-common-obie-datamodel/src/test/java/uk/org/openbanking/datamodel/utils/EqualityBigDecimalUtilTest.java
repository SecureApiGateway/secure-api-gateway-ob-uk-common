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
package uk.org.openbanking.datamodel.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import uk.org.openbanking.datamodel.v3.account.OBCurrencyExchange5;
import uk.org.openbanking.datamodel.v3.account.OBStatement2StatementFeeInner;
import uk.org.openbanking.datamodel.v3.account.OBStatement2StatementInterestInner;
import uk.org.openbanking.datamodel.v3.payment.OBWriteFile2DataInitiation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternational3DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalConsentResponse6DataExchangeRateInformation;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for the OB Objects where the {@link Object#equals(Object)} method has been upgraded to verify the equality of BigDecimals fields.<br/>
 * The OB Objects have been upgraded to use {@link EqualityVerificationUtil.BigDecimalUtil#isEqual(BigDecimal, BigDecimal)} to preform the equality verification<br/>
 * To identify which objects has been upgraded the equals method, search the text: "temporary fix for https://github.com/SecureApiGateway/SecureApiGateway/issues/981"
 */
public class EqualityBigDecimalUtilTest {

    private static Stream<Arguments> argumentsProviderTrue() {
        return Stream.of(
                Arguments.arguments(
                        "OBCurrencyExchange5",
                        new OBCurrencyExchange5().exchangeRate(new BigDecimal("56.012")),
                        new OBCurrencyExchange5().exchangeRate(new BigDecimal("56.01200"))
                ),
                Arguments.arguments(
                        "OBStatement2StatementFeeInner",
                        new OBStatement2StatementFeeInner().rate(new BigDecimal("57.32000")),
                        new OBStatement2StatementFeeInner().rate(new BigDecimal("57.32"))
                ),
                Arguments.arguments(
                        "OBStatement2StatementInterestInner",
                        new OBStatement2StatementInterestInner().rate(new BigDecimal("567.12000")),
                        new OBStatement2StatementInterestInner().rate(new BigDecimal("567.12"))
                ),
                Arguments.arguments(
                        "OBWriteFile2DataInitiation",
                        new OBWriteFile2DataInitiation().controlSum(new BigDecimal("60.3300000")),
                        new OBWriteFile2DataInitiation().controlSum(new BigDecimal("60.3300"))
                ),
                Arguments.arguments(
                        "OBWriteInternational3DataInitiationExchangeRateInformation",
                        new OBWriteInternational3DataInitiationExchangeRateInformation().exchangeRate(new BigDecimal("329700.230")),
                        new OBWriteInternational3DataInitiationExchangeRateInformation().exchangeRate(new BigDecimal("329700.23"))
                ),
                Arguments.arguments(
                        "OBWriteInternationalConsentResponse6DataExchangeRateInformation",
                        new OBWriteInternationalConsentResponse6DataExchangeRateInformation().exchangeRate(new BigDecimal("134.563456E-0")),
                        new OBWriteInternationalConsentResponse6DataExchangeRateInformation().exchangeRate(new BigDecimal("134.563456E-0"))
                ),
                Arguments.arguments(
                        "OBWriteInternationalConsentResponse6DataExchangeRateInformation",
                        new OBWriteInternationalConsentResponse6DataExchangeRateInformation().exchangeRate(new BigDecimal("11500000.0000")),
                        new OBWriteInternationalConsentResponse6DataExchangeRateInformation().exchangeRate(new BigDecimal("1.15E7"))
                )
        );
    }

    @ParameterizedTest(name = "OBObject {0}")
    @MethodSource("argumentsProviderTrue")
    public <T> void equalsShouldReturnTrue(String obObject, T obObjectTo, T toOBObject) {
        assertThat(obObjectTo.equals(toOBObject))
                .overridingErrorMessage(obObject + " requires equals method generated code updated to use EqualityVerificationUtil.BigDecimalUtil.isEqual method")
                .isTrue();

    }

    private static Stream<Arguments> argumentsProviderFalse() {
        return Stream.of(
                Arguments.arguments(
                        "OBCurrencyExchange5",
                        new OBCurrencyExchange5().exchangeRate(new BigDecimal("5.012")),
                        new OBCurrencyExchange5().exchangeRate(new BigDecimal("56.01200"))
                ),
                Arguments.arguments(
                        "OBStatement2StatementFeeInner",
                        new OBStatement2StatementFeeInner().rate(new BigDecimal("5.012")),
                        new OBStatement2StatementFeeInner().rate(new BigDecimal("56.01200"))
                ),
                Arguments.arguments(
                        "OBStatement2StatementInterestInner",
                        new OBStatement2StatementInterestInner().rate(new BigDecimal("567.12000")),
                        new OBStatement2StatementInterestInner().rate(new BigDecimal("56.01200"))
                ),
                Arguments.arguments(
                        "OBWriteFile2DataInitiation",
                        new OBWriteFile2DataInitiation().controlSum(new BigDecimal("6055.3300000")),
                        new OBWriteFile2DataInitiation().controlSum(new BigDecimal("60.3300"))
                ),
                Arguments.arguments(
                        "OBWriteInternational3DataInitiationExchangeRateInformation",
                        new OBWriteInternational3DataInitiationExchangeRateInformation().exchangeRate(new BigDecimal("329700.230")),
                        new OBWriteInternational3DataInitiationExchangeRateInformation().exchangeRate(new BigDecimal("3700.23"))
                ),
                Arguments.arguments(
                        "OBWriteInternationalConsentResponse6DataExchangeRateInformation",
                        new OBWriteInternationalConsentResponse6DataExchangeRateInformation().exchangeRate(new BigDecimal("134.563456E-0")),
                        new OBWriteInternationalConsentResponse6DataExchangeRateInformation().exchangeRate(new BigDecimal("134.563456E+3"))
                )
        );
    }

    @ParameterizedTest(name = "OBObject {0}")
    @MethodSource("argumentsProviderFalse")
    public <T> void equalsShouldReturnFalse(String obObject, T obObjectTo, T toOBObject) {
        assertThat(obObjectTo.equals(toOBObject)).isFalse();
    }
}
