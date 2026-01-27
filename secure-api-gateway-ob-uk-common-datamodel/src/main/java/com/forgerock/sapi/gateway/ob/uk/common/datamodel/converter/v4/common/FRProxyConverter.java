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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRProxy;

import uk.org.openbanking.datamodel.v4.common.OBProxy1;

public class FRProxyConverter {

    // OB to FR
    public static FRProxy toFRProxy(OBProxy1 proxy) {
        return proxy == null ? null : FRProxy.builder()
                .identification(proxy.getIdentification())
                .code(proxy.getCode())
                .type(proxy.getType())
                .build();
    }

    // FR to OB
    public static OBProxy1 toOBProxy1(FRProxy proxy) {
        return proxy == null ? null : new OBProxy1()
                .identification(proxy.getIdentification())
                .code(proxy.getCode())
                .type(proxy.getType());
    }
}
