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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBPostalAddress6;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.
 */
@ApiModel(description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalStandingOrder4DataInitiationCreditorAgent {
    @JsonProperty("SchemeName")
    private String schemeName;

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PostalAddress")
    private OBPostalAddress6 postalAddress;

    public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     */
    @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")


    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of the servicing institution.
     *
     * @return identification
     */
    @ApiModelProperty(value = "Unique and unambiguous identification of the servicing institution.")

    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which an agent is known and which is usually used to identify that agent.
     *
     * @return name
     */
    @ApiModelProperty(value = "Name by which an agent is known and which is usually used to identify that agent.")

    @Size(min = 1, max = 140)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent postalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Get postalAddress
     *
     * @return postalAddress
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBPostalAddress6 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrder4DataInitiationCreditorAgent obWriteInternationalStandingOrder4DataInitiationCreditorAgent = (OBWriteInternationalStandingOrder4DataInitiationCreditorAgent) o;
        return Objects.equals(this.schemeName, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.schemeName) &&
                Objects.equals(this.identification, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.identification) &&
                Objects.equals(this.name, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.name) &&
                Objects.equals(this.postalAddress, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, postalAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrder4DataInitiationCreditorAgent {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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
