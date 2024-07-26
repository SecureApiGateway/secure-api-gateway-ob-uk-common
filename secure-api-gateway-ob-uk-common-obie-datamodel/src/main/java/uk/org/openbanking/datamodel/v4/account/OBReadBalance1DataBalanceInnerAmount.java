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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 * Amount of money of the cash balance.
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner_Amount", description = "Amount of money of the cash balance.")
@JsonTypeName("OBReadBalance1_Data_Balance_inner_Amount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadBalance1DataBalanceInnerAmount {

    private String amount;

    private String currency;

    private OBReadBalance1DataBalanceInnerAmountSubType subType = OBReadBalance1DataBalanceInnerAmountSubType.BCUR;

    public OBReadBalance1DataBalanceInnerAmount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadBalance1DataBalanceInnerAmount(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public OBReadBalance1DataBalanceInnerAmount amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
     *
     * @return amount
     */
    @NotNull
    @Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    @Schema(name = "Amount", example = "1209.06", description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBReadBalance1DataBalanceInnerAmount currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
     *
     * @return currency
     */
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "Currency", example = "GBP", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OBReadBalance1DataBalanceInnerAmount subType(OBReadBalance1DataBalanceInnerAmountSubType subType) {
        this.subType = subType;
        return this;
    }

    /**
     * Get subType
     *
     * @return subType
     */
    @Valid
    @Schema(name = "SubType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SubType")
    public OBReadBalance1DataBalanceInnerAmountSubType getSubType() {
        return subType;
    }

    public void setSubType(OBReadBalance1DataBalanceInnerAmountSubType subType) {
        this.subType = subType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadBalance1DataBalanceInnerAmount obReadBalance1DataBalanceInnerAmount = (OBReadBalance1DataBalanceInnerAmount) o;
        return Objects.equals(this.amount, obReadBalance1DataBalanceInnerAmount.amount) &&
                Objects.equals(this.currency, obReadBalance1DataBalanceInnerAmount.currency) &&
                Objects.equals(this.subType, obReadBalance1DataBalanceInnerAmount.subType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, subType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBalance1DataBalanceInnerAmount {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

