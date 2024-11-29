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
package uk.org.openbanking.datamodel.v4.error;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 */

@Schema(name = "OBErrorResponse1", description = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBErrorResponse1 {

    private String id;

    private String code;

    private String message;

    @Valid
    private List<@Valid OBError1> errors = new ArrayList<>();

    public OBErrorResponse1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBErrorResponse1(List<@Valid OBError1> errors) {
        this.errors = errors;
    }

    public OBErrorResponse1 id(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
     *
     * @return id
     */
    @Size(min = 1, max = 40)
    @Schema(name = "Id", description = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OBErrorResponse1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Deprecated <br>High level textual error code, to help categorise the errors.
     *
     * @return code
     */
    @Size(min = 1, max = 40)
    @Schema(name = "Code", example = "400 BadRequest", description = "Deprecated <br>High level textual error code, to help categorise the errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBErrorResponse1 message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Deprecated <br>Brief Error message
     *
     * @return message
     */
    @Size(min = 1, max = 500)
    @Schema(name = "Message", example = "There is something wrong with the request parameters provided", description = "Deprecated <br>Brief Error message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OBErrorResponse1 errors(List<@Valid OBError1> errors) {
        this.errors = errors;
        return this;
    }

    public OBErrorResponse1 addErrorsItem(OBError1 errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "Errors", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Errors")
    public List<@Valid OBError1> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid OBError1> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBErrorResponse1 obErrorResponse1 = (OBErrorResponse1) o;
        return Objects.equals(this.id, obErrorResponse1.id) &&
                Objects.equals(this.code, obErrorResponse1.code) &&
                Objects.equals(this.message, obErrorResponse1.message) &&
                Objects.equals(this.errors, obErrorResponse1.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, message, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBErrorResponse1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

