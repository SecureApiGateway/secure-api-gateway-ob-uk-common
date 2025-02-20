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

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * The multiple authorisation flow response from the ASPSP.
 */

@Schema(name = "OBWriteDomesticResponse5_Data_MultiAuthorisation", description = "The multiple authorisation flow response from the ASPSP.")
@JsonTypeName("OBWriteDomesticResponse5_Data_MultiAuthorisation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticResponse5DataMultiAuthorisation {

    private OBWriteDomesticResponse5DataMultiAuthorisationStatus status;

    private Integer numberRequired;

    private Integer numberReceived;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime lastUpdateDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expirationDateTime;

    public OBWriteDomesticResponse5DataMultiAuthorisation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticResponse5DataMultiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisationStatus status) {
        this.status = status;
    }

    public OBWriteDomesticResponse5DataMultiAuthorisation status(OBWriteDomesticResponse5DataMultiAuthorisationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @NotNull
    @Valid
    @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Status")
    public OBWriteDomesticResponse5DataMultiAuthorisationStatus getStatus() {
        return status;
    }

    public void setStatus(OBWriteDomesticResponse5DataMultiAuthorisationStatus status) {
        this.status = status;
    }

    public OBWriteDomesticResponse5DataMultiAuthorisation numberRequired(Integer numberRequired) {
        this.numberRequired = numberRequired;
        return this;
    }

    /**
     * Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
     *
     * @return numberRequired
     */

    @Schema(name = "NumberRequired", description = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NumberRequired")
    public Integer getNumberRequired() {
        return numberRequired;
    }

    public void setNumberRequired(Integer numberRequired) {
        this.numberRequired = numberRequired;
    }

    public OBWriteDomesticResponse5DataMultiAuthorisation numberReceived(Integer numberReceived) {
        this.numberReceived = numberReceived;
        return this;
    }

    /**
     * Number of authorisations received.
     *
     * @return numberReceived
     */

    @Schema(name = "NumberReceived", description = "Number of authorisations received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NumberReceived")
    public Integer getNumberReceived() {
        return numberReceived;
    }

    public void setNumberReceived(Integer numberReceived) {
        this.numberReceived = numberReceived;
    }

    public OBWriteDomesticResponse5DataMultiAuthorisation lastUpdateDateTime(DateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Last date and time at the authorisation flow was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return lastUpdateDateTime
     */
    @Valid
    @Schema(name = "LastUpdateDateTime", description = "Last date and time at the authorisation flow was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LastUpdateDateTime")
    public DateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(DateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public OBWriteDomesticResponse5DataMultiAuthorisation expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @Valid
    @Schema(name = "ExpirationDateTime", description = "Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpirationDateTime")
    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticResponse5DataMultiAuthorisation obWriteDomesticResponse5DataMultiAuthorisation = (OBWriteDomesticResponse5DataMultiAuthorisation) o;
        return Objects.equals(this.status, obWriteDomesticResponse5DataMultiAuthorisation.status) &&
                Objects.equals(this.numberRequired, obWriteDomesticResponse5DataMultiAuthorisation.numberRequired) &&
                Objects.equals(this.numberReceived, obWriteDomesticResponse5DataMultiAuthorisation.numberReceived) &&
                Objects.equals(this.lastUpdateDateTime, obWriteDomesticResponse5DataMultiAuthorisation.lastUpdateDateTime) &&
                Objects.equals(this.expirationDateTime, obWriteDomesticResponse5DataMultiAuthorisation.expirationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, numberRequired, numberReceived, lastUpdateDateTime, expirationDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticResponse5DataMultiAuthorisation {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
        sb.append("    numberReceived: ").append(toIndentedString(numberReceived)).append("\n");
        sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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

