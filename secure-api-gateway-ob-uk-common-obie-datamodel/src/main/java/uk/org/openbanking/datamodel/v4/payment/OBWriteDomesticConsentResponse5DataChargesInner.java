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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;

/**
 * Set of elements used to provide details of a charge for the payment initiation.
 */

@Schema(name = "OBWriteDomesticConsentResponse5_Data_Charges_inner", description = "Set of elements used to provide details of a charge for the payment initiation.")
@JsonTypeName("OBWriteDomesticConsentResponse5_Data_Charges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticConsentResponse5DataChargesInner {

    private OBInternalChargeBearerType1Code chargeBearer;

    private String type;

    private OBActiveOrHistoricCurrencyAndAmount amount;

    public OBWriteDomesticConsentResponse5DataChargesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticConsentResponse5DataChargesInner(OBInternalChargeBearerType1Code chargeBearer, String type, OBActiveOrHistoricCurrencyAndAmount amount) {
        this.chargeBearer = chargeBearer;
        this.type = type;
        this.amount = amount;
    }

    public OBWriteDomesticConsentResponse5DataChargesInner chargeBearer(OBInternalChargeBearerType1Code chargeBearer) {
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

    public OBWriteDomesticConsentResponse5DataChargesInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Charge type, in a coded form. For a full list of values refer to `OBInternalPaymentChargeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", description = "Charge type, in a coded form. For a full list of values refer to `OBInternalPaymentChargeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBWriteDomesticConsentResponse5DataChargesInner amount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @NotNull
    @Valid
    @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticConsentResponse5DataChargesInner obWriteDomesticConsentResponse5DataChargesInner = (OBWriteDomesticConsentResponse5DataChargesInner) o;
        return Objects.equals(this.chargeBearer, obWriteDomesticConsentResponse5DataChargesInner.chargeBearer) &&
                Objects.equals(this.type, obWriteDomesticConsentResponse5DataChargesInner.type) &&
                Objects.equals(this.amount, obWriteDomesticConsentResponse5DataChargesInner.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeBearer, type, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticConsentResponse5DataChargesInner {\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

