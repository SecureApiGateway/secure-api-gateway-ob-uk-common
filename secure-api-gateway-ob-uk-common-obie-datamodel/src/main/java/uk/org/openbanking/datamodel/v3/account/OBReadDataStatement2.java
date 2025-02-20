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
package uk.org.openbanking.datamodel.v3.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadDataStatement2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadDataStatement2 {

    @Valid
    private List<@Valid OBStatement2> statement;

    public OBReadDataStatement2 statement(List<@Valid OBStatement2> statement) {
        this.statement = statement;
        return this;
    }

    public OBReadDataStatement2 addStatementItem(OBStatement2 statementItem) {
        if (this.statement == null) {
            this.statement = new ArrayList<>();
        }
        this.statement.add(statementItem);
        return this;
    }

    /**
     * Get statement
     *
     * @return statement
     */
    @Valid
    @Schema(name = "Statement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Statement")
    public List<@Valid OBStatement2> getStatement() {
        return statement;
    }

    public void setStatement(List<@Valid OBStatement2> statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDataStatement2 obReadDataStatement2 = (OBReadDataStatement2) o;
        return Objects.equals(this.statement, obReadDataStatement2.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDataStatement2 {\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

