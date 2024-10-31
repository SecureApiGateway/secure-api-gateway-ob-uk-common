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

public class FRErrorCodeConverter {

    private static final Map<String, String> v3tov4ErrorCodes;

    static {
        final Map<String, String> errorCodesTranslations = new HashMap<>();
        errorCodesTranslations.put("UK.OBIE.Field.Expected", "U001");
        errorCodesTranslations.put("UK.OBIE.Field.Invalid", "U002");
        errorCodesTranslations.put("UK.OBIE.Field.InvalidDate", "U003");
        errorCodesTranslations.put("UK.OBIE.Field.Missing", "U004");
        errorCodesTranslations.put("UK.OBIE.Field.Unexpected", "U005");
        errorCodesTranslations.put("UK.OBIE.Header.Invalid", "U006");
        errorCodesTranslations.put("UK.OBIE.Header.Missing", "U007");
        errorCodesTranslations.put("UK.OBIE.Resource.ConsentMismatch", "U008");
        errorCodesTranslations.put("UK.OBIE.Resource.InvalidConsentStatus", "U009");
        errorCodesTranslations.put("UK.OBIE.Resource.InvalidFormat", "U010");
        errorCodesTranslations.put("UK.OBIE.Resource.NotFound", "U011");
        errorCodesTranslations.put("UK.OBIE.Rules.AfterCutOffDateTime", "U012");
        errorCodesTranslations.put("UK.OBIE.Rules.DuplicateReference", "U013");
        errorCodesTranslations.put("UK.OBIE.Rules.FailsControlParameters", "U014");
        errorCodesTranslations.put("UK.OBIE.Signature.Invalid", "U015");
        errorCodesTranslations.put("UK.OBIE.Signature.InvalidClaim", "U016");
        errorCodesTranslations.put("UK.OBIE.Signature.MissingClaim", "U017");
        errorCodesTranslations.put("UK.OBIE.Signature.Malformed", "U018");
        errorCodesTranslations.put("UK.OBIE.Signature.Missing", "U019");
        errorCodesTranslations.put("UK.OBIE.Signature.Unexpected", "U020");
        errorCodesTranslations.put("UK.OBIE.Unsupported.AccountIdentifier", "U021");
        errorCodesTranslations.put("UK.OBIE.Unsupported.AccountSecondaryIdentifier", "U022");
        errorCodesTranslations.put("UK.OBIE.Unsupported.Currency", "U023");
        errorCodesTranslations.put("UK.OBIE.Unsupported.EventType", "U024");
        errorCodesTranslations.put("UK.OBIE.Unsupported.Frequency", "U025");
        errorCodesTranslations.put("UK.OBIE.Unsupported.LocalInstrument", "U026");
        errorCodesTranslations.put("UK.OBIE.Unsupported.Scheme", "U027");
        errorCodesTranslations.put("UK.OBIE.Reauthenticate", "U028");
        errorCodesTranslations.put("UK.OBIE.Rules.ResourceAlreadyExists", "U029");
        errorCodesTranslations.put("UK.OBIE.UnexpectedError", "U000");

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
