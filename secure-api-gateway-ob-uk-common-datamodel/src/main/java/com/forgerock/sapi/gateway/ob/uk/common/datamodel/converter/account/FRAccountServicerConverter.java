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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.account;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter.toOBPostalAddress6;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountServicer;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;

import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification50;
import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification60;
import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification61;
import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification62;
import uk.org.openbanking.datamodel.v3.common.OBBranchAndFinancialInstitutionIdentification6;


public class FRAccountServicerConverter {

    // FR to OB
    public static OBBranchAndFinancialInstitutionIdentification50 toOBBranchAndFinancialInstitutionIdentification50(FRAccountServicer servicer) {
        return servicer == null ? null : new OBBranchAndFinancialInstitutionIdentification50()
                .schemeName(servicer.getSchemeName())
                .identification(servicer.getIdentification());
    }

    public static OBBranchAndFinancialInstitutionIdentification6 toOBBranchAndFinancialInstitutionIdentification6(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification6()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .postalAddress(toOBPostalAddress6(creditorAgent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification60 toOBBranchAndFinancialInstitutionIdentification60(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification60()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .postalAddress(toOBPostalAddress6(creditorAgent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification61 toOBBranchAndFinancialInstitutionIdentification61(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification61()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .postalAddress(toOBPostalAddress6(creditorAgent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification62 toOBBranchAndFinancialInstitutionIdentification62(FRFinancialAgent creditorAgent) {
        return creditorAgent == null ? null : new OBBranchAndFinancialInstitutionIdentification62()
                .schemeName(creditorAgent.getSchemeName())
                .identification(creditorAgent.getIdentification())
                .name(creditorAgent.getName())
                .postalAddress(toOBPostalAddress6(creditorAgent.getPostalAddress()));
    }

    // OB to FR
    public static FRAccountServicer toFRAccountServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        return servicer == null ? null : FRAccountServicer.builder()
                .schemeName(servicer.getSchemeName())
                .identification(servicer.getIdentification())
                .build();
    }
}
