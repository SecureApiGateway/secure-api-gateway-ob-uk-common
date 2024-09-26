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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import uk.org.openbanking.datamodel.v4.common.OBInternalChargeBearerType1Code;

/**
 * OBCharge2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBCharge2 {

    private OBInternalChargeBearerType1Code chargeBearer;

    public OBCharge2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBCharge2(OBInternalChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBCharge2 chargeBearer(OBInternalChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     */
    @NotNull
    @Valid
    @Schema(name = "ChargeBearer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ChargeBearer")
    public OBInternalChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBInternalChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBCharge2 obCharge2 = (OBCharge2) o;
        return Objects.equals(this.chargeBearer, obCharge2.chargeBearer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeBearer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCharge2 {\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
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

