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
package uk.org.openbanking.datamodel.v4.event;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Resource links to other available versions of the resource.
 */

@Schema(name = "OBEventLink1", description = "Resource links to other available versions of the resource.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventLink1 {

    private String version;

    private String link;

    public OBEventLink1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventLink1(String version, String link) {
        this.version = version;
        this.link = link;
    }

    public OBEventLink1 version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Resource version.
     *
     * @return version
     */
    @NotNull
    @Size(min = 1, max = 10)
    @Schema(name = "version", description = "Resource version.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OBEventLink1 link(String link) {
        this.link = link;
        return this;
    }

    /**
     * Resource link.
     *
     * @return link
     */
    @NotNull
    @Schema(name = "link", description = "Resource link.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventLink1 obEventLink1 = (OBEventLink1) o;
        return Objects.equals(this.version, obEventLink1.version) &&
                Objects.equals(this.link, obEventLink1.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventLink1 {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

