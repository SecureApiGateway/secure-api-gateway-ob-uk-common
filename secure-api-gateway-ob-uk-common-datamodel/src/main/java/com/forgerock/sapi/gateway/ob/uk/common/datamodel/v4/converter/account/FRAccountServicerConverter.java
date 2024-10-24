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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.account.FRAccountServicer;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRUltimateCreditor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRUltimateDebtor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRFinancialAgent;
import uk.org.openbanking.datamodel.v4.account.OBBranchAndFinancialInstitutionIdentification50;
import uk.org.openbanking.datamodel.v4.common.OBBranchAndFinancialInstitutionIdentification60;
import uk.org.openbanking.datamodel.v4.account.OBBranchAndFinancialInstitutionIdentification61;
import uk.org.openbanking.datamodel.v4.account.OBBranchAndFinancialInstitutionIdentification62;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBPostalAddress7;


public class FRAccountServicerConverter {

    // FR to OB
    public static OBBranchAndFinancialInstitutionIdentification50 toOBBranchAndFinancialInstitutionIdentification50(FRAccountServicer servicer) {
        return servicer == null ? null : new OBBranchAndFinancialInstitutionIdentification50()
                .schemeName(servicer.getSchemeName())
                .name(servicer.getName())
                .identification(servicer.getIdentification());
    }

    public static OBBranchAndFinancialInstitutionIdentification60 toOBBranchAndFinancialInstitutionIdentification60(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification60()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .LEI(creditorAgent.getLEI())
                .postalAddress(toOBPostalAddress7(creditorAgent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification61 toOBBranchAndFinancialInstitutionIdentification61(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification61()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .LEI(creditorAgent.getLEI())
                .postalAddress(toOBPostalAddress7(creditorAgent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification62 toOBBranchAndFinancialInstitutionIdentification62(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification62()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .LEI(creditorAgent.getLEI())
                .postalAddress(toOBPostalAddress7(creditorAgent.getPostalAddress()));
    }

    public static OBUltimateCreditor1 toOBUltimateCreditor1(FRUltimateCreditor ultimateCreditor) {
        return ultimateCreditor == null ? null : new OBUltimateCreditor1()
                .schemeName(ultimateCreditor.getSchemeName())
                .identification(ultimateCreditor.getIdentification())
                .name(ultimateCreditor.getName())
                .LEI(ultimateCreditor.getLEI())
                .postalAddress(toOBPostalAddress7(ultimateCreditor.getPostalAddress()));
    }

    public static OBUltimateDebtor1 toOBUltimateDebtor1(FRUltimateDebtor ultimateDebtor) {
        return ultimateDebtor == null ? null : new OBUltimateDebtor1()
                .schemeName(ultimateDebtor.getSchemeName())
                .identification(ultimateDebtor.getIdentification())
                .name(ultimateDebtor.getName())
                .LEI(ultimateDebtor.getLEI())
                .postalAddress(toOBPostalAddress7(ultimateDebtor.getPostalAddress()));
    }

    // OB to FR
    public static FRAccountServicer toFRAccountServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        return servicer == null ? null : FRAccountServicer.builder()
                .schemeName(servicer.getSchemeName())
                .identification(servicer.getIdentification())
                .build();
    }
}
