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

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRChargeBearerConverter.toFRChargeBearerType;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRChargeBearerConverter.toOBChargeBearerType1Code;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRDataAuthorisationConverter.toFRDataAuthorisation;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRDataSCASupportDataConverter.toFRDataSCASupportData;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRPermissionConverter.toFRPermission;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment.FRReadRefundAccountConverter.toFRReadRefundAccount;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRFinancialInstrumentConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalStandingOrderConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalStandingOrderConsentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalStandingOrderDataInitiation;

import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrder4DataInitiation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrderConsent6;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrderConsent6Data;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrderConsentResponse7DataInitiation;

public class FRWriteInternationalStandingOrderConsentConverter {

    // OB to FR
    public static FRWriteInternationalStandingOrderConsent toFRWriteInternationalStandingOrderConsent(OBWriteInternationalStandingOrderConsent6 obWriteInternationalStandingOrderConsent6) {
        return obWriteInternationalStandingOrderConsent6 == null ? null : FRWriteInternationalStandingOrderConsent.builder()
                .data(toFRWriteInternationalStandingOrderConsentData(obWriteInternationalStandingOrderConsent6.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteInternationalStandingOrderConsent6.getRisk()))
                .build();
    }

    public static FRWriteInternationalStandingOrderConsentData toFRWriteInternationalStandingOrderConsentData(OBWriteInternationalStandingOrderConsent6Data data) {
        return data == null ? null : FRWriteInternationalStandingOrderConsentData.builder()
                .permission(toFRPermission(data.getPermission()))
                .readRefundAccount(toFRReadRefundAccount(data.getReadRefundAccount()))
                .initiation(toFRWriteInternationalStandingOrderDataInitiation(data.getInitiation()))
                .authorisation(toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteInternationalStandingOrderDataInitiation toFRWriteInternationalStandingOrderDataInitiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        return initiation == null ? null : FRWriteInternationalStandingOrderDataInitiation.builder()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toFRChargeBearerType(initiation.getChargeBearer()))
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toFRAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toFRFinancialCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    public static FRWriteInternationalStandingOrderDataInitiation toFRWriteInternationalStandingOrderDataInitiation(OBWriteInternationalStandingOrderConsentResponse7DataInitiation initiation) {
        return initiation == null ? null : FRWriteInternationalStandingOrderDataInitiation.builder()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toFRChargeBearerType(initiation.getChargeBearer()))
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toFRAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toFRFinancialCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    // FR to OB
    public static OBWriteInternationalStandingOrder4DataInitiation toOBWriteInternationalStandingOrder4DataInitiation(FRWriteInternationalStandingOrderDataInitiation initiation) {
        return initiation == null ? null : new OBWriteInternationalStandingOrder4DataInitiation()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toOBChargeBearerType1Code(initiation.getChargeBearer()))
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBWriteInternationalStandingOrderConsentResponse7DataInitiation toOBWriteInternationalStandingOrderConsentResponse7DataInitiation(FRWriteInternationalStandingOrderDataInitiation initiation) {
        return initiation == null ? null : new OBWriteInternationalStandingOrderConsentResponse7DataInitiation()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .extendedPurpose(initiation.getExtendedPurpose())
                .chargeBearer(toOBChargeBearerType1Code(initiation.getChargeBearer()))
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(initiation.getDestinationCountryCode())
                .instructedAmount(FRAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(FRFinancialInstrumentConverter.toOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(FRFinancialInstrumentConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBWriteInternationalStandingOrderConsent6 toOBWriteInternationalStandingOrderConsent6(FRWriteInternationalStandingOrderConsent frConsent) {
        return FRModelMapper.map(frConsent, OBWriteInternationalStandingOrderConsent6.class);
    }
}
