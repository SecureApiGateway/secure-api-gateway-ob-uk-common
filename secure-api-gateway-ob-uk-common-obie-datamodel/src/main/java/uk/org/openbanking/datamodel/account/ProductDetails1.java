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
 * ProductDetails1
 */

@JsonTypeName("ProductDetails_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ProductDetails1 {

    @Valid
    private List<@Valid SegmentInner1> segment;

    private String monthlyMaximumCharge;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    public ProductDetails1 segment(List<@Valid SegmentInner1> segment) {
        this.segment = segment;
        return this;
    }

    public ProductDetails1 addSegmentItem(SegmentInner1 segmentItem) {
        if (this.segment == null) {
            this.segment = new ArrayList<>();
        }
        this.segment.add(segmentItem);
        return this;
    }

    /**
     * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on.
     *
     * @return segment
     */
    @Valid
    @Schema(name = "Segment", description = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Segment")
    public List<@Valid SegmentInner1> getSegment() {
        return segment;
    }

    public void setSegment(List<@Valid SegmentInner1> segment) {
        this.segment = segment;
    }

    public ProductDetails1 monthlyMaximumCharge(String monthlyMaximumCharge) {
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

    public ProductDetails1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public ProductDetails1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Core product details
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Optional additional notes to supplement the Core product details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductDetails1 productDetails1 = (ProductDetails1) o;
        return Objects.equals(this.segment, productDetails1.segment) &&
                Objects.equals(this.monthlyMaximumCharge, productDetails1.monthlyMaximumCharge) &&
                Objects.equals(this.notes, productDetails1.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, monthlyMaximumCharge, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductDetails1 {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

