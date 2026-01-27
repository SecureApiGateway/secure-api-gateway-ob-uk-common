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
 * OBDomesticVRPDetailsDataStausDetailInner
 */

@JsonTypeName("OBDomesticVRPDetails_Data_StausDetail_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPDetailsDataStausDetailInner {

    private OBDomesticVRPDetailsDataStausDetailInnerStatus status;

    private String statusReasonCode;

    private String statusReasonDescription;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    public OBDomesticVRPDetailsDataStausDetailInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPDetailsDataStausDetailInner(OBDomesticVRPDetailsDataStausDetailInnerStatus status) {
        this.status = status;
    }

    public OBDomesticVRPDetailsDataStausDetailInner status(OBDomesticVRPDetailsDataStausDetailInnerStatus status) {
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
    public OBDomesticVRPDetailsDataStausDetailInnerStatus getStatus() {
        return status;
    }

    public void setStatus(OBDomesticVRPDetailsDataStausDetailInnerStatus status) {
        this.status = status;
    }

    public OBDomesticVRPDetailsDataStausDetailInner statusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
        return this;
    }

    /**
     * Reason Code provided for the status of a transfer. For a full description see `OBExternalStatusReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return statusReasonCode
     */
    @Size(min = 1, max = 4)
    @Schema(name = "StatusReasonCode", description = "Reason Code provided for the status of a transfer. For a full description see `OBExternalStatusReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonCode")
    public String getStatusReasonCode() {
        return statusReasonCode;
    }

    public void setStatusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    public OBDomesticVRPDetailsDataStausDetailInner statusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
        return this;
    }

    /**
     * Reason provided for the status of a transfer.
     *
     * @return statusReasonDescription
     */
    @Size(min = 1, max = 500)
    @Schema(name = "StatusReasonDescription", description = "Reason provided for the status of a transfer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonDescription")
    public String getStatusReasonDescription() {
        return statusReasonDescription;
    }

    public void setStatusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
    }

    public OBDomesticVRPDetailsDataStausDetailInner statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the status was assigned to the transfer.
     *
     * @return statusUpdateDateTime
     */
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the status was assigned to the transfer. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPDetailsDataStausDetailInner obDomesticVRPDetailsDataStausDetailInner = (OBDomesticVRPDetailsDataStausDetailInner) o;
        return Objects.equals(this.status, obDomesticVRPDetailsDataStausDetailInner.status) &&
                Objects.equals(this.statusReasonCode, obDomesticVRPDetailsDataStausDetailInner.statusReasonCode) &&
                Objects.equals(this.statusReasonDescription, obDomesticVRPDetailsDataStausDetailInner.statusReasonDescription) &&
                Objects.equals(this.statusUpdateDateTime, obDomesticVRPDetailsDataStausDetailInner.statusUpdateDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusReasonCode, statusReasonDescription, statusUpdateDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPDetailsDataStausDetailInner {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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

