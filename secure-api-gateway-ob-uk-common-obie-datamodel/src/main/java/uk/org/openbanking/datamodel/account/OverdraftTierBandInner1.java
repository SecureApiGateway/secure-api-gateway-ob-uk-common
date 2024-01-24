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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Provides overdraft details for a specific tier or band
 */

@Schema(name = "OverdraftTierBand_inner_1", description = "Provides overdraft details for a specific tier or band")
@JsonTypeName("OverdraftTierBand_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftTierBandInner1 {

  private String identification;

  private String tierValueMin;

  private String tierValueMax;

  /**
   * Interest charged on whole amount or tiered/banded
   */
  public enum OverdraftInterestChargingCoverageEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    OverdraftInterestChargingCoverageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OverdraftInterestChargingCoverageEnum fromValue(String value) {
      for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage;

  private Boolean bankGuaranteedIndicator;

  private String EAR;

  private String representativeAPR;

  @Valid
  private List<@Size(min = 1, max = 2000)String> notes;

  @Valid
  private List<@Valid OverdraftFeesChargesInner2> overdraftFeesCharges;

  public OverdraftTierBandInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverdraftTierBandInner1(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OverdraftTierBandInner1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
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

  public OverdraftTierBandInner1 tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }

  /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
  */
  @NotNull @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  @Schema(name = "TierValueMin", description = "Minimum value of Overdraft Tier/Band", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierValueMin")
  public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OverdraftTierBandInner1 tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

  /**
   * Maximum value of Overdraft Tier/Band
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

  public OverdraftTierBandInner1 overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

  /**
   * Interest charged on whole amount or tiered/banded
   * @return overdraftInterestChargingCoverage
  */
  
  @Schema(name = "OverdraftInterestChargingCoverage", description = "Interest charged on whole amount or tiered/banded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftInterestChargingCoverage")
  public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }

  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public OverdraftTierBandInner1 bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

  /**
   * Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
   * @return bankGuaranteedIndicator
  */
  
  @Schema(name = "BankGuaranteedIndicator", description = "Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankGuaranteedIndicator")
  public Boolean getBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public OverdraftTierBandInner1 EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

  /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
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

  public OverdraftTierBandInner1 representativeAPR(String representativeAPR) {
    this.representativeAPR = representativeAPR;
    return this;
  }

  /**
   * An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.
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

  public OverdraftTierBandInner1 notes(List<@Size(min = 1, max = 2000)String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftTierBandInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier/band details
   * @return notes
  */
  
  @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier/band details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<@Size(min = 1, max = 2000)String> getNotes() {
    return notes;
  }

  public void setNotes(List<@Size(min = 1, max = 2000)String> notes) {
    this.notes = notes;
  }

  public OverdraftTierBandInner1 overdraftFeesCharges(List<@Valid OverdraftFeesChargesInner2> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OverdraftTierBandInner1 addOverdraftFeesChargesItem(OverdraftFeesChargesInner2 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges
   * @return overdraftFeesCharges
  */
  @Valid 
  @Schema(name = "OverdraftFeesCharges", description = "Overdraft fees and charges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeesCharges")
  public List<@Valid OverdraftFeesChargesInner2> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<@Valid OverdraftFeesChargesInner2> overdraftFeesCharges) {
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
    OverdraftTierBandInner1 overdraftTierBandInner1 = (OverdraftTierBandInner1) o;
    return Objects.equals(this.identification, overdraftTierBandInner1.identification) &&
        Objects.equals(this.tierValueMin, overdraftTierBandInner1.tierValueMin) &&
        Objects.equals(this.tierValueMax, overdraftTierBandInner1.tierValueMax) &&
        Objects.equals(this.overdraftInterestChargingCoverage, overdraftTierBandInner1.overdraftInterestChargingCoverage) &&
        Objects.equals(this.bankGuaranteedIndicator, overdraftTierBandInner1.bankGuaranteedIndicator) &&
        Objects.equals(this.EAR, overdraftTierBandInner1.EAR) &&
        Objects.equals(this.representativeAPR, overdraftTierBandInner1.representativeAPR) &&
        Objects.equals(this.notes, overdraftTierBandInner1.notes) &&
        Objects.equals(this.overdraftFeesCharges, overdraftTierBandInner1.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMin, tierValueMax, overdraftInterestChargingCoverage, bankGuaranteedIndicator, EAR, representativeAPR, notes, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftTierBandInner1 {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
    sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
    sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
    sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
    sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
    sb.append("    representativeAPR: ").append(toIndentedString(representativeAPR)).append("\n");
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

