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
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;

/**
 * OBWriteDomesticStandingOrderConsent5Data
 */

@JsonTypeName("OBWriteDomesticStandingOrderConsent5_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrderConsent5Data {

    private OBWriteDomesticScheduledConsent4DataPermission permission;

    private OBReadRefundAccount readRefundAccount;

    private OBWriteDomesticStandingOrder3DataInitiation initiation;

    private OBWriteDomesticConsentDataAuthorisation authorisation;

    private OBSCASupportData1 scASupportData;

    public OBWriteDomesticStandingOrderConsent5Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticStandingOrderConsent5Data(OBWriteDomesticScheduledConsent4DataPermission permission, OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.permission = permission;
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderConsent5Data permission(OBWriteDomesticScheduledConsent4DataPermission permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     */
    @NotNull
    @Valid
    @Schema(name = "Permission", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Permission")
    public OBWriteDomesticScheduledConsent4DataPermission getPermission() {
        return permission;
    }

    public void setPermission(OBWriteDomesticScheduledConsent4DataPermission permission) {
        this.permission = permission;
    }

    public OBWriteDomesticStandingOrderConsent5Data readRefundAccount(OBReadRefundAccount readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
        return this;
    }

    /**
     * Get readRefundAccount
     *
     * @return readRefundAccount
     */
    @Valid
    @Schema(name = "ReadRefundAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ReadRefundAccount")
    public OBReadRefundAccount getReadRefundAccount() {
        return readRefundAccount;
    }

    public void setReadRefundAccount(OBReadRefundAccount readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
    }

    public OBWriteDomesticStandingOrderConsent5Data initiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     */
    @NotNull
    @Valid
    @Schema(name = "Initiation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Initiation")
    public OBWriteDomesticStandingOrder3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderConsent5Data authorisation(OBWriteDomesticConsentDataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     */
    @Valid
    @Schema(name = "Authorisation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Authorisation")
    public OBWriteDomesticConsentDataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsentDataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteDomesticStandingOrderConsent5Data scASupportData(OBSCASupportData1 scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     */
    @Valid
    @Schema(name = "SCASupportData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SCASupportData")
    public OBSCASupportData1 getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBSCASupportData1 scASupportData) {
        this.scASupportData = scASupportData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrderConsent5Data obWriteDomesticStandingOrderConsent5Data = (OBWriteDomesticStandingOrderConsent5Data) o;
        return Objects.equals(this.permission, obWriteDomesticStandingOrderConsent5Data.permission) &&
                Objects.equals(this.readRefundAccount, obWriteDomesticStandingOrderConsent5Data.readRefundAccount) &&
                Objects.equals(this.initiation, obWriteDomesticStandingOrderConsent5Data.initiation) &&
                Objects.equals(this.authorisation, obWriteDomesticStandingOrderConsent5Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteDomesticStandingOrderConsent5Data.scASupportData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, readRefundAccount, initiation, authorisation, scASupportData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderConsent5Data {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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

