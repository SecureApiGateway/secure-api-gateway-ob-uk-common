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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OBWriteFileConsent3Data
 */

@JsonTypeName("OBWriteFileConsent3_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFileConsent3Data {

    private OBWriteFile2DataInitiation initiation;

    private OBWriteDomesticConsentDataAuthorisation authorisation;

    private OBSCASupportData1 scASupportData;

    public OBWriteFileConsent3Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteFileConsent3Data(OBWriteFile2DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteFileConsent3Data initiation(OBWriteFile2DataInitiation initiation) {
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
    public OBWriteFile2DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteFile2DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteFileConsent3Data authorisation(OBWriteDomesticConsentDataAuthorisation authorisation) {
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

    public OBWriteFileConsent3Data scASupportData(OBSCASupportData1 scASupportData) {
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
        OBWriteFileConsent3Data obWriteFileConsent3Data = (OBWriteFileConsent3Data) o;
        return Objects.equals(this.initiation, obWriteFileConsent3Data.initiation) &&
                Objects.equals(this.authorisation, obWriteFileConsent3Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteFileConsent3Data.scASupportData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initiation, authorisation, scASupportData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteFileConsent3Data {\n");
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

