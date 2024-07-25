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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Entity requiring the regulatory reporting information.
 */

@Schema(name = "OBRegulatoryAuthority2", description = "Entity requiring the regulatory reporting information. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRegulatoryAuthority2 {

    private String name;

    private String countryCode;

    public OBRegulatoryAuthority2 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the entity requiring the regulatory reporting information.
     *
     * @return name
     */
    @Size(min = 1, max = 140)
    @Schema(name = "Name", description = "Name of the entity requiring the regulatory reporting information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBRegulatoryAuthority2 countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Nation with its own government.
     *
     * @return countryCode
     */
    @Pattern(regexp = "^[A-Z]{2,2}$")
    @Schema(name = "CountryCode", description = "Nation with its own government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRegulatoryAuthority2 obRegulatoryAuthority2 = (OBRegulatoryAuthority2) o;
        return Objects.equals(this.name, obRegulatoryAuthority2.name) &&
                Objects.equals(this.countryCode, obRegulatoryAuthority2.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRegulatoryAuthority2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

