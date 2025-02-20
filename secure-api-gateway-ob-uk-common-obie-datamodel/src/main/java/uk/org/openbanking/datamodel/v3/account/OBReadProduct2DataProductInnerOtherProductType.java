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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;

/**
 * Other product type details associated with the account.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType", description = "Other product type details associated with the account.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductType {

    private String name;

    private String description;

    private OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest;

    private OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft;

    private OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest;

    private OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment;

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges;

    private OBSupplementaryData1 supplementaryData;

    public OBReadProduct2DataProductInnerOtherProductType() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public OBReadProduct2DataProductInnerOtherProductType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the product
     *
     * @return name
     */
    @NotNull
    @Size(min = 1, max = 350)
    @Schema(name = "Name", description = "Long name associated with the product", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadProduct2DataProductInnerOtherProductType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the Product associated with the account
     *
     * @return description
     */
    @NotNull
    @Size(min = 1, max = 350)
    @Schema(name = "Description", description = "Description of the Product associated with the account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBReadProduct2DataProductInnerOtherProductType productDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    /**
     * Get productDetails
     *
     * @return productDetails
     */
    @Valid
    @Schema(name = "ProductDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ProductDetails")
    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public OBReadProduct2DataProductInnerOtherProductType creditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
        this.creditInterest = creditInterest;
        return this;
    }

    /**
     * Get creditInterest
     *
     * @return creditInterest
     */
    @Valid
    @Schema(name = "CreditInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditInterest")
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
        this.creditInterest = creditInterest;
    }

    public OBReadProduct2DataProductInnerOtherProductType overdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
        this.overdraft = overdraft;
        return this;
    }

    /**
     * Get overdraft
     *
     * @return overdraft
     */
    @Valid
    @Schema(name = "Overdraft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Overdraft")
    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
        this.overdraft = overdraft;
    }

    public OBReadProduct2DataProductInnerOtherProductType loanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
        this.loanInterest = loanInterest;
        return this;
    }

    /**
     * Get loanInterest
     *
     * @return loanInterest
     */
    @Valid
    @Schema(name = "LoanInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LoanInterest")
    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
        this.loanInterest = loanInterest;
    }

    public OBReadProduct2DataProductInnerOtherProductType repayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
        this.repayment = repayment;
        return this;
    }

    /**
     * Get repayment
     *
     * @return repayment
     */
    @Valid
    @Schema(name = "Repayment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Repayment")
    public OBReadProduct2DataProductInnerOtherProductTypeRepayment getRepayment() {
        return repayment;
    }

    public void setRepayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
        this.repayment = repayment;
    }

    public OBReadProduct2DataProductInnerOtherProductType otherFeesCharges(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductType addOtherFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherFeesChargesItem) {
        if (this.otherFeesCharges == null) {
            this.otherFeesCharges = new ArrayList<>();
        }
        this.otherFeesCharges.add(otherFeesChargesItem);
        return this;
    }

    /**
     * Get otherFeesCharges
     *
     * @return otherFeesCharges
     */
    @Valid
    @Schema(name = "OtherFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherFeesCharges")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    public OBReadProduct2DataProductInnerOtherProductType supplementaryData(OBSupplementaryData1 supplementaryData) {
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
        OBReadProduct2DataProductInnerOtherProductType obReadProduct2DataProductInnerOtherProductType = (OBReadProduct2DataProductInnerOtherProductType) o;
        return Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductType.name) &&
                Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductType.description) &&
                Objects.equals(this.productDetails, obReadProduct2DataProductInnerOtherProductType.productDetails) &&
                Objects.equals(this.creditInterest, obReadProduct2DataProductInnerOtherProductType.creditInterest) &&
                Objects.equals(this.overdraft, obReadProduct2DataProductInnerOtherProductType.overdraft) &&
                Objects.equals(this.loanInterest, obReadProduct2DataProductInnerOtherProductType.loanInterest) &&
                Objects.equals(this.repayment, obReadProduct2DataProductInnerOtherProductType.repayment) &&
                Objects.equals(this.otherFeesCharges, obReadProduct2DataProductInnerOtherProductType.otherFeesCharges) &&
                Objects.equals(this.supplementaryData, obReadProduct2DataProductInnerOtherProductType.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, productDetails, creditInterest, overdraft, loanInterest, repayment, otherFeesCharges, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
        sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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

