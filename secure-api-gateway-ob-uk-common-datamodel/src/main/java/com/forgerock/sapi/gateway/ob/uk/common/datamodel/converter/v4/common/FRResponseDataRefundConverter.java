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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialCreditor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRResponseDataRefund;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.payment.FRInternationalResponseDataRefund;
import uk.org.openbanking.datamodel.v4.payment.*;
import uk.org.openbanking.datamodel.v4.vrp.OBCashAccountDebtorWithName;

/**
 * Converter for {@link FRResponseDataRefund} and {@link FRInternationalResponseDataRefund} into equivalent OB objects.
 */
public class FRResponseDataRefundConverter {

    public static OBWriteDomesticResponse5DataRefund toOBWriteDomesticResponse5DataRefund(FRResponseDataRefund refund) {
        return refund == null ? null : new OBWriteDomesticResponse5DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()));
    }
    // TODO - fix methods when implementing international payments
    /*public static OBWriteInternationalResponse5DataRefund toOBWriteInternationalResponse5DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalResponse5DataRefund()
                .account(toOBWriteInternationalResponse5DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalResponse5DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse5DataRefundAgent(refund.getAgent()));
    }

    public static OBWriteInternationalStandingOrderResponse7DataRefund toOBWriteInternationalStandingOrderResponse7DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalStandingOrderResponse7DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalStandingOrderResponse7DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse5DataRefundAgent(refund.getAgent()));
    }*/

    public static OBCashAccountDebtorWithName toOBCashAccountDebtorWithName(FRResponseDataRefund refund) {
        return refund == null ? null : toOBCashAccountDebtorWithNameAccount(refund.getAccount());
    }

    private static OBCashAccountDebtorWithName toOBCashAccountDebtorWithNameAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBCashAccountDebtorWithName()
                .identification(account.getIdentification())
                .name(account.getName())
                .schemeName(account.getSchemeName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }

    private static OBWriteDomesticResponse5DataRefundAccount toOBWriteDomesticResponse5DataRefundAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBWriteDomesticResponse5DataRefundAccount()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }

    private static OBWriteInternationalResponse5DataRefundAccount toOBWriteInternationalResponse5DataRefundAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBWriteInternationalResponse5DataRefundAccount()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }

    /*private static OBWriteInternationalResponse5DataRefundCreditor toOBWriteInternationalResponse5DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalResponse5DataRefundCreditor()
                .name(creditor.getName())
                .postalAddress(com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalStandingOrderResponse7DataRefundCreditor toOBWriteInternationalStandingOrderResponse7DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalStandingOrderResponse7DataRefundCreditor()
                .name(creditor.getName())
                .postalAddress(com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalResponse5DataRefundAgent toOBWriteInternationalResponse5DataRefundAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalResponse5DataRefundAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }*/

}
