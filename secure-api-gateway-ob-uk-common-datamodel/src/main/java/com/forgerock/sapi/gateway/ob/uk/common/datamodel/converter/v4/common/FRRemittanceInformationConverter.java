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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRRemittanceInformation;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformation2;
import uk.org.openbanking.datamodel.v4.vrp.OBVRPRemittanceInformation;

import java.util.List;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.ConversionUtils.convertListToSingleString;

public class FRRemittanceInformationConverter {

    public static FRRemittanceInformation toFRRemittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(remittanceInformation.getUnstructured())
                .build();
    }

    public static OBRemittanceInformation2 toOBRemittanceInformation2(FRRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : new OBRemittanceInformation2()
                .unstructured(remittanceInformation.getUnstructured());
    }

    // TODO - implement VRP remittance information according to V4 data model

   /* public static FRRemittanceInformation toFRRemittanceInformation(OBVRPRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference())
                .build();
    }*/

    /*public static OBVRPRemittanceInformation toOBVRPRemittanceInformation(FRRemittanceInformation remittanceInformation){
        return remittanceInformation == null ? null : new OBVRPRemittanceInformation()
                .reference(remittanceInformation.getReference())
                .unstructured(convertListToSingleString(remittanceInformation.getUnstructured()));
    }*/

}
