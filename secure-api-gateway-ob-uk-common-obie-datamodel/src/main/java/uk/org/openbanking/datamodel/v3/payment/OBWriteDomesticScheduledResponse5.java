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
package uk.org.openbanking.datamodel.v3.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import uk.org.openbanking.datamodel.v3.common.Links;
import uk.org.openbanking.datamodel.v3.common.Meta;

/**
 * OBWriteDomesticScheduledResponse5
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticScheduledResponse5 {

    private OBWriteDomesticScheduledResponse5Data data;

    private Links links;

    private Meta meta;

    public OBWriteDomesticScheduledResponse5() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticScheduledResponse5(OBWriteDomesticScheduledResponse5Data data) {
        this.data = data;
    }

    public OBWriteDomesticScheduledResponse5 data(OBWriteDomesticScheduledResponse5Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @NotNull
    @Valid
    @Schema(name = "Data", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Data")
    public OBWriteDomesticScheduledResponse5Data getData() {
        return data;
    }

    public void setData(OBWriteDomesticScheduledResponse5Data data) {
        this.data = data;
    }

    public OBWriteDomesticScheduledResponse5 links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     *
     * @return links
     */
    @Valid
    @Schema(name = "Links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Links")
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public OBWriteDomesticScheduledResponse5 meta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     *
     * @return meta
     */
    @Valid
    @Schema(name = "Meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Meta")
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticScheduledResponse5 obWriteDomesticScheduledResponse5 = (OBWriteDomesticScheduledResponse5) o;
        return Objects.equals(this.data, obWriteDomesticScheduledResponse5.data) &&
                Objects.equals(this.links, obWriteDomesticScheduledResponse5.links) &&
                Objects.equals(this.meta, obWriteDomesticScheduledResponse5.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, links, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticScheduledResponse5 {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

