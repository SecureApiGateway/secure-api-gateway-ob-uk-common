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
package uk.org.openbanking.datamodel.v4.payment;

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
 * OBMandateRelatedInformation1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBMandateRelatedInformation1 {

    private String mandateIdentification;

    private OBExternalMandateClassification1Code classification;

    private ExternalCategoryPurpose1Code categoryPurposeCode;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime firstPaymentDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime recurringPaymentDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime finalPaymentDateTime;

    private OBFrequency6 frequency;

    private String reason;

    public OBMandateRelatedInformation1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBMandateRelatedInformation1(OBFrequency6 frequency) {
        this.frequency = frequency;
    }

    public OBMandateRelatedInformation1 mandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
     *
     * @return mandateIdentification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "MandateIdentification", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MandateIdentification")
    public String getMandateIdentification() {
        return mandateIdentification;
    }

    public void setMandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
    }

    public OBMandateRelatedInformation1 classification(OBExternalMandateClassification1Code classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get classification
     *
     * @return classification
     */
    @Valid
    @Schema(name = "Classification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Classification")
    public OBExternalMandateClassification1Code getClassification() {
        return classification;
    }

    public void setClassification(OBExternalMandateClassification1Code classification) {
        this.classification = classification;
    }

    public OBMandateRelatedInformation1 categoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
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

    public OBMandateRelatedInformation1 firstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
        return this;
    }

    /**
     * Get firstPaymentDateTime
     *
     * @return firstPaymentDateTime
     */
    @Valid
    @Schema(name = "FirstPaymentDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FirstPaymentDateTime")
    public DateTime getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
    }

    public OBMandateRelatedInformation1 recurringPaymentDateTime(DateTime recurringPaymentDateTime) {
        this.recurringPaymentDateTime = recurringPaymentDateTime;
        return this;
    }

    /**
     * The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return recurringPaymentDateTime
     */
    @Valid
    @Schema(name = "RecurringPaymentDateTime", description = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RecurringPaymentDateTime")
    public DateTime getRecurringPaymentDateTime() {
        return recurringPaymentDateTime;
    }

    public void setRecurringPaymentDateTime(DateTime recurringPaymentDateTime) {
        this.recurringPaymentDateTime = recurringPaymentDateTime;
    }

    public OBMandateRelatedInformation1 finalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
        return this;
    }

    /**
     * Get finalPaymentDateTime
     *
     * @return finalPaymentDateTime
     */
    @Valid
    @Schema(name = "FinalPaymentDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FinalPaymentDateTime")
    public DateTime getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
    }

    public OBMandateRelatedInformation1 frequency(OBFrequency6 frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
     * @return frequency
     */
    @NotNull
    @Valid
    @Schema(name = "Frequency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Frequency")
    public OBFrequency6 getFrequency() {
        return frequency;
    }

    public void setFrequency(OBFrequency6 frequency) {
        this.frequency = frequency;
    }

    public OBMandateRelatedInformation1 reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.
     *
     * @return reason
     */
    @Size(min = 1, max = 256)
    @Schema(name = "Reason", description = "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBMandateRelatedInformation1 obMandateRelatedInformation1 = (OBMandateRelatedInformation1) o;
        return Objects.equals(this.mandateIdentification, obMandateRelatedInformation1.mandateIdentification) &&
                Objects.equals(this.classification, obMandateRelatedInformation1.classification) &&
                Objects.equals(this.categoryPurposeCode, obMandateRelatedInformation1.categoryPurposeCode) &&
                Objects.equals(this.firstPaymentDateTime, obMandateRelatedInformation1.firstPaymentDateTime) &&
                Objects.equals(this.recurringPaymentDateTime, obMandateRelatedInformation1.recurringPaymentDateTime) &&
                Objects.equals(this.finalPaymentDateTime, obMandateRelatedInformation1.finalPaymentDateTime) &&
                Objects.equals(this.frequency, obMandateRelatedInformation1.frequency) &&
                Objects.equals(this.reason, obMandateRelatedInformation1.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mandateIdentification, classification, categoryPurposeCode, firstPaymentDateTime, recurringPaymentDateTime, finalPaymentDateTime, frequency, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBMandateRelatedInformation1 {\n");
        sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    categoryPurposeCode: ").append(toIndentedString(categoryPurposeCode)).append("\n");
        sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
        sb.append("    recurringPaymentDateTime: ").append(toIndentedString(recurringPaymentDateTime)).append("\n");
        sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

