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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSubmissionStatus;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticResponse5DataStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledResponse5DataStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrderResponse6DataStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFileResponse3DataStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalResponse5DataStatus;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalStandingOrderResponse7DataStatus;
import uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPResponseDataStatus;

public class FRSubmissionStatusConverter {

    // FR to OB
    public static OBWriteDomesticResponse5DataStatus toOBWriteDomesticResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case PENDING:
            return OBWriteDomesticResponse5DataStatus.PDNG;
        case ACCEPTEDSETTLEMENTINPROCESS:
            return OBWriteDomesticResponse5DataStatus.ACSP;
        case ACCEPTEDSETTLEMENTCOMPLETED:
        case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
        case ACCEPTEDWITHOUTPOSTING:
            return OBWriteDomesticResponse5DataStatus.ACSC;
        default:
            return OBWriteDomesticResponse5DataStatus.RJCT;
        }
    }

    public static OBWriteDomesticScheduledResponse5DataStatus toOBWriteDomesticScheduledResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteDomesticScheduledResponse5DataStatus.PDNG;
        case INITIATIONCOMPLETED:
            return OBWriteDomesticScheduledResponse5DataStatus.ACCP;
        //instead of OBWriteDomesticScheduledResponse5DataStatus.INCO
        case CANCELLED:
            return OBWriteDomesticScheduledResponse5DataStatus.CANC;
        default:
            return OBWriteDomesticScheduledResponse5DataStatus.RJCT;
        // might as well be blocked, in which case -> return OBWriteDomesticScheduledResponse5DataStatus.BLCK;
        }
    }

    public static OBWriteDomesticStandingOrderResponse6DataStatus toOBWriteDomesticStandingOrderResponse6DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteDomesticStandingOrderResponse6DataStatus.PDNG;
        case INITIATIONCOMPLETED:
            return OBWriteDomesticStandingOrderResponse6DataStatus.INCO;
        case CANCELLED:
            return OBWriteDomesticStandingOrderResponse6DataStatus.CANC;
        default:
            return OBWriteDomesticStandingOrderResponse6DataStatus.RJCT;
        // might as well be blocked, in which case -> return OBWriteDomesticStandingOrderResponse6DataStatus.BLCK;
        }
    }

    // v3.1.5 - File Payments
    public static OBWriteFileResponse3DataStatus toOBWriteFileResponse3DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteFileResponse3DataStatus.PDNG;
        case INITIATIONCOMPLETED:
            return OBWriteFileResponse3DataStatus.INCO;
        default:
            return OBWriteFileResponse3DataStatus.INFA;
        }
    }

    public static OBWriteInternationalResponse5DataStatus toOBWriteInternationalResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteInternationalResponse5DataStatus.PDNG;
        case INITIATIONCOMPLETED:
            return OBWriteInternationalResponse5DataStatus.INCO;
        case CANCELLED:
            return OBWriteInternationalResponse5DataStatus.CANC;
        default:
            return OBWriteInternationalResponse5DataStatus.RJCT;
        // might as well be blocked, in which case -> return OBWriteDomesticStandingOrderResponse6DataStatus.BLCK;
        }
    }

    public static OBWriteInternationalStandingOrderResponse7DataStatus toOBWriteInternationalStandingOrderResponse7DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteInternationalStandingOrderResponse7DataStatus.PDNG;
        case INITIATIONCOMPLETED:
            return OBWriteInternationalStandingOrderResponse7DataStatus.INCO;
        case CANCELLED:
            return OBWriteInternationalStandingOrderResponse7DataStatus.CANC;
        default:
            return OBWriteInternationalStandingOrderResponse7DataStatus.INFA;
        }
    }

    // vrp 3.1.x
    public static FRSubmissionStatus toFRSubmissionStatus(OBDomesticVRPResponseDataStatus status) {
        if (status == null) {
            return null;
        }
        return FRSubmissionStatus.fromValue(status.getValue());
    }

    public static OBDomesticVRPResponseDataStatus toOBDomesticVRPResponseDataStatusEnum(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        return OBDomesticVRPResponseDataStatus.fromValue(FRPaymentDetailsStatusConverter.toOBDomesticVRPDetailsDataPaymentStatusInnerStatus(status.getValue()).getValue());
    }
}
