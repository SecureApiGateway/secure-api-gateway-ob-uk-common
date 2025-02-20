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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * OBEventSubscriptionResponse1Data
 */

@JsonTypeName("OBEventSubscriptionResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventSubscriptionResponse1Data {

    private String eventSubscriptionId;

    private URI callbackUrl;

    private String version;

    @Valid
    private List<String> eventTypes;

    public OBEventSubscriptionResponse1Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventSubscriptionResponse1Data(String eventSubscriptionId, String version) {
        this.eventSubscriptionId = eventSubscriptionId;
        this.version = version;
    }

    public OBEventSubscriptionResponse1Data eventSubscriptionId(String eventSubscriptionId) {
        this.eventSubscriptionId = eventSubscriptionId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the callback URL resource.
     *
     * @return eventSubscriptionId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "EventSubscriptionId", description = "Unique identification as assigned by the ASPSP to uniquely identify the callback URL resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("EventSubscriptionId")
    public String getEventSubscriptionId() {
        return eventSubscriptionId;
    }

    public void setEventSubscriptionId(String eventSubscriptionId) {
        this.eventSubscriptionId = eventSubscriptionId;
    }

    public OBEventSubscriptionResponse1Data callbackUrl(URI callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
     *
     * @return callbackUrl
     */
    @Valid
    @Schema(name = "CallbackUrl", description = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CallbackUrl")
    public URI getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(URI callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public OBEventSubscriptionResponse1Data version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Version for the event notification.
     *
     * @return version
     */
    @NotNull
    @Size(min = 1, max = 10)
    @Schema(name = "Version", description = "Version for the event notification.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OBEventSubscriptionResponse1Data eventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public OBEventSubscriptionResponse1Data addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    /**
     * Get eventTypes
     *
     * @return eventTypes
     */

    @Schema(name = "EventTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("EventTypes")
    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscriptionResponse1Data obEventSubscriptionResponse1Data = (OBEventSubscriptionResponse1Data) o;
        return Objects.equals(this.eventSubscriptionId, obEventSubscriptionResponse1Data.eventSubscriptionId) &&
                Objects.equals(this.callbackUrl, obEventSubscriptionResponse1Data.callbackUrl) &&
                Objects.equals(this.version, obEventSubscriptionResponse1Data.version) &&
                Objects.equals(this.eventTypes, obEventSubscriptionResponse1Data.eventTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubscriptionId, callbackUrl, version, eventTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscriptionResponse1Data {\n");
        sb.append("    eventSubscriptionId: ").append(toIndentedString(eventSubscriptionId)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

