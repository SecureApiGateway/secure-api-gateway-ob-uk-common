/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * The Party&#39;s relationships with other resources.
 */

@Schema(name = "OBPartyRelationships1", description = "The Party's relationships with other resources.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBPartyRelationships1 {

    private OBPartyRelationships1Account account;

    public OBPartyRelationships1 account(OBPartyRelationships1Account account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     *
     * @return account
     */
    @Valid
    @Schema(name = "Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Account")
    public OBPartyRelationships1Account getAccount() {
        return account;
    }

    public void setAccount(OBPartyRelationships1Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBPartyRelationships1 obPartyRelationships1 = (OBPartyRelationships1) o;
        return Objects.equals(this.account, obPartyRelationships1.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBPartyRelationships1 {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

