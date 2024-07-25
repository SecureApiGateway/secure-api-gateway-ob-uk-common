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
package uk.org.openbanking.datamodel.v4.common;

import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * Meta Data relevant to the payload
 */

@Schema(name = "Meta", description = "Meta Data relevant to the payload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Meta {

    private Integer totalPages;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime firstAvailableDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime lastAvailableDateTime;

    public Meta totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get totalPages
     *
     * @return totalPages
     */

    @Schema(name = "TotalPages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TotalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Meta firstAvailableDateTime(DateTime firstAvailableDateTime) {
        this.firstAvailableDateTime = firstAvailableDateTime;
        return this;
    }

    /**
     * All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return firstAvailableDateTime
     */
    @Valid
    @Schema(name = "FirstAvailableDateTime", description = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FirstAvailableDateTime")
    public DateTime getFirstAvailableDateTime() {
        return firstAvailableDateTime;
    }

    public void setFirstAvailableDateTime(DateTime firstAvailableDateTime) {
        this.firstAvailableDateTime = firstAvailableDateTime;
    }

    public Meta lastAvailableDateTime(DateTime lastAvailableDateTime) {
        this.lastAvailableDateTime = lastAvailableDateTime;
        return this;
    }

    /**
     * All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return lastAvailableDateTime
     */
    @Valid
    @Schema(name = "LastAvailableDateTime", description = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LastAvailableDateTime")
    public DateTime getLastAvailableDateTime() {
        return lastAvailableDateTime;
    }

    public void setLastAvailableDateTime(DateTime lastAvailableDateTime) {
        this.lastAvailableDateTime = lastAvailableDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Meta meta = (Meta) o;
        return Objects.equals(this.totalPages, meta.totalPages) &&
                Objects.equals(this.firstAvailableDateTime, meta.firstAvailableDateTime) &&
                Objects.equals(this.lastAvailableDateTime, meta.lastAvailableDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPages, firstAvailableDateTime, lastAvailableDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Meta {\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    firstAvailableDateTime: ").append(toIndentedString(firstAvailableDateTime)).append("\n");
        sb.append("    lastAvailableDateTime: ").append(toIndentedString(lastAvailableDateTime)).append("\n");
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

