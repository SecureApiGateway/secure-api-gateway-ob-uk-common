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

import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.BigDecimalUtil.isEqual;

import java.math.BigDecimal;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.
 */

@Schema(name = "OBWriteFile2_Data_Initiation", description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.")
@JsonTypeName("OBWriteFile2_Data_Initiation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteFile2DataInitiation {

    private String fileType;

    private String fileHash;

    private String fileReference;

    private String numberOfTransactions;

    private BigDecimal controlSum;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime requestedExecutionDateTime;

    private String localInstrument;

    private OBWriteDomestic2DataInitiationCreditorAgent creditorAgent;

    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount;

    private OBUltimateDebtor1 ultimateDebtor;

    private OBRemittanceInformation2 remittanceInformation;

    private OBSupplementaryData1 supplementaryData;

    public OBWriteFile2DataInitiation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteFile2DataInitiation(String fileType, String fileHash) {
        this.fileType = fileType;
        this.fileHash = fileHash;
    }

    public OBWriteFile2DataInitiation fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Specifies the payment file type.
     *
     * @return fileType
     */
    @NotNull
    @Schema(name = "FileType", description = "Specifies the payment file type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FileType")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public OBWriteFile2DataInitiation fileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * A base64 encoding of a SHA256 hash of the file to be uploaded.
     *
     * @return fileHash
     */
    @NotNull
    @Size(min = 1, max = 44)
    @Schema(name = "FileHash", description = "A base64 encoding of a SHA256 hash of the file to be uploaded.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FileHash")
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public OBWriteFile2DataInitiation fileReference(String fileReference) {
        this.fileReference = fileReference;
        return this;
    }

    /**
     * Reference for the file.
     *
     * @return fileReference
     */
    @Size(min = 1, max = 40)
    @Schema(name = "FileReference", description = "Reference for the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FileReference")
    public String getFileReference() {
        return fileReference;
    }

    public void setFileReference(String fileReference) {
        this.fileReference = fileReference;
    }

    public OBWriteFile2DataInitiation numberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
        return this;
    }

    /**
     * Number of individual transactions contained in the payment information group.
     *
     * @return numberOfTransactions
     */
    @Pattern(regexp = "[0-9]{1,15}")
    @Schema(name = "NumberOfTransactions", description = "Number of individual transactions contained in the payment information group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NumberOfTransactions")
    public String getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public OBWriteFile2DataInitiation controlSum(BigDecimal controlSum) {
        this.controlSum = controlSum;
        return this;
    }

    /**
     * Total of all individual amounts included in the group, irrespective of currencies.
     *
     * @return controlSum
     */
    @Valid
    @Schema(name = "ControlSum", description = "Total of all individual amounts included in the group, irrespective of currencies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ControlSum")
    public BigDecimal getControlSum() {
        return controlSum;
    }

    public void setControlSum(BigDecimal controlSum) {
        this.controlSum = controlSum;
    }

    public OBWriteFile2DataInitiation requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        return this;
    }

    /**
     * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return requestedExecutionDateTime
     */
    @Valid
    @Schema(name = "RequestedExecutionDateTime", description = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RequestedExecutionDateTime")
    public DateTime getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
    }

    public OBWriteFile2DataInitiation localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
     *
     * @return localInstrument
     */

    @Schema(name = "LocalInstrument", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LocalInstrument")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBWriteFile2DataInitiation creditorAgent(OBWriteDomestic2DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     */
    @Valid
    @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CreditorAgent")
    public OBWriteDomestic2DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteDomestic2DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteFile2DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteFile2DataInitiation ultimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
        return this;
    }

    /**
     * Get ultimateDebtor
     *
     * @return ultimateDebtor
     */
    @Valid
    @Schema(name = "UltimateDebtor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UltimateDebtor")
    public OBUltimateDebtor1 getUltimateDebtor() {
        return ultimateDebtor;
    }

    public void setUltimateDebtor(OBUltimateDebtor1 ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
    }

    public OBWriteFile2DataInitiation remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     *
     * @return remittanceInformation
     */
    @Valid
    @Schema(name = "RemittanceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RemittanceInformation")
    public OBRemittanceInformation2 getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public OBWriteFile2DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     */
    @Valid
    @Schema(name = "SupplementaryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteFile2DataInitiation obWriteFile2DataInitiation = (OBWriteFile2DataInitiation) o;
        return Objects.equals(this.fileType, obWriteFile2DataInitiation.fileType) &&
                Objects.equals(this.fileHash, obWriteFile2DataInitiation.fileHash) &&
                Objects.equals(this.fileReference, obWriteFile2DataInitiation.fileReference) &&
                Objects.equals(this.numberOfTransactions, obWriteFile2DataInitiation.numberOfTransactions) &&
                isEqual(this.controlSum, obWriteFile2DataInitiation.controlSum) &&
                Objects.equals(this.requestedExecutionDateTime, obWriteFile2DataInitiation.requestedExecutionDateTime) &&
                Objects.equals(this.localInstrument, obWriteFile2DataInitiation.localInstrument) &&
                Objects.equals(this.creditorAgent, obWriteFile2DataInitiation.creditorAgent) &&
                Objects.equals(this.debtorAccount, obWriteFile2DataInitiation.debtorAccount) &&
                Objects.equals(this.ultimateDebtor, obWriteFile2DataInitiation.ultimateDebtor) &&
                Objects.equals(this.remittanceInformation, obWriteFile2DataInitiation.remittanceInformation) &&
                Objects.equals(this.supplementaryData, obWriteFile2DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, fileHash, fileReference, numberOfTransactions, controlSum, requestedExecutionDateTime, localInstrument, creditorAgent, debtorAccount, ultimateDebtor, remittanceInformation, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteFile2DataInitiation {\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    fileReference: ").append(toIndentedString(fileReference)).append("\n");
        sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
        sb.append("    controlSum: ").append(toIndentedString(controlSum)).append("\n");
        sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

