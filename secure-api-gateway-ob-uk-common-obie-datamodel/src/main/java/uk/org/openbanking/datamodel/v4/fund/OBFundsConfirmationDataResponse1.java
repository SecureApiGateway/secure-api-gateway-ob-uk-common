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
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBFundsConfirmationDataResponse1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationDataResponse1 {

  private String fundsConfirmationId;

  private String consentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime creationDateTime;

  private Boolean fundsAvailable;

  private String reference;

  private OBActiveOrHistoricCurrencyAndAmount instructedAmount;

  public OBFundsConfirmationDataResponse1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBFundsConfirmationDataResponse1(String fundsConfirmationId, String consentId, DateTime creationDateTime, Boolean fundsAvailable, String reference, OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.fundsConfirmationId = fundsConfirmationId;
    this.consentId = consentId;
    this.creationDateTime = creationDateTime;
    this.fundsAvailable = fundsAvailable;
    this.reference = reference;
    this.instructedAmount = instructedAmount;
  }

  public OBFundsConfirmationDataResponse1 fundsConfirmationId(String fundsConfirmationId) {
    this.fundsConfirmationId = fundsConfirmationId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
   * @return fundsConfirmationId
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "FundsConfirmationId", example = "FC-20260401-0001", description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FundsConfirmationId")
  public String getFundsConfirmationId() {
    return fundsConfirmationId;
  }

  public void setFundsConfirmationId(String fundsConfirmationId) {
    this.fundsConfirmationId = fundsConfirmationId;
  }

  public OBFundsConfirmationDataResponse1 consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
   * @return consentId
  */
  @NotNull @Size(min = 1, max = 128) 
  @Schema(name = "ConsentId", example = "FCC-20260401-0001", description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationDataResponse1 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`
   * @return creationDateTime
  */
  @NotNull @Valid 
  @Schema(name = "CreationDateTime", example = "2026-04-01T10:25:30Z", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below:  `2017-04-05T10:43:07+00:00`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreationDateTime")
  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBFundsConfirmationDataResponse1 fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  /**
   * Flag to indicate the result of a confirmation of funds check.
   * @return fundsAvailable
  */
  @NotNull 
  @Schema(name = "FundsAvailable", example = "true", description = "Flag to indicate the result of a confirmation of funds check.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FundsAvailable")
  public Boolean getFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public OBFundsConfirmationDataResponse1 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
   * @return reference
  */
  @NotNull @Size(min = 1, max = 35) 
  @Schema(name = "Reference", example = "CARD-PURCHASE-001", description = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBFundsConfirmationDataResponse1 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  */
  @NotNull @Valid 
  @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstructedAmount")
  public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsConfirmationDataResponse1 obFundsConfirmationDataResponse1 = (OBFundsConfirmationDataResponse1) o;
    return Objects.equals(this.fundsConfirmationId, obFundsConfirmationDataResponse1.fundsConfirmationId) &&
        Objects.equals(this.consentId, obFundsConfirmationDataResponse1.consentId) &&
        Objects.equals(this.creationDateTime, obFundsConfirmationDataResponse1.creationDateTime) &&
        Objects.equals(this.fundsAvailable, obFundsConfirmationDataResponse1.fundsAvailable) &&
        Objects.equals(this.reference, obFundsConfirmationDataResponse1.reference) &&
        Objects.equals(this.instructedAmount, obFundsConfirmationDataResponse1.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsConfirmationId, consentId, creationDateTime, fundsAvailable, reference, instructedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationDataResponse1 {\n");
    sb.append("    fundsConfirmationId: ").append(toIndentedString(fundsConfirmationId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

