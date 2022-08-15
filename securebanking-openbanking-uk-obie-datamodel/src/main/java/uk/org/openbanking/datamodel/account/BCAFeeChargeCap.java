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
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class BCAFeeChargeCap {
    @JsonProperty("FeeType")
    private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();
    @JsonProperty("MinMaxType")
    private MinMaxTypeEnum minMaxType = null;
    @JsonProperty("FeeCapOccurrence")
    private Float feeCapOccurrence = null;
    @JsonProperty("FeeCapAmount")
    private String feeCapAmount = null;
    @JsonProperty("CappingPeriod")
    private CappingPeriodEnum cappingPeriod = null;
    @JsonProperty("Notes")
    private List<String> notes = null;
    @JsonProperty("OtherFeeType")
    private List<OverdraftOtherFeeType> otherFeeType = null;

    public BCAFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
        return this;
    }

    public BCAFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
        this.feeType.add(feeTypeItem);
        return this;
    }

    /**
     * Fee/charge type which is being capped
     *
     * @return feeType
     **/
    @NotNull
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
    public List<FeeTypeEnum> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
    }

    public BCAFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
        this.minMaxType = minMaxType;
        return this;
    }

    /**
     * Min Max type
     *
     * @return minMaxType
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Min Max type")
    public MinMaxTypeEnum getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(MinMaxTypeEnum minMaxType) {
        this.minMaxType = minMaxType;
    }

    public BCAFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapOccurrence
     **/
    @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    public Float getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public BCAFeeChargeCap feeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeCapAmount
     **/
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    public BCAFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
        return this;
    }

    /**
     * Period e.g. day, week, month etc. for which the fee/charge is capped
     *
     * @return cappingPeriod
     **/
    @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")
    public CappingPeriodEnum getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public BCAFeeChargeCap notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public BCAFeeChargeCap addNotesItem(String notesItem) {
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

    public BCAFeeChargeCap otherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public BCAFeeChargeCap addOtherFeeTypeItem(OverdraftOtherFeeType otherFeeTypeItem) {
        if (this.otherFeeType == null) {
            this.otherFeeType = new ArrayList<OverdraftOtherFeeType>();
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
    public List<OverdraftOtherFeeType> getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
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
        BCAFeeChargeCap bcAFeeChargeCap = (BCAFeeChargeCap) o;
        return Objects.equals(this.feeType, bcAFeeChargeCap.feeType) &&
                Objects.equals(this.minMaxType, bcAFeeChargeCap.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, bcAFeeChargeCap.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, bcAFeeChargeCap.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, bcAFeeChargeCap.cappingPeriod) &&
                Objects.equals(this.notes, bcAFeeChargeCap.notes) &&
                Objects.equals(this.otherFeeType, bcAFeeChargeCap.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BCAFeeChargeCap {\n");

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

    /**
     * Fee/charge type which is being capped
     */
    public enum FeeTypeEnum {
        OTHER("Other"),

        SERVICECACCOUNTFEE("ServiceCAccountFee"),

        SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),

        SERVICECACCOUNTFEEQUARTERLY("ServiceCAccountFeeQuarterly"),

        SERVICECFIXEDTARIFF("ServiceCFixedTariff"),

        SERVICECBUSIDEPACCBREAKAGE("ServiceCBusiDepAccBreakage"),

        SERVICECMINIMUMMONTHLYFEE("ServiceCMinimumMonthlyFee"),

        SERVICECOTHER("ServiceCOther");

        private String value;

        FeeTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static FeeTypeEnum fromValue(String text) {
            for (FeeTypeEnum b : FeeTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    /**
     * Min Max type
     */
    public enum MinMaxTypeEnum {
        MINIMUM("Minimum"),

        MAXIMUM("Maximum");

        private String value;

        MinMaxTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static MinMaxTypeEnum fromValue(String text) {
            for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Period e.g. day, week, month etc. for which the fee/charge is capped
     */
    public enum CappingPeriodEnum {
        DAY("Day"),

        HALF_YEAR("Half Year"),

        MONTH("Month"),

        QUARTER("Quarter"),

        WEEK("Week"),

        YEAR("Year");

        private String value;

        CappingPeriodEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CappingPeriodEnum fromValue(String text) {
            for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

