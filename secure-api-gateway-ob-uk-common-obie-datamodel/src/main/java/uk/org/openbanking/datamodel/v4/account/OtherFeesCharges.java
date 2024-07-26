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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */

@Schema(name = "OtherFeesCharges", description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OtherFeesCharges {

    @Valid
    private List<@Valid FeeChargeDetailInner1> feeChargeDetail = new ArrayList<>();

    @Valid
    private List<@Valid FeeChargeCapInner1> feeChargeCap;

    public OtherFeesCharges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OtherFeesCharges(List<@Valid FeeChargeDetailInner1> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
    }

    public OtherFeesCharges feeChargeDetail(List<@Valid FeeChargeDetailInner1> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
        return this;
    }

    public OtherFeesCharges addFeeChargeDetailItem(FeeChargeDetailInner1 feeChargeDetailItem) {
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
    public List<@Valid FeeChargeDetailInner1> getFeeChargeDetail() {
        return feeChargeDetail;
    }

    public void setFeeChargeDetail(List<@Valid FeeChargeDetailInner1> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
    }

    public OtherFeesCharges feeChargeCap(List<@Valid FeeChargeCapInner1> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
        return this;
    }

    public OtherFeesCharges addFeeChargeCapItem(FeeChargeCapInner1 feeChargeCapItem) {
        if (this.feeChargeCap == null) {
            this.feeChargeCap = new ArrayList<>();
        }
        this.feeChargeCap.add(feeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge
     *
     * @return feeChargeCap
     */
    @Valid
    @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FeeChargeCap")
    public List<@Valid FeeChargeCapInner1> getFeeChargeCap() {
        return feeChargeCap;
    }

    public void setFeeChargeCap(List<@Valid FeeChargeCapInner1> feeChargeCap) {
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
        OtherFeesCharges otherFeesCharges = (OtherFeesCharges) o;
        return Objects.equals(this.feeChargeDetail, otherFeesCharges.feeChargeDetail) &&
                Objects.equals(this.feeChargeCap, otherFeesCharges.feeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeChargeDetail, feeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeesCharges {\n");
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

