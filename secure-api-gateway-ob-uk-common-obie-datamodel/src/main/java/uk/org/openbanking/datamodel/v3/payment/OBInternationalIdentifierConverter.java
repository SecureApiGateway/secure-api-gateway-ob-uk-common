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
package uk.org.openbanking.datamodel.v3.payment;

import uk.org.openbanking.datamodel.v3.common.OBBranchAndFinancialInstitutionIdentification6;

public class OBInternationalIdentifierConverter {

    public static OBBranchAndFinancialInstitutionIdentification6 toOBBranchAndFinancialInstitutionIdentification6(OBWriteInternationalStandingOrder4DataInitiationCreditorAgent creditorAgent) {
        return toAgent(new OBBranchAndFinancialInstitutionIdentification6(), creditorAgent);
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAgent toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(OBBranchAndFinancialInstitutionIdentification6 creditorAgent) {
        return toAgent(new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent(), creditorAgent);
    }


    private static <T, U> T toAgent(T newAgent, U originalAgent) {
        if (originalAgent == null) {
            return null;
        }
        ConverterHelper.copyField(newAgent, originalAgent, "schemeName");
        ConverterHelper.copyField(newAgent, originalAgent, "identification");
        ConverterHelper.copyField(newAgent, originalAgent, "name");
        ConverterHelper.copyField(newAgent, originalAgent, "postalAddress");
        return newAgent;
    }

    private static <T, U> T toCreditor(T newCreditor, U originalCreditor) {
        if (originalCreditor == null) {
            return null;
        }
        ConverterHelper.copyField(newCreditor, originalCreditor, "name");
        ConverterHelper.copyField(newCreditor, originalCreditor, "postalAddress");
        return newCreditor;
    }
}
