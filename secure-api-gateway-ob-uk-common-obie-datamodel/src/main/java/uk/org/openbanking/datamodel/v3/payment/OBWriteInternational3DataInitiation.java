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
package uk.org.openbanking.datamodel.v3.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single international payment.
 */

@Schema(name = "OBWriteInternational3_Data_Initiation", description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single international payment.")
@JsonTypeName("OBWriteInternational3_Data_Initiation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternational3DataInitiation {

    private String instructionIdentification;

    private String endToEndIdentification;

    private String localInstrument;

    private OBWriteInternational3DataInitiationInstructionPriority instructionPriority;

    private String purpose;

    private String extendedPurpose;

    private OBChargeBearerType1Code chargeBearer;

    private String currencyOfTransfer;

    private String destinationCountryCode;

    private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount;

    private OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation;

    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount;

    private OBWriteInternational3DataInitiationCreditor creditor;

    private OBWriteInternational3DataInitiationCreditorAgent creditorAgent;

    private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount;

    private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation;

    private OBSupplementaryData1 supplementaryData;

    public OBWriteInternational3DataInitiation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternational3DataInitiation(String instructionIdentification, String endToEndIdentification, String currencyOfTransfer, OBWriteDomestic2DataInitiationInstructedAmount instructedAmount, OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.instructionIdentification = instructionIdentification;
        this.endToEndIdentification = endToEndIdentification;
        this.currencyOfTransfer = currencyOfTransfer;
        this.instructedAmount = instructedAmount;
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternational3DataInitiation instructionIdentification(String instructionIdentification) {
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

    public OBWriteInternational3DataInitiation endToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    /**
     * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
     *
     * @return endToEndIdentification
     */
    @NotNull
    @Size(min = 1, max = 35)
    @Schema(name = "EndToEndIdentification", description = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("EndToEndIdentification")
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public OBWriteInternational3DataInitiation localInstrument(String localInstrument) {
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

    public OBWriteInternational3DataInitiation instructionPriority(OBWriteInternational3DataInitiationInstructionPriority instructionPriority) {
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

    public OBWriteInternational3DataInitiation purpose(String purpose) {
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

    public OBWriteInternational3DataInitiation extendedPurpose(String extendedPurpose) {
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

    public OBWriteInternational3DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
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
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBWriteInternational3DataInitiation currencyOfTransfer(String currencyOfTransfer) {
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

    public OBWriteInternational3DataInitiation destinationCountryCode(String destinationCountryCode) {
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

    public OBWriteInternational3DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
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

    public OBWriteInternational3DataInitiation exchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
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

    public OBWriteInternational3DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
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

    public OBWriteInternational3DataInitiation creditor(OBWriteInternational3DataInitiationCreditor creditor) {
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
    public OBWriteInternational3DataInitiationCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternational3DataInitiationCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternational3DataInitiation creditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
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
    public OBWriteInternational3DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteInternational3DataInitiation creditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
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

    public OBWriteInternational3DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
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
    public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public OBWriteInternational3DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
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
        OBWriteInternational3DataInitiation obWriteInternational3DataInitiation = (OBWriteInternational3DataInitiation) o;
        return Objects.equals(this.instructionIdentification, obWriteInternational3DataInitiation.instructionIdentification) &&
                Objects.equals(this.endToEndIdentification, obWriteInternational3DataInitiation.endToEndIdentification) &&
                Objects.equals(this.localInstrument, obWriteInternational3DataInitiation.localInstrument) &&
                Objects.equals(this.instructionPriority, obWriteInternational3DataInitiation.instructionPriority) &&
                Objects.equals(this.purpose, obWriteInternational3DataInitiation.purpose) &&
                Objects.equals(this.extendedPurpose, obWriteInternational3DataInitiation.extendedPurpose) &&
                Objects.equals(this.chargeBearer, obWriteInternational3DataInitiation.chargeBearer) &&
                Objects.equals(this.currencyOfTransfer, obWriteInternational3DataInitiation.currencyOfTransfer) &&
                Objects.equals(this.destinationCountryCode, obWriteInternational3DataInitiation.destinationCountryCode) &&
                Objects.equals(this.instructedAmount, obWriteInternational3DataInitiation.instructedAmount) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternational3DataInitiation.exchangeRateInformation) &&
                Objects.equals(this.debtorAccount, obWriteInternational3DataInitiation.debtorAccount) &&
                Objects.equals(this.creditor, obWriteInternational3DataInitiation.creditor) &&
                Objects.equals(this.creditorAgent, obWriteInternational3DataInitiation.creditorAgent) &&
                Objects.equals(this.creditorAccount, obWriteInternational3DataInitiation.creditorAccount) &&
                Objects.equals(this.remittanceInformation, obWriteInternational3DataInitiation.remittanceInformation) &&
                Objects.equals(this.supplementaryData, obWriteInternational3DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructionPriority, purpose, extendedPurpose, chargeBearer, currencyOfTransfer, destinationCountryCode, instructedAmount, exchangeRateInformation, debtorAccount, creditor, creditorAgent, creditorAccount, remittanceInformation, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational3DataInitiation {\n");
        sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
        sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    extendedPurpose: ").append(toIndentedString(extendedPurpose)).append("\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

