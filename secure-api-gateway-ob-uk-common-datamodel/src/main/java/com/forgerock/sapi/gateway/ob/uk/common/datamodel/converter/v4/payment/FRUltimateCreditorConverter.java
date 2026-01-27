/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toFRPostalAddress;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBPostalAddress7;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRUltimateCreditor;

import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;

public class FRUltimateCreditorConverter {

    // OB to FR
    public static FRUltimateCreditor toFRUltimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
        return ultimateCreditor == null ? null : FRUltimateCreditor.builder()
                .name(ultimateCreditor.getName())
                .identification(ultimateCreditor.getIdentification())
                .LEI(ultimateCreditor.getLEI())
                .schemeName(ultimateCreditor.getSchemeName())
                .postalAddress(toFRPostalAddress(ultimateCreditor.getPostalAddress()))
                .build();
    }

    // FR to OB
    public static OBUltimateCreditor1 toOBUltimateCreditor1(FRUltimateCreditor ultimateCreditor) {
        return ultimateCreditor == null ? null : new OBUltimateCreditor1()
                .name(ultimateCreditor.getName())
                .identification(ultimateCreditor.getIdentification())
                .LEI(ultimateCreditor.getLEI())
                .schemeName(ultimateCreditor.getSchemeName())
                .postalAddress(toOBPostalAddress7(ultimateCreditor.getPostalAddress()));
    }
}
