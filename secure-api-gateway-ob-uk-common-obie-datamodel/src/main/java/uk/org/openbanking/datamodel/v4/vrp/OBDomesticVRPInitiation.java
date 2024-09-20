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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.common.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

/**
 * OBDomesticVRPInitiation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPInitiation {

    private OBCashAccountDebtorWithName debtorAccount;

    private OBCashAccountCreditor3 creditorAccount;

    private OBPostalAddress7 creditorPostalAddress;

    private OBUltimateCreditor1 ultimateCreditor;

    private OBUltimateDebtor1 ultimateDebtor;

    private OBRemittanceInformation2 remittanceInformation;

    @Valid
    private List<@Valid OBRegulatoryReporting1> regulatoryReporting;

    public OBDomesticVRPInitiation debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBCashAccountDebtorWithName getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBDomesticVRPInitiation creditorAccount(OBCashAccountCreditor3 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     */
    @Valid
    @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorAccount")
    public OBCashAccountCreditor3 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBDomesticVRPInitiation creditorPostalAddress(OBPostalAddress7 creditorPostalAddress) {
        this.creditorPostalAddress = creditorPostalAddress;
        return this;
    }

    /**
     * Get creditorPostalAddress
     *
     * @return creditorPostalAddress
     */
    @Valid
    @Schema(name = "CreditorPostalAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorPostalAddress")
    public OBPostalAddress7 getCreditorPostalAddress() {
        return creditorPostalAddress;
    }

    public void setCreditorPostalAddress(OBPostalAddress7 creditorPostalAddress) {
        this.creditorPostalAddress = creditorPostalAddress;
    }

    public OBDomesticVRPInitiation ultimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
        this.ultimateCreditor = ultimateCreditor;
        return this;
    }

    /**
     * Get ultimateCreditor
     *
     * @return ultimateCreditor
     */
    @Valid
    @Schema(name = "UltimateCreditor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UltimateCreditor")
    public OBUltimateCreditor1 getUltimateCreditor() {
        return ultimateCreditor;
    }

    public void setUltimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
        this.ultimateCreditor = ultimateCreditor;
    }

    public OBDomesticVRPInitiation ultimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
        return this;
    }

    /**
     * Get ultimateDebtor
     *
     * @return ultimateDebtor
     */
    @Valid
    @Schema(name = "UltimateDebtor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UltimateDebtor")
    public OBUltimateDebtor1 getUltimateDebtor() {
        return ultimateDebtor;
    }

    public void setUltimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
    }

    public OBDomesticVRPInitiation remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     *
     * @return remittanceInformation
     */
    @Valid
    @Schema(name = "RemittanceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RemittanceInformation")
    public OBRemittanceInformation2 getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public OBDomesticVRPInitiation regulatoryReporting(List<@Valid OBRegulatoryReporting1> regulatoryReporting) {
        this.regulatoryReporting = regulatoryReporting;
        return this;
    }

    public OBDomesticVRPInitiation addRegulatoryReportingItem(OBRegulatoryReporting1 regulatoryReportingItem) {
        if (this.regulatoryReporting == null) {
            this.regulatoryReporting = new ArrayList<>();
        }
        this.regulatoryReporting.add(regulatoryReportingItem);
        return this;
    }

    /**
     * Get regulatoryReporting
     *
     * @return regulatoryReporting
     */
    @Valid
    @Size(max = 10)
    @Schema(name = "RegulatoryReporting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RegulatoryReporting")
    public List<@Valid OBRegulatoryReporting1> getRegulatoryReporting() {
        return regulatoryReporting;
    }

    public void setRegulatoryReporting(List<@Valid OBRegulatoryReporting1> regulatoryReporting) {
        this.regulatoryReporting = regulatoryReporting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPInitiation obDomesticVRPInitiation = (OBDomesticVRPInitiation) o;
        return Objects.equals(this.debtorAccount, obDomesticVRPInitiation.debtorAccount) &&
                Objects.equals(this.creditorAccount, obDomesticVRPInitiation.creditorAccount) &&
                Objects.equals(this.creditorPostalAddress, obDomesticVRPInitiation.creditorPostalAddress) &&
                Objects.equals(this.ultimateCreditor, obDomesticVRPInitiation.ultimateCreditor) &&
                Objects.equals(this.ultimateDebtor, obDomesticVRPInitiation.ultimateDebtor) &&
                Objects.equals(this.remittanceInformation, obDomesticVRPInitiation.remittanceInformation) &&
                Objects.equals(this.regulatoryReporting, obDomesticVRPInitiation.regulatoryReporting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debtorAccount, creditorAccount, creditorPostalAddress, ultimateCreditor, ultimateDebtor, remittanceInformation, regulatoryReporting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPInitiation {\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    creditorPostalAddress: ").append(toIndentedString(creditorPostalAddress)).append("\n");
        sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
        sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
        sb.append("    regulatoryReporting: ").append(toIndentedString(regulatoryReporting)).append("\n");
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

