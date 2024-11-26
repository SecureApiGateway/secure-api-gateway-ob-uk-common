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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRFrequency6Converter.toFRFrequency;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRFrequency6Converter.toOBFrequency6;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRMandateRelatedInformation;

import uk.org.openbanking.datamodel.v4.payment.OBExternalMandateClassification1Code;
import uk.org.openbanking.datamodel.v4.payment.OBMandateRelatedInformation1;

public class FRMandateRelatedInformationConverter {

    // OB to FR
    public static FRMandateRelatedInformation toFRMandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
        return mandateRelatedInformation == null ? null : FRMandateRelatedInformation.builder()
                .mandateIdentification(mandateRelatedInformation.getMandateIdentification())
                .classification(toFRExternalMandateClassificationCode(mandateRelatedInformation.getClassification()))
                .categoryPurposeCode(mandateRelatedInformation.getCategoryPurposeCode())
                .firstPaymentDateTime(mandateRelatedInformation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(mandateRelatedInformation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(mandateRelatedInformation.getFinalPaymentDateTime())
                .frequency(toFRFrequency(mandateRelatedInformation.getFrequency()))
                .reason(mandateRelatedInformation.getReason())
                .build();
    }

    public static FRMandateRelatedInformation.FRExternalMandateClassificationCode toFRExternalMandateClassificationCode(OBExternalMandateClassification1Code classification) {
        return classification == null ? null : FRMandateRelatedInformation.FRExternalMandateClassificationCode.valueOf(classification.name());
    }

    // FR to OB
    public static OBMandateRelatedInformation1 toOBMandateRelatedInformation1(FRMandateRelatedInformation mandateRelatedInformation) {
        return mandateRelatedInformation == null ? null : new OBMandateRelatedInformation1()
                .mandateIdentification(mandateRelatedInformation.getMandateIdentification())
                .classification(toOBExternalMandateClassification1Code(mandateRelatedInformation.getClassification()))
                .categoryPurposeCode(mandateRelatedInformation.getCategoryPurposeCode())
                .firstPaymentDateTime(mandateRelatedInformation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(mandateRelatedInformation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(mandateRelatedInformation.getFinalPaymentDateTime())
                .frequency(toOBFrequency6(mandateRelatedInformation.getFrequency()))
                .reason(mandateRelatedInformation.getReason());
    }

    public static OBExternalMandateClassification1Code toOBExternalMandateClassification1Code(FRMandateRelatedInformation.FRExternalMandateClassificationCode classification) {
        return classification == null ? null : OBExternalMandateClassification1Code.valueOf(classification.name());
    }
}
