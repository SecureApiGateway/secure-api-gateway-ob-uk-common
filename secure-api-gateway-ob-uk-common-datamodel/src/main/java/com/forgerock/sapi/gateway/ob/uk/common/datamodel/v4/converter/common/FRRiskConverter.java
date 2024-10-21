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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.account.FRAccountRisk;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRPaymentRisk;
import uk.org.openbanking.datamodel.v3.account.OBRisk2;
import uk.org.openbanking.datamodel.v4.common.ExternalPurpose1Code;
import uk.org.openbanking.datamodel.v4.common.OBRisk1;

public class FRRiskConverter {

    public static FRPaymentRisk toFRPaymentRisk(OBRisk1 obRisk1) {
        return obRisk1 == null ? null : FRPaymentRisk.builder()
                .deliveryAddress(FRRisk1DeliveryAddressConverter.toFRRiskDeliveryAddress(obRisk1.getDeliveryAddress()))
                .merchantCategoryCode(obRisk1.getMerchantCategoryCode())
                .merchantCustomerIdentification(obRisk1.getMerchantCustomerIdentification())
                .paymentContextCode(FROBExternalPaymentContext1CodeConverter.toFRExternalPaymentContextCode(obRisk1.getPaymentContextCode()))
                .contractPresentIndicator(obRisk1.getContractPresentIndicator())
                .paymentPurposeCode(obRisk1.getPaymentPurposeCode().getValue())
                .beneficiaryAccountType(FRInternalExtendedAccountTypeCodeConverter.toFRInternalExtendedAccountTypeCode(obRisk1.getBeneficiaryAccountType()))
                .beneficiaryPrepopulatedIndicator(obRisk1.getBeneficiaryPrepopulatedIndicator())
                .categoryPurposeCode(obRisk1.getCategoryPurposeCode())
                .build();
    }

    public static FRAccountRisk toFRAccountRisk(OBRisk2 obRisk) {
        return obRisk == null ? null : FRAccountRisk.builder()
                .data(obRisk.getData())
                .build();
    }

    public static OBRisk1 toOBRisk1(FRPaymentRisk frPaymentRisk) {
        return frPaymentRisk == null ? null : new OBRisk1()
                .deliveryAddress(FRRisk1DeliveryAddressConverter.toOBRisk1DeliveryAddress(frPaymentRisk.getDeliveryAddress()))
                .merchantCategoryCode(frPaymentRisk.getMerchantCategoryCode())
                .merchantCustomerIdentification(frPaymentRisk.getMerchantCustomerIdentification())
                .paymentContextCode(FROBExternalPaymentContext1CodeConverter.toOBExternalPaymentContext1Code(frPaymentRisk.getPaymentContextCode()))
                .beneficiaryAccountType(FRInternalExtendedAccountTypeCodeConverter.toOBInternalExtendedAccountType1Code(frPaymentRisk.getBeneficiaryAccountType()))
                .beneficiaryPrepopulatedIndicator(frPaymentRisk.getBeneficiaryPrepopulatedIndicator())
                .contractPresentIndicator(frPaymentRisk.getContractPresentIndicator())
                .paymentPurposeCode(ExternalPurpose1Code.valueOf(frPaymentRisk.getPaymentPurposeCode()));
    }

    public static OBRisk2 toOBRisk2(FRAccountRisk frRisk) {
        if (frRisk == null) {
            return null;
        }
        OBRisk2 obRisk = new OBRisk2();
        obRisk.setData(frRisk.getData());
        return obRisk;
    }


}
