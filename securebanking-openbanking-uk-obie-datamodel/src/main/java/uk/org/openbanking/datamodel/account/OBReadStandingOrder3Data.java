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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadStandingOrder3Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBReadStandingOrder3Data   {
  @JsonProperty("StandingOrder")
  @Valid
  private List<OBStandingOrder3> standingOrder = null;

  public OBReadStandingOrder3Data standingOrder(List<OBStandingOrder3> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder3Data addStandingOrderItem(OBStandingOrder3 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<OBStandingOrder3>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Get standingOrder
   * @return standingOrder
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStandingOrder3> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder3> standingOrder) {
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
    OBReadStandingOrder3Data obReadStandingOrder3Data = (OBReadStandingOrder3Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder3Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder3Data {\n");
    
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

