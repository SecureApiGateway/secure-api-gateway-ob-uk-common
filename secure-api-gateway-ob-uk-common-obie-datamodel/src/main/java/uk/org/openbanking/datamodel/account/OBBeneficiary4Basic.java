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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.3-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBBeneficiary4Basic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBBeneficiary4Basic {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("BeneficiaryId")
    private String beneficiaryId = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBBeneficiary4Basic accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBBeneficiary4Basic beneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
        return this;
    }

    /**
     * Get beneficiaryId
     *
     * @return beneficiaryId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public OBBeneficiary4Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get reference
     *
     * @return reference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBBeneficiary4Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBeneficiary4Basic obBeneficiary4Basic = (OBBeneficiary4Basic) o;
        return Objects.equals(this.accountId, obBeneficiary4Basic.accountId) &&
                Objects.equals(this.beneficiaryId, obBeneficiary4Basic.beneficiaryId) &&
                Objects.equals(this.reference, obBeneficiary4Basic.reference) &&
                Objects.equals(this.supplementaryData, obBeneficiary4Basic.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, beneficiaryId, reference, supplementaryData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBeneficiary4Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

