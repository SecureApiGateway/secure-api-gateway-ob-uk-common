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
package uk.org.openbanking.datamodel.v3.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Tier Band Details
 */

@Schema(name = "TierBand_inner_1", description = "Tier Band Details")
@JsonTypeName("TierBand_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TierBandInner1 {

    private String identification;

    private String tierValueMinimum;

    private String tierValueMaximum;

    private CalculationFrequency3 calculationFrequency;

    private ApplicationFrequency3 applicationFrequency;

    private DepositInterestAppliedCoverage1 depositInterestAppliedCoverage;

    private FixedVariableInterestRateType fixedVariableInterestRateType;

    private String AER;

    private BankInterestRateType1 bankInterestRateType;

    private String bankInterestRate;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OtherBankInterestType otherBankInterestType;

    private OtherApplicationFrequency otherApplicationFrequency;

    private OtherCalculationFrequency otherCalculationFrequency;

    public TierBandInner1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TierBandInner1(String tierValueMinimum, ApplicationFrequency3 applicationFrequency, FixedVariableInterestRateType fixedVariableInterestRateType, String AER) {
        this.tierValueMinimum = tierValueMinimum;
        this.applicationFrequency = applicationFrequency;
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        this.AER = AER;
    }

    public TierBandInner1 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a PCA.
     *
     * @return identification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a PCA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public TierBandInner1 tierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
        return this;
    }

    /**
     * Minimum deposit value for which the credit interest tier applies.
     *
     * @return tierValueMinimum
     */
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "TierValueMinimum", description = "Minimum deposit value for which the credit interest tier applies.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierValueMinimum")
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    public void setTierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
    }

    public TierBandInner1 tierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
        return this;
    }

    /**
     * Maximum deposit value for which the credit interest tier applies.
     *
     * @return tierValueMaximum
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "TierValueMaximum", description = "Maximum deposit value for which the credit interest tier applies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TierValueMaximum")
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    public void setTierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    public TierBandInner1 calculationFrequency(CalculationFrequency3 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * Get calculationFrequency
     *
     * @return calculationFrequency
     */
    @Valid
    @Schema(name = "CalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CalculationFrequency")
    public CalculationFrequency3 getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequency3 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public TierBandInner1 applicationFrequency(ApplicationFrequency3 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Get applicationFrequency
     *
     * @return applicationFrequency
     */
    @NotNull
    @Valid
    @Schema(name = "ApplicationFrequency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ApplicationFrequency")
    public ApplicationFrequency3 getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequency3 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public TierBandInner1 depositInterestAppliedCoverage(DepositInterestAppliedCoverage1 depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
        return this;
    }

    /**
     * Get depositInterestAppliedCoverage
     *
     * @return depositInterestAppliedCoverage
     */
    @Valid
    @Schema(name = "DepositInterestAppliedCoverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DepositInterestAppliedCoverage")
    public DepositInterestAppliedCoverage1 getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverage1 depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    }

    public TierBandInner1 fixedVariableInterestRateType(FixedVariableInterestRateType fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        return this;
    }

    /**
     * Get fixedVariableInterestRateType
     *
     * @return fixedVariableInterestRateType
     */
    @NotNull
    @Valid
    @Schema(name = "FixedVariableInterestRateType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FixedVariableInterestRateType")
    public FixedVariableInterestRateType getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(FixedVariableInterestRateType fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public TierBandInner1 AER(String AER) {
        this.AER = AER;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
     *
     * @return AER
     */
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "AER", description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AER")
    public String getAER() {
        return AER;
    }

    public void setAER(String AER) {
        this.AER = AER;
    }

    public TierBandInner1 bankInterestRateType(BankInterestRateType1 bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
        return this;
    }

    /**
     * Get bankInterestRateType
     *
     * @return bankInterestRateType
     */
    @Valid
    @Schema(name = "BankInterestRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankInterestRateType")
    public BankInterestRateType1 getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(BankInterestRateType1 bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public TierBandInner1 bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the PCA product
     *
     * @return bankInterestRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "BankInterestRate", description = "Bank Interest for the PCA product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankInterestRate")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public TierBandInner1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public TierBandInner1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band details
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier Band details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public TierBandInner1 otherBankInterestType(OtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
        return this;
    }

    /**
     * Get otherBankInterestType
     *
     * @return otherBankInterestType
     */
    @Valid
    @Schema(name = "OtherBankInterestType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherBankInterestType")
    public OtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
    }

    public TierBandInner1 otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     */
    @Valid
    @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherApplicationFrequency")
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public TierBandInner1 otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     */
    @Valid
    @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OtherCalculationFrequency")
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TierBandInner1 tierBandInner1 = (TierBandInner1) o;
        return Objects.equals(this.identification, tierBandInner1.identification) &&
                Objects.equals(this.tierValueMinimum, tierBandInner1.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, tierBandInner1.tierValueMaximum) &&
                Objects.equals(this.calculationFrequency, tierBandInner1.calculationFrequency) &&
                Objects.equals(this.applicationFrequency, tierBandInner1.applicationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, tierBandInner1.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, tierBandInner1.fixedVariableInterestRateType) &&
                Objects.equals(this.AER, tierBandInner1.AER) &&
                Objects.equals(this.bankInterestRateType, tierBandInner1.bankInterestRateType) &&
                Objects.equals(this.bankInterestRate, tierBandInner1.bankInterestRate) &&
                Objects.equals(this.notes, tierBandInner1.notes) &&
                Objects.equals(this.otherBankInterestType, tierBandInner1.otherBankInterestType) &&
                Objects.equals(this.otherApplicationFrequency, tierBandInner1.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, tierBandInner1.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TierBandInner1 {\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
        sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
        sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
        sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
        sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
        sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

