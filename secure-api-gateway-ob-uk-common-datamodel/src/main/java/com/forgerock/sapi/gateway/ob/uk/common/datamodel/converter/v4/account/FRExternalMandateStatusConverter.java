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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRStandingOrderData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRDirectDebitData.FRDirectDebitStatus;
import uk.org.openbanking.datamodel.v4.account.ExternalMandateStatus1Code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class FRExternalMandateStatusConverter {

    private static final Map<String, String> v3tov4ExternalMandateStatus;

    private static final Map<String, String> v4tov3ExternalMandateStatus;

    static {
        final Map<String, String> externalMandateStatusTransalations = new HashMap<>();
        externalMandateStatusTransalations.put("Active", "ACTV");
        externalMandateStatusTransalations.put("Inactive", "CANC");

        v3tov4ExternalMandateStatus = Collections.unmodifiableMap(externalMandateStatusTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3ExternalMandateStatus = externalMandateStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    // FR to OB
    public static ExternalMandateStatus1Code toExternalMandateStatus1Code(FRDirectDebitStatus directDebitStatus) {
        if (directDebitStatus == null) {
            return null;
        }
        return switch (directDebitStatus) {
            case INACTIVE -> ExternalMandateStatus1Code.CANC;
            default -> ExternalMandateStatus1Code.ACTV;
        };
    }

    public static ExternalMandateStatus1Code toExternalMandateStatus1CodeV4(String externalMandateStatus) {
        if (v3tov4ExternalMandateStatus.containsKey(externalMandateStatus)) {
            return ExternalMandateStatus1Code.fromValue(v3tov4ExternalMandateStatus.get(externalMandateStatus));
        }
        throw new IllegalArgumentException("Unknown external Mandate Status: " + externalMandateStatus);
    }

    public static FRStandingOrderData.FRStandingOrderStatus toFRStandingOrderStatusV3(String externalMandateStatus) {
        if (v4tov3ExternalMandateStatus.containsKey(externalMandateStatus)) {
            return FRStandingOrderData.FRStandingOrderStatus.fromValue(v4tov3ExternalMandateStatus.get(externalMandateStatus));
        }
        throw new IllegalArgumentException("Unknown external Mandate Status: " + externalMandateStatus);
    }

    //TODO - add for other external Mandate Status

    // FR to OB
    public static ExternalMandateStatus1Code toExternalMandateStatus1Code(FRStandingOrderData.FRStandingOrderStatus standingOrderStatus) {
        if (standingOrderStatus == null) {
            return null;
        }
        return switch (standingOrderStatus) {
            case INACTIVE -> ExternalMandateStatus1Code.CANC;
            default -> ExternalMandateStatus1Code.ACTV;
        };
    }

}