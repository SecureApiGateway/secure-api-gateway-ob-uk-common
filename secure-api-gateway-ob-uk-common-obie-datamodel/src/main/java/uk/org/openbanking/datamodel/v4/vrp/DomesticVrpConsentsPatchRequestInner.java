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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DomesticVrpConsentsPatchRequestInner
 */

@JsonTypeName("domesticVrpConsentsPatch_request_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DomesticVrpConsentsPatchRequestInner {

    private DomesticVrpConsentsPatchRequestInnerOp op;

    private String path;

    private String from;

    private Object value = null;

    public DomesticVrpConsentsPatchRequestInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DomesticVrpConsentsPatchRequestInner(DomesticVrpConsentsPatchRequestInnerOp op, String path) {
        this.op = op;
        this.path = path;
    }

    public DomesticVrpConsentsPatchRequestInner op(DomesticVrpConsentsPatchRequestInnerOp op) {
        this.op = op;
        return this;
    }

    /**
     * Get op
     *
     * @return op
     */
    @NotNull
    @Valid
    @Schema(name = "op", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("op")
    public DomesticVrpConsentsPatchRequestInnerOp getOp() {
        return op;
    }

    public void setOp(DomesticVrpConsentsPatchRequestInnerOp op) {
        this.op = op;
    }

    public DomesticVrpConsentsPatchRequestInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The path to the element to operate on as per [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901)
     *
     * @return path
     */
    @NotNull
    @Schema(name = "path", description = "The path to the element to operate on as per [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DomesticVrpConsentsPatchRequestInner from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The path to move or copy from as per [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901)
     *
     * @return from
     */

    @Schema(name = "from", description = "The path to move or copy from as per [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public DomesticVrpConsentsPatchRequestInner value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * The value to add, replace, or test against. This may be a single string or an array of strings
     *
     * @return value
     */

    @Schema(name = "value", description = "The value to add, replace, or test against. This may be a single string or an array of strings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomesticVrpConsentsPatchRequestInner domesticVrpConsentsPatchRequestInner = (DomesticVrpConsentsPatchRequestInner) o;
        return Objects.equals(this.op, domesticVrpConsentsPatchRequestInner.op) &&
                Objects.equals(this.path, domesticVrpConsentsPatchRequestInner.path) &&
                Objects.equals(this.from, domesticVrpConsentsPatchRequestInner.from) &&
                Objects.equals(this.value, domesticVrpConsentsPatchRequestInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(op, path, from, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomesticVrpConsentsPatchRequestInner {\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

