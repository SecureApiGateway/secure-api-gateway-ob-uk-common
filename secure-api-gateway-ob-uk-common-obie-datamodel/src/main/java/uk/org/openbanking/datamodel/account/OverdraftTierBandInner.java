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
package uk.org.openbanking.datamodel.account;

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
 * Provides overdraft details for a specific tier or band
 */

@Schema(name = "OverdraftTierBand_inner", description = "Provides overdraft details for a specific tier or band")
@JsonTypeName("OverdraftTierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftTierBandInner {

    private String identification;

    private String tierValueMin;

    private String tierValueMax;

    private String EAR;

    private String representativeAPR;

    private Float agreementLengthMin;

    private Float agreementLengthMax;

    private AgreementPeriod agreementPeriod;

    private OverdraftInterestChargingCoverage overdraftInterestChargingCoverage;

    private Boolean bankGuaranteedIndicator;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OverdraftFeesChargesInner> overdraftFeesCharges;

    public OverdraftTierBandInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OverdraftTierBandInner(String tierValueMin) {
        this.tierValueMin = tierValueMin;
    }

    public OverdraftTierBandInner identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a overdraft.
     *
     * @return identification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a overdraft.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OverdraftTierBandInner tierValueMin(String tierValueMin) {
        this.tierValueMin = tierValueMin;
        return this;
    }

    /**
     * Minimum value of Overdraft Tier/Band
     *
     * @return tierValueMin
     */
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "TierValueMin", description = "Minimum value of Overdraft Tier/Band", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierValueMin")
    public String getTierValueMin() {
        return tierValueMin;
    }

    public void setTierValueMin(String tierValueMin) {
        this.tierValueMin = tierValueMin;
    }

    public OverdraftTierBandInner tierValueMax(String tierValueMax) {
        this.tierValueMax = tierValueMax;
        return this;
    }

    /**
     * Maximum value of Overdraft Tier/Band
     *
     * @return tierValueMax
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "TierValueMax", description = "Maximum value of Overdraft Tier/Band", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TierValueMax")
    public String getTierValueMax() {
        return tierValueMax;
    }

    public void setTierValueMax(String tierValueMax) {
        this.tierValueMax = tierValueMax;
    }

    public OverdraftTierBandInner EAR(String EAR) {
        this.EAR = EAR;
        return this;
    }

    /**
     * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
     *
     * @return EAR
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "EAR", description = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("EAR")
    public String getEAR() {
        return EAR;
    }

    public void setEAR(String EAR) {
        this.EAR = EAR;
    }

    public OverdraftTierBandInner representativeAPR(String representativeAPR) {
        this.representativeAPR = representativeAPR;
        return this;
    }

    /**
     * An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.
     *
     * @return representativeAPR
     */
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "RepresentativeAPR", description = "An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RepresentativeAPR")
    public String getRepresentativeAPR() {
        return representativeAPR;
    }

    public void setRepresentativeAPR(String representativeAPR) {
        this.representativeAPR = representativeAPR;
    }

    public OverdraftTierBandInner agreementLengthMin(Float agreementLengthMin) {
        this.agreementLengthMin = agreementLengthMin;
        return this;
    }

    /**
     * Specifies the minimum length of a band for a fixed overdraft agreement
     *
     * @return agreementLengthMin
     */

    @Schema(name = "AgreementLengthMin", description = "Specifies the minimum length of a band for a fixed overdraft agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AgreementLengthMin")
    public Float getAgreementLengthMin() {
        return agreementLengthMin;
    }

    public void setAgreementLengthMin(Float agreementLengthMin) {
        this.agreementLengthMin = agreementLengthMin;
    }

    public OverdraftTierBandInner agreementLengthMax(Float agreementLengthMax) {
        this.agreementLengthMax = agreementLengthMax;
        return this;
    }

    /**
     * Specifies the maximum length of a band for a fixed overdraft agreement
     *
     * @return agreementLengthMax
     */

    @Schema(name = "AgreementLengthMax", description = "Specifies the maximum length of a band for a fixed overdraft agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AgreementLengthMax")
    public Float getAgreementLengthMax() {
        return agreementLengthMax;
    }

    public void setAgreementLengthMax(Float agreementLengthMax) {
        this.agreementLengthMax = agreementLengthMax;
    }

    public OverdraftTierBandInner agreementPeriod(AgreementPeriod agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
        return this;
    }

    /**
     * Get agreementPeriod
     *
     * @return agreementPeriod
     */
    @Valid
    @Schema(name = "AgreementPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AgreementPeriod")
    public AgreementPeriod getAgreementPeriod() {
        return agreementPeriod;
    }

    public void setAgreementPeriod(AgreementPeriod agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
    }

    public OverdraftTierBandInner overdraftInterestChargingCoverage(OverdraftInterestChargingCoverage overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
        return this;
    }

    /**
     * Get overdraftInterestChargingCoverage
     *
     * @return overdraftInterestChargingCoverage
     */
    @Valid
    @Schema(name = "OverdraftInterestChargingCoverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftInterestChargingCoverage")
    public OverdraftInterestChargingCoverage getOverdraftInterestChargingCoverage() {
        return overdraftInterestChargingCoverage;
    }

    public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverage overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    }

    public OverdraftTierBandInner bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
        return this;
    }

    /**
     * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.
     *
     * @return bankGuaranteedIndicator
     */

    @Schema(name = "BankGuaranteedIndicator", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankGuaranteedIndicator")
    public Boolean getBankGuaranteedIndicator() {
        return bankGuaranteedIndicator;
    }

    public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    }

    public OverdraftTierBandInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftTierBandInner addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier/band details
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier/band details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public OverdraftTierBandInner overdraftFeesCharges(List<@Valid OverdraftFeesChargesInner> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public OverdraftTierBandInner addOverdraftFeesChargesItem(OverdraftFeesChargesInner overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Overdraft fees and charges
     *
     * @return overdraftFeesCharges
     */
    @Valid
    @Schema(name = "OverdraftFeesCharges", description = "Overdraft fees and charges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftFeesCharges")
    public List<@Valid OverdraftFeesChargesInner> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<@Valid OverdraftFeesChargesInner> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftTierBandInner overdraftTierBandInner = (OverdraftTierBandInner) o;
        return Objects.equals(this.identification, overdraftTierBandInner.identification) &&
                Objects.equals(this.tierValueMin, overdraftTierBandInner.tierValueMin) &&
                Objects.equals(this.tierValueMax, overdraftTierBandInner.tierValueMax) &&
                Objects.equals(this.EAR, overdraftTierBandInner.EAR) &&
                Objects.equals(this.representativeAPR, overdraftTierBandInner.representativeAPR) &&
                Objects.equals(this.agreementLengthMin, overdraftTierBandInner.agreementLengthMin) &&
                Objects.equals(this.agreementLengthMax, overdraftTierBandInner.agreementLengthMax) &&
                Objects.equals(this.agreementPeriod, overdraftTierBandInner.agreementPeriod) &&
                Objects.equals(this.overdraftInterestChargingCoverage, overdraftTierBandInner.overdraftInterestChargingCoverage) &&
                Objects.equals(this.bankGuaranteedIndicator, overdraftTierBandInner.bankGuaranteedIndicator) &&
                Objects.equals(this.notes, overdraftTierBandInner.notes) &&
                Objects.equals(this.overdraftFeesCharges, overdraftTierBandInner.overdraftFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMin, tierValueMax, EAR, representativeAPR, agreementLengthMin, agreementLengthMax, agreementPeriod, overdraftInterestChargingCoverage, bankGuaranteedIndicator, notes, overdraftFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftTierBandInner {\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
        sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
        sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
        sb.append("    representativeAPR: ").append(toIndentedString(representativeAPR)).append("\n");
        sb.append("    agreementLengthMin: ").append(toIndentedString(agreementLengthMin)).append("\n");
        sb.append("    agreementLengthMax: ").append(toIndentedString(agreementLengthMax)).append("\n");
        sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
        sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
        sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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

