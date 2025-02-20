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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 */

@Schema(name = "OverdraftFeeChargeCap_inner", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
@JsonTypeName("OverdraftFeeChargeCap_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftFeeChargeCapInner {

    @Valid
    private List<@Valid FeeTypeInner> feeType = new ArrayList<>();

    private MinMaxType minMaxType;

    private Float feeCapOccurrence;

    private String feeCapAmount;

    private CappingPeriod cappingPeriod;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OtherFeeTypeInner> otherFeeType;

    public OverdraftFeeChargeCapInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OverdraftFeeChargeCapInner(List<@Valid FeeTypeInner> feeType, MinMaxType minMaxType) {
        this.feeType = feeType;
        this.minMaxType = minMaxType;
    }

    public OverdraftFeeChargeCapInner feeType(List<@Valid FeeTypeInner> feeType) {
        this.feeType = feeType;
        return this;
    }

    public OverdraftFeeChargeCapInner addFeeTypeItem(FeeTypeInner feeTypeItem) {
        if (this.feeType == null) {
            this.feeType = new ArrayList<>();
        }
        this.feeType.add(feeTypeItem);
        return this;
    }

    /**
     * Fee/charge type which is being capped
     *
     * @return feeType
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "FeeType", description = "Fee/charge type which is being capped", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FeeType")
    public List<@Valid FeeTypeInner> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<@Valid FeeTypeInner> feeType) {
        this.feeType = feeType;
    }

    public OverdraftFeeChargeCapInner minMaxType(MinMaxType minMaxType) {
        this.minMaxType = minMaxType;
        return this;
    }

    /**
     * Get minMaxType
     *
     * @return minMaxType
     */
    @NotNull
    @Valid
    @Schema(name = "MinMaxType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("MinMaxType")
    public MinMaxType getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(MinMaxType minMaxType) {
        this.minMaxType = minMaxType;
    }

    public OverdraftFeeChargeCapInner feeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.
     *
     * @return feeCapOccurrence
     */

    @Schema(name = "FeeCapOccurrence", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeCapOccurrence")
    public Float getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public OverdraftFeeChargeCapInner feeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * Cap amount charged for a fee/charge
     *
     * @return feeCapAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "FeeCapAmount", description = "Cap amount charged for a fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeCapAmount")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    public OverdraftFeeChargeCapInner cappingPeriod(CappingPeriod cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
        return this;
    }

    /**
     * Get cappingPeriod
     *
     * @return cappingPeriod
     */
    @Valid
    @Schema(name = "CappingPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CappingPeriod")
    public CappingPeriod getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(CappingPeriod cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public OverdraftFeeChargeCapInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftFeeChargeCapInner addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Notes related to Overdraft fee charge cap
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Notes related to Overdraft fee charge cap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public OverdraftFeeChargeCapInner otherFeeType(List<@Valid OtherFeeTypeInner> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public OverdraftFeeChargeCapInner addOtherFeeTypeItem(OtherFeeTypeInner otherFeeTypeItem) {
        if (this.otherFeeType == null) {
            this.otherFeeType = new ArrayList<>();
        }
        this.otherFeeType.add(otherFeeTypeItem);
        return this;
    }

    /**
     * Other fee type code which is not available in the standard code set
     *
     * @return otherFeeType
     */
    @Valid
    @Schema(name = "OtherFeeType", description = "Other fee type code which is not available in the standard code set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherFeeType")
    public List<@Valid OtherFeeTypeInner> getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(List<@Valid OtherFeeTypeInner> otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftFeeChargeCapInner overdraftFeeChargeCapInner = (OverdraftFeeChargeCapInner) o;
        return Objects.equals(this.feeType, overdraftFeeChargeCapInner.feeType) &&
                Objects.equals(this.minMaxType, overdraftFeeChargeCapInner.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, overdraftFeeChargeCapInner.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, overdraftFeeChargeCapInner.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, overdraftFeeChargeCapInner.cappingPeriod) &&
                Objects.equals(this.notes, overdraftFeeChargeCapInner.notes) &&
                Objects.equals(this.otherFeeType, overdraftFeeChargeCapInner.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftFeeChargeCapInner {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
        sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
        sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
        sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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

