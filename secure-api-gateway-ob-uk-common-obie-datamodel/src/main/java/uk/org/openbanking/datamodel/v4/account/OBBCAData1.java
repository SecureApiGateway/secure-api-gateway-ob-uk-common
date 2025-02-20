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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBBCAData1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBBCAData1 {

    private ProductDetails productDetails;

    private CreditInterest creditInterest;

    private Overdraft overdraft;

    @Valid
    private List<@Valid OtherFeesChargesInner> otherFeesCharges;

    public OBBCAData1 productDetails(ProductDetails productDetails) {
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
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public OBBCAData1 creditInterest(CreditInterest creditInterest) {
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
    public CreditInterest getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(CreditInterest creditInterest) {
        this.creditInterest = creditInterest;
    }

    public OBBCAData1 overdraft(Overdraft overdraft) {
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
    public Overdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Overdraft overdraft) {
        this.overdraft = overdraft;
    }

    public OBBCAData1 otherFeesCharges(List<@Valid OtherFeesChargesInner> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    public OBBCAData1 addOtherFeesChargesItem(OtherFeesChargesInner otherFeesChargesItem) {
        if (this.otherFeesCharges == null) {
            this.otherFeesCharges = new ArrayList<>();
        }
        this.otherFeesCharges.add(otherFeesChargesItem);
        return this;
    }

    /**
     * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
     *
     * @return otherFeesCharges
     */
    @Valid
    @Schema(name = "OtherFeesCharges", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherFeesCharges")
    public List<@Valid OtherFeesChargesInner> getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(List<@Valid OtherFeesChargesInner> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBCAData1 obBCAData1 = (OBBCAData1) o;
        return Objects.equals(this.productDetails, obBCAData1.productDetails) &&
                Objects.equals(this.creditInterest, obBCAData1.creditInterest) &&
                Objects.equals(this.overdraft, obBCAData1.overdraft) &&
                Objects.equals(this.otherFeesCharges, obBCAData1.otherFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBCAData1 {\n");
        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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

