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
package uk.org.openbanking.datamodel.v3.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

/**
 * ^ Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts&#39; receivable system.
 */

@Schema(name = "OBDomesticVRPInitiation_RemittanceInformation", description = "^ Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.")
@JsonTypeName("OBDomesticVRPInitiation_RemittanceInformation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPInitiationRemittanceInformation {

    private String unstructured;

    private String reference;

    public OBDomesticVRPInitiationRemittanceInformation unstructured(String unstructured) {
        this.unstructured = unstructured;
        return this;
    }

    /**
     * ^ Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.
     *
     * @return unstructured
     */
    @Size(min = 1, max = 140)
    @Schema(name = "Unstructured", description = "^ Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Unstructured")
    public String getUnstructured() {
        return unstructured;
    }

    public void setUnstructured(String unstructured) {
        this.unstructured = unstructured;
    }

    public OBDomesticVRPInitiationRemittanceInformation reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * ^ Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage - If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", description = "^ Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage - If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        OBDomesticVRPInitiationRemittanceInformation obDomesticVRPInitiationRemittanceInformation = (OBDomesticVRPInitiationRemittanceInformation) o;
        return Objects.equals(this.unstructured, obDomesticVRPInitiationRemittanceInformation.unstructured) &&
                Objects.equals(this.reference, obDomesticVRPInitiationRemittanceInformation.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unstructured, reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPInitiationRemittanceInformation {\n");
        sb.append("    unstructured: ").append(toIndentedString(unstructured)).append("\n");
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

