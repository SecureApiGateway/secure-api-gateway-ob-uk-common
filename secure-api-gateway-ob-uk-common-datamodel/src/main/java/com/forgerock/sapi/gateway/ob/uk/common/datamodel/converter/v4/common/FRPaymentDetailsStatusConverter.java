/*
 * Copyright © 2020-2026 Ping Identity Corporation (obst@forgerock.com)
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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSubmissionStatus.INITIATIONPENDING;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDCANCELLATIONREQUEST;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDCREDITSETTLEMENTCOMPLETED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDCUSTOMERPROFILE;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDFUNDSCHECKED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDSETTLEMENTCOMPLETED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDSETTLEMENTINPROCESS;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDTECHNICALVALIDATION;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDWITHCHANGE;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.ACCEPTEDWITHOUTPOSTING;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.CANCELLED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.NOCANCELLATIONPROCESS;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.PARTIALLYACCEPTEDCANCELLATIONREQUEST;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.PARTIALLYACCEPTEDTECHNICALCORRECT;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.PAYMENTCANCELLED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.PENDING;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.PENDINGCANCELLATIONREQUEST;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.RECEIVED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.REJECTED;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.REJECTEDCANCELLATIONREQUEST;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACCC;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACCP;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACFC;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACSC;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACSP;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACTC;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACWC;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.ACWP;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.BLCK;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.PATC;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.PDNG;
import static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.RJCT;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class FRPaymentDetailsStatusConverter {

    private static final Map<String, String> v3tov4PaymentDetailsStatus;

    private static final Map<String, String> v3tov4VrpPaymentDetailsStatus;
    private static final Map<String, String> paymentDetailsStatusTranslations = new HashMap<>();

    static {
        final Map<String, String> paymentDetailsStatusTranslations = new HashMap<>();
        paymentDetailsStatusTranslations.put(PENDING.getValue(), PDNG.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDTECHNICALVALIDATION.getValue(), ACTC.getValue());
        paymentDetailsStatusTranslations.put(PARTIALLYACCEPTEDTECHNICALCORRECT.getValue(), PATC.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDCUSTOMERPROFILE.getValue(), ACCP.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDFUNDSCHECKED.getValue(), ACFC.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDSETTLEMENTINPROCESS.getValue(), ACSP.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDWITHCHANGE.getValue(), ACWC.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDSETTLEMENTCOMPLETED.getValue(), ACSC.getValue());
        paymentDetailsStatusTranslations.put(ACCEPTEDWITHOUTPOSTING.getValue(), ACWP.getValue());
        paymentDetailsStatusTranslations.put(REJECTED.getValue(), RJCT.getValue());
        paymentDetailsStatusTranslations.put("AcceptedSettlementCompletedCreditorAccount", ACCC.getValue());
        paymentDetailsStatusTranslations.put("Blocked", BLCK.getValue());
        paymentDetailsStatusTranslations.put(INITIATIONPENDING.getValue(), PDNG.getValue());

        v3tov4PaymentDetailsStatus = Collections.unmodifiableMap(paymentDetailsStatusTranslations);

    }

    static {

        final Map<String, String> vrpPaymentDetailsStatusTranslations = new HashMap<>();

        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDCANCELLATIONREQUEST.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACCC.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDCREDITSETTLEMENTCOMPLETED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACSC.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDCUSTOMERPROFILE.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACCP.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDFUNDSCHECKED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACFC.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDSETTLEMENTCOMPLETED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACSC.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDSETTLEMENTINPROCESS.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACSP.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDTECHNICALVALIDATION.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACTC.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDWITHCHANGE.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACWC.getValue());
        vrpPaymentDetailsStatusTranslations.put(ACCEPTEDWITHOUTPOSTING.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACWP.getValue());
        vrpPaymentDetailsStatusTranslations.put(CANCELLED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.CANC.getValue());
        vrpPaymentDetailsStatusTranslations.put(NOCANCELLATIONPROCESS.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.BLCK.getValue());
        vrpPaymentDetailsStatusTranslations.put(PARTIALLYACCEPTEDCANCELLATIONREQUEST.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACCC.getValue());
        vrpPaymentDetailsStatusTranslations.put(PARTIALLYACCEPTEDTECHNICALCORRECT.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.ACCC.getValue());
        vrpPaymentDetailsStatusTranslations.put(PAYMENTCANCELLED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.CANC.getValue());
        vrpPaymentDetailsStatusTranslations.put(PENDING.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.PDNG.getValue());
        vrpPaymentDetailsStatusTranslations.put(PENDINGCANCELLATIONREQUEST.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.PDNG.getValue());
        vrpPaymentDetailsStatusTranslations.put(RECEIVED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.RCVD.getValue());
        vrpPaymentDetailsStatusTranslations.put(REJECTED.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.RJCT.getValue());
        vrpPaymentDetailsStatusTranslations.put(REJECTEDCANCELLATIONREQUEST.getValue(),
                uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.RJCT.getValue());

        v3tov4VrpPaymentDetailsStatus = Collections.unmodifiableMap(vrpPaymentDetailsStatusTranslations);
    }

    public static uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code toOBPaymentDetailsStatus(String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code.fromValue(v3tov4PaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code toOBWritePaymentDetails1StatusDetailStatus(String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.fromValue(v3tov4PaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code toOBDomesticVRPDetailsDataPaymentStatusInnerStatus(
            String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus1Code.fromValue(
                    v3tov4VrpPaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

}
