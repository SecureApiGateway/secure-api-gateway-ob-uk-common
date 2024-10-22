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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toFRPostalAddress;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBPostalAddress7;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRUltimateDebtor;

import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

public class FRUltimateDebtorConverter {

    // OB to FR
    public static FRUltimateDebtor toFRUltimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        return ultimateDebtor == null ? null : FRUltimateDebtor.builder()
                .name(ultimateDebtor.getName())
                .identification(ultimateDebtor.getIdentification())
                .LEI(ultimateDebtor.getLEI())
                .schemeName(ultimateDebtor.getSchemeName())
                .postalAddress(toFRPostalAddress(ultimateDebtor.getPostalAddress()))
                .build();
    }

    // FR to OB
    public static OBUltimateDebtor1 toOBUltimateDebtor1(FRUltimateDebtor ultimateDebtor) {
        return ultimateDebtor == null ? null : new OBUltimateDebtor1()
                .name(ultimateDebtor.getName())
                .identification(ultimateDebtor.getIdentification())
                .LEI(ultimateDebtor.getLEI())
                .schemeName(ultimateDebtor.getSchemeName())
                .postalAddress(toOBPostalAddress7(ultimateDebtor.getPostalAddress()));
    }
}
