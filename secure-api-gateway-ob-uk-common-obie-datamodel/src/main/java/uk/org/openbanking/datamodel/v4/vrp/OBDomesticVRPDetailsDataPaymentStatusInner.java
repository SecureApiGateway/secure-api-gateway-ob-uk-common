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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * OBDomesticVRPDetailsDataPaymentStatusInner
 */

@JsonTypeName("OBDomesticVRPDetails_Data_PaymentStatus_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPDetailsDataPaymentStatusInner {

    private String paymentTransactionId;

    private OBDomesticVRPDetailsDataPaymentStatusInnerStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail statusDetail;

    public OBDomesticVRPDetailsDataPaymentStatusInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPDetailsDataPaymentStatusInner(String paymentTransactionId, OBDomesticVRPDetailsDataPaymentStatusInnerStatus status, DateTime statusUpdateDateTime) {
        this.paymentTransactionId = paymentTransactionId;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBDomesticVRPDetailsDataPaymentStatusInner paymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
        return this;
    }

    /**
     * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
     *
     * @return paymentTransactionId
     */
    @NotNull
    @Size(min = 1, max = 210)
    @Schema(name = "PaymentTransactionId", description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PaymentTransactionId")
    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public OBDomesticVRPDetailsDataPaymentStatusInner status(OBDomesticVRPDetailsDataPaymentStatusInnerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @NotNull
    @Valid
    @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Status")
    public OBDomesticVRPDetailsDataPaymentStatusInnerStatus getStatus() {
        return status;
    }

    public void setStatus(OBDomesticVRPDetailsDataPaymentStatusInnerStatus status) {
        this.status = status;
    }

    public OBDomesticVRPDetailsDataPaymentStatusInner statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the status was assigned to the transfer.
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the status was assigned to the transfer. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBDomesticVRPDetailsDataPaymentStatusInner statusDetail(OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * Get statusDetail
     *
     * @return statusDetail
     */
    @Valid
    @Schema(name = "StatusDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusDetail")
    public OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPDetailsDataPaymentStatusInner obDomesticVRPDetailsDataPaymentStatusInner = (OBDomesticVRPDetailsDataPaymentStatusInner) o;
        return Objects.equals(this.paymentTransactionId, obDomesticVRPDetailsDataPaymentStatusInner.paymentTransactionId) &&
                Objects.equals(this.status, obDomesticVRPDetailsDataPaymentStatusInner.status) &&
                Objects.equals(this.statusUpdateDateTime, obDomesticVRPDetailsDataPaymentStatusInner.statusUpdateDateTime) &&
                Objects.equals(this.statusDetail, obDomesticVRPDetailsDataPaymentStatusInner.statusDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentTransactionId, status, statusUpdateDateTime, statusDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPDetailsDataPaymentStatusInner {\n");
        sb.append("    paymentTransactionId: ").append(toIndentedString(paymentTransactionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
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

