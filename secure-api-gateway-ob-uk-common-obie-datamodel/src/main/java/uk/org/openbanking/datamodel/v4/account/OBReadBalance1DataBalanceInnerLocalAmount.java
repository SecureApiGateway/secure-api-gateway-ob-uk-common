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
 * Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner_LocalAmount", description = "Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified")
@JsonTypeName("OBReadBalance1_Data_Balance_inner_LocalAmount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadBalance1DataBalanceInnerLocalAmount {

    private String amount;

    private String currency;

    private OBReadBalance1DataBalanceInnerLocalAmountSubType subType = OBReadBalance1DataBalanceInnerLocalAmountSubType.LCUR;

    public OBReadBalance1DataBalanceInnerLocalAmount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadBalance1DataBalanceInnerLocalAmount(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public OBReadBalance1DataBalanceInnerLocalAmount amount(String amount) {
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

    public OBReadBalance1DataBalanceInnerLocalAmount currency(String currency) {
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

    public OBReadBalance1DataBalanceInnerLocalAmount subType(OBReadBalance1DataBalanceInnerLocalAmountSubType subType) {
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
    public OBReadBalance1DataBalanceInnerLocalAmountSubType getSubType() {
        return subType;
    }

    public void setSubType(OBReadBalance1DataBalanceInnerLocalAmountSubType subType) {
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
        OBReadBalance1DataBalanceInnerLocalAmount obReadBalance1DataBalanceInnerLocalAmount = (OBReadBalance1DataBalanceInnerLocalAmount) o;
        return Objects.equals(this.amount, obReadBalance1DataBalanceInnerLocalAmount.amount) &&
                Objects.equals(this.currency, obReadBalance1DataBalanceInnerLocalAmount.currency) &&
                Objects.equals(this.subType, obReadBalance1DataBalanceInnerLocalAmount.subType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, subType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBalance1DataBalanceInnerLocalAmount {\n");
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

