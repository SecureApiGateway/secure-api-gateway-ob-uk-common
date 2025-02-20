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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Set of elements to fully identify a proprietary bank transaction code.
 */

@Schema(name = "ProprietaryBankTransactionCodeStructure1", description = "Set of elements to fully identify a proprietary bank transaction code.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ProprietaryBankTransactionCodeStructure1 {

    private String code;

    private String issuer;

    public ProprietaryBankTransactionCodeStructure1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProprietaryBankTransactionCodeStructure1(String code) {
        this.code = code;
    }

    public ProprietaryBankTransactionCodeStructure1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Proprietary bank transaction code to identify the underlying transaction.
     *
     * @return code
     */
    @NotNull
    @Size(min = 1, max = 35)
    @Schema(name = "Code", description = "Proprietary bank transaction code to identify the underlying transaction.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Identification of the issuer of the proprietary bank transaction code.
     *
     * @return issuer
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Issuer", description = "Identification of the issuer of the proprietary bank transaction code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Issuer")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCodeStructure1 = (ProprietaryBankTransactionCodeStructure1) o;
        return Objects.equals(this.code, proprietaryBankTransactionCodeStructure1.code) &&
                Objects.equals(this.issuer, proprietaryBankTransactionCodeStructure1.issuer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, issuer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

