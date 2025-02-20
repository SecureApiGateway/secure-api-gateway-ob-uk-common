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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRRemittanceInformationConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticScheduledConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticScheduledConsentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticScheduledDataInitiation;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduled2DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticScheduledConsent4Data;

public class FRWriteDomesticScheduledConsentConverter {

    // OB to FR
    public static FRWriteDomesticScheduledConsent toFRWriteDomesticScheduledConsent(OBWriteDomesticScheduledConsent4 obWriteDomesticScheduledConsent4) {
        return obWriteDomesticScheduledConsent4 == null ? null : FRWriteDomesticScheduledConsent.builder()
                .data(toFRWriteDomesticScheduledConsentData(obWriteDomesticScheduledConsent4.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteDomesticScheduledConsent4.getRisk()))
                .build();
    }

    public static FRWriteDomesticScheduledConsentData toFRWriteDomesticScheduledConsentData(OBWriteDomesticScheduledConsent4Data data) {
        return data == null ? null : FRWriteDomesticScheduledConsentData.builder()
                .permission(FRPermissionConverter.toFRPermission(data.getPermission()))
                .readRefundAccount(FRReadRefundAccountConverter.toFRReadRefundAccount(data.getReadRefundAccount()))
                .initiation(toFRWriteDomesticScheduledDataInitiation(data.getInitiation()))
                .authorisation(FRDataAuthorisationConverter.toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteDomesticScheduledDataInitiation toFRWriteDomesticScheduledDataInitiation(OBWriteDomesticScheduled2DataInitiation initiation) {
        return initiation == null ? null : FRWriteDomesticScheduledDataInitiation.builder()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(FRAmountConverter.toFRAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .creditorPostalAddress(FRPostalAddressConverter.toFRPostalAddress(initiation.getCreditorPostalAddress()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .remittanceInformation(FRRemittanceInformationConverter.toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .regulatoryReporting(FRRegulatoryReportingConverter.toFRRegulatoryReporting(initiation.getRegulatoryReporting()))
                .ultimateCreditor(FRUltimateCreditorConverter.toFRUltimateCreditor(initiation.getUltimateCreditor()))
                .ultimateDebtor(FRUltimateDebtorConverter.toFRUltimateDebtor(initiation.getUltimateDebtor()))
                .build();
    }

    // FR to OB
    public static OBWriteDomesticScheduled2DataInitiation toOBWriteDomesticScheduled2DataInitiation(FRWriteDomesticScheduledDataInitiation initiation) {
        return initiation == null ? null : new OBWriteDomesticScheduled2DataInitiation()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(FRAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .creditorPostalAddress(FRPostalAddressConverter.toOBPostalAddress7(initiation.getCreditorPostalAddress()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()))
                .remittanceInformation(FRRemittanceInformationConverter.toOBRemittanceInformation2(initiation.getRemittanceInformation()))
                .regulatoryReporting(FRRegulatoryReportingConverter.toOBRegulatoryReporting1(initiation.getRegulatoryReporting()))
                .ultimateCreditor(FRUltimateCreditorConverter.toOBUltimateCreditor1(initiation.getUltimateCreditor()))
                .ultimateDebtor(FRUltimateDebtorConverter.toOBUltimateDebtor1(initiation.getUltimateDebtor()));
    }

    public static OBWriteDomesticScheduledConsent4 toOBWriteDomesticScheduledConsent4(FRWriteDomesticScheduledConsent frConsent) {
        return FRModelMapper.map(frConsent, OBWriteDomesticScheduledConsent4.class);
    }
}
