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
 * Details about specific fees/charges that are applied for repayment
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentFeeCharges_RepaymentFeeChargeDetail_inner", description = "Details about specific fees/charges that are applied for repayment")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentFeeCharges_RepaymentFeeChargeDetail_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner {

    private OBFeeType1Code feeType;

    private Boolean negotiableIndicator;

    private String feeAmount;

    private String feeRate;

    private OBInterestRateType1Code1 feeRateType;

    private OBFeeFrequency1Code2 applicationFrequency;

    private OBFeeFrequency1Code3 calculationFrequency;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OBOtherFeeChargeDetailType otherFeeType;

    private OBOtherCodeType18 otherFeeRateType;

    private OBOtherCodeType16 otherApplicationFrequency;

    private OBOtherCodeType17 otherCalculationFrequency;

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner(OBFeeType1Code feeType, OBFeeFrequency1Code2 applicationFrequency, OBFeeFrequency1Code3 calculationFrequency) {
        this.feeType = feeType;
        this.applicationFrequency = applicationFrequency;
        this.calculationFrequency = calculationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner feeType(OBFeeType1Code feeType) {
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
    public OBFeeType1Code getFeeType() {
        return feeType;
    }

    public void setFeeType(OBFeeType1Code feeType) {
        this.feeType = feeType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Fee/charge which is usually negotiable rather than a fixed amount
     *
     * @return negotiableIndicator
     */

    @Schema(name = "NegotiableIndicator", description = "Fee/charge which is usually negotiable rather than a fixed amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NegotiableIndicator")
    public Boolean getNegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner feeAmount(String feeAmount) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner feeRate(String feeRate) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner feeRateType(OBInterestRateType1Code1 feeRateType) {
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
    public OBInterestRateType1Code1 getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(OBInterestRateType1Code1 feeRateType) {
        this.feeRateType = feeRateType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
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
    public OBFeeFrequency1Code2 getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * Get calculationFrequency
     *
     * @return calculationFrequency
     */
    @NotNull
    @Valid
    @Schema(name = "CalculationFrequency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CalculationFrequency")
    public OBFeeFrequency1Code3 getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner addNotesItem(String notesItem) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
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
    public OBOtherFeeChargeDetailType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner otherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
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
    public OBOtherCodeType18 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
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
    public OBOtherCodeType16 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
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
    public OBOtherCodeType17 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
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
        OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner) o;
        return Objects.equals(this.feeType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.feeType) &&
                Objects.equals(this.negotiableIndicator, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.negotiableIndicator) &&
                Objects.equals(this.feeAmount, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.feeAmount) &&
                Objects.equals(this.feeRate, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.feeRate) &&
                Objects.equals(this.feeRateType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.feeRateType) &&
                Objects.equals(this.applicationFrequency, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.calculationFrequency) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.notes) &&
                Objects.equals(this.otherFeeType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

