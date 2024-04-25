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
package uk.org.openbanking.datamodel.fund;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import uk.org.openbanking.datamodel.fund.OBExchangeRateType;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * Further detailed information on the exchange rate that has been used in the payment transaction.
 */

@Schema(name = "OBWriteInternationalConsentResponse6_Data_ExchangeRateInformation", description = "Further detailed information on the exchange rate that has been used in the payment transaction.")
@JsonTypeName("OBWriteInternationalConsentResponse6_Data_ExchangeRateInformation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalConsentResponse6DataExchangeRateInformation {

    private String unitCurrency;

    private BigDecimal exchangeRate;

    private OBExchangeRateType rateType;

    private String contractIdentification;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expirationDateTime;

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalConsentResponse6DataExchangeRateInformation(String unitCurrency, BigDecimal exchangeRate, OBExchangeRateType rateType) {
        this.unitCurrency = unitCurrency;
        this.exchangeRate = exchangeRate;
        this.rateType = rateType;
    }

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation unitCurrency(String unitCurrency) {
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

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
     *
     * @return exchangeRate
     */
    @NotNull
    @Valid
    @Schema(name = "ExchangeRate", description = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ExchangeRate")
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation rateType(OBExchangeRateType rateType) {
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

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation contractIdentification(String contractIdentification) {
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

    public OBWriteInternationalConsentResponse6DataExchangeRateInformation expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the exchange rate agreement will expire.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @Valid
    @Schema(name = "ExpirationDateTime", description = "Specified date and time the exchange rate agreement will expire.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpirationDateTime")
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

