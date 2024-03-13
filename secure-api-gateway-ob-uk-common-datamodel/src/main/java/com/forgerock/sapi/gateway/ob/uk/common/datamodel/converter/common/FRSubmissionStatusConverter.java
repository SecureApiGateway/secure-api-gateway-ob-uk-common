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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSubmissionStatus;

import uk.org.openbanking.datamodel.payment.OBWriteDomesticResponse5DataStatus;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledResponse5DataStatus;
import uk.org.openbanking.datamodel.payment.OBWriteFileResponse3DataStatus;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalStandingOrderResponse7DataStatus;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPResponseDataStatus;

public class FRSubmissionStatusConverter {

    // FR to OB
    public static OBWriteDomesticResponse5DataStatus toOBWriteDomesticResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case PENDING:
            return OBWriteDomesticResponse5DataStatus.PENDING;
        case ACCEPTEDSETTLEMENTINPROCESS:
            return OBWriteDomesticResponse5DataStatus.ACCEPTEDSETTLEMENTINPROCESS;
        case ACCEPTEDSETTLEMENTCOMPLETED:
        case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
        case ACCEPTEDWITHOUTPOSTING:
            return OBWriteDomesticResponse5DataStatus.ACCEPTEDSETTLEMENTCOMPLETED;
        default:
            return OBWriteDomesticResponse5DataStatus.REJECTED;
        }
    }

    public static OBWriteDomesticScheduledResponse5DataStatus toOBWriteDomesticScheduledResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteDomesticScheduledResponse5DataStatus.INITIATIONPENDING;
        case INITIATIONCOMPLETED:
            return OBWriteDomesticScheduledResponse5DataStatus.INITIATIONCOMPLETED;
        case CANCELLED:
            return OBWriteDomesticScheduledResponse5DataStatus.CANCELLED;
        default:
            return OBWriteDomesticScheduledResponse5DataStatus.INITIATIONFAILED;
        }
    }

    // v3.1.5 - File Payments
    public static OBWriteFileResponse3DataStatus toOBWriteFileResponse3DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteFileResponse3DataStatus.INITIATIONPENDING;
        case INITIATIONCOMPLETED:
            return OBWriteFileResponse3DataStatus.INITIATIONCOMPLETED;
        default:
            return OBWriteFileResponse3DataStatus.INITIATIONFAILED;
        }
    }

    public static OBWriteInternationalStandingOrderResponse7DataStatus toOBWriteInternationalStandingOrderResponse7DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
        case INITIATIONPENDING:
            return OBWriteInternationalStandingOrderResponse7DataStatus.INITIATIONPENDING;
        case INITIATIONCOMPLETED:
            return OBWriteInternationalStandingOrderResponse7DataStatus.INITIATIONCOMPLETED;
        case CANCELLED:
            return OBWriteInternationalStandingOrderResponse7DataStatus.CANCELLED;
        default:
            return OBWriteInternationalStandingOrderResponse7DataStatus.INITIATIONFAILED;
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
        return OBDomesticVRPResponseDataStatus.fromValue(status.getValue());
    }
}
