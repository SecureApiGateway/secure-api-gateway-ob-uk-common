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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Other fees/charges details
 */

@Schema(name = "FeeChargeDetail_inner_1", description = "Other fees/charges details")
@JsonTypeName("FeeChargeDetail_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeeChargeDetailInner1 {

    private FeeCategory feeCategory;

    private FeeType3 feeType;

    private String feeAmount;

    private String feeRate;

    private FeeRateType3 feeRateType;

    private ApplicationFrequency5 applicationFrequency;

    private CalculationFrequency5 calculationFrequency;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OtherFeeCategoryType otherFeeCategoryType;

    private OtherFeeType1 otherFeeType;

    private OtherFeeRateType1 otherFeeRateType;

    private OtherApplicationFrequency1 otherApplicationFrequency;

    private OtherCalculationFrequency1 otherCalculationFrequency;

    @Valid
    private List<@Valid FeeChargeCapInner1> feeChargeCap;

    private FeeApplicableRange feeApplicableRange;

    public FeeChargeDetailInner1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public FeeChargeDetailInner1(FeeCategory feeCategory, FeeType3 feeType, ApplicationFrequency5 applicationFrequency) {
        this.feeCategory = feeCategory;
        this.feeType = feeType;
        this.applicationFrequency = applicationFrequency;
    }

    public FeeChargeDetailInner1 feeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Get feeCategory
     *
     * @return feeCategory
     */
    @NotNull
    @Valid
    @Schema(name = "FeeCategory", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FeeCategory")
    public FeeCategory getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
    }

    public FeeChargeDetailInner1 feeType(FeeType3 feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Get feeType
     *
     * @return feeType
     */
    @NotNull
    @Valid
    @Schema(name = "FeeType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FeeType")
    public FeeType3 getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType3 feeType) {
        this.feeType = feeType;
    }

    public FeeChargeDetailInner1 feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "FeeAmount", description = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeAmount")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public FeeChargeDetailInner1 feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "FeeRate", description = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeRate")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public FeeChargeDetailInner1 feeRateType(FeeRateType3 feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Get feeRateType
     *
     * @return feeRateType
     */
    @Valid
    @Schema(name = "FeeRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeRateType")
    public FeeRateType3 getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(FeeRateType3 feeRateType) {
        this.feeRateType = feeRateType;
    }

    public FeeChargeDetailInner1 applicationFrequency(ApplicationFrequency5 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Get applicationFrequency
     *
     * @return applicationFrequency
     */
    @NotNull
    @Valid
    @Schema(name = "ApplicationFrequency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ApplicationFrequency")
    public ApplicationFrequency5 getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequency5 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public FeeChargeDetailInner1 calculationFrequency(CalculationFrequency5 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * Get calculationFrequency
     *
     * @return calculationFrequency
     */
    @Valid
    @Schema(name = "CalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CalculationFrequency")
    public CalculationFrequency5 getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequency5 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public FeeChargeDetailInner1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public FeeChargeDetailInner1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the fee/charge details.
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Optional additional notes to supplement the fee/charge details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public FeeChargeDetailInner1 otherFeeCategoryType(OtherFeeCategoryType otherFeeCategoryType) {
        this.otherFeeCategoryType = otherFeeCategoryType;
        return this;
    }

    /**
     * Get otherFeeCategoryType
     *
     * @return otherFeeCategoryType
     */
    @Valid
    @Schema(name = "OtherFeeCategoryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherFeeCategoryType")
    public OtherFeeCategoryType getOtherFeeCategoryType() {
        return otherFeeCategoryType;
    }

    public void setOtherFeeCategoryType(OtherFeeCategoryType otherFeeCategoryType) {
        this.otherFeeCategoryType = otherFeeCategoryType;
    }

    public FeeChargeDetailInner1 otherFeeType(OtherFeeType1 otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     */
    @Valid
    @Schema(name = "OtherFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherFeeType")
    public OtherFeeType1 getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OtherFeeType1 otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public FeeChargeDetailInner1 otherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
        return this;
    }

    /**
     * Get otherFeeRateType
     *
     * @return otherFeeRateType
     */
    @Valid
    @Schema(name = "OtherFeeRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherFeeRateType")
    public OtherFeeRateType1 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public FeeChargeDetailInner1 otherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     */
    @Valid
    @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherApplicationFrequency")
    public OtherApplicationFrequency1 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public FeeChargeDetailInner1 otherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     */
    @Valid
    @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherCalculationFrequency")
    public OtherCalculationFrequency1 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    public FeeChargeDetailInner1 feeChargeCap(List<@Valid FeeChargeCapInner1> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
        return this;
    }

    public FeeChargeDetailInner1 addFeeChargeCapItem(FeeChargeCapInner1 feeChargeCapItem) {
        if (this.feeChargeCap == null) {
            this.feeChargeCap = new ArrayList<>();
        }
        this.feeChargeCap.add(feeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge
     *
     * @return feeChargeCap
     */
    @Valid
    @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeChargeCap")
    public List<@Valid FeeChargeCapInner1> getFeeChargeCap() {
        return feeChargeCap;
    }

    public void setFeeChargeCap(List<@Valid FeeChargeCapInner1> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
    }

    public FeeChargeDetailInner1 feeApplicableRange(FeeApplicableRange feeApplicableRange) {
        this.feeApplicableRange = feeApplicableRange;
        return this;
    }

    /**
     * Get feeApplicableRange
     *
     * @return feeApplicableRange
     */
    @Valid
    @Schema(name = "FeeApplicableRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeApplicableRange")
    public FeeApplicableRange getFeeApplicableRange() {
        return feeApplicableRange;
    }

    public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
        this.feeApplicableRange = feeApplicableRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeeChargeDetailInner1 feeChargeDetailInner1 = (FeeChargeDetailInner1) o;
        return Objects.equals(this.feeCategory, feeChargeDetailInner1.feeCategory) &&
                Objects.equals(this.feeType, feeChargeDetailInner1.feeType) &&
                Objects.equals(this.feeAmount, feeChargeDetailInner1.feeAmount) &&
                Objects.equals(this.feeRate, feeChargeDetailInner1.feeRate) &&
                Objects.equals(this.feeRateType, feeChargeDetailInner1.feeRateType) &&
                Objects.equals(this.applicationFrequency, feeChargeDetailInner1.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, feeChargeDetailInner1.calculationFrequency) &&
                Objects.equals(this.notes, feeChargeDetailInner1.notes) &&
                Objects.equals(this.otherFeeCategoryType, feeChargeDetailInner1.otherFeeCategoryType) &&
                Objects.equals(this.otherFeeType, feeChargeDetailInner1.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, feeChargeDetailInner1.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, feeChargeDetailInner1.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, feeChargeDetailInner1.otherCalculationFrequency) &&
                Objects.equals(this.feeChargeCap, feeChargeDetailInner1.feeChargeCap) &&
                Objects.equals(this.feeApplicableRange, feeChargeDetailInner1.feeApplicableRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeCategory, feeType, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeChargeCap, feeApplicableRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeeChargeDetailInner1 {\n");
        sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
        sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
        sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
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

