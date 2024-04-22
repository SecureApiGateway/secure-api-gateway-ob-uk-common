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
package uk.org.openbanking.datamodel.fund;

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
 * Result of a funds availability check.
 */

@Schema(name = "OBWriteFundsConfirmationResponse1_Data_FundsAvailableResult", description = "Result of a funds availability check.")
@JsonTypeName("OBWriteFundsConfirmationResponse1_Data_FundsAvailableResult")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFundsConfirmationResponse1DataFundsAvailableResult {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime fundsAvailableDateTime;

    private Boolean fundsAvailable;

    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult(DateTime fundsAvailableDateTime, Boolean fundsAvailable) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
        this.fundsAvailable = fundsAvailable;
    }

    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableDateTime(DateTime fundsAvailableDateTime) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
        return this;
    }

    /**
     * Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return fundsAvailableDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "FundsAvailableDateTime", description = "Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsAvailableDateTime")
    public DateTime getFundsAvailableDateTime() {
        return fundsAvailableDateTime;
    }

    public void setFundsAvailableDateTime(DateTime fundsAvailableDateTime) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
    }

    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailable(Boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
        return this;
    }

    /**
     * Flag to indicate the availability of funds given the Amount in the consent request.
     *
     * @return fundsAvailable
     */
    @NotNull
    @Schema(name = "FundsAvailable", description = "Flag to indicate the availability of funds given the Amount in the consent request.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsAvailable")
    public Boolean getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(Boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteFundsConfirmationResponse1DataFundsAvailableResult obWriteFundsConfirmationResponse1DataFundsAvailableResult = (OBWriteFundsConfirmationResponse1DataFundsAvailableResult) o;
        return Objects.equals(this.fundsAvailableDateTime, obWriteFundsConfirmationResponse1DataFundsAvailableResult.fundsAvailableDateTime) &&
                Objects.equals(this.fundsAvailable, obWriteFundsConfirmationResponse1DataFundsAvailableResult.fundsAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsAvailableDateTime, fundsAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteFundsConfirmationResponse1DataFundsAvailableResult {\n");
        sb.append("    fundsAvailableDateTime: ").append(toIndentedString(fundsAvailableDateTime)).append("\n");
        sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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

