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
package uk.org.openbanking.datamodel.v4.common;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Links relevant to the payload
 */

@Schema(name = "Links", description = "Links relevant to the payload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Links {

    private URI self;

    private URI first;

    private URI prev;

    private URI next;

    private URI last;

    public Links() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Links(URI self) {
        this.self = self;
    }

    public Links self(URI self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     *
     * @return self
     */
    @NotNull
    @Valid
    @Schema(name = "Self", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Self")
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    public Links first(URI first) {
        this.first = first;
        return this;
    }

    /**
     * Get first
     *
     * @return first
     */
    @Valid
    @Schema(name = "First", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("First")
    public URI getFirst() {
        return first;
    }

    public void setFirst(URI first) {
        this.first = first;
    }

    public Links prev(URI prev) {
        this.prev = prev;
        return this;
    }

    /**
     * Get prev
     *
     * @return prev
     */
    @Valid
    @Schema(name = "Prev", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Prev")
    public URI getPrev() {
        return prev;
    }

    public void setPrev(URI prev) {
        this.prev = prev;
    }

    public Links next(URI next) {
        this.next = next;
        return this;
    }

    /**
     * Get next
     *
     * @return next
     */
    @Valid
    @Schema(name = "Next", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Next")
    public URI getNext() {
        return next;
    }

    public void setNext(URI next) {
        this.next = next;
    }

    public Links last(URI last) {
        this.last = last;
        return this;
    }

    /**
     * Get last
     *
     * @return last
     */
    @Valid
    @Schema(name = "Last", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Last")
    public URI getLast() {
        return last;
    }

    public void setLast(URI last) {
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Links links = (Links) o;
        return Objects.equals(this.self, links.self) &&
                Objects.equals(this.first, links.first) &&
                Objects.equals(this.prev, links.prev) &&
                Objects.equals(this.next, links.next) &&
                Objects.equals(this.last, links.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, first, prev, next, last);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    first: ").append(toIndentedString(first)).append("\n");
        sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

