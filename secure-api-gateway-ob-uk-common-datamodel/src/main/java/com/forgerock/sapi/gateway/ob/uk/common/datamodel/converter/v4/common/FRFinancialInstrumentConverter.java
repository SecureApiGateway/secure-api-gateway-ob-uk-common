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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialCreditor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRUltimateCreditor;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRUltimateDebtor;

import uk.org.openbanking.datamodel.v4.account.OBBranchAndFinancialInstitutionIdentification51;
import uk.org.openbanking.datamodel.v4.account.OBBranchAndFinancialInstitutionIdentification61;
import uk.org.openbanking.datamodel.v4.account.OBBranchAndFinancialInstitutionIdentification62;
import uk.org.openbanking.datamodel.v4.common.OBBranchAndFinancialInstitutionIdentification60;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiationCreditorAgent;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3DataInitiationCreditor;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalConsent5DataInitiationCreditor;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduled3DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduled3DataInitiationCreditorAgent;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalStandingOrder4DataInitiationCreditorAgent;


public class FRFinancialInstrumentConverter {

    // OB to FR
    public static FRFinancialCreditor toFRFinancialCreditor(OBWriteInternational3DataInitiationCreditor creditor) {
        return creditor == null ? null : FRFinancialCreditor.builder()
                .name(creditor.getName())
                .LEI(creditor.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(creditor.getPostalAddress()))
                .build();
    }

    public static FRFinancialCreditor toFRFinancialCreditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        return creditor == null ? null : FRFinancialCreditor.builder()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(creditor.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification51 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .LEI(agent.getLEI())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification60 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification61 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBBranchAndFinancialInstitutionIdentification62 agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRUltimateCreditor toFRFinancialAgent(OBUltimateCreditor1 agent) {
        return agent == null ? null : FRUltimateCreditor.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRUltimateDebtor toFRFinancialAgent(OBUltimateDebtor1 agent) {
        return agent == null ? null : FRUltimateDebtor.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBWriteInternationalStandingOrder4DataInitiationCreditorAgent agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    public static FRFinancialAgent toFRFinancialAgent(OBWriteDomestic2DataInitiationCreditorAgent agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                .build();
    }

    // FR to OB
    public static OBWriteInternational3DataInitiationCreditor toOBWriteInternational3DataInitiationCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternational3DataInitiationCreditor()
                .name(creditor.getName())
                .LEI(creditor.getLEI())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(creditor.getPostalAddress()));
    }

    public static OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor toOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(creditor.getPostalAddress()));
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAgent toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(agent.getPostalAddress()));
    }

    public static OBBranchAndFinancialInstitutionIdentification51 toOBBranchAndFinancialInstitutionIdentification51(FRFinancialAgent agent) {
        return agent == null ? null : new OBBranchAndFinancialInstitutionIdentification51()
                .schemeName(agent.getSchemeName())
                .LEI(agent.getLEI())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(agent.getPostalAddress()))
                .identification(agent.getIdentification());
    }

    // International Schedule Payments

    public static FRFinancialAgent toFRFinancialAgent(OBWriteInternationalScheduled3DataInitiationCreditorAgent agent) {
        return agent == null ? null : FRFinancialAgent.builder()
                                                      .schemeName(agent.getSchemeName())
                                                      .identification(agent.getIdentification())
                                                      .LEI(agent.getLEI())
                                                      .name(agent.getName())
                                                      .postalAddress(FRPostalAddressConverter.toFRPostalAddress(agent.getPostalAddress()))
                                                      .build();
    }

    public static FRFinancialCreditor toFRFinancialCreditor(OBWriteInternationalConsent5DataInitiationCreditor creditor) {
        return creditor == null ? null : FRFinancialCreditor.builder()
                                                            .postalAddress(FRPostalAddressConverter.toFRPostalAddress(creditor.getPostalAddress()))
                                                            .name(creditor.getName())
                                                            .LEI(creditor.getLEI()).build();
    }

    public static OBWriteInternationalConsent5DataInitiationCreditor toOBWriteInternationalConsent5DataInitiationCreditor(FRFinancialCreditor creditor) {
        return creditor == null ? null : new OBWriteInternationalConsent5DataInitiationCreditor()
                .name(creditor.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(creditor.getPostalAddress()))
                .LEI(creditor.getLEI());
    }

    public static OBWriteInternationalScheduled3DataInitiationCreditorAgent toOBWriteInternationalScheduled3DataInitiationCreditorAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteInternationalScheduled3DataInitiationCreditorAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .LEI(agent.getLEI())
                .name(agent.getName())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(agent.getPostalAddress()));
    }

    public static OBWriteDomestic2DataInitiationCreditorAgent toOBWriteDomestic2DataInitiationCreditorAgent(FRFinancialAgent agent) {
        return agent == null ? null : new OBWriteDomestic2DataInitiationCreditorAgent()
                .schemeName(agent.getSchemeName())
                .identification(agent.getIdentification())
                .name(agent.getName())
                .LEI(agent.getLEI())
                .postalAddress(FRPostalAddressConverter.toOBPostalAddress7(agent.getPostalAddress()));
    }
}
