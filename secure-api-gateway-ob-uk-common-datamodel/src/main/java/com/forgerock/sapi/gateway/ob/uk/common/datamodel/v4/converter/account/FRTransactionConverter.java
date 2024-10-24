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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRExternalCategoryPurposeCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.account.FRTransactionData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAccountIdentifierConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAmountConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRFinancialInstrumentConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRSupplementaryDataConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.payment.FRExternalPaymentPurposeCode;
import uk.org.openbanking.datamodel.v4.account.*;
import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRAccountServicerConverter.toOBUltimateCreditor1;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRAccountServicerConverter.toOBUltimateDebtor1;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRCashBalanceConverter.toFRBalanceType;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRCashBalanceConverter.toOBBalanceType1Code;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FREntryStatusConverter.toExternalEntryStatus1CodeV4;

public class FRTransactionConverter {

    public static OBTransaction6 toOBTransaction6(FRTransactionData transaction) {
        return transaction == null ? null : new OBTransaction6()
                .accountId(transaction.getAccountId())
                .categoryPurposeCode(toOBExternalCategoryPurpose1Code(transaction.getCategoryPurposeCode()))
                .paymentPurposeCode(toExternalPurpose1Code(transaction.getPaymentPurposeCode()))
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReference(transaction.getStatementReferences())
                .creditDebitIndicator(FRCreditDebitIndicatorConverter.toOBCreditDebitCode1(transaction.getCreditDebitIndicator()))
                .status(toExternalEntryStatus1CodeV4(String.valueOf(transaction.getStatus())))
                .transactionMutability(toOBTransactionMutability1Code(transaction.getTransactionMutability()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .transactionInformation(transaction.getTransactionInformation())
                .addressLine(transaction.getAddressLine())
                .amount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount9(transaction.getAmount()))
                .chargeAmount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount10(transaction.getChargeAmount()))
                .currencyExchange(FRCurrencyExchangeConverter.toOBCurrencyExchange5(transaction.getCurrencyExchange()))
                .bankTransactionCode(toOBBankTransactionCodeStructure1(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toProprietaryBankTransactionCodeStructure1(transaction.getProprietaryBankTransactionCode()))
                .balance(toOBTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toOBMerchantDetails1(transaction.getMerchantDetails()))
                .creditorAgent(FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification61(transaction.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toOBCashAccount60(transaction.getCreditorAccount()))
                .debtorAgent(FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification62(transaction.getDebtorAgent()))
                .debtorAccount(FRAccountIdentifierConverter.toOBCashAccount61(transaction.getDebtorAccount()))
                .cardInstrument(toOBTransactionCardInstrument1(transaction.getCardInstrument()))
                .ultimateCreditor(toOBUltimateCreditor1(transaction.getUltimateCreditor()))
                .ultimateDebtor(toOBUltimateDebtor1(transaction.getUltimateDebtor()))
                .extendedProprietaryBankTransactionCodes(toOBExtendedProprietaryBankTransactionCodeList(transaction.getExtendedProprietaryBankTransactionCode()))
                .supplementaryData(FRSupplementaryDataConverter.toOBSupplementaryData1(transaction.getSupplementaryData()));
    }

    public static ExternalEntryStatus1Code toOBEntryStatus1Code(FRTransactionData.FREntryStatus status) {
        return status == null ? null : ExternalEntryStatus1Code.valueOf(status.name());
    }

    public static ExternalCategoryPurpose1Code toOBExternalCategoryPurpose1Code(FRExternalCategoryPurposeCode categoryPurposeCode) {
        return categoryPurposeCode == null ? null : ExternalCategoryPurpose1Code.valueOf(categoryPurposeCode.name());
    }

    public static OBExternalPurpose1Code toExternalPurpose1Code(FRExternalPaymentPurposeCode externalPaymentPurposeCode) {
        return externalPaymentPurposeCode == null ? null : OBExternalPurpose1Code.valueOf(externalPaymentPurposeCode.name());
    }

    public static OBInternalTransactionMutability1Code toOBTransactionMutability1Code(FRTransactionData.FRTransactionMutability transactionMutability) {
        return transactionMutability == null ? null : OBInternalTransactionMutability1Code.valueOf(transactionMutability.name());
    }

    public static OBBankTransactionCodeStructure1 toOBBankTransactionCodeStructure1(FRTransactionData.FRBankTransactionCodeStructure transactionCode) {
        return transactionCode == null ? null : new OBBankTransactionCodeStructure1()
                .code(transactionCode.getCode())
                .subCode(transactionCode.getSubCode());
    }

    public static ProprietaryBankTransactionCodeStructure1 toProprietaryBankTransactionCodeStructure1(FRTransactionData.FRProprietaryBankTransactionCodeStructure proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : new ProprietaryBankTransactionCodeStructure1()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer());
    }

    public static OBExtendedProprietaryBankTransactionCode toOBExtendedProprietaryBankTransactionCode(FRTransactionData.FRExtendedProprietaryBankTransactionCodeStructure extendedProprietaryBankTransactionCode) {
        return extendedProprietaryBankTransactionCode == null ? null : new OBExtendedProprietaryBankTransactionCode()
                .code(extendedProprietaryBankTransactionCode.getCode())
                .description(extendedProprietaryBankTransactionCode.getDescription())
                .issuer(extendedProprietaryBankTransactionCode.getIssuer());
    }

    public static List<OBExtendedProprietaryBankTransactionCode> toOBExtendedProprietaryBankTransactionCodeList(List<FRTransactionData.FRExtendedProprietaryBankTransactionCodeStructure> extendedProprietaryBankTransaction) {
        return extendedProprietaryBankTransaction == null ? null : extendedProprietaryBankTransaction.stream()
                .map(FRTransactionConverter::toOBExtendedProprietaryBankTransactionCode)
                .collect(Collectors.toList());
    }

    public static OBTransactionCardInstrument1 toOBTransactionCardInstrument1(FRTransactionData.FRTransactionCardInstrument cardInstrument) {
        return cardInstrument == null ? null : new OBTransactionCardInstrument1()
                .cardSchemeName(toOBTransactionCardInstrument1CardSchemeName(cardInstrument.getCardSchemeName()))
                .authorisationType(toOBTransactionCardInstrument1AuthorisationType(cardInstrument.getAuthorisationType()))
                .name(cardInstrument.getName())
                .identification(cardInstrument.getIdentification());
    }

    public static OBTransactionCashBalance toOBTransactionCashBalance(FRTransactionData.FRTransactionCashBalance balance) {
        return balance == null ? null : new OBTransactionCashBalance()
                .amount(FRAmountConverter.toOBTransactionCashBalanceAmount(balance.getAmount()))
                .creditDebitIndicator(FRCreditDebitIndicatorConverter.toOBCreditDebitCode2(balance.getCreditDebitIndicator()))
                .type(toOBBalanceType1Code(balance.getType()));
    }

    public static OBMerchantDetails1 toOBMerchantDetails1(FRTransactionData.FRMerchantDetails merchantDetails) {
        return merchantDetails == null ? null : new OBMerchantDetails1()
                .merchantName(merchantDetails.getMerchantName())
                .merchantCategoryCode(merchantDetails.getMerchantCategoryCode());
    }

    public static OBTransactionCardInstrument1CardSchemeName toOBTransactionCardInstrument1CardSchemeName(FRTransactionData.FRCardScheme cardSchemeName) {
        return cardSchemeName == null ? null : OBTransactionCardInstrument1CardSchemeName.valueOf(cardSchemeName.name());
    }

    public static OBTransactionCardInstrument1AuthorisationType toOBTransactionCardInstrument1AuthorisationType(FRTransactionData.FRCardAuthorisationType authorisationType) {
        return authorisationType == null ? null : OBTransactionCardInstrument1AuthorisationType.valueOf(authorisationType.name());
    }

    // OB to FR
    public static FRTransactionData toFRTransactionData(OBTransaction6 transaction) {
        return transaction == null ? null : FRTransactionData.builder()
                .accountId(transaction.getAccountId())
                .transactionId(transaction.getTransactionId())
                .transactionReference(transaction.getTransactionReference())
                .statementReferences(transaction.getStatementReference())
                .creditDebitIndicator(FRCreditDebitIndicatorConverter.toFRCreditDebitIndicator(transaction.getCreditDebitIndicator()))
                .status(toFREntryStatus(transaction.getStatus()))
                .transactionMutability(toFRTransactionMutability(transaction.getTransactionMutability()))
                .bookingDateTime(transaction.getBookingDateTime())
                .valueDateTime(transaction.getValueDateTime())
                .transactionInformation(transaction.getTransactionInformation())
                .addressLine(transaction.getAddressLine())
                .amount(FRAmountConverter.toFRAmount(transaction.getAmount()))
                .chargeAmount(FRAmountConverter.toFRAmount(transaction.getChargeAmount()))
                .currencyExchange(FRCurrencyExchangeConverter.toFRCurrencyExchange(transaction.getCurrencyExchange()))
                .bankTransactionCode(toFRBankTransactionCodeStructure(transaction.getBankTransactionCode()))
                .proprietaryBankTransactionCode(toFRProprietaryBankTransactionCodeStructure(transaction.getProprietaryBankTransactionCode()))
                .balance(toFRTransactionCashBalance(transaction.getBalance()))
                .merchantDetails(toFRMerchantDetails(transaction.getMerchantDetails()))
                .creditorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(transaction.getCreditorAgent()))
                .creditorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(transaction.getCreditorAccount()))
                .debtorAgent(FRFinancialInstrumentConverter.toFRFinancialAgent(transaction.getDebtorAgent()))
                .debtorAccount(FRAccountIdentifierConverter.toFRAccountIdentifier(transaction.getDebtorAccount()))
                .cardInstrument(toFRTransactionCardInstrument(transaction.getCardInstrument()))
                .supplementaryData(FRSupplementaryDataConverter.toFRSupplementaryData(transaction.getSupplementaryData()))
                .categoryPurposeCode(toFRExternalCategoryPurposeCode(transaction.getCategoryPurposeCode()))
                .paymentPurposeCode(toFRExternalCategoryPurposeCode(transaction.getPaymentPurposeCode()))
                .ultimateCreditor(FRFinancialInstrumentConverter.toFRFinancialAgent(transaction.getUltimateCreditor()))
                .ultimateDebtor(FRFinancialInstrumentConverter.toFRFinancialAgent(transaction.getUltimateDebtor()))
                .extendedProprietaryBankTransactionCode(toFRExtendedProprietaryBankTransactionCodeStructureList(transaction.getExtendedProprietaryBankTransactionCodes(), FRTransactionConverter::toFRExtendedProprietaryBankTransactionCodeStructure))
                .build();
    }

    public static FRTransactionData.FREntryStatus toFREntryStatus(ExternalEntryStatus1Code status) {
        return status == null ? null : FRTransactionData.FREntryStatus.valueOf(status.name());
    }

    public static FRTransactionData.FRTransactionMutability toFRTransactionMutability(OBInternalTransactionMutability1Code transactionMutability) {
        return transactionMutability == null ? null : FRTransactionData.FRTransactionMutability.valueOf(transactionMutability.name());
    }

    public static FRExternalCategoryPurposeCode toFRExternalCategoryPurposeCode(ExternalCategoryPurpose1Code externalCategoryPurpose1Code) {
        return externalCategoryPurpose1Code == null ? null : FRExternalCategoryPurposeCode.valueOf(externalCategoryPurpose1Code.name());
    }

    public static FRExternalPaymentPurposeCode toFRExternalCategoryPurposeCode(OBExternalPurpose1Code obExternalPurpose1Code) {
        return obExternalPurpose1Code == null ? null : FRExternalPaymentPurposeCode.valueOf(obExternalPurpose1Code.name());
    }

    public static FRTransactionData.FRBankTransactionCodeStructure toFRBankTransactionCodeStructure(OBBankTransactionCodeStructure1 transactionCode) {
        return transactionCode == null ? null : FRTransactionData.FRBankTransactionCodeStructure.builder()
                .code(transactionCode.getCode())
                .subCode(transactionCode.getSubCode())
                .build();
    }

    public static FRTransactionData.FRProprietaryBankTransactionCodeStructure toFRProprietaryBankTransactionCodeStructure(ProprietaryBankTransactionCodeStructure1 proprietaryTransactionCode) {
        return proprietaryTransactionCode == null ? null : FRTransactionData.FRProprietaryBankTransactionCodeStructure.builder()
                .code(proprietaryTransactionCode.getCode())
                .issuer(proprietaryTransactionCode.getIssuer())
                .build();
    }

    public static FRTransactionData.FRExtendedProprietaryBankTransactionCodeStructure toFRExtendedProprietaryBankTransactionCodeStructure(OBExtendedProprietaryBankTransactionCode extendedProprietaryBankTransactionCode) {
        return extendedProprietaryBankTransactionCode == null ? null : FRTransactionData.FRExtendedProprietaryBankTransactionCodeStructure.builder()
                .code(extendedProprietaryBankTransactionCode.getCode())
                .issuer(extendedProprietaryBankTransactionCode.getIssuer())
                .description(extendedProprietaryBankTransactionCode.getDescription())
                .build();
    }

    public static <T> List<FRTransactionData.FRExtendedProprietaryBankTransactionCodeStructure> toFRExtendedProprietaryBankTransactionCodeStructureList(List<T> extendedProprietaryBankTransactionCode, Function<T, FRTransactionData.FRExtendedProprietaryBankTransactionCodeStructure> converter) {
        return extendedProprietaryBankTransactionCode == null ? null : extendedProprietaryBankTransactionCode.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static FRTransactionData.FRTransactionCashBalance toFRTransactionCashBalance(OBTransactionCashBalance balance) {
        return balance == null ? null : FRTransactionData.FRTransactionCashBalance.builder()
                .amount(FRAmountConverter.toFRAmount(balance.getAmount()))
                .creditDebitIndicator(FRCreditDebitIndicatorConverter.toFRCreditDebitIndicator(balance.getCreditDebitIndicator()))
                .type(toFRBalanceType(balance.getType()))
                .build();
    }

    public static FRTransactionData.FRMerchantDetails toFRMerchantDetails(OBMerchantDetails1 merchantDetails) {
        return merchantDetails == null ? null : FRTransactionData.FRMerchantDetails.builder()
                .merchantName(merchantDetails.getMerchantName())
                .merchantCategoryCode(merchantDetails.getMerchantCategoryCode())
                .build();
    }

    public static FRTransactionData.FRTransactionCardInstrument toFRTransactionCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        return cardInstrument == null ? null : FRTransactionData.FRTransactionCardInstrument.builder()
                .cardSchemeName(toFRCardScheme(cardInstrument.getCardSchemeName()))
                .authorisationType(toFRCardAuthorisationType(cardInstrument.getAuthorisationType()))
                .name(cardInstrument.getName())
                .identification(cardInstrument.getIdentification())
                .build();
    }

    public static FRTransactionData.FRCardScheme toFRCardScheme(OBTransactionCardInstrument1CardSchemeName cardSchemeName) {
        return cardSchemeName == null ? null : FRTransactionData.FRCardScheme.valueOf(cardSchemeName.name());
    }

    public static FRTransactionData.FRCardAuthorisationType toFRCardAuthorisationType(OBTransactionCardInstrument1AuthorisationType authorisationType) {
        return authorisationType == null ? null : FRTransactionData.FRCardAuthorisationType.valueOf(authorisationType.name());
    }
}
