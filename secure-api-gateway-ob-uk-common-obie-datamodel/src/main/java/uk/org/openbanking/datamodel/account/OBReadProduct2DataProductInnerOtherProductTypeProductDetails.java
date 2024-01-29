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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * OBReadProduct2DataProductInnerOtherProductTypeProductDetails
 */

@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_ProductDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeProductDetails {

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeProductDetailsSegmentInner> segment;

    private Integer feeFreeLength;

    private OBReadProduct2DataProductInnerOtherProductTypeProductDetailsFeeFreeLengthPeriod feeFreeLengthPeriod;

    private String monthlyMaximumCharge;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OBOtherCodeType10 otherSegment;

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails segment(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeProductDetailsSegmentInner> segment) {
        this.segment = segment;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails addSegmentItem(OBReadProduct2DataProductInnerOtherProductTypeProductDetailsSegmentInner segmentItem) {
        if (this.segment == null) {
            this.segment = new ArrayList<>();
        }
        this.segment.add(segmentItem);
        return this;
    }

    /**
     * Get segment
     *
     * @return segment
     */
    @Valid
    @Schema(name = "Segment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Segment")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeProductDetailsSegmentInner> getSegment() {
        return segment;
    }

    public void setSegment(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeProductDetailsSegmentInner> segment) {
        this.segment = segment;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails feeFreeLength(Integer feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
        return this;
    }

    /**
     * The length/duration of the fee free period
     *
     * @return feeFreeLength
     */

    @Schema(name = "FeeFreeLength", description = "The length/duration of the fee free period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeFreeLength")
    public Integer getFeeFreeLength() {
        return feeFreeLength;
    }

    public void setFeeFreeLength(Integer feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails feeFreeLengthPeriod(OBReadProduct2DataProductInnerOtherProductTypeProductDetailsFeeFreeLengthPeriod feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
        return this;
    }

    /**
     * Get feeFreeLengthPeriod
     *
     * @return feeFreeLengthPeriod
     */
    @Valid
    @Schema(name = "FeeFreeLengthPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeFreeLengthPeriod")
    public OBReadProduct2DataProductInnerOtherProductTypeProductDetailsFeeFreeLengthPeriod getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    public void setFeeFreeLengthPeriod(OBReadProduct2DataProductInnerOtherProductTypeProductDetailsFeeFreeLengthPeriod feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails monthlyMaximumCharge(String monthlyMaximumCharge) {
        this.monthlyMaximumCharge = monthlyMaximumCharge;
        return this;
    }

    /**
     * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
     *
     * @return monthlyMaximumCharge
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "MonthlyMaximumCharge", description = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MonthlyMaximumCharge")
    public String getMonthlyMaximumCharge() {
        return monthlyMaximumCharge;
    }

    public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
        this.monthlyMaximumCharge = monthlyMaximumCharge;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails addNotesItem(String notesItem) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeProductDetails otherSegment(OBOtherCodeType10 otherSegment) {
        this.otherSegment = otherSegment;
        return this;
    }

    /**
     * Get otherSegment
     *
     * @return otherSegment
     */
    @Valid
    @Schema(name = "OtherSegment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherSegment")
    public OBOtherCodeType10 getOtherSegment() {
        return otherSegment;
    }

    public void setOtherSegment(OBOtherCodeType10 otherSegment) {
        this.otherSegment = otherSegment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeProductDetails obReadProduct2DataProductInnerOtherProductTypeProductDetails = (OBReadProduct2DataProductInnerOtherProductTypeProductDetails) o;
        return Objects.equals(this.segment, obReadProduct2DataProductInnerOtherProductTypeProductDetails.segment) &&
                Objects.equals(this.feeFreeLength, obReadProduct2DataProductInnerOtherProductTypeProductDetails.feeFreeLength) &&
                Objects.equals(this.feeFreeLengthPeriod, obReadProduct2DataProductInnerOtherProductTypeProductDetails.feeFreeLengthPeriod) &&
                Objects.equals(this.monthlyMaximumCharge, obReadProduct2DataProductInnerOtherProductTypeProductDetails.monthlyMaximumCharge) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeProductDetails.notes) &&
                Objects.equals(this.otherSegment, obReadProduct2DataProductInnerOtherProductTypeProductDetails.otherSegment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, monthlyMaximumCharge, notes, otherSegment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeProductDetails {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
        sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
        sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
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

