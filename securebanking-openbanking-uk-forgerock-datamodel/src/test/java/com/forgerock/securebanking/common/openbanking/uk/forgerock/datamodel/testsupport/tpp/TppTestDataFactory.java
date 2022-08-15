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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.tpp;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.tpp.Tpp;

import static java.util.UUID.randomUUID;

/**
 * Test data factory for a {@link Tpp}.
 */
public class TppTestDataFactory {

    public static Tpp aValidTpp() {
        return aValidTppBuilder()
                .build();
    }

    public static Tpp.TppBuilder aValidTppBuilder() {
        return Tpp.builder()
                .id(randomUUID().toString())
                .name("Another TPP")
                .officialName("Not just another TPP")
                .clientId(randomUUID().toString())
                .logoUri("https://avatars.githubusercontent.com/u/2592818?s=280&v=4");
    }
}
