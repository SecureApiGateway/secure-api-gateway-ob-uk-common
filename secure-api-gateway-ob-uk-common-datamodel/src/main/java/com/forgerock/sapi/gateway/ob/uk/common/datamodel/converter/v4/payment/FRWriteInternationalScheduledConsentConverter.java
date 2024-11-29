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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRChargeBearerConverter.toFRChargeBearerType;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRChargeBearerConverter.toOBInternalChargeBearerType1Code;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRExchangeRateConverter.toFRExchangeRateInformation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRExchangeRateConverter.toOBWriteInternational3DataInitiationExchangeRateInformation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRInstructionPriorityConverter.toFRInstructionPriority;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRInstructionPriorityConverter.toOBPriority2Code;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRPermissionConverter.toFRPermission;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRRemittanceInformationConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRFinancialInstrumentConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalScheduledConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalScheduledConsentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalScheduledDataInitiation;

import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduled3DataInitiation;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduledConsent5;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduledConsent5Data;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalScheduledConsentResponse6DataInitiation;

public class FRWriteInternationalScheduledConsentConverter {

    // OB to FR
    public static FRWriteInternationalScheduledConsent toFRWriteInternationalScheduledConsent(OBWriteInternationalScheduledConsent5 obWriteInternationalScheduledConsent5) {
        return obWriteInternationalScheduledConsent5 == null ? null : FRWriteInternationalScheduledConsent.builder()
                .data(toFRWriteInternationalScheduledConsentData(obWriteInternationalScheduledConsent5.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteInternationalScheduledConsent5.getRisk()))
                .build();
    }

    public static FRWriteInternationalScheduledConsentData toFRWriteInternationalScheduledConsentData(OBWriteInternationalScheduledConsent5Data data) {
        return data == null ? null : FRWriteInternationalScheduledConsentData.builder()
                .permission(toFRPermission(data.getPermission()))
                .readRefundAccount(FRReadRefundAccountConverter.toFRReadRefundAccount(data.getReadRefundAccount()))
                .initiation(toFRWriteInternationalScheduledDataInitiation(data.getInitiation()))
                .authorisation(FRDataAuthorisationConverter.toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteInternationalScheduledDataInitiation toFRWriteInternationalScheduledDataInitiation(OBWriteInternationalScheduled3DataInitiation initiation) {
        return initiation == null ? null : FRWriteInternationalScheduledDataInitiation.builder()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toFRInstructionPriority(initiation.getInstructionPriority()))
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toFRChargeBearerType(initiation.getChargeBearer()))
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toFRAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toFRExchangeRateInformation(initiation.getExchangeRateInformation()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toFRFinancialCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .ultimateCreditor(FRUltimateCreditorConverter.toFRUltimateCreditor(initiation.getUltimateCreditor()))
                .ultimateDebtor(FRUltimateDebtorConverter.toFRUltimateDebtor(initiation.getUltimateDebtor()))
                .regulatoryReporting(FRRegulatoryReportingConverter.toFRRegulatoryReporting(initiation.getRegulatoryReporting()))
                .remittanceInformation(FRRemittanceInformationConverter.toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    public static FRWriteInternationalScheduledDataInitiation toFRWriteInternationalScheduledDataInitiation(OBWriteInternationalScheduledConsentResponse6DataInitiation initiation) {
        return initiation == null ? null : FRWriteInternationalScheduledDataInitiation.builder()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toFRInstructionPriority(initiation.getInstructionPriority()))
                .purpose(initiation.getPurpose())
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toFRChargeBearerType(initiation.getChargeBearer()))
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toFRAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toFRExchangeRateInformation(initiation.getExchangeRateInformation()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toFRFinancialCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .ultimateCreditor(FRUltimateCreditorConverter.toFRUltimateCreditor(initiation.getUltimateCreditor()))
                .ultimateDebtor(FRUltimateDebtorConverter.toFRUltimateDebtor(initiation.getUltimateDebtor()))
                .regulatoryReporting(FRRegulatoryReportingConverter.toFRRegulatoryReporting(initiation.getRegulatoryReporting()))
                .remittanceInformation(FRRemittanceInformationConverter.toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    // FR to OB
    public static OBWriteInternationalScheduled3DataInitiation toOBWriteInternationalScheduled3DataInitiation(FRWriteInternationalScheduledDataInitiation initiation) {
        return initiation == null ? null : new OBWriteInternationalScheduled3DataInitiation()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toOBPriority2Code(initiation.getInstructionPriority()))
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toOBInternalChargeBearerType1Code(initiation.getChargeBearer()))
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBWriteInternational3DataInitiationExchangeRateInformation(initiation.getExchangeRateInformation()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toOBWriteInternationalConsent5DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBWriteInternationalScheduled3DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .ultimateCreditor(FRUltimateCreditorConverter.toOBUltimateCreditor1(initiation.getUltimateCreditor()))
                .ultimateDebtor(FRUltimateDebtorConverter.toOBUltimateDebtor1(initiation.getUltimateDebtor()))
                .regulatoryReporting(FRRegulatoryReportingConverter.toOBRegulatoryReporting1(initiation.getRegulatoryReporting()))
                .remittanceInformation(FRRemittanceInformationConverter.toOBRemittanceInformation2(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBWriteInternationalScheduledConsentResponse6DataInitiation toOBWriteInternationalScheduledConsentResponse6DataInitiation(FRWriteInternationalScheduledDataInitiation initiation) {
        return initiation == null ? null : new OBWriteInternationalScheduledConsentResponse6DataInitiation()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toOBPriority2Code(initiation.getInstructionPriority()))
                .purpose(initiation.getPurpose())
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toOBInternalChargeBearerType1Code(initiation.getChargeBearer()))
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBWriteInternational3DataInitiationExchangeRateInformation(initiation.getExchangeRateInformation()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBWriteDomestic2DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .ultimateCreditor(FRUltimateCreditorConverter.toOBUltimateCreditor1(initiation.getUltimateCreditor()))
                .ultimateDebtor(FRUltimateDebtorConverter.toOBUltimateDebtor1(initiation.getUltimateDebtor()))
                .regulatoryReporting(FRRegulatoryReportingConverter.toOBRegulatoryReporting1(initiation.getRegulatoryReporting()))
                .remittanceInformation(FRRemittanceInformationConverter.toOBRemittanceInformation2(initiation.getRemittanceInformation()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBWriteInternationalScheduledConsent5 toOBWriteInternationalScheduledConsent5(FRWriteInternationalScheduledConsent frConsent) {
        return FRModelMapper.map(frConsent, OBWriteInternationalScheduledConsent5.class);
    }
}
