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
 * Borrowing details
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft", description = "Borrowing details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeOverdraft {

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet = new ArrayList<>();

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft addNotesItem(String notesItem) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraftTierBandSet(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraft addOverdraftTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner overdraftTierBandSetItem) {
        if (this.overdraftTierBandSet == null) {
            this.overdraftTierBandSet = new ArrayList<>();
        }
        this.overdraftTierBandSet.add(overdraftTierBandSetItem);
        return this;
    }

    /**
     * Get overdraftTierBandSet
     *
     * @return overdraftTierBandSet
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "OverdraftTierBandSet", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("OverdraftTierBandSet")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> getOverdraftTierBandSet() {
        return overdraftTierBandSet;
    }

    public void setOverdraftTierBandSet(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet) {
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
        OBReadProduct2DataProductInnerOtherProductTypeOverdraft obReadProduct2DataProductInnerOtherProductTypeOverdraft = (OBReadProduct2DataProductInnerOtherProductTypeOverdraft) o;
        return Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeOverdraft.notes) &&
                Objects.equals(this.overdraftTierBandSet, obReadProduct2DataProductInnerOtherProductTypeOverdraft.overdraftTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, overdraftTierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOverdraft {\n");
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

