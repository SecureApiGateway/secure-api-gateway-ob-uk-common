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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadConsent1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-11T13:05:30.079706+01:00[Europe/London]")
public class OBReadConsent1Data {
    /**
     * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
     */
    public enum PermissionsEnum {
        READACCOUNTSBASIC("ReadAccountsBasic"),

        READACCOUNTSDETAIL("ReadAccountsDetail"),

        READBALANCES("ReadBalances"),

        READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),

        READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),

        READDIRECTDEBITS("ReadDirectDebits"),

        READOFFERS("ReadOffers"),

        READPAN("ReadPAN"),

        READPARTY("ReadParty"),

        READPARTYPSU("ReadPartyPSU"),

        READPRODUCTS("ReadProducts"),

        READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),

        READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),

        READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),

        READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),

        READSTATEMENTSBASIC("ReadStatementsBasic"),

        READSTATEMENTSDETAIL("ReadStatementsDetail"),

        READTRANSACTIONSBASIC("ReadTransactionsBasic"),

        READTRANSACTIONSCREDITS("ReadTransactionsCredits"),

        READTRANSACTIONSDEBITS("ReadTransactionsDebits"),

        READTRANSACTIONSDETAIL("ReadTransactionsDetail");

        private String value;

        PermissionsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionsEnum fromValue(String value) {
            for (PermissionsEnum b : PermissionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("Permissions")
    @Valid
    private List<PermissionsEnum> permissions = new ArrayList<>();

    @JsonProperty("ExpirationDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime expirationDateTime;

    @JsonProperty("TransactionFromDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime transactionFromDateTime;

    @JsonProperty("TransactionToDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime transactionToDateTime;

    public OBReadConsent1Data permissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
        return this;
    }

    public OBReadConsent1Data addPermissionsItem(PermissionsEnum permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(min = 1)
    public List<PermissionsEnum> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
    }

    public OBReadConsent1Data expirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     */
    @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public OffsetDateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OBReadConsent1Data transactionFromDateTime(OffsetDateTime transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
        return this;
    }

    /**
     * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return transactionFromDateTime
     */
    @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public OffsetDateTime getTransactionFromDateTime() {
        return transactionFromDateTime;
    }

    public void setTransactionFromDateTime(OffsetDateTime transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
    }

    public OBReadConsent1Data transactionToDateTime(OffsetDateTime transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
        return this;
    }

    /**
     * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return transactionToDateTime
     */
    @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public OffsetDateTime getTransactionToDateTime() {
        return transactionToDateTime;
    }

    public void setTransactionToDateTime(OffsetDateTime transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadConsent1Data obReadConsent1Data = (OBReadConsent1Data) o;
        return Objects.equals(this.permissions, obReadConsent1Data.permissions) &&
                Objects.equals(this.expirationDateTime, obReadConsent1Data.expirationDateTime) &&
                Objects.equals(this.transactionFromDateTime, obReadConsent1Data.transactionFromDateTime) &&
                Objects.equals(this.transactionToDateTime, obReadConsent1Data.transactionToDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadConsent1Data {\n");

        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
        sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
        sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

