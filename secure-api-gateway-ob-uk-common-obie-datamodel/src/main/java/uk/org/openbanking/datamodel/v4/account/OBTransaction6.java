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
package uk.org.openbanking.datamodel.v4.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

/**
 * Provides further details on an entry in the report.
 */

@Schema(name = "OBTransaction6", description = "Provides further details on an entry in the report.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBTransaction6 {

    private String accountId;

    private String transactionId;

    private String transactionReference;

    @Valid
    private List<@Valid String> statementReference;

    private OBCreditDebitCode1 creditDebitIndicator;

    private ExternalEntryStatus1Code status;

    private OBInternalTransactionMutability1Code transactionMutability;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime bookingDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime valueDateTime;

    private String transactionInformation;

    private String addressLine;

    private OBActiveOrHistoricCurrencyAndAmount9 amount;

    private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount;

    private OBCurrencyExchange5 currencyExchange;

    private OBBankTransactionCodeStructure1 bankTransactionCode;

    private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode;

    @Valid
    private List<@Valid OBExtendedProprietaryBankTransactionCode> extendedProprietaryBankTransactionCodes;

    private OBTransactionCashBalance balance;

    private OBMerchantDetails1 merchantDetails;

    private OBBranchAndFinancialInstitutionIdentification61 creditorAgent;

    private OBCashAccount60 creditorAccount;

    private OBBranchAndFinancialInstitutionIdentification62 debtorAgent;

    private OBCashAccount61 debtorAccount;

    private OBTransactionCardInstrument1 cardInstrument;

    private OBSupplementaryData1 supplementaryData;

    private ExternalCategoryPurpose1Code categoryPurposeCode;

    private OBExternalPurpose1Code paymentPurposeCode;

    private OBUltimateCreditor1 ultimateCreditor;

    private OBUltimateDebtor1 ultimateDebtor;

    public OBTransaction6() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBTransaction6(String accountId, OBCreditDebitCode1 creditDebitIndicator, ExternalEntryStatus1Code status, DateTime bookingDateTime, OBActiveOrHistoricCurrencyAndAmount9 amount) {
        this.accountId = accountId;
        this.creditDebitIndicator = creditDebitIndicator;
        this.status = status;
        this.bookingDateTime = bookingDateTime;
        this.amount = amount;
    }

    public OBTransaction6 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "AccountId", example = "22289", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBTransaction6 transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
     *
     * @return transactionId
     */
    @Size(min = 1, max = 210)
    @Schema(name = "TransactionId", description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public OBTransaction6 transactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    /**
     * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
     *
     * @return transactionReference
     */
    @Size(min = 1, max = 210)
    @Schema(name = "TransactionReference", description = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TransactionReference")
    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public OBTransaction6 statementReference(List<@Valid String> statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    public OBTransaction6 addStatementReferenceItem(String statementReferenceItem) {
        if (this.statementReference == null) {
            this.statementReference = new ArrayList<>();
        }
        this.statementReference.add(statementReferenceItem);
        return this;
    }

    /**
     * Get statementReference
     *
     * @return statementReference
     */

    @Schema(name = "StatementReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementReference")
    public List<@Valid String> getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(List<@Valid String> statementReference) {
        this.statementReference = statementReference;
    }

    public OBTransaction6 creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     */
    @NotNull
    @Valid
    @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreditDebitIndicator")
    public OBCreditDebitCode1 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBTransaction6 status(ExternalEntryStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @NotNull
    @Valid
    @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Status")
    public ExternalEntryStatus1Code getStatus() {
        return status;
    }

    public void setStatus(ExternalEntryStatus1Code status) {
        this.status = status;
    }

    public OBTransaction6 transactionMutability(OBInternalTransactionMutability1Code transactionMutability) {
        this.transactionMutability = transactionMutability;
        return this;
    }

    /**
     * Get transactionMutability
     *
     * @return transactionMutability
     */
    @Valid
    @Schema(name = "TransactionMutability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TransactionMutability")
    public OBInternalTransactionMutability1Code getTransactionMutability() {
        return transactionMutability;
    }

    public void setTransactionMutability(OBInternalTransactionMutability1Code transactionMutability) {
        this.transactionMutability = transactionMutability;
    }

    public OBTransaction6 bookingDateTime(DateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
        return this;
    }

    /**
     * Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return bookingDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "BookingDateTime", description = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("BookingDateTime")
    public DateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(DateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public OBTransaction6 valueDateTime(DateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
        return this;
    }

    /**
     * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return valueDateTime
     */
    @Valid
    @Schema(name = "ValueDateTime", description = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ValueDateTime")
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(DateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    public OBTransaction6 transactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
        return this;
    }

    /**
     * Further details of the transaction.  This is the transaction narrative, which is unstructured text.
     *
     * @return transactionInformation
     */
    @Size(min = 1, max = 500)
    @Schema(name = "TransactionInformation", description = "Further details of the transaction.  This is the transaction narrative, which is unstructured text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TransactionInformation")
    public String getTransactionInformation() {
        return transactionInformation;
    }

    public void setTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    public OBTransaction6 addressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    /**
     * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
     *
     * @return addressLine
     */
    @Size(min = 1, max = 70)
    @Schema(name = "AddressLine", description = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public OBTransaction6 amount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @NotNull
    @Valid
    @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount9 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
        this.amount = amount;
    }

    public OBTransaction6 chargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Get chargeAmount
     *
     * @return chargeAmount
     */
    @Valid
    @Schema(name = "ChargeAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ChargeAmount")
    public OBActiveOrHistoricCurrencyAndAmount10 getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public OBTransaction6 currencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
        return this;
    }

    /**
     * Get currencyExchange
     *
     * @return currencyExchange
     */
    @Valid
    @Schema(name = "CurrencyExchange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CurrencyExchange")
    public OBCurrencyExchange5 getCurrencyExchange() {
        return currencyExchange;
    }

    public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public OBTransaction6 bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
        return this;
    }

    /**
     * Get bankTransactionCode
     *
     * @return bankTransactionCode
     */
    @Valid
    @Schema(name = "BankTransactionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankTransactionCode")
    public OBBankTransactionCodeStructure1 getBankTransactionCode() {
        return bankTransactionCode;
    }

    public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    public OBTransaction6 proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
        return this;
    }

    /**
     * Get proprietaryBankTransactionCode
     *
     * @return proprietaryBankTransactionCode
     */
    @Valid
    @Schema(name = "ProprietaryBankTransactionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ProprietaryBankTransactionCode")
    public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }

    public OBTransaction6 extendedProprietaryBankTransactionCodes(List<@Valid OBExtendedProprietaryBankTransactionCode> extendedProprietaryBankTransactionCodes) {
        this.extendedProprietaryBankTransactionCodes = extendedProprietaryBankTransactionCodes;
        return this;
    }

    public OBTransaction6 addExtendedProprietaryBankTransactionCodesItem(OBExtendedProprietaryBankTransactionCode extendedProprietaryBankTransactionCodesItem) {
        if (this.extendedProprietaryBankTransactionCodes == null) {
            this.extendedProprietaryBankTransactionCodes = new ArrayList<>();
        }
        this.extendedProprietaryBankTransactionCodes.add(extendedProprietaryBankTransactionCodesItem);
        return this;
    }

    /**
     * Get extendedProprietaryBankTransactionCodes
     *
     * @return extendedProprietaryBankTransactionCodes
     */
    @Valid
    @Schema(name = "ExtendedProprietaryBankTransactionCodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExtendedProprietaryBankTransactionCodes")
    public List<@Valid OBExtendedProprietaryBankTransactionCode> getExtendedProprietaryBankTransactionCodes() {
        return extendedProprietaryBankTransactionCodes;
    }

    public void setExtendedProprietaryBankTransactionCodes(List<@Valid OBExtendedProprietaryBankTransactionCode> extendedProprietaryBankTransactionCodes) {
        this.extendedProprietaryBankTransactionCodes = extendedProprietaryBankTransactionCodes;
    }

    public OBTransaction6 balance(OBTransactionCashBalance balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     */
    @Valid
    @Schema(name = "Balance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Balance")
    public OBTransactionCashBalance getBalance() {
        return balance;
    }

    public void setBalance(OBTransactionCashBalance balance) {
        this.balance = balance;
    }

    public OBTransaction6 merchantDetails(OBMerchantDetails1 merchantDetails) {
        this.merchantDetails = merchantDetails;
        return this;
    }

    /**
     * Get merchantDetails
     *
     * @return merchantDetails
     */
    @Valid
    @Schema(name = "MerchantDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MerchantDetails")
    public OBMerchantDetails1 getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    public OBTransaction6 creditorAgent(OBBranchAndFinancialInstitutionIdentification61 creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     */
    @Valid
    @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorAgent")
    public OBBranchAndFinancialInstitutionIdentification61 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification61 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBTransaction6 creditorAccount(OBCashAccount60 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     */
    @Valid
    @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorAccount")
    public OBCashAccount60 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount60 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBTransaction6 debtorAgent(OBBranchAndFinancialInstitutionIdentification62 debtorAgent) {
        this.debtorAgent = debtorAgent;
        return this;
    }

    /**
     * Get debtorAgent
     *
     * @return debtorAgent
     */
    @Valid
    @Schema(name = "DebtorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorAgent")
    public OBBranchAndFinancialInstitutionIdentification62 getDebtorAgent() {
        return debtorAgent;
    }

    public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification62 debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    public OBTransaction6 debtorAccount(OBCashAccount61 debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBCashAccount61 getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccount61 debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBTransaction6 cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
        return this;
    }

    /**
     * Get cardInstrument
     *
     * @return cardInstrument
     */
    @Valid
    @Schema(name = "CardInstrument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CardInstrument")
    public OBTransactionCardInstrument1 getCardInstrument() {
        return cardInstrument;
    }

    public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
    }

    public OBTransaction6 supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     */
    @Valid
    @Schema(name = "SupplementaryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    public OBTransaction6 categoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
        this.categoryPurposeCode = categoryPurposeCode;
        return this;
    }

    /**
     * Get categoryPurposeCode
     *
     * @return categoryPurposeCode
     */
    @Valid
    @Schema(name = "CategoryPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CategoryPurposeCode")
    public ExternalCategoryPurpose1Code getCategoryPurposeCode() {
        return categoryPurposeCode;
    }

    public void setCategoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
        this.categoryPurposeCode = categoryPurposeCode;
    }

    public OBTransaction6 paymentPurposeCode(OBExternalPurpose1Code paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
        return this;
    }

    /**
     * Get paymentPurposeCode
     *
     * @return paymentPurposeCode
     */
    @Valid
    @Schema(name = "PaymentPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PaymentPurposeCode")
    public OBExternalPurpose1Code getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    public void setPaymentPurposeCode(OBExternalPurpose1Code paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
    }

    public OBTransaction6 ultimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
        this.ultimateCreditor = ultimateCreditor;
        return this;
    }

    /**
     * Get ultimateCreditor
     *
     * @return ultimateCreditor
     */
    @Valid
    @Schema(name = "UltimateCreditor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UltimateCreditor")
    public OBUltimateCreditor1 getUltimateCreditor() {
        return ultimateCreditor;
    }

    public void setUltimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
        this.ultimateCreditor = ultimateCreditor;
    }

    public OBTransaction6 ultimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
        return this;
    }

    /**
     * Get ultimateDebtor
     *
     * @return ultimateDebtor
     */
    @Valid
    @Schema(name = "UltimateDebtor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UltimateDebtor")
    public OBUltimateDebtor1 getUltimateDebtor() {
        return ultimateDebtor;
    }

    public void setUltimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransaction6 obTransaction6 = (OBTransaction6) o;
        return Objects.equals(this.accountId, obTransaction6.accountId) &&
                Objects.equals(this.transactionId, obTransaction6.transactionId) &&
                Objects.equals(this.transactionReference, obTransaction6.transactionReference) &&
                Objects.equals(this.statementReference, obTransaction6.statementReference) &&
                Objects.equals(this.creditDebitIndicator, obTransaction6.creditDebitIndicator) &&
                Objects.equals(this.status, obTransaction6.status) &&
                Objects.equals(this.transactionMutability, obTransaction6.transactionMutability) &&
                Objects.equals(this.bookingDateTime, obTransaction6.bookingDateTime) &&
                Objects.equals(this.valueDateTime, obTransaction6.valueDateTime) &&
                Objects.equals(this.transactionInformation, obTransaction6.transactionInformation) &&
                Objects.equals(this.addressLine, obTransaction6.addressLine) &&
                Objects.equals(this.amount, obTransaction6.amount) &&
                Objects.equals(this.chargeAmount, obTransaction6.chargeAmount) &&
                Objects.equals(this.currencyExchange, obTransaction6.currencyExchange) &&
                Objects.equals(this.bankTransactionCode, obTransaction6.bankTransactionCode) &&
                Objects.equals(this.proprietaryBankTransactionCode, obTransaction6.proprietaryBankTransactionCode) &&
                Objects.equals(this.extendedProprietaryBankTransactionCodes, obTransaction6.extendedProprietaryBankTransactionCodes) &&
                Objects.equals(this.balance, obTransaction6.balance) &&
                Objects.equals(this.merchantDetails, obTransaction6.merchantDetails) &&
                Objects.equals(this.creditorAgent, obTransaction6.creditorAgent) &&
                Objects.equals(this.creditorAccount, obTransaction6.creditorAccount) &&
                Objects.equals(this.debtorAgent, obTransaction6.debtorAgent) &&
                Objects.equals(this.debtorAccount, obTransaction6.debtorAccount) &&
                Objects.equals(this.cardInstrument, obTransaction6.cardInstrument) &&
                Objects.equals(this.supplementaryData, obTransaction6.supplementaryData) &&
                Objects.equals(this.categoryPurposeCode, obTransaction6.categoryPurposeCode) &&
                Objects.equals(this.paymentPurposeCode, obTransaction6.paymentPurposeCode) &&
                Objects.equals(this.ultimateCreditor, obTransaction6.ultimateCreditor) &&
                Objects.equals(this.ultimateDebtor, obTransaction6.ultimateDebtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, transactionMutability, bookingDateTime, valueDateTime, transactionInformation, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, extendedProprietaryBankTransactionCodes, balance, merchantDetails, creditorAgent, creditorAccount, debtorAgent, debtorAccount, cardInstrument, supplementaryData, categoryPurposeCode, paymentPurposeCode, ultimateCreditor, ultimateDebtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransaction6 {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
        sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
        sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
        sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
        sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
        sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
        sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
        sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
        sb.append("    extendedProprietaryBankTransactionCodes: ").append(toIndentedString(extendedProprietaryBankTransactionCodes)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("    categoryPurposeCode: ").append(toIndentedString(categoryPurposeCode)).append("\n");
        sb.append("    paymentPurposeCode: ").append(toIndentedString(paymentPurposeCode)).append("\n");
        sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
        sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

