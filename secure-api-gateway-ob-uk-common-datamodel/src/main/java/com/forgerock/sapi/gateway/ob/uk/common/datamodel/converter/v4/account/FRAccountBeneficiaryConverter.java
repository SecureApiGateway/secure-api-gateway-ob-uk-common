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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRAccountBeneficiary;
import uk.org.openbanking.datamodel.v4.account.OBBeneficiary5;
import uk.org.openbanking.datamodel.v4.account.OBInternalBeneficiaryType1Code;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter.toOBSupplementaryData1;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification60;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter.toFRAccountIdentifier;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter.toOBCashAccount50;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRFinancialInstrumentConverter.toFRFinancialAgent;

public class FRAccountBeneficiaryConverter {

    // FR to OB

    public static OBBeneficiary5 toOBBeneficiary5(FRAccountBeneficiary beneficiary) {
        return beneficiary == null ? null : new OBBeneficiary5()
                .accountId(beneficiary.getAccountId())
                .beneficiaryId(beneficiary.getBeneficiaryId())
                .beneficiaryType(toOBBeneficiaryType1Code(beneficiary.getBeneficiaryType()))
                .reference(beneficiary.getReference())
                .supplementaryData(toOBSupplementaryData1(beneficiary.getSupplementaryData()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification60(beneficiary.getCreditorAgent()))
                .creditorAccount(toOBCashAccount50(beneficiary.getCreditorAccount()));
    }

    public static OBInternalBeneficiaryType1Code toOBBeneficiaryType1Code(FRAccountBeneficiary.FRBeneficiaryType beneficiaryType) {
        return beneficiaryType == null ? null : OBInternalBeneficiaryType1Code.valueOf(beneficiaryType.name());
    }

    // OB to FR

    public static FRAccountBeneficiary toFRAccountBeneficiary(OBBeneficiary5 beneficiary) {
        return beneficiary == null ? null : FRAccountBeneficiary.builder()
                .accountId(beneficiary.getAccountId())
                .beneficiaryId(beneficiary.getBeneficiaryId())
                .beneficiaryType(toFRBeneficiaryType(beneficiary.getBeneficiaryType()))
                .reference(beneficiary.getReference())
                .supplementaryData(toFRSupplementaryData(beneficiary.getSupplementaryData()))
                .creditorAgent(toFRFinancialAgent(beneficiary.getCreditorAgent()))
                .creditorAccount(toFRAccountIdentifier(beneficiary.getCreditorAccount()))
                .build();
    }

    public static FRAccountBeneficiary.FRBeneficiaryType toFRBeneficiaryType(OBInternalBeneficiaryType1Code beneficiaryType) {
        return beneficiaryType == null ? null : FRAccountBeneficiary.FRBeneficiaryType.valueOf(beneficiaryType.name());
    }

}
