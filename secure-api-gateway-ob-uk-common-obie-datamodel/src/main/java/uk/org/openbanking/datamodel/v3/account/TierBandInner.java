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

@Schema(name = "TierBand_inner", description = "Tier Band Details")
@JsonTypeName("TierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TierBandInner {

    private String identification;

    private String tierValueMinimum;

    private String tierValueMaximum;

    private CalculationFrequency calculationFrequency;

    private ApplicationFrequency applicationFrequency;

    private DepositInterestAppliedCoverage depositInterestAppliedCoverage;

    private FixedVariableInterestRateType fixedVariableInterestRateType;

    private String AER;

    private BankInterestRateType bankInterestRateType;

    private String bankInterestRate;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OtherBankInterestType otherBankInterestType;

    private OtherApplicationFrequency otherApplicationFrequency;

    private OtherCalculationFrequency otherCalculationFrequency;

    public TierBandInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TierBandInner(String tierValueMinimum, ApplicationFrequency applicationFrequency, FixedVariableInterestRateType fixedVariableInterestRateType, String AER) {
        this.tierValueMinimum = tierValueMinimum;
        this.applicationFrequency = applicationFrequency;
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        this.AER = AER;
    }

    public TierBandInner identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a BCA.
     *
     * @return identification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a BCA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public TierBandInner tierValueMinimum(String tierValueMinimum) {
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

    public TierBandInner tierValueMaximum(String tierValueMaximum) {
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

    public TierBandInner calculationFrequency(CalculationFrequency calculationFrequency) {
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
    public CalculationFrequency getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequency calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public TierBandInner applicationFrequency(ApplicationFrequency applicationFrequency) {
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
    public ApplicationFrequency getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequency applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public TierBandInner depositInterestAppliedCoverage(DepositInterestAppliedCoverage depositInterestAppliedCoverage) {
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
    public DepositInterestAppliedCoverage getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverage depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    }

    public TierBandInner fixedVariableInterestRateType(FixedVariableInterestRateType fixedVariableInterestRateType) {
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

    public TierBandInner AER(String AER) {
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

    public TierBandInner bankInterestRateType(BankInterestRateType bankInterestRateType) {
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
    public BankInterestRateType getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(BankInterestRateType bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public TierBandInner bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the BCA product
     *
     * @return bankInterestRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "BankInterestRate", description = "Bank Interest for the BCA product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankInterestRate")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public TierBandInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public TierBandInner addNotesItem(String notesItem) {
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

    public TierBandInner otherBankInterestType(OtherBankInterestType otherBankInterestType) {
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

    public TierBandInner otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

    public TierBandInner otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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
        TierBandInner tierBandInner = (TierBandInner) o;
        return Objects.equals(this.identification, tierBandInner.identification) &&
                Objects.equals(this.tierValueMinimum, tierBandInner.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, tierBandInner.tierValueMaximum) &&
                Objects.equals(this.calculationFrequency, tierBandInner.calculationFrequency) &&
                Objects.equals(this.applicationFrequency, tierBandInner.applicationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, tierBandInner.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, tierBandInner.fixedVariableInterestRateType) &&
                Objects.equals(this.AER, tierBandInner.AER) &&
                Objects.equals(this.bankInterestRateType, tierBandInner.bankInterestRateType) &&
                Objects.equals(this.bankInterestRate, tierBandInner.bankInterestRate) &&
                Objects.equals(this.notes, tierBandInner.notes) &&
                Objects.equals(this.otherBankInterestType, tierBandInner.otherBankInterestType) &&
                Objects.equals(this.otherApplicationFrequency, tierBandInner.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, tierBandInner.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TierBandInner {\n");
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

