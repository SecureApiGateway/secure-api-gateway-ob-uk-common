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

import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWritePaymentDetails1Status;
import uk.org.openbanking.datamodel.v4.payment.OBWritePaymentDetails1StatusDetailStatus;

public class FRPaymentDetailsStatusConverter {

    private static final Map<String, String> v3tov4PaymentDetailsStatus;

    private static final Map<String, String> v4tov3PaymentDetailsStatus;

    private static final Map<String, String> v3tov4VrpPaymentDetailsStatus;

    static {
        final Map<String, String> paymentDetailsStatusTransalations = new HashMap<>();
        paymentDetailsStatusTransalations.put("Pending", "PDNG");
        paymentDetailsStatusTransalations.put("AcceptedTechnicalValidation", "ACTC");
        paymentDetailsStatusTransalations.put("PartiallyAcceptedTechnicalCorrect", "PATC");
        paymentDetailsStatusTransalations.put("AcceptedCustomerProfile", "ACCP");
        paymentDetailsStatusTransalations.put("AcceptedFundsChecked", "ACFC");
        paymentDetailsStatusTransalations.put("AcceptedSettlementInProcess", "ACSP");
        paymentDetailsStatusTransalations.put("AcceptedWithChange", "ACWC");
        paymentDetailsStatusTransalations.put("AcceptedSettlementCompleted", "ACSC");
        paymentDetailsStatusTransalations.put("AcceptedWithoutPosting", "ACWP");
        paymentDetailsStatusTransalations.put("AcceptedSettlementCompletedCreditorAccount", "ACCC");
        paymentDetailsStatusTransalations.put("Blocked", "BLCK");
        paymentDetailsStatusTransalations.put("Rejected", "RJCT");

        v3tov4PaymentDetailsStatus = Collections.unmodifiableMap(paymentDetailsStatusTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3PaymentDetailsStatus = paymentDetailsStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    private static final Map<String, String> paymentDetailsStatusTranslations = new HashMap<>();

    static {

        final Map<String, String> vrpPaymentDetailsStatusTransalations = new HashMap<>();

        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDCANCELLATIONREQUEST.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDCREDITSETTLEMENTCOMPLETED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACSC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDCUSTOMERPROFILE.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCP.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDFUNDSCHECKED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACFC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDSETTLEMENTCOMPLETED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACSC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDSETTLEMENTINPROCESS.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACSP.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDTECHNICALVALIDATION.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACTC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDWITHCHANGE.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACWC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCEPTEDWITHOUTPOSTING.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACWP.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.CANCELLED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.CANC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.NOCANCELLATIONPROCESS.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.BLCK.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PARTIALLYACCEPTEDCANCELLATIONREQUEST.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PARTIALLYACCEPTEDTECHNICALCORRECT.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.ACCC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PAYMENTCANCELLED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.CANC.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PENDING.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PDNG.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PENDINGCANCELLATIONREQUEST.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.PDNG.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.RECEIVED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.RCVD.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.REJECTED.getValue(),
                                             uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.RJCT.getValue());
        vrpPaymentDetailsStatusTransalations.put(OBDomesticVRPDetailsDataPaymentStatusInnerStatus.REJECTEDCANCELLATIONREQUEST.getValue(),
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

    public static uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus toOBDomesticVRPDetailsDataPaymentStatusInnerStatus(String consentStatus) {
        if (v3tov4PaymentDetailsStatus.containsKey(consentStatus)) {
            return uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPDetailsDataPaymentStatusInnerStatus.fromValue(v3tov4VrpPaymentDetailsStatus.get(consentStatus));
        }
        throw new IllegalArgumentException("Unknown consent status: " + consentStatus);
    }

    //TODO - add for other payment details types
}
