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
package uk.org.openbanking.datamodel.v4.payment;

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

@Schema(name = "OBWritePaymentDetails1_StatusDetail", description = "Payment status details as per underlying Payment Rail.")
@JsonTypeName("OBWritePaymentDetails1_StatusDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWritePaymentDetails1StatusDetail {

    private String localInstrument;

    private OBWritePaymentDetails1StatusDetailStatus status;

    private String statusReason;

    private String statusReasonDescription;

    public OBWritePaymentDetails1StatusDetail() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWritePaymentDetails1StatusDetail(OBWritePaymentDetails1StatusDetailStatus status) {
        this.status = status;
    }

    public OBWritePaymentDetails1StatusDetail localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return localInstrument
     */

    @Schema(name = "LocalInstrument", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalInstrument")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBWritePaymentDetails1StatusDetail status(OBWritePaymentDetails1StatusDetailStatus status) {
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
    public OBWritePaymentDetails1StatusDetailStatus getStatus() {
        return status;
    }

    public void setStatus(OBWritePaymentDetails1StatusDetailStatus status) {
        this.status = status;
    }

    public OBWritePaymentDetails1StatusDetail statusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Reason Code provided for the status of a transfer. For a full list of values see code values for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return statusReason
     */
    @Size(min = 1, max = 4)
    @Schema(name = "StatusReason", description = "Reason Code provided for the status of a transfer. For a full list of values see code values for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReason")
    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public OBWritePaymentDetails1StatusDetail statusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
        return this;
    }

    /**
     * Reason provided for the status of a transfer. For a full list of values see the code name entries for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
     *
     * @return statusReasonDescription
     */
    @Size(min = 1, max = 256)
    @Schema(name = "StatusReasonDescription", description = "Reason provided for the status of a transfer. For a full list of values see the code name entries for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        OBWritePaymentDetails1StatusDetail obWritePaymentDetails1StatusDetail = (OBWritePaymentDetails1StatusDetail) o;
        return Objects.equals(this.localInstrument, obWritePaymentDetails1StatusDetail.localInstrument) &&
                Objects.equals(this.status, obWritePaymentDetails1StatusDetail.status) &&
                Objects.equals(this.statusReason, obWritePaymentDetails1StatusDetail.statusReason) &&
                Objects.equals(this.statusReasonDescription, obWritePaymentDetails1StatusDetail.statusReasonDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localInstrument, status, statusReason, statusReasonDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetails1StatusDetail {\n");
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

