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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Tier Band Details
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner_TierBand_inner", description = "Tier Band Details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner_TierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner {

    private String identification;

    private String tierValueMinimum;

    private String tierValueMaximum;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerCalculationFrequency calculationFrequency;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerApplicationFrequency applicationFrequency;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerDepositInterestAppliedCoverage depositInterestAppliedCoverage;

    private OBInterestFixedVariableType1Code fixedVariableInterestRateType;

    private String AER;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerBankInterestRateType bankInterestRateType;

    private String bankInterestRate;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType otherBankInterestType;

    private OBOtherCodeType11 otherApplicationFrequency;

    private OBOtherCodeType12 otherCalculationFrequency;

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner(String tierValueMinimum, OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerApplicationFrequency applicationFrequency, OBInterestFixedVariableType1Code fixedVariableInterestRateType, String AER) {
        this.tierValueMinimum = tierValueMinimum;
        this.applicationFrequency = applicationFrequency;
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        this.AER = AER;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for the Product.
     *
     * @return identification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for the Product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierValueMinimum(String tierValueMinimum) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierValueMaximum(String tierValueMaximum) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner calculationFrequency(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerCalculationFrequency calculationFrequency) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerCalculationFrequency getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerCalculationFrequency calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner applicationFrequency(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerApplicationFrequency applicationFrequency) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerApplicationFrequency getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerApplicationFrequency applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner depositInterestAppliedCoverage(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerDepositInterestAppliedCoverage depositInterestAppliedCoverage) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerDepositInterestAppliedCoverage getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    public void setDepositInterestAppliedCoverage(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerDepositInterestAppliedCoverage depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
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
    public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner AER(String AER) {
        this.AER = AER;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
     *
     * @return AER
     */
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "AER", description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AER")
    public String getAER() {
        return AER;
    }

    public void setAER(String AER) {
        this.AER = AER;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner bankInterestRateType(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerBankInterestRateType bankInterestRateType) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerBankInterestRateType getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerBankInterestRateType bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the product
     *
     * @return bankInterestRate
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "BankInterestRate", description = "Bank Interest for the product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankInterestRate")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     */

    @Schema(name = "Notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner otherBankInterestType(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType otherBankInterestType) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    public void setOtherBankInterestType(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
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
    public OBOtherCodeType11 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
    public OBOtherCodeType12 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
        OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner) o;
        return Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.identification) &&
                Objects.equals(this.tierValueMinimum, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.tierValueMaximum) &&
                Objects.equals(this.calculationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.calculationFrequency) &&
                Objects.equals(this.applicationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.applicationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.fixedVariableInterestRateType) &&
                Objects.equals(this.AER, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.AER) &&
                Objects.equals(this.bankInterestRateType, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.bankInterestRateType) &&
                Objects.equals(this.bankInterestRate, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.bankInterestRate) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.notes) &&
                Objects.equals(this.otherBankInterestType, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.otherBankInterestType) &&
                Objects.equals(this.otherApplicationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner {\n");
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

