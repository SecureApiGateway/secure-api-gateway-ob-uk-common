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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountStatusCode;
import uk.org.openbanking.datamodel.v4.account.OBReadConsentStatus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class FRConsentStatusConverter {

    private static final Map<String, String> v3tov4ConsentStatus;

    private static final Map<String, String> v4tov3ConsentStatus;

    static {
        final Map<String, String> consentStatusTransalations = new HashMap<>();
        consentStatusTransalations.put("AwaitingAuthorisation", "AWAU");
        consentStatusTransalations.put("Authorised", "AUTH");
        consentStatusTransalations.put("Cancelled", "CAND");
        consentStatusTransalations.put("Rejected", "RJCT");
        consentStatusTransalations.put("Expired", "EXPD");

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3ConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    // FR to OB
    public static OBReadConsentStatus toOBReadConsentStatus(FRAccountStatusCode status) {
        if (status == null) {
            return null;
        }
        return switch (status) {
            case AUTHORISED -> OBReadConsentStatus.AUTH;
            case AWAITINGAUTHORISATION -> OBReadConsentStatus.AWAU;
            case CANCELLED -> OBReadConsentStatus.CANC;
            case EXPIRED -> OBReadConsentStatus.EXPD;
            default -> OBReadConsentStatus.RJCT;
        };
    }

    public static OBReadConsentStatus toOBReadConsentStatusV4(String consentStatus) {
        if (v3tov4ConsentStatus.containsKey(consentStatus)) {
            return OBReadConsentStatus.fromValue(v3tov4ConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    //TODO - add for other acccount types
}