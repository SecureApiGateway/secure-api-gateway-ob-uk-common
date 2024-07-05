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
package uk.org.openbanking.datamodel.v3.fund;

import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OBFundsConfirmationConsent1Data
 */

@JsonTypeName("OBFundsConfirmationConsent1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFundsConfirmationConsent1Data {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expirationDateTime;

    private OBFundsConfirmationConsent1DataDebtorAccount debtorAccount;

    public OBFundsConfirmationConsent1Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBFundsConfirmationConsent1Data(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBFundsConfirmationConsent1Data expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @Valid
    @Schema(name = "ExpirationDateTime", description = "Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpirationDateTime")
    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OBFundsConfirmationConsent1Data debtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @NotNull
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBFundsConfirmationConsent1DataDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBFundsConfirmationConsent1Data obFundsConfirmationConsent1Data = (OBFundsConfirmationConsent1Data) o;
        return Objects.equals(this.expirationDateTime, obFundsConfirmationConsent1Data.expirationDateTime) &&
                Objects.equals(this.debtorAccount, obFundsConfirmationConsent1Data.debtorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationDateTime, debtorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationConsent1Data {\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

