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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBActiveOrHistoricCurrencyAndAmount;

/**
 * Set of elements used to provide details on the regulatory reporting information.
 */

@Schema(name = "OBStructuredRegulatoryReporting3", description = "Set of elements used to provide details on the regulatory reporting information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBStructuredRegulatoryReporting3 {

    private String type;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime date;

    private String country;

    private OBActiveOrHistoricCurrencyAndAmount amount;

    @Valid
    private List<@Size(min = 1, max = 35) String> information;

    public OBStructuredRegulatoryReporting3 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Specifies the type of the information supplied in the regulatory reporting details
     *
     * @return type
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Type", description = "Specifies the type of the information supplied in the regulatory reporting details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStructuredRegulatoryReporting3 date(DateTime date) {
        this.date = date;
        return this;
    }

    /**
     * All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return date
     */
    @Valid
    @Schema(name = "Date", description = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Date")
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public OBStructuredRegulatoryReporting3 country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Nation with its own government.
     *
     * @return country
     */
    @Pattern(regexp = "^[A-Z]{2,2}$")
    @Schema(name = "Country", description = "Nation with its own government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public OBStructuredRegulatoryReporting3 amount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @Valid
    @Schema(name = "Amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
    }

    public OBStructuredRegulatoryReporting3 information(List<@Size(min = 1, max = 35) String> information) {
        this.information = information;
        return this;
    }

    public OBStructuredRegulatoryReporting3 addInformationItem(String informationItem) {
        if (this.information == null) {
            this.information = new ArrayList<>();
        }
        this.information.add(informationItem);
        return this;
    }

    /**
     * Additional details that cater for specific domestic regulatory requirements.
     *
     * @return information
     */

    @Schema(name = "Information", description = "Additional details that cater for specific domestic regulatory requirements. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Information")
    public List<@Size(min = 1, max = 35) String> getInformation() {
        return information;
    }

    public void setInformation(List<@Size(min = 1, max = 35) String> information) {
        this.information = information;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStructuredRegulatoryReporting3 obStructuredRegulatoryReporting3 = (OBStructuredRegulatoryReporting3) o;
        return Objects.equals(this.type, obStructuredRegulatoryReporting3.type) &&
                Objects.equals(this.date, obStructuredRegulatoryReporting3.date) &&
                Objects.equals(this.country, obStructuredRegulatoryReporting3.country) &&
                Objects.equals(this.amount, obStructuredRegulatoryReporting3.amount) &&
                Objects.equals(this.information, obStructuredRegulatoryReporting3.information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date, country, amount, information);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStructuredRegulatoryReporting3 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    information: ").append(toIndentedString(information)).append("\n");
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

