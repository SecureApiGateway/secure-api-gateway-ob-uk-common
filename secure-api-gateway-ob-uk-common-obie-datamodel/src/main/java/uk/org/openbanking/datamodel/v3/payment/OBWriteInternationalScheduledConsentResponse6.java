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
package uk.org.openbanking.datamodel.v3.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import uk.org.openbanking.datamodel.v3.common.Links;
import uk.org.openbanking.datamodel.v3.common.Meta;
import uk.org.openbanking.datamodel.v3.common.OBRisk1;

/**
 * OBWriteInternationalScheduledConsentResponse6
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalScheduledConsentResponse6 {

    private OBWriteInternationalScheduledConsentResponse6Data data;

    private OBRisk1 risk;

    private Links links;

    private Meta meta;

    public OBWriteInternationalScheduledConsentResponse6() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalScheduledConsentResponse6(OBWriteInternationalScheduledConsentResponse6Data data, OBRisk1 risk) {
        this.data = data;
        this.risk = risk;
    }

    public OBWriteInternationalScheduledConsentResponse6 data(OBWriteInternationalScheduledConsentResponse6Data data) {
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
    public OBWriteInternationalScheduledConsentResponse6Data getData() {
        return data;
    }

    public void setData(OBWriteInternationalScheduledConsentResponse6Data data) {
        this.data = data;
    }

    public OBWriteInternationalScheduledConsentResponse6 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     */
    @NotNull
    @Valid
    @Schema(name = "Risk", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Risk")
    public OBRisk1 getRisk() {
        return risk;
    }

    public void setRisk(OBRisk1 risk) {
        this.risk = risk;
    }

    public OBWriteInternationalScheduledConsentResponse6 links(Links links) {
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

    public OBWriteInternationalScheduledConsentResponse6 meta(Meta meta) {
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
        OBWriteInternationalScheduledConsentResponse6 obWriteInternationalScheduledConsentResponse6 = (OBWriteInternationalScheduledConsentResponse6) o;
        return Objects.equals(this.data, obWriteInternationalScheduledConsentResponse6.data) &&
                Objects.equals(this.risk, obWriteInternationalScheduledConsentResponse6.risk) &&
                Objects.equals(this.links, obWriteInternationalScheduledConsentResponse6.links) &&
                Objects.equals(this.meta, obWriteInternationalScheduledConsentResponse6.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk, links, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsentResponse6 {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

