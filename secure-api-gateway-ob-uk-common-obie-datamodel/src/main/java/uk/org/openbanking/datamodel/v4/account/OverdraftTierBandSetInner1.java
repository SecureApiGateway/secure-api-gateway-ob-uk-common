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
 * Tier band set details
 */

@Schema(name = "OverdraftTierBandSet_inner_1", description = "Tier band set details")
@JsonTypeName("OverdraftTierBandSet_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OverdraftTierBandSetInner1 {

    private TierBandMethod3 tierBandMethod;

    private OverdraftType1 overdraftType;

    private String identification;

    private Boolean authorisedIndicator;

    private String bufferAmount;

    @Valid
    private List<@Size(min = 1, max = 2000) String> notes;

    @Valid
    private List<@Valid OverdraftTierBandInner1> overdraftTierBand = new ArrayList<>();

    @Valid
    private List<@Valid OverdraftFeesChargesInner3> overdraftFeesCharges;

    public OverdraftTierBandSetInner1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OverdraftTierBandSetInner1(TierBandMethod3 tierBandMethod, List<@Valid OverdraftTierBandInner1> overdraftTierBand) {
        this.tierBandMethod = tierBandMethod;
        this.overdraftTierBand = overdraftTierBand;
    }

    public OverdraftTierBandSetInner1 tierBandMethod(TierBandMethod3 tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * Get tierBandMethod
     *
     * @return tierBandMethod
     */
    @NotNull
    @Valid
    @Schema(name = "TierBandMethod", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("TierBandMethod")
    public TierBandMethod3 getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethod3 tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OverdraftTierBandSetInner1 overdraftType(OverdraftType1 overdraftType) {
        this.overdraftType = overdraftType;
        return this;
    }

    /**
     * Get overdraftType
     *
     * @return overdraftType
     */
    @Valid
    @Schema(name = "OverdraftType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftType")
    public OverdraftType1 getOverdraftType() {
        return overdraftType;
    }

    public void setOverdraftType(OverdraftType1 overdraftType) {
        this.overdraftType = overdraftType;
    }

    public OverdraftTierBandSetInner1 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a overdraft product.
     *
     * @return identification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a overdraft product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OverdraftTierBandSetInner1 authorisedIndicator(Boolean authorisedIndicator) {
        this.authorisedIndicator = authorisedIndicator;
        return this;
    }

    /**
     * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
     *
     * @return authorisedIndicator
     */

    @Schema(name = "AuthorisedIndicator", description = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AuthorisedIndicator")
    public Boolean getAuthorisedIndicator() {
        return authorisedIndicator;
    }

    public void setAuthorisedIndicator(Boolean authorisedIndicator) {
        this.authorisedIndicator = authorisedIndicator;
    }

    public OverdraftTierBandSetInner1 bufferAmount(String bufferAmount) {
        this.bufferAmount = bufferAmount;
        return this;
    }

    /**
     * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
     *
     * @return bufferAmount
     */
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(name = "BufferAmount", description = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BufferAmount")
    public String getBufferAmount() {
        return bufferAmount;
    }

    public void setBufferAmount(String bufferAmount) {
        this.bufferAmount = bufferAmount;
    }

    public OverdraftTierBandSetInner1 notes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftTierBandSetInner1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the overdraft Tier Band Set details
     *
     * @return notes
     */

    @Schema(name = "Notes", description = "Optional additional notes to supplement the overdraft Tier Band Set details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Notes")
    public List<@Size(min = 1, max = 2000) String> getNotes() {
        return notes;
    }

    public void setNotes(List<@Size(min = 1, max = 2000) String> notes) {
        this.notes = notes;
    }

    public OverdraftTierBandSetInner1 overdraftTierBand(List<@Valid OverdraftTierBandInner1> overdraftTierBand) {
        this.overdraftTierBand = overdraftTierBand;
        return this;
    }

    public OverdraftTierBandSetInner1 addOverdraftTierBandItem(OverdraftTierBandInner1 overdraftTierBandItem) {
        if (this.overdraftTierBand == null) {
            this.overdraftTierBand = new ArrayList<>();
        }
        this.overdraftTierBand.add(overdraftTierBandItem);
        return this;
    }

    /**
     * Provides overdraft details for a specific tier or band
     *
     * @return overdraftTierBand
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "OverdraftTierBand", description = "Provides overdraft details for a specific tier or band", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("OverdraftTierBand")
    public List<@Valid OverdraftTierBandInner1> getOverdraftTierBand() {
        return overdraftTierBand;
    }

    public void setOverdraftTierBand(List<@Valid OverdraftTierBandInner1> overdraftTierBand) {
        this.overdraftTierBand = overdraftTierBand;
    }

    public OverdraftTierBandSetInner1 overdraftFeesCharges(List<@Valid OverdraftFeesChargesInner3> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public OverdraftTierBandSetInner1 addOverdraftFeesChargesItem(OverdraftFeesChargesInner3 overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Overdraft fees and charges details
     *
     * @return overdraftFeesCharges
     */
    @Valid
    @Schema(name = "OverdraftFeesCharges", description = "Overdraft fees and charges details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OverdraftFeesCharges")
    public List<@Valid OverdraftFeesChargesInner3> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<@Valid OverdraftFeesChargesInner3> overdraftFeesCharges) {
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
        OverdraftTierBandSetInner1 overdraftTierBandSetInner1 = (OverdraftTierBandSetInner1) o;
        return Objects.equals(this.tierBandMethod, overdraftTierBandSetInner1.tierBandMethod) &&
                Objects.equals(this.overdraftType, overdraftTierBandSetInner1.overdraftType) &&
                Objects.equals(this.identification, overdraftTierBandSetInner1.identification) &&
                Objects.equals(this.authorisedIndicator, overdraftTierBandSetInner1.authorisedIndicator) &&
                Objects.equals(this.bufferAmount, overdraftTierBandSetInner1.bufferAmount) &&
                Objects.equals(this.notes, overdraftTierBandSetInner1.notes) &&
                Objects.equals(this.overdraftTierBand, overdraftTierBandSetInner1.overdraftTierBand) &&
                Objects.equals(this.overdraftFeesCharges, overdraftTierBandSetInner1.overdraftFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, overdraftType, identification, authorisedIndicator, bufferAmount, notes, overdraftTierBand, overdraftFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftTierBandSetInner1 {\n");
        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
        sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
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

