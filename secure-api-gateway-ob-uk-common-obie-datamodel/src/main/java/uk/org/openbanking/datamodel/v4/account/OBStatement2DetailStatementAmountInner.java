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

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */

@Schema(name = "OBStatement2Detail_StatementAmount_inner", description = "Set of elements used to provide details of a generic amount for the statement resource.")
@JsonTypeName("OBStatement2Detail_StatementAmount_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2DetailStatementAmountInner {

    private OBCreditDebitCode0 creditDebitIndicator;

    private String type;

    private OBActiveOrHistoricCurrencyAndAmount8 amount;

    private OBStatement2StatementAmountInnerLocalAmount localAmount;

    public OBStatement2DetailStatementAmountInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2DetailStatementAmountInner(OBCreditDebitCode0 creditDebitIndicator, String type, OBActiveOrHistoricCurrencyAndAmount8 amount) {
        this.creditDebitIndicator = creditDebitIndicator;
        this.type = type;
        this.amount = amount;
    }

    public OBStatement2DetailStatementAmountInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
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

    public OBStatement2DetailStatementAmountInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Amount type, in a coded form.
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", example = "UK.OBIE.CreditLimit", description = "Amount type, in a coded form.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2DetailStatementAmountInner amount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
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

    public OBStatement2DetailStatementAmountInner localAmount(OBStatement2StatementAmountInnerLocalAmount localAmount) {
        this.localAmount = localAmount;
        return this;
    }

    /**
     * Get localAmount
     *
     * @return localAmount
     */
    @Valid
    @Schema(name = "LocalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalAmount")
    public OBStatement2StatementAmountInnerLocalAmount getLocalAmount() {
        return localAmount;
    }

    public void setLocalAmount(OBStatement2StatementAmountInnerLocalAmount localAmount) {
        this.localAmount = localAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2DetailStatementAmountInner obStatement2DetailStatementAmountInner = (OBStatement2DetailStatementAmountInner) o;
        return Objects.equals(this.creditDebitIndicator, obStatement2DetailStatementAmountInner.creditDebitIndicator) &&
                Objects.equals(this.type, obStatement2DetailStatementAmountInner.type) &&
                Objects.equals(this.amount, obStatement2DetailStatementAmountInner.amount) &&
                Objects.equals(this.localAmount, obStatement2DetailStatementAmountInner.localAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditDebitIndicator, type, amount, localAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2DetailStatementAmountInner {\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    localAmount: ").append(toIndentedString(localAmount)).append("\n");
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

