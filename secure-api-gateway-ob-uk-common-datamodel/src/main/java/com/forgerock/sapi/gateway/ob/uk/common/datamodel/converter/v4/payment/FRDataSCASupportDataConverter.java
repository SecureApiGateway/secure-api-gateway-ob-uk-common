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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRDataSCASupportData;

import uk.org.openbanking.datamodel.v4.payment.OBSCASupportData1;
import uk.org.openbanking.datamodel.v4.payment.OBSCASupportData1AppliedAuthenticationApproach;
import uk.org.openbanking.datamodel.v4.payment.OBSCASupportData1RequestedSCAExemptionType;

public class FRDataSCASupportDataConverter {

    // OB to FR
    public static FRDataSCASupportData toFRDataSCASupportData(OBSCASupportData1 scASupportData) {
        return scASupportData == null ? null : FRDataSCASupportData.builder()
                .requestedSCAExemptionType(toFRRequestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toFRAppliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId())
                .build();
    }

    public static FRDataSCASupportData.FRAppliedAuthenticationApproach toFRAppliedAuthenticationApproach(OBSCASupportData1AppliedAuthenticationApproach appliedAuthenticationApproach) {
        return appliedAuthenticationApproach == null ? null : FRDataSCASupportData.FRAppliedAuthenticationApproach.valueOf(appliedAuthenticationApproach.name());
    }

    public static FRDataSCASupportData.FRRequestedSCAExemptionType toFRRequestedSCAExemptionType(OBSCASupportData1RequestedSCAExemptionType requestedSCAExemptionType) {
        return requestedSCAExemptionType == null ? null : FRDataSCASupportData.FRRequestedSCAExemptionType.valueOf(requestedSCAExemptionType.name());
    }

    // FR to OB
    public static OBSCASupportData1 toOBSCASupportData1(FRDataSCASupportData scASupportData) {
        return scASupportData == null ? null : new OBSCASupportData1()
                .requestedSCAExemptionType(toOBRequestedSCAExemptionTypeEnum(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toOBAppliedAuthenticationApproachEnum(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }

    public static OBSCASupportData1RequestedSCAExemptionType toOBRequestedSCAExemptionTypeEnum(FRDataSCASupportData.FRRequestedSCAExemptionType requestedSCAExemptionType) {
        return requestedSCAExemptionType == null ? null : OBSCASupportData1RequestedSCAExemptionType.valueOf(requestedSCAExemptionType.name());
    }

    public static OBSCASupportData1AppliedAuthenticationApproach toOBAppliedAuthenticationApproachEnum(FRDataSCASupportData.FRAppliedAuthenticationApproach appliedAuthenticationApproach) {
        return appliedAuthenticationApproach == null ? null : OBSCASupportData1AppliedAuthenticationApproach.valueOf(appliedAuthenticationApproach.name());
    }
}
