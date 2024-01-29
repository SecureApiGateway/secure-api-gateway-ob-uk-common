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

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uk.org.openbanking.datamodel.account.CappingPeriod1;
import uk.org.openbanking.datamodel.account.FeeType2Inner1;
import uk.org.openbanking.datamodel.account.MinMaxType1;
import uk.org.openbanking.datamodel.account.OtherFeeTypeInner;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */

@Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftFeeChargeCap {

    @Valid
    private List<@Valid FeeType2Inner1> feeType = new ArrayList<>();

    private Boolean overdraftControlIndicator;

    private MinMaxType1 minMaxType;

    private Float feeCapOccurrence;

    private String feeCapAmount;

    private CappingPeriod1 cappingPeriod;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OtherFeeTypeInner> otherFeeType;

    public OverdraftFeeChargeCap() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OverdraftFeeChargeCap(List<@Valid FeeType2Inner1> feeType, MinMaxType1 minMaxType) {
        this.feeType = feeType;
        this.minMaxType = minMaxType;
    }

    public OverdraftFeeChargeCap feeType(List<@Valid FeeType2Inner1> feeType) {
        this.feeType = feeType;
        return this;
    }

    public OverdraftFeeChargeCap addFeeTypeItem(FeeType2Inner1 feeTypeItem) {
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
    public List<@Valid FeeType2Inner1> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<@Valid FeeType2Inner1> feeType) {
        this.feeType = feeType;
    }

    public OverdraftFeeChargeCap overdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
        return this;
    }

    /**
     * Specifies for the overdraft control feature/benefit
     *
     * @return overdraftControlIndicator
     */

    @Schema(name = "OverdraftControlIndicator", description = "Specifies for the overdraft control feature/benefit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftControlIndicator")
    public Boolean getOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
    }

    public OverdraftFeeChargeCap minMaxType(MinMaxType1 minMaxType) {
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

    public OverdraftFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
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

    public OverdraftFeeChargeCap feeCapAmount(String feeCapAmount) {
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

    public OverdraftFeeChargeCap cappingPeriod(CappingPeriod1 cappingPeriod) {
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

    public OverdraftFeeChargeCap notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftFeeChargeCap addNotesItem(String notesItem) {
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

    public OverdraftFeeChargeCap otherFeeType(List<@Valid OtherFeeTypeInner> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public OverdraftFeeChargeCap addOtherFeeTypeItem(OtherFeeTypeInner otherFeeTypeItem) {
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
        OverdraftFeeChargeCap overdraftFeeChargeCap = (OverdraftFeeChargeCap) o;
        return Objects.equals(this.feeType, overdraftFeeChargeCap.feeType) &&
                Objects.equals(this.overdraftControlIndicator, overdraftFeeChargeCap.overdraftControlIndicator) &&
                Objects.equals(this.minMaxType, overdraftFeeChargeCap.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, overdraftFeeChargeCap.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, overdraftFeeChargeCap.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, overdraftFeeChargeCap.cappingPeriod) &&
                Objects.equals(this.notes, overdraftFeeChargeCap.notes) &&
                Objects.equals(this.otherFeeType, overdraftFeeChargeCap.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, overdraftControlIndicator, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftFeeChargeCap {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
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

