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
package uk.org.openbanking.datamodel.v4.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementRate_inner", description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@JsonTypeName("OBStatement2_StatementRate_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2StatementRateInner {

    private String rate;

    private String type;

    public OBStatement2StatementRateInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2StatementRateInner(String rate, String type) {
        this.rate = rate;
        this.type = type;
    }

    public OBStatement2StatementRateInner rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Rate associated with the statement rate type.
     *
     * @return rate
     */
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Size(max = 40)
    @Schema(name = "Rate", example = "0.224", description = "Rate associated with the statement rate type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Rate")
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public OBStatement2StatementRateInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Statement rate type, in a coded form. For a full list of values see `OBInternalStatementRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", example = "UK.OBIE.AnnualCash", description = "Statement rate type, in a coded form. For a full list of values see `OBInternalStatementRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2StatementRateInner obStatement2StatementRateInner = (OBStatement2StatementRateInner) o;
        return Objects.equals(this.rate, obStatement2StatementRateInner.rate) &&
                Objects.equals(this.type, obStatement2StatementRateInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementRateInner {\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

