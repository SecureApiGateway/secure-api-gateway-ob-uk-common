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
package com.forgerock.sapi.gateway.uk.common.shared.api.meta.share;


import com.forgerock.sapi.gateway.uk.common.shared.api.meta.obie.OBGroupName;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.forgerock.sapi.gateway.uk.common.shared.api.meta.obie.OBGroupName.*;

public enum IntentType {

    ACCOUNT_REQUEST("AR_", AISP),
    ACCOUNT_ACCESS_CONSENT("AAC_", AISP),

    PAYMENT_DOMESTIC_CONSENT("PDC_", PISP),
    PAYMENT_DOMESTIC_SCHEDULED_CONSENT("PDSC_", PISP),
    PAYMENT_DOMESTIC_STANDING_ORDERS_CONSENT("PDSOC_", PISP),
    PAYMENT_INTERNATIONAL_CONSENT("PIC_", PISP),
    PAYMENT_INTERNATIONAL_SCHEDULED_CONSENT("PISC_", PISP),
    PAYMENT_INTERNATIONAL_STANDING_ORDERS_CONSENT("PISOC_", PISP),
    PAYMENT_FILE_CONSENT("PFC_", PISP),

    FUNDS_CONFIRMATION_CONSENT("FCC_", CBPII),
    DOMESTIC_VRP_PAYMENT_CONSENT("DVRP_", PISP),
    CUSTOMER_INFO_CONSENT("CIC_", INFO);

    private String intentIdPrefix;
    private OBGroupName obGroupName;

    IntentType(String intentIdPrefix, OBGroupName obGroupName) {
        this.intentIdPrefix = intentIdPrefix;
        this.obGroupName = obGroupName;
    }

    public static IntentType identify(String intentId) {
        for (IntentType type : IntentType.values()) {
            if (intentId.startsWith(type.intentIdPrefix)) {
                return type;
            }
        }
        return null;
    }

    public OBGroupName getObGroupName() {
        return obGroupName;
    }

    public String generateIntentId() {
        String intentId = intentIdPrefix + UUID.randomUUID().toString();
        return intentId.substring(0, Math.min(intentId.length(), 40));
    }

    public static List<IntentType> byOBGroupeName(OBGroupName obGroupName) {
        return Arrays.asList(IntentType.values()).stream().filter(i -> i.obGroupName == obGroupName).collect(Collectors.toList());
    }
}
