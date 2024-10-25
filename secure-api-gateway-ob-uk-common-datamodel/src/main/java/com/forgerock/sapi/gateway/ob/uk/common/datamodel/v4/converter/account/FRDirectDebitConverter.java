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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRExternalCategoryPurposeCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStandingOrderFrequency;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStandingOrderFrequencyCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.account.FRDirectDebitData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.*;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAmountConverter;
import uk.org.openbanking.datamodel.v4.account.*;
import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRExternalMandateStatusConverter.toExternalMandateStatus1CodeV4;


/**
 * Converter for 'OBDirectDebit' model objects.
 */
public class FRDirectDebitConverter {

    // FR to OB

    public static OBReadDirectDebit2DataDirectDebitInner toOBReadDirectDebit2DataDirectDebit(FRDirectDebitData directDebitData) {
        return directDebitData == null ? null : new OBReadDirectDebit2DataDirectDebitInner()
                .accountId(directDebitData.getAccountId())
                .directDebitId(directDebitData.getDirectDebitId())
                .mandateRelatedInformation(toOBMandateRelatedInformation1(directDebitData.getMandateRelatedInformation()))
                .directDebitStatusCode(toExternalMandateStatus1CodeV4(String.valueOf(directDebitData.getDirectDebitStatusCode())))
                .name(directDebitData.getName())
                .previousPaymentDateTime(directDebitData.getPreviousPaymentDateTime())
                .previousPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount0(directDebitData.getPreviousPaymentAmount()));
    }

    public static OBMandateRelatedInformation1 toOBMandateRelatedInformation1(FRMandateRelatedInformation mandateRelatedInformation) {
        return mandateRelatedInformation == null ? null : new OBMandateRelatedInformation1()
                .categoryPurposeCode(mandateRelatedInformation.getCategoryPurposeCode())
                .classification(toOBExternalMandateClassification1Code(mandateRelatedInformation.getClassification()))
                .finalPaymentDateTime(mandateRelatedInformation.getFinalPaymentDateTime())
                .firstPaymentDateTime(mandateRelatedInformation.getFirstPaymentDateTime())
                .mandateIdentification(mandateRelatedInformation.getMandateIdentification())
                .reason(mandateRelatedInformation.getReason())
                .recurringPaymentDateTime(mandateRelatedInformation.getRecurringPaymentDateTime())
                .frequency(toOBFrequency6(mandateRelatedInformation.getFrequency()));
    }

    public static OBFrequency6 toOBFrequency6(FRStandingOrderFrequency frStandingOrderFrequency) {
        return frStandingOrderFrequency == null ? null : new OBFrequency6()
                .countPerPeriod(frStandingOrderFrequency.getCountPerPeriod())
                .type(toOBFrequency6Code(frStandingOrderFrequency.getType()))
                .pointInTime(frStandingOrderFrequency.getPointInTime());
    }

    public static ExternalMandateStatus1Code toOBExternalDirectDebitStatus1Code(FRDirectDebitData.FRDirectDebitStatus status) {
        return status == null ? null : ExternalMandateStatus1Code.valueOf(status.name());
    }
    public static ExternalCategoryPurpose1Code toOBExternalCategoryPurpose1Code(FRExternalCategoryPurposeCode externalCategoryPurposeCode) {
        return externalCategoryPurposeCode == null ? null : ExternalCategoryPurpose1Code.valueOf(externalCategoryPurposeCode.name());
    }
    public static OBExternalMandateClassification1Code toOBExternalMandateClassification1Code(FRMandateRelatedInformation.FRExternalMandateClassificationCode externalMandateClassificationCode) {
        return externalMandateClassificationCode == null ? null : OBExternalMandateClassification1Code.valueOf(externalMandateClassificationCode.name());
    }
    public static OBFrequency6Code toOBFrequency6Code(FRStandingOrderFrequencyCode frStandingOrderFrequencyCode) {
        return frStandingOrderFrequencyCode == null ? null : OBFrequency6Code.valueOf(frStandingOrderFrequencyCode.name());
    }

    // OB to FR
    public static FRDirectDebitData toFRDirectDebitData(OBReadDirectDebit2DataDirectDebitInner obDirectDebit) {
        return obDirectDebit == null ? null : FRDirectDebitData.builder()
                .accountId(obDirectDebit.getAccountId())
                .directDebitId(obDirectDebit.getDirectDebitId())
                .mandateRelatedInformation(toFRMandateRelatedInformation(obDirectDebit.getMandateRelatedInformation()))
                .directDebitStatusCode(toFRDirectDebitStatus(obDirectDebit.getDirectDebitStatusCode()))
                .name(obDirectDebit.getName())
                .previousPaymentDateTime(obDirectDebit.getPreviousPaymentDateTime())
                .previousPaymentAmount(FRAmountConverter.toFRAmount(obDirectDebit.getPreviousPaymentAmount()))
                .build();
    }

    public static FRMandateRelatedInformation toFRMandateRelatedInformation(OBMandateRelatedInformation1 obMandateRelatedInformation1) {
        return obMandateRelatedInformation1 == null ? null : FRMandateRelatedInformation.builder()
                .categoryPurposeCode((obMandateRelatedInformation1.getCategoryPurposeCode()))
                .classification(toFRExternalMandateClassificationCode(obMandateRelatedInformation1.getClassification()))
                .finalPaymentDateTime(obMandateRelatedInformation1.getFinalPaymentDateTime())
                .firstPaymentDateTime(obMandateRelatedInformation1.getFirstPaymentDateTime())
                .mandateIdentification(obMandateRelatedInformation1.getMandateIdentification())
                .reason(obMandateRelatedInformation1.getReason())
                .recurringPaymentDateTime(obMandateRelatedInformation1.getRecurringPaymentDateTime())
                .frequency(toFRStandingOrderFrequency(obMandateRelatedInformation1.getFrequency()))
                .build();
    }

    public static FRStandingOrderFrequency toFRStandingOrderFrequency(OBFrequency6 obFrequency6) {
        return obFrequency6 == null ? null : FRStandingOrderFrequency.builder()
                .countPerPeriod(obFrequency6.getCountPerPeriod())
                .pointInTime(obFrequency6.getPointInTime())
                .type(toFRStandingOrderFrequencyCode(obFrequency6.getType()))
                .build();
    }

    public static FRDirectDebitData.FRDirectDebitStatus toFRDirectDebitStatus(ExternalMandateStatus1Code status) {
        return status == null ? null : FRDirectDebitData.FRDirectDebitStatus.valueOf(status.name());
    }

    public static FRExternalCategoryPurposeCode toFRExternalCategoryPurposeCode(ExternalCategoryPurpose1Code externalCategoryPurpose1Code) {
        return externalCategoryPurpose1Code == null ? null : FRExternalCategoryPurposeCode.valueOf(externalCategoryPurpose1Code.name());
    }

    public static FRMandateRelatedInformation.FRExternalMandateClassificationCode toFRExternalMandateClassificationCode(OBExternalMandateClassification1Code externalMandateClassification1Code) {
        return externalMandateClassification1Code == null ? null : FRMandateRelatedInformation.FRExternalMandateClassificationCode.valueOf(externalMandateClassification1Code.name());
    }

    public static FRStandingOrderFrequencyCode toFRStandingOrderFrequencyCode(OBFrequency6Code obFrequency6Code) {
        return obFrequency6Code == null ? null : FRStandingOrderFrequencyCode.valueOf(obFrequency6Code.name());
    }

}
