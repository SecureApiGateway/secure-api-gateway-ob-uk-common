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
package uk.org.openbanking.datamodel.v3.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * OBError1
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")
public class OBError1 {
    @JsonProperty("ErrorCode")
    private String errorCode = null;

    @JsonProperty("Message")
    private String message = null;

    @JsonProperty("Path")
    private String path = null;

    @JsonProperty("Url")
    private String url = null;

    public OBError1 errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Low level textual error code, e.g., UK.OBIE.Field.Missing
     *
     * @return errorCode
     **/
    @ApiModelProperty(required = true, value = "Low level textual error code, e.g., UK.OBIE.Field.Missing")
    @NotNull
    @Size(min = 1, max = 128)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public OBError1 message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBIE doesn't standardise this field
     *
     * @return message
     **/
    @ApiModelProperty(required = true, value = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBIE doesn't standardise this field")
    @NotNull
    @Size(min = 1, max = 500)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OBError1 path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
     *
     * @return path
     **/
    @ApiModelProperty(value = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency")
    @Size(min = 1, max = 500)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public OBError1 url(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL to help remediate the problem, or provide more information, or to API Reference, or help etc
     *
     * @return url
     **/
    @ApiModelProperty(value = "URL to help remediate the problem, or provide more information, or to API Reference, or help etc")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBError1 obError1 = (OBError1) o;
        return Objects.equals(this.errorCode, obError1.errorCode) &&
                Objects.equals(this.message, obError1.message) &&
                Objects.equals(this.path, obError1.path) &&
                Objects.equals(this.url, obError1.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, message, path, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBError1 {\n");

        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

