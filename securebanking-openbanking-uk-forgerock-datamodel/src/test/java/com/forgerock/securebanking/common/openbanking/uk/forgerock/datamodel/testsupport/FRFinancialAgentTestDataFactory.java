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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRFinancialAgent;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.FRPostalAddressTestDataFactory.aValidFRPostalAddress;

/**
 * Test data factory for {@link FRFinancialAgent}.
 */
public class FRFinancialAgentTestDataFactory {

    /**
     * @return a valid instance of {@link FRFinancialAgent}.
     */
    public static FRFinancialAgent aValidFRFinancialAgent() {
        return FRFinancialAgent.builder()
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("40400411290113")
                .name("Mr M Jagger")
                .postalAddress(aValidFRPostalAddress())
                .build();
    }
}
