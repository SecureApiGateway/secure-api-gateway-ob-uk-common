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
 * OBWriteInternationalScheduledResponse6Data
 */

@JsonTypeName("OBWriteInternationalScheduledResponse6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalScheduledResponse6Data {

    private String internationalScheduledPaymentId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBWriteInternationalScheduledResponse6DataStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @Valid
    private List<@Valid OBStatusReason> statusReason;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedExecutionDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedSettlementDateTime;

    private OBWriteInternationalScheduledResponse6DataRefund refund;

    @Valid
    private List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges;

    private OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation;

    private OBWriteInternationalScheduled3DataInitiation initiation;

    private OBWriteDomesticScheduledResponse5DataMultiAuthorisation multiAuthorisation;

    private OBCashAccountDebtor4 debtor;

    public OBWriteInternationalScheduledResponse6Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalScheduledResponse6Data(String internationalScheduledPaymentId, String consentId, DateTime creationDateTime, OBWriteInternationalScheduledResponse6DataStatus status, DateTime statusUpdateDateTime, OBWriteInternationalScheduled3DataInitiation initiation) {
        this.internationalScheduledPaymentId = internationalScheduledPaymentId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledResponse6Data internationalScheduledPaymentId(String internationalScheduledPaymentId) {
        this.internationalScheduledPaymentId = internationalScheduledPaymentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.
     *
     * @return internationalScheduledPaymentId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "InternationalScheduledPaymentId", description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("InternationalScheduledPaymentId")
    public String getInternationalScheduledPaymentId() {
        return internationalScheduledPaymentId;
    }

    public void setInternationalScheduledPaymentId(String internationalScheduledPaymentId) {
        this.internationalScheduledPaymentId = internationalScheduledPaymentId;
    }

    public OBWriteInternationalScheduledResponse6Data consentId(String consentId) {
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

    public OBWriteInternationalScheduledResponse6Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalScheduledResponse6Data status(OBWriteInternationalScheduledResponse6DataStatus status) {
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
    public OBWriteInternationalScheduledResponse6DataStatus getStatus() {
        return status;
    }

    public void setStatus(OBWriteInternationalScheduledResponse6DataStatus status) {
        this.status = status;
    }

    public OBWriteInternationalScheduledResponse6Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBWriteInternationalScheduledResponse6Data statusReason(List<@Valid OBStatusReason> statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    public OBWriteInternationalScheduledResponse6Data addStatusReasonItem(OBStatusReason statusReasonItem) {
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

    public OBWriteInternationalScheduledResponse6Data expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedExecutionDateTime
     */
    @Valid
    @Schema(name = "ExpectedExecutionDateTime", description = "Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedExecutionDateTime")
    public DateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteInternationalScheduledResponse6Data expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedSettlementDateTime
     */
    @Valid
    @Schema(name = "ExpectedSettlementDateTime", description = "Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedSettlementDateTime")
    public DateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteInternationalScheduledResponse6Data refund(OBWriteInternationalScheduledResponse6DataRefund refund) {
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
    public OBWriteInternationalScheduledResponse6DataRefund getRefund() {
        return refund;
    }

    public void setRefund(OBWriteInternationalScheduledResponse6DataRefund refund) {
        this.refund = refund;
    }

    public OBWriteInternationalScheduledResponse6Data charges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalScheduledResponse6Data addChargesItem(OBWriteDomesticConsentResponse5DataChargesInner chargesItem) {
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

    public OBWriteInternationalScheduledResponse6Data exchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     */
    @Valid
    @Schema(name = "ExchangeRateInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExchangeRateInformation")
    public OBWriteInternationalConsentResponse6DataExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledResponse6Data initiation(OBWriteInternationalScheduled3DataInitiation initiation) {
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
    public OBWriteInternationalScheduled3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalScheduled3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledResponse6Data multiAuthorisation(OBWriteDomesticScheduledResponse5DataMultiAuthorisation multiAuthorisation) {
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

    public OBWriteInternationalScheduledResponse6Data debtor(OBCashAccountDebtor4 debtor) {
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
        OBWriteInternationalScheduledResponse6Data obWriteInternationalScheduledResponse6Data = (OBWriteInternationalScheduledResponse6Data) o;
        return Objects.equals(this.internationalScheduledPaymentId, obWriteInternationalScheduledResponse6Data.internationalScheduledPaymentId) &&
                Objects.equals(this.consentId, obWriteInternationalScheduledResponse6Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteInternationalScheduledResponse6Data.creationDateTime) &&
                Objects.equals(this.status, obWriteInternationalScheduledResponse6Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalScheduledResponse6Data.statusUpdateDateTime) &&
                Objects.equals(this.statusReason, obWriteInternationalScheduledResponse6Data.statusReason) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteInternationalScheduledResponse6Data.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteInternationalScheduledResponse6Data.expectedSettlementDateTime) &&
                Objects.equals(this.refund, obWriteInternationalScheduledResponse6Data.refund) &&
                Objects.equals(this.charges, obWriteInternationalScheduledResponse6Data.charges) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledResponse6Data.exchangeRateInformation) &&
                Objects.equals(this.initiation, obWriteInternationalScheduledResponse6Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteInternationalScheduledResponse6Data.multiAuthorisation) &&
                Objects.equals(this.debtor, obWriteInternationalScheduledResponse6Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internationalScheduledPaymentId, consentId, creationDateTime, status, statusUpdateDateTime, statusReason, expectedExecutionDateTime, expectedSettlementDateTime, refund, charges, exchangeRateInformation, initiation, multiAuthorisation, debtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledResponse6Data {\n");
        sb.append("    internationalScheduledPaymentId: ").append(toIndentedString(internationalScheduledPaymentId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
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

