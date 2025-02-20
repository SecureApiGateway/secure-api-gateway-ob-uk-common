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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * OBReadBalance1Data
 */

@JsonTypeName("OBReadBalance1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadBalance1Data {

    @Valid
    private List<@Valid OBReadBalance1DataBalanceInner> balance = new ArrayList<>();

    private OBReadBalance1DataTotalValue totalValue;

    public OBReadBalance1Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadBalance1Data(List<@Valid OBReadBalance1DataBalanceInner> balance) {
        this.balance = balance;
    }

    public OBReadBalance1Data balance(List<@Valid OBReadBalance1DataBalanceInner> balance) {
        this.balance = balance;
        return this;
    }

    public OBReadBalance1Data addBalanceItem(OBReadBalance1DataBalanceInner balanceItem) {
        if (this.balance == null) {
            this.balance = new ArrayList<>();
        }
        this.balance.add(balanceItem);
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "Balance", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Balance")
    public List<@Valid OBReadBalance1DataBalanceInner> getBalance() {
        return balance;
    }

    public void setBalance(List<@Valid OBReadBalance1DataBalanceInner> balance) {
        this.balance = balance;
    }

    public OBReadBalance1Data totalValue(OBReadBalance1DataTotalValue totalValue) {
        this.totalValue = totalValue;
        return this;
    }

    /**
     * Get totalValue
     *
     * @return totalValue
     */
    @Valid
    @Schema(name = "TotalValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TotalValue")
    public OBReadBalance1DataTotalValue getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(OBReadBalance1DataTotalValue totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadBalance1Data obReadBalance1Data = (OBReadBalance1Data) o;
        return Objects.equals(this.balance, obReadBalance1Data.balance) &&
                Objects.equals(this.totalValue, obReadBalance1Data.totalValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, totalValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBalance1Data {\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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

