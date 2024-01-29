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
 * Set of elements used to provide details on the credit line.
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner_CreditLine_inner", description = "Set of elements used to provide details on the credit line.")
@JsonTypeName("OBReadBalance1_Data_Balance_inner_CreditLine_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadBalance1DataBalanceInnerCreditLineInner {

    private Boolean included;

    private OBReadBalance1DataBalanceInnerCreditLineInnerType type;

    private OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount;

    public OBReadBalance1DataBalanceInnerCreditLineInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadBalance1DataBalanceInnerCreditLineInner(Boolean included) {
        this.included = included;
    }

    public OBReadBalance1DataBalanceInnerCreditLineInner included(Boolean included) {
        this.included = included;
        return this;
    }

    /**
     * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
     *
     * @return included
     */
    @NotNull
    @Schema(name = "Included", description = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Included")
    public Boolean getIncluded() {
        return included;
    }

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    public OBReadBalance1DataBalanceInnerCreditLineInner type(OBReadBalance1DataBalanceInnerCreditLineInnerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @Valid
    @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Type")
    public OBReadBalance1DataBalanceInnerCreditLineInnerType getType() {
        return type;
    }

    public void setType(OBReadBalance1DataBalanceInnerCreditLineInnerType type) {
        this.type = type;
    }

    public OBReadBalance1DataBalanceInnerCreditLineInner amount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @Valid
    @Schema(name = "Amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Amount")
    public OBReadBalance1DataBalanceInnerCreditLineInnerAmount getAmount() {
        return amount;
    }

    public void setAmount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
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
        OBReadBalance1DataBalanceInnerCreditLineInner obReadBalance1DataBalanceInnerCreditLineInner = (OBReadBalance1DataBalanceInnerCreditLineInner) o;
        return Objects.equals(this.included, obReadBalance1DataBalanceInnerCreditLineInner.included) &&
                Objects.equals(this.type, obReadBalance1DataBalanceInnerCreditLineInner.type) &&
                Objects.equals(this.amount, obReadBalance1DataBalanceInnerCreditLineInner.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(included, type, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBalance1DataBalanceInnerCreditLineInner {\n");
        sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

