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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadDirectDebit2Data
 */

@JsonTypeName("OBReadDirectDebit2_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadDirectDebit2Data {

  @Valid
  private List<@Valid OBReadDirectDebit2DataDirectDebitInner> directDebit;

  public OBReadDirectDebit2Data directDebit(List<@Valid OBReadDirectDebit2DataDirectDebitInner> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDirectDebit2Data addDirectDebitItem(OBReadDirectDebit2DataDirectDebitInner directDebitItem) {
    if (this.directDebit == null) {
      this.directDebit = new ArrayList<>();
    }
    this.directDebit.add(directDebitItem);
    return this;
  }

  /**
   * Get directDebit
   * @return directDebit
  */
  @Valid 
  @Schema(name = "DirectDebit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectDebit")
  public List<@Valid OBReadDirectDebit2DataDirectDebitInner> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<@Valid OBReadDirectDebit2DataDirectDebitInner> directDebit) {
    this.directDebit = directDebit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2Data obReadDirectDebit2Data = (OBReadDirectDebit2Data) o;
    return Objects.equals(this.directDebit, obReadDirectDebit2Data.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2Data {\n");
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

