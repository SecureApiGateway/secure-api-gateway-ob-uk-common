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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

/**
 * Set of elements used to identify a person or an organisation.
 */

@Schema(name = "OBWriteInternationalResponse5_Data_Refund_Creditor", description = "Set of elements used to identify a person or an organisation.")
@JsonTypeName("OBWriteInternationalResponse5_Data_Refund_Creditor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalResponse5DataRefundCreditor {

    private String name;

    private String LEI;

    private OBPostalAddress7 postalAddress;

    public OBWriteInternationalResponse5DataRefundCreditor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which a party is known and which is usually used to identify that party.
     *
     * @return name
     */
    @Size(min = 1, max = 140)
    @Schema(name = "Name", description = "Name by which a party is known and which is usually used to identify that party.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteInternationalResponse5DataRefundCreditor LEI(String LEI) {
        this.LEI = LEI;
        return this;
    }

    /**
     * Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
     *
     * @return LEI
     */
    @Pattern(regexp = "^[0-9]{4}[0]{2}[A-Z0-9]{12}[0-9]{2}")
    @Size(min = 1, max = 20)
    @Schema(name = "LEI", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LEI")
    public String getLEI() {
        return LEI;
    }

    public void setLEI(String LEI) {
        this.LEI = LEI;
    }

    public OBWriteInternationalResponse5DataRefundCreditor postalAddress(OBPostalAddress7 postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Get postalAddress
     *
     * @return postalAddress
     */
    @Valid
    @Schema(name = "PostalAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PostalAddress")
    public OBPostalAddress7 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress7 postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalResponse5DataRefundCreditor obWriteInternationalResponse5DataRefundCreditor = (OBWriteInternationalResponse5DataRefundCreditor) o;
        return Objects.equals(this.name, obWriteInternationalResponse5DataRefundCreditor.name) &&
                Objects.equals(this.LEI, obWriteInternationalResponse5DataRefundCreditor.LEI) &&
                Objects.equals(this.postalAddress, obWriteInternationalResponse5DataRefundCreditor.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, LEI, postalAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalResponse5DataRefundCreditor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

