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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBInternalChargeBearerType1Code;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.
 */

@Schema(name = "OBWriteInternationalScheduledConsentResponse6_Data_Initiation", description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.")
@JsonTypeName("OBWriteInternationalScheduledConsentResponse6_Data_Initiation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalScheduledConsentResponse6DataInitiation {

    private String instructionIdentification;

    private String endToEndIdentification;

    private String localInstrument;

    private OBWriteInternational3DataInitiationInstructionPriority instructionPriority;

    private String purpose;

    private String extendedPurpose;

    private OBInternalChargeBearerType1Code chargeBearer;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime requestedExecutionDateTime;

    private String currencyOfTransfer;

    private String destinationCountryCode;

    private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount;

    private OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation;

    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount;

    private OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor;

    private OBWriteDomestic2DataInitiationCreditorAgent creditorAgent;

    private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount;

    private OBUltimateCreditor1 ultimateCreditor;

    private OBUltimateDebtor1 ultimateDebtor;

    @Valid
    private List<@Valid OBRegulatoryReporting1> regulatoryReporting;

    private OBRemittanceInformation2 remittanceInformation;

    private OBSupplementaryData1 supplementaryData;

    public OBWriteInternationalScheduledConsentResponse6DataInitiation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalScheduledConsentResponse6DataInitiation(String instructionIdentification, DateTime requestedExecutionDateTime, String currencyOfTransfer, OBWriteDomestic2DataInitiationInstructedAmount instructedAmount, OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.instructionIdentification = instructionIdentification;
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        this.currencyOfTransfer = currencyOfTransfer;
        this.instructedAmount = instructedAmount;
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation instructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
        return this;
    }

    /**
     * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
     *
     * @return instructionIdentification
     */
    @NotNull
    @Size(min = 1, max = 35)
    @Schema(name = "InstructionIdentification", description = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("InstructionIdentification")
    public String getInstructionIdentification() {
        return instructionIdentification;
    }

    public void setInstructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation endToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    /**
     * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
     *
     * @return endToEndIdentification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "EndToEndIdentification", description = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("EndToEndIdentification")
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
     *
     * @return localInstrument
     */

    @Schema(name = "LocalInstrument", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalInstrument")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation instructionPriority(OBWriteInternational3DataInitiationInstructionPriority instructionPriority) {
        this.instructionPriority = instructionPriority;
        return this;
    }

    /**
     * Get instructionPriority
     *
     * @return instructionPriority
     */
    @Valid
    @Schema(name = "InstructionPriority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("InstructionPriority")
    public OBWriteInternational3DataInitiationInstructionPriority getInstructionPriority() {
        return instructionPriority;
    }

    public void setInstructionPriority(OBWriteInternational3DataInitiationInstructionPriority instructionPriority) {
        this.instructionPriority = instructionPriority;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
     *
     * @return purpose
     */
    @Size(min = 1, max = 4)
    @Schema(name = "Purpose", description = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Purpose")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation extendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
        return this;
    }

    /**
     * Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.
     *
     * @return extendedPurpose
     */
    @Size(min = 1, max = 140)
    @Schema(name = "ExtendedPurpose", description = "Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExtendedPurpose")
    public String getExtendedPurpose() {
        return extendedPurpose;
    }

    public void setExtendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation chargeBearer(OBInternalChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     */
    @Valid
    @Schema(name = "ChargeBearer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ChargeBearer")
    public OBInternalChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBInternalChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        return this;
    }

    /**
     * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return requestedExecutionDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "RequestedExecutionDateTime", description = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("RequestedExecutionDateTime")
    public DateTime getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation currencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
     *
     * @return currencyOfTransfer
     */
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "CurrencyOfTransfer", description = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CurrencyOfTransfer")
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation destinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
        return this;
    }

    /**
     * Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
     *
     * @return destinationCountryCode
     */
    @Pattern(regexp = "[A-Z]{2,2}")
    @Schema(name = "DestinationCountryCode", description = "Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DestinationCountryCode")
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     */
    @NotNull
    @Valid
    @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("InstructedAmount")
    public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation exchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     */
    @Valid
    @Schema(name = "ExchangeRateInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExchangeRateInformation")
    public OBWriteInternational3DataInitiationExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
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
    public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation creditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     */
    @Valid
    @Schema(name = "Creditor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Creditor")
    public OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation creditorAgent(OBWriteDomestic2DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     */
    @Valid
    @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorAgent")
    public OBWriteDomestic2DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteDomestic2DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation creditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
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
    public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation ultimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
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

    public OBWriteInternationalScheduledConsentResponse6DataInitiation ultimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
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

    public OBWriteInternationalScheduledConsentResponse6DataInitiation regulatoryReporting(List<@Valid OBRegulatoryReporting1> regulatoryReporting) {
        this.regulatoryReporting = regulatoryReporting;
        return this;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation addRegulatoryReportingItem(OBRegulatoryReporting1 regulatoryReportingItem) {
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

    public OBWriteInternationalScheduledConsentResponse6DataInitiation remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
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

    public OBWriteInternationalScheduledConsentResponse6DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
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
        OBWriteInternationalScheduledConsentResponse6DataInitiation obWriteInternationalScheduledConsentResponse6DataInitiation = (OBWriteInternationalScheduledConsentResponse6DataInitiation) o;
        return Objects.equals(this.instructionIdentification, obWriteInternationalScheduledConsentResponse6DataInitiation.instructionIdentification) &&
                Objects.equals(this.endToEndIdentification, obWriteInternationalScheduledConsentResponse6DataInitiation.endToEndIdentification) &&
                Objects.equals(this.localInstrument, obWriteInternationalScheduledConsentResponse6DataInitiation.localInstrument) &&
                Objects.equals(this.instructionPriority, obWriteInternationalScheduledConsentResponse6DataInitiation.instructionPriority) &&
                Objects.equals(this.purpose, obWriteInternationalScheduledConsentResponse6DataInitiation.purpose) &&
                Objects.equals(this.extendedPurpose, obWriteInternationalScheduledConsentResponse6DataInitiation.extendedPurpose) &&
                Objects.equals(this.chargeBearer, obWriteInternationalScheduledConsentResponse6DataInitiation.chargeBearer) &&
                Objects.equals(this.requestedExecutionDateTime, obWriteInternationalScheduledConsentResponse6DataInitiation.requestedExecutionDateTime) &&
                Objects.equals(this.currencyOfTransfer, obWriteInternationalScheduledConsentResponse6DataInitiation.currencyOfTransfer) &&
                Objects.equals(this.destinationCountryCode, obWriteInternationalScheduledConsentResponse6DataInitiation.destinationCountryCode) &&
                Objects.equals(this.instructedAmount, obWriteInternationalScheduledConsentResponse6DataInitiation.instructedAmount) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledConsentResponse6DataInitiation.exchangeRateInformation) &&
                Objects.equals(this.debtorAccount, obWriteInternationalScheduledConsentResponse6DataInitiation.debtorAccount) &&
                Objects.equals(this.creditor, obWriteInternationalScheduledConsentResponse6DataInitiation.creditor) &&
                Objects.equals(this.creditorAgent, obWriteInternationalScheduledConsentResponse6DataInitiation.creditorAgent) &&
                Objects.equals(this.creditorAccount, obWriteInternationalScheduledConsentResponse6DataInitiation.creditorAccount) &&
                Objects.equals(this.ultimateCreditor, obWriteInternationalScheduledConsentResponse6DataInitiation.ultimateCreditor) &&
                Objects.equals(this.ultimateDebtor, obWriteInternationalScheduledConsentResponse6DataInitiation.ultimateDebtor) &&
                Objects.equals(this.regulatoryReporting, obWriteInternationalScheduledConsentResponse6DataInitiation.regulatoryReporting) &&
                Objects.equals(this.remittanceInformation, obWriteInternationalScheduledConsentResponse6DataInitiation.remittanceInformation) &&
                Objects.equals(this.supplementaryData, obWriteInternationalScheduledConsentResponse6DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructionPriority, purpose, extendedPurpose, chargeBearer, requestedExecutionDateTime, currencyOfTransfer, destinationCountryCode, instructedAmount, exchangeRateInformation, debtorAccount, creditor, creditorAgent, creditorAccount, ultimateCreditor, ultimateDebtor, regulatoryReporting, remittanceInformation, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsentResponse6DataInitiation {\n");
        sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
        sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    extendedPurpose: ").append(toIndentedString(extendedPurpose)).append("\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
        sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
        sb.append("    regulatoryReporting: ").append(toIndentedString(regulatoryReporting)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

