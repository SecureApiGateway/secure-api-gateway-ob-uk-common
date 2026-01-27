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
package uk.org.openbanking.datamodel.v4.payment;

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
 * OBWritePaymentDetails1PaymentStatus
 */

@JsonTypeName("OBWritePaymentDetails1_PaymentStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWritePaymentDetails1PaymentStatus {

    private String paymentTransactionId;

    private OBWritePaymentDetails1PaymentStatusStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private OBWritePaymentDetails1PaymentStatusStatusDetail statusDetail;

    public OBWritePaymentDetails1PaymentStatus() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWritePaymentDetails1PaymentStatus(String paymentTransactionId, OBWritePaymentDetails1PaymentStatusStatus status, DateTime statusUpdateDateTime) {
        this.paymentTransactionId = paymentTransactionId;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWritePaymentDetails1PaymentStatus paymentTransactionId(String paymentTransactionId) {
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

    public OBWritePaymentDetails1PaymentStatus status(OBWritePaymentDetails1PaymentStatusStatus status) {
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
    public OBWritePaymentDetails1PaymentStatusStatus getStatus() {
        return status;
    }

    public void setStatus(OBWritePaymentDetails1PaymentStatusStatus status) {
        this.status = status;
    }

    public OBWritePaymentDetails1PaymentStatus statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBWritePaymentDetails1PaymentStatus statusDetail(OBWritePaymentDetails1PaymentStatusStatusDetail statusDetail) {
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
    public OBWritePaymentDetails1PaymentStatusStatusDetail getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(OBWritePaymentDetails1PaymentStatusStatusDetail statusDetail) {
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
        OBWritePaymentDetails1PaymentStatus obWritePaymentDetails1PaymentStatus = (OBWritePaymentDetails1PaymentStatus) o;
        return Objects.equals(this.paymentTransactionId, obWritePaymentDetails1PaymentStatus.paymentTransactionId) &&
                Objects.equals(this.status, obWritePaymentDetails1PaymentStatus.status) &&
                Objects.equals(this.statusUpdateDateTime, obWritePaymentDetails1PaymentStatus.statusUpdateDateTime) &&
                Objects.equals(this.statusDetail, obWritePaymentDetails1PaymentStatus.statusDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentTransactionId, status, statusUpdateDateTime, statusDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetails1PaymentStatus {\n");
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

