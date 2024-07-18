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
package uk.org.openbanking.datamodel.v3.event;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * OBEventPolling1SetErrsValue
 */

@JsonTypeName("OBEventPolling1_setErrs_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventPolling1SetErrsValue {

    private String err;

    private String description;

    public OBEventPolling1SetErrsValue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventPolling1SetErrsValue(String err, String description) {
        this.err = err;
        this.description = description;
    }

    public OBEventPolling1SetErrsValue err(String err) {
        this.err = err;
        return this;
    }

    /**
     * A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes
     *
     * @return err
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "err", description = "A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("err")
    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public OBEventPolling1SetErrsValue description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A human-readable string that provides additional diagnostic information
     *
     * @return description
     */
    @NotNull
    @Size(min = 1, max = 256)
    @Schema(name = "description", description = "A human-readable string that provides additional diagnostic information", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPolling1SetErrsValue obEventPolling1SetErrsValue = (OBEventPolling1SetErrsValue) o;
        return Objects.equals(this.err, obEventPolling1SetErrsValue.err) &&
                Objects.equals(this.description, obEventPolling1SetErrsValue.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(err, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPolling1SetErrsValue {\n");
        sb.append("    err: ").append(toIndentedString(err)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

