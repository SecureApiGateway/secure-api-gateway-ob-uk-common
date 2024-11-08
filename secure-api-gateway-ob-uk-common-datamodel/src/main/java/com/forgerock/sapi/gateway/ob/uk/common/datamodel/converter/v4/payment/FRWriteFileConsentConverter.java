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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRRemittanceInformationConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileConsentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileDataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFileConsent3;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFileConsent3Data;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFileConsent3DataInitiation;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter.*;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRUltimateDebtorConverter.toFRUltimateDebtor;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRUltimateDebtorConverter.toOBUltimateDebtor1;

public class FRWriteFileConsentConverter {

    // OB to FR
    public static FRWriteFileConsent toFRWriteFileConsent(OBWriteFileConsent3 obWriteFileConsent3) {
        return obWriteFileConsent3 == null ? null : FRWriteFileConsent.builder()
                .data(toFRWriteFileConsentData(obWriteFileConsent3.getData()))
                .build();
    }

    public static FRWriteFileConsentData toFRWriteFileConsentData(OBWriteFileConsent3Data data) {
        return data == null ? null : FRWriteFileConsentData.builder()
                .initiation(toFRWriteFileDataInitiation(data.getInitiation()))
                .authorisation(FRDataAuthorisationConverter.toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteFileDataInitiation toFRWriteFileDataInitiation(OBWriteFileConsent3DataInitiation initiation) {
        return initiation == null ? null : FRWriteFileDataInitiation.builder()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .remittanceInformation(FRRemittanceInformationConverter.toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .creditorAgent(toFRCreditorAgent((initiation.getCreditorAgent())))
                .ultimateDebtor(toFRUltimateDebtor(initiation.getUltimateDebtor()))
                .build();
    }

    // FR to OB
    public static OBWriteFileConsent3DataInitiation toOBWriteFileConsent3DataInitiation(FRWriteFileDataInitiation initiation) {
        return initiation == null ? null : new OBWriteFileConsent3DataInitiation()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .remittanceInformation(FRRemittanceInformationConverter.toOBRemittanceInformation2(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()))
                .creditorAgent(toOBWriteDomestic2DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .ultimateDebtor(toOBUltimateDebtor1(initiation.getUltimateDebtor()));
    }

    public static OBWriteFileConsent3 toOBWriteFileConsent3(FRWriteFileConsent consent) {
        return FRModelMapper.map(consent, OBWriteFileConsent3.class);
    }
}
