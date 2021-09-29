/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadConsentResponse1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBReadConsentResponse1Data {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    @JsonProperty("ExpirationDateTime")
    private DateTime expirationDateTime = null;

    @JsonProperty("Permissions")
    @Valid
    private List<OBExternalPermissions1Code> permissions = new ArrayList<OBExternalPermissions1Code>();

    @JsonProperty("Status")
    private OBExternalRequestStatus1Code status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    @JsonProperty("TransactionFromDateTime")
    private DateTime transactionFromDateTime = null;

    @JsonProperty("TransactionToDateTime")
    private DateTime transactionToDateTime = null;

    public OBReadConsentResponse1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned to identify the account access consent resource.
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the account access consent resource.")
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
     * Get creationDateTime
     * @return creationDateTime
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBReadConsentResponse1Data expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return expirationDateTime
     **/
    @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OBReadConsentResponse1Data permissions(List<OBExternalPermissions1Code> permissions) {
        this.permissions = permissions;
        return this;
    }

    public OBReadConsentResponse1Data addPermissionsItem(OBExternalPermissions1Code permissionsItem) {
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
     *
     * @return permissions
     **/
    @ApiModelProperty(required = true, value = "Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.")
    @NotNull

    @Valid
    @Size(min = 1)
    public List<OBExternalPermissions1Code> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<OBExternalPermissions1Code> permissions) {
        this.permissions = permissions;
    }

    public OBReadConsentResponse1Data status(OBExternalRequestStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of consent resource in code form.
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
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
     * Get statusUpdateDateTime
     * @return statusUpdateDateTime
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBReadConsentResponse1Data transactionFromDateTime(DateTime transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
        return this;
    }

    /**
     * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return transactionFromDateTime
     **/
    @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
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
     * @return transactionToDateTime
     **/
    @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
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
                Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
                Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
                Objects.equals(this.status, obReadConsentResponse1Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
                Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime) &&
                Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, expirationDateTime, permissions, status, statusUpdateDateTime, transactionFromDateTime, transactionToDateTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadConsentResponse1Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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

