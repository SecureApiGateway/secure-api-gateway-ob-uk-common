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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSubmissionStatus;

import uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus1Code;
import uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus2Code;
import uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus3Code;
import uk.org.openbanking.datamodel.v4.payment.ExternalPaymentTransactionStatus4Code;
import uk.org.openbanking.datamodel.v4.vrp.ExternalPaymentTransactionStatus5Code;

public class FRSubmissionStatusConverter {

    // FR to OB

    // Domestic Payments - ExternalPaymentTransactionStatus3Code
    public static ExternalPaymentTransactionStatus3Code toOBWriteDomesticResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case PENDING:
            return ExternalPaymentTransactionStatus3Code.PDNG;
        case ACCEPTEDSETTLEMENTINPROCESS:
            return ExternalPaymentTransactionStatus3Code.ACSP;
        case ACCEPTEDSETTLEMENTCOMPLETED:
        case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
        case ACCEPTEDWITHOUTPOSTING:
            return ExternalPaymentTransactionStatus3Code.ACSC;
        default:
            return ExternalPaymentTransactionStatus3Code.RJCT;
        }
    }

    // Domestic Scheduled Payments - ExternalPaymentTransactionStatus2Code
    public static ExternalPaymentTransactionStatus2Code toOBWriteDomesticScheduledResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return ExternalPaymentTransactionStatus2Code.PDNG;
        case INITIATIONCOMPLETED:
            return ExternalPaymentTransactionStatus2Code.ACCP;
        //instead of ExternalPaymentTransactionStatus2Code.INCO
        case CANCELLED:
            return ExternalPaymentTransactionStatus2Code.CANC;
        default:
            return ExternalPaymentTransactionStatus2Code.RJCT;
        // might as well be blocked, in which case -> return ExternalPaymentTransactionStatus2Code.BLCK;
        }
    }

    // Domestic Standing Orders - ExternalPaymentTransactionStatus1Code
    public static ExternalPaymentTransactionStatus1Code toOBWriteDomesticStandingOrderResponse6DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return ExternalPaymentTransactionStatus1Code.PDNG;
        case INITIATIONCOMPLETED:
            return ExternalPaymentTransactionStatus1Code.INCO;
        case CANCELLED:
            return ExternalPaymentTransactionStatus1Code.CANC;
        default:
            return ExternalPaymentTransactionStatus1Code.RJCT;
        // might as well be blocked, in which case -> return ExternalPaymentTransactionStatus1Code.BLCK;
        }
    }

    // v3.1.5 - File Payments - ExternalPaymentTransactionStatus4Code
    public static ExternalPaymentTransactionStatus4Code toOBWriteFileResponse3DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return ExternalPaymentTransactionStatus4Code.PDNG;
        case INITIATIONCOMPLETED:
            return ExternalPaymentTransactionStatus4Code.INCO;
        default:
            return ExternalPaymentTransactionStatus4Code.INFA;
        }
    }

    // International Payments - ExternalPaymentTransactionStatus3Code
    public static ExternalPaymentTransactionStatus3Code toOBWriteInternationalResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case PENDING:
            return ExternalPaymentTransactionStatus3Code.PDNG;
        default:
            return ExternalPaymentTransactionStatus3Code.RJCT;
        // might as well be blocked, in which case -> return ExternalPaymentTransactionStatus3Code.BLCK;
        }
    }

    // International Standing Orders - ExternalPaymentTransactionStatus1Code
    public static ExternalPaymentTransactionStatus1Code toOBWriteInternationalStandingOrderResponse7DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return ExternalPaymentTransactionStatus1Code.PDNG;
        case INITIATIONCOMPLETED:
            return ExternalPaymentTransactionStatus1Code.INCO;
        case CANCELLED:
            return ExternalPaymentTransactionStatus1Code.CANC;
        default:
            return ExternalPaymentTransactionStatus1Code.INFA;
        }
    }

    // vrp 3.1.x
    public static FRSubmissionStatus toFRSubmissionStatus(ExternalPaymentTransactionStatus5Code status) {
        if (status == null) {
            return null;
        }
        return FRSubmissionStatus.fromValue(status.getValue());
    }

    public static ExternalPaymentTransactionStatus5Code toOBDomesticVRPResponseDataStatusEnum(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        return ExternalPaymentTransactionStatus5Code.fromValue(FRPaymentDetailsStatusConverter.toOBDomesticVRPDetailsDataPaymentStatusInnerStatus(status.getValue()).getValue());
    }

    // International Scheduled Payments - ExternalPaymentTransactionStatus2Code
    public static ExternalPaymentTransactionStatus2Code toOBWriteInternationalScheduledResponse6DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return ExternalPaymentTransactionStatus2Code.PDNG;
        default:
            return ExternalPaymentTransactionStatus2Code.BLCK;
        }
    }

}
