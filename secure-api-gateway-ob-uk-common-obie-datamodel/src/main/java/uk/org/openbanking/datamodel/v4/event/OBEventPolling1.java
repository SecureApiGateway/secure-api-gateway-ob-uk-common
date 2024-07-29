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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * OBEventPolling1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventPolling1 {

    private Integer maxEvents;

    private Boolean returnImmediately;

    @Valid
    private List<@Size(min = 1, max = 128) String> ack;

    @Valid
    private Map<String, OBEventPolling1SetErrsValue> setErrs = new HashMap<>();

    public OBEventPolling1 maxEvents(Integer maxEvents) {
        this.maxEvents = maxEvents;
        return this;
    }

    /**
     * Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available
     *
     * @return maxEvents
     */

    @Schema(name = "maxEvents", description = "Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maxEvents")
    public Integer getMaxEvents() {
        return maxEvents;
    }

    public void setMaxEvents(Integer maxEvents) {
        this.maxEvents = maxEvents;
    }

    public OBEventPolling1 returnImmediately(Boolean returnImmediately) {
        this.returnImmediately = returnImmediately;
        return this;
    }

    /**
     * Indicates whether an ASPSP should return a response immediately or provide a long poll
     *
     * @return returnImmediately
     */

    @Schema(name = "returnImmediately", description = "Indicates whether an ASPSP should return a response immediately or provide a long poll", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("returnImmediately")
    public Boolean getReturnImmediately() {
        return returnImmediately;
    }

    public void setReturnImmediately(Boolean returnImmediately) {
        this.returnImmediately = returnImmediately;
    }

    public OBEventPolling1 ack(List<@Size(min = 1, max = 128) String> ack) {
        this.ack = ack;
        return this;
    }

    public OBEventPolling1 addAckItem(String ackItem) {
        if (this.ack == null) {
            this.ack = new ArrayList<>();
        }
        this.ack.add(ackItem);
        return this;
    }

    /**
     * Get ack
     *
     * @return ack
     */

    @Schema(name = "ack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ack")
    public List<@Size(min = 1, max = 128) String> getAck() {
        return ack;
    }

    public void setAck(List<@Size(min = 1, max = 128) String> ack) {
        this.ack = ack;
    }

    public OBEventPolling1 setErrs(Map<String, OBEventPolling1SetErrsValue> setErrs) {
        this.setErrs = setErrs;
        return this;
    }

    public OBEventPolling1 putSetErrsItem(String key, OBEventPolling1SetErrsValue setErrsItem) {
        if (this.setErrs == null) {
            this.setErrs = new HashMap<>();
        }
        this.setErrs.put(key, setErrsItem);
        return this;
    }

    /**
     * An object that encapsulates all negative acknowledgements transmitted by the TPP
     *
     * @return setErrs
     */
    @Valid
    @Schema(name = "setErrs", description = "An object that encapsulates all negative acknowledgements transmitted by the TPP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("setErrs")
    public Map<String, OBEventPolling1SetErrsValue> getSetErrs() {
        return setErrs;
    }

    public void setSetErrs(Map<String, OBEventPolling1SetErrsValue> setErrs) {
        this.setErrs = setErrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPolling1 obEventPolling1 = (OBEventPolling1) o;
        return Objects.equals(this.maxEvents, obEventPolling1.maxEvents) &&
                Objects.equals(this.returnImmediately, obEventPolling1.returnImmediately) &&
                Objects.equals(this.ack, obEventPolling1.ack) &&
                Objects.equals(this.setErrs, obEventPolling1.setErrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxEvents, returnImmediately, ack, setErrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPolling1 {\n");
        sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
        sb.append("    returnImmediately: ").append(toIndentedString(returnImmediately)).append("\n");
        sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
        sb.append("    setErrs: ").append(toIndentedString(setErrs)).append("\n");
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

