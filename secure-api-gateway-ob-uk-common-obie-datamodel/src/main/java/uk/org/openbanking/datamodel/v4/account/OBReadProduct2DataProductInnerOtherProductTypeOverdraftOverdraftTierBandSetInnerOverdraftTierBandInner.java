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
 * Provides overdraft details for a specific tier or band
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner_OverdraftTierBand_inner", description = "Provides overdraft details for a specific tier or band")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner_OverdraftTierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner {

    private String identification;

    private String tierValueMin;

    private String tierValueMax;

    private String EAR;

    private Integer agreementLengthMin;

    private Integer agreementLengthMax;

    private OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerAgreementPeriod agreementPeriod;

    private OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftInterestChargingCoverage overdraftInterestChargingCoverage;

    private Boolean bankGuaranteedIndicator;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> overdraftFeesCharges;

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner(String tierValueMin) {
        this.tierValueMin = tierValueMin;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner identification(String identification) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner tierValueMin(String tierValueMin) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner tierValueMax(String tierValueMax) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner EAR(String EAR) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner agreementLengthMin(Integer agreementLengthMin) {
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
    public Integer getAgreementLengthMin() {
        return agreementLengthMin;
    }

    public void setAgreementLengthMin(Integer agreementLengthMin) {
        this.agreementLengthMin = agreementLengthMin;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner agreementLengthMax(Integer agreementLengthMax) {
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
    public Integer getAgreementLengthMax() {
        return agreementLengthMax;
    }

    public void setAgreementLengthMax(Integer agreementLengthMax) {
        this.agreementLengthMax = agreementLengthMax;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner agreementPeriod(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerAgreementPeriod agreementPeriod) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerAgreementPeriod getAgreementPeriod() {
        return agreementPeriod;
    }

    public void setAgreementPeriod(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerAgreementPeriod agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner overdraftInterestChargingCoverage(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftInterestChargingCoverage overdraftInterestChargingCoverage) {
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
    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftInterestChargingCoverage getOverdraftInterestChargingCoverage() {
        return overdraftInterestChargingCoverage;
    }

    public void setOverdraftInterestChargingCoverage(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftInterestChargingCoverage overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
        return this;
    }

    /**
     * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.
     *
     * @return bankGuaranteedIndicator
     */

    @Schema(name = "BankGuaranteedIndicator", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BankGuaranteedIndicator")
    public Boolean getBankGuaranteedIndicator() {
        return bankGuaranteedIndicator;
    }

    public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner addNotesItem(String notesItem) {
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

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner overdraftFeesCharges(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner addOverdraftFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Get overdraftFeesCharges
     *
     * @return overdraftFeesCharges
     */
    @Valid
    @Schema(name = "OverdraftFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftFeesCharges")
    public List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<@Valid OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> overdraftFeesCharges) {
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
        OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner = (OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner) o;
        return Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.identification) &&
                Objects.equals(this.tierValueMin, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.tierValueMin) &&
                Objects.equals(this.tierValueMax, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.tierValueMax) &&
                Objects.equals(this.EAR, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.EAR) &&
                Objects.equals(this.agreementLengthMin, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.agreementLengthMin) &&
                Objects.equals(this.agreementLengthMax, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.agreementLengthMax) &&
                Objects.equals(this.agreementPeriod, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.agreementPeriod) &&
                Objects.equals(this.overdraftInterestChargingCoverage, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.overdraftInterestChargingCoverage) &&
                Objects.equals(this.bankGuaranteedIndicator, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.bankGuaranteedIndicator) &&
                Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.notes) &&
                Objects.equals(this.overdraftFeesCharges, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.overdraftFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMin, tierValueMax, EAR, agreementLengthMin, agreementLengthMax, agreementPeriod, overdraftInterestChargingCoverage, bankGuaranteedIndicator, notes, overdraftFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner {\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
        sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
        sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
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

