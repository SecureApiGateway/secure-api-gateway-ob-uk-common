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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Borrowing details
 */
@ApiModel(description = "Borrowing details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")

public class OBReadProduct2DataOtherProductTypeOverdraft {
    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OverdraftTierBandSet")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet>();

    public OBReadProduct2DataOtherProductTypeOverdraft notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraft addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     */
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataOtherProductTypeOverdraft overdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraft addOverdraftTierBandSetItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftTierBandSetItem) {
        this.overdraftTierBandSet.add(overdraftTierBandSetItem);
        return this;
    }

    /**
     * Get overdraftTierBandSet
     *
     * @return overdraftTierBandSet
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> getOverdraftTierBandSet() {
        return overdraftTierBandSet;
    }

    public void setOverdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
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
        OBReadProduct2DataOtherProductTypeOverdraft obReadProduct2DataOtherProductTypeOverdraft = (OBReadProduct2DataOtherProductTypeOverdraft) o;
        return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraft.notes) &&
                Objects.equals(this.overdraftTierBandSet, obReadProduct2DataOtherProductTypeOverdraft.overdraftTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, overdraftTierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeOverdraft {\n");

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

