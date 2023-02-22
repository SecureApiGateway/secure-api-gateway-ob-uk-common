/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialCreditor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRResponseDataRefund;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRInternationalResponseDataRefund;
import uk.org.openbanking.datamodel.payment.*;
import uk.org.openbanking.datamodel.vrp.OBCashAccountDebtorWithName;

/**
 * Converter for {@link FRResponseDataRefund} and {@link FRInternationalResponseDataRefund} into equivalent OB objects.
 */
public class FRResponseDataRefundConverter {

    public static OBWriteDomesticResponse4DataRefund toOBWriteDomesticResponse4DataRefund(FRResponseDataRefund refund) {
        return refund == null ? null : new OBWriteDomesticResponse4DataRefund()
                .account(toOBWriteDomesticResponse4DataRefundAccount(refund.getAccount()));
    }

    public static OBWriteDomesticResponse5DataRefund toOBWriteDomesticResponse5DataRefund(FRResponseDataRefund refund) {
        return refund == null ? null : new OBWriteDomesticResponse5DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()));
    }

    public static OBWriteInternationalResponse4DataRefund toOBWriteInternationalResponse4DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalResponse4DataRefund()
                .account(toOBWriteDomesticResponse4DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalResponse4DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse4DataRefundAgent(refund.getAgent()));
    }

    public static OBWriteInternationalResponse5DataRefund toOBWriteInternationalResponse5DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalResponse5DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalResponse5DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse5DataRefundAgent(refund.getAgent()));
    }

    public static OBWriteInternationalStandingOrderResponse7DataRefund toOBWriteInternationalStandingOrderResponse7DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalStandingOrderResponse7DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalStandingOrderResponse7DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalResponse5DataRefundAgent(refund.getAgent()));
    }

    public static OBWriteInternationalRefundResponse1DataRefund toOBWriteInternationalRefundResponse1DataRefund(FRInternationalResponseDataRefund refund) {
        return refund == null ? null : new OBWriteInternationalRefundResponse1DataRefund()
                .account(toOBWriteDomesticResponse4DataRefundAccount(refund.getAccount()))
                .creditor(toOBWriteInternationalRefundResponse1DataRefundCreditor(refund.getCreditor()))
                .agent(toOBWriteInternationalRefundResponse1DataRefundAgent(refund.getAgent()));
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

    private static OBWriteDomesticResponse4DataRefundAccount toOBWriteDomesticResponse4DataRefundAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBWriteDomesticResponse4DataRefundAccount()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }

    private static OBWriteDomesticResponse5DataRefundAccount toOBWriteDomesticResponse5DataRefundAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBWriteDomesticResponse5DataRefundAccount()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }

    private static OBWriteInternationalResponse4DataRefundCreditor toOBWriteInternationalResponse4DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalResponse4DataRefundCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalResponse5DataRefundCreditor toOBWriteInternationalResponse5DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalResponse5DataRefundCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalStandingOrderResponse7DataRefundCreditor toOBWriteInternationalStandingOrderResponse7DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalStandingOrderResponse7DataRefundCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalRefundResponse1DataRefundCreditor toOBWriteInternationalRefundResponse1DataRefundCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalRefundResponse1DataRefundCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    private static OBWriteInternationalResponse4DataRefundAgent toOBWriteInternationalResponse4DataRefundAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalResponse4DataRefundAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }

    private static OBWriteInternationalResponse5DataRefundAgent toOBWriteInternationalResponse5DataRefundAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalResponse5DataRefundAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }

    private static OBWriteInternationalRefundResponse1DataRefundAgent toOBWriteInternationalRefundResponse1DataRefundAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalRefundResponse1DataRefundAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }

}
