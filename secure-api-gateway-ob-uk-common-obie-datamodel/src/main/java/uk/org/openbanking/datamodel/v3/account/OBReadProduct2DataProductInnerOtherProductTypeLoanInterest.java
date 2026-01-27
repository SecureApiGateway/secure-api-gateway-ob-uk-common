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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Details about the interest that may be payable to the SME Loan holders
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest", description = "Details about the interest that may be payable to the SME Loan holders")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet = new ArrayList<>();

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
        this.loanInterestTierBandSet = loanInterestTierBandSet;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addNotesItem(String notesItem) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterestTierBandSet(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
        this.loanInterestTierBandSet = loanInterestTierBandSet;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestTierBandSetItem) {
        if (this.loanInterestTierBandSet == null) {
            this.loanInterestTierBandSet = new ArrayList<>();
        }
        this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
        return this;
    }

    /**
     * Get loanInterestTierBandSet
     *
     * @return loanInterestTierBandSet
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "LoanInterestTierBandSet", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("LoanInterestTierBandSet")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> getLoanInterestTierBandSet() {
        return loanInterestTierBandSet;
    }

    public void setLoanInterestTierBandSet(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
        this.loanInterestTierBandSet = loanInterestTierBandSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeLoanInterest obReadProduct2DataProductInnerOtherProductTypeLoanInterest = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterest) o;
        return Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.notes) &&
                Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.loanInterestTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, loanInterestTierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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

