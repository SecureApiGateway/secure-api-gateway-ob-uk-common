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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

/**
 * OBWritePaymentDetails1PaymentStatusStatusDetail
 */

@JsonTypeName("OBWritePaymentDetails1_PaymentStatus_StatusDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWritePaymentDetails1PaymentStatusStatusDetail {

    private String status;

    private String statusReason;

    private String statusReasonDescription;

    private String localInstrument;

    public OBWritePaymentDetails1PaymentStatusStatusDetail status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Status of a transfer, as assigned by the transaction administrator.
     *
     * @return status
     */
    @Size(min = 1, max = 4)
    @Schema(name = "Status", description = "Status of a transfer, as assigned by the transaction administrator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OBWritePaymentDetails1PaymentStatusStatusDetail statusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Reason Code provided for the status of a transfer.
     *
     * @return statusReason
     */
    @Size(min = 1, max = 4)
    @Schema(name = "StatusReason", description = "Reason Code provided for the status of a transfer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReason")
    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public OBWritePaymentDetails1PaymentStatusStatusDetail statusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
        return this;
    }

    /**
     * Reason provided for the status of a transfer.
     *
     * @return statusReasonDescription
     */
    @Size(min = 1, max = 256)
    @Schema(name = "StatusReasonDescription", description = "Reason provided for the status of a transfer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonDescription")
    public String getStatusReasonDescription() {
        return statusReasonDescription;
    }

    public void setStatusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
    }

    public OBWritePaymentDetails1PaymentStatusStatusDetail localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
     *
     * @return localInstrument
     */

    @Schema(name = "LocalInstrument", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalInstrument")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWritePaymentDetails1PaymentStatusStatusDetail obWritePaymentDetails1PaymentStatusStatusDetail = (OBWritePaymentDetails1PaymentStatusStatusDetail) o;
        return Objects.equals(this.status, obWritePaymentDetails1PaymentStatusStatusDetail.status) &&
                Objects.equals(this.statusReason, obWritePaymentDetails1PaymentStatusStatusDetail.statusReason) &&
                Objects.equals(this.statusReasonDescription, obWritePaymentDetails1PaymentStatusStatusDetail.statusReasonDescription) &&
                Objects.equals(this.localInstrument, obWritePaymentDetails1PaymentStatusStatusDetail.localInstrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusReason, statusReasonDescription, localInstrument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetails1PaymentStatusStatusDetail {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
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

