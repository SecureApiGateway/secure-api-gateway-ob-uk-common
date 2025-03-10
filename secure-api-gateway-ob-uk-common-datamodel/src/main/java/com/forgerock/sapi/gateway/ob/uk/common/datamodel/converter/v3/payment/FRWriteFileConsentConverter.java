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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRRemittanceInformationConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileConsentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFileDataInitiation;

import uk.org.openbanking.datamodel.v3.payment.OBWriteFile2DataInitiation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsent3;
import uk.org.openbanking.datamodel.v3.payment.OBWriteFileConsent3Data;

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

    public static FRWriteFileDataInitiation toFRWriteFileDataInitiation(OBWriteFile2DataInitiation initiation) {
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
                .build();
    }

    // FR to OB
    public static OBWriteFile2DataInitiation toOBWriteFile2DataInitiation(FRWriteFileDataInitiation initiation) {
        return initiation == null ? null : new OBWriteFile2DataInitiation()
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .remittanceInformation(FRRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBWriteFileConsent3 toOBWriteFileConsent3(FRWriteFileConsent consent) {
        return FRModelMapper.map(consent, OBWriteFileConsent3.class);
    }
}
