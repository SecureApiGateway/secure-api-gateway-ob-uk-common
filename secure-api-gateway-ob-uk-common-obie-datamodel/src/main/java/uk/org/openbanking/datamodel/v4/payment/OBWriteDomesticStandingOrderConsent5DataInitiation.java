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
package uk.org.openbanking.datamodel.v4.payment;

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
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.
 */

@Schema(name = "OBWriteDomesticStandingOrderConsent5_Data_Initiation", description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.")
@JsonTypeName("OBWriteDomesticStandingOrderConsent5_Data_Initiation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrderConsent5DataInitiation {

    private OBRemittanceInformation2 remittanceInformation;

    private OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount;

    private OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount;

    private OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount;

    private OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount;

    private OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount;

    private OBUltimateCreditor1 ultimateCreditor;

    private OBUltimateDebtor1 ultimateDebtor;

    @Valid
    private List<@Valid OBRegulatoryReporting1> regulatoryReporting;

    private OBMandateRelatedInformation1 mandateRelatedInformation;

    private OBSupplementaryData1 supplementaryData;

    public OBWriteDomesticStandingOrderConsent5DataInitiation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticStandingOrderConsent5DataInitiation(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount, OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        this.firstPaymentAmount = firstPaymentAmount;
        this.creditorAccount = creditorAccount;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
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

    public OBWriteDomesticStandingOrderConsent5DataInitiation firstPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
        return this;
    }

    /**
     * Get firstPaymentAmount
     *
     * @return firstPaymentAmount
     */
    @NotNull
    @Valid
    @Schema(name = "FirstPaymentAmount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FirstPaymentAmount")
    public OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation recurringPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount) {
        this.recurringPaymentAmount = recurringPaymentAmount;
        return this;
    }

    /**
     * Get recurringPaymentAmount
     *
     * @return recurringPaymentAmount
     */
    @Valid
    @Schema(name = "RecurringPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RecurringPaymentAmount")
    public OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount getRecurringPaymentAmount() {
        return recurringPaymentAmount;
    }

    public void setRecurringPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount) {
        this.recurringPaymentAmount = recurringPaymentAmount;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation finalPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
        return this;
    }

    /**
     * Get finalPaymentAmount
     *
     * @return finalPaymentAmount
     */
    @Valid
    @Schema(name = "FinalPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FinalPaymentAmount")
    public OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation debtorAccount(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
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
    public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation creditorAccount(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     */
    @NotNull
    @Valid
    @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreditorAccount")
    public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation ultimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
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

    public OBWriteDomesticStandingOrderConsent5DataInitiation ultimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
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

    public OBWriteDomesticStandingOrderConsent5DataInitiation regulatoryReporting(List<@Valid OBRegulatoryReporting1> regulatoryReporting) {
        this.regulatoryReporting = regulatoryReporting;
        return this;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation addRegulatoryReportingItem(OBRegulatoryReporting1 regulatoryReportingItem) {
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

    public OBWriteDomesticStandingOrderConsent5DataInitiation mandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
        this.mandateRelatedInformation = mandateRelatedInformation;
        return this;
    }

    /**
     * Get mandateRelatedInformation
     *
     * @return mandateRelatedInformation
     */
    @Valid
    @Schema(name = "MandateRelatedInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MandateRelatedInformation")
    public OBMandateRelatedInformation1 getMandateRelatedInformation() {
        return mandateRelatedInformation;
    }

    public void setMandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
        this.mandateRelatedInformation = mandateRelatedInformation;
    }

    public OBWriteDomesticStandingOrderConsent5DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     */
    @Valid
    @Schema(name = "SupplementaryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SupplementaryData")
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
        OBWriteDomesticStandingOrderConsent5DataInitiation obWriteDomesticStandingOrderConsent5DataInitiation = (OBWriteDomesticStandingOrderConsent5DataInitiation) o;
        return Objects.equals(this.remittanceInformation, obWriteDomesticStandingOrderConsent5DataInitiation.remittanceInformation) &&
                Objects.equals(this.firstPaymentAmount, obWriteDomesticStandingOrderConsent5DataInitiation.firstPaymentAmount) &&
                Objects.equals(this.recurringPaymentAmount, obWriteDomesticStandingOrderConsent5DataInitiation.recurringPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obWriteDomesticStandingOrderConsent5DataInitiation.finalPaymentAmount) &&
                Objects.equals(this.debtorAccount, obWriteDomesticStandingOrderConsent5DataInitiation.debtorAccount) &&
                Objects.equals(this.creditorAccount, obWriteDomesticStandingOrderConsent5DataInitiation.creditorAccount) &&
                Objects.equals(this.ultimateCreditor, obWriteDomesticStandingOrderConsent5DataInitiation.ultimateCreditor) &&
                Objects.equals(this.ultimateDebtor, obWriteDomesticStandingOrderConsent5DataInitiation.ultimateDebtor) &&
                Objects.equals(this.regulatoryReporting, obWriteDomesticStandingOrderConsent5DataInitiation.regulatoryReporting) &&
                Objects.equals(this.mandateRelatedInformation, obWriteDomesticStandingOrderConsent5DataInitiation.mandateRelatedInformation) &&
                Objects.equals(this.supplementaryData, obWriteDomesticStandingOrderConsent5DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remittanceInformation, firstPaymentAmount, recurringPaymentAmount, finalPaymentAmount, debtorAccount, creditorAccount, ultimateCreditor, ultimateDebtor, regulatoryReporting, mandateRelatedInformation, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderConsent5DataInitiation {\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    recurringPaymentAmount: ").append(toIndentedString(recurringPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
        sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
        sb.append("    regulatoryReporting: ").append(toIndentedString(regulatoryReporting)).append("\n");
        sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
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

