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
package uk.org.openbanking.datamodel.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBPCAData1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBPCAData1 {

    private ProductDetails1 productDetails;

    private CreditInterest1 creditInterest;

    private Overdraft1 overdraft;

    private OtherFeesCharges otherFeesCharges;

    public OBPCAData1 productDetails(ProductDetails1 productDetails) {
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
    public ProductDetails1 getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails1 productDetails) {
        this.productDetails = productDetails;
    }

    public OBPCAData1 creditInterest(CreditInterest1 creditInterest) {
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
    public CreditInterest1 getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(CreditInterest1 creditInterest) {
        this.creditInterest = creditInterest;
    }

    public OBPCAData1 overdraft(Overdraft1 overdraft) {
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
    public Overdraft1 getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Overdraft1 overdraft) {
        this.overdraft = overdraft;
    }

    public OBPCAData1 otherFeesCharges(OtherFeesCharges otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
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
    public OtherFeesCharges getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
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
        OBPCAData1 obPCAData1 = (OBPCAData1) o;
        return Objects.equals(this.productDetails, obPCAData1.productDetails) &&
                Objects.equals(this.creditInterest, obPCAData1.creditInterest) &&
                Objects.equals(this.overdraft, obPCAData1.overdraft) &&
                Objects.equals(this.otherFeesCharges, obPCAData1.otherFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBPCAData1 {\n");
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

