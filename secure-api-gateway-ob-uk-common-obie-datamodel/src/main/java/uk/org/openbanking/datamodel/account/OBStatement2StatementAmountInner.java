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
package uk.org.openbanking.datamodel.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */

@Schema(name = "OBStatement2_StatementAmount_inner", description = "Set of elements used to provide details of a generic amount for the statement resource.")
@JsonTypeName("OBStatement2_StatementAmount_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2StatementAmountInner {

    private OBCreditDebitCode0 creditDebitIndicator;

    private String type;

    private OBActiveOrHistoricCurrencyAndAmount8 amount;

    public OBStatement2StatementAmountInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2StatementAmountInner(OBCreditDebitCode0 creditDebitIndicator, String type, OBActiveOrHistoricCurrencyAndAmount8 amount) {
        this.creditDebitIndicator = creditDebitIndicator;
        this.type = type;
        this.amount = amount;
    }

    public OBStatement2StatementAmountInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     */
    @NotNull
    @Valid
    @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreditDebitIndicator")
    public OBCreditDebitCode0 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBStatement2StatementAmountInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Amount type, in a coded form.
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", description = "Amount type, in a coded form.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2StatementAmountInner amount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
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
    public OBActiveOrHistoricCurrencyAndAmount8 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
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
        OBStatement2StatementAmountInner obStatement2StatementAmountInner = (OBStatement2StatementAmountInner) o;
        return Objects.equals(this.creditDebitIndicator, obStatement2StatementAmountInner.creditDebitIndicator) &&
                Objects.equals(this.type, obStatement2StatementAmountInner.type) &&
                Objects.equals(this.amount, obStatement2StatementAmountInner.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditDebitIndicator, type, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementAmountInner {\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
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

