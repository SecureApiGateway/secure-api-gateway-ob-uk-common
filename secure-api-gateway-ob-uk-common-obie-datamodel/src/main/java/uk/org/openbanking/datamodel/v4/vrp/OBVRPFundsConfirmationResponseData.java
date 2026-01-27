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
package uk.org.openbanking.datamodel.v4.vrp;

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
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;

/**
 * OBVRPFundsConfirmationResponseData
 */

@JsonTypeName("OBVRPFundsConfirmationResponse_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBVRPFundsConfirmationResponseData {

    private String fundsConfirmationId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private String reference;

    private OBPAFundsAvailableResult1 fundsAvailableResult;

    private OBActiveOrHistoricCurrencyAndAmount instructedAmount;

    public OBVRPFundsConfirmationResponseData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBVRPFundsConfirmationResponseData(String fundsConfirmationId, String consentId, DateTime creationDateTime, OBPAFundsAvailableResult1 fundsAvailableResult, OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.fundsConfirmationId = fundsConfirmationId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.fundsAvailableResult = fundsAvailableResult;
        this.instructedAmount = instructedAmount;
    }

    public OBVRPFundsConfirmationResponseData fundsConfirmationId(String fundsConfirmationId) {
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

    public OBVRPFundsConfirmationResponseData consentId(String consentId) {
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

    public OBVRPFundsConfirmationResponseData creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBVRPFundsConfirmationResponseData reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the PISP, to unambiguously refer to the request related to the payment transaction.
     *
     * @return reference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", description = "Unique reference, as assigned by the PISP, to unambiguously refer to the request related to the payment transaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBVRPFundsConfirmationResponseData fundsAvailableResult(OBPAFundsAvailableResult1 fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
        return this;
    }

    /**
     * Get fundsAvailableResult
     *
     * @return fundsAvailableResult
     */
    @NotNull
    @Valid
    @Schema(name = "FundsAvailableResult", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsAvailableResult")
    public OBPAFundsAvailableResult1 getFundsAvailableResult() {
        return fundsAvailableResult;
    }

    public void setFundsAvailableResult(OBPAFundsAvailableResult1 fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
    }

    public OBVRPFundsConfirmationResponseData instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
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
        OBVRPFundsConfirmationResponseData obVRPFundsConfirmationResponseData = (OBVRPFundsConfirmationResponseData) o;
        return Objects.equals(this.fundsConfirmationId, obVRPFundsConfirmationResponseData.fundsConfirmationId) &&
                Objects.equals(this.consentId, obVRPFundsConfirmationResponseData.consentId) &&
                Objects.equals(this.creationDateTime, obVRPFundsConfirmationResponseData.creationDateTime) &&
                Objects.equals(this.reference, obVRPFundsConfirmationResponseData.reference) &&
                Objects.equals(this.fundsAvailableResult, obVRPFundsConfirmationResponseData.fundsAvailableResult) &&
                Objects.equals(this.instructedAmount, obVRPFundsConfirmationResponseData.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsConfirmationId, consentId, creationDateTime, reference, fundsAvailableResult, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBVRPFundsConfirmationResponseData {\n");
        sb.append("    fundsConfirmationId: ").append(toIndentedString(fundsConfirmationId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    fundsAvailableResult: ").append(toIndentedString(fundsAvailableResult)).append("\n");
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

