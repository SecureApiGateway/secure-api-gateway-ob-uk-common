/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteInternationalResponse5DataRefund
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalResponse5DataRefund {
    @JsonProperty("Creditor")
    private OBWriteInternationalResponse5DataRefundCreditor creditor;

    @JsonProperty("Agent")
    private OBWriteInternationalResponse5DataRefundAgent agent;

    @JsonProperty("Account")
    private OBWriteDomesticResponse5DataRefundAccount account;

    public OBWriteInternationalResponse5DataRefund creditor(OBWriteInternationalResponse5DataRefundCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBWriteInternationalResponse5DataRefundCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternationalResponse5DataRefundCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalResponse5DataRefund agent(OBWriteInternationalResponse5DataRefundAgent agent) {
        this.agent = agent;
        return this;
    }

    /**
     * Get agent
     *
     * @return agent
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBWriteInternationalResponse5DataRefundAgent getAgent() {
        return agent;
    }

    public void setAgent(OBWriteInternationalResponse5DataRefundAgent agent) {
        this.agent = agent;
    }

    public OBWriteInternationalResponse5DataRefund account(OBWriteDomesticResponse5DataRefundAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     *
     * @return account
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

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
        OBWriteInternationalResponse5DataRefund obWriteInternationalResponse5DataRefund = (OBWriteInternationalResponse5DataRefund) o;
        return Objects.equals(this.creditor, obWriteInternationalResponse5DataRefund.creditor) &&
                Objects.equals(this.agent, obWriteInternationalResponse5DataRefund.agent) &&
                Objects.equals(this.account, obWriteInternationalResponse5DataRefund.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditor, agent, account);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalResponse5DataRefund {\n");

        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
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
