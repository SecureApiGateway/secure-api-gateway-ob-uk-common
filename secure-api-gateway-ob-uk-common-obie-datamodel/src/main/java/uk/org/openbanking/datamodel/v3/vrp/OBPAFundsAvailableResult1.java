/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v3.vrp;

import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Availability result, clearly indicating the availability of funds given the Amount in the request.
 */

@Schema(name = "OBPAFundsAvailableResult1", description = "Availability result, clearly indicating the availability of funds given the Amount in the request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBPAFundsAvailableResult1 {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime fundsAvailableDateTime;

    private OBPAFundsAvailableResult1FundsAvailable fundsAvailable;

    public OBPAFundsAvailableResult1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBPAFundsAvailableResult1(DateTime fundsAvailableDateTime, OBPAFundsAvailableResult1FundsAvailable fundsAvailable) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
        this.fundsAvailable = fundsAvailable;
    }

    public OBPAFundsAvailableResult1 fundsAvailableDateTime(DateTime fundsAvailableDateTime) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
        return this;
    }

    /**
     * Date and time at which the funds availability check was generated.
     *
     * @return fundsAvailableDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "FundsAvailableDateTime", description = "Date and time at which the funds availability check was generated.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsAvailableDateTime")
    public DateTime getFundsAvailableDateTime() {
        return fundsAvailableDateTime;
    }

    public void setFundsAvailableDateTime(DateTime fundsAvailableDateTime) {
        this.fundsAvailableDateTime = fundsAvailableDateTime;
    }

    public OBPAFundsAvailableResult1 fundsAvailable(OBPAFundsAvailableResult1FundsAvailable fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
        return this;
    }

    /**
     * Get fundsAvailable
     *
     * @return fundsAvailable
     */
    @NotNull
    @Valid
    @Schema(name = "FundsAvailable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FundsAvailable")
    public OBPAFundsAvailableResult1FundsAvailable getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(OBPAFundsAvailableResult1FundsAvailable fundsAvailable) {
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
        OBPAFundsAvailableResult1 obPAFundsAvailableResult1 = (OBPAFundsAvailableResult1) o;
        return Objects.equals(this.fundsAvailableDateTime, obPAFundsAvailableResult1.fundsAvailableDateTime) &&
                Objects.equals(this.fundsAvailable, obPAFundsAvailableResult1.fundsAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsAvailableDateTime, fundsAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBPAFundsAvailableResult1 {\n");
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

