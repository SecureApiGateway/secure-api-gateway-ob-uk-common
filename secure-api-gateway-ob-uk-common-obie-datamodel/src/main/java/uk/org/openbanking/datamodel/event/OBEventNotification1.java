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
package uk.org.openbanking.datamodel.event;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * The resource-update event.
 */

@Schema(name = "OBEventNotification1", description = "The resource-update event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventNotification1 {

    private String iss;

    private Integer iat;

    private String jti;

    private String aud;

    private URI sub;

    private String txn;

    private Integer toe;

    private OBEvent1 events;

    public OBEventNotification1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventNotification1(String iss, Integer iat, String jti, String aud, URI sub, String txn, Integer toe, OBEvent1 events) {
        this.iss = iss;
        this.iat = iat;
        this.jti = jti;
        this.aud = aud;
        this.sub = sub;
        this.txn = txn;
        this.toe = toe;
        this.events = events;
    }

    public OBEventNotification1 iss(String iss) {
        this.iss = iss;
        return this;
    }

    /**
     * Issuer.
     *
     * @return iss
     */
    @NotNull
    @Schema(name = "iss", description = "Issuer.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("iss")
    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public OBEventNotification1 iat(Integer iat) {
        this.iat = iat;
        return this;
    }

    /**
     * Issued At.
     * minimum: 0
     *
     * @return iat
     */
    @NotNull
    @Min(0)
    @Schema(name = "iat", description = "Issued At. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("iat")
    public Integer getIat() {
        return iat;
    }

    public void setIat(Integer iat) {
        this.iat = iat;
    }

    public OBEventNotification1 jti(String jti) {
        this.jti = jti;
        return this;
    }

    /**
     * JWT ID.
     *
     * @return jti
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "jti", description = "JWT ID.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("jti")
    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public OBEventNotification1 aud(String aud) {
        this.aud = aud;
        return this;
    }

    /**
     * Audience.
     *
     * @return aud
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "aud", description = "Audience.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("aud")
    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public OBEventNotification1 sub(URI sub) {
        this.sub = sub;
        return this;
    }

    /**
     * Subject
     *
     * @return sub
     */
    @NotNull
    @Valid
    @Schema(name = "sub", description = "Subject", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sub")
    public URI getSub() {
        return sub;
    }

    public void setSub(URI sub) {
        this.sub = sub;
    }

    public OBEventNotification1 txn(String txn) {
        this.txn = txn;
        return this;
    }

    /**
     * Transaction Identifier.
     *
     * @return txn
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "txn", description = "Transaction Identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("txn")
    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }

    public OBEventNotification1 toe(Integer toe) {
        this.toe = toe;
        return this;
    }

    /**
     * Time of Event.
     * minimum: 0
     *
     * @return toe
     */
    @NotNull
    @Min(0)
    @Schema(name = "toe", description = "Time of Event.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("toe")
    public Integer getToe() {
        return toe;
    }

    public void setToe(Integer toe) {
        this.toe = toe;
    }

    public OBEventNotification1 events(OBEvent1 events) {
        this.events = events;
        return this;
    }

    /**
     * Get events
     *
     * @return events
     */
    @NotNull
    @Valid
    @Schema(name = "events", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public OBEvent1 getEvents() {
        return events;
    }

    public void setEvents(OBEvent1 events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventNotification1 obEventNotification1 = (OBEventNotification1) o;
        return Objects.equals(this.iss, obEventNotification1.iss) &&
                Objects.equals(this.iat, obEventNotification1.iat) &&
                Objects.equals(this.jti, obEventNotification1.jti) &&
                Objects.equals(this.aud, obEventNotification1.aud) &&
                Objects.equals(this.sub, obEventNotification1.sub) &&
                Objects.equals(this.txn, obEventNotification1.txn) &&
                Objects.equals(this.toe, obEventNotification1.toe) &&
                Objects.equals(this.events, obEventNotification1.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iss, iat, jti, aud, sub, txn, toe, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventNotification1 {\n");
        sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
        sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
        sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
        sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
        sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
        sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
        sb.append("    toe: ").append(toIndentedString(toe)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

