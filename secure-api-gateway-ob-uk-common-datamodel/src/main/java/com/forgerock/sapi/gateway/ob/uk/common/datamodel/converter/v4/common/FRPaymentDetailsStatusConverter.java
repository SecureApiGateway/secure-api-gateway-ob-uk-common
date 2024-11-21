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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSubmissionStatus.INITIATIONPENDING;
import static java.util.stream.Collectors.toMap;
import static uk.org.openbanking.datamodel.v3.payment.OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus.*;
import static uk.org.openbanking.datamodel.v4.payment.OBWritePaymentDetails1Status.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSubmissionStatus;

import uk.org.openbanking.datamodel.v4.payment.OBWritePaymentDetails1Status;
import uk.org.openbanking.datamodel.v4.payment.OBWritePaymentDetails1StatusDetailStatus;

public class FRPaymentDetailsStatusConverter {

    private static final Map<String, String> v3tov4PaymentDetailsStatus;

    private static final Map<String, String> v3tov4VrpPaymentDetailsStatus;
    private static final Map<String, String> paymentDetailsStatusTranslations = new HashMap<>();

    static {
        final Map<String, String> paymentDetailsStatusTransalations = new HashMap<>();
        paymentDetailsStatusTransalations.put(PENDING.getValue(), PDNG.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDTECHNICALVALIDATION.getValue(), ACTC.getValue());
        paymentDetailsStatusTransalations.put(PARTIALLYACCEPTEDTECHNICALCORRECT.getValue(), PATC.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDCUSTOMERPROFILE.getValue(), ACCP.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDFUNDSCHECKED.getValue(), ACFC.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDSETTLEMENTINPROCESS.getValue(), ACSP.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDWITHCHANGE.getValue(), ACWC.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDSETTLEMENTCOMPLETED.getValue(), ACSC.getValue());
        paymentDetailsStatusTransalations.put(ACCEPTEDWITHOUTPOSTING.getValue(), ACWP.getValue());
        paymentDetailsStatusTransalations.put(REJECTED.getValue(), RJCT.getValue());
        paymentDetailsStatusTransalations.put("AcceptedSettlementCompletedCreditorAccount", ACCC.getValue());
        paymentDetailsStatusTransalations.put("Blocked", BLCK.getValue());
        paymentDetailsStatusTransalations.put(INITIATIONPENDING.getValue(), PDNG.getValue());

        v3tov4PaymentDetailsStatus = Collections.unmodifiableMap(paymentDetailsStatusTransalations);

    }

    static {

        final Map<String, String> vrpPaymentDetailsStatusTransalations = new HashMap<>();

        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDCANCELLATIONREQUEST.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCC.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDCREDITSETTLEMENTCOMPLETED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACSC.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDCUSTOMERPROFILE.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCP.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDFUNDSCHECKED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACFC.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDSETTLEMENTCOMPLETED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACSC.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDSETTLEMENTINPROCESS.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACSP.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDTECHNICALVALIDATION.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACTC.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDWITHCHANGE.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACWC.getValue());
        vrpPaymentDetailsStatusTransalations.put(ACCEPTEDWITHOUTPOSTING.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACWP.getValue());
        vrpPaymentDetailsStatusTransalations.put(CANCELLED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.CANC.getValue());
        vrpPaymentDetailsStatusTransalations.put(NOCANCELLATIONPROCESS.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.BLCK.getValue());
        vrpPaymentDetailsStatusTransalations.put(PARTIALLYACCEPTEDCANCELLATIONREQUEST.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCC.getValue());
        vrpPaymentDetailsStatusTransalations.put(PARTIALLYACCEPTEDTECHNICALCORRECT.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCC.getValue());
        vrpPaymentDetailsStatusTransalations.put(PAYMENTCANCELLED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.CANC.getValue());
        vrpPaymentDetailsStatusTransalations.put(PENDING.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PDNG.getValue());
        vrpPaymentDetailsStatusTransalations.put(PENDINGCANCELLATIONREQUEST.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PDNG.getValue());
        vrpPaymentDetailsStatusTransalations.put(RECEIVED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.RCVD.getValue());
        vrpPaymentDetailsStatusTransalations.put(REJECTED.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.RJCT.getValue());
        vrpPaymentDetailsStatusTransalations.put(REJECTEDCANCELLATIONREQUEST.getValue(),
                                                 uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.RJCT.getValue());

        v3tov4VrpPaymentDetailsStatus = Collections.unmodifiableMap(vrpPaymentDetailsStatusTransalations);
    }

    public static OBWritePaymentDetails1Status toOBPaymentDetailsStatus(String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return OBWritePaymentDetails1Status.fromValue(v3tov4PaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static OBWritePaymentDetails1StatusDetailStatus toOBWritePaymentDetails1StatusDetailStatus(String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return OBWritePaymentDetails1StatusDetailStatus.fromValue(v3tov4PaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    public static uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus toOBDomesticVRPDetailsDataPaymentStatusInnerStatus(
            String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.fromValue(
                    v3tov4VrpPaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

}
