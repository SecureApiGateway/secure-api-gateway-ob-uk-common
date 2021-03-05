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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRConsentStatusCode;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRDomesticPaymentConsent;

import java.util.UUID;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.payment.FRPaymentRiskTestDataFactory.aValidFRPaymentRisk;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.testsupport.payment.FRWriteDomesticDataInitiationTestDataFactory.aValidFRWriteDomesticDataInitiation;

/**
 * Test data factory for {@link FRDomesticPaymentConsent}.
 */
public class FRDomesticPaymentConsentTestDataFactory {

    public static FRDomesticPaymentConsent aValidFRDomesticPaymentConsent() {
        return aValidFRDomesticPaymentConsentBuilder().build();
    }

    public static FRDomesticPaymentConsent.FRDomesticPaymentConsentBuilder aValidFRDomesticPaymentConsentBuilder() {
        return FRDomesticPaymentConsent.builder()
                .id(UUID.randomUUID().toString())
                .status(FRConsentStatusCode.AWAITINGAUTHORISATION)
                .accountId(UUID.randomUUID().toString())
                .userId(UUID.randomUUID().toString())
                .pispId(UUID.randomUUID().toString())
                .pispName("Tpp Name")
                .initiation(aValidFRWriteDomesticDataInitiation())
                .risk(aValidFRPaymentRisk());
    }
}
