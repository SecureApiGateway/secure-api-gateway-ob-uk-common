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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import static java.util.stream.Collectors.toMap;
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.org.openbanking.datamodel.v4.payment.OBPaymentConsentStatus;
import uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPConsentStatus;

public class FRConsentStatusConverter {

    private static final Map<String, String> v3tov4ConsentStatus;

    private static final Map<String, String> v4tov3ConsentStatus;

    private static final Map<String, String> v3tov4VrpConsentStatus;

    private static final Map<String, String> v4tov3VrpConsentStatus;

    static {
        final Map<String, String> consentStatusTransalations = new HashMap<>();
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.AWAITINGAUTHORISATION.getValue(), OBPaymentConsentStatus.AWAU.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.AUTHORISED.getValue(), OBPaymentConsentStatus.AUTH.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.CONSUMED.getValue(), OBPaymentConsentStatus.COND.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.REJECTED.getValue(), OBPaymentConsentStatus.RJCT.getValue());

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        v4tov3ConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    static {
        final Map<String, String> consentStatusTransalations = new HashMap<>();
        consentStatusTransalations.put(AWAITINGAUTHORISATION.getValue(), OBDomesticVRPConsentStatus.AWAU.getValue());
        consentStatusTransalations.put(AUTHORISED.getValue(), OBDomesticVRPConsentStatus.AUTH.getValue());
        consentStatusTransalations.put(REJECTED.getValue(), OBDomesticVRPConsentStatus.RJCT.getValue());

        v3tov4VrpConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        v4tov3VrpConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public static OBPaymentConsentStatus toOBPaymentConsentStatusV4(String consentStatus) {
        if (v3tov4ConsentStatus.containsKey(consentStatus)) {
            return OBPaymentConsentStatus.fromValue(v3tov4ConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static OBDomesticVRPConsentStatus toVrpOBPaymentConsentStatusV4(String consentStatus) {
        if (v3tov4VrpConsentStatus.containsKey(consentStatus)) {
            return OBDomesticVRPConsentStatus.fromValue(v3tov4VrpConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }
}
