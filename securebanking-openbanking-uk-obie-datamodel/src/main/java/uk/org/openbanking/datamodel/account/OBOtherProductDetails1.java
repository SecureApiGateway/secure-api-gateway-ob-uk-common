/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBOtherProductDetails1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBOtherProductDetails1 {
    @JsonProperty("Segment")
    private List<OBOtherProductSegment1Code> segment = null;

    @JsonProperty("FeeFreeLength")
    private Integer feeFreeLength = null;

    @JsonProperty("FeeFreeLengthPeriod")
    private OBPeriod1Code feeFreeLengthPeriod = null;

    @JsonProperty("MonthlyMaximumCharge")
    private Integer monthlyMaximumCharge = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherSegment")
    private OBOtherCodeType1 otherSegment = null;

    public OBOtherProductDetails1 segment(List<OBOtherProductSegment1Code> segment) {
        this.segment = segment;
        return this;
    }

    public OBOtherProductDetails1 addSegmentItem(OBOtherProductSegment1Code segmentItem) {
        if (this.segment == null) {
            this.segment = new ArrayList<OBOtherProductSegment1Code>();
        }
        this.segment.add(segmentItem);
        return this;
    }

    /**
     * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd
     *
     * @return segment
     **/
    @Valid
    @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd ")
    public List<OBOtherProductSegment1Code> getSegment() {
        return segment;
    }

    public void setSegment(List<OBOtherProductSegment1Code> segment) {
        this.segment = segment;
    }

    public OBOtherProductDetails1 feeFreeLength(Integer feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
        return this;
    }

    /**
     * The length/duration of the fee free period
     *
     * @return feeFreeLength
     **/
    @ApiModelProperty(value = "The length/duration of the fee free period")
    public Integer getFeeFreeLength() {
        return feeFreeLength;
    }

    public void setFeeFreeLength(Integer feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
    }

    public OBOtherProductDetails1 feeFreeLengthPeriod(OBPeriod1Code feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
        return this;
    }

    /**
     * Get feeFreeLengthPeriod
     *
     * @return feeFreeLengthPeriod
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBPeriod1Code getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    public void setFeeFreeLengthPeriod(OBPeriod1Code feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    }

    public OBOtherProductDetails1 monthlyMaximumCharge(Integer monthlyMaximumCharge) {
        this.monthlyMaximumCharge = monthlyMaximumCharge;
        return this;
    }

    /**
     * The length/duration of the fee free period
     *
     * @return monthlyMaximumCharge
     **/
    @ApiModelProperty(value = "The length/duration of the fee free period")
    public Integer getMonthlyMaximumCharge() {
        return monthlyMaximumCharge;
    }

    public void setMonthlyMaximumCharge(Integer monthlyMaximumCharge) {
        this.monthlyMaximumCharge = monthlyMaximumCharge;
    }

    public OBOtherProductDetails1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBOtherProductDetails1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Core product details
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBOtherProductDetails1 otherSegment(OBOtherCodeType1 otherSegment) {
        this.otherSegment = otherSegment;
        return this;
    }

    /**
     * Get otherSegment
     *
     * @return otherSegment
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherSegment() {
        return otherSegment;
    }

    public void setOtherSegment(OBOtherCodeType1 otherSegment) {
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
        OBOtherProductDetails1 obOtherProductDetails1 = (OBOtherProductDetails1) o;
        return Objects.equals(this.segment, obOtherProductDetails1.segment) &&
                Objects.equals(this.feeFreeLength, obOtherProductDetails1.feeFreeLength) &&
                Objects.equals(this.feeFreeLengthPeriod, obOtherProductDetails1.feeFreeLengthPeriod) &&
                Objects.equals(this.monthlyMaximumCharge, obOtherProductDetails1.monthlyMaximumCharge) &&
                Objects.equals(this.notes, obOtherProductDetails1.notes) &&
                Objects.equals(this.otherSegment, obOtherProductDetails1.otherSegment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, monthlyMaximumCharge, notes, otherSegment);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBOtherProductDetails1 {\n");

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

