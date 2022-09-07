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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBWriteFileConsentResponse4Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFileConsentResponse4Data {
    @JsonProperty("ConsentId")
    private String consentId;

    @JsonProperty("CreationDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    /**
     * Specifies the status of consent resource in code form.
     */
    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGAUTHORISATION("AwaitingAuthorisation"),

        AWAITINGUPLOAD("AwaitingUpload"),

        CONSUMED("Consumed"),

        REJECTED("Rejected");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("Status")
    private StatusEnum status;

    @JsonProperty("StatusUpdateDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @JsonProperty("CutOffDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime cutOffDateTime;

    @JsonProperty("Charges")
    @Valid
    private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

    @JsonProperty("Initiation")
    private OBWriteFile2DataInitiation initiation;

    @JsonProperty("Authorisation")
    private OBWriteDomesticConsent4DataAuthorisation authorisation;

    @JsonProperty("SCASupportData")
    private OBSCASupportData1 scASupportData;

    @JsonProperty("Debtor")
    private OBCashAccountDebtor4 debtor;

    public OBWriteFileConsentResponse4Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     */
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @NotNull

    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteFileConsentResponse4Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteFileConsentResponse4Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of consent resource in code form.
     *
     * @return status
     */
    @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
    @NotNull


    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteFileConsentResponse4Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the consent resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the consent resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteFileConsentResponse4Data cutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     */
    @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public DateTime getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteFileConsentResponse4Data charges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteFileConsentResponse4Data addChargesItem(OBWriteDomesticConsentResponse5DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBWriteDomesticConsentResponse5DataCharges>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<OBWriteDomesticConsentResponse5DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteFileConsentResponse4Data initiation(OBWriteFile2DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBWriteFile2DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteFile2DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteFileConsentResponse4Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteFileConsentResponse4Data scASupportData(OBSCASupportData1 scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBSCASupportData1 getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBSCASupportData1 scASupportData) {
        this.scASupportData = scASupportData;
    }

    public OBWriteFileConsentResponse4Data debtor(OBCashAccountDebtor4 debtor) {
        this.debtor = debtor;
        return this;
    }

    /**
     * Get debtor
     *
     * @return debtor
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccountDebtor4 getDebtor() {
        return debtor;
    }

    public void setDebtor(OBCashAccountDebtor4 debtor) {
        this.debtor = debtor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteFileConsentResponse4Data obWriteFileConsentResponse4Data = (OBWriteFileConsentResponse4Data) o;
        return Objects.equals(this.consentId, obWriteFileConsentResponse4Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteFileConsentResponse4Data.creationDateTime) &&
                Objects.equals(this.status, obWriteFileConsentResponse4Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteFileConsentResponse4Data.statusUpdateDateTime) &&
                Objects.equals(this.cutOffDateTime, obWriteFileConsentResponse4Data.cutOffDateTime) &&
                Objects.equals(this.charges, obWriteFileConsentResponse4Data.charges) &&
                Objects.equals(this.initiation, obWriteFileConsentResponse4Data.initiation) &&
                Objects.equals(this.authorisation, obWriteFileConsentResponse4Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteFileConsentResponse4Data.scASupportData) &&
                Objects.equals(this.debtor, obWriteFileConsentResponse4Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, cutOffDateTime, charges, initiation, authorisation, scASupportData, debtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteFileConsentResponse4Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
        sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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

