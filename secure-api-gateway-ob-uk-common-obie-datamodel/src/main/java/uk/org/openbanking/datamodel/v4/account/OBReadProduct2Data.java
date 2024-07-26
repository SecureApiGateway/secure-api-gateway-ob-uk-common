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
package uk.org.openbanking.datamodel.v4.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * Aligning with the read write specs structure.
 */

@Schema(name = "OBReadProduct2_Data", description = "Aligning with the read write specs structure.")
@JsonTypeName("OBReadProduct2_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2Data {

    @Valid
    private List<@Valid OBReadProduct2DataProductInner> product;

    public OBReadProduct2Data product(List<@Valid OBReadProduct2DataProductInner> product) {
        this.product = product;
        return this;
    }

    public OBReadProduct2Data addProductItem(OBReadProduct2DataProductInner productItem) {
        if (this.product == null) {
            this.product = new ArrayList<>();
        }
        this.product.add(productItem);
        return this;
    }

    /**
     * Get product
     *
     * @return product
     */
    @Valid
    @Schema(name = "Product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Product")
    public List<@Valid OBReadProduct2DataProductInner> getProduct() {
        return product;
    }

    public void setProduct(List<@Valid OBReadProduct2DataProductInner> product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2Data obReadProduct2Data = (OBReadProduct2Data) o;
        return Objects.equals(this.product, obReadProduct2Data.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2Data {\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

