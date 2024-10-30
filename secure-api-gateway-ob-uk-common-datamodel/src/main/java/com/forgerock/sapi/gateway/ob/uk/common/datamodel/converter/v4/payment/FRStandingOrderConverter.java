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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRMandateRelatedInformation;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRStandingOrderData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRFinancialInstrumentConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRExternalCategoryPurposeCode;
import uk.org.openbanking.datamodel.v4.account.ExternalMandateStatus1Code;
import uk.org.openbanking.datamodel.v4.account.OBExternalMandateClassification1Code;
import uk.org.openbanking.datamodel.v4.account.OBMandateRelatedInformation1;
import uk.org.openbanking.datamodel.v4.account.OBStandingOrder6;
import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRExternalMandateStatusConverter.toExternalMandateStatus1CodeV4;

public class FRStandingOrderConverter {

    // FR to OB
    public static OBStandingOrder6 toOBStandingOrder6(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder6()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .lastPaymentDateTime(standingOrder.getLastPaymentDateTime())
                .standingOrderStatusCode(toExternalMandateStatus1CodeV4(String.valueOf(standingOrder.getStandingOrderStatusCode())))
                .firstPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount2(standingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount3(standingOrder.getNextPaymentAmount()))
                .lastPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount11(standingOrder.getLastPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount4(standingOrder.getFinalPaymentAmount()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification51(standingOrder.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBCashAccount51(standingOrder.getCreditorAccount()))
                .mandateRelatedInformation(toOBMandateRelatedInformation1(standingOrder.getMandateRelatedInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(standingOrder.getSupplementaryData()));
    }

    public static OBMandateRelatedInformation1 toOBMandateRelatedInformation1(FRMandateRelatedInformation mandateRelatedInformation) {
        return mandateRelatedInformation == null ? null : new OBMandateRelatedInformation1()
                .categoryPurposeCode(mandateRelatedInformation.getCategoryPurposeCode())
                .classification(toOBExternalMandateClassification1Code(mandateRelatedInformation.getClassification()))
                .finalPaymentDateTime(mandateRelatedInformation.getFinalPaymentDateTime())
                .firstPaymentDateTime(mandateRelatedInformation.getFirstPaymentDateTime())
                .mandateIdentification(mandateRelatedInformation.getMandateIdentification())
                .reason(mandateRelatedInformation.getReason())
                .recurringPaymentDateTime(mandateRelatedInformation.getRecurringPaymentDateTime());
    }

    public static ExternalMandateStatus1Code toOBExternalStandingOrderStatus1Code(FRStandingOrderData.FRStandingOrderStatus standingOrderStatusCode) {
        return standingOrderStatusCode == null ? null : ExternalMandateStatus1Code.valueOf(standingOrderStatusCode.name());
    }

    public static OBExternalMandateClassification1Code toOBExternalMandateClassification1Code(FRMandateRelatedInformation.FRExternalMandateClassificationCode externalMandateClassificationCode) {
        return externalMandateClassificationCode == null ? null : OBExternalMandateClassification1Code.valueOf(externalMandateClassificationCode.name());
    }


    // OB to FR
    public static FRStandingOrderData toFRStandingOrderData(OBStandingOrder6 obStandingOrder) {
        return obStandingOrder != null ? FRStandingOrderData.builder()
                .accountId(obStandingOrder.getAccountId())
                .standingOrderId(obStandingOrder.getStandingOrderId())
                .nextPaymentDateTime(obStandingOrder.getNextPaymentDateTime())
                .lastPaymentDateTime(obStandingOrder.getLastPaymentDateTime())
                .standingOrderStatusCode(toFRStandingOrderStatus(obStandingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getNextPaymentAmount()))
                .lastPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getLastPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getFinalPaymentAmount()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(obStandingOrder.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(obStandingOrder.getCreditorAccount()))
                .mandateRelatedInformation(toFRMandateRelatedInformation(obStandingOrder.getMandateRelatedInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(obStandingOrder.getSupplementaryData()))
                .build() : null;
    }

    public static FRMandateRelatedInformation toFRMandateRelatedInformation(OBMandateRelatedInformation1 obMandateRelatedInformation1) {
        return obMandateRelatedInformation1 == null ? null : FRMandateRelatedInformation.builder()
                .categoryPurposeCode(obMandateRelatedInformation1.getCategoryPurposeCode())
                .classification(toFRExternalMandateClassificationCode(obMandateRelatedInformation1.getClassification()))
                .finalPaymentDateTime(obMandateRelatedInformation1.getFinalPaymentDateTime())
                .firstPaymentDateTime(obMandateRelatedInformation1.getFirstPaymentDateTime())
                .mandateIdentification(obMandateRelatedInformation1.getMandateIdentification())
                .reason(obMandateRelatedInformation1.getReason())
                .recurringPaymentDateTime(obMandateRelatedInformation1.getRecurringPaymentDateTime())
                .build();
    }

    public static FRStandingOrderData.FRStandingOrderStatus toFRStandingOrderStatus(ExternalMandateStatus1Code standingOrderStatusCode) {
        return standingOrderStatusCode == null ? null : FRStandingOrderData.FRStandingOrderStatus.valueOf(standingOrderStatusCode.name());
    }

    public static FRExternalCategoryPurposeCode toFRExternalCategoryPurposeCode(ExternalCategoryPurpose1Code externalCategoryPurpose1Code) {
        return externalCategoryPurpose1Code == null ? null : FRExternalCategoryPurposeCode.valueOf(externalCategoryPurpose1Code.name());
    }

    public static FRMandateRelatedInformation.FRExternalMandateClassificationCode toFRExternalMandateClassificationCode(OBExternalMandateClassification1Code externalMandateClassification1Code) {
        return externalMandateClassification1Code == null ? null : FRMandateRelatedInformation.FRExternalMandateClassificationCode.valueOf(externalMandateClassification1Code.name());
    }
}
