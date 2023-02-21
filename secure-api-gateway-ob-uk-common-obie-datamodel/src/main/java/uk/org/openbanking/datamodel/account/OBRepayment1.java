/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Repayment details of the Loan product
 */
@ApiModel(description = "Repayment details of the Loan product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBRepayment1 {
    @JsonProperty("RepaymentType")
    private OBRepaymentType1Code repaymentType = null;

    @JsonProperty("RepaymentFrequency")
    private OBRepaymentFrequency1Code repaymentFrequency = null;

    @JsonProperty("AmountType")
    private OBRepaymentAmountType1Code amountType = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherRepaymentType")
    private OBOtherCodeType1 otherRepaymentType = null;

    @JsonProperty("OtherRepaymentFrequency")
    private OBOtherCodeType1 otherRepaymentFrequency = null;

    @JsonProperty("OtherAmountType")
    private OBOtherCodeType1 otherAmountType = null;

    @JsonProperty("RepaymentFeeCharges")
    private OBRepaymentFeeCharges1 repaymentFeeCharges = null;

    @JsonProperty("RepaymentHoliday")
    private List<OBRepaymentHoliday1> repaymentHoliday = null;

    public OBRepayment1 repaymentType(OBRepaymentType1Code repaymentType) {
        this.repaymentType = repaymentType;
        return this;
    }

    /**
     * Get repaymentType
     *
     * @return repaymentType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBRepaymentType1Code getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(OBRepaymentType1Code repaymentType) {
        this.repaymentType = repaymentType;
    }

    public OBRepayment1 repaymentFrequency(OBRepaymentFrequency1Code repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
        return this;
    }

    /**
     * Get repaymentFrequency
     *
     * @return repaymentFrequency
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBRepaymentFrequency1Code getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(OBRepaymentFrequency1Code repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    public OBRepayment1 amountType(OBRepaymentAmountType1Code amountType) {
        this.amountType = amountType;
        return this;
    }

    /**
     * Get amountType
     *
     * @return amountType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBRepaymentAmountType1Code getAmountType() {
        return amountType;
    }

    public void setAmountType(OBRepaymentAmountType1Code amountType) {
        this.amountType = amountType;
    }

    public OBRepayment1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBRepayment1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Repayment
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Repayment")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBRepayment1 otherRepaymentType(OBOtherCodeType1 otherRepaymentType) {
        this.otherRepaymentType = otherRepaymentType;
        return this;
    }

    /**
     * Get otherRepaymentType
     *
     * @return otherRepaymentType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherRepaymentType() {
        return otherRepaymentType;
    }

    public void setOtherRepaymentType(OBOtherCodeType1 otherRepaymentType) {
        this.otherRepaymentType = otherRepaymentType;
    }

    public OBRepayment1 otherRepaymentFrequency(OBOtherCodeType1 otherRepaymentFrequency) {
        this.otherRepaymentFrequency = otherRepaymentFrequency;
        return this;
    }

    /**
     * Get otherRepaymentFrequency
     *
     * @return otherRepaymentFrequency
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherRepaymentFrequency() {
        return otherRepaymentFrequency;
    }

    public void setOtherRepaymentFrequency(OBOtherCodeType1 otherRepaymentFrequency) {
        this.otherRepaymentFrequency = otherRepaymentFrequency;
    }

    public OBRepayment1 otherAmountType(OBOtherCodeType1 otherAmountType) {
        this.otherAmountType = otherAmountType;
        return this;
    }

    /**
     * Get otherAmountType
     *
     * @return otherAmountType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherAmountType() {
        return otherAmountType;
    }

    public void setOtherAmountType(OBOtherCodeType1 otherAmountType) {
        this.otherAmountType = otherAmountType;
    }

    public OBRepayment1 repaymentFeeCharges(OBRepaymentFeeCharges1 repaymentFeeCharges) {
        this.repaymentFeeCharges = repaymentFeeCharges;
        return this;
    }

    /**
     * Get repaymentFeeCharges
     *
     * @return repaymentFeeCharges
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBRepaymentFeeCharges1 getRepaymentFeeCharges() {
        return repaymentFeeCharges;
    }

    public void setRepaymentFeeCharges(OBRepaymentFeeCharges1 repaymentFeeCharges) {
        this.repaymentFeeCharges = repaymentFeeCharges;
    }

    public OBRepayment1 repaymentHoliday(List<OBRepaymentHoliday1> repaymentHoliday) {
        this.repaymentHoliday = repaymentHoliday;
        return this;
    }

    public OBRepayment1 addRepaymentHolidayItem(OBRepaymentHoliday1 repaymentHolidayItem) {
        if (this.repaymentHoliday == null) {
            this.repaymentHoliday = new ArrayList<OBRepaymentHoliday1>();
        }
        this.repaymentHoliday.add(repaymentHolidayItem);
        return this;
    }

    /**
     * Details of capital repayment holiday if any
     *
     * @return repaymentHoliday
     **/
    @Valid
    @ApiModelProperty(value = "Details of capital repayment holiday if any")
    public List<OBRepaymentHoliday1> getRepaymentHoliday() {
        return repaymentHoliday;
    }

    public void setRepaymentHoliday(List<OBRepaymentHoliday1> repaymentHoliday) {
        this.repaymentHoliday = repaymentHoliday;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRepayment1 obRepayment1 = (OBRepayment1) o;
        return Objects.equals(this.repaymentType, obRepayment1.repaymentType) &&
                Objects.equals(this.repaymentFrequency, obRepayment1.repaymentFrequency) &&
                Objects.equals(this.amountType, obRepayment1.amountType) &&
                Objects.equals(this.notes, obRepayment1.notes) &&
                Objects.equals(this.otherRepaymentType, obRepayment1.otherRepaymentType) &&
                Objects.equals(this.otherRepaymentFrequency, obRepayment1.otherRepaymentFrequency) &&
                Objects.equals(this.otherAmountType, obRepayment1.otherAmountType) &&
                Objects.equals(this.repaymentFeeCharges, obRepayment1.repaymentFeeCharges) &&
                Objects.equals(this.repaymentHoliday, obRepayment1.repaymentHoliday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repaymentType, repaymentFrequency, amountType, notes, otherRepaymentType, otherRepaymentFrequency, otherAmountType, repaymentFeeCharges, repaymentHoliday);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRepayment1 {\n");

        sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
        sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
        sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherRepaymentType: ").append(toIndentedString(otherRepaymentType)).append("\n");
        sb.append("    otherRepaymentFrequency: ").append(toIndentedString(otherRepaymentFrequency)).append("\n");
        sb.append("    otherAmountType: ").append(toIndentedString(otherAmountType)).append("\n");
        sb.append("    repaymentFeeCharges: ").append(toIndentedString(repaymentFeeCharges)).append("\n");
        sb.append("    repaymentHoliday: ").append(toIndentedString(repaymentHoliday)).append("\n");
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
