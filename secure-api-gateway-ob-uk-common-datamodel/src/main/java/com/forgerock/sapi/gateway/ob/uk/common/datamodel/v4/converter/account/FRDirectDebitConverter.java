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
///*
// * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.account;
//
//import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRDirectDebitData;
//import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAmountConverterV4;
//import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRExternalCategoryPurposeCode;
//import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRExternalMandateClassificationCode;
//import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRMandateRelatedInformation;
//import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStandingOrderFrequency;
//import uk.org.openbanking.datamodel.v4.account.*;
//import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;
//
//
///**
// * Converter for 'OBDirectDebit' model objects.
// */
//public class FRDirectDebitConverterV4 {
//
//    // FR to OB
//
//    public static OBReadDirectDebit2DataDirectDebitInner toOBReadDirectDebit2DataDirectDebit(FRDirectDebitData directDebitData) {
//        return directDebitData == null ? null : new OBReadDirectDebit2DataDirectDebitInner()
//                .accountId(directDebitData.getAccountId())
//                .directDebitId(directDebitData.getDirectDebitId())
//                .mandateRelatedInformation(toOBMandateRelatedInformation1(directDebitData.getMandateIdentification()))
//                .directDebitStatusCode(toOBExternalDirectDebitStatus1Code(directDebitData.getDirectDebitStatusCode()))
//                .name(directDebitData.getName())
//                .previousPaymentDateTime(directDebitData.getPreviousPaymentDateTime())
//                .previousPaymentAmount(FRAmountConverterV4.toOBActiveOrHistoricCurrencyAndAmount0(directDebitData.getPreviousPaymentAmount()));
//    }
//
//    public static OBMandateRelatedInformation1 toOBMandateRelatedInformation1(FRMandateRelatedInformation mandateRelatedInformation) {
//        return mandateRelatedInformation == null ? null : new OBMandateRelatedInformation1()
//                .categoryPurposeCode(toOBExternalCategoryPurpose1Code(mandateRelatedInformation.getCategoryPurposeCode()))
//                .classification(toOBExternalMandateClassification1Code(mandateRelatedInformation.getClassification()))
//                .finalPaymentDateTime(mandateRelatedInformation.getFinalPaymentDateTime())
//                .firstPaymentDateTime(mandateRelatedInformation.getFirstPaymentDateTime())
//                .mandateIdentification(mandateRelatedInformation.getMandateIdentification())
//                .reason(mandateRelatedInformation.getReason())
//                .recurringPaymentDateTime(mandateRelatedInformation.getRecurringPaymentDateTime())
//                .frequency(mandateRelatedInformation.getFrequency());
//    }
//
//    public static ExternalMandateStatus1Code toOBExternalDirectDebitStatus1Code(FRDirectDebitData.FRDirectDebitStatus status) {
//        return status == null ? null : ExternalMandateStatus1Code.valueOf(status.name());
//    }
//    public static ExternalCategoryPurpose1Code toOBExternalCategoryPurpose1Code(FRExternalCategoryPurposeCode externalCategoryPurposeCode) {
//        return externalCategoryPurposeCode == null ? null : ExternalCategoryPurpose1Code.valueOf(externalCategoryPurposeCode.name());
//    }
//    public static OBExternalMandateClassification1Code toOBExternalMandateClassification1Code(FRExternalMandateClassificationCode externalMandateClassificationCode) {
//        return externalMandateClassificationCode == null ? null : OBExternalMandateClassification1Code.valueOf(externalMandateClassificationCode.name());
//    }
//    public static OBFrequency6 toOBExternalMandateClassification1Code(FRStandingOrderFrequency frStandingOrderFrequency) {
//        return frStandingOrderFrequency == null ? null : OBFrequency6.valueOf(frStandingOrderFrequency.name());
//    }
//
//    // OB to FR
//    public static FRDirectDebitData toFRDirectDebitData(OBReadDirectDebit2DataDirectDebitInner obDirectDebit) {
//        return obDirectDebit == null ? null : FRDirectDebitData.builder()
//                .accountId(obDirectDebit.getAccountId())
//                .directDebitId(obDirectDebit.getDirectDebitId())
//                .mandateIdentification(toFRMandateRelatedInformation(obDirectDebit.getMandateRelatedInformation()))
//                .directDebitStatusCode(toFRDirectDebitStatus(obDirectDebit.getDirectDebitStatusCode()))
//                .name(obDirectDebit.getName())
//                .previousPaymentDateTime(obDirectDebit.getPreviousPaymentDateTime())
//                .frequency(obDirectDebit.getFrequency())
//                .previousPaymentAmount(FRAmountConverterV4.toFRAmount(obDirectDebit.getPreviousPaymentAmount()))
//                .build();
//    }
//
//    public static FRMandateRelatedInformation toFRMandateRelatedInformation(OBMandateRelatedInformation1 obMandateRelatedInformation1) {
//        return obMandateRelatedInformation1 == null ? null : FRMandateRelatedInformation.builder()
//                .categoryPurposeCode(toFRExternalCategoryPurposeCode(obMandateRelatedInformation1.getCategoryPurposeCode()))
//                .classification(toFRExternalMandateClassificationCode(obMandateRelatedInformation1.getClassification()))
//                .finalPaymentDateTime(obMandateRelatedInformation1.getFinalPaymentDateTime())
//                .firstPaymentDateTime(obMandateRelatedInformation1.getFirstPaymentDateTime())
//                .mandateIdentification(obMandateRelatedInformation1.getMandateIdentification())
//                .reason(obMandateRelatedInformation1.getReason())
//                .recurringPaymentDateTime(obMandateRelatedInformation1.getRecurringPaymentDateTime())
//                .frequency(obMandateRelatedInformation1.getFrequency())
//                .build();
//    }
//
//    public static FRDirectDebitData.FRDirectDebitStatus toFRDirectDebitStatus(ExternalMandateStatus1Code status) {
//        return status == null ? null : FRDirectDebitData.FRDirectDebitStatus.valueOf(status.name());
//    }
//
//    public static FRExternalCategoryPurposeCode toFRExternalCategoryPurposeCode(ExternalCategoryPurpose1Code externalCategoryPurpose1Code) {
//        return externalCategoryPurpose1Code == null ? null : FRExternalCategoryPurposeCode.valueOf(externalCategoryPurpose1Code.name());
//    }
//    public static FRExternalMandateClassificationCode toFRExternalMandateClassificationCode(OBExternalMandateClassification1Code externalMandateClassification1Code) {
//        return externalMandateClassification1Code == null ? null : FRExternalMandateClassificationCode.valueOf(externalMandateClassification1Code.name());
//    }
//
//}
