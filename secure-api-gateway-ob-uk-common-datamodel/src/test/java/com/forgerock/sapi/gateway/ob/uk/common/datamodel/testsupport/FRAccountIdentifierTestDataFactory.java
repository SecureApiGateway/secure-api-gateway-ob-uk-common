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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;

/**
 * Test data factory for {@link FRAccountIdentifier}.
 */
public class FRAccountIdentifierTestDataFactory {

    public static FRAccountIdentifier aValidFRAccountIdentifier() {
        return aValidFRAccountIdentifierBuilder().build();
    }

    public static FRAccountIdentifier aValidFRAccountIdentifier2() {
        return FRAccountIdentifier.builder()
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("40400422390112")
                .name("Mrs B Smith")
                .build();
    }

    public static FRAccountIdentifier.FRAccountIdentifierBuilder aValidFRAccountIdentifierBuilder() {
        return FRAccountIdentifier.builder()
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("40400411290112")
                .name("Mr A Jones");
    }
}
