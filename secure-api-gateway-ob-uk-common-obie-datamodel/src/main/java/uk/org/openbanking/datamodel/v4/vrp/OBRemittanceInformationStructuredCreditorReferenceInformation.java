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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.common.ExternalCreditorReferenceType1Code;

/**
 * Reference information provided by the creditor to allow the identification of the underlying documents.
 */

@Schema(name = "OBRemittanceInformationStructured_CreditorReferenceInformation", description = "Reference information provided by the creditor to allow the identification of the underlying documents.")
@JsonTypeName("OBRemittanceInformationStructured_CreditorReferenceInformation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRemittanceInformationStructuredCreditorReferenceInformation {

    private ExternalCreditorReferenceType1Code code;

    private String issuer;

    private String reference;

    public OBRemittanceInformationStructuredCreditorReferenceInformation code(ExternalCreditorReferenceType1Code code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @Valid
    @Schema(name = "Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Code")
    public ExternalCreditorReferenceType1Code getCode() {
        return code;
    }

    public void setCode(ExternalCreditorReferenceType1Code code) {
        this.code = code;
    }

    public OBRemittanceInformationStructuredCreditorReferenceInformation issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Entity that assigns the identification.
     *
     * @return issuer
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Issuer", description = "Entity that assigns the identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Issuer")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public OBRemittanceInformationStructuredCreditorReferenceInformation reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.
     *
     * @return reference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRemittanceInformationStructuredCreditorReferenceInformation obRemittanceInformationStructuredCreditorReferenceInformation = (OBRemittanceInformationStructuredCreditorReferenceInformation) o;
        return Objects.equals(this.code, obRemittanceInformationStructuredCreditorReferenceInformation.code) &&
                Objects.equals(this.issuer, obRemittanceInformationStructuredCreditorReferenceInformation.issuer) &&
                Objects.equals(this.reference, obRemittanceInformationStructuredCreditorReferenceInformation.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, issuer, reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRemittanceInformationStructuredCreditorReferenceInformation {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

