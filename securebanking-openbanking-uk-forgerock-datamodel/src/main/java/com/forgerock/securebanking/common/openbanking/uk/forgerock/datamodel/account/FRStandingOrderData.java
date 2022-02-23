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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRAccountIdentifier;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRAmount;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRFinancialAgent;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRSupplementaryData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.util.stream.Stream;

/**
 * Represents {@code OBStandingOrder6} in the OB data model. It is stored within mongo (instead of the OB object),
 * in order to make it easier to introduce new versions of the Read/Write API.
 *
 * <p>
 * Note that this object is used across multiple versions of the Read/Write API, meaning that some values won't be
 * populated. For this reason it is a mutable {@link Data} rather than an immutable {@link lombok.Value} one.
 * </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRStandingOrderData {

    private String accountId;
    private String standingOrderId;
    private String frequency;
    private String reference;
    private DateTime firstPaymentDateTime;
    private DateTime nextPaymentDateTime;
    private DateTime lastPaymentDateTime;
    private DateTime finalPaymentDateTime;
    private String numberOfPayments;
    private FRStandingOrderStatus standingOrderStatusCode;
    private FRAmount firstPaymentAmount;
    private FRAmount nextPaymentAmount;
    private FRAmount lastPaymentAmount;
    private FRAmount finalPaymentAmount;
    private FRFinancialAgent creditorAgent;
    private FRAccountIdentifier creditorAccount;
    private FRSupplementaryData supplementaryData;

    public enum FRStandingOrderStatus {
        ACTIVE("Active"),
        INACTIVE("Inactive");

        private String value;

        FRStandingOrderStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return value;
        }

        public static FRStandingOrderStatus fromValue(String value) {
            return Stream.of(values())
                    .filter(type -> type.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }
}
