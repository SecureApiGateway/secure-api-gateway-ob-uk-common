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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBEventSubscriptionsResponse1Data
 */

@JsonTypeName("OBEventSubscriptionsResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventSubscriptionsResponse1Data {

    @Valid
    private List<@Valid OBEventSubscriptionsResponse1DataEventSubscriptionInner> eventSubscription;

    public OBEventSubscriptionsResponse1Data eventSubscription(List<@Valid OBEventSubscriptionsResponse1DataEventSubscriptionInner> eventSubscription) {
        this.eventSubscription = eventSubscription;
        return this;
    }

    public OBEventSubscriptionsResponse1Data addEventSubscriptionItem(OBEventSubscriptionsResponse1DataEventSubscriptionInner eventSubscriptionItem) {
        if (this.eventSubscription == null) {
            this.eventSubscription = new ArrayList<>();
        }
        this.eventSubscription.add(eventSubscriptionItem);
        return this;
    }

    /**
     * Get eventSubscription
     *
     * @return eventSubscription
     */
    @Valid
    @Schema(name = "EventSubscription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("EventSubscription")
    public List<@Valid OBEventSubscriptionsResponse1DataEventSubscriptionInner> getEventSubscription() {
        return eventSubscription;
    }

    public void setEventSubscription(List<@Valid OBEventSubscriptionsResponse1DataEventSubscriptionInner> eventSubscription) {
        this.eventSubscription = eventSubscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscriptionsResponse1Data obEventSubscriptionsResponse1Data = (OBEventSubscriptionsResponse1Data) o;
        return Objects.equals(this.eventSubscription, obEventSubscriptionsResponse1Data.eventSubscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscriptionsResponse1Data {\n");
        sb.append("    eventSubscription: ").append(toIndentedString(eventSubscription)).append("\n");
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

