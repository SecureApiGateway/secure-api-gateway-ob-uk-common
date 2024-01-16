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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBRisk1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteInternational3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternational3 {
    @JsonProperty("Data")
    private OBWriteInternational3Data data;

    @JsonProperty("Risk")
    private OBRisk1 risk;

    public OBWriteInternational3 data(OBWriteInternational3Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBWriteInternational3Data getData() {
        return data;
    }

    public void setData(OBWriteInternational3Data data) {
        this.data = data;
    }

    public OBWriteInternational3 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

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
        OBWriteInternational3 obWriteInternational3 = (OBWriteInternational3) o;
        return Objects.equals(this.data, obWriteInternational3.data) &&
                Objects.equals(this.risk, obWriteInternational3.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational3 {\n");

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

