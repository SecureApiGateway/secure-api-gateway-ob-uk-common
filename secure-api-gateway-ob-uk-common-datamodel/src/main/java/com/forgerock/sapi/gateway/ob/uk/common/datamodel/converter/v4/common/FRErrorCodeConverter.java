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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.org.openbanking.datamodel.error.OBStandardErrorCodes1;

public class FRErrorCodeConverter {

    private static final Map<String, String> v3tov4ErrorCodes;

    static {
        final Map<String, String> errorCodesTranslations = new HashMap<>();
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_FIELD_EXPECTED.getValue(), "U001");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_FIELD_INVALID.getValue(), "U002");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_FIELD_INVALID_DATE.getValue(), "U003");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_FIELD_MISSING.getValue(), "U004");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_FIELD_UNEXPECTED.getValue(), "U005");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_HEADER_INVALID.getValue(), "U006");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_HEADER_MISSING.getValue(), "U007");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RESOURCE_CONSENT_MISMATCH.getValue(), "U008");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RESOURCE_INVALID_CONSENT_STATUS.getValue(), "U009");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RESOURCE_INVALID_FORMAT.getValue(), "U010");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RESOURCE_NOT_FOUND.getValue(), "U011");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RULES_AFTER_CUT_OFF_DATE_TIME.getValue(), "U012");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RULES_DUPLICATE_REFERENCE.getValue(), "U013");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RULES_FAILS_CONTROL_PARAMETERS.getValue(), "U014");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_SIGNATURE_INVALID.getValue(), "U015");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_SIGNATURE_INVALID_CLAIM.getValue(), "U016");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_SIGNATURE_MISSING_CLAIM.getValue(), "U017");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_SIGNATURE_MALFORMED.getValue(), "U018");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_SIGNATURE_MISSING.getValue(), "U019");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_SIGNATURE_UNEXPECTED.getValue(), "U020");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_ACCOUNT_IDENTIFIER.getValue(), "U021");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_ACCOUNT_SECONDARY_IDENTIFIER.getValue(), "U022");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_CURRENCY.getValue(), "U023");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_EVENT_TYPE.getValue(), "U024");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_FREQUENCY.getValue(), "U025");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_LOCAL_INSTRUMENT.getValue(), "U026");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNSUPPORTED_SCHEME.getValue(), "U027");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_REAUTHENTICATE.getValue(), "U028");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_RULES_RESOURCE_ALREADY_EXISTS.getValue(), "U029");
        errorCodesTranslations.put(OBStandardErrorCodes1.UK_OBIE_UNEXPECTED_ERROR.getValue(), "U000");

        v3tov4ErrorCodes = Collections.unmodifiableMap(errorCodesTranslations);
    }

    public static String toObV4ErrorCode(String errorCode) {
        if (v3tov4ErrorCodes.containsKey(errorCode)) {
            return v3tov4ErrorCodes.get(errorCode);
        } else {
            return errorCode;
        }
    }

}
