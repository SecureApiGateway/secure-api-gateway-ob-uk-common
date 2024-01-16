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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteDataDomesticStandingOrderConsent2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBWriteDataDomesticStandingOrderConsent2 {
    @JsonProperty("Permission")
    private OBExternalPermissions2Code permission = null;

    @JsonProperty("Initiation")
    private OBDomesticStandingOrder2 initiation = null;

    @JsonProperty("Authorisation")
    private OBAuthorisation1 authorisation = null;

    public OBWriteDataDomesticStandingOrderConsent2 permission(OBExternalPermissions2Code permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalPermissions2Code getPermission() {
        return permission;
    }

    public void setPermission(OBExternalPermissions2Code permission) {
        this.permission = permission;
    }

    public OBWriteDataDomesticStandingOrderConsent2 initiation(OBDomesticStandingOrder2 initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBDomesticStandingOrder2 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticStandingOrder2 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataDomesticStandingOrderConsent2 authorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBAuthorisation1 getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDataDomesticStandingOrderConsent2 obWriteDataDomesticStandingOrderConsent2 = (OBWriteDataDomesticStandingOrderConsent2) o;
        return Objects.equals(this.permission, obWriteDataDomesticStandingOrderConsent2.permission) &&
                Objects.equals(this.initiation, obWriteDataDomesticStandingOrderConsent2.initiation) &&
                Objects.equals(this.authorisation, obWriteDataDomesticStandingOrderConsent2.authorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, initiation, authorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataDomesticStandingOrderConsent2 {\n");

        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

