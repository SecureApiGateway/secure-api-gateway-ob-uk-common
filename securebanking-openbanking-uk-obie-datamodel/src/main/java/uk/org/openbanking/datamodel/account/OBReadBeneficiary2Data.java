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

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBReadBeneficiary2Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBReadBeneficiary2Data {
    @JsonProperty("Beneficiary")
    @Valid
    private List<OBBeneficiary2> beneficiary = null;

    public OBReadBeneficiary2Data beneficiary(List<OBBeneficiary2> beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    public OBReadBeneficiary2Data addBeneficiaryItem(OBBeneficiary2 beneficiaryItem) {
        if (this.beneficiary == null) {
            this.beneficiary = new ArrayList<OBBeneficiary2>();
        }
        this.beneficiary.add(beneficiaryItem);
        return this;
    }

    /**
     * Get beneficiary
     *
     * @return beneficiary
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<OBBeneficiary2> getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(List<OBBeneficiary2> beneficiary) {
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
        OBReadBeneficiary2Data obReadBeneficiary2Data = (OBReadBeneficiary2Data) o;
        return Objects.equals(this.beneficiary, obReadBeneficiary2Data.beneficiary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBeneficiary2Data {\n");

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

