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

/**
 * OBStandingOrder6
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStandingOrder6 {

    private String accountId;

    private String standingOrderId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime nextPaymentDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime lastPaymentDateTime;

    private String numberOfPayments;

    private ExternalMandateStatus1Code standingOrderStatusCode;

    private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount;

    private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount;

    private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount;

    private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount;

    private OBBranchAndFinancialInstitutionIdentification51 creditorAgent;

    private OBCashAccount51 creditorAccount;

    private OBSupplementaryData1 supplementaryData;

    private OBMandateRelatedInformation1 mandateRelatedInformation;

    private OBRemittanceInformation2 remittanceInformation;

    public OBStandingOrder6() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStandingOrder6(String accountId) {
        this.accountId = accountId;
    }

    public OBStandingOrder6 accountId(String accountId) {
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

    public OBStandingOrder6 standingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
     *
     * @return standingOrderId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "StandingOrderId", example = "Ben5", description = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StandingOrderId")
    public String getStandingOrderId() {
        return standingOrderId;
    }

    public void setStandingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
    }

    public OBStandingOrder6 nextPaymentDateTime(DateTime nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
        return this;
    }

    /**
     * The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return nextPaymentDateTime
     */
    @Valid
    @Schema(name = "NextPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NextPaymentDateTime")
    public DateTime getNextPaymentDateTime() {
        return nextPaymentDateTime;
    }

    public void setNextPaymentDateTime(DateTime nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
    }

    public OBStandingOrder6 lastPaymentDateTime(DateTime lastPaymentDateTime) {
        this.lastPaymentDateTime = lastPaymentDateTime;
        return this;
    }

    /**
     * The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return lastPaymentDateTime
     */
    @Valid
    @Schema(name = "LastPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LastPaymentDateTime")
    public DateTime getLastPaymentDateTime() {
        return lastPaymentDateTime;
    }

    public void setLastPaymentDateTime(DateTime lastPaymentDateTime) {
        this.lastPaymentDateTime = lastPaymentDateTime;
    }

    public OBStandingOrder6 numberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
     *
     * @return numberOfPayments
     */
    @Size(min = 1, max = 35)
    @Schema(name = "NumberOfPayments", description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NumberOfPayments")
    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public OBStandingOrder6 standingOrderStatusCode(ExternalMandateStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
        return this;
    }

    /**
     * Get standingOrderStatusCode
     *
     * @return standingOrderStatusCode
     */
    @Valid
    @Schema(name = "StandingOrderStatusCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StandingOrderStatusCode")
    public ExternalMandateStatus1Code getStandingOrderStatusCode() {
        return standingOrderStatusCode;
    }

    public void setStandingOrderStatusCode(ExternalMandateStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
    }

    public OBStandingOrder6 firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
        return this;
    }

    /**
     * Get firstPaymentAmount
     *
     * @return firstPaymentAmount
     */
    @Valid
    @Schema(name = "FirstPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FirstPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
    }

    public OBStandingOrder6 nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
        return this;
    }

    /**
     * Get nextPaymentAmount
     *
     * @return nextPaymentAmount
     */
    @Valid
    @Schema(name = "NextPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NextPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
    }

    public OBStandingOrder6 lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
        return this;
    }

    /**
     * Get lastPaymentAmount
     *
     * @return lastPaymentAmount
     */
    @Valid
    @Schema(name = "LastPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LastPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    public OBStandingOrder6 finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
        return this;
    }

    /**
     * Get finalPaymentAmount
     *
     * @return finalPaymentAmount
     */
    @Valid
    @Schema(name = "FinalPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FinalPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
    }

    public OBStandingOrder6 creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
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
    public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBStandingOrder6 creditorAccount(OBCashAccount51 creditorAccount) {
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
    public OBCashAccount51 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount51 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBStandingOrder6 supplementaryData(OBSupplementaryData1 supplementaryData) {
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

    public OBStandingOrder6 mandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
        this.mandateRelatedInformation = mandateRelatedInformation;
        return this;
    }

    /**
     * Get mandateRelatedInformation
     *
     * @return mandateRelatedInformation
     */
    @Valid
    @Schema(name = "MandateRelatedInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MandateRelatedInformation")
    public OBMandateRelatedInformation1 getMandateRelatedInformation() {
        return mandateRelatedInformation;
    }

    public void setMandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
        this.mandateRelatedInformation = mandateRelatedInformation;
    }

    public OBStandingOrder6 remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     *
     * @return remittanceInformation
     */
    @Valid
    @Schema(name = "RemittanceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RemittanceInformation")
    public OBRemittanceInformation2 getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStandingOrder6 obStandingOrder6 = (OBStandingOrder6) o;
        return Objects.equals(this.accountId, obStandingOrder6.accountId) &&
                Objects.equals(this.standingOrderId, obStandingOrder6.standingOrderId) &&
                Objects.equals(this.nextPaymentDateTime, obStandingOrder6.nextPaymentDateTime) &&
                Objects.equals(this.lastPaymentDateTime, obStandingOrder6.lastPaymentDateTime) &&
                Objects.equals(this.numberOfPayments, obStandingOrder6.numberOfPayments) &&
                Objects.equals(this.standingOrderStatusCode, obStandingOrder6.standingOrderStatusCode) &&
                Objects.equals(this.firstPaymentAmount, obStandingOrder6.firstPaymentAmount) &&
                Objects.equals(this.nextPaymentAmount, obStandingOrder6.nextPaymentAmount) &&
                Objects.equals(this.lastPaymentAmount, obStandingOrder6.lastPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obStandingOrder6.finalPaymentAmount) &&
                Objects.equals(this.creditorAgent, obStandingOrder6.creditorAgent) &&
                Objects.equals(this.creditorAccount, obStandingOrder6.creditorAccount) &&
                Objects.equals(this.supplementaryData, obStandingOrder6.supplementaryData) &&
                Objects.equals(this.mandateRelatedInformation, obStandingOrder6.mandateRelatedInformation) &&
                Objects.equals(this.remittanceInformation, obStandingOrder6.remittanceInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, standingOrderId, nextPaymentDateTime, lastPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, creditorAgent, creditorAccount, supplementaryData, mandateRelatedInformation, remittanceInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStandingOrder6 {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
        sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
        sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
        sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
        sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
        sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

