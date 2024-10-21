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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRConsentStatus;
import uk.org.openbanking.datamodel.v4.payment.OBPaymentConsentStatus;

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
        consentStatusTransalations.put("Consumed", "COND");
        consentStatusTransalations.put("Rejected", "RJCT");

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3ConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    // FR to OB
    public static OBPaymentConsentStatus toOBPaymentConsentStatus(FRConsentStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case AUTHORISED:
            return OBPaymentConsentStatus.AUTH;
        case AWAITINGAUTHORISATION:
            return OBPaymentConsentStatus.AWAU;
        case CONSUMED:
            return OBPaymentConsentStatus.COND;
            default:
            return OBPaymentConsentStatus.RJCT;
        }
    }

    public static OBPaymentConsentStatus toOBPaymentConsentStatusV4(String consentStatus) {
        if (v3tov4ConsentStatus.containsKey(consentStatus)) {
            return OBPaymentConsentStatus.fromValue(v3tov4ConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    //TODO - add for other payment types
}
