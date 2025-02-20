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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

/**
 * OBPaymentStatusReason
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBPaymentStatusReason {

    private String statusReasonCode;

    private String statusReasonDescription;

    public OBPaymentStatusReason statusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
        return this;
    }

    /**
     * Specifies the status reason in a code form   For more information and enum values see `OBExternalStatusReason1Code [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return statusReasonCode
     */
    @Size(min = 1, max = 4)
    @Schema(name = "StatusReasonCode", example = "ERIN", description = "Specifies the status reason in a code form   For more information and enum values see `OBExternalStatusReason1Code [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonCode")
    public String getStatusReasonCode() {
        return statusReasonCode;
    }

    public void setStatusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    public OBPaymentStatusReason statusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
        return this;
    }

    /**
     * Description supporting the StatusReasonCode.
     *
     * @return statusReasonDescription
     */
    @Size(min = 1, max = 500)
    @Schema(name = "StatusReasonDescription", description = "Description supporting the StatusReasonCode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonDescription")
    public String getStatusReasonDescription() {
        return statusReasonDescription;
    }

    public void setStatusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBPaymentStatusReason obPaymentStatusReason = (OBPaymentStatusReason) o;
        return Objects.equals(this.statusReasonCode, obPaymentStatusReason.statusReasonCode) &&
                Objects.equals(this.statusReasonDescription, obPaymentStatusReason.statusReasonDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusReasonCode, statusReasonDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBPaymentStatusReason {\n");
        sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
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

