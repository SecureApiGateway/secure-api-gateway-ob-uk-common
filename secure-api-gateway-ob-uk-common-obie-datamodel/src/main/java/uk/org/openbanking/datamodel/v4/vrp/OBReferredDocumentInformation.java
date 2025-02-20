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
 * OBReferredDocumentInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReferredDocumentInformation {

    private ExternalDocumentType1Code code;

    private String issuer;

    private String number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime relatedDate;

    @Valid
    private List<String> lineDetails;

    public OBReferredDocumentInformation code(ExternalDocumentType1Code code) {
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

    public OBReferredDocumentInformation issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Identification of the issuer of the reference document type.
     *
     * @return issuer
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Issuer", description = "Identification of the issuer of the reference document type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Issuer")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public OBReferredDocumentInformation number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Identification of the type specified for the referred document line.
     *
     * @return number
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Number", description = "Identification of the type specified for the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public OBReferredDocumentInformation relatedDate(DateTime relatedDate) {
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

    public OBReferredDocumentInformation lineDetails(List<String> lineDetails) {
        this.lineDetails = lineDetails;
        return this;
    }

    public OBReferredDocumentInformation addLineDetailsItem(String lineDetailsItem) {
        if (this.lineDetails == null) {
            this.lineDetails = new ArrayList<>();
        }
        this.lineDetails.add(lineDetailsItem);
        return this;
    }

    /**
     * Set of elements used to provide the content of the referred document line.
     *
     * @return lineDetails
     */

    @Schema(name = "LineDetails", description = "Set of elements used to provide the content of the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("LineDetails")
    public List<String> getLineDetails() {
        return lineDetails;
    }

    public void setLineDetails(List<String> lineDetails) {
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
        OBReferredDocumentInformation obReferredDocumentInformation = (OBReferredDocumentInformation) o;
        return Objects.equals(this.code, obReferredDocumentInformation.code) &&
                Objects.equals(this.issuer, obReferredDocumentInformation.issuer) &&
                Objects.equals(this.number, obReferredDocumentInformation.number) &&
                Objects.equals(this.relatedDate, obReferredDocumentInformation.relatedDate) &&
                Objects.equals(this.lineDetails, obReferredDocumentInformation.lineDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, issuer, number, relatedDate, lineDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReferredDocumentInformation {\n");
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

