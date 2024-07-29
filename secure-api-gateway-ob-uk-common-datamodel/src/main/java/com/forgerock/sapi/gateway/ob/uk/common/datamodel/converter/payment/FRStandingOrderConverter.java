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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRStandingOrderData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRFinancialInstrumentConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRSupplementaryDataConverter;

import uk.org.openbanking.datamodel.account.OBExternalStandingOrderStatus1Code;
import uk.org.openbanking.datamodel.account.OBStandingOrder6;

public class FRStandingOrderConverter {

    // FR to OB
    public static OBStandingOrder6 toOBStandingOrder6(FRStandingOrderData standingOrder) {
        return standingOrder == null ? null : new OBStandingOrder6()
                .accountId(standingOrder.getAccountId())
                .standingOrderId(standingOrder.getStandingOrderId())
                .frequency(standingOrder.getFrequency())
                .reference(standingOrder.getReference())
                .firstPaymentDateTime(standingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(standingOrder.getNextPaymentDateTime())
                .lastPaymentDateTime(standingOrder.getLastPaymentDateTime())
                .finalPaymentDateTime(standingOrder.getFinalPaymentDateTime())
                .numberOfPayments(standingOrder.getNumberOfPayments())
                .standingOrderStatusCode(toOBExternalStandingOrderStatus1Code(standingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount2(standingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount3(standingOrder.getNextPaymentAmount()))
                .lastPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount11(standingOrder.getLastPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount4(standingOrder.getFinalPaymentAmount()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification51(standingOrder.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBCashAccount51(standingOrder.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(standingOrder.getSupplementaryData()));
    }

    public static OBExternalStandingOrderStatus1Code toOBExternalStandingOrderStatus1Code(FRStandingOrderData.FRStandingOrderStatus standingOrderStatusCode) {
        return standingOrderStatusCode == null ? null : OBExternalStandingOrderStatus1Code.valueOf(standingOrderStatusCode.name());
    }

    // OB to FR
    public static FRStandingOrderData toFRStandingOrderData(OBStandingOrder6 obStandingOrder) {
        return obStandingOrder == null ? null : FRStandingOrderData.builder()
                .accountId(obStandingOrder.getAccountId())
                .standingOrderId(obStandingOrder.getStandingOrderId())
                .frequency(obStandingOrder.getFrequency())
                .reference(obStandingOrder.getReference())
                .firstPaymentDateTime(obStandingOrder.getFirstPaymentDateTime())
                .nextPaymentDateTime(obStandingOrder.getNextPaymentDateTime())
                .lastPaymentDateTime(obStandingOrder.getLastPaymentDateTime())
                .finalPaymentDateTime(obStandingOrder.getFinalPaymentDateTime())
                .numberOfPayments(obStandingOrder.getNumberOfPayments())
                .standingOrderStatusCode(toFRStandingOrderStatus(obStandingOrder.getStandingOrderStatusCode()))
                .firstPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getFirstPaymentAmount()))
                .nextPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getNextPaymentAmount()))
                .lastPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getLastPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toFRAmount(obStandingOrder.getFinalPaymentAmount()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(obStandingOrder.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(obStandingOrder.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(obStandingOrder.getSupplementaryData()))
                .build();
    }

    public static FRStandingOrderData.FRStandingOrderStatus toFRStandingOrderStatus(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        return standingOrderStatusCode == null ? null : FRStandingOrderData.FRStandingOrderStatus.valueOf(standingOrderStatusCode.name());
    }
}
