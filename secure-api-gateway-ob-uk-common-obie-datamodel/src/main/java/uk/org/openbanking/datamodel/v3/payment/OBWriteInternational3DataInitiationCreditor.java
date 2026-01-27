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
package uk.org.openbanking.datamodel.v3.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBPostalAddress6;

/**
 * Party to which an amount of money is due.
 */

@Schema(name = "OBWriteInternational3_Data_Initiation_Creditor", description = "Party to which an amount of money is due.")
@JsonTypeName("OBWriteInternational3_Data_Initiation_Creditor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternational3DataInitiationCreditor {

    private String name;

    private OBPostalAddress6 postalAddress;

    public OBWriteInternational3DataInitiationCreditor name(String name) {
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

    public OBWriteInternational3DataInitiationCreditor postalAddress(OBPostalAddress6 postalAddress) {
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
    public OBPostalAddress6 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 postalAddress) {
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
        OBWriteInternational3DataInitiationCreditor obWriteInternational3DataInitiationCreditor = (OBWriteInternational3DataInitiationCreditor) o;
        return Objects.equals(this.name, obWriteInternational3DataInitiationCreditor.name) &&
                Objects.equals(this.postalAddress, obWriteInternational3DataInitiationCreditor.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postalAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational3DataInitiationCreditor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

