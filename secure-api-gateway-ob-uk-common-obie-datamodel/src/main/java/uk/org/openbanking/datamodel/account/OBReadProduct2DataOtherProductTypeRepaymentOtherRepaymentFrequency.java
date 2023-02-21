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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other repayment frequency which is not in the standard code list
 */
@ApiModel(description = "Other repayment frequency which is not in the standard code list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")

public class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency {
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     */
    @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
    @Pattern(regexp = "^\\\\w{0,4}$")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     *
     * @return name
     */
    @ApiModelProperty(required = true, value = "Long name associated with the code")
    @NotNull
    @Size(min = 1, max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     *
     * @return description
     */
    @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
    @NotNull
    @Size(min = 1, max = 350)
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
        OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency = (OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency) o;
        return Objects.equals(this.code, obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency.code) &&
                Objects.equals(this.name, obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency.name) &&
                Objects.equals(this.description, obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency {\n");

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
