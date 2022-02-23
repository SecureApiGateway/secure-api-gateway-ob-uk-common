/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAccountIdentifierConverter;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteDomesticScheduledConsent;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteDomesticScheduledConsentData;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRWriteDomesticScheduledDataInitiation;
import uk.org.openbanking.datamodel.payment.*;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAccountIdentifierConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRAmountConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRiskConverter.toFRPaymentRisk;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRPostalAddressConverter.toFRPostalAddress;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRPostalAddressConverter.toOBPostalAddress6;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRRemittanceInformationConverter.*;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRSupplementaryDataConverter.toFRSupplementaryData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common.FRSupplementaryDataConverter.toOBSupplementaryData1;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRDataAuthorisationConverter.toFRDataAuthorisation;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRPermissionConverter.toFRPermission;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment.FRReadRefundAccountConverter.toFRReadRefundAccount;

public class FRWriteDomesticScheduledConsentConverter {

    // OB to FR
    public static FRWriteDomesticScheduledConsent toFRWriteDomesticScheduledConsent(OBWriteDomesticScheduledConsent1 obWriteDomesticScheduledConsent1) {
        return obWriteDomesticScheduledConsent1 == null ? null : FRWriteDomesticScheduledConsent.builder()
                .data(toFRWriteDomesticScheduledConsentData(obWriteDomesticScheduledConsent1.getData()))
                .risk(toFRPaymentRisk(obWriteDomesticScheduledConsent1.getRisk()))
                .build();
    }

    public static FRWriteDomesticScheduledConsent toFRWriteDomesticScheduledConsent(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return obWriteDomesticScheduledConsent2 == null ? null : FRWriteDomesticScheduledConsent.builder()
                .data(toFRWriteDomesticScheduledConsentData(obWriteDomesticScheduledConsent2.getData()))
                .risk(toFRPaymentRisk(obWriteDomesticScheduledConsent2.getRisk()))
                .build();
    }

    public static FRWriteDomesticScheduledConsent toFRWriteDomesticScheduledConsent(OBWriteDomesticScheduledConsent3 obWriteDomesticScheduledConsent3) {
        return obWriteDomesticScheduledConsent3 == null ? null : FRWriteDomesticScheduledConsent.builder()
                .data(toFRWriteDomesticScheduledConsentData(obWriteDomesticScheduledConsent3.getData()))
                .risk(toFRPaymentRisk(obWriteDomesticScheduledConsent3.getRisk()))
                .build();
    }

    public static FRWriteDomesticScheduledConsent toFRWriteDomesticScheduledConsent(OBWriteDomesticScheduledConsent4 obWriteDomesticScheduledConsent4) {
        return obWriteDomesticScheduledConsent4 == null ? null : FRWriteDomesticScheduledConsent.builder()
                .data(toFRWriteDomesticScheduledConsentData(obWriteDomesticScheduledConsent4.getData()))
                .risk(toFRPaymentRisk(obWriteDomesticScheduledConsent4.getRisk()))
                .build();
    }

    public static FRWriteDomesticScheduledConsentData toFRWriteDomesticScheduledConsentData(OBWriteDataDomesticScheduledConsent1 data) {
        return data == null ? null : FRWriteDomesticScheduledConsentData.builder()
                .permission(toFRPermission(data.getPermission()))
                .initiation(toFRWriteDomesticScheduledDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .build();
    }

    public static FRWriteDomesticScheduledConsentData toFRWriteDomesticScheduledConsentData(OBWriteDataDomesticScheduledConsent2 data) {
        return data == null ? null : FRWriteDomesticScheduledConsentData.builder()
                .permission(toFRPermission(data.getPermission()))
                .initiation(toFRWriteDomesticScheduledDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .build();
    }

    public static FRWriteDomesticScheduledConsentData toFRWriteDomesticScheduledConsentData(OBWriteDomesticScheduledConsent3Data data) {
        return data == null ? null : FRWriteDomesticScheduledConsentData.builder()
                .permission(toFRPermission(data.getPermission()))
                .initiation(toFRWriteDomesticScheduledDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteDomesticScheduledConsentData toFRWriteDomesticScheduledConsentData(OBWriteDomesticScheduledConsent4Data data) {
        return data == null ? null : FRWriteDomesticScheduledConsentData.builder()
                .permission(toFRPermission(data.getPermission()))
                .readRefundAccount(toFRReadRefundAccount(data.getReadRefundAccount()))
                .initiation(toFRWriteDomesticScheduledDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteDomesticScheduledDataInitiation toFRWriteDomesticScheduledDataInitiation(OBDomesticScheduled1 initiation) {
        return initiation == null ? null : FRWriteDomesticScheduledDataInitiation.builder()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toFRAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .creditorPostalAddress(toFRPostalAddress(initiation.getCreditorPostalAddress()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .build();
    }

    public static FRWriteDomesticScheduledDataInitiation toFRWriteDomesticScheduledDataInitiation(OBDomesticScheduled2 initiation) {
        return initiation == null ? null : FRWriteDomesticScheduledDataInitiation.builder()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toFRAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .creditorPostalAddress(toFRPostalAddress(initiation.getCreditorPostalAddress()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    public static FRWriteDomesticScheduledDataInitiation toFRWriteDomesticScheduledDataInitiation(OBWriteDomesticScheduled2DataInitiation initiation) {
        return initiation == null ? null : FRWriteDomesticScheduledDataInitiation.builder()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toFRAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .creditorPostalAddress(toFRPostalAddress(initiation.getCreditorPostalAddress()))
                .remittanceInformation(toFRRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    // FR to OB
    public static OBWriteDomesticScheduled2DataInitiation toOBWriteDomesticScheduled2DataInitiation(FRWriteDomesticScheduledDataInitiation initiation) {
        return initiation == null ? null : new OBWriteDomesticScheduled2DataInitiation()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .creditorPostalAddress(toOBPostalAddress6(initiation.getCreditorPostalAddress()))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBDomesticScheduled1 toOBDomesticScheduled1(FRWriteDomesticScheduledDataInitiation initiation) {
        return initiation == null ? null : new OBDomesticScheduled1()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(toOBPostalAddress6(initiation.getCreditorPostalAddress()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBDomesticScheduled2 toOBDomesticScheduled2(FRWriteDomesticScheduledDataInitiation initiation) {
        return initiation == null ? null : new OBDomesticScheduled2()
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(toOBPostalAddress6(initiation.getCreditorPostalAddress()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(toOBSupplementaryData1(initiation.getSupplementaryData()));
    }
}
