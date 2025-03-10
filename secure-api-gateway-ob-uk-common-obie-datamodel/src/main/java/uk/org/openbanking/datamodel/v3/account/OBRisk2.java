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

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import uk.org.openbanking.jackson.v3.account.OBRisk2Deserializer;
import uk.org.openbanking.jackson.v3.account.OBRisk2Serializer;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
 */
@ApiModel(description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

@JsonDeserialize(using = OBRisk2Deserializer.class)
@JsonSerialize(using = OBRisk2Serializer.class)
public class OBRisk2 {

    private String data = "{}";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRisk2 {\n");
        sb.append(data);
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

