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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Identification assigned by an institution to identify an account. This identification is known by the account owner.
 */
@ApiModel(description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrder3DataInitiationCreditorAccount {
    @JsonProperty("SchemeName")
    private String schemeName;

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("SecondaryIdentification")
    private String secondaryIdentification;

    public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     */
    @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
    @NotNull


    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return identification
     */
    @ApiModelProperty(required = true, value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
    @NotNull

    @Size(min = 1, max = 256)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The account name is the name or names of the account owner(s) represented at an account level. Note, the account name is not the product name or the nickname of the account. OB: ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.
     *
     * @return name
     */
    @ApiModelProperty(required = true, value = "The account name is the name or names of the account owner(s) represented at an account level. Note, the account name is not the product name or the nickname of the account. OB: ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.")
    @NotNull

    @Size(min = 1, max = 350)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
     *
     * @return secondaryIdentification
     */
    @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")

    @Size(min = 1, max = 34)
    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrder3DataInitiationCreditorAccount obWriteDomesticStandingOrder3DataInitiationCreditorAccount = (OBWriteDomesticStandingOrder3DataInitiationCreditorAccount) o;
        return Objects.equals(this.schemeName, obWriteDomesticStandingOrder3DataInitiationCreditorAccount.schemeName) &&
                Objects.equals(this.identification, obWriteDomesticStandingOrder3DataInitiationCreditorAccount.identification) &&
                Objects.equals(this.name, obWriteDomesticStandingOrder3DataInitiationCreditorAccount.name) &&
                Objects.equals(this.secondaryIdentification, obWriteDomesticStandingOrder3DataInitiationCreditorAccount.secondaryIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, secondaryIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrder3DataInitiationCreditorAccount {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

