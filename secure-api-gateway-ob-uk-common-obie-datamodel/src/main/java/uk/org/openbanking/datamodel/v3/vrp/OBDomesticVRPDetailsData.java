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
package uk.org.openbanking.datamodel.v3.vrp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBDomesticVRPDetailsData
 */

@JsonTypeName("OBDomesticVRPDetails_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPDetailsData {

    @Valid
    private List<@Valid OBDomesticVRPDetailsDataPaymentStatusInner> paymentStatus;

    public OBDomesticVRPDetailsData paymentStatus(List<@Valid OBDomesticVRPDetailsDataPaymentStatusInner> paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public OBDomesticVRPDetailsData addPaymentStatusItem(OBDomesticVRPDetailsDataPaymentStatusInner paymentStatusItem) {
        if (this.paymentStatus == null) {
            this.paymentStatus = new ArrayList<>();
        }
        this.paymentStatus.add(paymentStatusItem);
        return this;
    }

    /**
     * Get paymentStatus
     *
     * @return paymentStatus
     */
    @Valid
    @Schema(name = "PaymentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PaymentStatus")
    public List<@Valid OBDomesticVRPDetailsDataPaymentStatusInner> getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(List<@Valid OBDomesticVRPDetailsDataPaymentStatusInner> paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPDetailsData obDomesticVRPDetailsData = (OBDomesticVRPDetailsData) o;
        return Objects.equals(this.paymentStatus, obDomesticVRPDetailsData.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPDetailsData {\n");
        sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

