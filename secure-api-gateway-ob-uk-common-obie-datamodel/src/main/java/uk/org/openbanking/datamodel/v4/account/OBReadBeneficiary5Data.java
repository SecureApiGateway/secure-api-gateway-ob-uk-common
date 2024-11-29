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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadBeneficiary5Data
 */

@JsonTypeName("OBReadBeneficiary5_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadBeneficiary5Data {

    @Valid
    private List<@Valid OBBeneficiary5> beneficiary;

    public OBReadBeneficiary5Data beneficiary(List<@Valid OBBeneficiary5> beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    public OBReadBeneficiary5Data addBeneficiaryItem(OBBeneficiary5 beneficiaryItem) {
        if (this.beneficiary == null) {
            this.beneficiary = new ArrayList<>();
        }
        this.beneficiary.add(beneficiaryItem);
        return this;
    }

    /**
     * Get beneficiary
     *
     * @return beneficiary
     */
    @Valid
    @Schema(name = "Beneficiary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Beneficiary")
    public List<@Valid OBBeneficiary5> getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(List<@Valid OBBeneficiary5> beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadBeneficiary5Data obReadBeneficiary5Data = (OBReadBeneficiary5Data) o;
        return Objects.equals(this.beneficiary, obReadBeneficiary5Data.beneficiary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBeneficiary5Data {\n");
        sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

