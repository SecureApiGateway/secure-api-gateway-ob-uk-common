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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRScheduledPaymentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRFinancialInstrumentConverter;
import uk.org.openbanking.datamodel.v3.account.OBExternalScheduleType1Code;
import uk.org.openbanking.datamodel.v3.account.OBScheduledPayment3;

public class FRScheduledPaymentConverter {

    // OB to FR
    public static FRScheduledPaymentData toFRScheduledPaymentData(OBScheduledPayment3 scheduledPayment) {
        return scheduledPayment == null ? null : FRScheduledPaymentData.builder()
                .accountId(scheduledPayment.getAccountId())
                .scheduledPaymentId(scheduledPayment.getScheduledPaymentId())
                .scheduledPaymentDateTime(scheduledPayment.getScheduledPaymentDateTime())
                .scheduledType(toFRScheduleType(scheduledPayment.getScheduledType()))
                .reference(scheduledPayment.getReference())
                .debtorReference(scheduledPayment.getDebtorReference())
                .instructedAmount(FRAmountConverter.toFRAmount(scheduledPayment.getInstructedAmount()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(scheduledPayment.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(scheduledPayment.getCreditorAccount()))
                .build();
    }

    public static FRScheduledPaymentData.FRScheduleType toFRScheduleType(OBExternalScheduleType1Code scheduledType) {
        return scheduledType == null ? null : FRScheduledPaymentData.FRScheduleType.valueOf(scheduledType.name());
    }

    // FR to OB
    public static OBScheduledPayment3 toOBScheduledPayment3(FRScheduledPaymentData scheduledPaymentData) {
        return scheduledPaymentData == null ? null : new OBScheduledPayment3()
                .accountId(scheduledPaymentData.getAccountId())
                .scheduledPaymentId(scheduledPaymentData.getScheduledPaymentId())
                .scheduledPaymentDateTime(scheduledPaymentData.getScheduledPaymentDateTime())
                .scheduledType(toOBExternalScheduleType1Code(scheduledPaymentData.getScheduledType()))
                .reference(scheduledPaymentData.getReference())
                .debtorReference(scheduledPaymentData.getDebtorReference())
                .instructedAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount1(scheduledPaymentData.getInstructedAmount()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBBranchAndFinancialInstitutionIdentification51(scheduledPaymentData.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBCashAccount51(scheduledPaymentData.getCreditorAccount()));
    }

    public static OBExternalScheduleType1Code toOBExternalScheduleType1Code(FRScheduledPaymentData.FRScheduleType scheduledType) {
        return scheduledType == null ? null : OBExternalScheduleType1Code.valueOf(scheduledType.name());
    }

}
