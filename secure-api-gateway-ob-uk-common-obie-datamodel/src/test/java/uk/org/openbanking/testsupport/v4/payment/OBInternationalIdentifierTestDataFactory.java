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
package uk.org.openbanking.testsupport.v4.payment;

import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBPostalAddress7;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiationCreditorAgent;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternational3DataInitiationCreditor;

public class OBInternationalIdentifierTestDataFactory {

    private static final String SCHEME_NAME = "UK.OBIE.SortCodeAccountNumber";
    private static final String IDENTIFICATION = "40400411270111";
    private static final String CREDITOR_AGENT_NAME = "Creditor Agent Name";
    private static final String CREDITOR_NAME = "Creditor Name";

    public static OBWriteDomestic2DataInitiationCreditorAgent aValidOBWriteDomestic2DataInitiationCreditorAgent() {
        return (new OBWriteDomestic2DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .LEI("blah")
                .postalAddress(aValidOBPostalAddress7());
    }

    public static OBWriteInternational3DataInitiationCreditor aValidOBWriteInternational3DataInitiationCreditor() {
        return (new OBWriteInternational3DataInitiationCreditor())
                .name(CREDITOR_NAME)
                .LEI("blah")
                .postalAddress(aValidOBPostalAddress7());
    }
}
