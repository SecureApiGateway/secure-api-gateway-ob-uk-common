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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformation;

import uk.org.openbanking.datamodel.v3.payment.OBWriteDomestic2DataInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPRemittanceInformation;

public class FRRemittanceInformationConverter {

    public static FRRemittanceInformation toFRRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference())
                .build();
    }

    public static FRRemittanceInformation toFRRemittanceInformation(OBDomesticVRPInitiationRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference())
                .build();
    }

    public static FRRemittanceInformation toFRRemittanceInformation(OBVRPRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference())
                .build();
    }

    public static OBWriteDomestic2DataInitiationRemittanceInformation toOBWriteDomestic2DataInitiationRemittanceInformation(FRRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : new OBWriteDomestic2DataInitiationRemittanceInformation()
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference());
    }

    public static OBVRPRemittanceInformation toOBVRPRemittanceInformation(FRRemittanceInformation remittanceInformation){
        return remittanceInformation == null ? null : new OBVRPRemittanceInformation()
                .reference(remittanceInformation.getReference())
                .unstructured(remittanceInformation.getUnstructured());
    }

    public static OBDomesticVRPInitiationRemittanceInformation toOBDomesticVRPInitiationRemittanceInformation(
            FRRemittanceInformation remittanceInformation
    ) {
        return remittanceInformation == null ? null : new OBDomesticVRPInitiationRemittanceInformation()
                .reference(remittanceInformation.getReference())
                .unstructured(remittanceInformation.getUnstructured());
    }
}
