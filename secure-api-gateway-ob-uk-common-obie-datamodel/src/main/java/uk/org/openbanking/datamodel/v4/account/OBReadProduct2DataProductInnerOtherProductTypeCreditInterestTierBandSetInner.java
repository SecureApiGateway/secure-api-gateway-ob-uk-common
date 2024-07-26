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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * The group of tiers or bands for which credit interest can be applied.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner", description = "The group of tiers or bands for which credit interest can be applied.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner {

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandMethod tierBandMethod;

    private OBInterestCalculationMethod1Code calculationMethod;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerDestination destination;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OBOtherCodeType10 otherCalculationMethod;

    private OBOtherCodeType10 otherDestination;

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand = new ArrayList<>();

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandMethod tierBandMethod, OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerDestination destination, List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
        this.tierBandMethod = tierBandMethod;
        this.destination = destination;
        this.tierBand = tierBand;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBandMethod(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandMethod tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * Get tierBandMethod
     *
     * @return tierBandMethod
     */
    @NotNull
    @Valid
    @Schema(name = "TierBandMethod", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierBandMethod")
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandMethod getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandMethod tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    /**
     * Get calculationMethod
     *
     * @return calculationMethod
     */
    @Valid
    @Schema(name = "CalculationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CalculationMethod")
    public OBInterestCalculationMethod1Code getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner destination(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get destination
     *
     * @return destination
     */
    @NotNull
    @Valid
    @Schema(name = "Destination", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Destination")
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerDestination getDestination() {
        return destination;
    }

    public void setDestination(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerDestination destination) {
        this.destination = destination;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     */

    @Schema(name = "Notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
        return this;
    }

    /**
     * Get otherCalculationMethod
     *
     * @return otherCalculationMethod
     */
    @Valid
    @Schema(name = "OtherCalculationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherCalculationMethod")
    public OBOtherCodeType10 getOtherCalculationMethod() {
        return otherCalculationMethod;
    }

    public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner otherDestination(OBOtherCodeType10 otherDestination) {
        this.otherDestination = otherDestination;
        return this;
    }

    /**
     * Get otherDestination
     *
     * @return otherDestination
     */
    @Valid
    @Schema(name = "OtherDestination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherDestination")
    public OBOtherCodeType10 getOtherDestination() {
        return otherDestination;
    }

    public void setOtherDestination(OBOtherCodeType10 otherDestination) {
        this.otherDestination = otherDestination;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBand(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
        this.tierBand = tierBand;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner addTierBandItem(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierBandItem) {
        if (this.tierBand == null) {
            this.tierBand = new ArrayList<>();
        }
        this.tierBand.add(tierBandItem);
        return this;
    }

    /**
     * Get tierBand
     *
     * @return tierBand
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "TierBand", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierBand")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> getTierBand() {
        return tierBand;
    }

    public void setTierBand(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
        this.tierBand = tierBand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner) o;
        return Objects.equals(this.tierBandMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.tierBandMethod) &&
                Objects.equals(this.calculationMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.calculationMethod) &&
                Objects.equals(this.destination, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.destination) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.notes) &&
                Objects.equals(this.otherCalculationMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.otherCalculationMethod) &&
                Objects.equals(this.otherDestination, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.otherDestination) &&
                Objects.equals(this.tierBand, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.tierBand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, calculationMethod, destination, notes, otherCalculationMethod, otherDestination, tierBand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner {\n");
        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
        sb.append("    otherDestination: ").append(toIndentedString(otherDestination)).append("\n");
        sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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

