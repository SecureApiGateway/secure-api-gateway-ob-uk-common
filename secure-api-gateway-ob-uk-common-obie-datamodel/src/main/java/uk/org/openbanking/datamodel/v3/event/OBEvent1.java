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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Events.
 */

@Schema(name = "OBEvent1", description = "Events.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEvent1 {

    private OBEventResourceUpdate1 urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate;

    public OBEvent1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEvent1(OBEventResourceUpdate1 urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate) {
        this.urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate = urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate;
    }

    public OBEvent1 urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate(OBEventResourceUpdate1 urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate) {
        this.urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate = urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate;
        return this;
    }

    /**
     * Get urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate
     *
     * @return urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate
     */
    @NotNull
    @Valid
    @Schema(name = "urn:uk:org:openbanking:events:resource-update", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("urn:uk:org:openbanking:events:resource-update")
    public OBEventResourceUpdate1 getUrnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate() {
        return urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate;
    }

    public void setUrnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate(OBEventResourceUpdate1 urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate) {
        this.urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate = urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEvent1 obEvent1 = (OBEvent1) o;
        return Objects.equals(this.urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate, obEvent1.urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEvent1 {\n");
        sb.append("    urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate: ").append(toIndentedString(urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate)).append("\n");
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

