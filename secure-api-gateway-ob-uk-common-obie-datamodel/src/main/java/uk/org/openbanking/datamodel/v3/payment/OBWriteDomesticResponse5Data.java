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
 * OBWriteDomesticResponse5Data
 */

@JsonTypeName("OBWriteDomesticResponse5_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticResponse5Data {

    private String domesticPaymentId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBWriteDomesticResponse5DataStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedExecutionDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedSettlementDateTime;

    private OBWriteDomesticResponse5DataRefund refund;

    @Valid
    private List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges;

    private OBWriteDomestic2DataInitiation initiation;

    private OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation;

    private OBCashAccountDebtor4 debtor;

    public OBWriteDomesticResponse5Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticResponse5Data(String domesticPaymentId, String consentId, DateTime creationDateTime, OBWriteDomesticResponse5DataStatus status, DateTime statusUpdateDateTime, OBWriteDomestic2DataInitiation initiation) {
        this.domesticPaymentId = domesticPaymentId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.initiation = initiation;
    }

    public OBWriteDomesticResponse5Data domesticPaymentId(String domesticPaymentId) {
        this.domesticPaymentId = domesticPaymentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
     *
     * @return domesticPaymentId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "DomesticPaymentId", description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DomesticPaymentId")
    public String getDomesticPaymentId() {
        return domesticPaymentId;
    }

    public void setDomesticPaymentId(String domesticPaymentId) {
        this.domesticPaymentId = domesticPaymentId;
    }

    public OBWriteDomesticResponse5Data consentId(String consentId) {
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

    public OBWriteDomesticResponse5Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDomesticResponse5Data status(OBWriteDomesticResponse5DataStatus status) {
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
    public OBWriteDomesticResponse5DataStatus getStatus() {
        return status;
    }

    public void setStatus(OBWriteDomesticResponse5DataStatus status) {
        this.status = status;
    }

    public OBWriteDomesticResponse5Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBWriteDomesticResponse5Data expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedExecutionDateTime
     */
    @Valid
    @Schema(name = "ExpectedExecutionDateTime", description = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedExecutionDateTime")
    public DateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteDomesticResponse5Data expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedSettlementDateTime
     */
    @Valid
    @Schema(name = "ExpectedSettlementDateTime", description = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedSettlementDateTime")
    public DateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteDomesticResponse5Data refund(OBWriteDomesticResponse5DataRefund refund) {
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

    public OBWriteDomesticResponse5Data charges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDomesticResponse5Data addChargesItem(OBWriteDomesticConsentResponse5DataChargesInner chargesItem) {
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

    public OBWriteDomesticResponse5Data initiation(OBWriteDomestic2DataInitiation initiation) {
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
    public OBWriteDomestic2DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteDomestic2DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteDomesticResponse5Data multiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
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

    public OBWriteDomesticResponse5Data debtor(OBCashAccountDebtor4 debtor) {
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
        OBWriteDomesticResponse5Data obWriteDomesticResponse5Data = (OBWriteDomesticResponse5Data) o;
        return Objects.equals(this.domesticPaymentId, obWriteDomesticResponse5Data.domesticPaymentId) &&
                Objects.equals(this.consentId, obWriteDomesticResponse5Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDomesticResponse5Data.creationDateTime) &&
                Objects.equals(this.status, obWriteDomesticResponse5Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDomesticResponse5Data.statusUpdateDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteDomesticResponse5Data.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteDomesticResponse5Data.expectedSettlementDateTime) &&
                Objects.equals(this.refund, obWriteDomesticResponse5Data.refund) &&
                Objects.equals(this.charges, obWriteDomesticResponse5Data.charges) &&
                Objects.equals(this.initiation, obWriteDomesticResponse5Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteDomesticResponse5Data.multiAuthorisation) &&
                Objects.equals(this.debtor, obWriteDomesticResponse5Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticPaymentId, consentId, creationDateTime, status, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, refund, charges, initiation, multiAuthorisation, debtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticResponse5Data {\n");
        sb.append("    domesticPaymentId: ").append(toIndentedString(domesticPaymentId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
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

