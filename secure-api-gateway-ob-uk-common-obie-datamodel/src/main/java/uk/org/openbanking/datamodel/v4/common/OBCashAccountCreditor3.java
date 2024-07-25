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
package uk.org.openbanking.datamodel.v4.common;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.payment.OBProxy1;

/**
 * OBCashAccountCreditor3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBCashAccountCreditor3 {

    private String schemeName;

    private String identification;

    private String name;

    private String secondaryIdentification;

    private String LEI;

    private OBProxy1 proxy;

    public OBCashAccountCreditor3() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBCashAccountCreditor3(String schemeName, String identification, String name) {
        this.schemeName = schemeName;
        this.identification = identification;
        this.name = name;
    }

    public OBCashAccountCreditor3 schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     */
    @NotNull
    @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("SchemeName")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBCashAccountCreditor3 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return identification
     */
    @NotNull
    @Size(max = 256)
    @Schema(name = "Identification", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBCashAccountCreditor3 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.
     *
     * @return name
     */
    @NotNull
    @Schema(name = "Name", description = "Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBCashAccountCreditor3 secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * Secondary identification of the account, as assigned by the account servicing institution. This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
     *
     * @return secondaryIdentification
     */
    @Size(max = 34)
    @Schema(name = "SecondaryIdentification", description = "Secondary identification of the account, as assigned by the account servicing institution. This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SecondaryIdentification")
    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }

    public OBCashAccountCreditor3 LEI(String LEI) {
        this.LEI = LEI;
        return this;
    }

    /**
     * Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
     *
     * @return LEI
     */
    @Pattern(regexp = "^[0-9]{4}[0]{2}[A-Z0-9]{12}[0-9]{2}")
    @Size(min = 1, max = 20)
    @Schema(name = "LEI", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LEI")
    public String getLEI() {
        return LEI;
    }

    public void setLEI(String LEI) {
        this.LEI = LEI;
    }

    public OBCashAccountCreditor3 proxy(OBProxy1 proxy) {
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
        OBCashAccountCreditor3 obCashAccountCreditor3 = (OBCashAccountCreditor3) o;
        return Objects.equals(this.schemeName, obCashAccountCreditor3.schemeName) &&
                Objects.equals(this.identification, obCashAccountCreditor3.identification) &&
                Objects.equals(this.name, obCashAccountCreditor3.name) &&
                Objects.equals(this.secondaryIdentification, obCashAccountCreditor3.secondaryIdentification) &&
                Objects.equals(this.LEI, obCashAccountCreditor3.LEI) &&
                Objects.equals(this.proxy, obCashAccountCreditor3.proxy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, secondaryIdentification, LEI, proxy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCashAccountCreditor3 {\n");
        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
        sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
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

