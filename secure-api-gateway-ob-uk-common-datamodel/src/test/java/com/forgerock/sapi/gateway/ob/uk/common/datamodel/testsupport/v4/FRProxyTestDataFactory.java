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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRProxy;
import uk.org.openbanking.datamodel.v4.common.ExternalProxyAccountType1Code;

/**
 * Test data factory for {@link FRProxy}.
 */
public class FRProxyTestDataFactory {

    /**
     * @return a valid instance of {@link FRProxy}.
     */
    public static FRProxy aValidFRProxy() {
        return FRProxy.builder()
                .code(ExternalProxyAccountType1Code.valueOf("TELE"))
                .identification("2360549017905188")
                .type("TELE")
                .build();
    }

}
