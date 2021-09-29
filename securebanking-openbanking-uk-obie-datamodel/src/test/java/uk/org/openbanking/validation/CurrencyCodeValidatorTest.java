/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.validation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for {@link CurrencyCodeValidator}.
 */
public class CurrencyCodeValidatorTest {

    private final CurrencyCodeValidator currencyCodeValidator = new CurrencyCodeValidator();

    @Test
    public void isValid() {
        assertThat(currencyCodeValidator.isValid("GBP", null)).isTrue();
        assertThat(currencyCodeValidator.isValid("EUR", null)).isTrue();
        assertThat(currencyCodeValidator.isValid("USD", null)).isTrue();
        assertThat(currencyCodeValidator.isValid("TRY", null)).isTrue();
        assertThat(currencyCodeValidator.isValid("XTS", null)).isTrue();

        assertThat(currencyCodeValidator.isValid("", null)).isFalse();
        assertThat(currencyCodeValidator.isValid(null, null)).isFalse();
        assertThat(currencyCodeValidator.isValid("A", null)).isFalse();
        assertThat(currencyCodeValidator.isValid("AB", null)).isFalse();
        assertThat(currencyCodeValidator.isValid("NCC", null)).isFalse();
        assertThat(currencyCodeValidator.isValid("ABCD", null)).isFalse();
        assertThat(currencyCodeValidator.isValid("1234", null)).isFalse();
    }
}