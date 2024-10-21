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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.account.FRDirectDebitData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.converter.common.FRAmountConverter;

import uk.org.openbanking.datamodel.v3.account.OBExternalDirectDebitStatus1Code;
import uk.org.openbanking.datamodel.v3.account.OBReadDirectDebit2DataDirectDebitInner;


/**
 * Converter for 'OBDirectDebit' model objects.
 */
public class FRDirectDebitConverter {

    // FR to OB

    public static OBReadDirectDebit2DataDirectDebitInner toOBReadDirectDebit2DataDirectDebit(FRDirectDebitData directDebitData) {
        return directDebitData == null ? null : new OBReadDirectDebit2DataDirectDebitInner()
                .accountId(directDebitData.getAccountId())
                .directDebitId(directDebitData.getDirectDebitId())
                .mandateIdentification(directDebitData.getMandateIdentification())
                .directDebitStatusCode(toOBExternalDirectDebitStatus1Code(directDebitData.getDirectDebitStatusCode()))
                .name(directDebitData.getName())
                .previousPaymentDateTime(directDebitData.getPreviousPaymentDateTime())
                .frequency(directDebitData.getFrequency())
                .previousPaymentAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount0(directDebitData.getPreviousPaymentAmount()));
    }

    public static OBExternalDirectDebitStatus1Code toOBExternalDirectDebitStatus1Code(FRDirectDebitData.FRDirectDebitStatus status) {
        return status == null ? null : OBExternalDirectDebitStatus1Code.valueOf(status.name());
    }

    // OB to FR
    public static FRDirectDebitData toFRDirectDebitData(OBReadDirectDebit2DataDirectDebitInner obDirectDebit) {
        return obDirectDebit == null ? null : FRDirectDebitData.builder()
                .accountId(obDirectDebit.getAccountId())
                .directDebitId(obDirectDebit.getDirectDebitId())
                .mandateIdentification(obDirectDebit.getMandateIdentification())
                .directDebitStatusCode(toFRDirectDebitStatus(obDirectDebit.getDirectDebitStatusCode()))
                .name(obDirectDebit.getName())
                .previousPaymentDateTime(obDirectDebit.getPreviousPaymentDateTime())
                .frequency(obDirectDebit.getFrequency())
                .previousPaymentAmount(FRAmountConverter.toFRAmount(obDirectDebit.getPreviousPaymentAmount()))
                .build();
    }

    public static FRDirectDebitData.FRDirectDebitStatus toFRDirectDebitStatus(OBExternalDirectDebitStatus1Code status) {
        return status == null ? null : FRDirectDebitData.FRDirectDebitStatus.valueOf(status.name());
    }
}
