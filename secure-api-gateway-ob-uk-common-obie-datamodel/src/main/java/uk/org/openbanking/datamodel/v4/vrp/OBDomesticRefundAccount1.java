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
package uk.org.openbanking.datamodel.v4.vrp;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uk.org.openbanking.datamodel.v4.vrp.OBDomesticRefundAccount1Account;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.
 */

@Schema(name = "OBDomesticRefundAccount1", description = "Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticRefundAccount1 {

  private OBDomesticRefundAccount1Account account;

  public OBDomesticRefundAccount1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBDomesticRefundAccount1(OBDomesticRefundAccount1Account account) {
    this.account = account;
  }

  public OBDomesticRefundAccount1 account(OBDomesticRefundAccount1Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @NotNull @Valid 
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Account")
  public OBDomesticRefundAccount1Account getAccount() {
    return account;
  }

  public void setAccount(OBDomesticRefundAccount1Account account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBDomesticRefundAccount1 obDomesticRefundAccount1 = (OBDomesticRefundAccount1) o;
    return Objects.equals(this.account, obDomesticRefundAccount1.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBDomesticRefundAccount1 {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

