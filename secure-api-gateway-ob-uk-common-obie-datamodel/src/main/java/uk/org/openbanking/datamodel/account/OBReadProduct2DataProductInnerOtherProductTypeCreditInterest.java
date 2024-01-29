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

/**
 * Details about the interest that may be payable to the Account holders
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest", description = "Details about the interest that may be payable to the Account holders")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterest {

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet = new ArrayList<>();

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet) {
        this.tierBandSet = tierBandSet;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest tierBandSet(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet) {
        this.tierBandSet = tierBandSet;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest addTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBandSetItem) {
        if (this.tierBandSet == null) {
            this.tierBandSet = new ArrayList<>();
        }
        this.tierBandSet.add(tierBandSetItem);
        return this;
    }

    /**
     * Get tierBandSet
     *
     * @return tierBandSet
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "TierBandSet", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierBandSet")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> getTierBandSet() {
        return tierBandSet;
    }

    public void setTierBandSet(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet) {
        this.tierBandSet = tierBandSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeCreditInterest obReadProduct2DataProductInnerOtherProductTypeCreditInterest = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterest) o;
        return Objects.equals(this.tierBandSet, obReadProduct2DataProductInnerOtherProductTypeCreditInterest.tierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterest {\n");
        sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

