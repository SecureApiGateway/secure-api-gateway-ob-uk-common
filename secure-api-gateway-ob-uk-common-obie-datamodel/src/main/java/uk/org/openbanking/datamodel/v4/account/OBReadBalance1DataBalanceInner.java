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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Set of elements used to define the balance details.
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner", description = "Set of elements used to define the balance details.")
@JsonTypeName("OBReadBalance1_Data_Balance_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadBalance1DataBalanceInner {

    private String accountId;

    private OBCreditDebitCode2 creditDebitIndicator;

    private OBBalanceType1Code type;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime dateTime;

    private OBReadBalance1DataBalanceInnerAmount amount;

    @Valid
    private List<@Valid OBReadBalance1DataBalanceInnerCreditLineInner> creditLine;

    private OBReadBalance1DataBalanceInnerLocalAmount localAmount;

    public OBReadBalance1DataBalanceInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadBalance1DataBalanceInner(String accountId, OBCreditDebitCode2 creditDebitIndicator, OBBalanceType1Code type, DateTime dateTime, OBReadBalance1DataBalanceInnerAmount amount) {
        this.accountId = accountId;
        this.creditDebitIndicator = creditDebitIndicator;
        this.type = type;
        this.dateTime = dateTime;
        this.amount = amount;
    }

    public OBReadBalance1DataBalanceInner accountId(String accountId) {
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

    public OBReadBalance1DataBalanceInner creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
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
    public OBCreditDebitCode2 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBReadBalance1DataBalanceInner type(OBBalanceType1Code type) {
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
    public OBBalanceType1Code getType() {
        return type;
    }

    public void setType(OBBalanceType1Code type) {
        this.type = type;
    }

    public OBReadBalance1DataBalanceInner dateTime(DateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Indicates the date (and time) of the balance. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return dateTime
     */
    @NotNull
    @Valid
    @Schema(name = "DateTime", description = "Indicates the date (and time) of the balance. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DateTime")
    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public OBReadBalance1DataBalanceInner amount(OBReadBalance1DataBalanceInnerAmount amount) {
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
    public OBReadBalance1DataBalanceInnerAmount getAmount() {
        return amount;
    }

    public void setAmount(OBReadBalance1DataBalanceInnerAmount amount) {
        this.amount = amount;
    }

    public OBReadBalance1DataBalanceInner creditLine(List<@Valid OBReadBalance1DataBalanceInnerCreditLineInner> creditLine) {
        this.creditLine = creditLine;
        return this;
    }

    public OBReadBalance1DataBalanceInner addCreditLineItem(OBReadBalance1DataBalanceInnerCreditLineInner creditLineItem) {
        if (this.creditLine == null) {
            this.creditLine = new ArrayList<>();
        }
        this.creditLine.add(creditLineItem);
        return this;
    }

    /**
     * Get creditLine
     *
     * @return creditLine
     */
    @Valid
    @Schema(name = "CreditLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditLine")
    public List<@Valid OBReadBalance1DataBalanceInnerCreditLineInner> getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(List<@Valid OBReadBalance1DataBalanceInnerCreditLineInner> creditLine) {
        this.creditLine = creditLine;
    }

    public OBReadBalance1DataBalanceInner localAmount(OBReadBalance1DataBalanceInnerLocalAmount localAmount) {
        this.localAmount = localAmount;
        return this;
    }

    /**
     * Get localAmount
     *
     * @return localAmount
     */
    @Valid
    @Schema(name = "LocalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalAmount")
    public OBReadBalance1DataBalanceInnerLocalAmount getLocalAmount() {
        return localAmount;
    }

    public void setLocalAmount(OBReadBalance1DataBalanceInnerLocalAmount localAmount) {
        this.localAmount = localAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadBalance1DataBalanceInner obReadBalance1DataBalanceInner = (OBReadBalance1DataBalanceInner) o;
        return Objects.equals(this.accountId, obReadBalance1DataBalanceInner.accountId) &&
                Objects.equals(this.creditDebitIndicator, obReadBalance1DataBalanceInner.creditDebitIndicator) &&
                Objects.equals(this.type, obReadBalance1DataBalanceInner.type) &&
                Objects.equals(this.dateTime, obReadBalance1DataBalanceInner.dateTime) &&
                Objects.equals(this.amount, obReadBalance1DataBalanceInner.amount) &&
                Objects.equals(this.creditLine, obReadBalance1DataBalanceInner.creditLine) &&
                Objects.equals(this.localAmount, obReadBalance1DataBalanceInner.localAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, creditDebitIndicator, type, dateTime, amount, creditLine, localAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBalance1DataBalanceInner {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
        sb.append("    localAmount: ").append(toIndentedString(localAmount)).append("\n");
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

