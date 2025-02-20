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
package uk.org.openbanking.datamodel.v3.account;

import java.util.ArrayList;
import java.util.List;
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
 * Unambiguous identification of the account to which credit and debit entries are made.
 */

@Schema(name = "OBAccount6Detail", description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBAccount6Detail {

    private String accountId;

    private OBAccountStatus1Code status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private String currency;

    private OBExternalAccountType1Code accountType;

    private OBExternalAccountSubType1Code accountSubType;

    private String description;

    private String nickname;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime openingDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime maturityDate;

    private String switchStatus;

    @Valid
    private List<@Valid OBAccount6AccountInner> account = new ArrayList<>();

    private OBBranchAndFinancialInstitutionIdentification50 servicer;

    public OBAccount6Detail() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBAccount6Detail(String accountId, String currency, OBExternalAccountType1Code accountType, OBExternalAccountSubType1Code accountSubType, List<@Valid OBAccount6AccountInner> account) {
        this.accountId = accountId;
        this.currency = currency;
        this.accountType = accountType;
        this.accountSubType = accountSubType;
        this.account = account;
    }

    public OBAccount6Detail accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     */
    @NotNull
    @Size(min = 1, max = 40)
    @Schema(name = "AccountId", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBAccount6Detail status(OBAccountStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @Valid
    @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Status")
    public OBAccountStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBAccountStatus1Code status) {
        this.status = status;
    }

    public OBAccount6Detail statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     */
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBAccount6Detail currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
     *
     * @return currency
     */
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @Schema(name = "Currency", description = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OBAccount6Detail accountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     */
    @NotNull
    @Valid
    @Schema(name = "AccountType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AccountType")
    public OBExternalAccountType1Code getAccountType() {
        return accountType;
    }

    public void setAccountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
    }

    public OBAccount6Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
        return this;
    }

    /**
     * Get accountSubType
     *
     * @return accountSubType
     */
    @NotNull
    @Valid
    @Schema(name = "AccountSubType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("AccountSubType")
    public OBExternalAccountSubType1Code getAccountSubType() {
        return accountSubType;
    }

    public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
    }

    public OBAccount6Detail description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Specifies the description of the account type.
     *
     * @return description
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Description", description = "Specifies the description of the account type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBAccount6Detail nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
     *
     * @return nickname
     */
    @Size(min = 1, max = 70)
    @Schema(name = "Nickname", description = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public OBAccount6Detail openingDate(DateTime openingDate) {
        this.openingDate = openingDate;
        return this;
    }

    /**
     * Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return openingDate
     */
    @Valid
    @Schema(name = "OpeningDate", description = "Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("OpeningDate")
    public DateTime getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(DateTime openingDate) {
        this.openingDate = openingDate;
    }

    public OBAccount6Detail maturityDate(DateTime maturityDate) {
        this.maturityDate = maturityDate;
        return this;
    }

    /**
     * Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return maturityDate
     */
    @Valid
    @Schema(name = "MaturityDate", description = "Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MaturityDate")
    public DateTime getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(DateTime maturityDate) {
        this.maturityDate = maturityDate;
    }

    public OBAccount6Detail switchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * Specifies the switch status for the account, in a coded form.
     *
     * @return switchStatus
     */

    @Schema(name = "SwitchStatus", description = "Specifies the switch status for the account, in a coded form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SwitchStatus")
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    public OBAccount6Detail account(List<@Valid OBAccount6AccountInner> account) {
        this.account = account;
        return this;
    }

    public OBAccount6Detail addAccountItem(OBAccount6AccountInner accountItem) {
        if (this.account == null) {
            this.account = new ArrayList<>();
        }
        this.account.add(accountItem);
        return this;
    }

    /**
     * Get account
     *
     * @return account
     */
    @NotNull
    @Valid
    @Schema(name = "Account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Account")
    public List<@Valid OBAccount6AccountInner> getAccount() {
        return account;
    }

    public void setAccount(List<@Valid OBAccount6AccountInner> account) {
        this.account = account;
    }

    public OBAccount6Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        this.servicer = servicer;
        return this;
    }

    /**
     * Get servicer
     *
     * @return servicer
     */
    @Valid
    @Schema(name = "Servicer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Servicer")
    public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
        return servicer;
    }

    public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        this.servicer = servicer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBAccount6Detail obAccount6Detail = (OBAccount6Detail) o;
        return Objects.equals(this.accountId, obAccount6Detail.accountId) &&
                Objects.equals(this.status, obAccount6Detail.status) &&
                Objects.equals(this.statusUpdateDateTime, obAccount6Detail.statusUpdateDateTime) &&
                Objects.equals(this.currency, obAccount6Detail.currency) &&
                Objects.equals(this.accountType, obAccount6Detail.accountType) &&
                Objects.equals(this.accountSubType, obAccount6Detail.accountSubType) &&
                Objects.equals(this.description, obAccount6Detail.description) &&
                Objects.equals(this.nickname, obAccount6Detail.nickname) &&
                Objects.equals(this.openingDate, obAccount6Detail.openingDate) &&
                Objects.equals(this.maturityDate, obAccount6Detail.maturityDate) &&
                Objects.equals(this.switchStatus, obAccount6Detail.switchStatus) &&
                Objects.equals(this.account, obAccount6Detail.account) &&
                Objects.equals(this.servicer, obAccount6Detail.servicer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, openingDate, maturityDate, switchStatus, account, servicer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBAccount6Detail {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
        sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

