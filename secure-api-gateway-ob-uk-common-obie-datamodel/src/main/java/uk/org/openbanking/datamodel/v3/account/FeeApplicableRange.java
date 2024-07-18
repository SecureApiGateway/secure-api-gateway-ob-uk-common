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
package uk.org.openbanking.datamodel.v3.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Pattern;

/**
 * Range or amounts or rates for which the fee/charge applies
 */

@Schema(name = "FeeApplicableRange", description = "Range or amounts or rates for which the fee/charge applies")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeeApplicableRange {

    private String minimumAmount;

    private String maximumAmount;

    private String minimumRate;

    private String maximumRate;

    public FeeApplicableRange minimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }

    /**
     * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
     *
     * @return minimumAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "MinimumAmount", description = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MinimumAmount")
    public String getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public FeeApplicableRange maximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
        return this;
    }

    /**
     * Maximum Amount on which fee is applicable (where it is expressed as an amount)
     *
     * @return maximumAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "MaximumAmount", description = "Maximum Amount on which fee is applicable (where it is expressed as an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MaximumAmount")
    public String getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public FeeApplicableRange minimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
        return this;
    }

    /**
     * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
     *
     * @return minimumRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "MinimumRate", description = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MinimumRate")
    public String getMinimumRate() {
        return minimumRate;
    }

    public void setMinimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
    }

    public FeeApplicableRange maximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
        return this;
    }

    /**
     * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
     *
     * @return maximumRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "MaximumRate", description = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MaximumRate")
    public String getMaximumRate() {
        return maximumRate;
    }

    public void setMaximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeeApplicableRange feeApplicableRange = (FeeApplicableRange) o;
        return Objects.equals(this.minimumAmount, feeApplicableRange.minimumAmount) &&
                Objects.equals(this.maximumAmount, feeApplicableRange.maximumAmount) &&
                Objects.equals(this.minimumRate, feeApplicableRange.minimumRate) &&
                Objects.equals(this.maximumRate, feeApplicableRange.maximumRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeeApplicableRange {\n");
        sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
        sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
        sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
        sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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

