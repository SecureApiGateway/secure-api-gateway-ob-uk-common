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
package uk.org.openbanking.datamodel.v3.vrp;

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
 * OBDomesticVRPControlParametersPeriodicLimitsInner
 */

@JsonTypeName("OBDomesticVRPControlParameters_PeriodicLimits_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBDomesticVRPControlParametersPeriodicLimitsInner {

    private OBPeriodType periodType;

    private OBPeriodAlignment periodAlignment;

    private String amount;

    private String currency;

    public OBDomesticVRPControlParametersPeriodicLimitsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBDomesticVRPControlParametersPeriodicLimitsInner(OBPeriodType periodType, OBPeriodAlignment periodAlignment, String amount, String currency) {
        this.periodType = periodType;
        this.periodAlignment = periodAlignment;
        this.amount = amount;
        this.currency = currency;
    }

    public OBDomesticVRPControlParametersPeriodicLimitsInner periodType(OBPeriodType periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Get periodType
     *
     * @return periodType
     */
    @NotNull
    @Valid
    @Schema(name = "PeriodType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PeriodType")
    public OBPeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(OBPeriodType periodType) {
        this.periodType = periodType;
    }

    public OBDomesticVRPControlParametersPeriodicLimitsInner periodAlignment(OBPeriodAlignment periodAlignment) {
        this.periodAlignment = periodAlignment;
        return this;
    }

    /**
     * Get periodAlignment
     *
     * @return periodAlignment
     */
    @NotNull
    @Valid
    @Schema(name = "PeriodAlignment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("PeriodAlignment")
    public OBPeriodAlignment getPeriodAlignment() {
        return periodAlignment;
    }

    public void setPeriodAlignment(OBPeriodAlignment periodAlignment) {
        this.periodAlignment = periodAlignment;
    }

    public OBDomesticVRPControlParametersPeriodicLimitsInner amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
     *
     * @return amount
     */
    @NotNull
    @Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    @Schema(name = "Amount", description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBDomesticVRPControlParametersPeriodicLimitsInner currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
     *
     * @return currency
     */
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Size(min = 3, max = 3)
    @Schema(name = "Currency", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPControlParametersPeriodicLimitsInner obDomesticVRPControlParametersPeriodicLimitsInner = (OBDomesticVRPControlParametersPeriodicLimitsInner) o;
        return Objects.equals(this.periodType, obDomesticVRPControlParametersPeriodicLimitsInner.periodType) &&
                Objects.equals(this.periodAlignment, obDomesticVRPControlParametersPeriodicLimitsInner.periodAlignment) &&
                Objects.equals(this.amount, obDomesticVRPControlParametersPeriodicLimitsInner.amount) &&
                Objects.equals(this.currency, obDomesticVRPControlParametersPeriodicLimitsInner.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodAlignment, amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPControlParametersPeriodicLimitsInner {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodAlignment: ").append(toIndentedString(periodAlignment)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

