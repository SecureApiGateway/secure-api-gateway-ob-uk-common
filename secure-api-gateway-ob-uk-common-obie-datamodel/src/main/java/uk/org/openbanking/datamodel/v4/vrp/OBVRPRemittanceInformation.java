/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v4.vrp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.common.ExternalDocumentType1Code;

/**
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts&#39; receivable system.
 */

@Schema(name = "OBVRPRemittanceInformation", description = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBVRPRemittanceInformation {

    private ExternalDocumentType1Code code;

    private String issuer;

    private String number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime relatedDate;

    @Valid
    private List<@Size(min = 1, max = 256) String> lineDetails;

    public OBVRPRemittanceInformation code(ExternalDocumentType1Code code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @Valid
    @Schema(name = "Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Code")
    public ExternalDocumentType1Code getCode() {
        return code;
    }

    public void setCode(ExternalDocumentType1Code code) {
        this.code = code;
    }

    public OBVRPRemittanceInformation issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get issuer
     *
     * @return issuer
     */
    @Size(min = 1, max = 140)
    @Schema(name = "Issuer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Issuer")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public OBVRPRemittanceInformation number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     *
     * @return number
     */
    @Size(min = 1, max = 140)
    @Schema(name = "Number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public OBVRPRemittanceInformation relatedDate(DateTime relatedDate) {
        this.relatedDate = relatedDate;
        return this;
    }

    /**
     * All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return relatedDate
     */
    @Valid
    @Schema(name = "RelatedDate", description = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RelatedDate")
    public DateTime getRelatedDate() {
        return relatedDate;
    }

    public void setRelatedDate(DateTime relatedDate) {
        this.relatedDate = relatedDate;
    }

    public OBVRPRemittanceInformation lineDetails(List<@Size(min = 1, max = 256) String> lineDetails) {
        this.lineDetails = lineDetails;
        return this;
    }

    public OBVRPRemittanceInformation addLineDetailsItem(String lineDetailsItem) {
        if (this.lineDetails == null) {
            this.lineDetails = new ArrayList<>();
        }
        this.lineDetails.add(lineDetailsItem);
        return this;
    }

    /**
     * Get lineDetails
     *
     * @return lineDetails
     */

    @Schema(name = "LineDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LineDetails")
    public List<@Size(min = 1, max = 256) String> getLineDetails() {
        return lineDetails;
    }

    public void setLineDetails(List<@Size(min = 1, max = 256) String> lineDetails) {
        this.lineDetails = lineDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBVRPRemittanceInformation obVRPRemittanceInformation = (OBVRPRemittanceInformation) o;
        return Objects.equals(this.code, obVRPRemittanceInformation.code) &&
                Objects.equals(this.issuer, obVRPRemittanceInformation.issuer) &&
                Objects.equals(this.number, obVRPRemittanceInformation.number) &&
                Objects.equals(this.relatedDate, obVRPRemittanceInformation.relatedDate) &&
                Objects.equals(this.lineDetails, obVRPRemittanceInformation.lineDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, issuer, number, relatedDate, lineDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBVRPRemittanceInformation {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    relatedDate: ").append(toIndentedString(relatedDate)).append("\n");
        sb.append("    lineDetails: ").append(toIndentedString(lineDetails)).append("\n");
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

