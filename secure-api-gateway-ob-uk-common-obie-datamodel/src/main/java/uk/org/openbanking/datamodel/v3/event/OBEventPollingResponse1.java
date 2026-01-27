/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OBEventPollingResponse1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventPollingResponse1 {

    private Boolean moreAvailable;

    @Valid
    private Map<String, String> sets = new HashMap<>();

    public OBEventPollingResponse1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventPollingResponse1(Boolean moreAvailable, Map<String, String> sets) {
        this.moreAvailable = moreAvailable;
        this.sets = sets;
    }

    public OBEventPollingResponse1 moreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
        return this;
    }

    /**
     * A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
     *
     * @return moreAvailable
     */
    @NotNull
    @Schema(name = "moreAvailable", description = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("moreAvailable")
    public Boolean getMoreAvailable() {
        return moreAvailable;
    }

    public void setMoreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
    }

    public OBEventPollingResponse1 sets(Map<String, String> sets) {
        this.sets = sets;
        return this;
    }

    public OBEventPollingResponse1 putSetsItem(String key, String setsItem) {
        if (this.sets == null) {
            this.sets = new HashMap<>();
        }
        this.sets.put(key, setsItem);
        return this;
    }

    /**
     * A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
     *
     * @return sets
     */
    @NotNull
    @Schema(name = "sets", description = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sets")
    public Map<String, String> getSets() {
        return sets;
    }

    public void setSets(Map<String, String> sets) {
        this.sets = sets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPollingResponse1 obEventPollingResponse1 = (OBEventPollingResponse1) o;
        return Objects.equals(this.moreAvailable, obEventPollingResponse1.moreAvailable) &&
                Objects.equals(this.sets, obEventPollingResponse1.sets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moreAvailable, sets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPollingResponse1 {\n");
        sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
        sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
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

