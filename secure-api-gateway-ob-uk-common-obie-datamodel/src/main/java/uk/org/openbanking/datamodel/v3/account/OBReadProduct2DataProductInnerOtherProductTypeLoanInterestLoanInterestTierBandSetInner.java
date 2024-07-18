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
 * The group of tiers or bands for which debit interest can be applied.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner", description = "The group of tiers or bands for which debit interest can be applied.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner {

    private OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerTierBandMethod tierBandMethod;

    private String identification;

    private OBInterestCalculationMethod1Code calculationMethod;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OBOtherCodeType10 otherCalculationMethod;

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand = new ArrayList<>();

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> loanInterestFeesCharges;

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerTierBandMethod tierBandMethod, OBInterestCalculationMethod1Code calculationMethod, List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand) {
        this.tierBandMethod = tierBandMethod;
        this.calculationMethod = calculationMethod;
        this.loanInterestTierBand = loanInterestTierBand;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner tierBandMethod(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerTierBandMethod tierBandMethod) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerTierBandMethod getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerTierBandMethod tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
     *
     * @return identification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Identification", description = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    /**
     * Get calculationMethod
     *
     * @return calculationMethod
     */
    @NotNull
    @Valid
    @Schema(name = "CalculationMethod", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CalculationMethod")
    public OBInterestCalculationMethod1Code getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner addNotesItem(String notesItem) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestTierBand(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner addLoanInterestTierBandItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner loanInterestTierBandItem) {
        if (this.loanInterestTierBand == null) {
            this.loanInterestTierBand = new ArrayList<>();
        }
        this.loanInterestTierBand.add(loanInterestTierBandItem);
        return this;
    }

    /**
     * Get loanInterestTierBand
     *
     * @return loanInterestTierBand
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "LoanInterestTierBand", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("LoanInterestTierBand")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> getLoanInterestTierBand() {
        return loanInterestTierBand;
    }

    public void setLoanInterestTierBand(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestFeesCharges(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner addLoanInterestFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeesChargesItem) {
        if (this.loanInterestFeesCharges == null) {
            this.loanInterestFeesCharges = new ArrayList<>();
        }
        this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
        return this;
    }

    /**
     * Get loanInterestFeesCharges
     *
     * @return loanInterestFeesCharges
     */
    @Valid
    @Schema(name = "LoanInterestFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LoanInterestFeesCharges")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    public void setLoanInterestFeesCharges(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner) o;
        return Objects.equals(this.tierBandMethod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.tierBandMethod) &&
                Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.identification) &&
                Objects.equals(this.calculationMethod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.calculationMethod) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.notes) &&
                Objects.equals(this.otherCalculationMethod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.otherCalculationMethod) &&
                Objects.equals(this.loanInterestTierBand, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.loanInterestTierBand) &&
                Objects.equals(this.loanInterestFeesCharges, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.loanInterestFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, identification, calculationMethod, notes, otherCalculationMethod, loanInterestTierBand, loanInterestFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner {\n");
        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
        sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
        sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
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

