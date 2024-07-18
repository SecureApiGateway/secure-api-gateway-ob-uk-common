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

@Schema(name = "TierBandSet_inner_1", description = "The group of tiers or bands for which credit interest can be applied.")
@JsonTypeName("TierBandSet_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TierBandSetInner1 {

    private TierBandMethod2 tierBandMethod;

    private CalculationMethod calculationMethod;

    private Destination1 destination;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid TierBandInner1> tierBand = new ArrayList<>();

    public TierBandSetInner1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TierBandSetInner1(TierBandMethod2 tierBandMethod, List<@Valid TierBandInner1> tierBand) {
        this.tierBandMethod = tierBandMethod;
        this.tierBand = tierBand;
    }

    public TierBandSetInner1 tierBandMethod(TierBandMethod2 tierBandMethod) {
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
    public TierBandMethod2 getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethod2 tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public TierBandSetInner1 calculationMethod(CalculationMethod calculationMethod) {
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

    public TierBandSetInner1 destination(Destination1 destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get destination
     *
     * @return destination
     */
    @Valid
    @Schema(name = "Destination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Destination")
    public Destination1 getDestination() {
        return destination;
    }

    public void setDestination(Destination1 destination) {
        this.destination = destination;
    }

    public TierBandSetInner1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public TierBandSetInner1 addNotesItem(String notesItem) {
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

    public TierBandSetInner1 tierBand(List<@Valid TierBandInner1> tierBand) {
        this.tierBand = tierBand;
        return this;
    }

    public TierBandSetInner1 addTierBandItem(TierBandInner1 tierBandItem) {
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
    public List<@Valid TierBandInner1> getTierBand() {
        return tierBand;
    }

    public void setTierBand(List<@Valid TierBandInner1> tierBand) {
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
        TierBandSetInner1 tierBandSetInner1 = (TierBandSetInner1) o;
        return Objects.equals(this.tierBandMethod, tierBandSetInner1.tierBandMethod) &&
                Objects.equals(this.calculationMethod, tierBandSetInner1.calculationMethod) &&
                Objects.equals(this.destination, tierBandSetInner1.destination) &&
                Objects.equals(this.notes, tierBandSetInner1.notes) &&
                Objects.equals(this.tierBand, tierBandSetInner1.tierBand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, calculationMethod, destination, notes, tierBand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TierBandSetInner1 {\n");
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

