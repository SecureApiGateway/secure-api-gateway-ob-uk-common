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
package uk.org.openbanking.datamodel.account;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import uk.org.openbanking.datamodel.common.OBExternalPermissions1Code;
import uk.org.openbanking.datamodel.common.OBExternalRequestStatus1Code;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * OBReadConsentResponse1Data
 */

@JsonTypeName("OBReadConsentResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadConsentResponse1Data {

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBExternalRequestStatus1Code status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @Valid
    private List<@Valid OBExternalPermissions1Code> permissions = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expirationDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime transactionFromDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime transactionToDateTime;

    public OBReadConsentResponse1Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadConsentResponse1Data(String consentId, DateTime creationDateTime, OBExternalRequestStatus1Code status, DateTime statusUpdateDateTime, List<@Valid OBExternalPermissions1Code> permissions) {
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.permissions = permissions;
    }

    public OBReadConsentResponse1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned to identify the account access consent resource.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "Unique identification as assigned to identify the account access consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBReadConsentResponse1Data creationDateTime(DateTime creationDateTime) {
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

    public OBReadConsentResponse1Data status(OBExternalRequestStatus1Code status) {
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
    public OBExternalRequestStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBExternalRequestStatus1Code status) {
        this.status = status;
    }

    public OBReadConsentResponse1Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBReadConsentResponse1Data permissions(List<@Valid OBExternalPermissions1Code> permissions) {
        this.permissions = permissions;
        return this;
    }

    public OBReadConsentResponse1Data addPermissionsItem(OBExternalPermissions1Code permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "Permissions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Permissions")
    public List<@Valid OBExternalPermissions1Code> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<@Valid OBExternalPermissions1Code> permissions) {
        this.permissions = permissions;
    }

    public OBReadConsentResponse1Data expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @Valid
    @Schema(name = "ExpirationDateTime", description = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpirationDateTime")
    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OBReadConsentResponse1Data transactionFromDateTime(DateTime transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
        return this;
    }

    /**
     * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return transactionFromDateTime
     */
    @Valid
    @Schema(name = "TransactionFromDateTime", description = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TransactionFromDateTime")
    public DateTime getTransactionFromDateTime() {
        return transactionFromDateTime;
    }

    public void setTransactionFromDateTime(DateTime transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
    }

    public OBReadConsentResponse1Data transactionToDateTime(DateTime transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
        return this;
    }

    /**
     * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return transactionToDateTime
     */
    @Valid
    @Schema(name = "TransactionToDateTime", description = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TransactionToDateTime")
    public DateTime getTransactionToDateTime() {
        return transactionToDateTime;
    }

    public void setTransactionToDateTime(DateTime transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadConsentResponse1Data obReadConsentResponse1Data = (OBReadConsentResponse1Data) o;
        return Objects.equals(this.consentId, obReadConsentResponse1Data.consentId) &&
                Objects.equals(this.creationDateTime, obReadConsentResponse1Data.creationDateTime) &&
                Objects.equals(this.status, obReadConsentResponse1Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
                Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
                Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
                Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime) &&
                Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadConsentResponse1Data {\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
        sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
        sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

