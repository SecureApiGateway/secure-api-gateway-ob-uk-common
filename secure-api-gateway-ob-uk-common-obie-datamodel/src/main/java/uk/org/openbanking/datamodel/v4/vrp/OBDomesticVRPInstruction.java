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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v4.common.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;

/**
 * OBDomesticVRPInstruction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPInstruction {

    private String instructionIdentification;

    private String endToEndIdentification;

    private OBRemittanceInformation2 remittanceInformation;

    private String localInstrument;

    private OBActiveOrHistoricCurrencyAndAmount instructedAmount;

    private OBPostalAddress7 creditorPostalAddress;

    private OBCashAccountCreditor3 creditorAccount;

    private OBUltimateCreditor1 ultimateCreditor;

    private OBSupplementaryData1 supplementaryData;

    public OBDomesticVRPInstruction() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPInstruction(String instructionIdentification, String endToEndIdentification, OBActiveOrHistoricCurrencyAndAmount instructedAmount, OBCashAccountCreditor3 creditorAccount) {
        this.instructionIdentification = instructionIdentification;
        this.endToEndIdentification = endToEndIdentification;
        this.instructedAmount = instructedAmount;
        this.creditorAccount = creditorAccount;
    }

    public OBDomesticVRPInstruction instructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
        return this;
    }

    /**
     * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
     *
     * @return instructionIdentification
     */
    @NotNull
    @Size(min = 1, max = 35)
    @Schema(name = "InstructionIdentification", description = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("InstructionIdentification")
    public String getInstructionIdentification() {
        return instructionIdentification;
    }

    public void setInstructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
    }

    public OBDomesticVRPInstruction endToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    /**
     * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field
     *
     * @return endToEndIdentification
     */
    @NotNull
    @Size(min = 1, max = 35)
    @Schema(name = "EndToEndIdentification", description = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("EndToEndIdentification")
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public OBDomesticVRPInstruction remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
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

    public OBDomesticVRPInstruction localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return localInstrument
     */

    @Schema(name = "LocalInstrument", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalInstrument")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBDomesticVRPInstruction instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
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
    public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public OBDomesticVRPInstruction creditorPostalAddress(OBPostalAddress7 creditorPostalAddress) {
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

    public OBDomesticVRPInstruction creditorAccount(OBCashAccountCreditor3 creditorAccount) {
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
    public OBCashAccountCreditor3 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBDomesticVRPInstruction ultimateCreditor(OBUltimateCreditor1 ultimateCreditor) {
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

    public OBDomesticVRPInstruction supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Additional information that can not be captured in the structured fields and/or any other specific block.
     *
     * @return supplementaryData
     */

    @Schema(name = "SupplementaryData", description = "Additional information that can not be captured in the structured fields and/or any other specific block. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        OBDomesticVRPInstruction obDomesticVRPInstruction = (OBDomesticVRPInstruction) o;
        return Objects.equals(this.instructionIdentification, obDomesticVRPInstruction.instructionIdentification) &&
                Objects.equals(this.endToEndIdentification, obDomesticVRPInstruction.endToEndIdentification) &&
                Objects.equals(this.remittanceInformation, obDomesticVRPInstruction.remittanceInformation) &&
                Objects.equals(this.localInstrument, obDomesticVRPInstruction.localInstrument) &&
                Objects.equals(this.instructedAmount, obDomesticVRPInstruction.instructedAmount) &&
                Objects.equals(this.creditorPostalAddress, obDomesticVRPInstruction.creditorPostalAddress) &&
                Objects.equals(this.creditorAccount, obDomesticVRPInstruction.creditorAccount) &&
                Objects.equals(this.ultimateCreditor, obDomesticVRPInstruction.ultimateCreditor) &&
                Objects.equals(this.supplementaryData, obDomesticVRPInstruction.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionIdentification, endToEndIdentification, remittanceInformation, localInstrument, instructedAmount, creditorPostalAddress, creditorAccount, ultimateCreditor, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPInstruction {\n");
        sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
        sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    creditorPostalAddress: ").append(toIndentedString(creditorPostalAddress)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
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

