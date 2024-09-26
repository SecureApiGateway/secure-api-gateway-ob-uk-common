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

/**
 * OBScheduledPayment3Basic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBScheduledPayment3Basic {

    private String accountId;

    private String scheduledPaymentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime scheduledPaymentDateTime;

    private OBInternalScheduleType1Code scheduledType;

    private String reference;

    private String debtorReference;

    private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;

    public OBScheduledPayment3Basic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBScheduledPayment3Basic(String accountId, DateTime scheduledPaymentDateTime, OBInternalScheduleType1Code scheduledType, OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
        this.accountId = accountId;
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
        this.scheduledType = scheduledType;
        this.instructedAmount = instructedAmount;
    }

    public OBScheduledPayment3Basic accountId(String accountId) {
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

    public OBScheduledPayment3Basic scheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
     *
     * @return scheduledPaymentId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "ScheduledPaymentId", example = "SP03", description = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ScheduledPaymentId")
    public String getScheduledPaymentId() {
        return scheduledPaymentId;
    }

    public void setScheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
    }

    public OBScheduledPayment3Basic scheduledPaymentDateTime(DateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
        return this;
    }

    /**
     * The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return scheduledPaymentDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "ScheduledPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ScheduledPaymentDateTime")
    public DateTime getScheduledPaymentDateTime() {
        return scheduledPaymentDateTime;
    }

    public void setScheduledPaymentDateTime(DateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    }

    public OBScheduledPayment3Basic scheduledType(OBInternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * Get scheduledType
     *
     * @return scheduledType
     */
    @NotNull
    @Valid
    @Schema(name = "ScheduledType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ScheduledType")
    public OBInternalScheduleType1Code getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(OBInternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
    }

    public OBScheduledPayment3Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", example = "Towbar Club", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBScheduledPayment3Basic debtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
        return this;
    }

    /**
     * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
     *
     * @return debtorReference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "DebtorReference", example = "REF51561806", description = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorReference")
    public String getDebtorReference() {
        return debtorReference;
    }

    public void setDebtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
    }

    public OBScheduledPayment3Basic instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     */
    @NotNull
    @Valid
    @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("InstructedAmount")
    public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
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
        OBScheduledPayment3Basic obScheduledPayment3Basic = (OBScheduledPayment3Basic) o;
        return Objects.equals(this.accountId, obScheduledPayment3Basic.accountId) &&
                Objects.equals(this.scheduledPaymentId, obScheduledPayment3Basic.scheduledPaymentId) &&
                Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3Basic.scheduledPaymentDateTime) &&
                Objects.equals(this.scheduledType, obScheduledPayment3Basic.scheduledType) &&
                Objects.equals(this.reference, obScheduledPayment3Basic.reference) &&
                Objects.equals(this.debtorReference, obScheduledPayment3Basic.debtorReference) &&
                Objects.equals(this.instructedAmount, obScheduledPayment3Basic.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBScheduledPayment3Basic {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
        sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
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

