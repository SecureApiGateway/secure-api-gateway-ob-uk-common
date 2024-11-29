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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */

@Schema(name = "FeeChargeCap_inner_1", description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@JsonTypeName("FeeChargeCap_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeeChargeCapInner1 {

    @Valid
    private List<@Valid FeeType4Inner> feeType = new ArrayList<>();

    private MinMaxType1 minMaxType;

    private Float feeCapOccurrence;

    private String feeCapAmount;

    private CappingPeriod1 cappingPeriod;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OtherFeeTypeInner> otherFeeType;

    public FeeChargeCapInner1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public FeeChargeCapInner1(List<@Valid FeeType4Inner> feeType, MinMaxType1 minMaxType) {
        this.feeType = feeType;
        this.minMaxType = minMaxType;
    }

    public FeeChargeCapInner1 feeType(List<@Valid FeeType4Inner> feeType) {
        this.feeType = feeType;
        return this;
    }

    public FeeChargeCapInner1 addFeeTypeItem(FeeType4Inner feeTypeItem) {
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
    public List<@Valid FeeType4Inner> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<@Valid FeeType4Inner> feeType) {
        this.feeType = feeType;
    }

    public FeeChargeCapInner1 minMaxType(MinMaxType1 minMaxType) {
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
    public MinMaxType1 getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(MinMaxType1 minMaxType) {
        this.minMaxType = minMaxType;
    }

    public FeeChargeCapInner1 feeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapOccurrence
     */

    @Schema(name = "FeeCapOccurrence", description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeCapOccurrence")
    public Float getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public FeeChargeCapInner1 feeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeCapAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "FeeCapAmount", description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeCapAmount")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    public FeeChargeCapInner1 cappingPeriod(CappingPeriod1 cappingPeriod) {
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
    public CappingPeriod1 getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(CappingPeriod1 cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public FeeChargeCapInner1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public FeeChargeCapInner1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for adding  extra details for fee charge cap
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Free text for adding  extra details for fee charge cap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public FeeChargeCapInner1 otherFeeType(List<@Valid OtherFeeTypeInner> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public FeeChargeCapInner1 addOtherFeeTypeItem(OtherFeeTypeInner otherFeeTypeItem) {
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
        FeeChargeCapInner1 feeChargeCapInner1 = (FeeChargeCapInner1) o;
        return Objects.equals(this.feeType, feeChargeCapInner1.feeType) &&
                Objects.equals(this.minMaxType, feeChargeCapInner1.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, feeChargeCapInner1.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, feeChargeCapInner1.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, feeChargeCapInner1.cappingPeriod) &&
                Objects.equals(this.notes, feeChargeCapInner1.notes) &&
                Objects.equals(this.otherFeeType, feeChargeCapInner1.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeeChargeCapInner1 {\n");
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

