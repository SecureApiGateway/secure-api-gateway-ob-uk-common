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
package uk.org.openbanking.datamodel.v4.fund;

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
 * OBFundsConfirmationConsentResponse1Data
 */

@JsonTypeName("OBFundsConfirmationConsentResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationConsentResponse1Data {

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBFundsConfirmationConsentStatus status;

    @Valid
    private List<@Valid OBStatusReason> statusReason;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expirationDateTime;

    private OBFundsConfirmationConsent1DataDebtorAccount debtorAccount;

    public OBFundsConfirmationConsentResponse1Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBFundsConfirmationConsentResponse1Data(String consentId, DateTime creationDateTime, OBFundsConfirmationConsentStatus status, DateTime statusUpdateDateTime, OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.debtorAccount = debtorAccount;
    }

    public OBFundsConfirmationConsentResponse1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned to identify the funds confirmation consent resource.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "Unique identification as assigned to identify the funds confirmation consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBFundsConfirmationConsentResponse1Data creationDateTime(DateTime creationDateTime) {
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

    public OBFundsConfirmationConsentResponse1Data status(OBFundsConfirmationConsentStatus status) {
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
    public OBFundsConfirmationConsentStatus getStatus() {
        return status;
    }

    public void setStatus(OBFundsConfirmationConsentStatus status) {
        this.status = status;
    }

    public OBFundsConfirmationConsentResponse1Data statusReason(List<@Valid OBStatusReason> statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    public OBFundsConfirmationConsentResponse1Data addStatusReasonItem(OBStatusReason statusReasonItem) {
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

    public OBFundsConfirmationConsentResponse1Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBFundsConfirmationConsentResponse1Data expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the funds confirmation authorisation will expire. If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @Valid
    @Schema(name = "ExpirationDateTime", description = "Specified date and time the funds confirmation authorisation will expire. If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpirationDateTime")
    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OBFundsConfirmationConsentResponse1Data debtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @NotNull
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBFundsConfirmationConsent1DataDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
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
        OBFundsConfirmationConsentResponse1Data obFundsConfirmationConsentResponse1Data = (OBFundsConfirmationConsentResponse1Data) o;
        return Objects.equals(this.consentId, obFundsConfirmationConsentResponse1Data.consentId) &&
                Objects.equals(this.creationDateTime, obFundsConfirmationConsentResponse1Data.creationDateTime) &&
                Objects.equals(this.status, obFundsConfirmationConsentResponse1Data.status) &&
                Objects.equals(this.statusReason, obFundsConfirmationConsentResponse1Data.statusReason) &&
                Objects.equals(this.statusUpdateDateTime, obFundsConfirmationConsentResponse1Data.statusUpdateDateTime) &&
                Objects.equals(this.expirationDateTime, obFundsConfirmationConsentResponse1Data.expirationDateTime) &&
                Objects.equals(this.debtorAccount, obFundsConfirmationConsentResponse1Data.debtorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusReason, statusUpdateDateTime, expirationDateTime, debtorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationConsentResponse1Data {\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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

