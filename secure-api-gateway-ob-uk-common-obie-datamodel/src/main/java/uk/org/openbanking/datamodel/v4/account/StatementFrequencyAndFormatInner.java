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
package uk.org.openbanking.datamodel.v4.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

/**
 * Frequency and format of statments for an account
 */

@Schema(name = "StatementFrequencyAndFormat_inner", description = "Frequency and format of statments for an account")
@JsonTypeName("StatementFrequencyAndFormat_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatementFrequencyAndFormatInner {

    private OBFrequency2 frequency;

    private OBCommunicationMethod communicationMethod;

    private OBFileFormat format;

    private OBPostalAddress7 deliveryAddress;

    public StatementFrequencyAndFormatInner frequency(OBFrequency2 frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
     * @return frequency
     */
    @Valid
    @Schema(name = "Frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Frequency")
    public OBFrequency2 getFrequency() {
        return frequency;
    }

    public void setFrequency(OBFrequency2 frequency) {
        this.frequency = frequency;
    }

    public StatementFrequencyAndFormatInner communicationMethod(OBCommunicationMethod communicationMethod) {
        this.communicationMethod = communicationMethod;
        return this;
    }

    /**
     * Get communicationMethod
     *
     * @return communicationMethod
     */
    @Valid
    @Schema(name = "CommunicationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CommunicationMethod")
    public OBCommunicationMethod getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(OBCommunicationMethod communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public StatementFrequencyAndFormatInner format(OBFileFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get format
     *
     * @return format
     */
    @Valid
    @Schema(name = "Format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Format")
    public OBFileFormat getFormat() {
        return format;
    }

    public void setFormat(OBFileFormat format) {
        this.format = format;
    }

    public StatementFrequencyAndFormatInner deliveryAddress(OBPostalAddress7 deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    /**
     * Get deliveryAddress
     *
     * @return deliveryAddress
     */
    @Valid
    @Schema(name = "DeliveryAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DeliveryAddress")
    public OBPostalAddress7 getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(OBPostalAddress7 deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatementFrequencyAndFormatInner statementFrequencyAndFormatInner = (StatementFrequencyAndFormatInner) o;
        return Objects.equals(this.frequency, statementFrequencyAndFormatInner.frequency) &&
                Objects.equals(this.communicationMethod, statementFrequencyAndFormatInner.communicationMethod) &&
                Objects.equals(this.format, statementFrequencyAndFormatInner.format) &&
                Objects.equals(this.deliveryAddress, statementFrequencyAndFormatInner.deliveryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, communicationMethod, format, deliveryAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementFrequencyAndFormatInner {\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    communicationMethod: ").append(toIndentedString(communicationMethod)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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

