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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBScheduledPayment2Basic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBScheduledPayment2Basic {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("ScheduledPaymentId")
    private String scheduledPaymentId = null;

    @JsonProperty("ScheduledPaymentDateTime")
    private DateTime scheduledPaymentDateTime = null;

    @JsonProperty("ScheduledType")
    private OBExternalScheduleType1Code scheduledType = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("InstructedAmount")
    private OBActiveOrHistoricCurrencyAndAmount instructedAmount = null;

    public OBScheduledPayment2Basic accountId(String accountId) {
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

    public OBScheduledPayment2Basic scheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
     *
     * @return scheduledPaymentId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.")
    public String getScheduledPaymentId() {
        return scheduledPaymentId;
    }

    public void setScheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
    }

    public OBScheduledPayment2Basic scheduledPaymentDateTime(DateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
        return this;
    }

    /**
     * The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return scheduledPaymentDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getScheduledPaymentDateTime() {
        return scheduledPaymentDateTime;
    }

    public void setScheduledPaymentDateTime(DateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    }

    public OBScheduledPayment2Basic scheduledType(OBExternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * Get scheduledType
     *
     * @return scheduledType
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBExternalScheduleType1Code getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
    }

    public OBScheduledPayment2Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBScheduledPayment2Basic instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBScheduledPayment2Basic obScheduledPayment2Basic = (OBScheduledPayment2Basic) o;
        return Objects.equals(this.accountId, obScheduledPayment2Basic.accountId) &&
                Objects.equals(this.scheduledPaymentId, obScheduledPayment2Basic.scheduledPaymentId) &&
                Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment2Basic.scheduledPaymentDateTime) &&
                Objects.equals(this.scheduledType, obScheduledPayment2Basic.scheduledType) &&
                Objects.equals(this.reference, obScheduledPayment2Basic.reference) &&
                Objects.equals(this.instructedAmount, obScheduledPayment2Basic.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, instructedAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBScheduledPayment2Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
        sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

