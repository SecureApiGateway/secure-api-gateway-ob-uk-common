/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OBWriteFundsConfirmationResponse1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFundsConfirmationResponse1Data {
    @JsonProperty("FundsAvailableResult")
    private OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult;

    @JsonProperty("SupplementaryData")
    @Valid
    private Map<String, Object> supplementaryData = null;

    public OBWriteFundsConfirmationResponse1Data fundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
        return this;
    }

    /**
     * Get fundsAvailableResult
     *
     * @return fundsAvailableResult
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult getFundsAvailableResult() {
        return fundsAvailableResult;
    }

    public void setFundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
    }

    public OBWriteFundsConfirmationResponse1Data supplementaryData(Map<String, Object> supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    public OBWriteFundsConfirmationResponse1Data putSupplementaryDataItem(String key, Object supplementaryDataItem) {
        if (this.supplementaryData == null) {
            this.supplementaryData = new HashMap<String, Object>();
        }
        this.supplementaryData.put(key, supplementaryDataItem);
        return this;
    }

    /**
     * Additional information that can not be captured in the structured fields and/or any other specific block.
     *
     * @return supplementaryData
     */
    @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")


    public Map<String, Object> getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(Map<String, Object> supplementaryData) {
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
