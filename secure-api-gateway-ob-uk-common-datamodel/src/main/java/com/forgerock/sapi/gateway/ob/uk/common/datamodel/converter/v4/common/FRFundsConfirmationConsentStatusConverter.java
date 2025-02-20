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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import uk.org.openbanking.datamodel.v3.fund.OBFundsConfirmationConsentResponse1Data;
import uk.org.openbanking.datamodel.v4.fund.OBFundsConfirmationConsentStatus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class FRFundsConfirmationConsentStatusConverter {

    private static final Map<String, String> v3tov4ConsentStatus;

    private static final Map<String, String> v4tov3ConsentStatus;

    static {
        final Map<String, String> consentStatusTransalations = new HashMap<>();
        consentStatusTransalations.put(OBFundsConfirmationConsentResponse1Data.StatusEnum.AWAITINGAUTHORISATION.getValue(), OBFundsConfirmationConsentStatus.AWAU.getValue());
        consentStatusTransalations.put(OBFundsConfirmationConsentResponse1Data.StatusEnum.AUTHORISED.getValue(), OBFundsConfirmationConsentStatus.AUTH.getValue());
        consentStatusTransalations.put(OBFundsConfirmationConsentResponse1Data.StatusEnum.REJECTED.getValue(), OBFundsConfirmationConsentStatus.RJCT.getValue());
        consentStatusTransalations.put(OBFundsConfirmationConsentResponse1Data.StatusEnum.REVOKED.getValue(), OBFundsConfirmationConsentStatus.CANC.getValue());

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3ConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public static OBFundsConfirmationConsentStatus toOBFundsConfirmationConsentStatusV4(String consentStatus) {
        if (v3tov4ConsentStatus.containsKey(consentStatus)) {
            return OBFundsConfirmationConsentStatus.fromValue(v3tov4ConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }
}
