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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner_LoanInterestTierBand_inner_LoanInterestFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner_LoanInterestTierBand_inner_LoanInterestFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner {

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail = new ArrayList<>();

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap;

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeeChargeDetail(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner addLoanInterestFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner loanInterestFeeChargeDetailItem) {
        if (this.loanInterestFeeChargeDetail == null) {
            this.loanInterestFeeChargeDetail = new ArrayList<>();
        }
        this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
        return this;
    }

    /**
     * Get loanInterestFeeChargeDetail
     *
     * @return loanInterestFeeChargeDetail
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "LoanInterestFeeChargeDetail", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("LoanInterestFeeChargeDetail")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> getLoanInterestFeeChargeDetail() {
        return loanInterestFeeChargeDetail;
    }

    public void setLoanInterestFeeChargeDetail(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeeChargeCap(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner addLoanInterestFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner loanInterestFeeChargeCapItem) {
        if (this.loanInterestFeeChargeCap == null) {
            this.loanInterestFeeChargeCap = new ArrayList<>();
        }
        this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
        return this;
    }

    /**
     * Get loanInterestFeeChargeCap
     *
     * @return loanInterestFeeChargeCap
     */
    @Valid
    @Schema(name = "LoanInterestFeeChargeCap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LoanInterestFeeChargeCap")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> getLoanInterestFeeChargeCap() {
        return loanInterestFeeChargeCap;
    }

    public void setLoanInterestFeeChargeCap(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner) o;
        return Objects.equals(this.loanInterestFeeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.loanInterestFeeChargeDetail) &&
                Objects.equals(this.loanInterestFeeChargeCap, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.loanInterestFeeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanInterestFeeChargeDetail, loanInterestFeeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner {\n");
        sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
        sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
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

