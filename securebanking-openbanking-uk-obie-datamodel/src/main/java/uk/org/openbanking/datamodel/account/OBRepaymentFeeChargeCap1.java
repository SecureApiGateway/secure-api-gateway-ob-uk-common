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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
 */
@ApiModel(description = "RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBRepaymentFeeChargeCap1 {
    @JsonProperty("FeeType")
    private List<OBFeeType1Code> feeType = new ArrayList<OBFeeType1Code>();

    @JsonProperty("MinMaxType")
    private OBMinMaxType1Code minMaxType = null;

    @JsonProperty("FeeCapOccurrence")
    private Integer feeCapOccurrence = null;

    @JsonProperty("FeeCapAmount")
    private Integer feeCapAmount = null;

    @JsonProperty("CappingPeriod")
    private OBPeriod1Code cappingPeriod = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherFeeType")
    private List<OBOtherCodeType1> otherFeeType = null;

    public OBRepaymentFeeChargeCap1 feeType(List<OBFeeType1Code> feeType) {
        this.feeType = feeType;
        return this;
    }

    public OBRepaymentFeeChargeCap1 addFeeTypeItem(OBFeeType1Code feeTypeItem) {
        this.feeType.add(feeTypeItem);
        return this;
    }

    /**
     * Fee/charge type which is being capped
     *
     * @return feeType
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
    public List<OBFeeType1Code> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<OBFeeType1Code> feeType) {
        this.feeType = feeType;
    }

    public OBRepaymentFeeChargeCap1 minMaxType(OBMinMaxType1Code minMaxType) {
        this.minMaxType = minMaxType;
        return this;
    }

    /**
     * Get minMaxType
     *
     * @return minMaxType
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBMinMaxType1Code getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(OBMinMaxType1Code minMaxType) {
        this.minMaxType = minMaxType;
    }

    public OBRepaymentFeeChargeCap1 feeCapOccurrence(Integer feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapOccurrence
     **/
    @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    public Integer getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Integer feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public OBRepaymentFeeChargeCap1 feeCapAmount(Integer feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapAmount
     **/
    @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    public Integer getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(Integer feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    public OBRepaymentFeeChargeCap1 cappingPeriod(OBPeriod1Code cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
        return this;
    }

    /**
     * Get cappingPeriod
     *
     * @return cappingPeriod
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBPeriod1Code getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(OBPeriod1Code cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public OBRepaymentFeeChargeCap1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBRepaymentFeeChargeCap1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for adding  extra details for fee charge cap
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBRepaymentFeeChargeCap1 otherFeeType(List<OBOtherCodeType1> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public OBRepaymentFeeChargeCap1 addOtherFeeTypeItem(OBOtherCodeType1 otherFeeTypeItem) {
        if (this.otherFeeType == null) {
            this.otherFeeType = new ArrayList<OBOtherCodeType1>();
        }
        this.otherFeeType.add(otherFeeTypeItem);
        return this;
    }

    /**
     * Other fee type code which is not available in the standard code set
     *
     * @return otherFeeType
     **/
    @Valid
    @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")
    public List<OBOtherCodeType1> getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(List<OBOtherCodeType1> otherFeeType) {
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
        OBRepaymentFeeChargeCap1 obRepaymentFeeChargeCap1 = (OBRepaymentFeeChargeCap1) o;
        return Objects.equals(this.feeType, obRepaymentFeeChargeCap1.feeType) &&
                Objects.equals(this.minMaxType, obRepaymentFeeChargeCap1.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, obRepaymentFeeChargeCap1.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, obRepaymentFeeChargeCap1.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, obRepaymentFeeChargeCap1.cappingPeriod) &&
                Objects.equals(this.notes, obRepaymentFeeChargeCap1.notes) &&
                Objects.equals(this.otherFeeType, obRepaymentFeeChargeCap1.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRepaymentFeeChargeCap1 {\n");

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

