/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Result of a funds availability check.
 */
@ApiModel(description = "Result of a funds availability check.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFundsConfirmationResponse1DataFundsAvailableResult {
    @JsonProperty("FundsAvailableDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime fundsAvailableDateTime;

    @JsonProperty("FundsAvailable")
    private Boolean fundsAvailable;

    public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableDateTime(DateTime fundsAvailableDateTime) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
        return this;
    }

    /**
     * Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return fundsAvailableDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

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
    @ApiModelProperty(required = true, value = "Flag to indicate the availability of funds given the Amount in the consent request.")
    @NotNull


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

