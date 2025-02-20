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
package uk.org.openbanking.datamodel.v3.vrp;

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
 * OBDomesticVRPResponseData
 */

@JsonTypeName("OBDomesticVRPResponse_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPResponseData {

    private String domesticVRPId;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBDomesticVRPResponseDataStatus status;

    private String statusReason;

    private String statusReasonDescription;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedExecutionDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedSettlementDateTime;

    private OBCashAccountDebtorWithName refund;

    @Valid
    private List<@Valid OBDomesticVRPResponseDataChargesInner> charges;

    private OBDomesticVRPInitiation initiation;

    private OBDomesticVRPInstruction instruction;

    private OBCashAccountDebtorWithName debtorAccount;

    public OBDomesticVRPResponseData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPResponseData(String domesticVRPId, String consentId, DateTime creationDateTime, OBDomesticVRPResponseDataStatus status, DateTime statusUpdateDateTime, OBDomesticVRPInitiation initiation, OBDomesticVRPInstruction instruction) {
        this.domesticVRPId = domesticVRPId;
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.initiation = initiation;
        this.instruction = instruction;
    }

    public OBDomesticVRPResponseData domesticVRPId(String domesticVRPId) {
        this.domesticVRPId = domesticVRPId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
     *
     * @return domesticVRPId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "DomesticVRPId", description = "Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DomesticVRPId")
    public String getDomesticVRPId() {
        return domesticVRPId;
    }

    public void setDomesticVRPId(String domesticVRPId) {
        this.domesticVRPId = domesticVRPId;
    }

    public OBDomesticVRPResponseData consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Identifier for the Domestic VRP Consent that this payment is made under.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "Identifier for the Domestic VRP Consent that this payment is made under. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBDomesticVRPResponseData creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBDomesticVRPResponseData status(OBDomesticVRPResponseDataStatus status) {
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
    public OBDomesticVRPResponseDataStatus getStatus() {
        return status;
    }

    public void setStatus(OBDomesticVRPResponseDataStatus status) {
        this.status = status;
    }

    public OBDomesticVRPResponseData statusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Reason Code provided for the status of a VRP. To be documented in the Developer Portal.
     *
     * @return statusReason
     */

    @Schema(name = "StatusReason", description = "Reason Code provided for the status of a VRP. To be documented in the Developer Portal. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReason")
    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public OBDomesticVRPResponseData statusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
        return this;
    }

    /**
     * Description related to provided Status/StatusReason
     *
     * @return statusReasonDescription
     */
    @Size(min = 1, max = 256)
    @Schema(name = "StatusReasonDescription", description = "Description related to provided Status/StatusReason ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusReasonDescription")
    public String getStatusReasonDescription() {
        return statusReasonDescription;
    }

    public void setStatusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
    }

    public OBDomesticVRPResponseData statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBDomesticVRPResponseData expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.
     *
     * @return expectedExecutionDateTime
     */
    @Valid
    @Schema(name = "ExpectedExecutionDateTime", description = "Expected execution date and time for the payment resource. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedExecutionDateTime")
    public DateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBDomesticVRPResponseData expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.
     *
     * @return expectedSettlementDateTime
     */
    @Valid
    @Schema(name = "ExpectedSettlementDateTime", description = "Expected settlement date and time for the payment resource. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedSettlementDateTime")
    public DateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBDomesticVRPResponseData refund(OBCashAccountDebtorWithName refund) {
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
    public OBCashAccountDebtorWithName getRefund() {
        return refund;
    }

    public void setRefund(OBCashAccountDebtorWithName refund) {
        this.refund = refund;
    }

    public OBDomesticVRPResponseData charges(List<@Valid OBDomesticVRPResponseDataChargesInner> charges) {
        this.charges = charges;
        return this;
    }

    public OBDomesticVRPResponseData addChargesItem(OBDomesticVRPResponseDataChargesInner chargesItem) {
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
    public List<@Valid OBDomesticVRPResponseDataChargesInner> getCharges() {
        return charges;
    }

    public void setCharges(List<@Valid OBDomesticVRPResponseDataChargesInner> charges) {
        this.charges = charges;
    }

    public OBDomesticVRPResponseData initiation(OBDomesticVRPInitiation initiation) {
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
    public OBDomesticVRPInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticVRPInitiation initiation) {
        this.initiation = initiation;
    }

    public OBDomesticVRPResponseData instruction(OBDomesticVRPInstruction instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * Get instruction
     *
     * @return instruction
     */
    @NotNull
    @Valid
    @Schema(name = "Instruction", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Instruction")
    public OBDomesticVRPInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(OBDomesticVRPInstruction instruction) {
        this.instruction = instruction;
    }

    public OBDomesticVRPResponseData debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBCashAccountDebtorWithName getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPResponseData obDomesticVRPResponseData = (OBDomesticVRPResponseData) o;
        return Objects.equals(this.domesticVRPId, obDomesticVRPResponseData.domesticVRPId) &&
                Objects.equals(this.consentId, obDomesticVRPResponseData.consentId) &&
                Objects.equals(this.creationDateTime, obDomesticVRPResponseData.creationDateTime) &&
                Objects.equals(this.status, obDomesticVRPResponseData.status) &&
                Objects.equals(this.statusReason, obDomesticVRPResponseData.statusReason) &&
                Objects.equals(this.statusReasonDescription, obDomesticVRPResponseData.statusReasonDescription) &&
                Objects.equals(this.statusUpdateDateTime, obDomesticVRPResponseData.statusUpdateDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obDomesticVRPResponseData.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obDomesticVRPResponseData.expectedSettlementDateTime) &&
                Objects.equals(this.refund, obDomesticVRPResponseData.refund) &&
                Objects.equals(this.charges, obDomesticVRPResponseData.charges) &&
                Objects.equals(this.initiation, obDomesticVRPResponseData.initiation) &&
                Objects.equals(this.instruction, obDomesticVRPResponseData.instruction) &&
                Objects.equals(this.debtorAccount, obDomesticVRPResponseData.debtorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticVRPId, consentId, creationDateTime, status, statusReason, statusReasonDescription, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, refund, charges, initiation, instruction, debtorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPResponseData {\n");
        sb.append("    domesticVRPId: ").append(toIndentedString(domesticVRPId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

