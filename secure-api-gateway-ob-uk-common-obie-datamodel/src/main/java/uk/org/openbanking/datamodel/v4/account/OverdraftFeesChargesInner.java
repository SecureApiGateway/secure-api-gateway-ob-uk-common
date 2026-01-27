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
 * Overdraft fees and charges
 */

@Schema(name = "OverdraftFeesCharges_inner", description = "Overdraft fees and charges")
@JsonTypeName("OverdraftFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftFeesChargesInner {

    @Valid
    private List<@Valid OverdraftFeeChargeCapInner> overdraftFeeChargeCap;

    @Valid
    private List<@Valid OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail = new ArrayList<>();

    public OverdraftFeesChargesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OverdraftFeesChargesInner(List<@Valid OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    }

    public OverdraftFeesChargesInner overdraftFeeChargeCap(List<@Valid OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    public OverdraftFeesChargesInner addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapInner overdraftFeeChargeCapItem) {
        if (this.overdraftFeeChargeCap == null) {
            this.overdraftFeeChargeCap = new ArrayList<>();
        }
        this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
     *
     * @return overdraftFeeChargeCap
     */
    @Valid
    @Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftFeeChargeCap")
    public List<@Valid OverdraftFeeChargeCapInner> getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(List<@Valid OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    public OverdraftFeesChargesInner overdraftFeeChargeDetail(List<@Valid OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
        return this;
    }

    public OverdraftFeesChargesInner addOverdraftFeeChargeDetailItem(OverdraftFeeChargeDetailInner overdraftFeeChargeDetailItem) {
        if (this.overdraftFeeChargeDetail == null) {
            this.overdraftFeeChargeDetail = new ArrayList<>();
        }
        this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
        return this;
    }

    /**
     * Details about the fees/charges
     *
     * @return overdraftFeeChargeDetail
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "OverdraftFeeChargeDetail", description = "Details about the fees/charges", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("OverdraftFeeChargeDetail")
    public List<@Valid OverdraftFeeChargeDetailInner> getOverdraftFeeChargeDetail() {
        return overdraftFeeChargeDetail;
    }

    public void setOverdraftFeeChargeDetail(List<@Valid OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftFeesChargesInner overdraftFeesChargesInner = (OverdraftFeesChargesInner) o;
        return Objects.equals(this.overdraftFeeChargeCap, overdraftFeesChargesInner.overdraftFeeChargeCap) &&
                Objects.equals(this.overdraftFeeChargeDetail, overdraftFeesChargesInner.overdraftFeeChargeDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftFeesChargesInner {\n");
        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
        sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

