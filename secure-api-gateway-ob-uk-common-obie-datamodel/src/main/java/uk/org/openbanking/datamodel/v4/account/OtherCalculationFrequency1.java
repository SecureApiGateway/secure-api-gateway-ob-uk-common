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
 * Other calculation frequency which is not available in standard code set.
 */

@Schema(name = "OtherCalculationFrequency_1", description = "Other calculation frequency which is not available in standard code set.")
@JsonTypeName("OtherCalculationFrequency_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OtherCalculationFrequency1 {

    private String code;

    private String name;

    private String description;

    public OtherCalculationFrequency1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OtherCalculationFrequency1(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public OtherCalculationFrequency1 code(String code) {
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

    public OtherCalculationFrequency1 name(String name) {
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

    public OtherCalculationFrequency1 description(String description) {
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
        OtherCalculationFrequency1 otherCalculationFrequency1 = (OtherCalculationFrequency1) o;
        return Objects.equals(this.code, otherCalculationFrequency1.code) &&
                Objects.equals(this.name, otherCalculationFrequency1.name) &&
                Objects.equals(this.description, otherCalculationFrequency1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherCalculationFrequency1 {\n");
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

