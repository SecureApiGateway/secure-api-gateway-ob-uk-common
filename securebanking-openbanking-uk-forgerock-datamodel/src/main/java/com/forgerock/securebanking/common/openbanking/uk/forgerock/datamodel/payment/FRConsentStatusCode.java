/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment;

public enum FRConsentStatusCode {
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    REJECTED("Rejected"),
    AUTHORISED("Authorised"),
    CONSUMED("Consumed");

    private final String value;

    FRConsentStatusCode(String value) {
        this.value = value;
    }

    public static FRConsentStatusCode fromValue(String value) {
        for (FRConsentStatusCode consentStatusCode : FRConsentStatusCode.values()) {
            if (consentStatusCode.value.equals(value)) {
                return consentStatusCode;
            }
        }
        throw new IllegalArgumentException("No enum constant '" + value + "'");
    }
}
