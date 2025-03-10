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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRChargeBearerType;

import uk.org.openbanking.datamodel.v3.common.OBChargeBearerType1Code;

public class FRChargeBearerConverter {

    public static FRChargeBearerType toFRChargeBearerType(OBChargeBearerType1Code obChargeBearerType1Code) {
        return obChargeBearerType1Code == null? null : FRChargeBearerType.valueOf(obChargeBearerType1Code.name());
    }

    public static OBChargeBearerType1Code toOBChargeBearerType1Code(FRChargeBearerType frChargeBearerType) {
        return frChargeBearerType == null? null : OBChargeBearerType1Code.valueOf(frChargeBearerType.name());
    }
}
