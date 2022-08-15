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
package uk.org.openbanking.datamodel.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBReadBalance1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")

public class OBReadBalance1Data {
    @JsonProperty("Balance")
    @Valid
    private List<OBReadBalance1DataBalance> balance = new ArrayList<OBReadBalance1DataBalance>();

    public OBReadBalance1Data balance(List<OBReadBalance1DataBalance> balance) {
        this.balance = balance;
        return this;
    }

    public OBReadBalance1Data addBalanceItem(OBReadBalance1DataBalance balanceItem) {
        this.balance.add(balanceItem);
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OBReadBalance1DataBalance> getBalance() {
        return balance;
    }

    public void setBalance(List<OBReadBalance1DataBalance> balance) {
        this.balance = balance;
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
        return Objects.equals(this.balance, obReadBalance1Data.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBalance1Data {\n");

        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

