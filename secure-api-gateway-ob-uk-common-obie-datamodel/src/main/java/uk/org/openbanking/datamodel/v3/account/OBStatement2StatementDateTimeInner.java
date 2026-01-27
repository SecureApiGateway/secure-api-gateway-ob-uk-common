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
package uk.org.openbanking.datamodel.v3.account;

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
 * Set of elements used to provide details of a generic date time for the statement resource.
 */

@Schema(name = "OBStatement2_StatementDateTime_inner", description = "Set of elements used to provide details of a generic date time for the statement resource.")
@JsonTypeName("OBStatement2_StatementDateTime_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2StatementDateTimeInner {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime dateTime;

    private String type;

    public OBStatement2StatementDateTimeInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2StatementDateTimeInner(DateTime dateTime, String type) {
        this.dateTime = dateTime;
        this.type = type;
    }

    public OBStatement2StatementDateTimeInner dateTime(DateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Date and time associated with the date time type.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return dateTime
     */
    @NotNull
    @Valid
    @Schema(name = "DateTime", description = "Date and time associated with the date time type.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DateTime")
    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public OBStatement2StatementDateTimeInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Date time type, in a coded form.
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", description = "Date time type, in a coded form.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2StatementDateTimeInner obStatement2StatementDateTimeInner = (OBStatement2StatementDateTimeInner) o;
        return Objects.equals(this.dateTime, obStatement2StatementDateTimeInner.dateTime) &&
                Objects.equals(this.type, obStatement2StatementDateTimeInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementDateTimeInner {\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

