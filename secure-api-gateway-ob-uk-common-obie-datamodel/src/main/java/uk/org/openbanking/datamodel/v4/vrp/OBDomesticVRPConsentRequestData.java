/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import uk.org.openbanking.datamodel.v4.common.OBReadRefundAccount;

/**
 * OBDomesticVRPConsentRequestData
 */

@JsonTypeName("OBDomesticVRPConsentRequest_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPConsentRequestData {

    private OBReadRefundAccount readRefundAccount;

    private OBDomesticVRPControlParameters controlParameters;

    private OBDomesticVRPInitiation initiation;

    public OBDomesticVRPConsentRequestData() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPConsentRequestData(OBDomesticVRPControlParameters controlParameters, OBDomesticVRPInitiation initiation) {
        this.controlParameters = controlParameters;
        this.initiation = initiation;
    }

    public OBDomesticVRPConsentRequestData readRefundAccount(OBReadRefundAccount readRefundAccount) {
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

    public OBDomesticVRPConsentRequestData controlParameters(OBDomesticVRPControlParameters controlParameters) {
        this.controlParameters = controlParameters;
        return this;
    }

    /**
     * Get controlParameters
     *
     * @return controlParameters
     */
    @NotNull
    @Valid
    @Schema(name = "ControlParameters", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ControlParameters")
    public OBDomesticVRPControlParameters getControlParameters() {
        return controlParameters;
    }

    public void setControlParameters(OBDomesticVRPControlParameters controlParameters) {
        this.controlParameters = controlParameters;
    }

    public OBDomesticVRPConsentRequestData initiation(OBDomesticVRPInitiation initiation) {
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
    public OBDomesticVRPInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticVRPInitiation initiation) {
        this.initiation = initiation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPConsentRequestData obDomesticVRPConsentRequestData = (OBDomesticVRPConsentRequestData) o;
        return Objects.equals(this.readRefundAccount, obDomesticVRPConsentRequestData.readRefundAccount) &&
                Objects.equals(this.controlParameters, obDomesticVRPConsentRequestData.controlParameters) &&
                Objects.equals(this.initiation, obDomesticVRPConsentRequestData.initiation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readRefundAccount, controlParameters, initiation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPConsentRequestData {\n");
        sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
        sb.append("    controlParameters: ").append(toIndentedString(controlParameters)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

