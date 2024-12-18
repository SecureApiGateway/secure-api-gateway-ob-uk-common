/*
 * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStatusReason;

import uk.org.openbanking.datamodel.v4.common.OBStatusReason;

public class FRStatusReasonConverter {

    public static FRStatusReason toFRStatusReason(OBStatusReason statusReason) {
        return statusReason == null ? null : FRStatusReason.builder()
                .statusReasonCode(statusReason.getStatusReasonCode())
                .statusReasonDescription(statusReason.getStatusReasonDescription())
                .path(statusReason.getPath())
                .build();
    }

    public static OBStatusReason toOBStatusReason(FRStatusReason statusReason) {
        return statusReason == null ? null : new OBStatusReason()
                .statusReasonCode(statusReason.getStatusReasonCode())
                .statusReasonDescription(statusReason.getStatusReasonDescription())
                .path(statusReason.getPath());
    }
}
