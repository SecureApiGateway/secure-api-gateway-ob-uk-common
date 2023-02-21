/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Further detailed information on the exchange rate that has been used in the payment transaction.
 */
@ApiModel(description = "Further detailed information on the exchange rate that has been used in the payment transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalConsentResponse6DataExchangeRateInformation {
    @JsonProperty("UnitCurrency")
    private String unitCurrency;

    @JsonProperty("ExchangeRate")
    private BigDecimal exchangeRate;

    @JsonProperty("RateType")
    private OBExchangeRateType2Code rateType;

    @JsonProperty("ContractIdentification")
    private String contractIdentification;

    @JsonProperty("ExpirationDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime expirationDateTime;

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
     *
     * @return unitCurrency
     */
    @ApiModelProperty(required = true, value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    @NotNull

    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
     *
     * @return exchangeRate
     */
    @ApiModelProperty(required = true, value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")
    @NotNull

    @Valid

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation rateType(OBExchangeRateType2Code rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Specifies the type used to complete the currency exchange.
     *
     * @return rateType
     */
    @ApiModelProperty(required = true, value = "Specifies the type used to complete the currency exchange.")
    @NotNull


    public OBExchangeRateType2Code getRateType() {
        return rateType;
    }

    public void setRateType(OBExchangeRateType2Code rateType) {
        this.rateType = rateType;
    }

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
     *
     * @return contractIdentification
     */
    @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")

    @Size(min = 1, max = 256)
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the exchange rate agreement will expire.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @ApiModelProperty(value = "Specified date and time the exchange rate agreement will expire.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalConsentResponse6DataExchangeRateInformation obWriteInternationalConsentResponse6DataExchangeRateInformation = (OBWriteInternationalConsentResponse6DataExchangeRateInformation) o;
        return Objects.equals(this.unitCurrency, obWriteInternationalConsentResponse6DataExchangeRateInformation.unitCurrency) &&
                Objects.equals(this.exchangeRate, obWriteInternationalConsentResponse6DataExchangeRateInformation.exchangeRate) &&
                Objects.equals(this.rateType, obWriteInternationalConsentResponse6DataExchangeRateInformation.rateType) &&
                Objects.equals(this.contractIdentification, obWriteInternationalConsentResponse6DataExchangeRateInformation.contractIdentification) &&
                Objects.equals(this.expirationDateTime, obWriteInternationalConsentResponse6DataExchangeRateInformation.expirationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitCurrency, exchangeRate, rateType, contractIdentification, expirationDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalConsentResponse6DataExchangeRateInformation {\n");

        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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
