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
 * OBWriteDomesticStandingOrderResponse6Data
 */

@JsonTypeName("OBWriteDomesticStandingOrderResponse6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrderResponse6Data {

    private String domesticStandingOrderId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBWriteDomesticScheduledResponse5DataStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private OBWriteDomesticResponse5DataRefund refund;

    @Valid
    private List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges;

    private OBWriteDomesticStandingOrderConsentResponse6DataInitiation initiation;

    private OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation;

    private OBCashAccountDebtor4 debtor;

    public OBWriteDomesticStandingOrderResponse6Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticStandingOrderResponse6Data(String domesticStandingOrderId, String consentId, DateTime creationDateTime, OBWriteDomesticScheduledResponse5DataStatus status, DateTime statusUpdateDateTime, OBWriteDomesticStandingOrderConsentResponse6DataInitiation initiation) {
        this.domesticStandingOrderId = domesticStandingOrderId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderResponse6Data domesticStandingOrderId(String domesticStandingOrderId) {
        this.domesticStandingOrderId = domesticStandingOrderId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.
     *
     * @return domesticStandingOrderId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "DomesticStandingOrderId", description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DomesticStandingOrderId")
    public String getDomesticStandingOrderId() {
        return domesticStandingOrderId;
    }

    public void setDomesticStandingOrderId(String domesticStandingOrderId) {
        this.domesticStandingOrderId = domesticStandingOrderId;
    }

    public OBWriteDomesticStandingOrderResponse6Data consentId(String consentId) {
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

    public OBWriteDomesticStandingOrderResponse6Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDomesticStandingOrderResponse6Data status(OBWriteDomesticScheduledResponse5DataStatus status) {
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
    public OBWriteDomesticScheduledResponse5DataStatus getStatus() {
        return status;
    }

    public void setStatus(OBWriteDomesticScheduledResponse5DataStatus status) {
        this.status = status;
    }

    public OBWriteDomesticStandingOrderResponse6Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDomesticStandingOrderResponse6Data refund(OBWriteDomesticResponse5DataRefund refund) {
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
    public OBWriteDomesticResponse5DataRefund getRefund() {
        return refund;
    }

    public void setRefund(OBWriteDomesticResponse5DataRefund refund) {
        this.refund = refund;
    }

    public OBWriteDomesticStandingOrderResponse6Data charges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDomesticStandingOrderResponse6Data addChargesItem(OBWriteDomesticConsentResponse5DataChargesInner chargesItem) {
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

    public OBWriteDomesticStandingOrderResponse6Data initiation(OBWriteDomesticStandingOrderConsentResponse6DataInitiation initiation) {
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
    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteDomesticStandingOrderConsentResponse6DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderResponse6Data multiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
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
    public OBWriteDomesticResponse5DataMultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
    }

    public OBWriteDomesticStandingOrderResponse6Data debtor(OBCashAccountDebtor4 debtor) {
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
        OBWriteDomesticStandingOrderResponse6Data obWriteDomesticStandingOrderResponse6Data = (OBWriteDomesticStandingOrderResponse6Data) o;
        return Objects.equals(this.domesticStandingOrderId, obWriteDomesticStandingOrderResponse6Data.domesticStandingOrderId) &&
                Objects.equals(this.consentId, obWriteDomesticStandingOrderResponse6Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDomesticStandingOrderResponse6Data.creationDateTime) &&
                Objects.equals(this.status, obWriteDomesticStandingOrderResponse6Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDomesticStandingOrderResponse6Data.statusUpdateDateTime) &&
                Objects.equals(this.refund, obWriteDomesticStandingOrderResponse6Data.refund) &&
                Objects.equals(this.charges, obWriteDomesticStandingOrderResponse6Data.charges) &&
                Objects.equals(this.initiation, obWriteDomesticStandingOrderResponse6Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteDomesticStandingOrderResponse6Data.multiAuthorisation) &&
                Objects.equals(this.debtor, obWriteDomesticStandingOrderResponse6Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, refund, charges, initiation, multiAuthorisation, debtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderResponse6Data {\n");
        sb.append("    domesticStandingOrderId: ").append(toIndentedString(domesticStandingOrderId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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

