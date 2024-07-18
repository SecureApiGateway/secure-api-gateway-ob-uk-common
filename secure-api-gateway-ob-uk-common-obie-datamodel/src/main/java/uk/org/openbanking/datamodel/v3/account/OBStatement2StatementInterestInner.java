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

import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.BigDecimalUtil.isEqual;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementInterest_inner", description = "Set of elements used to provide details of a generic interest amount related to the statement resource.")
@JsonTypeName("OBStatement2_StatementInterest_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2StatementInterestInner {

    private String description;

    private OBCreditDebitCode0 creditDebitIndicator;

    private String type;

    private BigDecimal rate;

    private String rateType;

    private String frequency;

    private OBActiveOrHistoricCurrencyAndAmount7 amount;

    public OBStatement2StatementInterestInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2StatementInterestInner(OBCreditDebitCode0 creditDebitIndicator, String type, OBActiveOrHistoricCurrencyAndAmount7 amount) {
        this.creditDebitIndicator = creditDebitIndicator;
        this.type = type;
        this.amount = amount;
    }

    public OBStatement2StatementInterestInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description that may be available for the statement interest.
     *
     * @return description
     */
    @Size(min = 1, max = 128)
    @Schema(name = "Description", description = "Description that may be available for the statement interest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBStatement2StatementInterestInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     */
    @NotNull
    @Valid
    @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreditDebitIndicator")
    public OBCreditDebitCode0 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBStatement2StatementInterestInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Interest amount type, in a coded form.
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", description = "Interest amount type, in a coded form.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2StatementInterestInner rate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    /**
     * field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary.
     *
     * @return rate
     */
    @Valid
    @Schema(name = "Rate", description = "field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Rate")
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public OBStatement2StatementInterestInner rateType(String rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Description that may be available for the statement Interest rate type.
     *
     * @return rateType
     */

    @Schema(name = "RateType", description = "Description that may be available for the statement Interest rate type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RateType")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public OBStatement2StatementInterestInner frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Specifies the statement fee type requested
     *
     * @return frequency
     */

    @Schema(name = "Frequency", description = "Specifies the statement fee type requested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Frequency")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStatement2StatementInterestInner amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @NotNull
    @Valid
    @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2StatementInterestInner obStatement2StatementInterestInner = (OBStatement2StatementInterestInner) o;
        return Objects.equals(this.description, obStatement2StatementInterestInner.description) &&
                Objects.equals(this.creditDebitIndicator, obStatement2StatementInterestInner.creditDebitIndicator) &&
                Objects.equals(this.type, obStatement2StatementInterestInner.type) &&
                // TODO: temporary fix for https://github.com/SecureApiGateway/SecureApiGateway/issues/981
                isEqual(this.rate, obStatement2StatementInterestInner.rate) &&
                Objects.equals(this.rateType, obStatement2StatementInterestInner.rateType) &&
                Objects.equals(this.frequency, obStatement2StatementInterestInner.frequency) &&
                Objects.equals(this.amount, obStatement2StatementInterestInner.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementInterestInner {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

