/*
 * Copyright © 2020-2026 Ping Identity Corporation (obst@forgerock.com)
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

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import uk.org.openbanking.datamodel.v4.common.OBStatusReason;
import uk.org.openbanking.datamodel.v4.fund.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.v4.fund.OBInternalConsentStatus1Code;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBFundsConfirmationConsentDataResponse1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationConsentDataResponse1 {

  private String consentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime creationDateTime;

  private OBInternalConsentStatus1Code status;

  @Valid
  private List<@Valid OBStatusReason> statusReason;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime statusUpdateDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime expirationDateTime;

  private OBCashAccountDebtorWithName debtorAccount;

  public OBFundsConfirmationConsentDataResponse1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBFundsConfirmationConsentDataResponse1(String consentId, DateTime creationDateTime, OBInternalConsentStatus1Code status, DateTime statusUpdateDateTime, OBCashAccountDebtorWithName debtorAccount) {
    this.consentId = consentId;
    this.creationDateTime = creationDateTime;
    this.status = status;
    this.statusUpdateDateTime = statusUpdateDateTime;
    this.debtorAccount = debtorAccount;
  }

  public OBFundsConfirmationConsentDataResponse1 consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the funds confirmation consent resource.
   * @return consentId
  */
  @NotNull @Size(min = 1, max = 128) 
  @Schema(name = "ConsentId", example = "FCC-20260401-0001", description = "Unique identification as assigned to identify the funds confirmation consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationConsentDataResponse1 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`
   * @return creationDateTime
  */
  @NotNull @Valid 
  @Schema(name = "CreationDateTime", example = "2026-04-01T10:15:30Z", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreationDateTime")
  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBFundsConfirmationConsentDataResponse1 status(OBInternalConsentStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public OBInternalConsentStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBInternalConsentStatus1Code status) {
    this.status = status;
  }

  public OBFundsConfirmationConsentDataResponse1 statusReason(List<@Valid OBStatusReason> statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  public OBFundsConfirmationConsentDataResponse1 addStatusReasonItem(OBStatusReason statusReasonItem) {
    if (this.statusReason == null) {
      this.statusReason = new ArrayList<>();
    }
    this.statusReason.add(statusReasonItem);
    return this;
  }

  /**
   * Get statusReason
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

  public OBFundsConfirmationConsentDataResponse1 statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`
   * @return statusUpdateDateTime
  */
  @NotNull @Valid 
  @Schema(name = "StatusUpdateDateTime", example = "2026-04-01T10:20:30Z", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StatusUpdateDateTime")
  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBFundsConfirmationConsentDataResponse1 expirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`
   * @return expirationDateTime
  */
  @Valid 
  @Schema(name = "ExpirationDateTime", example = "2026-10-01T10:15:30Z", description = "Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExpirationDateTime")
  public DateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBFundsConfirmationConsentDataResponse1 debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  @NotNull @Valid 
  @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
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
    OBFundsConfirmationConsentDataResponse1 obFundsConfirmationConsentDataResponse1 = (OBFundsConfirmationConsentDataResponse1) o;
    return Objects.equals(this.consentId, obFundsConfirmationConsentDataResponse1.consentId) &&
        Objects.equals(this.creationDateTime, obFundsConfirmationConsentDataResponse1.creationDateTime) &&
        Objects.equals(this.status, obFundsConfirmationConsentDataResponse1.status) &&
        Objects.equals(this.statusReason, obFundsConfirmationConsentDataResponse1.statusReason) &&
        Objects.equals(this.statusUpdateDateTime, obFundsConfirmationConsentDataResponse1.statusUpdateDateTime) &&
        Objects.equals(this.expirationDateTime, obFundsConfirmationConsentDataResponse1.expirationDateTime) &&
        Objects.equals(this.debtorAccount, obFundsConfirmationConsentDataResponse1.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusReason, statusUpdateDateTime, expirationDateTime, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationConsentDataResponse1 {\n");
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

