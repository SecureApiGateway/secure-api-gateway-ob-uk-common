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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadOffer1Data
 */

@JsonTypeName("OBReadOffer1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadOffer1Data {

    @Valid
    private List<@Valid OBReadOffer1DataOfferInner> offer;

    public OBReadOffer1Data offer(List<@Valid OBReadOffer1DataOfferInner> offer) {
        this.offer = offer;
        return this;
    }

    public OBReadOffer1Data addOfferItem(OBReadOffer1DataOfferInner offerItem) {
        if (this.offer == null) {
            this.offer = new ArrayList<>();
        }
        this.offer.add(offerItem);
        return this;
    }

    /**
     * Get offer
     *
     * @return offer
     */
    @Valid
    @Schema(name = "Offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Offer")
    public List<@Valid OBReadOffer1DataOfferInner> getOffer() {
        return offer;
    }

    public void setOffer(List<@Valid OBReadOffer1DataOfferInner> offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadOffer1Data obReadOffer1Data = (OBReadOffer1Data) o;
        return Objects.equals(this.offer, obReadOffer1Data.offer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadOffer1Data {\n");
        sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

