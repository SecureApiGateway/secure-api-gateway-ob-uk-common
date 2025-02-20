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
package uk.org.openbanking.datamodel.v3.payment;

import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.BigDecimalUtil.isEqual;

import java.math.BigDecimal;
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
 * Provides details on the currency exchange rate and contract.
 */

@Schema(name = "OBWriteInternational3_Data_Initiation_ExchangeRateInformation", description = "Provides details on the currency exchange rate and contract.")
@JsonTypeName("OBWriteInternational3_Data_Initiation_ExchangeRateInformation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternational3DataInitiationExchangeRateInformation {

    private String unitCurrency;

    private BigDecimal exchangeRate;

    private OBExchangeRateType rateType;

    private String contractIdentification;

    public OBWriteInternational3DataInitiationExchangeRateInformation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternational3DataInitiationExchangeRateInformation(String unitCurrency, OBExchangeRateType rateType) {
        this.unitCurrency = unitCurrency;
        this.rateType = rateType;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
     *
     * @return unitCurrency
     */
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "UnitCurrency", description = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("UnitCurrency")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
     *
     * @return exchangeRate
     */
    @Valid
    @Schema(name = "ExchangeRate", description = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExchangeRate")
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation rateType(OBExchangeRateType rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Get rateType
     *
     * @return rateType
     */
    @NotNull
    @Valid
    @Schema(name = "RateType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("RateType")
    public OBExchangeRateType getRateType() {
        return rateType;
    }

    public void setRateType(OBExchangeRateType rateType) {
        this.rateType = rateType;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
     *
     * @return contractIdentification
     */
    @Size(min = 1, max = 256)
    @Schema(name = "ContractIdentification", description = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ContractIdentification")
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternational3DataInitiationExchangeRateInformation obWriteInternational3DataInitiationExchangeRateInformation = (OBWriteInternational3DataInitiationExchangeRateInformation) o;
        return Objects.equals(this.unitCurrency, obWriteInternational3DataInitiationExchangeRateInformation.unitCurrency) &&
                // TODO: temporary fix for https://github.com/SecureApiGateway/SecureApiGateway/issues/981
                isEqual(this.exchangeRate, obWriteInternational3DataInitiationExchangeRateInformation.exchangeRate) &&
                Objects.equals(this.rateType, obWriteInternational3DataInitiationExchangeRateInformation.rateType) &&
                Objects.equals(this.contractIdentification, obWriteInternational3DataInitiationExchangeRateInformation.contractIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitCurrency, exchangeRate, rateType, contractIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational3DataInitiationExchangeRateInformation {\n");
        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
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

