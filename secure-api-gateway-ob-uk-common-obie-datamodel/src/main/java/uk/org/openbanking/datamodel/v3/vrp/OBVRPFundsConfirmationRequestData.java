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
package uk.org.openbanking.datamodel.v3.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBActiveOrHistoricCurrencyAndAmount;

/**
 * OBVRPFundsConfirmationRequestData
 */

@JsonTypeName("OBVRPFundsConfirmationRequest_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBVRPFundsConfirmationRequestData {

    private String consentId;

    private String reference;

    private OBActiveOrHistoricCurrencyAndAmount instructedAmount;

    public OBVRPFundsConfirmationRequestData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBVRPFundsConfirmationRequestData(String consentId, OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.consentId = consentId;
        this.instructedAmount = instructedAmount;
    }

    public OBVRPFundsConfirmationRequestData consentId(String consentId) {
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

    public OBVRPFundsConfirmationRequestData reference(String reference) {
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

    public OBVRPFundsConfirmationRequestData instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
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
        OBVRPFundsConfirmationRequestData obVRPFundsConfirmationRequestData = (OBVRPFundsConfirmationRequestData) o;
        return Objects.equals(this.consentId, obVRPFundsConfirmationRequestData.consentId) &&
                Objects.equals(this.reference, obVRPFundsConfirmationRequestData.reference) &&
                Objects.equals(this.instructedAmount, obVRPFundsConfirmationRequestData.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, reference, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBVRPFundsConfirmationRequestData {\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

