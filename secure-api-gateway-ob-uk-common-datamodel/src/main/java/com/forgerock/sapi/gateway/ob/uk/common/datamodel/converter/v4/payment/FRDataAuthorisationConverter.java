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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRDataAuthorisation;

import uk.org.openbanking.datamodel.v4.payment.OBPaymentConsentAuthorisation;
import uk.org.openbanking.datamodel.v4.payment.OBPaymentConsentAuthorisationType;

public class FRDataAuthorisationConverter {

    // OB to FR
    public static FRDataAuthorisation toFRDataAuthorisation(OBPaymentConsentAuthorisation authorisation) {
        return authorisation == null ? null : FRDataAuthorisation.builder()
                .authorisationType(toFRAuthorisationType(authorisation.getAuthorisationType()))
                .completionDateTime(authorisation.getCompletionDateTime())
                .build();
    }

    public static FRDataAuthorisation.AuthorisationType toFRAuthorisationType(OBPaymentConsentAuthorisationType authorisationType) {
        return authorisationType == null ? null : FRDataAuthorisation.AuthorisationType.valueOf(authorisationType.name());
    }

    // FR to OB
    public static OBPaymentConsentAuthorisation toOBWriteDomesticConsent4DataAuthorisation(FRDataAuthorisation authorisation) {
        return authorisation == null ? null : new OBPaymentConsentAuthorisation()
                .authorisationType(toOBExternalAuthorisation1Code(authorisation.getAuthorisationType()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBPaymentConsentAuthorisationType toOBExternalAuthorisation1Code(FRDataAuthorisation.AuthorisationType authorisationType) {
        return authorisationType == null ? null : OBPaymentConsentAuthorisationType.valueOf(authorisationType.name());
    }
}
