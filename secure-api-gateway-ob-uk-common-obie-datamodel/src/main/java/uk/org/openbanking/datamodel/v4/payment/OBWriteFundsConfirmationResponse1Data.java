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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;

/**
 * OBWriteFundsConfirmationResponse1Data
 */

@JsonTypeName("OBWriteFundsConfirmationResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFundsConfirmationResponse1Data {

    private OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult;

    private OBSupplementaryData1 supplementaryData;

    public OBWriteFundsConfirmationResponse1Data fundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
        return this;
    }

    /**
     * Get fundsAvailableResult
     *
     * @return fundsAvailableResult
     */
    @Valid
    @Schema(name = "FundsAvailableResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FundsAvailableResult")
    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult getFundsAvailableResult() {
        return fundsAvailableResult;
    }

    public void setFundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
    }

    public OBWriteFundsConfirmationResponse1Data supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     */
    @Valid
    @Schema(name = "SupplementaryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteFundsConfirmationResponse1Data obWriteFundsConfirmationResponse1Data = (OBWriteFundsConfirmationResponse1Data) o;
        return Objects.equals(this.fundsAvailableResult, obWriteFundsConfirmationResponse1Data.fundsAvailableResult) &&
                Objects.equals(this.supplementaryData, obWriteFundsConfirmationResponse1Data.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsAvailableResult, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteFundsConfirmationResponse1Data {\n");
        sb.append("    fundsAvailableResult: ").append(toIndentedString(fundsAvailableResult)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

