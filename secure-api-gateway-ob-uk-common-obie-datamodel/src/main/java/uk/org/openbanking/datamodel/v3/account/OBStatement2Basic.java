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
package uk.org.openbanking.datamodel.v3.account;

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

/**
 * Provides further details on a statement resource.
 */

@Schema(name = "OBStatement2Basic", description = "Provides further details on a statement resource.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2Basic {

    private String accountId;

    private String statementId;

    private String statementReference;

    private OBExternalStatementType1Code type;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime startDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime endDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    @Valid
    private List<@Size(min = 1, max = 500) String> statementDescription;

    @Valid
    private List<@Valid OBStatement2StatementBenefitInner> statementBenefit;

    @Valid
    private List<@Valid OBStatement2StatementFeeInner> statementFee;

    @Valid
    private List<@Valid OBStatement2StatementInterestInner> statementInterest;

    @Valid
    private List<@Valid OBStatement2StatementDateTimeInner> statementDateTime;

    @Valid
    private List<@Valid OBStatement2StatementRateInner> statementRate;

    @Valid
    private List<@Valid OBStatement2StatementValueInner> statementValue;

    public OBStatement2Basic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2Basic(String accountId, OBExternalStatementType1Code type, DateTime startDateTime, DateTime endDateTime, DateTime creationDateTime) {
        this.accountId = accountId;
        this.type = type;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.creationDateTime = creationDateTime;
    }

    public OBStatement2Basic accountId(String accountId) {
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
    @Schema(name = "AccountId", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBStatement2Basic statementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
     *
     * @return statementId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "StatementId", description = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementId")
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public OBStatement2Basic statementReference(String statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    /**
     * Unique reference for the statement. This reference may be optionally populated if available.
     *
     * @return statementReference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "StatementReference", description = "Unique reference for the statement. This reference may be optionally populated if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementReference")
    public String getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(String statementReference) {
        this.statementReference = statementReference;
    }

    public OBStatement2Basic type(OBExternalStatementType1Code type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @NotNull
    @Valid
    @Schema(name = "Type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public OBExternalStatementType1Code getType() {
        return type;
    }

    public void setType(OBExternalStatementType1Code type) {
        this.type = type;
    }

    public OBStatement2Basic startDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return startDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StartDateTime", description = "Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StartDateTime")
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public OBStatement2Basic endDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return endDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "EndDateTime", description = "Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("EndDateTime")
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public OBStatement2Basic creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBStatement2Basic statementDescription(List<@Size(min = 1, max = 500) String> statementDescription) {
        this.statementDescription = statementDescription;
        return this;
    }

    public OBStatement2Basic addStatementDescriptionItem(String statementDescriptionItem) {
        if (this.statementDescription == null) {
            this.statementDescription = new ArrayList<>();
        }
        this.statementDescription.add(statementDescriptionItem);
        return this;
    }

    /**
     * Get statementDescription
     *
     * @return statementDescription
     */

    @Schema(name = "StatementDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementDescription")
    public List<@Size(min = 1, max = 500) String> getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(List<@Size(min = 1, max = 500) String> statementDescription) {
        this.statementDescription = statementDescription;
    }

    public OBStatement2Basic statementBenefit(List<@Valid OBStatement2StatementBenefitInner> statementBenefit) {
        this.statementBenefit = statementBenefit;
        return this;
    }

    public OBStatement2Basic addStatementBenefitItem(OBStatement2StatementBenefitInner statementBenefitItem) {
        if (this.statementBenefit == null) {
            this.statementBenefit = new ArrayList<>();
        }
        this.statementBenefit.add(statementBenefitItem);
        return this;
    }

    /**
     * Get statementBenefit
     *
     * @return statementBenefit
     */
    @Valid
    @Schema(name = "StatementBenefit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementBenefit")
    public List<@Valid OBStatement2StatementBenefitInner> getStatementBenefit() {
        return statementBenefit;
    }

    public void setStatementBenefit(List<@Valid OBStatement2StatementBenefitInner> statementBenefit) {
        this.statementBenefit = statementBenefit;
    }

    public OBStatement2Basic statementFee(List<@Valid OBStatement2StatementFeeInner> statementFee) {
        this.statementFee = statementFee;
        return this;
    }

    public OBStatement2Basic addStatementFeeItem(OBStatement2StatementFeeInner statementFeeItem) {
        if (this.statementFee == null) {
            this.statementFee = new ArrayList<>();
        }
        this.statementFee.add(statementFeeItem);
        return this;
    }

    /**
     * Get statementFee
     *
     * @return statementFee
     */
    @Valid
    @Schema(name = "StatementFee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementFee")
    public List<@Valid OBStatement2StatementFeeInner> getStatementFee() {
        return statementFee;
    }

    public void setStatementFee(List<@Valid OBStatement2StatementFeeInner> statementFee) {
        this.statementFee = statementFee;
    }

    public OBStatement2Basic statementInterest(List<@Valid OBStatement2StatementInterestInner> statementInterest) {
        this.statementInterest = statementInterest;
        return this;
    }

    public OBStatement2Basic addStatementInterestItem(OBStatement2StatementInterestInner statementInterestItem) {
        if (this.statementInterest == null) {
            this.statementInterest = new ArrayList<>();
        }
        this.statementInterest.add(statementInterestItem);
        return this;
    }

    /**
     * Get statementInterest
     *
     * @return statementInterest
     */
    @Valid
    @Schema(name = "StatementInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementInterest")
    public List<@Valid OBStatement2StatementInterestInner> getStatementInterest() {
        return statementInterest;
    }

    public void setStatementInterest(List<@Valid OBStatement2StatementInterestInner> statementInterest) {
        this.statementInterest = statementInterest;
    }

    public OBStatement2Basic statementDateTime(List<@Valid OBStatement2StatementDateTimeInner> statementDateTime) {
        this.statementDateTime = statementDateTime;
        return this;
    }

    public OBStatement2Basic addStatementDateTimeItem(OBStatement2StatementDateTimeInner statementDateTimeItem) {
        if (this.statementDateTime == null) {
            this.statementDateTime = new ArrayList<>();
        }
        this.statementDateTime.add(statementDateTimeItem);
        return this;
    }

    /**
     * Get statementDateTime
     *
     * @return statementDateTime
     */
    @Valid
    @Schema(name = "StatementDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementDateTime")
    public List<@Valid OBStatement2StatementDateTimeInner> getStatementDateTime() {
        return statementDateTime;
    }

    public void setStatementDateTime(List<@Valid OBStatement2StatementDateTimeInner> statementDateTime) {
        this.statementDateTime = statementDateTime;
    }

    public OBStatement2Basic statementRate(List<@Valid OBStatement2StatementRateInner> statementRate) {
        this.statementRate = statementRate;
        return this;
    }

    public OBStatement2Basic addStatementRateItem(OBStatement2StatementRateInner statementRateItem) {
        if (this.statementRate == null) {
            this.statementRate = new ArrayList<>();
        }
        this.statementRate.add(statementRateItem);
        return this;
    }

    /**
     * Get statementRate
     *
     * @return statementRate
     */
    @Valid
    @Schema(name = "StatementRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementRate")
    public List<@Valid OBStatement2StatementRateInner> getStatementRate() {
        return statementRate;
    }

    public void setStatementRate(List<@Valid OBStatement2StatementRateInner> statementRate) {
        this.statementRate = statementRate;
    }

    public OBStatement2Basic statementValue(List<@Valid OBStatement2StatementValueInner> statementValue) {
        this.statementValue = statementValue;
        return this;
    }

    public OBStatement2Basic addStatementValueItem(OBStatement2StatementValueInner statementValueItem) {
        if (this.statementValue == null) {
            this.statementValue = new ArrayList<>();
        }
        this.statementValue.add(statementValueItem);
        return this;
    }

    /**
     * Get statementValue
     *
     * @return statementValue
     */
    @Valid
    @Schema(name = "StatementValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatementValue")
    public List<@Valid OBStatement2StatementValueInner> getStatementValue() {
        return statementValue;
    }

    public void setStatementValue(List<@Valid OBStatement2StatementValueInner> statementValue) {
        this.statementValue = statementValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2Basic obStatement2Basic = (OBStatement2Basic) o;
        return Objects.equals(this.accountId, obStatement2Basic.accountId) &&
                Objects.equals(this.statementId, obStatement2Basic.statementId) &&
                Objects.equals(this.statementReference, obStatement2Basic.statementReference) &&
                Objects.equals(this.type, obStatement2Basic.type) &&
                Objects.equals(this.startDateTime, obStatement2Basic.startDateTime) &&
                Objects.equals(this.endDateTime, obStatement2Basic.endDateTime) &&
                Objects.equals(this.creationDateTime, obStatement2Basic.creationDateTime) &&
                Objects.equals(this.statementDescription, obStatement2Basic.statementDescription) &&
                Objects.equals(this.statementBenefit, obStatement2Basic.statementBenefit) &&
                Objects.equals(this.statementFee, obStatement2Basic.statementFee) &&
                Objects.equals(this.statementInterest, obStatement2Basic.statementInterest) &&
                Objects.equals(this.statementDateTime, obStatement2Basic.statementDateTime) &&
                Objects.equals(this.statementRate, obStatement2Basic.statementRate) &&
                Objects.equals(this.statementValue, obStatement2Basic.statementValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementDateTime, statementRate, statementValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2Basic {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
        sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
        sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
        sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
        sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
        sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
        sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
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

