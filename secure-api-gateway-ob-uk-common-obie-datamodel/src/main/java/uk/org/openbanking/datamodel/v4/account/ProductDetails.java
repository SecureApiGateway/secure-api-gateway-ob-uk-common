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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * ProductDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ProductDetails {

    @Valid
    private List<@Valid SegmentInner> segment;

    private Float feeFreeLength;

    private FeeFreeLengthPeriod feeFreeLengthPeriod;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    public ProductDetails segment(List<@Valid SegmentInner> segment) {
        this.segment = segment;
        return this;
    }

    public ProductDetails addSegmentItem(SegmentInner segmentItem) {
        if (this.segment == null) {
            this.segment = new ArrayList<>();
        }
        this.segment.add(segmentItem);
        return this;
    }

    /**
     * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
     *
     * @return segment
     */
    @Valid
    @Schema(name = "Segment", description = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Segment")
    public List<@Valid SegmentInner> getSegment() {
        return segment;
    }

    public void setSegment(List<@Valid SegmentInner> segment) {
        this.segment = segment;
    }

    public ProductDetails feeFreeLength(Float feeFreeLength) {
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
    public Float getFeeFreeLength() {
        return feeFreeLength;
    }

    public void setFeeFreeLength(Float feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
    }

    public ProductDetails feeFreeLengthPeriod(FeeFreeLengthPeriod feeFreeLengthPeriod) {
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
    public FeeFreeLengthPeriod getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    public void setFeeFreeLengthPeriod(FeeFreeLengthPeriod feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    }

    public ProductDetails notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public ProductDetails addNotesItem(String notesItem) {
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
        ProductDetails productDetails = (ProductDetails) o;
        return Objects.equals(this.segment, productDetails.segment) &&
                Objects.equals(this.feeFreeLength, productDetails.feeFreeLength) &&
                Objects.equals(this.feeFreeLengthPeriod, productDetails.feeFreeLengthPeriod) &&
                Objects.equals(this.notes, productDetails.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductDetails {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
        sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
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

