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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRReadConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;

import uk.org.openbanking.datamodel.v3.account.OBReadConsent1;

public class FRReadConsentConverter {

    public static FRReadConsent toFRReadConsent(OBReadConsent1 obConsent) {
        return FRModelMapper.map(obConsent, FRReadConsent.class);
    }

    public static OBReadConsent1 toOBReadConsent1(FRReadConsent frConsent) {
        return FRModelMapper.map(frConsent, OBReadConsent1.class);
    }

}
