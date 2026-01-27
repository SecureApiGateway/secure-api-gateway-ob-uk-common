/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v4.fund;

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
 * OBFundsConfirmationResponse1Data
 */

@JsonTypeName("OBFundsConfirmationResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationResponse1Data {

    private String fundsConfirmationId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private Boolean fundsAvailable;

    private String reference;

    private OBFundsConfirmation1DataInstructedAmount instructedAmount;

    public OBFundsConfirmationResponse1Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBFundsConfirmationResponse1Data(String fundsConfirmationId, String consentId, DateTime creationDateTime, Boolean fundsAvailable, String reference, OBFundsConfirmation1DataInstructedAmount instructedAmount) {
        this.fundsConfirmationId = fundsConfirmationId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.fundsAvailable = fundsAvailable;
        this.reference = reference;
        this.instructedAmount = instructedAmount;
    }

    public OBFundsConfirmationResponse1Data fundsConfirmationId(String fundsConfirmationId) {
        this.fundsConfirmationId = fundsConfirmationId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
     *
     * @return fundsConfirmationId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "FundsConfirmationId", description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsConfirmationId")
    public String getFundsConfirmationId() {
        return fundsConfirmationId;
    }

    public void setFundsConfirmationId(String fundsConfirmationId) {
        this.fundsConfirmationId = fundsConfirmationId;
    }

    public OBFundsConfirmationResponse1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBFundsConfirmationResponse1Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBFundsConfirmationResponse1Data fundsAvailable(Boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
        return this;
    }

    /**
     * Flag to indicate the result of a confirmation of funds check.
     *
     * @return fundsAvailable
     */
    @NotNull
    @Schema(name = "FundsAvailable", description = "Flag to indicate the result of a confirmation of funds check.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsAvailable")
    public Boolean getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(Boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public OBFundsConfirmationResponse1Data reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
     *
     * @return reference
     */
    @NotNull
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", description = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBFundsConfirmationResponse1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
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
    public OBFundsConfirmation1DataInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
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
        OBFundsConfirmationResponse1Data obFundsConfirmationResponse1Data = (OBFundsConfirmationResponse1Data) o;
        return Objects.equals(this.fundsConfirmationId, obFundsConfirmationResponse1Data.fundsConfirmationId) &&
                Objects.equals(this.consentId, obFundsConfirmationResponse1Data.consentId) &&
                Objects.equals(this.creationDateTime, obFundsConfirmationResponse1Data.creationDateTime) &&
                Objects.equals(this.fundsAvailable, obFundsConfirmationResponse1Data.fundsAvailable) &&
                Objects.equals(this.reference, obFundsConfirmationResponse1Data.reference) &&
                Objects.equals(this.instructedAmount, obFundsConfirmationResponse1Data.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsConfirmationId, consentId, creationDateTime, fundsAvailable, reference, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationResponse1Data {\n");
        sb.append("    fundsConfirmationId: ").append(toIndentedString(fundsConfirmationId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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

