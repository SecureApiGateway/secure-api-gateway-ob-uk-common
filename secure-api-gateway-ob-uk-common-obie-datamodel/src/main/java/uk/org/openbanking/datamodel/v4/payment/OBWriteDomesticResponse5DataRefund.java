/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.
 */

@Schema(name = "OBWriteDomesticResponse5_Data_Refund", description = "Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.")
@JsonTypeName("OBWriteDomesticResponse5_Data_Refund")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticResponse5DataRefund {

    private OBWriteDomesticResponse5DataRefundAccount account;

    public OBWriteDomesticResponse5DataRefund() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticResponse5DataRefund(OBWriteDomesticResponse5DataRefundAccount account) {
        this.account = account;
    }

    public OBWriteDomesticResponse5DataRefund account(OBWriteDomesticResponse5DataRefundAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     *
     * @return account
     */
    @NotNull
    @Valid
    @Schema(name = "Account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Account")
    public OBWriteDomesticResponse5DataRefundAccount getAccount() {
        return account;
    }

    public void setAccount(OBWriteDomesticResponse5DataRefundAccount account) {
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
        OBWriteDomesticResponse5DataRefund obWriteDomesticResponse5DataRefund = (OBWriteDomesticResponse5DataRefund) o;
        return Objects.equals(this.account, obWriteDomesticResponse5DataRefund.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticResponse5DataRefund {\n");
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

