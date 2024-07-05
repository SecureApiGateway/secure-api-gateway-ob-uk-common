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
package uk.org.openbanking.datamodel.v3.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Payment status details as per underlying Payment Rail.
 */

@Schema(name = "OBWritePaymentDetailsResponse1_Data_PaymentStatus_inner_StatusDetail", description = "Payment status details as per underlying Payment Rail.")
@JsonTypeName("OBWritePaymentDetailsResponse1_Data_PaymentStatus_inner_StatusDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail {

    private String localInstrument;

    private String status;

    private OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetailStatusReason statusReason;

    private String statusReasonDescription;

    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail(String status) {
        this.status = status;
    }

    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail localInstrument(String localInstrument) {
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

    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Status of a transfer, as assigned by the transaction administrator.
     *
     * @return status
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "Status", description = "Status of a transfer, as assigned by the transaction administrator.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail statusReason(OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetailStatusReason statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Get statusReason
     *
     * @return statusReason
     */
    @Valid
    @Schema(name = "StatusReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReason")
    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetailStatusReason getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetailStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    public OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail statusReasonDescription(String statusReasonDescription) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail obWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail = (OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail) o;
        return Objects.equals(this.localInstrument, obWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail.localInstrument) &&
                Objects.equals(this.status, obWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail.status) &&
                Objects.equals(this.statusReason, obWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail.statusReason) &&
                Objects.equals(this.statusReasonDescription, obWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail.statusReasonDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localInstrument, status, statusReason, statusReasonDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetailsResponse1DataPaymentStatusInnerStatusDetail {\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
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

