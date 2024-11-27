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
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.AUTHORISED;
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.AWAITINGAUTHORISATION;
import static uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPConsentResponseDataStatus.REJECTED;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.org.openbanking.datamodel.v4.payment.OBPaymentConsentStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalConsentResponse6DataStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFileConsentResponse4DataStatus;
import uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPConsentStatus;

public class FRConsentStatusConverter {

    private static final Map<String, String> v3tov4ConsentStatus;

    private static final Map<String, String> v4tov3ConsentStatus;

    private static final Map<String, String> v3tov4VrpConsentStatus;

    private static final Map<String, String> v4tov3VrpConsentStatus;

    private static final Map<String, String> v3tov4InternationalConsentStatus;

    private static final Map<String, String> v4tov3InternationalConsentStatus;

    static {
        final Map<String, String> consentStatusTranslations = new HashMap<>();
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.AWAITINGAUTHORISATION.getValue(), OBPaymentConsentStatus.AWAU.getValue());
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.AUTHORISED.getValue(), OBPaymentConsentStatus.AUTH.getValue());
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.CONSUMED.getValue(), OBPaymentConsentStatus.COND.getValue());
        consentStatusTranslations.put(uk.org.openbanking.datamodel.v3.payment.OBPaymentConsentStatus.REJECTED.getValue(), OBPaymentConsentStatus.RJCT.getValue());

        v3tov4ConsentStatus = Collections.unmodifiableMap(consentStatusTranslations);
        v4tov3ConsentStatus = consentStatusTranslations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    private static final Map<String, String> v3tov4FileConsentStatus;

    private static final Map<String, String> v4tov3FileConsentStatus;

    static {
        final Map<String, String> consentStatusTranslations = new HashMap<>();
        consentStatusTranslations.put(AWAITINGAUTHORISATION.getValue(), OBDomesticVRPConsentStatus.AWAU.getValue());
        consentStatusTranslations.put(AUTHORISED.getValue(), OBDomesticVRPConsentStatus.AUTH.getValue());
        consentStatusTranslations.put(REJECTED.getValue(), OBDomesticVRPConsentStatus.RJCT.getValue());

        v3tov4VrpConsentStatus = Collections.unmodifiableMap(consentStatusTranslations);
        v4tov3VrpConsentStatus = consentStatusTranslations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    static {
        final Map<String, String> consentStatusTranslations = new HashMap<>();
        consentStatusTranslations.put(AWAITINGAUTHORISATION.getValue(), OBWriteInternationalConsentResponse6DataStatus.AWAU.getValue());
        consentStatusTranslations.put(AUTHORISED.getValue(), OBWriteInternationalConsentResponse6DataStatus.AUTH.getValue());
        consentStatusTranslations.put(REJECTED.getValue(), OBWriteInternationalConsentResponse6DataStatus.RJCT.getValue());

        v3tov4InternationalConsentStatus = Collections.unmodifiableMap(consentStatusTranslations);
        v4tov3InternationalConsentStatus = consentStatusTranslations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    static {
        final Map<String, String> consentStatusTransalations = new HashMap<>();
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.AWAITINGAUTHORISATION.getValue(), OBWriteFileConsentResponse4DataStatus.AWAU.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.AUTHORISED.getValue(), OBWriteFileConsentResponse4DataStatus.AUTH.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.CONSUMED.getValue(), OBWriteFileConsentResponse4DataStatus.COND.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.REJECTED.getValue(), OBWriteFileConsentResponse4DataStatus.RJCT.getValue());
        consentStatusTransalations.put(uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsentResponse4DataStatus.AWAITINGUPLOAD.getValue(), OBWriteFileConsentResponse4DataStatus.AWUP.getValue());

        v3tov4FileConsentStatus = Collections.unmodifiableMap(consentStatusTransalations);
        v4tov3FileConsentStatus = consentStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
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

    public static OBWriteInternationalConsentResponse6DataStatus toOBWriteInternationalConsentResponse6DataStatus(String consentStatus) {
        if (v3tov4InternationalConsentStatus.containsKey(consentStatus)) {
            return OBWriteInternationalConsentResponse6DataStatus.fromValue(v3tov4InternationalConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static OBWriteFileConsentResponse4DataStatus toOBFilePaymentConsentStatusV4(String consentStatus) {
        if (v3tov4FileConsentStatus.containsKey(consentStatus)) {
            return OBWriteFileConsentResponse4DataStatus.fromValue(v3tov4FileConsentStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }
}
