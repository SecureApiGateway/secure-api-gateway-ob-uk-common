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

@Schema(name = "TierBandSet_inner", description = "The group of tiers or bands for which credit interest can be applied.")
@JsonTypeName("TierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TierBandSetInner {

    private TierBandMethod tierBandMethod;

    private CalculationMethod calculationMethod;

    private Destination destination;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid TierBandInner> tierBand = new ArrayList<>();

    public TierBandSetInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TierBandSetInner(TierBandMethod tierBandMethod, Destination destination, List<@Valid TierBandInner> tierBand) {
        this.tierBandMethod = tierBandMethod;
        this.destination = destination;
        this.tierBand = tierBand;
    }

    public TierBandSetInner tierBandMethod(TierBandMethod tierBandMethod) {
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
    public TierBandMethod getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethod tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public TierBandSetInner calculationMethod(CalculationMethod calculationMethod) {
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
    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(CalculationMethod calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public TierBandSetInner destination(Destination destination) {
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
    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public TierBandSetInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public TierBandSetInner addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band Set details
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier Band Set details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public TierBandSetInner tierBand(List<@Valid TierBandInner> tierBand) {
        this.tierBand = tierBand;
        return this;
    }

    public TierBandSetInner addTierBandItem(TierBandInner tierBandItem) {
        if (this.tierBand == null) {
            this.tierBand = new ArrayList<>();
        }
        this.tierBand.add(tierBandItem);
        return this;
    }

    /**
     * Tier Band Details
     *
     * @return tierBand
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "TierBand", description = "Tier Band Details", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierBand")
    public List<@Valid TierBandInner> getTierBand() {
        return tierBand;
    }

    public void setTierBand(List<@Valid TierBandInner> tierBand) {
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
        TierBandSetInner tierBandSetInner = (TierBandSetInner) o;
        return Objects.equals(this.tierBandMethod, tierBandSetInner.tierBandMethod) &&
                Objects.equals(this.calculationMethod, tierBandSetInner.calculationMethod) &&
                Objects.equals(this.destination, tierBandSetInner.destination) &&
                Objects.equals(this.notes, tierBandSetInner.notes) &&
                Objects.equals(this.tierBand, tierBandSetInner.tierBand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, calculationMethod, destination, notes, tierBand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TierBandSetInner {\n");
        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

