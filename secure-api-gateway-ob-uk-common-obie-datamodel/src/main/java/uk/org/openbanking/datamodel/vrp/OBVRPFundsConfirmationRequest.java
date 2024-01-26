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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * The OBVRPFundsConfirmationRequest object must be used to request funds availability for a specific amount in the Debtor Account included in the VRP consents.
 */

@Schema(name = "OBVRPFundsConfirmationRequest", description = "The OBVRPFundsConfirmationRequest object must be used to request funds availability for a specific amount in the Debtor Account included in the VRP consents.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBVRPFundsConfirmationRequest {

    private OBVRPFundsConfirmationRequestData data;

    public OBVRPFundsConfirmationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBVRPFundsConfirmationRequest(OBVRPFundsConfirmationRequestData data) {
        this.data = data;
    }

    public OBVRPFundsConfirmationRequest data(OBVRPFundsConfirmationRequestData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @NotNull
    @Valid
    @Schema(name = "Data", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Data")
    public OBVRPFundsConfirmationRequestData getData() {
        return data;
    }

    public void setData(OBVRPFundsConfirmationRequestData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBVRPFundsConfirmationRequest obVRPFundsConfirmationRequest = (OBVRPFundsConfirmationRequest) o;
        return Objects.equals(this.data, obVRPFundsConfirmationRequest.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBVRPFundsConfirmationRequest {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

