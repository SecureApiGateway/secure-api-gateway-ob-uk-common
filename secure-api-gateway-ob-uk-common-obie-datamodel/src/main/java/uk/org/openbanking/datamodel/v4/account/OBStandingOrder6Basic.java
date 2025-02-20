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
 * OBStandingOrder6Basic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStandingOrder6Basic {

    private String accountId;

    private String standingOrderId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime nextPaymentDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime lastPaymentDateTime;

    private ExternalMandateStatus1Code standingOrderStatusCode;

    private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount;

    private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount;

    private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount;

    private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount;

    private OBSupplementaryData1 supplementaryData;

    private OBMandateRelatedInformation1 mandateRelatedInformation;

    private OBRemittanceInformation2 remittanceInformation;

    public OBStandingOrder6Basic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStandingOrder6Basic(String accountId) {
        this.accountId = accountId;
    }

    public OBStandingOrder6Basic accountId(String accountId) {
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

    public OBStandingOrder6Basic standingOrderId(String standingOrderId) {
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

    public OBStandingOrder6Basic nextPaymentDateTime(DateTime nextPaymentDateTime) {
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

    public OBStandingOrder6Basic lastPaymentDateTime(DateTime lastPaymentDateTime) {
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

    public OBStandingOrder6Basic standingOrderStatusCode(ExternalMandateStatus1Code standingOrderStatusCode) {
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

    public OBStandingOrder6Basic firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
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

    public OBStandingOrder6Basic nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
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

    public OBStandingOrder6Basic lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
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

    public OBStandingOrder6Basic finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
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

    public OBStandingOrder6Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
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

    public OBStandingOrder6Basic mandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
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

    public OBStandingOrder6Basic remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
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
        OBStandingOrder6Basic obStandingOrder6Basic = (OBStandingOrder6Basic) o;
        return Objects.equals(this.accountId, obStandingOrder6Basic.accountId) &&
                Objects.equals(this.standingOrderId, obStandingOrder6Basic.standingOrderId) &&
                Objects.equals(this.nextPaymentDateTime, obStandingOrder6Basic.nextPaymentDateTime) &&
                Objects.equals(this.lastPaymentDateTime, obStandingOrder6Basic.lastPaymentDateTime) &&
                Objects.equals(this.standingOrderStatusCode, obStandingOrder6Basic.standingOrderStatusCode) &&
                Objects.equals(this.firstPaymentAmount, obStandingOrder6Basic.firstPaymentAmount) &&
                Objects.equals(this.nextPaymentAmount, obStandingOrder6Basic.nextPaymentAmount) &&
                Objects.equals(this.lastPaymentAmount, obStandingOrder6Basic.lastPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obStandingOrder6Basic.finalPaymentAmount) &&
                Objects.equals(this.supplementaryData, obStandingOrder6Basic.supplementaryData) &&
                Objects.equals(this.mandateRelatedInformation, obStandingOrder6Basic.mandateRelatedInformation) &&
                Objects.equals(this.remittanceInformation, obStandingOrder6Basic.remittanceInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, standingOrderId, nextPaymentDateTime, lastPaymentDateTime, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, supplementaryData, mandateRelatedInformation, remittanceInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStandingOrder6Basic {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
        sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
        sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
        sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
        sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
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

