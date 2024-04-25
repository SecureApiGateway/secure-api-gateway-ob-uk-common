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
package uk.org.openbanking.datamodel.fund;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 */

@Schema(name = "OBSCASupportData1", description = "Supporting Data provided by TPP, when requesting SCA Exemption.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBSCASupportData1 {

    private OBSCASupportData1RequestedSCAExemptionType requestedSCAExemptionType;

    private OBSCASupportData1AppliedAuthenticationApproach appliedAuthenticationApproach;

    private String referencePaymentOrderId;

    public OBSCASupportData1 requestedSCAExemptionType(OBSCASupportData1RequestedSCAExemptionType requestedSCAExemptionType) {
        this.requestedSCAExemptionType = requestedSCAExemptionType;
        return this;
    }

    /**
     * Get requestedSCAExemptionType
     *
     * @return requestedSCAExemptionType
     */
    @Valid
    @Schema(name = "RequestedSCAExemptionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RequestedSCAExemptionType")
    public OBSCASupportData1RequestedSCAExemptionType getRequestedSCAExemptionType() {
        return requestedSCAExemptionType;
    }

    public void setRequestedSCAExemptionType(OBSCASupportData1RequestedSCAExemptionType requestedSCAExemptionType) {
        this.requestedSCAExemptionType = requestedSCAExemptionType;
    }

    public OBSCASupportData1 appliedAuthenticationApproach(OBSCASupportData1AppliedAuthenticationApproach appliedAuthenticationApproach) {
        this.appliedAuthenticationApproach = appliedAuthenticationApproach;
        return this;
    }

    /**
     * Get appliedAuthenticationApproach
     *
     * @return appliedAuthenticationApproach
     */
    @Valid
    @Schema(name = "AppliedAuthenticationApproach", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AppliedAuthenticationApproach")
    public OBSCASupportData1AppliedAuthenticationApproach getAppliedAuthenticationApproach() {
        return appliedAuthenticationApproach;
    }

    public void setAppliedAuthenticationApproach(OBSCASupportData1AppliedAuthenticationApproach appliedAuthenticationApproach) {
        this.appliedAuthenticationApproach = appliedAuthenticationApproach;
    }

    public OBSCASupportData1 referencePaymentOrderId(String referencePaymentOrderId) {
        this.referencePaymentOrderId = referencePaymentOrderId;
        return this;
    }

    /**
     * If the payment is recurring, then this field is populated with the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. The value here refers to the payment id e.g. DomesticPaymentId
     *
     * @return referencePaymentOrderId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "ReferencePaymentOrderId", description = "If the payment is recurring, then this field is populated with the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. The value here refers to the payment id e.g. DomesticPaymentId  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ReferencePaymentOrderId")
    public String getReferencePaymentOrderId() {
        return referencePaymentOrderId;
    }

    public void setReferencePaymentOrderId(String referencePaymentOrderId) {
        this.referencePaymentOrderId = referencePaymentOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBSCASupportData1 obSCASupportData1 = (OBSCASupportData1) o;
        return Objects.equals(this.requestedSCAExemptionType, obSCASupportData1.requestedSCAExemptionType) &&
                Objects.equals(this.appliedAuthenticationApproach, obSCASupportData1.appliedAuthenticationApproach) &&
                Objects.equals(this.referencePaymentOrderId, obSCASupportData1.referencePaymentOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestedSCAExemptionType, appliedAuthenticationApproach, referencePaymentOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBSCASupportData1 {\n");
        sb.append("    requestedSCAExemptionType: ").append(toIndentedString(requestedSCAExemptionType)).append("\n");
        sb.append("    appliedAuthenticationApproach: ").append(toIndentedString(appliedAuthenticationApproach)).append("\n");
        sb.append("    referencePaymentOrderId: ").append(toIndentedString(referencePaymentOrderId)).append("\n");
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

