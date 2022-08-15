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
package uk.org.openbanking.datamodel.account;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Set of elements used to provide details of a generic date time for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic date time for the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBStatementDateTime1 {
    @JsonProperty("DateTime")
    private DateTime dateTime = null;

    @JsonProperty("Type")
    private String type = null;

    public OBStatementDateTime1 dateTime(DateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Date and time associated with the date time type. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return dateTime
     **/
    @ApiModelProperty(required = true, value = "Date and time associated with the date time type. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public OBStatementDateTime1 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Date time type, in a coded form.
     *
     * @return type
     **/
    @ApiModelProperty(required = true, value = "Date time type, in a coded form.")
    @NotNull

    @Size(min = 1, max = 40)
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
        OBStatementDateTime1 obStatementDateTime1 = (OBStatementDateTime1) o;
        return Objects.equals(this.dateTime, obStatementDateTime1.dateTime) &&
                Objects.equals(this.type, obStatementDateTime1.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementDateTime1 {\n");

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

