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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on an entry in the report.
 */
@ApiModel(description = "Provides further details on an entry in the report.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBTransaction5Detail {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("TransactionId")
    private String transactionId = null;

    @JsonProperty("TransactionReference")
    private String transactionReference = null;

    @JsonProperty("StatementReference")
    private List<String> statementReference = null;
    @JsonProperty("CreditDebitIndicator")
    private CreditDebitIndicatorEnum creditDebitIndicator = null;
    @JsonProperty("Status")
    private OBEntryStatus1Code status = null;
    @JsonProperty("BookingDateTime")
    private DateTime bookingDateTime = null;
    @JsonProperty("ValueDateTime")
    private DateTime valueDateTime = null;
    @JsonProperty("AddressLine")
    private String addressLine = null;
    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount amount = null;
    @JsonProperty("ChargeAmount")
    private OBActiveOrHistoricCurrencyAndAmount chargeAmount = null;
    @JsonProperty("CurrencyExchange")
    private OBCurrencyExchange5 currencyExchange = null;
    @JsonProperty("BankTransactionCode")
    private OBBankTransactionCodeStructure1 bankTransactionCode = null;
    @JsonProperty("ProprietaryBankTransactionCode")
    private OBTransaction5ProprietaryBankTransactionCode proprietaryBankTransactionCode = null;
    @JsonProperty("CardInstrument")
    private OBTransactionCardInstrument1 cardInstrument = null;
    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;
    @JsonProperty("TransactionInformation")
    private String transactionInformation = null;
    @JsonProperty("Balance")
    private OBTransactionCashBalance balance = null;
    @JsonProperty("MerchantDetails")
    private OBMerchantDetails1 merchantDetails = null;
    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification6 creditorAgent = null;
    @JsonProperty("CreditorAccount")
    private OBCashAccount6 creditorAccount = null;
    @JsonProperty("DebtorAgent")
    private OBBranchAndFinancialInstitutionIdentification6 debtorAgent = null;
    @JsonProperty("DebtorAccount")
    private OBCashAccount6 debtorAccount = null;

    public OBTransaction5Detail accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBTransaction5Detail transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
     *
     * @return transactionId
     **/
    @Size(min = 1, max = 210)
    @ApiModelProperty(value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public OBTransaction5Detail transactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    /**
     * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
     *
     * @return transactionReference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")
    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public OBTransaction5Detail statementReference(List<String> statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    public OBTransaction5Detail addStatementReferenceItem(String statementReferenceItem) {
        if (this.statementReference == null) {
            this.statementReference = new ArrayList<String>();
        }
        this.statementReference.add(statementReferenceItem);
        return this;
    }

    /**
     * Unique reference for the statement. This reference may be optionally populated if available.
     *
     * @return statementReference
     **/
    @ApiModelProperty(value = "Unique reference for the statement. This reference may be optionally populated if available.")
    public List<String> getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(List<String> statementReference) {
        this.statementReference = statementReference;
    }

    public OBTransaction5Detail creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Indicates whether the transaction is a credit or a debit entry.
     *
     * @return creditDebitIndicator
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Indicates whether the transaction is a credit or a debit entry.")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBTransaction5Detail status(OBEntryStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBEntryStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBEntryStatus1Code status) {
        this.status = status;
    }

    public OBTransaction5Detail bookingDateTime(DateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
        return this;
    }

    /**
     * Date and time when a transaction entry is posted to an account on the account servicer&#39;s books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return bookingDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(DateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public OBTransaction5Detail valueDateTime(DateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
        return this;
    }

    /**
     * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return valueDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(DateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    public OBTransaction5Detail addressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    /**
     * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
     *
     * @return addressLine
     **/
    @Size(min = 1, max = 70)
    @ApiModelProperty(value = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.")
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public OBTransaction5Detail amount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
    }

    public OBTransaction5Detail chargeAmount(OBActiveOrHistoricCurrencyAndAmount chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Get chargeAmount
     *
     * @return chargeAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public OBTransaction5Detail currencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
        return this;
    }

    /**
     * Get currencyExchange
     *
     * @return currencyExchange
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBCurrencyExchange5 getCurrencyExchange() {
        return currencyExchange;
    }

    public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public OBTransaction5Detail bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
        return this;
    }

    /**
     * Get bankTransactionCode
     *
     * @return bankTransactionCode
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBankTransactionCodeStructure1 getBankTransactionCode() {
        return bankTransactionCode;
    }

    public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    public OBTransaction5Detail proprietaryBankTransactionCode(OBTransaction5ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
        return this;
    }

    /**
     * Get proprietaryBankTransactionCode
     *
     * @return proprietaryBankTransactionCode
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBTransaction5ProprietaryBankTransactionCode getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode(OBTransaction5ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }

    public OBTransaction5Detail cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
        return this;
    }

    /**
     * Get cardInstrument
     *
     * @return cardInstrument
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBTransactionCardInstrument1 getCardInstrument() {
        return cardInstrument;
    }

    public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
    }

    public OBTransaction5Detail supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    public OBTransaction5Detail transactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
        return this;
    }

    /**
     * Get transactionInformation
     *
     * @return transactionInformation
     **/
    @Size(min = 1, max = 500)
    @ApiModelProperty(value = "")
    public String getTransactionInformation() {
        return transactionInformation;
    }

    public void setTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    public OBTransaction5Detail balance(OBTransactionCashBalance balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBTransactionCashBalance getBalance() {
        return balance;
    }

    public void setBalance(OBTransactionCashBalance balance) {
        this.balance = balance;
    }

    public OBTransaction5Detail merchantDetails(OBMerchantDetails1 merchantDetails) {
        this.merchantDetails = merchantDetails;
        return this;
    }

    /**
     * Get merchantDetails
     *
     * @return merchantDetails
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBMerchantDetails1 getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    public OBTransaction5Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification6 creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBranchAndFinancialInstitutionIdentification6 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification6 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBTransaction5Detail creditorAccount(OBCashAccount6 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBCashAccount6 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount6 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBTransaction5Detail debtorAgent(OBBranchAndFinancialInstitutionIdentification6 debtorAgent) {
        this.debtorAgent = debtorAgent;
        return this;
    }

    /**
     * Get debtorAgent
     *
     * @return debtorAgent
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBranchAndFinancialInstitutionIdentification6 getDebtorAgent() {
        return debtorAgent;
    }

    public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification6 debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    public OBTransaction5Detail debtorAccount(OBCashAccount6 debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBCashAccount6 getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccount6 debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransaction5Detail obTransaction5Detail = (OBTransaction5Detail) o;
        return Objects.equals(this.accountId, obTransaction5Detail.accountId) &&
                Objects.equals(this.transactionId, obTransaction5Detail.transactionId) &&
                Objects.equals(this.transactionReference, obTransaction5Detail.transactionReference) &&
                Objects.equals(this.statementReference, obTransaction5Detail.statementReference) &&
                Objects.equals(this.creditDebitIndicator, obTransaction5Detail.creditDebitIndicator) &&
                Objects.equals(this.status, obTransaction5Detail.status) &&
                Objects.equals(this.bookingDateTime, obTransaction5Detail.bookingDateTime) &&
                Objects.equals(this.valueDateTime, obTransaction5Detail.valueDateTime) &&
                Objects.equals(this.addressLine, obTransaction5Detail.addressLine) &&
                Objects.equals(this.amount, obTransaction5Detail.amount) &&
                Objects.equals(this.chargeAmount, obTransaction5Detail.chargeAmount) &&
                Objects.equals(this.currencyExchange, obTransaction5Detail.currencyExchange) &&
                Objects.equals(this.bankTransactionCode, obTransaction5Detail.bankTransactionCode) &&
                Objects.equals(this.proprietaryBankTransactionCode, obTransaction5Detail.proprietaryBankTransactionCode) &&
                Objects.equals(this.cardInstrument, obTransaction5Detail.cardInstrument) &&
                Objects.equals(this.supplementaryData, obTransaction5Detail.supplementaryData) &&
                Objects.equals(this.transactionInformation, obTransaction5Detail.transactionInformation) &&
                Objects.equals(this.balance, obTransaction5Detail.balance) &&
                Objects.equals(this.merchantDetails, obTransaction5Detail.merchantDetails) &&
                Objects.equals(this.creditorAgent, obTransaction5Detail.creditorAgent) &&
                Objects.equals(this.creditorAccount, obTransaction5Detail.creditorAccount) &&
                Objects.equals(this.debtorAgent, obTransaction5Detail.debtorAgent) &&
                Objects.equals(this.debtorAccount, obTransaction5Detail.debtorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, bookingDateTime, valueDateTime, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, cardInstrument, supplementaryData, transactionInformation, balance, merchantDetails, creditorAgent, creditorAccount, debtorAgent, debtorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransaction5Detail {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
        sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
        sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
        sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
        sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
        sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
        sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

    /**
     * Indicates whether the transaction is a credit or a debit entry.
     */
    public enum CreditDebitIndicatorEnum {
        CREDIT("Credit"),

        DEBIT("Debit");

        private String value;

        CreditDebitIndicatorEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CreditDebitIndicatorEnum fromValue(String text) {
            for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

