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
package uk.org.openbanking.testsupport.payment;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisationAuthorisationType;

/**
 * Test data factory for various OB consent authorisation types.
 */
public class OBConsentAuthorisationTestDataFactoryV4 {

    public static OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation aValidOBWriteDomesticStandingOrderConsentResponse6DataAuthorisation() {
        return (new OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation())
                .authorisationType(OBWriteDomesticStandingOrderConsentResponse6DataAuthorisationAuthorisationType.ANY)
                .completionDateTime(DateTime.now());
    }
}
