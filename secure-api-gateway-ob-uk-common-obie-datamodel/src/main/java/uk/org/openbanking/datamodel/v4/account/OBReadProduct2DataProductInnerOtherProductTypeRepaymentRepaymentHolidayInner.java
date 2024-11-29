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
import jakarta.validation.constraints.Size;

/**
 * Details of capital repayment holiday if any
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentHoliday_inner", description = "Details of capital repayment holiday if any")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_RepaymentHoliday_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner {

    private Integer maxHolidayLength;

    private OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInnerMaxHolidayPeriod maxHolidayPeriod;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner maxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
        return this;
    }

    /**
     * The maximum length/duration of a Repayment Holiday
     *
     * @return maxHolidayLength
     */

    @Schema(name = "MaxHolidayLength", description = "The maximum length/duration of a Repayment Holiday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MaxHolidayLength")
    public Integer getMaxHolidayLength() {
        return maxHolidayLength;
    }

    public void setMaxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner maxHolidayPeriod(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInnerMaxHolidayPeriod maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
        return this;
    }

    /**
     * Get maxHolidayPeriod
     *
     * @return maxHolidayPeriod
     */
    @Valid
    @Schema(name = "MaxHolidayPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MaxHolidayPeriod")
    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInnerMaxHolidayPeriod getMaxHolidayPeriod() {
        return maxHolidayPeriod;
    }

    public void setMaxHolidayPeriod(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInnerMaxHolidayPeriod maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner addNotesItem(String notesItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner) o;
        return Objects.equals(this.maxHolidayLength, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.maxHolidayLength) &&
                Objects.equals(this.maxHolidayPeriod, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.maxHolidayPeriod) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxHolidayLength, maxHolidayPeriod, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner {\n");
        sb.append("    maxHolidayLength: ").append(toIndentedString(maxHolidayLength)).append("\n");
        sb.append("    maxHolidayPeriod: ").append(toIndentedString(maxHolidayPeriod)).append("\n");
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

