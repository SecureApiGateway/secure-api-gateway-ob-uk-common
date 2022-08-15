/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBRisk1;

/**
 * OBWriteDomesticStandingOrderConsent1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBWriteDomesticStandingOrderConsent1 {
    @JsonProperty("Data")
    private OBWriteDataDomesticStandingOrderConsent1 data = null;

    @JsonProperty("Risk")
    private OBRisk1 risk = null;

    public OBWriteDomesticStandingOrderConsent1 data(OBWriteDataDomesticStandingOrderConsent1 data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBWriteDataDomesticStandingOrderConsent1 getData() {
        return data;
    }

    public void setData(OBWriteDataDomesticStandingOrderConsent1 data) {
        this.data = data;
    }

    public OBWriteDomesticStandingOrderConsent1 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     **/
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
        OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1 = (OBWriteDomesticStandingOrderConsent1) o;
        return Objects.equals(this.data, obWriteDomesticStandingOrderConsent1.data) &&
                Objects.equals(this.risk, obWriteDomesticStandingOrderConsent1.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderConsent1 {\n");

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

