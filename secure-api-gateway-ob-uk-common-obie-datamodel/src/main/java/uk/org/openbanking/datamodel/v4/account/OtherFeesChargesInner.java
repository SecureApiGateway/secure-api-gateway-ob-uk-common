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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */

@Schema(name = "OtherFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@JsonTypeName("OtherFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OtherFeesChargesInner {

    private TariffType tariffType;

    private String tariffName;

    private OtherTariffType otherTariffType;

    @Valid
    private List<@Valid FeeChargeDetailInner> feeChargeDetail = new ArrayList<>();

    @Valid
    private List<@Valid FeeChargeCapInner> feeChargeCap;

    public OtherFeesChargesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OtherFeesChargesInner(List<@Valid FeeChargeDetailInner> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
    }

    public OtherFeesChargesInner tariffType(TariffType tariffType) {
        this.tariffType = tariffType;
        return this;
    }

    /**
     * Get tariffType
     *
     * @return tariffType
     */
    @Valid
    @Schema(name = "TariffType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TariffType")
    public TariffType getTariffType() {
        return tariffType;
    }

    public void setTariffType(TariffType tariffType) {
        this.tariffType = tariffType;
    }

    public OtherFeesChargesInner tariffName(String tariffName) {
        this.tariffName = tariffName;
        return this;
    }

    /**
     * Name of the tariff
     *
     * @return tariffName
     */
    @Size(min = 1, max = 350)
    @Schema(name = "TariffName", description = "Name of the tariff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TariffName")
    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public OtherFeesChargesInner otherTariffType(OtherTariffType otherTariffType) {
        this.otherTariffType = otherTariffType;
        return this;
    }

    /**
     * Get otherTariffType
     *
     * @return otherTariffType
     */
    @Valid
    @Schema(name = "OtherTariffType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherTariffType")
    public OtherTariffType getOtherTariffType() {
        return otherTariffType;
    }

    public void setOtherTariffType(OtherTariffType otherTariffType) {
        this.otherTariffType = otherTariffType;
    }

    public OtherFeesChargesInner feeChargeDetail(List<@Valid FeeChargeDetailInner> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
        return this;
    }

    public OtherFeesChargesInner addFeeChargeDetailItem(FeeChargeDetailInner feeChargeDetailItem) {
        if (this.feeChargeDetail == null) {
            this.feeChargeDetail = new ArrayList<>();
        }
        this.feeChargeDetail.add(feeChargeDetailItem);
        return this;
    }

    /**
     * Other fees/charges details
     *
     * @return feeChargeDetail
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "FeeChargeDetail", description = "Other fees/charges details", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FeeChargeDetail")
    public List<@Valid FeeChargeDetailInner> getFeeChargeDetail() {
        return feeChargeDetail;
    }

    public void setFeeChargeDetail(List<@Valid FeeChargeDetailInner> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
    }

    public OtherFeesChargesInner feeChargeCap(List<@Valid FeeChargeCapInner> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
        return this;
    }

    public OtherFeesChargesInner addFeeChargeCapItem(FeeChargeCapInner feeChargeCapItem) {
        if (this.feeChargeCap == null) {
            this.feeChargeCap = new ArrayList<>();
        }
        this.feeChargeCap.add(feeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
     *
     * @return feeChargeCap
     */
    @Valid
    @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeChargeCap")
    public List<@Valid FeeChargeCapInner> getFeeChargeCap() {
        return feeChargeCap;
    }

    public void setFeeChargeCap(List<@Valid FeeChargeCapInner> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtherFeesChargesInner otherFeesChargesInner = (OtherFeesChargesInner) o;
        return Objects.equals(this.tariffType, otherFeesChargesInner.tariffType) &&
                Objects.equals(this.tariffName, otherFeesChargesInner.tariffName) &&
                Objects.equals(this.otherTariffType, otherFeesChargesInner.otherTariffType) &&
                Objects.equals(this.feeChargeDetail, otherFeesChargesInner.feeChargeDetail) &&
                Objects.equals(this.feeChargeCap, otherFeesChargesInner.feeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeesChargesInner {\n");
        sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
        sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
        sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
        sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
        sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

