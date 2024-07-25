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
import uk.org.openbanking.datamodel.v3.common.OBReadRefundAccount;

/**
 * OBWriteInternationalScheduledConsent5Data
 */

@JsonTypeName("OBWriteInternationalScheduledConsent5_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalScheduledConsent5Data {

    private OBWriteDomesticScheduledConsent4DataPermission permission;

    private OBReadRefundAccount readRefundAccount;

    private OBWriteInternationalScheduledConsent5DataInitiation initiation;

    private OBWriteDomesticConsent4DataAuthorisation authorisation;

    private OBSCASupportData1 scASupportData;

    public OBWriteInternationalScheduledConsent5Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalScheduledConsent5Data(OBWriteDomesticScheduledConsent4DataPermission permission, OBWriteInternationalScheduledConsent5DataInitiation initiation) {
        this.permission = permission;
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledConsent5Data permission(OBWriteDomesticScheduledConsent4DataPermission permission) {
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

    public OBWriteInternationalScheduledConsent5Data readRefundAccount(OBReadRefundAccount readRefundAccount) {
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

    public OBWriteInternationalScheduledConsent5Data initiation(OBWriteInternationalScheduledConsent5DataInitiation initiation) {
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
    public OBWriteInternationalScheduledConsent5DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalScheduledConsent5DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledConsent5Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
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
    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteInternationalScheduledConsent5Data scASupportData(OBSCASupportData1 scASupportData) {
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
        OBWriteInternationalScheduledConsent5Data obWriteInternationalScheduledConsent5Data = (OBWriteInternationalScheduledConsent5Data) o;
        return Objects.equals(this.permission, obWriteInternationalScheduledConsent5Data.permission) &&
                Objects.equals(this.readRefundAccount, obWriteInternationalScheduledConsent5Data.readRefundAccount) &&
                Objects.equals(this.initiation, obWriteInternationalScheduledConsent5Data.initiation) &&
                Objects.equals(this.authorisation, obWriteInternationalScheduledConsent5Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteInternationalScheduledConsent5Data.scASupportData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, readRefundAccount, initiation, authorisation, scASupportData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsent5Data {\n");
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

