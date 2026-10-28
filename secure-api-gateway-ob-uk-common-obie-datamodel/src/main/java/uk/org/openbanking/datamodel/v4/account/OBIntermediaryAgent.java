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
package uk.org.openbanking.datamodel.v4.account;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import uk.org.openbanking.datamodel.v4.account.OBIntermediaryAgentProcessingStatus;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The intermediary agent associated with this transaction.
 */

@Schema(name = "OBIntermediaryAgent", description = "The intermediary agent associated with this transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBIntermediaryAgent {

  private String name;

  private String schemeName;

  private String identification;

  private String LEI;

  private OBPostalAddress7 postalAddress;

  private OBIntermediaryAgentProcessingStatus processingStatus;

  public OBIntermediaryAgent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
  */
  @Size(min = 1, max = 140) 
  @Schema(name = "Name", description = "Name by which an agent is known and which is usually used to identify that agent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBIntermediaryAgent schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
  */
  
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBIntermediaryAgent identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
   * @return identification
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBIntermediaryAgent LEI(String LEI) {
    this.LEI = LEI;
    return this;
  }

  /**
   * Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
   * @return LEI
  */
  @Pattern(regexp = "^[A-Z0-9]{18,18}[0-9]{2,2}$") @Size(min = 1, max = 20) 
  @Schema(name = "LEI", example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LEI")
  public String getLEI() {
    return LEI;
  }

  public void setLEI(String LEI) {
    this.LEI = LEI;
  }

  public OBIntermediaryAgent postalAddress(OBPostalAddress7 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  */
  @Valid 
  @Schema(name = "PostalAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostalAddress")
  public OBPostalAddress7 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress7 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public OBIntermediaryAgent processingStatus(OBIntermediaryAgentProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * Get processingStatus
   * @return processingStatus
  */
  @Valid 
  @Schema(name = "ProcessingStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProcessingStatus")
  public OBIntermediaryAgentProcessingStatus getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(OBIntermediaryAgentProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBIntermediaryAgent obIntermediaryAgent = (OBIntermediaryAgent) o;
    return Objects.equals(this.name, obIntermediaryAgent.name) &&
        Objects.equals(this.schemeName, obIntermediaryAgent.schemeName) &&
        Objects.equals(this.identification, obIntermediaryAgent.identification) &&
        Objects.equals(this.LEI, obIntermediaryAgent.LEI) &&
        Objects.equals(this.postalAddress, obIntermediaryAgent.postalAddress) &&
        Objects.equals(this.processingStatus, obIntermediaryAgent.processingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, schemeName, identification, LEI, postalAddress, processingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBIntermediaryAgent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
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

