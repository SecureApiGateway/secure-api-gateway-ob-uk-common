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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Details about Overdraft rates, fees &amp; charges
 */

@Schema(name = "Overdraft_1", description = "Details about Overdraft rates, fees & charges")
@JsonTypeName("Overdraft_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Overdraft1 {

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OverdraftTierBandSetInner1> overdraftTierBandSet = new ArrayList<>();

    public Overdraft1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Overdraft1(List<@Valid OverdraftTierBandSetInner1> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
    }

    public Overdraft1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Associated Notes about the overdraft rates
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Associated Notes about the overdraft rates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public Overdraft1 overdraftTierBandSet(List<@Valid OverdraftTierBandSetInner1> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
        return this;
    }

    public Overdraft1 addOverdraftTierBandSetItem(OverdraftTierBandSetInner1 overdraftTierBandSetItem) {
        if (this.overdraftTierBandSet == null) {
            this.overdraftTierBandSet = new ArrayList<>();
        }
        this.overdraftTierBandSet.add(overdraftTierBandSetItem);
        return this;
    }

    /**
     * Tier band set details
     *
     * @return overdraftTierBandSet
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "OverdraftTierBandSet", description = "Tier band set details", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("OverdraftTierBandSet")
    public List<@Valid OverdraftTierBandSetInner1> getOverdraftTierBandSet() {
        return overdraftTierBandSet;
    }

    public void setOverdraftTierBandSet(List<@Valid OverdraftTierBandSetInner1> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdraft1 overdraft1 = (Overdraft1) o;
        return Objects.equals(this.notes, overdraft1.notes) &&
                Objects.equals(this.overdraftTierBandSet, overdraft1.overdraftTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, overdraftTierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft1 {\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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

