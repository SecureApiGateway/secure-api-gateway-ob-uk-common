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
package uk.org.openbanking.datamodel.fund;

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
 * Payment status details.
 */

@Schema(name = "OBWritePaymentDetailsResponse1_Data_PaymentStatus_inner", description = "Payment status details.")
@JsonTypeName("OBWritePaymentDetailsResponse1_Data_PaymentStatus_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWritePaymentDetailsResponse1DataPaymentStatusInner {

    private String paymentTransactionId;

    private OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail statusDetail;

    public OBWritePaymentDetailsResponse1DataPaymentStatusInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWritePaymentDetailsResponse1DataPaymentStatusInner(String paymentTransactionId, OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus status, DateTime statusUpdateDateTime) {
        this.paymentTransactionId = paymentTransactionId;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWritePaymentDetailsResponse1DataPaymentStatusInner paymentTransactionId(String paymentTransactionId) {
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

    public OBWritePaymentDetailsResponse1DataPaymentStatusInner status(OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus status) {
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
    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus getStatus() {
        return status;
    }

    public void setStatus(OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatus status) {
        this.status = status;
    }

    public OBWritePaymentDetailsResponse1DataPaymentStatusInner statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWritePaymentDetailsResponse1DataPaymentStatusInner statusDetail(OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail statusDetail) {
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
    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail statusDetail) {
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
        OBWritePaymentDetailsResponse1DataPaymentStatusInner obWritePaymentDetailsResponse1DataPaymentStatusInner = (OBWritePaymentDetailsResponse1DataPaymentStatusInner) o;
        return Objects.equals(this.paymentTransactionId, obWritePaymentDetailsResponse1DataPaymentStatusInner.paymentTransactionId) &&
                Objects.equals(this.status, obWritePaymentDetailsResponse1DataPaymentStatusInner.status) &&
                Objects.equals(this.statusUpdateDateTime, obWritePaymentDetailsResponse1DataPaymentStatusInner.statusUpdateDateTime) &&
                Objects.equals(this.statusDetail, obWritePaymentDetailsResponse1DataPaymentStatusInner.statusDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentTransactionId, status, statusUpdateDateTime, statusDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetailsResponse1DataPaymentStatusInner {\n");
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

