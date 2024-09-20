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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

/**
 * OBStatusReason
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatusReason {

    private String statusReasonCode;

    private String statusReasonDescription;

    private String path;

    public OBStatusReason statusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
        return this;
    }

    /**
     * Specifies the status reason in a code form.  For a full list of values refer to `OBExternalStatusReason1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return statusReasonCode
     */
    @Size(min = 1, max = 4)
    @Schema(name = "StatusReasonCode", example = "ERIN", description = "Specifies the status reason in a code form.  For a full list of values refer to `OBExternalStatusReason1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonCode")
    public String getStatusReasonCode() {
        return statusReasonCode;
    }

    public void setStatusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    public OBStatusReason statusReasonDescription(String statusReasonDescription) {
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

    public OBStatusReason path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
     *
     * @return path
     */
    @Size(min = 1, max = 500)
    @Schema(name = "Path", description = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatusReason obStatusReason = (OBStatusReason) o;
        return Objects.equals(this.statusReasonCode, obStatusReason.statusReasonCode) &&
                Objects.equals(this.statusReasonDescription, obStatusReason.statusReasonDescription) &&
                Objects.equals(this.path, obStatusReason.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusReasonCode, statusReasonDescription, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatusReason {\n");
        sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

