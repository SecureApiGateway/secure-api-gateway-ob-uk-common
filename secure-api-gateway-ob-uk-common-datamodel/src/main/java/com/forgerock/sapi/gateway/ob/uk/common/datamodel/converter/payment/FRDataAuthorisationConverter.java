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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRDataAuthorisation;

import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticConsent4DataAuthorisation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticConsent4DataAuthorisationAuthorisationType;

public class FRDataAuthorisationConverter {

    // OB to FR
    public static FRDataAuthorisation toFRDataAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        return authorisation == null ? null : FRDataAuthorisation.builder()
                .authorisationType(toFRAuthorisationType(authorisation.getAuthorisationType()))
                .completionDateTime(authorisation.getCompletionDateTime())
                .build();
    }

    public static FRDataAuthorisation.AuthorisationType toFRAuthorisationType(OBWriteDomesticConsent4DataAuthorisationAuthorisationType authorisationType) {
        return authorisationType == null ? null : FRDataAuthorisation.AuthorisationType.valueOf(authorisationType.name());
    }

    // FR to OB
    public static OBWriteDomesticConsent4DataAuthorisation toOBWriteDomesticConsent4DataAuthorisation(FRDataAuthorisation authorisation) {
        return authorisation == null ? null : new OBWriteDomesticConsent4DataAuthorisation()
                .authorisationType(toOBExternalAuthorisation1Code(authorisation.getAuthorisationType()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent4DataAuthorisationAuthorisationType toOBExternalAuthorisation1Code(FRDataAuthorisation.AuthorisationType authorisationType) {
        return authorisationType == null ? null : OBWriteDomesticConsent4DataAuthorisationAuthorisationType.valueOf(authorisationType.name());
    }
}
