/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Details about the interest that may be payable to the BCA account holders
 */

@Schema(name = "CreditInterest", description = "Details about the interest that may be payable to the BCA account holders")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreditInterest {

    @Valid
    private List<@Valid TierBandSetInner> tierBandSet = new ArrayList<>();

    public CreditInterest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CreditInterest(List<@Valid TierBandSetInner> tierBandSet) {
        this.tierBandSet = tierBandSet;
    }

    public CreditInterest tierBandSet(List<@Valid TierBandSetInner> tierBandSet) {
        this.tierBandSet = tierBandSet;
        return this;
    }

    public CreditInterest addTierBandSetItem(TierBandSetInner tierBandSetItem) {
        if (this.tierBandSet == null) {
            this.tierBandSet = new ArrayList<>();
        }
        this.tierBandSet.add(tierBandSetItem);
        return this;
    }

    /**
     * The group of tiers or bands for which credit interest can be applied.
     *
     * @return tierBandSet
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "TierBandSet", description = "The group of tiers or bands for which credit interest can be applied.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierBandSet")
    public List<@Valid TierBandSetInner> getTierBandSet() {
        return tierBandSet;
    }

    public void setTierBandSet(List<@Valid TierBandSetInner> tierBandSet) {
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
        CreditInterest creditInterest = (CreditInterest) o;
        return Objects.equals(this.tierBandSet, creditInterest.tierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditInterest {\n");
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

