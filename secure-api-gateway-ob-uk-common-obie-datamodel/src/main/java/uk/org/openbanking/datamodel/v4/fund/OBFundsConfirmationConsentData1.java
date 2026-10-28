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
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import uk.org.openbanking.datamodel.v4.fund.OBCashAccountDebtorWithName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBFundsConfirmationConsentData1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationConsentData1 {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime expirationDateTime;

  private OBCashAccountDebtorWithName debtorAccount;

  public OBFundsConfirmationConsentData1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBFundsConfirmationConsentData1(OBCashAccountDebtorWithName debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBFundsConfirmationConsentData1 expirationDateTime(DateTime expirationDateTime) {
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

  public OBFundsConfirmationConsentData1 debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
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
    OBFundsConfirmationConsentData1 obFundsConfirmationConsentData1 = (OBFundsConfirmationConsentData1) o;
    return Objects.equals(this.expirationDateTime, obFundsConfirmationConsentData1.expirationDateTime) &&
        Objects.equals(this.debtorAccount, obFundsConfirmationConsentData1.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDateTime, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationConsentData1 {\n");
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

