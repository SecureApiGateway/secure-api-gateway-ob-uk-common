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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;

/**
 * OBDomesticVRPControlParameters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPControlParameters {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime validFromDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime validToDateTime;

    private OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount;

    @Valid
    private List<@Valid OBDomesticVRPControlParametersPeriodicLimitsInner> periodicLimits = new ArrayList<>();

    @Valid
    private List<@Valid String> vrPType = new ArrayList<>();

    @Valid
    private List<@Valid String> psUAuthenticationMethods = new ArrayList<>();

    @Valid
    private List<@Valid OBVRPInteractionTypes> psUInteractionTypes;

    private OBSupplementaryData1 supplementaryData;

    public OBDomesticVRPControlParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPControlParameters(OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount, List<@Valid OBDomesticVRPControlParametersPeriodicLimitsInner> periodicLimits, List<@Valid String> vrPType, List<@Valid String> psUAuthenticationMethods) {
        this.maximumIndividualAmount = maximumIndividualAmount;
        this.periodicLimits = periodicLimits;
        this.vrPType = vrPType;
        this.psUAuthenticationMethods = psUAuthenticationMethods;
    }

    public OBDomesticVRPControlParameters validFromDateTime(DateTime validFromDateTime) {
        this.validFromDateTime = validFromDateTime;
        return this;
    }

    /**
     * ^ Start date time for which the consent remains valid.
     *
     * @return validFromDateTime
     */
    @Valid
    @Schema(name = "ValidFromDateTime", description = "^ Start date time for which the consent remains valid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ValidFromDateTime")
    public DateTime getValidFromDateTime() {
        return validFromDateTime;
    }

    public void setValidFromDateTime(DateTime validFromDateTime) {
        this.validFromDateTime = validFromDateTime;
    }

    public OBDomesticVRPControlParameters validToDateTime(DateTime validToDateTime) {
        this.validToDateTime = validToDateTime;
        return this;
    }

    /**
     * ^ End date time for which the consent remains valid.
     *
     * @return validToDateTime
     */
    @Valid
    @Schema(name = "ValidToDateTime", description = "^ End date time for which the consent remains valid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ValidToDateTime")
    public DateTime getValidToDateTime() {
        return validToDateTime;
    }

    public void setValidToDateTime(DateTime validToDateTime) {
        this.validToDateTime = validToDateTime;
    }

    public OBDomesticVRPControlParameters maximumIndividualAmount(OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount) {
        this.maximumIndividualAmount = maximumIndividualAmount;
        return this;
    }

    /**
     * Get maximumIndividualAmount
     *
     * @return maximumIndividualAmount
     */
    @NotNull
    @Valid
    @Schema(name = "MaximumIndividualAmount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("MaximumIndividualAmount")
    public OBActiveOrHistoricCurrencyAndAmount getMaximumIndividualAmount() {
        return maximumIndividualAmount;
    }

    public void setMaximumIndividualAmount(OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount) {
        this.maximumIndividualAmount = maximumIndividualAmount;
    }

    public OBDomesticVRPControlParameters periodicLimits(List<@Valid OBDomesticVRPControlParametersPeriodicLimitsInner> periodicLimits) {
        this.periodicLimits = periodicLimits;
        return this;
    }

    public OBDomesticVRPControlParameters addPeriodicLimitsItem(OBDomesticVRPControlParametersPeriodicLimitsInner periodicLimitsItem) {
        if (this.periodicLimits == null) {
            this.periodicLimits = new ArrayList<>();
        }
        this.periodicLimits.add(periodicLimitsItem);
        return this;
    }

    /**
     * Get periodicLimits
     *
     * @return periodicLimits
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "PeriodicLimits", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PeriodicLimits")
    public List<@Valid OBDomesticVRPControlParametersPeriodicLimitsInner> getPeriodicLimits() {
        return periodicLimits;
    }

    public void setPeriodicLimits(List<@Valid OBDomesticVRPControlParametersPeriodicLimitsInner> periodicLimits) {
        this.periodicLimits = periodicLimits;
    }

    public OBDomesticVRPControlParameters vrPType(List<@Valid String> vrPType) {
        this.vrPType = vrPType;
        return this;
    }

    public OBDomesticVRPControlParameters addVrPTypeItem(String vrPTypeItem) {
        if (this.vrPType == null) {
            this.vrPType = new ArrayList<>();
        }
        this.vrPType.add(vrPTypeItem);
        return this;
    }

    /**
     * ^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.
     *
     * @return vrPType
     */
    @NotNull
    @Size(min = 1)
    @Schema(name = "VRPType", description = "^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("VRPType")
    public List<@Valid String> getVrPType() {
        return vrPType;
    }

    public void setVrPType(List<@Valid String> vrPType) {
        this.vrPType = vrPType;
    }

    public OBDomesticVRPControlParameters psUAuthenticationMethods(List<@Valid String> psUAuthenticationMethods) {
        this.psUAuthenticationMethods = psUAuthenticationMethods;
        return this;
    }

    public OBDomesticVRPControlParameters addPsUAuthenticationMethodsItem(String psUAuthenticationMethodsItem) {
        if (this.psUAuthenticationMethods == null) {
            this.psUAuthenticationMethods = new ArrayList<>();
        }
        this.psUAuthenticationMethods.add(psUAuthenticationMethodsItem);
        return this;
    }

    /**
     * ^ Indicates that the PSU authentication methods supported.
     *
     * @return psUAuthenticationMethods
     */
    @NotNull
    @Size(min = 1)
    @Schema(name = "PSUAuthenticationMethods", description = "^ Indicates that the PSU authentication methods supported.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PSUAuthenticationMethods")
    public List<@Valid String> getPsUAuthenticationMethods() {
        return psUAuthenticationMethods;
    }

    public void setPsUAuthenticationMethods(List<@Valid String> psUAuthenticationMethods) {
        this.psUAuthenticationMethods = psUAuthenticationMethods;
    }

    public OBDomesticVRPControlParameters psUInteractionTypes(List<@Valid OBVRPInteractionTypes> psUInteractionTypes) {
        this.psUInteractionTypes = psUInteractionTypes;
        return this;
    }

    public OBDomesticVRPControlParameters addPsUInteractionTypesItem(OBVRPInteractionTypes psUInteractionTypesItem) {
        if (this.psUInteractionTypes == null) {
            this.psUInteractionTypes = new ArrayList<>();
        }
        this.psUInteractionTypes.add(psUInteractionTypesItem);
        return this;
    }

    /**
     * ^ Indicates interaction type, currently if customer is present or not present.
     *
     * @return psUInteractionTypes
     */
    @Valid
    @Schema(name = "PSUInteractionTypes", description = "^ Indicates interaction type, currently if customer is present or not present.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PSUInteractionTypes")
    public List<@Valid OBVRPInteractionTypes> getPsUInteractionTypes() {
        return psUInteractionTypes;
    }

    public void setPsUInteractionTypes(List<@Valid OBVRPInteractionTypes> psUInteractionTypes) {
        this.psUInteractionTypes = psUInteractionTypes;
    }

    public OBDomesticVRPControlParameters supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * ^ Additional information that can not be captured in the structured fields and/or any other specific block
     *
     * @return supplementaryData
     */

    @Schema(name = "SupplementaryData", description = "^ Additional information that can not be captured in the structured fields and/or any other specific block", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        OBDomesticVRPControlParameters obDomesticVRPControlParameters = (OBDomesticVRPControlParameters) o;
        return Objects.equals(this.validFromDateTime, obDomesticVRPControlParameters.validFromDateTime) &&
                Objects.equals(this.validToDateTime, obDomesticVRPControlParameters.validToDateTime) &&
                Objects.equals(this.maximumIndividualAmount, obDomesticVRPControlParameters.maximumIndividualAmount) &&
                Objects.equals(this.periodicLimits, obDomesticVRPControlParameters.periodicLimits) &&
                Objects.equals(this.vrPType, obDomesticVRPControlParameters.vrPType) &&
                Objects.equals(this.psUAuthenticationMethods, obDomesticVRPControlParameters.psUAuthenticationMethods) &&
                Objects.equals(this.psUInteractionTypes, obDomesticVRPControlParameters.psUInteractionTypes) &&
                Objects.equals(this.supplementaryData, obDomesticVRPControlParameters.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validFromDateTime, validToDateTime, maximumIndividualAmount, periodicLimits, vrPType, psUAuthenticationMethods, psUInteractionTypes, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPControlParameters {\n");
        sb.append("    validFromDateTime: ").append(toIndentedString(validFromDateTime)).append("\n");
        sb.append("    validToDateTime: ").append(toIndentedString(validToDateTime)).append("\n");
        sb.append("    maximumIndividualAmount: ").append(toIndentedString(maximumIndividualAmount)).append("\n");
        sb.append("    periodicLimits: ").append(toIndentedString(periodicLimits)).append("\n");
        sb.append("    vrPType: ").append(toIndentedString(vrPType)).append("\n");
        sb.append("    psUAuthenticationMethods: ").append(toIndentedString(psUAuthenticationMethods)).append("\n");
        sb.append("    psUInteractionTypes: ").append(toIndentedString(psUInteractionTypes)).append("\n");
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

