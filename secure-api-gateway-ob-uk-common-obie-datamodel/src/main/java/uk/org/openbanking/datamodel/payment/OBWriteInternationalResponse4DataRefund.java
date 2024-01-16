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
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.4
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteInternationalResponse4DataRefund
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")


public class OBWriteInternationalResponse4DataRefund {
    @JsonProperty("Creditor")
    private OBWriteInternationalResponse4DataRefundCreditor creditor = null;

    @JsonProperty("Agent")
    private OBWriteInternationalResponse4DataRefundAgent agent = null;

    @JsonProperty("Account")
    private OBWriteDomesticResponse4DataRefundAccount account = null;

    public OBWriteInternationalResponse4DataRefund creditor(OBWriteInternationalResponse4DataRefundCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternationalResponse4DataRefundCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternationalResponse4DataRefundCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalResponse4DataRefund agent(OBWriteInternationalResponse4DataRefundAgent agent) {
        this.agent = agent;
        return this;
    }

    /**
     * Get agent
     *
     * @return agent
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternationalResponse4DataRefundAgent getAgent() {
        return agent;
    }

    public void setAgent(OBWriteInternationalResponse4DataRefundAgent agent) {
        this.agent = agent;
    }

    public OBWriteInternationalResponse4DataRefund account(OBWriteDomesticResponse4DataRefundAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     *
     * @return account
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomesticResponse4DataRefundAccount getAccount() {
        return account;
    }

    public void setAccount(OBWriteDomesticResponse4DataRefundAccount account) {
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
        OBWriteInternationalResponse4DataRefund obWriteInternationalResponse4DataRefund = (OBWriteInternationalResponse4DataRefund) o;
        return Objects.equals(this.creditor, obWriteInternationalResponse4DataRefund.creditor) &&
                Objects.equals(this.agent, obWriteInternationalResponse4DataRefund.agent) &&
                Objects.equals(this.account, obWriteInternationalResponse4DataRefund.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditor, agent, account);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalResponse4DataRefund {\n");

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

