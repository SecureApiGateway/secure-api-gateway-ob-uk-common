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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;

/**
 * OBBeneficiary5Basic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBBeneficiary5Basic {

    private String accountId;

    private String beneficiaryId;

    private OBInternalBeneficiaryType1Code beneficiaryType;

    private String reference;

    private OBSupplementaryData1 supplementaryData;

    public OBBeneficiary5Basic accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "AccountId", example = "22289", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBBeneficiary5Basic beneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
     *
     * @return beneficiaryId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "BeneficiaryId", example = "Ben1", description = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BeneficiaryId")
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public OBBeneficiary5Basic beneficiaryType(OBInternalBeneficiaryType1Code beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
        return this;
    }

    /**
     * Get beneficiaryType
     *
     * @return beneficiaryType
     */
    @Valid
    @Schema(name = "BeneficiaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BeneficiaryType")
    public OBInternalBeneficiaryType1Code getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(OBInternalBeneficiaryType1Code beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public OBBeneficiary5Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", example = "Towbar Club", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBBeneficiary5Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     */
    @Valid
    @Schema(name = "SupplementaryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBeneficiary5Basic obBeneficiary5Basic = (OBBeneficiary5Basic) o;
        return Objects.equals(this.accountId, obBeneficiary5Basic.accountId) &&
                Objects.equals(this.beneficiaryId, obBeneficiary5Basic.beneficiaryId) &&
                Objects.equals(this.beneficiaryType, obBeneficiary5Basic.beneficiaryType) &&
                Objects.equals(this.reference, obBeneficiary5Basic.reference) &&
                Objects.equals(this.supplementaryData, obBeneficiary5Basic.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBeneficiary5Basic {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
        sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

