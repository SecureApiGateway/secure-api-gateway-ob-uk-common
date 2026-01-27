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
import uk.org.openbanking.datamodel.v4.common.OBStatusReason;

/**
 * OBWriteInternationalStandingOrderResponse7Data
 */

@JsonTypeName("OBWriteInternationalStandingOrderResponse7_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalStandingOrderResponse7Data {

    private String internationalStandingOrderId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBWriteInternationalStandingOrderResponse7DataStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @Valid
    private List<@Valid OBStatusReason> statusReason;

    private OBWriteInternationalStandingOrderResponse7DataRefund refund;

    @Valid
    private List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges;

    private OBWriteInternationalStandingOrder4DataInitiation initiation;

    private OBWriteDomesticScheduledResponse5DataMultiAuthorisation multiAuthorisation;

    private OBCashAccountDebtor4 debtor;

    public OBWriteInternationalStandingOrderResponse7Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalStandingOrderResponse7Data(String internationalStandingOrderId, String consentId, DateTime creationDateTime, OBWriteInternationalStandingOrderResponse7DataStatus status, DateTime statusUpdateDateTime, OBWriteInternationalStandingOrder4DataInitiation initiation) {
        this.internationalStandingOrderId = internationalStandingOrderId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.initiation = initiation;
    }

    public OBWriteInternationalStandingOrderResponse7Data internationalStandingOrderId(String internationalStandingOrderId) {
        this.internationalStandingOrderId = internationalStandingOrderId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.
     *
     * @return internationalStandingOrderId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "InternationalStandingOrderId", description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("InternationalStandingOrderId")
    public String getInternationalStandingOrderId() {
        return internationalStandingOrderId;
    }

    public void setInternationalStandingOrderId(String internationalStandingOrderId) {
        this.internationalStandingOrderId = internationalStandingOrderId;
    }

    public OBWriteInternationalStandingOrderResponse7Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternationalStandingOrderResponse7Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalStandingOrderResponse7Data status(OBWriteInternationalStandingOrderResponse7DataStatus status) {
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
    public OBWriteInternationalStandingOrderResponse7DataStatus getStatus() {
        return status;
    }

    public void setStatus(OBWriteInternationalStandingOrderResponse7DataStatus status) {
        this.status = status;
    }

    public OBWriteInternationalStandingOrderResponse7Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteInternationalStandingOrderResponse7Data statusReason(List<@Valid OBStatusReason> statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    public OBWriteInternationalStandingOrderResponse7Data addStatusReasonItem(OBStatusReason statusReasonItem) {
        if (this.statusReason == null) {
            this.statusReason = new ArrayList<>();
        }
        this.statusReason.add(statusReasonItem);
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
    public List<@Valid OBStatusReason> getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(List<@Valid OBStatusReason> statusReason) {
        this.statusReason = statusReason;
    }

    public OBWriteInternationalStandingOrderResponse7Data refund(OBWriteInternationalStandingOrderResponse7DataRefund refund) {
        this.refund = refund;
        return this;
    }

    /**
     * Get refund
     *
     * @return refund
     */
    @Valid
    @Schema(name = "Refund", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Refund")
    public OBWriteInternationalStandingOrderResponse7DataRefund getRefund() {
        return refund;
    }

    public void setRefund(OBWriteInternationalStandingOrderResponse7DataRefund refund) {
        this.refund = refund;
    }

    public OBWriteInternationalStandingOrderResponse7Data charges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalStandingOrderResponse7Data addChargesItem(OBWriteDomesticConsentResponse5DataChargesInner chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     */
    @Valid
    @Schema(name = "Charges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Charges")
    public List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> getCharges() {
        return charges;
    }

    public void setCharges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
    }

    public OBWriteInternationalStandingOrderResponse7Data initiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     */
    @NotNull
    @Valid
    @Schema(name = "Initiation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Initiation")
    public OBWriteInternationalStandingOrder4DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalStandingOrderResponse7Data multiAuthorisation(OBWriteDomesticScheduledResponse5DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
        return this;
    }

    /**
     * Get multiAuthorisation
     *
     * @return multiAuthorisation
     */
    @Valid
    @Schema(name = "MultiAuthorisation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MultiAuthorisation")
    public OBWriteDomesticScheduledResponse5DataMultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBWriteDomesticScheduledResponse5DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
    }

    public OBWriteInternationalStandingOrderResponse7Data debtor(OBCashAccountDebtor4 debtor) {
        this.debtor = debtor;
        return this;
    }

    /**
     * Get debtor
     *
     * @return debtor
     */
    @Valid
    @Schema(name = "Debtor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Debtor")
    public OBCashAccountDebtor4 getDebtor() {
        return debtor;
    }

    public void setDebtor(OBCashAccountDebtor4 debtor) {
        this.debtor = debtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrderResponse7Data obWriteInternationalStandingOrderResponse7Data = (OBWriteInternationalStandingOrderResponse7Data) o;
        return Objects.equals(this.internationalStandingOrderId, obWriteInternationalStandingOrderResponse7Data.internationalStandingOrderId) &&
                Objects.equals(this.consentId, obWriteInternationalStandingOrderResponse7Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteInternationalStandingOrderResponse7Data.creationDateTime) &&
                Objects.equals(this.status, obWriteInternationalStandingOrderResponse7Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalStandingOrderResponse7Data.statusUpdateDateTime) &&
                Objects.equals(this.statusReason, obWriteInternationalStandingOrderResponse7Data.statusReason) &&
                Objects.equals(this.refund, obWriteInternationalStandingOrderResponse7Data.refund) &&
                Objects.equals(this.charges, obWriteInternationalStandingOrderResponse7Data.charges) &&
                Objects.equals(this.initiation, obWriteInternationalStandingOrderResponse7Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteInternationalStandingOrderResponse7Data.multiAuthorisation) &&
                Objects.equals(this.debtor, obWriteInternationalStandingOrderResponse7Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internationalStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, statusReason, refund, charges, initiation, multiAuthorisation, debtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrderResponse7Data {\n");
        sb.append("    internationalStandingOrderId: ").append(toIndentedString(internationalStandingOrderId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
        sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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

