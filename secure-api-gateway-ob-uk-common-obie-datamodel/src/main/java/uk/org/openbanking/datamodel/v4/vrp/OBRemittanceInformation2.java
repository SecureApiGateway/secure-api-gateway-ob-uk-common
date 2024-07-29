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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts&#39; receivable system
 */

@Schema(name = "OBRemittanceInformation2", description = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRemittanceInformation2 {

    @Valid
    private List<@Valid OBRemittanceInformationStructured> structured;

    @Valid
    private List<@Size(min = 1, max = 256) String> unstructured;

    public OBRemittanceInformation2 structured(List<@Valid OBRemittanceInformationStructured> structured) {
        this.structured = structured;
        return this;
    }

    public OBRemittanceInformation2 addStructuredItem(OBRemittanceInformationStructured structuredItem) {
        if (this.structured == null) {
            this.structured = new ArrayList<>();
        }
        this.structured.add(structuredItem);
        return this;
    }

    /**
     * Get structured
     *
     * @return structured
     */
    @Valid
    @Schema(name = "Structured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Structured")
    public List<@Valid OBRemittanceInformationStructured> getStructured() {
        return structured;
    }

    public void setStructured(List<@Valid OBRemittanceInformationStructured> structured) {
        this.structured = structured;
    }

    public OBRemittanceInformation2 unstructured(List<@Size(min = 1, max = 256) String> unstructured) {
        this.unstructured = unstructured;
        return this;
    }

    public OBRemittanceInformation2 addUnstructuredItem(String unstructuredItem) {
        if (this.unstructured == null) {
            this.unstructured = new ArrayList<>();
        }
        this.unstructured.add(unstructuredItem);
        return this;
    }

    /**
     * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.
     *
     * @return unstructured
     */

    @Schema(name = "Unstructured", description = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Unstructured")
    public List<@Size(min = 1, max = 256) String> getUnstructured() {
        return unstructured;
    }

    public void setUnstructured(List<@Size(min = 1, max = 256) String> unstructured) {
        this.unstructured = unstructured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRemittanceInformation2 obRemittanceInformation2 = (OBRemittanceInformation2) o;
        return Objects.equals(this.structured, obRemittanceInformation2.structured) &&
                Objects.equals(this.unstructured, obRemittanceInformation2.unstructured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(structured, unstructured);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRemittanceInformation2 {\n");
        sb.append("    structured: ").append(toIndentedString(structured)).append("\n");
        sb.append("    unstructured: ").append(toIndentedString(unstructured)).append("\n");
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

