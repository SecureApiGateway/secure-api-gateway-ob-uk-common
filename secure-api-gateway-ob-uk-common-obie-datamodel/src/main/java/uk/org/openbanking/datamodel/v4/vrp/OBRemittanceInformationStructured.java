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
 * OBRemittanceInformationStructured
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRemittanceInformationStructured {

    @Valid
    private List<@Valid OBReferredDocumentInformation> referredDocumentInformation;

    private Integer referredDocumentAmount;

    private OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation;

    private String invoicer;

    private String invoicee;

    private String taxRemittance;

    @Valid
    private List<@Size(min = 1, max = 140) String> additionalRemittanceInformation;

    public OBRemittanceInformationStructured referredDocumentInformation(List<@Valid OBReferredDocumentInformation> referredDocumentInformation) {
        this.referredDocumentInformation = referredDocumentInformation;
        return this;
    }

    public OBRemittanceInformationStructured addReferredDocumentInformationItem(OBReferredDocumentInformation referredDocumentInformationItem) {
        if (this.referredDocumentInformation == null) {
            this.referredDocumentInformation = new ArrayList<>();
        }
        this.referredDocumentInformation.add(referredDocumentInformationItem);
        return this;
    }

    /**
     * Get referredDocumentInformation
     *
     * @return referredDocumentInformation
     */
    @Valid
    @Schema(name = "ReferredDocumentInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ReferredDocumentInformation")
    public List<@Valid OBReferredDocumentInformation> getReferredDocumentInformation() {
        return referredDocumentInformation;
    }

    public void setReferredDocumentInformation(List<@Valid OBReferredDocumentInformation> referredDocumentInformation) {
        this.referredDocumentInformation = referredDocumentInformation;
    }

    public OBRemittanceInformationStructured referredDocumentAmount(Integer referredDocumentAmount) {
        this.referredDocumentAmount = referredDocumentAmount;
        return this;
    }

    /**
     * Get referredDocumentAmount
     *
     * @return referredDocumentAmount
     */

    @Schema(name = "ReferredDocumentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ReferredDocumentAmount")
    public Integer getReferredDocumentAmount() {
        return referredDocumentAmount;
    }

    public void setReferredDocumentAmount(Integer referredDocumentAmount) {
        this.referredDocumentAmount = referredDocumentAmount;
    }

    public OBRemittanceInformationStructured creditorReferenceInformation(OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
        this.creditorReferenceInformation = creditorReferenceInformation;
        return this;
    }

    /**
     * Get creditorReferenceInformation
     *
     * @return creditorReferenceInformation
     */
    @Valid
    @Schema(name = "CreditorReferenceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorReferenceInformation")
    public OBRemittanceInformationStructuredCreditorReferenceInformation getCreditorReferenceInformation() {
        return creditorReferenceInformation;
    }

    public void setCreditorReferenceInformation(OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
        this.creditorReferenceInformation = creditorReferenceInformation;
    }

    public OBRemittanceInformationStructured invoicer(String invoicer) {
        this.invoicer = invoicer;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return invoicer
     */
    @Size(min = 1, max = 256)
    @Schema(name = "Invoicer", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Invoicer")
    public String getInvoicer() {
        return invoicer;
    }

    public void setInvoicer(String invoicer) {
        this.invoicer = invoicer;
    }

    public OBRemittanceInformationStructured invoicee(String invoicee) {
        this.invoicee = invoicee;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return invoicee
     */
    @Size(min = 1, max = 256)
    @Schema(name = "Invoicee", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Invoicee")
    public String getInvoicee() {
        return invoicee;
    }

    public void setInvoicee(String invoicee) {
        this.invoicee = invoicee;
    }

    public OBRemittanceInformationStructured taxRemittance(String taxRemittance) {
        this.taxRemittance = taxRemittance;
        return this;
    }

    /**
     * Get taxRemittance
     *
     * @return taxRemittance
     */
    @Size(min = 1, max = 140)
    @Schema(name = "TaxRemittance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TaxRemittance")
    public String getTaxRemittance() {
        return taxRemittance;
    }

    public void setTaxRemittance(String taxRemittance) {
        this.taxRemittance = taxRemittance;
    }

    public OBRemittanceInformationStructured additionalRemittanceInformation(List<@Size(min = 1, max = 140) String> additionalRemittanceInformation) {
        this.additionalRemittanceInformation = additionalRemittanceInformation;
        return this;
    }

    public OBRemittanceInformationStructured addAdditionalRemittanceInformationItem(String additionalRemittanceInformationItem) {
        if (this.additionalRemittanceInformation == null) {
            this.additionalRemittanceInformation = new ArrayList<>();
        }
        this.additionalRemittanceInformation.add(additionalRemittanceInformationItem);
        return this;
    }

    /**
     * Get additionalRemittanceInformation
     *
     * @return additionalRemittanceInformation
     */
    @Size(max = 3)
    @Schema(name = "AdditionalRemittanceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AdditionalRemittanceInformation")
    public List<@Size(min = 1, max = 140) String> getAdditionalRemittanceInformation() {
        return additionalRemittanceInformation;
    }

    public void setAdditionalRemittanceInformation(List<@Size(min = 1, max = 140) String> additionalRemittanceInformation) {
        this.additionalRemittanceInformation = additionalRemittanceInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRemittanceInformationStructured obRemittanceInformationStructured = (OBRemittanceInformationStructured) o;
        return Objects.equals(this.referredDocumentInformation, obRemittanceInformationStructured.referredDocumentInformation) &&
                Objects.equals(this.referredDocumentAmount, obRemittanceInformationStructured.referredDocumentAmount) &&
                Objects.equals(this.creditorReferenceInformation, obRemittanceInformationStructured.creditorReferenceInformation) &&
                Objects.equals(this.invoicer, obRemittanceInformationStructured.invoicer) &&
                Objects.equals(this.invoicee, obRemittanceInformationStructured.invoicee) &&
                Objects.equals(this.taxRemittance, obRemittanceInformationStructured.taxRemittance) &&
                Objects.equals(this.additionalRemittanceInformation, obRemittanceInformationStructured.additionalRemittanceInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referredDocumentInformation, referredDocumentAmount, creditorReferenceInformation, invoicer, invoicee, taxRemittance, additionalRemittanceInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRemittanceInformationStructured {\n");
        sb.append("    referredDocumentInformation: ").append(toIndentedString(referredDocumentInformation)).append("\n");
        sb.append("    referredDocumentAmount: ").append(toIndentedString(referredDocumentAmount)).append("\n");
        sb.append("    creditorReferenceInformation: ").append(toIndentedString(creditorReferenceInformation)).append("\n");
        sb.append("    invoicer: ").append(toIndentedString(invoicer)).append("\n");
        sb.append("    invoicee: ").append(toIndentedString(invoicee)).append("\n");
        sb.append("    taxRemittance: ").append(toIndentedString(taxRemittance)).append("\n");
        sb.append("    additionalRemittanceInformation: ").append(toIndentedString(additionalRemittanceInformation)).append("\n");
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

