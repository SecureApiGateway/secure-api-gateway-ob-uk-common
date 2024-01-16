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
import uk.org.openbanking.datamodel.payment.*;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPResponseData;

public class FRSubmissionStatusConverter {

    // FR to OB
    // v3.0 to 3.1.2 - Immediate Domestic/International Payments
    public static OBTransactionIndividualStatus1Code toOBTransactionIndividualStatus1Code(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case PENDING:
                return OBTransactionIndividualStatus1Code.PENDING;
            case ACCEPTEDSETTLEMENTINPROCESS:
                return OBTransactionIndividualStatus1Code.ACCEPTEDSETTLEMENTINPROCESS;
            case ACCEPTEDSETTLEMENTCOMPLETED:
            case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
            case ACCEPTEDWITHOUTPOSTING:
                return OBTransactionIndividualStatus1Code.ACCEPTEDSETTLEMENTCOMPLETED;
            default:
                return OBTransactionIndividualStatus1Code.REJECTED;
        }
    }

    // v3.0 to 3.1.2 - Domestic/International Scheduled Payments or Standing Orders, or File Payments
    public static OBExternalStatus1Code toOBExternalStatus1Code(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBExternalStatus1Code.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBExternalStatus1Code.INITIATIONCOMPLETED;
            default:
                return OBExternalStatus1Code.INITIATIONFAILED;
        }
    }

    // v3.1.3 - Immediate Domestic Payments
    public static OBWriteDomesticResponse3Data.StatusEnum toOBWriteDomesticResponse3DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case PENDING:
                return OBWriteDomesticResponse3Data.StatusEnum.PENDING;
            case ACCEPTEDSETTLEMENTINPROCESS:
                return OBWriteDomesticResponse3Data.StatusEnum.ACCEPTEDSETTLEMENTINPROCESS;
            case ACCEPTEDSETTLEMENTCOMPLETED:
            case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
            case ACCEPTEDWITHOUTPOSTING:
                return OBWriteDomesticResponse3Data.StatusEnum.ACCEPTEDSETTLEMENTCOMPLETED;
            default:
                return OBWriteDomesticResponse3Data.StatusEnum.REJECTED;
        }
    }

    // v3.1.4 - Immediate Domestic Payments
    public static OBWriteDomesticResponse4Data.StatusEnum toOBWriteDomesticResponse4DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case PENDING:
                return OBWriteDomesticResponse4Data.StatusEnum.PENDING;
            case ACCEPTEDSETTLEMENTINPROCESS:
                return OBWriteDomesticResponse4Data.StatusEnum.ACCEPTEDSETTLEMENTINPROCESS;
            case ACCEPTEDSETTLEMENTCOMPLETED:
            case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
            case ACCEPTEDWITHOUTPOSTING:
                return OBWriteDomesticResponse4Data.StatusEnum.ACCEPTEDSETTLEMENTCOMPLETED;
            default:
                return OBWriteDomesticResponse4Data.StatusEnum.REJECTED;
        }
    }

    // v3.1.5 - Immediate Domestic Payments
    public static OBWriteDomesticResponse5Data.StatusEnum toOBWriteDomesticResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case PENDING:
                return OBWriteDomesticResponse5Data.StatusEnum.PENDING;
            case ACCEPTEDSETTLEMENTINPROCESS:
                return OBWriteDomesticResponse5Data.StatusEnum.ACCEPTEDSETTLEMENTINPROCESS;
            case ACCEPTEDSETTLEMENTCOMPLETED:
            case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
            case ACCEPTEDWITHOUTPOSTING:
                return OBWriteDomesticResponse5Data.StatusEnum.ACCEPTEDSETTLEMENTCOMPLETED;
            default:
                return OBWriteDomesticResponse5Data.StatusEnum.REJECTED;
        }
    }

    // v3.1.3 - Domestic Scheduled Payments
    public static OBWriteDomesticScheduledResponse3Data.StatusEnum toOBWriteDomesticScheduledResponse3DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteDomesticScheduledResponse3Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteDomesticScheduledResponse3Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteDomesticScheduledResponse3Data.StatusEnum.CANCELLED;
            default:
                return OBWriteDomesticScheduledResponse3Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.4 - Domestic Scheduled Payments
    public static OBWriteDomesticScheduledResponse4Data.StatusEnum toOBWriteDomesticScheduledResponse4DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteDomesticScheduledResponse4Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteDomesticScheduledResponse4Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteDomesticScheduledResponse4Data.StatusEnum.CANCELLED;
            default:
                return OBWriteDomesticScheduledResponse4Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.5 - Domestic Scheduled Payments
    public static OBWriteDomesticScheduledResponse5Data.StatusEnum toOBWriteDomesticScheduledResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteDomesticScheduledResponse5Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteDomesticScheduledResponse5Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteDomesticScheduledResponse5Data.StatusEnum.CANCELLED;
            default:
                return OBWriteDomesticScheduledResponse5Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.3 - Domestic Standing Orders
    public static OBWriteDomesticStandingOrderResponse4Data.StatusEnum toOBWriteDomesticStandingOrderResponse4DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteDomesticStandingOrderResponse4Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteDomesticStandingOrderResponse4Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteDomesticStandingOrderResponse4Data.StatusEnum.CANCELLED;
            default:
                return OBWriteDomesticStandingOrderResponse4Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.4 - Domestic Standing Orders
    public static OBWriteDomesticStandingOrderResponse5Data.StatusEnum toOBWriteDomesticStandingOrderResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteDomesticStandingOrderResponse5Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteDomesticStandingOrderResponse5Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteDomesticStandingOrderResponse5Data.StatusEnum.CANCELLED;
            default:
                return OBWriteDomesticStandingOrderResponse5Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.5 - Domestic Standing Orders
    public static OBWriteDomesticStandingOrderResponse6Data.StatusEnum toOBWriteDomesticStandingOrderResponse6DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteDomesticStandingOrderResponse6Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteDomesticStandingOrderResponse6Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteDomesticStandingOrderResponse6Data.StatusEnum.CANCELLED;
            default:
                return OBWriteDomesticStandingOrderResponse6Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.3 - Immediate International Payments
    public static OBWriteInternationalResponse4Data.StatusEnum toOBWriteInternationalResponse4DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case PENDING:
                return OBWriteInternationalResponse4Data.StatusEnum.PENDING;
            case ACCEPTEDSETTLEMENTINPROCESS:
                return
                        OBWriteInternationalResponse4Data.StatusEnum.ACCEPTEDSETTLEMENTINPROCESS;
            case ACCEPTEDSETTLEMENTCOMPLETED:
            case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
            case ACCEPTEDWITHOUTPOSTING:
                return OBWriteInternationalResponse4Data.StatusEnum.ACCEPTEDSETTLEMENTCOMPLETED;
            default:
                return OBWriteInternationalResponse4Data.StatusEnum.REJECTED;
        }
    }

    // v3.1.4 - Immediate International Payments
    public static OBWriteInternationalResponse5Data.StatusEnum toOBWriteInternationalResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case PENDING:
                return OBWriteInternationalResponse5Data.StatusEnum.PENDING;
            case ACCEPTEDSETTLEMENTINPROCESS:
                return
                        OBWriteInternationalResponse5Data.StatusEnum.ACCEPTEDSETTLEMENTINPROCESS;
            case ACCEPTEDSETTLEMENTCOMPLETED:
            case ACCEPTEDCREDITSETTLEMENTCOMPLETED:
            case ACCEPTEDWITHOUTPOSTING:
                return OBWriteInternationalResponse5Data.StatusEnum.ACCEPTEDSETTLEMENTCOMPLETED;
            default:
                return OBWriteInternationalResponse5Data.StatusEnum.REJECTED;
        }
    }

    // v3.1.3 - International Scheduled Payments
    public static OBWriteInternationalScheduledResponse4Data.StatusEnum toOBWriteInternationalScheduledResponse4DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteInternationalScheduledResponse4Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteInternationalScheduledResponse4Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteInternationalScheduledResponse4Data.StatusEnum.CANCELLED;
            default:
                return OBWriteInternationalScheduledResponse4Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.4 - International Scheduled Payments
    public static OBWriteInternationalScheduledResponse5Data.StatusEnum toOBWriteInternationalScheduledResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteInternationalScheduledResponse5Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteInternationalScheduledResponse5Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteInternationalScheduledResponse5Data.StatusEnum.CANCELLED;
            default:
                return OBWriteInternationalScheduledResponse5Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.5 - International Scheduled Payments
    public static OBWriteInternationalScheduledResponse6Data.StatusEnum toOBWriteInternationalScheduledResponse6DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteInternationalScheduledResponse6Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteInternationalScheduledResponse6Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteInternationalScheduledResponse6Data.StatusEnum.CANCELLED;
            default:
                return OBWriteInternationalScheduledResponse6Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.3 - International Standing Orders
    public static OBWriteInternationalStandingOrderResponse5Data.StatusEnum toOBWriteInternationalStandingOrderResponse5DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteInternationalStandingOrderResponse5Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteInternationalStandingOrderResponse5Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteInternationalStandingOrderResponse5Data.StatusEnum.CANCELLED;
            default:
                return OBWriteInternationalStandingOrderResponse5Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.4 - International Standing Orders
    public static OBWriteInternationalStandingOrderResponse6Data.StatusEnum toOBWriteInternationalStandingOrderResponse6DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteInternationalStandingOrderResponse6Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteInternationalStandingOrderResponse6Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteInternationalStandingOrderResponse6Data.StatusEnum.CANCELLED;
            default:
                return OBWriteInternationalStandingOrderResponse6Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.5 - International Standing Orders
    public static OBWriteInternationalStandingOrderResponse7Data.StatusEnum toOBWriteInternationalStandingOrderResponse7DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteInternationalStandingOrderResponse7Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteInternationalStandingOrderResponse7Data.StatusEnum.INITIATIONCOMPLETED;
            case CANCELLED:
                return OBWriteInternationalStandingOrderResponse7Data.StatusEnum.CANCELLED;
            default:
                return OBWriteInternationalStandingOrderResponse7Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // v3.1.5 - File Payments
    public static OBWriteFileResponse3Data.StatusEnum toOBWriteFileResponse3DataStatus(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case INITIATIONPENDING:
                return OBWriteFileResponse3Data.StatusEnum.INITIATIONPENDING;
            case INITIATIONCOMPLETED:
                return OBWriteFileResponse3Data.StatusEnum.INITIATIONCOMPLETED;
            default:
                return OBWriteFileResponse3Data.StatusEnum.INITIATIONFAILED;
        }
    }

    // vrp 3.1.x
    public static FRSubmissionStatus toFRSubmissionStatus(OBDomesticVRPResponseData.StatusEnum status) {
        if (status == null) {
            return null;
        }
        return FRSubmissionStatus.fromValue(status.getValue());
    }

    public static OBDomesticVRPResponseData.StatusEnum toOBDomesticVRPResponseDataStatusEnum(FRSubmissionStatus status) {
        if (status == null) {
            return null;
        }
        return OBDomesticVRPResponseData.StatusEnum.fromValue(status.getValue());
    }
}
