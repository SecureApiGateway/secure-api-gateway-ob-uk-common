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
package uk.org.openbanking.datamodel.v4.common;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Specifies an alternate assumed name for the identification of the account.
 */

@Schema(name = "OBProxy1", description = "Specifies an alternate assumed name for the identification of the account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBProxy1 {

    private String identification;

    private ExternalProxyAccountType1Code code;

    private String type;

    public OBProxy1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBProxy1(String identification, ExternalProxyAccountType1Code code) {
        this.identification = identification;
        this.code = code;
    }

    public OBProxy1 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification used to indicate the account identification under another specified name.
     *
     * @return identification
     */
    @NotNull
    @Size(min = 1, max = 2048)
    @Schema(name = "Identification", example = "2360549017905188", description = "Identification used to indicate the account identification under another specified name.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBProxy1 code(ExternalProxyAccountType1Code code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @NotNull
    @Valid
    @Schema(name = "Code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Code")
    public ExternalProxyAccountType1Code getCode() {
        return code;
    }

    public void setCode(ExternalProxyAccountType1Code code) {
        this.code = code;
    }

    public OBProxy1 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the proxy identification.
     *
     * @return type
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Type", description = "Type of the proxy identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        OBProxy1 obProxy1 = (OBProxy1) o;
        return Objects.equals(this.identification, obProxy1.identification) &&
                Objects.equals(this.code, obProxy1.code) &&
                Objects.equals(this.type, obProxy1.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, code, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBProxy1 {\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

