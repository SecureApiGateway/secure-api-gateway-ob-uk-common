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
 * OBReadConsent1Data
 */

@JsonTypeName("OBReadConsent1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadConsent1Data {

  @Valid
  private List<OBExternalPermissions1Code> permissions = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime expirationDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime transactionFromDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime transactionToDateTime;

  public OBReadConsent1Data() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadConsent1Data(List<OBExternalPermissions1Code> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsent1Data permissions(List<OBExternalPermissions1Code> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsent1Data addPermissionsItem(OBExternalPermissions1Code permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "Permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Permissions")
  public List<OBExternalPermissions1Code> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<OBExternalPermissions1Code> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsent1Data expirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
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

  public OBReadConsent1Data transactionFromDateTime(DateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

  /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
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

  public OBReadConsent1Data transactionToDateTime(DateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

  /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
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
    OBReadConsent1Data obReadConsent1Data = (OBReadConsent1Data) o;
    return Objects.equals(this.permissions, obReadConsent1Data.permissions) &&
        Objects.equals(this.expirationDateTime, obReadConsent1Data.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsent1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsent1Data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1Data {\n");
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

