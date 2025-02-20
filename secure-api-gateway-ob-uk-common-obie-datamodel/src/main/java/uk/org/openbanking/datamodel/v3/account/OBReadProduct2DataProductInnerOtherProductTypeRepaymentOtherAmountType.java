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
package uk.org.openbanking.datamodel.v3.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Other amount type which is not in the standard code list
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_OtherAmountType", description = "Other amount type which is not in the standard code list")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_OtherAmountType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType {

    private String code;

    private String name;

    private String description;

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     */
    @Pattern(regexp = "^\\\\w{0,4}$")
    @Schema(name = "Code", description = "The four letter Mnemonic used within an XML file to identify a code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType name(String name) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType description(String description) {
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
        OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType) o;
        return Objects.equals(this.code, obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType.code) &&
                Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType.name) &&
                Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

