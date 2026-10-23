/*
 * Copyright © 2020-2026 Ping Identity Corporation (obst@forgerock.com)
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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus;
import uk.org.openbanking.datamodel.v4.payment.OBInternalConsentStatus2Code;

public class FRInternationalConsentStatusConverter {

    private static final Map<String, String> v3tov4ConsentStatus;

    private static final Map<String, String> v4tov3ConsentStatus;

    static {
        final Map<String, String> consentStatusTranslations = new HashMap<>();
        consentStatusTranslations.put(OBPaymentConsentStatus.AWAITINGAUTHORISATION.getValue(), OBInternalConsentStatus2Code.AWAU.getValue());
        consentStatusTranslations.put(OBPaymentConsentStatus.AUTHORISED.getValue(), OBInternalConsentStatus2Code.AUTH.getValue());
        consentStatusTranslations.put(OBPaymentConsentStatus.CONSUMED.getValue(), OBInternalConsentStatus2Code.COND.getValue());
        consentStatusTranslations.put(OBPaymentConsentStatus.REJECTED.getValue(), OBInternalConsentStatus2Code.RJCT.getValue());

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTranslations);
        v4tov3ConsentStatus = consentStatusTranslations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public static OBInternalConsentStatus2Code toOBPaymentConsentStatusV4(String consentStatus) {
        if (v3tov4ConsentStatus.containsKey(consentStatus)) {
            return OBInternalConsentStatus2Code.fromValue(v3tov4ConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }
}
