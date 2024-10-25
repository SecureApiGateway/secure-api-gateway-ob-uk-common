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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRMandateRelatedInformation;
import org.joda.time.DateTime;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.v4.FRFrequencyTestDataFactory.aValidFRStandingOrderFrequency;
import static uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code.BONU;

/**
 * Test data factory for {@link FRMandateRelatedInformation}.
 */
public class FRMandateRelatedInformationTestDataFactory {

    /**
     * @return a valid instance of {@link FRMandateRelatedInformation}
     */
    public static FRMandateRelatedInformation aValidFRMandateRelatedInformation() {
        return aValidFRMandateRelatedInformationBuilder().build();
    }

    /**
     * @return an instance of {@link FRMandateRelatedInformation.FRMandateRelatedInformationBuilder} with the required values populated.
     */
    public static FRMandateRelatedInformation.FRMandateRelatedInformationBuilder aValidFRMandateRelatedInformationBuilder() {
        return FRMandateRelatedInformation.builder()
                .mandateIdentification("Caravanners")
                .categoryPurposeCode(BONU)
                .classification(FRMandateRelatedInformation.FRExternalMandateClassificationCode.FIXE)
                .finalPaymentDateTime(DateTime.parse("2024-04-25T12:46:49.425Z"))
                .firstPaymentDateTime(DateTime.parse("2024-04-25T12:46:49.425Z"))
                .recurringPaymentDateTime(DateTime.parse("2024-04-25T12:46:49.425Z"))
                .frequency(aValidFRStandingOrderFrequency())
                .reason("To pay monthly membership");
    }
}
