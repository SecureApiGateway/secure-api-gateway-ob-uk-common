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
package uk.org.openbanking.datamodel.v3.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Amount of money associated with the charge type.
 */
@ApiModel(description = "Amount of money associated with the charge type.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")

public class OBActiveOrHistoricCurrencyAndAmount {
    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("Currency")
    private String currency;

    public OBActiveOrHistoricCurrencyAndAmount amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
     *
     * @return amount
     */
    @ApiModelProperty(required = true, value = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
    @NotNull
    @Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBActiveOrHistoricCurrencyAndAmount currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
     *
     * @return currency
     */
    @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBActiveOrHistoricCurrencyAndAmount obActiveOrHistoricCurrencyAndAmount = (OBActiveOrHistoricCurrencyAndAmount) o;
        return Objects.equals(this.amount, obActiveOrHistoricCurrencyAndAmount.amount) &&
                Objects.equals(this.currency, obActiveOrHistoricCurrencyAndAmount.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBActiveOrHistoricCurrencyAndAmount {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

