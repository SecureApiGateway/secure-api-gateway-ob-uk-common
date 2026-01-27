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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticStandingOrderConsent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticStandingOrderConsentData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticStandingOrderDataInitiation;

import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticStandingOrder3DataInitiation;
import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticStandingOrderConsent5;
import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticStandingOrderConsent5Data;
import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticStandingOrderConsentResponse6DataInitiation;

public class FRWriteDomesticStandingOrderConsentConverter {

    // OB to FR
    public static FRWriteDomesticStandingOrderConsent toFRWriteDomesticStandingOrderConsent(OBWriteDomesticStandingOrderConsent5 obWriteDomesticStandingOrderConsent5) {
        return obWriteDomesticStandingOrderConsent5 == null ? null : FRWriteDomesticStandingOrderConsent.builder()
                .data(toFRWriteDomesticStandingOrderConsent(obWriteDomesticStandingOrderConsent5.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(obWriteDomesticStandingOrderConsent5.getRisk()))
                .build();
    }

    public static FRWriteDomesticStandingOrderConsentData toFRWriteDomesticStandingOrderConsent(OBWriteDomesticStandingOrderConsent5Data data) {
        return data == null ? null : FRWriteDomesticStandingOrderConsentData.builder()
                .permission(FRPermissionConverter.toFRPermission(data.getPermission()))
                .readRefundAccount(FRReadRefundAccountConverter.toFRReadRefundAccount(data.getReadRefundAccount()))
                .initiation(toFRWriteDomesticStandingOrderDataInitiation(data.getInitiation()))
                .authorisation(FRDataAuthorisationConverter.toFRDataAuthorisation(data.getAuthorisation()))
                .scASupportData(FRDataSCASupportDataConverter.toFRDataSCASupportData(data.getScASupportData()))
                .build();
    }

    public static FRWriteDomesticStandingOrderDataInitiation toFRWriteDomesticStandingOrderDataInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        return initiation == null ? null : FRWriteDomesticStandingOrderDataInitiation.builder()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(initiation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .firstPaymentAmount(FRAmountConverter.toFRAmount(initiation.getFirstPaymentAmount()))
                .recurringPaymentAmount(FRAmountConverter.toFRAmount(initiation.getRecurringPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toFRAmount(initiation.getFinalPaymentAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(initiation.getSupplementaryData()))
                .build();
    }

    // FR to OB
    public static OBWriteDomesticStandingOrder3DataInitiation toOBWriteDomesticStandingOrder3DataInitiation(FRWriteDomesticStandingOrderDataInitiation initiation) {
        return initiation == null ? null : new OBWriteDomesticStandingOrder3DataInitiation()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(initiation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .firstPaymentAmount(FRAmountConverter.toOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount(initiation.getFirstPaymentAmount()))
                .recurringPaymentAmount(FRAmountConverter.toOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount(initiation.getRecurringPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount(initiation.getFinalPaymentAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }

    public static OBWriteDomesticStandingOrderConsentResponse6DataInitiation toOBWriteDomesticStandingOrderConsentResponse6DataInitiation(FRWriteDomesticStandingOrderDataInitiation initiation) {
        return initiation == null ? null : new OBWriteDomesticStandingOrderConsentResponse6DataInitiation()
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(initiation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .firstPaymentAmount(FRAmountConverter.toOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount(initiation.getFirstPaymentAmount()))
                .recurringPaymentAmount(FRAmountConverter.toOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount(initiation.getRecurringPaymentAmount()))
                .finalPaymentAmount(FRAmountConverter.toOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount(initiation.getFinalPaymentAmount()))
                .debtorAccount(FRAccountIdentifierConverter.toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(FRAccountIdentifierConverter.toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(initiation.getSupplementaryData()));
    }


    public static OBWriteDomesticStandingOrderConsent5 toOBWriteDomesticStandingOrderConsent5(FRWriteDomesticStandingOrderConsent consent) {
        return FRModelMapper.map(consent, OBWriteDomesticStandingOrderConsent5.class);
    }
}
