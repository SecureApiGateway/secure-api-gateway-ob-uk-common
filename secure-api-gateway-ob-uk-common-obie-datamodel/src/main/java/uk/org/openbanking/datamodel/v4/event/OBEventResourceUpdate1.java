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
package uk.org.openbanking.datamodel.v4.event;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Resource-Update Event.
 */

@Schema(name = "OBEventResourceUpdate1", description = "Resource-Update Event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventResourceUpdate1 {

    private OBEventSubject1 subject;

    public OBEventResourceUpdate1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventResourceUpdate1(OBEventSubject1 subject) {
        this.subject = subject;
    }

    public OBEventResourceUpdate1 subject(OBEventSubject1 subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get subject
     *
     * @return subject
     */
    @NotNull
    @Valid
    @Schema(name = "subject", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subject")
    public OBEventSubject1 getSubject() {
        return subject;
    }

    public void setSubject(OBEventSubject1 subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventResourceUpdate1 obEventResourceUpdate1 = (OBEventResourceUpdate1) o;
        return Objects.equals(this.subject, obEventResourceUpdate1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventResourceUpdate1 {\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

