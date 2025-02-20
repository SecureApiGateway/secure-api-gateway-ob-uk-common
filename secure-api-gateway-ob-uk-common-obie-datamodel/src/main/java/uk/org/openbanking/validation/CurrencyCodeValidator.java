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
package uk.org.openbanking.validation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Currency;

public class CurrencyCodeValidator implements ConstraintValidator<ValidISOCurrencyCode, String> {
    @Override
    public void initialize(ValidISOCurrencyCode validISOCurrencyCode) {
    }

    @Override
    public boolean isValid(String currencyCode, ConstraintValidatorContext constraintValidatorContext) {
        if (currencyCode == null) {
            return false;
        }
        try {
            Currency.getInstance(currencyCode);
        } catch(IllegalArgumentException e) {
            return false;
        }
        return true;
    }

}
