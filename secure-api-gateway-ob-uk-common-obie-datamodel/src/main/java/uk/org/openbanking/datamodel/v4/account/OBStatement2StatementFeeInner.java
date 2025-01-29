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
 * Set of elements used to provide details of a fee for the statement resource.
 */

@Schema(name = "OBStatement2_StatementFee_inner", description = "Set of elements used to provide details of a fee for the statement resource.")
@JsonTypeName("OBStatement2_StatementFee_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStatement2StatementFeeInner {

    private String description;

    private OBCreditDebitCode0 creditDebitIndicator;

    private String type;

    private BigDecimal rate;

    private String rateType;

    private String frequency;

    private OBActiveOrHistoricCurrencyAndAmount6 amount;

    public OBStatement2StatementFeeInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBStatement2StatementFeeInner(OBCreditDebitCode0 creditDebitIndicator, String type, OBActiveOrHistoricCurrencyAndAmount6 amount) {
        this.creditDebitIndicator = creditDebitIndicator;
        this.type = type;
        this.amount = amount;
    }

    public OBStatement2StatementFeeInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description that may be available for the statement fee.
     *
     * @return description
     */
    @Size(min = 1, max = 128)
    @Schema(name = "Description", example = "International usage charge", description = "Description that may be available for the statement fee.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBStatement2StatementFeeInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
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

    public OBStatement2StatementFeeInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Fee type, in a coded form. For a full list of values see `OBInternalStatementFeeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return type
     */
    @NotNull
    @Schema(name = "Type", example = "UK.OBIE.Annual", description = "Fee type, in a coded form. For a full list of values see `OBInternalStatementFeeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2StatementFeeInner rate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)
     *
     * @return rate
     */
    @Valid
    @Schema(name = "Rate", example = "0.05", description = "Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Rate")
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public OBStatement2StatementFeeInner rateType(String rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Description that may be available for the statement fee rate type. For a full list of values see `OBInternalStatementFeeRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return rateType
     */

    @Schema(name = "RateType", example = "UK.OBIE.AER", description = "Description that may be available for the statement fee rate type. For a full list of values see `OBInternalStatementFeeRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RateType")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public OBStatement2StatementFeeInner frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * How frequently the fee is applied to the Account. For a full list of values see `OBInternalStatementFeeFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return frequency
     */

    @Schema(name = "Frequency", example = "UK.OBIE.StatementMonthly", description = "How frequently the fee is applied to the Account. For a full list of values see `OBInternalStatementFeeFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Frequency")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStatement2StatementFeeInner amount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
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
    public OBActiveOrHistoricCurrencyAndAmount6 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
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
        OBStatement2StatementFeeInner obStatement2StatementFeeInner = (OBStatement2StatementFeeInner) o;
        return Objects.equals(this.description, obStatement2StatementFeeInner.description) &&
                Objects.equals(this.creditDebitIndicator, obStatement2StatementFeeInner.creditDebitIndicator) &&
                Objects.equals(this.type, obStatement2StatementFeeInner.type) &&
                isEqual(this.rate, obStatement2StatementFeeInner.rate) &&
                Objects.equals(this.rateType, obStatement2StatementFeeInner.rateType) &&
                Objects.equals(this.frequency, obStatement2StatementFeeInner.frequency) &&
                Objects.equals(this.amount, obStatement2StatementFeeInner.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementFeeInner {\n");
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

