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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.account;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRDirectDebitData;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRDirectDebitData.FRDirectDebitStatus;
import uk.org.openbanking.datamodel.account.OBDirectDebit1;
import uk.org.openbanking.datamodel.account.OBExternalDirectDebitStatus1Code;
import uk.org.openbanking.datamodel.account.OBReadDirectDebit2DataDirectDebit;

import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAmountConverter.toFRAmount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount0;


/**
 * Converter for 'OBDirectDebit' model objects.
 */
public class FRDirectDebitConverter {

    // FR to OB
    public static OBDirectDebit1 toOBDirectDebit1(FRDirectDebitData directDebitData) {
        return directDebitData == null ? null : new OBDirectDebit1()
                .accountId(directDebitData.getAccountId())
                .directDebitId(directDebitData.getDirectDebitId())
                .mandateIdentification(directDebitData.getMandateIdentification())
                .directDebitStatusCode(toOBExternalDirectDebitStatus1Code(directDebitData.getDirectDebitStatusCode()))
                .name(directDebitData.getName())
                .previousPaymentDateTime(directDebitData.getPreviousPaymentDateTime())
                .previousPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(directDebitData.getPreviousPaymentAmount()));
    }

    public static OBReadDirectDebit2DataDirectDebit toOBReadDirectDebit2DataDirectDebit(FRDirectDebitData directDebitData) {
        return directDebitData == null ? null : new OBReadDirectDebit2DataDirectDebit()
                .accountId(directDebitData.getAccountId())
                .directDebitId(directDebitData.getDirectDebitId())
                .mandateIdentification(directDebitData.getMandateIdentification())
                .directDebitStatusCode(toOBExternalDirectDebitStatus1Code(directDebitData.getDirectDebitStatusCode()))
                .name(directDebitData.getName())
                .previousPaymentDateTime(directDebitData.getPreviousPaymentDateTime())
                .frequency(directDebitData.getFrequency())
                .previousPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount0(directDebitData.getPreviousPaymentAmount()));
    }

    public static OBExternalDirectDebitStatus1Code toOBExternalDirectDebitStatus1Code(FRDirectDebitStatus status) {
        return status == null ? null : OBExternalDirectDebitStatus1Code.valueOf(status.name());
    }

    // OB to FR
    public static FRDirectDebitData toFRDirectDebitData(OBDirectDebit1 obDirectDebit) {
        return obDirectDebit == null ? null : FRDirectDebitData.builder()
                .accountId(obDirectDebit.getAccountId())
                .directDebitId(obDirectDebit.getDirectDebitId())
                .mandateIdentification(obDirectDebit.getMandateIdentification())
                .directDebitStatusCode(toFRDirectDebitStatus(obDirectDebit.getDirectDebitStatusCode()))
                .name(obDirectDebit.getName())
                .previousPaymentDateTime(obDirectDebit.getPreviousPaymentDateTime())
                .previousPaymentAmount(toFRAmount(obDirectDebit.getPreviousPaymentAmount()))
                .build();
    }

    public static FRDirectDebitData toFRDirectDebitData(OBReadDirectDebit2DataDirectDebit obDirectDebit) {
        return obDirectDebit == null ? null : FRDirectDebitData.builder()
                .accountId(obDirectDebit.getAccountId())
                .directDebitId(obDirectDebit.getDirectDebitId())
                .mandateIdentification(obDirectDebit.getMandateIdentification())
                .directDebitStatusCode(toFRDirectDebitStatus(obDirectDebit.getDirectDebitStatusCode()))
                .name(obDirectDebit.getName())
                .previousPaymentDateTime(obDirectDebit.getPreviousPaymentDateTime())
                .frequency(obDirectDebit.getFrequency())
                .previousPaymentAmount(toFRAmount(obDirectDebit.getPreviousPaymentAmount()))
                .build();
    }

    public static FRDirectDebitStatus toFRDirectDebitStatus(OBExternalDirectDebitStatus1Code status) {
        return status == null ? null : FRDirectDebitStatus.valueOf(status.name());
    }
}
