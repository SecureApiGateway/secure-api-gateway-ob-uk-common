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
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.AUTHORISED;
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.AWAITINGAUTHORISATION;
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.REJECTED;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.org.openbanking.datamodel.v4.payment.OBInternalConsentStatus2Code;
import uk.org.openbanking.datamodel.v4.payment.OBInternalConsentStatus3Code;
import uk.org.openbanking.datamodel.v4.vrp.OBInternalConsentStatus1Code;

public class FRConsentStatusConverter {

    private static final Map<String, String> v3tov4ConsentStatus;

    private static final Map<String, String> v4tov3ConsentStatus;

    private static final Map<String, String> v3tov4VrpConsentStatus;

    private static final Map<String, String> v4tov3VrpConsentStatus;

    static {
        final Map<String, String> consentStatusTranslations = new HashMap<>();
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.AWAITINGAUTHORISATION.getValue(), OBInternalConsentStatus2Code.AWAU.getValue());
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.AUTHORISED.getValue(), OBInternalConsentStatus2Code.AUTH.getValue());
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.CONSUMED.getValue(), OBInternalConsentStatus2Code.COND.getValue());
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.REJECTED.getValue(), OBInternalConsentStatus2Code.RJCT.getValue());

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTranslations);
        v4tov3ConsentStatus = consentStatusTranslations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    private static final Map<String, String> v3tov4FileConsentStatus;

    private static final Map<String, String> v4tov3FileConsentStatus;

    static {
        final Map<String, String> consentStatusTranslations = new HashMap<>();
        consentStatusTranslations.put(AWAITINGAUTHORISATION.getValue(), OBInternalConsentStatus1Code.AWAU.getValue());
        consentStatusTranslations.put(AUTHORISED.getValue(), OBInternalConsentStatus1Code.AUTH.getValue());
        consentStatusTranslations.put(REJECTED.getValue(), OBInternalConsentStatus1Code.RJCT.getValue());

        v3tov4VrpConsentStatus = Collections.unmodifiableMap(consentStatusTranslations);
        v4tov3VrpConsentStatus = consentStatusTranslations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    static {
        final Map<String, String> consentStatusTransalations = new HashMap<>();
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.AWAITINGAUTHORISATION.getValue(), OBInternalConsentStatus3Code.AWAU.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.AUTHORISED.getValue(), OBInternalConsentStatus3Code.AUTH.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.CONSUMED.getValue(), OBInternalConsentStatus3Code.COND.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.REJECTED.getValue(), OBInternalConsentStatus3Code.RJCT.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.AWAITINGUPLOAD.getValue(), OBInternalConsentStatus3Code.AWUP.getValue());

        v3tov4FileConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        v4tov3FileConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public static OBInternalConsentStatus2Code toOBPaymentConsentStatusV4(String consentStatus) {
        if (v3tov4ConsentStatus.containsKey(consentStatus)) {
            return OBInternalConsentStatus2Code.fromValue(v3tov4ConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static OBInternalConsentStatus1Code toVrpOBPaymentConsentStatusV4(String consentStatus) {
        if (v3tov4VrpConsentStatus.containsKey(consentStatus)) {
            return OBInternalConsentStatus1Code.fromValue(v3tov4VrpConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static OBInternalConsentStatus3Code toOBFilePaymentConsentStatusV4(String consentStatus) {
        if (v3tov4FileConsentStatus.containsKey(consentStatus)) {
            return OBInternalConsentStatus3Code.fromValue(v3tov4FileConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }
}
