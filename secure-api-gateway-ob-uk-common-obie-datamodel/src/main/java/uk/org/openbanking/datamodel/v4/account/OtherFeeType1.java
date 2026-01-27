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
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Other Fee/charge type which is not available in the standard code set
 */

@Schema(name = "OtherFeeType_1", description = "Other Fee/charge type which is not available in the standard code set")
@JsonTypeName("OtherFeeType_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OtherFeeType1 {

    private String code;

    private FeeCategory feeCategory;

    private String name;

    private String description;

    public OtherFeeType1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OtherFeeType1(FeeCategory feeCategory, String name, String description) {
        this.feeCategory = feeCategory;
        this.name = name;
        this.description = description;
    }

    public OtherFeeType1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     */
    @Pattern(regexp = "^\\w{0,4}$")
    @Size(min = 0, max = 4)
    @Schema(name = "Code", description = "The four letter Mnemonic used within an XML file to identify a code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OtherFeeType1 feeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Get feeCategory
     *
     * @return feeCategory
     */
    @NotNull
    @Valid
    @Schema(name = "FeeCategory", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FeeCategory")
    public FeeCategory getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
    }

    public OtherFeeType1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     *
     * @return name
     */
    @NotNull
    @Size(min = 1, max = 70)
    @Schema(name = "Name", description = "Long name associated with the code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OtherFeeType1 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     *
     * @return description
     */
    @NotNull
    @Size(min = 1, max = 350)
    @Schema(name = "Description", description = "Description to describe the purpose of the code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtherFeeType1 otherFeeType1 = (OtherFeeType1) o;
        return Objects.equals(this.code, otherFeeType1.code) &&
                Objects.equals(this.feeCategory, otherFeeType1.feeCategory) &&
                Objects.equals(this.name, otherFeeType1.name) &&
                Objects.equals(this.description, otherFeeType1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, feeCategory, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeeType1 {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

