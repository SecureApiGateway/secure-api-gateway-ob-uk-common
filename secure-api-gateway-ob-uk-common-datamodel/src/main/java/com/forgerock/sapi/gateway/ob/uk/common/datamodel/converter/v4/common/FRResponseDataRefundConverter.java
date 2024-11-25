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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialCreditor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRResponseDataRefund;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRInternationalResponseDataRefund;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticResponse5DataRefund;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticResponse5DataRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalResponse5DataRefund;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalResponse5DataRefundAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalResponse5DataRefundAgent;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalResponse5DataRefundCreditor;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduledResponse6DataRefund;
import uk.org.openbanking.datamodel.v4.vrp.OBCashAccountDebtorWithName;

/**
 * Converter for {@link FRResponseDataRefund} and {@link FRInternationalResponseDataRefund} into equivalent OB objects.
 */
public class FRResponseDataRefundConverter {

    // FR to OB
    public static OBWriteDomesticResponse5DataRefund toOBWriteDomesticResponse5DataRefund(FRResponseDataRefund refund) {
        return refund == null ? null : new OBWriteDomesticResponse5DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()));
    }

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

    public static OBWriteInternationalResponse5DataRefund toOBWriteInternationalResponse5DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalResponse5DataRefund()
                .account(toOBWriteInternationalResponse5DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalResponse5DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse5DataRefundAgent(refund.getAgent()));
    }

    private static OBWriteInternationalResponse5DataRefundAccount toOBWriteInternationalResponse5DataRefundAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBWriteInternationalResponse5DataRefundAccount()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification())
                .proxy(FRProxyConverter.toOBProxy1(account.getProxy()));
    }

    private static OBWriteInternationalResponse5DataRefundCreditor toOBWriteInternationalResponse5DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalResponse5DataRefundCreditor()
                .name(creditor.getName())
                .LEI(creditor.getLEI())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalResponse5DataRefundAgent toOBWriteInternationalResponse5DataRefundAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalResponse5DataRefundAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(agent.getPostalAddress()));
    }

    // International scheduled payments
    public static OBWriteInternationalScheduledResponse6DataRefund toOBWriteInternationalScheduledResponse6DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalScheduledResponse6DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalResponse5DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse5DataRefundAgent(refund.getAgent()));
    }
}
