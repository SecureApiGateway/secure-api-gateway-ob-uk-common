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
package uk.org.openbanking.datamodel.v3.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Product details associated with the Account
 */

@Schema(name = "OBReadProduct2_Data_Product_inner", description = "Product details associated with the Account")
@JsonTypeName("OBReadProduct2_Data_Product_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInner {

    private String productName;

    private String productId;

    private String accountId;

    private String secondaryProductId;

    private OBReadProduct2DataProductInnerProductType productType;

    private String marketingStateId;

    private OBReadProduct2DataProductInnerOtherProductType otherProductType;

    private OBBCAData1 BCA;

    private OBPCAData1 PCA;

    public OBReadProduct2DataProductInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInner(String accountId, OBReadProduct2DataProductInnerProductType productType) {
        this.accountId = accountId;
        this.productType = productType;
    }

    public OBReadProduct2DataProductInner productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
     *
     * @return productName
     */
    @Size(min = 1, max = 350)
    @Schema(name = "ProductName", description = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OBReadProduct2DataProductInner productId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
     *
     * @return productId
     */
    @Size(min = 1, max = 40)
    @Schema(name = "ProductId", description = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ProductId")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OBReadProduct2DataProductInner accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "AccountId", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBReadProduct2DataProductInner secondaryProductId(String secondaryProductId) {
        this.secondaryProductId = secondaryProductId;
        return this;
    }

    /**
     * Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.
     *
     * @return secondaryProductId
     */
    @Size(min = 1, max = 70)
    @Schema(name = "SecondaryProductId", description = "Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SecondaryProductId")
    public String getSecondaryProductId() {
        return secondaryProductId;
    }

    public void setSecondaryProductId(String secondaryProductId) {
        this.secondaryProductId = secondaryProductId;
    }

    public OBReadProduct2DataProductInner productType(OBReadProduct2DataProductInnerProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get productType
     *
     * @return productType
     */
    @NotNull
    @Valid
    @Schema(name = "ProductType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ProductType")
    public OBReadProduct2DataProductInnerProductType getProductType() {
        return productType;
    }

    public void setProductType(OBReadProduct2DataProductInnerProductType productType) {
        this.productType = productType;
    }

    public OBReadProduct2DataProductInner marketingStateId(String marketingStateId) {
        this.marketingStateId = marketingStateId;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Product Marketing State.
     *
     * @return marketingStateId
     */
    @Size(min = 1, max = 35)
    @Schema(name = "MarketingStateId", description = "Unique and unambiguous identification of a  Product Marketing State.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MarketingStateId")
    public String getMarketingStateId() {
        return marketingStateId;
    }

    public void setMarketingStateId(String marketingStateId) {
        this.marketingStateId = marketingStateId;
    }

    public OBReadProduct2DataProductInner otherProductType(OBReadProduct2DataProductInnerOtherProductType otherProductType) {
        this.otherProductType = otherProductType;
        return this;
    }

    /**
     * Get otherProductType
     *
     * @return otherProductType
     */
    @Valid
    @Schema(name = "OtherProductType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherProductType")
    public OBReadProduct2DataProductInnerOtherProductType getOtherProductType() {
        return otherProductType;
    }

    public void setOtherProductType(OBReadProduct2DataProductInnerOtherProductType otherProductType) {
        this.otherProductType = otherProductType;
    }

    public OBReadProduct2DataProductInner BCA(OBBCAData1 BCA) {
        this.BCA = BCA;
        return this;
    }

    /**
     * Get BCA
     *
     * @return BCA
     */
    @Valid
    @Schema(name = "BCA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BCA")
    public OBBCAData1 getBCA() {
        return BCA;
    }

    public void setBCA(OBBCAData1 BCA) {
        this.BCA = BCA;
    }

    public OBReadProduct2DataProductInner PCA(OBPCAData1 PCA) {
        this.PCA = PCA;
        return this;
    }

    /**
     * Get PCA
     *
     * @return PCA
     */
    @Valid
    @Schema(name = "PCA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PCA")
    public OBPCAData1 getPCA() {
        return PCA;
    }

    public void setPCA(OBPCAData1 PCA) {
        this.PCA = PCA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInner obReadProduct2DataProductInner = (OBReadProduct2DataProductInner) o;
        return Objects.equals(this.productName, obReadProduct2DataProductInner.productName) &&
                Objects.equals(this.productId, obReadProduct2DataProductInner.productId) &&
                Objects.equals(this.accountId, obReadProduct2DataProductInner.accountId) &&
                Objects.equals(this.secondaryProductId, obReadProduct2DataProductInner.secondaryProductId) &&
                Objects.equals(this.productType, obReadProduct2DataProductInner.productType) &&
                Objects.equals(this.marketingStateId, obReadProduct2DataProductInner.marketingStateId) &&
                Objects.equals(this.otherProductType, obReadProduct2DataProductInner.otherProductType) &&
                Objects.equals(this.BCA, obReadProduct2DataProductInner.BCA) &&
                Objects.equals(this.PCA, obReadProduct2DataProductInner.PCA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId, otherProductType, BCA, PCA);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInner {\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
        sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
        sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
        sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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

