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
package uk.org.openbanking.testsupport.v3.payment;

import static uk.org.openbanking.testsupport.v3.payment.OBPostalAddress6TestDataFactory.aValidOBPostalAddress6;

import uk.org.openbanking.datamodel.v3.common.OBBranchAndFinancialInstitutionIdentification6;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternational3DataInitiationCreditor;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternational3DataInitiationCreditorAgent;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrder4DataInitiationCreditorAgent;

public class OBInternationalIdentifierTestDataFactory {

    private static final String SCHEME_NAME = "UK.OBIE.SortCodeAccountNumber";
    private static final String IDENTIFICATION = "40400411270111";
    private static final String CREDITOR_AGENT_NAME = "Creditor Agent Name";
    private static final String CREDITOR_NAME = "Creditor Name";

    public static OBBranchAndFinancialInstitutionIdentification6 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification6())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational3DataInitiationCreditorAgent aValidOBWriteInternational3DataInitiationCreditorAgent() {
        return (new OBWriteInternational3DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAgent aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAgent() {
        return (new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational3DataInitiationCreditor aValidOBWriteInternational3DataInitiationCreditor() {
        return (new OBWriteInternational3DataInitiationCreditor())
                .name(CREDITOR_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor aValidOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor() {
        return (new OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor())
                .name(CREDITOR_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }
}
