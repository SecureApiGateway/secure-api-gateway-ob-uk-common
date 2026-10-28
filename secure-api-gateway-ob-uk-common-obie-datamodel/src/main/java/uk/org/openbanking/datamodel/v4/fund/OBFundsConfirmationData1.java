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
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBFundsConfirmationData1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationData1 {

  private String consentId;

  private String reference;

  private OBActiveOrHistoricCurrencyAndAmount instructedAmount;

  public OBFundsConfirmationData1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBFundsConfirmationData1(String consentId, String reference, OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.consentId = consentId;
    this.reference = reference;
    this.instructedAmount = instructedAmount;
  }

  public OBFundsConfirmationData1 consentId(String consentId) {
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

  public OBFundsConfirmationData1 reference(String reference) {
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

  public OBFundsConfirmationData1 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
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
    OBFundsConfirmationData1 obFundsConfirmationData1 = (OBFundsConfirmationData1) o;
    return Objects.equals(this.consentId, obFundsConfirmationData1.consentId) &&
        Objects.equals(this.reference, obFundsConfirmationData1.reference) &&
        Objects.equals(this.instructedAmount, obFundsConfirmationData1.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, reference, instructedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationData1 {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

