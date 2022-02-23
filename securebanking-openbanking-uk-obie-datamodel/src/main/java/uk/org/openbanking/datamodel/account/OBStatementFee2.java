/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Set of elements used to provide details of a fee for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a fee for the statement resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBStatementFee2 {
    @JsonProperty("Description")
    private String description = null;
    @JsonProperty("CreditDebitIndicator")
    private CreditDebitIndicatorEnum creditDebitIndicator = null;
    @JsonProperty("Type")
    private String type = null;
    @JsonProperty("Rate")
    private BigDecimal rate = null;
    @JsonProperty("RateType")
    private String rateType = null;
    @JsonProperty("Frequency")
    private String frequency = null;
    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount amount = null;

    public OBStatementFee2 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description that may be available for the statement fee.
     *
     * @return description
     **/
    @Size(min = 1, max = 128)
    @ApiModelProperty(value = "Description that may be available for the statement fee.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBStatementFee2 creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
     *
     * @return creditDebitIndicator
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBStatementFee2 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatementFee2 rate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)
     *
     * @return rate
     **/
    @Valid
    @ApiModelProperty(value = "Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)")
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public OBStatementFee2 rateType(String rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Get rateType
     *
     * @return rateType
     **/
    @ApiModelProperty(value = "")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public OBStatementFee2 frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
     * @return frequency
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStatementFee2 amount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
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
        OBStatementFee2 obStatementFee2 = (OBStatementFee2) o;
        return Objects.equals(this.description, obStatementFee2.description) &&
                Objects.equals(this.creditDebitIndicator, obStatementFee2.creditDebitIndicator) &&
                Objects.equals(this.type, obStatementFee2.type) &&
                Objects.equals(this.rate, obStatementFee2.rate) &&
                Objects.equals(this.rateType, obStatementFee2.rateType) &&
                Objects.equals(this.frequency, obStatementFee2.frequency) &&
                Objects.equals(this.amount, obStatementFee2.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementFee2 {\n");

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

    /**
     * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
     */
    public enum CreditDebitIndicatorEnum {
        CREDIT("Credit"),

        DEBIT("Debit");

        private String value;

        CreditDebitIndicatorEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CreditDebitIndicatorEnum fromValue(String text) {
            for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

