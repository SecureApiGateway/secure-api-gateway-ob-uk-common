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

import java.util.ArrayList;
import java.util.List;
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
 * OBDomesticVRPDetailsData
 */

@JsonTypeName("OBDomesticVRPDetails_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPDetailsData {

    private String paymentTransactionId;

    private OBDomesticVRPDetailsDataStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private String localInstrument;

    @Valid
    private List<@Valid OBDomesticVRPDetailsDataStausDetailInner> stausDetail;

    public OBDomesticVRPDetailsData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPDetailsData(String paymentTransactionId, OBDomesticVRPDetailsDataStatus status, DateTime statusUpdateDateTime) {
        this.paymentTransactionId = paymentTransactionId;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBDomesticVRPDetailsData paymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
        return this;
    }

    /**
     * Unique identifier for the transaction within an servicing       institution. This identifier is both unique and immutable.
     *
     * @return paymentTransactionId
     */
    @NotNull
    @Size(min = 1, max = 210)
    @Schema(name = "PaymentTransactionId", description = "Unique identifier for the transaction within an servicing       institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PaymentTransactionId")
    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public OBDomesticVRPDetailsData status(OBDomesticVRPDetailsDataStatus status) {
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
    public OBDomesticVRPDetailsDataStatus getStatus() {
        return status;
    }

    public void setStatus(OBDomesticVRPDetailsDataStatus status) {
        this.status = status;
    }

    public OBDomesticVRPDetailsData statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the status was assigned to the       transfer.
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the status was assigned to the       transfer. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBDomesticVRPDetailsData localInstrument(String localInstrument) {
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

    public OBDomesticVRPDetailsData stausDetail(List<@Valid OBDomesticVRPDetailsDataStausDetailInner> stausDetail) {
        this.stausDetail = stausDetail;
        return this;
    }

    public OBDomesticVRPDetailsData addStausDetailItem(OBDomesticVRPDetailsDataStausDetailInner stausDetailItem) {
        if (this.stausDetail == null) {
            this.stausDetail = new ArrayList<>();
        }
        this.stausDetail.add(stausDetailItem);
        return this;
    }

    /**
     * Get stausDetail
     *
     * @return stausDetail
     */
    @Valid
    @Schema(name = "StausDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StausDetail")
    public List<@Valid OBDomesticVRPDetailsDataStausDetailInner> getStausDetail() {
        return stausDetail;
    }

    public void setStausDetail(List<@Valid OBDomesticVRPDetailsDataStausDetailInner> stausDetail) {
        this.stausDetail = stausDetail;
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
        return Objects.equals(this.paymentTransactionId, obDomesticVRPDetailsData.paymentTransactionId) &&
                Objects.equals(this.status, obDomesticVRPDetailsData.status) &&
                Objects.equals(this.statusUpdateDateTime, obDomesticVRPDetailsData.statusUpdateDateTime) &&
                Objects.equals(this.localInstrument, obDomesticVRPDetailsData.localInstrument) &&
                Objects.equals(this.stausDetail, obDomesticVRPDetailsData.stausDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentTransactionId, status, statusUpdateDateTime, localInstrument, stausDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPDetailsData {\n");
        sb.append("    paymentTransactionId: ").append(toIndentedString(paymentTransactionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    stausDetail: ").append(toIndentedString(stausDetail)).append("\n");
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

