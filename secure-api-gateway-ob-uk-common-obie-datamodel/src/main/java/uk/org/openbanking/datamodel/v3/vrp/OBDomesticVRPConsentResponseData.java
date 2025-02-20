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
import uk.org.openbanking.datamodel.v3.common.OBReadRefundAccount;

/**
 * OBDomesticVRPConsentResponseData
 */

@JsonTypeName("OBDomesticVRPConsentResponse_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPConsentResponseData {

    private OBReadRefundAccount readRefundAccount;

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBDomesticVRPConsentResponseDataStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private OBDomesticVRPControlParameters controlParameters;

    private OBDomesticVRPInitiation initiation;

    private OBCashAccountDebtorWithName debtorAccount;

    public OBDomesticVRPConsentResponseData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPConsentResponseData(String consentId, DateTime creationDateTime, OBDomesticVRPConsentResponseDataStatus status, DateTime statusUpdateDateTime, OBDomesticVRPControlParameters controlParameters, OBDomesticVRPInitiation initiation) {
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.controlParameters = controlParameters;
        this.initiation = initiation;
    }

    public OBDomesticVRPConsentResponseData readRefundAccount(OBReadRefundAccount readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
        return this;
    }

    /**
     * Get readRefundAccount
     *
     * @return readRefundAccount
     */
    @Valid
    @Schema(name = "ReadRefundAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ReadRefundAccount")
    public OBReadRefundAccount getReadRefundAccount() {
        return readRefundAccount;
    }

    public void setReadRefundAccount(OBReadRefundAccount readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
    }

    public OBDomesticVRPConsentResponseData consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "Unique identification as assigned by the ASPSP to uniquely identify the consent resource. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBDomesticVRPConsentResponseData creationDateTime(DateTime creationDateTime) {
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

    public OBDomesticVRPConsentResponseData status(OBDomesticVRPConsentResponseDataStatus status) {
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
    public OBDomesticVRPConsentResponseDataStatus getStatus() {
        return status;
    }

    public void setStatus(OBDomesticVRPConsentResponseDataStatus status) {
        this.status = status;
    }

    public OBDomesticVRPConsentResponseData statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBDomesticVRPConsentResponseData controlParameters(OBDomesticVRPControlParameters controlParameters) {
        this.controlParameters = controlParameters;
        return this;
    }

    /**
     * Get controlParameters
     *
     * @return controlParameters
     */
    @NotNull
    @Valid
    @Schema(name = "ControlParameters", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ControlParameters")
    public OBDomesticVRPControlParameters getControlParameters() {
        return controlParameters;
    }

    public void setControlParameters(OBDomesticVRPControlParameters controlParameters) {
        this.controlParameters = controlParameters;
    }

    public OBDomesticVRPConsentResponseData initiation(OBDomesticVRPInitiation initiation) {
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

    public OBDomesticVRPConsentResponseData debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
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
        OBDomesticVRPConsentResponseData obDomesticVRPConsentResponseData = (OBDomesticVRPConsentResponseData) o;
        return Objects.equals(this.readRefundAccount, obDomesticVRPConsentResponseData.readRefundAccount) &&
                Objects.equals(this.consentId, obDomesticVRPConsentResponseData.consentId) &&
                Objects.equals(this.creationDateTime, obDomesticVRPConsentResponseData.creationDateTime) &&
                Objects.equals(this.status, obDomesticVRPConsentResponseData.status) &&
                Objects.equals(this.statusUpdateDateTime, obDomesticVRPConsentResponseData.statusUpdateDateTime) &&
                Objects.equals(this.controlParameters, obDomesticVRPConsentResponseData.controlParameters) &&
                Objects.equals(this.initiation, obDomesticVRPConsentResponseData.initiation) &&
                Objects.equals(this.debtorAccount, obDomesticVRPConsentResponseData.debtorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readRefundAccount, consentId, creationDateTime, status, statusUpdateDateTime, controlParameters, initiation, debtorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPConsentResponseData {\n");
        sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    controlParameters: ").append(toIndentedString(controlParameters)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

