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

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The authorisation type request from the TPP.
 */
@ApiModel(description = "The authorisation type request from the TPP.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticConsent4DataAuthorisation {
    /**
     * Type of authorisation flow requested.
     */
    public enum AuthorisationTypeEnum {
        ANY("Any"),

        SINGLE("Single");

        private String value;

        AuthorisationTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthorisationTypeEnum fromValue(String value) {
            for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("AuthorisationType")
    private AuthorisationTypeEnum authorisationType;

    @JsonProperty("CompletionDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime completionDateTime;

    public OBWriteDomesticConsent4DataAuthorisation authorisationType(AuthorisationTypeEnum authorisationType) {
        this.authorisationType = authorisationType;
        return this;
    }

    /**
     * Type of authorisation flow requested.
     *
     * @return authorisationType
     */
    @ApiModelProperty(required = true, value = "Type of authorisation flow requested.")
    @NotNull


    public AuthorisationTypeEnum getAuthorisationType() {
        return authorisationType;
    }

    public void setAuthorisationType(AuthorisationTypeEnum authorisationType) {
        this.authorisationType = authorisationType;
    }

    public OBWriteDomesticConsent4DataAuthorisation completionDateTime(DateTime completionDateTime) {
        this.completionDateTime = completionDateTime;
        return this;
    }

    /**
     * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return completionDateTime
     */
    @ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public DateTime getCompletionDateTime() {
        return completionDateTime;
    }

    public void setCompletionDateTime(DateTime completionDateTime) {
        this.completionDateTime = completionDateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticConsent4DataAuthorisation obWriteDomesticConsent4DataAuthorisation = (OBWriteDomesticConsent4DataAuthorisation) o;
        return Objects.equals(this.authorisationType, obWriteDomesticConsent4DataAuthorisation.authorisationType) &&
                Objects.equals(this.completionDateTime, obWriteDomesticConsent4DataAuthorisation.completionDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorisationType, completionDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticConsent4DataAuthorisation {\n");

        sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
        sb.append("    completionDateTime: ").append(toIndentedString(completionDateTime)).append("\n");
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

