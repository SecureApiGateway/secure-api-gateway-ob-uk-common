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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Provides the details to identify the debtor account.
 */

@Schema(name = "OBWriteDomesticStandingOrder3_Data_Initiation_DebtorAccount", description = "Provides the details to identify the debtor account.")
@JsonTypeName("OBWriteDomesticStandingOrder3_Data_Initiation_DebtorAccount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrder3DataInitiationDebtorAccount {

    private String schemeName;

    private String identification;

    private String name;

    private String secondaryIdentification;

    private OBProxy1 proxy;

    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount(String schemeName, String identification) {
        this.schemeName = schemeName;
        this.identification = identification;
    }

    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list. For a full list of values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return schemeName
     */
    @NotNull
    @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. For a full list of values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("SchemeName")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return identification
     */
    @NotNull
    @Size(min = 1, max = 256)
    @Schema(name = "Identification", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.
     *
     * @return name
     */
    @Size(min = 1, max = 350)
    @Schema(name = "Name", description = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
     *
     * @return secondaryIdentification
     */
    @Size(min = 1, max = 34)
    @Schema(name = "SecondaryIdentification", description = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SecondaryIdentification")
    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }

    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount proxy(OBProxy1 proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Get proxy
     *
     * @return proxy
     */
    @Valid
    @Schema(name = "Proxy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Proxy")
    public OBProxy1 getProxy() {
        return proxy;
    }

    public void setProxy(OBProxy1 proxy) {
        this.proxy = proxy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrder3DataInitiationDebtorAccount obWriteDomesticStandingOrder3DataInitiationDebtorAccount = (OBWriteDomesticStandingOrder3DataInitiationDebtorAccount) o;
        return Objects.equals(this.schemeName, obWriteDomesticStandingOrder3DataInitiationDebtorAccount.schemeName) &&
                Objects.equals(this.identification, obWriteDomesticStandingOrder3DataInitiationDebtorAccount.identification) &&
                Objects.equals(this.name, obWriteDomesticStandingOrder3DataInitiationDebtorAccount.name) &&
                Objects.equals(this.secondaryIdentification, obWriteDomesticStandingOrder3DataInitiationDebtorAccount.secondaryIdentification) &&
                Objects.equals(this.proxy, obWriteDomesticStandingOrder3DataInitiationDebtorAccount.proxy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, secondaryIdentification, proxy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrder3DataInitiationDebtorAccount {\n");
        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
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

