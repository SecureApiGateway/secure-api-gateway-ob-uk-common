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
package uk.org.openbanking.datamodel.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * OBDomesticVRPRequestData
 */

@JsonTypeName("OBDomesticVRPRequest_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPRequestData {

    private String consentId;

    private String psUAuthenticationMethod;

    private OBVRPInteractionTypes psUInteractionType;

    private OBDomesticVRPInitiation initiation;

    private OBDomesticVRPInstruction instruction;

    public OBDomesticVRPRequestData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPRequestData(String consentId, String psUAuthenticationMethod, OBDomesticVRPInitiation initiation, OBDomesticVRPInstruction instruction) {
        this.consentId = consentId;
        this.psUAuthenticationMethod = psUAuthenticationMethod;
        this.initiation = initiation;
        this.instruction = instruction;
    }

    public OBDomesticVRPRequestData consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Identifier for the Domestic VRP Consent that this payment is made under.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "Identifier for the Domestic VRP Consent that this payment is made under.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBDomesticVRPRequestData psUAuthenticationMethod(String psUAuthenticationMethod) {
        this.psUAuthenticationMethod = psUAuthenticationMethod;
        return this;
    }

    /**
     * Get psUAuthenticationMethod
     *
     * @return psUAuthenticationMethod
     */
    @NotNull
    @Schema(name = "PSUAuthenticationMethod", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PSUAuthenticationMethod")
    public String getPsUAuthenticationMethod() {
        return psUAuthenticationMethod;
    }

    public void setPsUAuthenticationMethod(String psUAuthenticationMethod) {
        this.psUAuthenticationMethod = psUAuthenticationMethod;
    }

    public OBDomesticVRPRequestData psUInteractionType(OBVRPInteractionTypes psUInteractionType) {
        this.psUInteractionType = psUInteractionType;
        return this;
    }

    /**
     * Get psUInteractionType
     *
     * @return psUInteractionType
     */
    @Valid
    @Schema(name = "PSUInteractionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PSUInteractionType")
    public OBVRPInteractionTypes getPsUInteractionType() {
        return psUInteractionType;
    }

    public void setPsUInteractionType(OBVRPInteractionTypes psUInteractionType) {
        this.psUInteractionType = psUInteractionType;
    }

    public OBDomesticVRPRequestData initiation(OBDomesticVRPInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     */
    @NotNull
    @Valid
    @Schema(name = "Initiation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Initiation")
    public OBDomesticVRPInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticVRPInitiation initiation) {
        this.initiation = initiation;
    }

    public OBDomesticVRPRequestData instruction(OBDomesticVRPInstruction instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * Get instruction
     *
     * @return instruction
     */
    @NotNull
    @Valid
    @Schema(name = "Instruction", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Instruction")
    public OBDomesticVRPInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(OBDomesticVRPInstruction instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPRequestData obDomesticVRPRequestData = (OBDomesticVRPRequestData) o;
        return Objects.equals(this.consentId, obDomesticVRPRequestData.consentId) &&
                Objects.equals(this.psUAuthenticationMethod, obDomesticVRPRequestData.psUAuthenticationMethod) &&
                Objects.equals(this.psUInteractionType, obDomesticVRPRequestData.psUInteractionType) &&
                Objects.equals(this.initiation, obDomesticVRPRequestData.initiation) &&
                Objects.equals(this.instruction, obDomesticVRPRequestData.instruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, psUAuthenticationMethod, psUInteractionType, initiation, instruction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPRequestData {\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    psUAuthenticationMethod: ").append(toIndentedString(psUAuthenticationMethod)).append("\n");
        sb.append("    psUInteractionType: ").append(toIndentedString(psUInteractionType)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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

