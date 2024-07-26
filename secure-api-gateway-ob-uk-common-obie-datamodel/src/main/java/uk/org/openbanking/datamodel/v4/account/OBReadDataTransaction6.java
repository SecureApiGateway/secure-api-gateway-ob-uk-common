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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadDataTransaction6
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadDataTransaction6 {

    @Valid
    private List<@Valid OBTransaction6> transaction;

    public OBReadDataTransaction6 transaction(List<@Valid OBTransaction6> transaction) {
        this.transaction = transaction;
        return this;
    }

    public OBReadDataTransaction6 addTransactionItem(OBTransaction6 transactionItem) {
        if (this.transaction == null) {
            this.transaction = new ArrayList<>();
        }
        this.transaction.add(transactionItem);
        return this;
    }

    /**
     * Get transaction
     *
     * @return transaction
     */
    @Valid
    @Schema(name = "Transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Transaction")
    public List<@Valid OBTransaction6> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<@Valid OBTransaction6> transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDataTransaction6 obReadDataTransaction6 = (OBReadDataTransaction6) o;
        return Objects.equals(this.transaction, obReadDataTransaction6.transaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDataTransaction6 {\n");
        sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

