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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment;

import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRRegulatoryReporting {
    private FRRegulatoryReportingDebitCreditReportingIndicator debitCreditReportingIndicator;
    private FRRegulatoryAuthority authority;
    private List<FRStructuredRegulatoryReporting> details;

    public enum FRRegulatoryReportingDebitCreditReportingIndicator {

        CRED("CRED"),
        DEBT("DEBT"),
        BOTH("BOTH");

        private final String value;

        FRRegulatoryReportingDebitCreditReportingIndicator(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return value;
        }

        public static FRRegulatoryReportingDebitCreditReportingIndicator fromValue(String value) {
            return Stream.of(values())
                    .filter(code -> code.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }
}
