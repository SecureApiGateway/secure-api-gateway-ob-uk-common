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

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * Information needed due to regulatory and statutory requirements
 */

@Schema(name = "OBRegulatoryReporting1", description = "Information needed due to regulatory and statutory requirements")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRegulatoryReporting1 {

    private OBRegulatoryReporting1DebitCreditReportingIndicator debitCreditReportingIndicator;

    private OBRegulatoryAuthority2 authority;

    @Valid
    private List<@Valid OBStructuredRegulatoryReporting3> details;

    public OBRegulatoryReporting1 debitCreditReportingIndicator(OBRegulatoryReporting1DebitCreditReportingIndicator debitCreditReportingIndicator) {
        this.debitCreditReportingIndicator = debitCreditReportingIndicator;
        return this;
    }

    /**
     * Get debitCreditReportingIndicator
     *
     * @return debitCreditReportingIndicator
     */
    @Valid
    @Schema(name = "DebitCreditReportingIndicator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebitCreditReportingIndicator")
    public OBRegulatoryReporting1DebitCreditReportingIndicator getDebitCreditReportingIndicator() {
        return debitCreditReportingIndicator;
    }

    public void setDebitCreditReportingIndicator(OBRegulatoryReporting1DebitCreditReportingIndicator debitCreditReportingIndicator) {
        this.debitCreditReportingIndicator = debitCreditReportingIndicator;
    }

    public OBRegulatoryReporting1 authority(OBRegulatoryAuthority2 authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Get authority
     *
     * @return authority
     */
    @Valid
    @Schema(name = "Authority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Authority")
    public OBRegulatoryAuthority2 getAuthority() {
        return authority;
    }

    public void setAuthority(OBRegulatoryAuthority2 authority) {
        this.authority = authority;
    }

    public OBRegulatoryReporting1 details(List<@Valid OBStructuredRegulatoryReporting3> details) {
        this.details = details;
        return this;
    }

    public OBRegulatoryReporting1 addDetailsItem(OBStructuredRegulatoryReporting3 detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Set of elements used to provide details on the regulatory reporting information.
     *
     * @return details
     */
    @Valid
    @Schema(name = "Details", description = "Set of elements used to provide details on the regulatory reporting information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Details")
    public List<@Valid OBStructuredRegulatoryReporting3> getDetails() {
        return details;
    }

    public void setDetails(List<@Valid OBStructuredRegulatoryReporting3> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRegulatoryReporting1 obRegulatoryReporting1 = (OBRegulatoryReporting1) o;
        return Objects.equals(this.debitCreditReportingIndicator, obRegulatoryReporting1.debitCreditReportingIndicator) &&
                Objects.equals(this.authority, obRegulatoryReporting1.authority) &&
                Objects.equals(this.details, obRegulatoryReporting1.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debitCreditReportingIndicator, authority, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRegulatoryReporting1 {\n");
        sb.append("    debitCreditReportingIndicator: ").append(toIndentedString(debitCreditReportingIndicator)).append("\n");
        sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

