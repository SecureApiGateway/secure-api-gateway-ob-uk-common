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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import uk.org.openbanking.datamodel.v4.common.OBRisk1;

/**
 * OBWriteDomesticStandingOrder3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrder3 {

    private OBWriteDomesticStandingOrder3Data data;

    private OBRisk1 risk;

    public OBWriteDomesticStandingOrder3() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticStandingOrder3(OBWriteDomesticStandingOrder3Data data, OBRisk1 risk) {
        this.data = data;
        this.risk = risk;
    }

    public OBWriteDomesticStandingOrder3 data(OBWriteDomesticStandingOrder3Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @NotNull
    @Valid
    @Schema(name = "Data", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Data")
    public OBWriteDomesticStandingOrder3Data getData() {
        return data;
    }

    public void setData(OBWriteDomesticStandingOrder3Data data) {
        this.data = data;
    }

    public OBWriteDomesticStandingOrder3 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     */
    @NotNull
    @Valid
    @Schema(name = "Risk", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Risk")
    public OBRisk1 getRisk() {
        return risk;
    }

    public void setRisk(OBRisk1 risk) {
        this.risk = risk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrder3 obWriteDomesticStandingOrder3 = (OBWriteDomesticStandingOrder3) o;
        return Objects.equals(this.data, obWriteDomesticStandingOrder3.data) &&
                Objects.equals(this.risk, obWriteDomesticStandingOrder3.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrder3 {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

