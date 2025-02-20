/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialCreditor;

import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification51;
import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification60;
import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification61;
import uk.org.openbanking.datamodel.v3.account.OBBranchAndFinancialInstitutionIdentification62;
import uk.org.openbanking.datamodel.v3.common.OBBranchAndFinancialInstitutionIdentification6;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternational3DataInitiationCreditor;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternational3DataInitiationCreditorAgent;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrder4DataInitiationCreditorAgent;

public class FRFinancialInstrumentConverter {

    // OB to FR
    public static FRFinancialCreditor toFRFinancialCreditor(OBWriteInternational3DataInitiationCreditor creditor) {
        return creditor == null ? null : FRFinancialCreditor.builder()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(creditor.getPostalAddress()))
                .build();
    }

    public static FRFinancialCreditor toFRFinancialCreditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        return creditor == null ? null : FRFinancialCreditor.builder()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(creditor.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification6 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification51 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification60 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification61 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification62 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBWriteInternational3DataInitiationCreditorAgent agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBWriteInternationalStandingOrder4DataInitiationCreditorAgent agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    // FR to OB
    public static OBWriteInternational3DataInitiationCreditor toOBWriteInternational3DataInitiationCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternational3DataInitiationCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    public static OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor toOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(creditor.getPostalAddress()));
    }

    public static OBWriteInternational3DataInitiationCreditorAgent toOBWriteInternational3DataInitiationCreditorAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternational3DataInitiationCreditorAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAgent toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification51 toOBBranchAndFinancialInstitutionIdentification51(FRFinancialAgent agent) {
        return agent == null ? null : new OBBranchAndFinancialInstitutionIdentification51()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification());
    }

    public static OBBranchAndFinancialInstitutionIdentification6 toOBBranchAndFinancialInstitutionIdentification6(FRFinancialAgent agent) {
        return agent == null ? null : new OBBranchAndFinancialInstitutionIdentification6()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress6(agent.getPostalAddress()));
    }

}
