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

import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.BigDecimalUtil.isEqual;

import java.math.BigDecimal;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Set of elements used to provide details on the currency exchange.
 */

@Schema(name = "OBCurrencyExchange5", description = "Set of elements used to provide details on the currency exchange.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBCurrencyExchange5 {

    private String sourceCurrency;

    private String targetCurrency;

    private String unitCurrency;

    private BigDecimal exchangeRate;

    private String contractIdentification;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime quotationDate;

    private OBCurrencyExchange5InstructedAmount instructedAmount;

    public OBCurrencyExchange5() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBCurrencyExchange5(String sourceCurrency, BigDecimal exchangeRate) {
        this.sourceCurrency = sourceCurrency;
        this.exchangeRate = exchangeRate;
    }

    public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
        return this;
    }

    /**
     * Currency from which an amount is to be converted in a currency conversion.
     *
     * @return sourceCurrency
     */
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "SourceCurrency", description = "Currency from which an amount is to be converted in a currency conversion.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("SourceCurrency")
    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
        return this;
    }

    /**
     * Currency into which an amount is to be converted in a currency conversion.
     *
     * @return targetCurrency
     */
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "TargetCurrency", description = "Currency into which an amount is to be converted in a currency conversion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TargetCurrency")
    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
     *
     * @return unitCurrency
     */
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "UnitCurrency", description = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UnitCurrency")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }

    public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
     *
     * @return exchangeRate
     */
    @NotNull
    @Valid
    @Schema(name = "ExchangeRate", description = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ExchangeRate")
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique identification to unambiguously identify the foreign exchange contract.
     *
     * @return contractIdentification
     */
    @Size(min = 1, max = 35)
    @Schema(name = "ContractIdentification", description = "Unique identification to unambiguously identify the foreign exchange contract.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ContractIdentification")
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }

    public OBCurrencyExchange5 quotationDate(DateTime quotationDate) {
        this.quotationDate = quotationDate;
        return this;
    }

    /**
     * Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return quotationDate
     */
    @Valid
    @Schema(name = "QuotationDate", description = "Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("QuotationDate")
    public DateTime getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(DateTime quotationDate) {
        this.quotationDate = quotationDate;
    }

    public OBCurrencyExchange5 instructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     */
    @Valid
    @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("InstructedAmount")
    public OBCurrencyExchange5InstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBCurrencyExchange5 obCurrencyExchange5 = (OBCurrencyExchange5) o;
        return Objects.equals(this.sourceCurrency, obCurrencyExchange5.sourceCurrency) &&
                Objects.equals(this.targetCurrency, obCurrencyExchange5.targetCurrency) &&
                Objects.equals(this.unitCurrency, obCurrencyExchange5.unitCurrency) &&
                // TODO: temporary fix for https://github.com/SecureApiGateway/SecureApiGateway/issues/981
                isEqual(this.exchangeRate, obCurrencyExchange5.exchangeRate) &&
                Objects.equals(this.contractIdentification, obCurrencyExchange5.contractIdentification) &&
                Objects.equals(this.quotationDate, obCurrencyExchange5.quotationDate) &&
                Objects.equals(this.instructedAmount, obCurrencyExchange5.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCurrency, targetCurrency, unitCurrency, exchangeRate, contractIdentification, quotationDate, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCurrencyExchange5 {\n");
        sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
        sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
        sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

