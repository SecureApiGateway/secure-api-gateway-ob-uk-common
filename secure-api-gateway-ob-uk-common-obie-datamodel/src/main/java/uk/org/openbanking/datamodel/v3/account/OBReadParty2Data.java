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
package uk.org.openbanking.datamodel.v3.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadParty2Data
 */

@JsonTypeName("OBReadParty2_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadParty2Data {

    private OBParty2 party;

    public OBReadParty2Data party(OBParty2 party) {
        this.party = party;
        return this;
    }

    /**
     * Get party
     *
     * @return party
     */
    @Valid
    @Schema(name = "Party", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Party")
    public OBParty2 getParty() {
        return party;
    }

    public void setParty(OBParty2 party) {
        this.party = party;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadParty2Data obReadParty2Data = (OBReadParty2Data) o;
        return Objects.equals(this.party, obReadParty2Data.party);
    }

    @Override
    public int hashCode() {
        return Objects.hash(party);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadParty2Data {\n");
        sb.append("    party: ").append(toIndentedString(party)).append("\n");
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

