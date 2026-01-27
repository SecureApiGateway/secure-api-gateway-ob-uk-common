/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStandingOrderFrequency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;

import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRMandateRelatedInformation {

    private String mandateIdentification;
    private FRExternalMandateClassificationCode classification;
    private ExternalCategoryPurpose1Code categoryPurposeCode;
    private DateTime firstPaymentDateTime;
    private DateTime recurringPaymentDateTime;
    private DateTime finalPaymentDateTime;
    private FRStandingOrderFrequency frequency;
    private String reason;

    public enum FRExternalMandateClassificationCode {

        FIXE("FIXE"),
        USGB("USGB"),
        VARI("VARI");

        private final String value;

        FRExternalMandateClassificationCode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return value;
        }

        public static FRExternalMandateClassificationCode fromValue(String value) {
            return Stream.of(values())
                    .filter(code -> code.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }
}
