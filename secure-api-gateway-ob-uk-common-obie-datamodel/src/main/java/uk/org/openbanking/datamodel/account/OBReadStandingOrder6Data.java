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
 * OBReadStandingOrder6Data
 */

@JsonTypeName("OBReadStandingOrder6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadStandingOrder6Data {

  @Valid
  private List<@Valid OBStandingOrder6> standingOrder;

  public OBReadStandingOrder6Data standingOrder(List<@Valid OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder6Data addStandingOrderItem(OBStandingOrder6 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Get standingOrder
   * @return standingOrder
  */
  @Valid 
  @Schema(name = "StandingOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrder")
  public List<@Valid OBStandingOrder6> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<@Valid OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder6Data obReadStandingOrder6Data = (OBReadStandingOrder6Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder6Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder6Data {\n");
    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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

