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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Details about the fees/charges
 */

@Schema(name = "OverdraftFeeChargeDetail_inner", description = "Details about the fees/charges")
@JsonTypeName("OverdraftFeeChargeDetail_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftFeeChargeDetailInner {

    private FeeType feeType;

    private Boolean negotiableIndicator;

    private Boolean overdraftControlIndicator;

    private String incrementalBorrowingAmount;

    private String feeAmount;

    private String feeRate;

    private FeeRateType feeRateType;

    private ApplicationFrequency1 applicationFrequency;

    private CalculationFrequency1 calculationFrequency;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OverdraftFeeChargeCapInner> overdraftFeeChargeCap;

    private OtherFeeType otherFeeType;

    private OtherFeeRateType otherFeeRateType;

    private OtherApplicationFrequency otherApplicationFrequency;

    private OtherCalculationFrequency otherCalculationFrequency;

    public OverdraftFeeChargeDetailInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OverdraftFeeChargeDetailInner(FeeType feeType, ApplicationFrequency1 applicationFrequency) {
        this.feeType = feeType;
        this.applicationFrequency = applicationFrequency;
    }

    public OverdraftFeeChargeDetailInner feeType(FeeType feeType) {
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
    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

    public OverdraftFeeChargeDetailInner negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Indicates whether fee and charges are negotiable
     *
     * @return negotiableIndicator
     */

    @Schema(name = "NegotiableIndicator", description = "Indicates whether fee and charges are negotiable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NegotiableIndicator")
    public Boolean getNegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public OverdraftFeeChargeDetailInner overdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
        return this;
    }

    /**
     * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
     *
     * @return overdraftControlIndicator
     */

    @Schema(name = "OverdraftControlIndicator", description = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftControlIndicator")
    public Boolean getOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
    }

    public OverdraftFeeChargeDetailInner incrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
        return this;
    }

    /**
     * Every additional tranche of an overdraft balance to which an overdraft fee is applied
     *
     * @return incrementalBorrowingAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "IncrementalBorrowingAmount", description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("IncrementalBorrowingAmount")
    public String getIncrementalBorrowingAmount() {
        return incrementalBorrowingAmount;
    }

    public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    }

    public OverdraftFeeChargeDetailInner feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "FeeAmount", description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeAmount")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public OverdraftFeeChargeDetailInner feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "FeeRate", description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeRate")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public OverdraftFeeChargeDetailInner feeRateType(FeeRateType feeRateType) {
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
    public FeeRateType getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(FeeRateType feeRateType) {
        this.feeRateType = feeRateType;
    }

    public OverdraftFeeChargeDetailInner applicationFrequency(ApplicationFrequency1 applicationFrequency) {
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
    public ApplicationFrequency1 getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequency1 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OverdraftFeeChargeDetailInner calculationFrequency(CalculationFrequency1 calculationFrequency) {
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
    public CalculationFrequency1 getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequency1 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OverdraftFeeChargeDetailInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftFeeChargeDetailInner addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for capturing any other info related to Overdraft Fees Charge Details
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Free text for capturing any other info related to Overdraft Fees Charge Details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public OverdraftFeeChargeDetailInner overdraftFeeChargeCap(List<@Valid OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    public OverdraftFeeChargeDetailInner addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapInner overdraftFeeChargeCapItem) {
        if (this.overdraftFeeChargeCap == null) {
            this.overdraftFeeChargeCap = new ArrayList<>();
        }
        this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
     *
     * @return overdraftFeeChargeCap
     */
    @Valid
    @Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftFeeChargeCap")
    public List<@Valid OverdraftFeeChargeCapInner> getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(List<@Valid OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    public OverdraftFeeChargeDetailInner otherFeeType(OtherFeeType otherFeeType) {
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
    public OtherFeeType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OverdraftFeeChargeDetailInner otherFeeRateType(OtherFeeRateType otherFeeRateType) {
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
    public OtherFeeRateType getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OverdraftFeeChargeDetailInner otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OverdraftFeeChargeDetailInner otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftFeeChargeDetailInner overdraftFeeChargeDetailInner = (OverdraftFeeChargeDetailInner) o;
        return Objects.equals(this.feeType, overdraftFeeChargeDetailInner.feeType) &&
                Objects.equals(this.negotiableIndicator, overdraftFeeChargeDetailInner.negotiableIndicator) &&
                Objects.equals(this.overdraftControlIndicator, overdraftFeeChargeDetailInner.overdraftControlIndicator) &&
                Objects.equals(this.incrementalBorrowingAmount, overdraftFeeChargeDetailInner.incrementalBorrowingAmount) &&
                Objects.equals(this.feeAmount, overdraftFeeChargeDetailInner.feeAmount) &&
                Objects.equals(this.feeRate, overdraftFeeChargeDetailInner.feeRate) &&
                Objects.equals(this.feeRateType, overdraftFeeChargeDetailInner.feeRateType) &&
                Objects.equals(this.applicationFrequency, overdraftFeeChargeDetailInner.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, overdraftFeeChargeDetailInner.calculationFrequency) &&
                Objects.equals(this.notes, overdraftFeeChargeDetailInner.notes) &&
                Objects.equals(this.overdraftFeeChargeCap, overdraftFeeChargeDetailInner.overdraftFeeChargeCap) &&
                Objects.equals(this.otherFeeType, overdraftFeeChargeDetailInner.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, overdraftFeeChargeDetailInner.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, overdraftFeeChargeDetailInner.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, overdraftFeeChargeDetailInner.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftFeeChargeDetailInner {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
        sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

