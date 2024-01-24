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
package uk.org.openbanking.datamodel.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * The resource-update event.
 */

@Schema(name = "OBEventSubject1", description = "The resource-update event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBEventSubject1 {

    private String subjectType;

    private String httpColonOpenbankingOrgUkRid;

    private String httpColonOpenbankingOrgUkRty;

    @Valid
    private List<@Valid OBEventLink1> httpColonOpenbankingOrgUkRlk = new ArrayList<>();

    public OBEventSubject1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBEventSubject1(String subjectType, String httpColonOpenbankingOrgUkRid, String httpColonOpenbankingOrgUkRty, List<@Valid OBEventLink1> httpColonOpenbankingOrgUkRlk) {
        this.subjectType = subjectType;
        this.httpColonOpenbankingOrgUkRid = httpColonOpenbankingOrgUkRid;
        this.httpColonOpenbankingOrgUkRty = httpColonOpenbankingOrgUkRty;
        this.httpColonOpenbankingOrgUkRlk = httpColonOpenbankingOrgUkRlk;
    }

    public OBEventSubject1 subjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * Subject type for the updated resource.
     *
     * @return subjectType
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "subject_type", description = "Subject type for the updated resource. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subject_type")
    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public OBEventSubject1 httpColonOpenbankingOrgUkRid(String httpColonOpenbankingOrgUkRid) {
        this.httpColonOpenbankingOrgUkRid = httpColonOpenbankingOrgUkRid;
        return this;
    }

    /**
     * Resource Id for the updated resource.
     *
     * @return httpColonOpenbankingOrgUkRid
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "http://openbanking.org.uk/rid", description = "Resource Id for the updated resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("http://openbanking.org.uk/rid")
    public String getHttpColonOpenbankingOrgUkRid() {
        return httpColonOpenbankingOrgUkRid;
    }

    public void setHttpColonOpenbankingOrgUkRid(String httpColonOpenbankingOrgUkRid) {
        this.httpColonOpenbankingOrgUkRid = httpColonOpenbankingOrgUkRid;
    }

    public OBEventSubject1 httpColonOpenbankingOrgUkRty(String httpColonOpenbankingOrgUkRty) {
        this.httpColonOpenbankingOrgUkRty = httpColonOpenbankingOrgUkRty;
        return this;
    }

    /**
     * Resource Type for the updated resource.
     *
     * @return httpColonOpenbankingOrgUkRty
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "http://openbanking.org.uk/rty", description = "Resource Type for the updated resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("http://openbanking.org.uk/rty")
    public String getHttpColonOpenbankingOrgUkRty() {
        return httpColonOpenbankingOrgUkRty;
    }

    public void setHttpColonOpenbankingOrgUkRty(String httpColonOpenbankingOrgUkRty) {
        this.httpColonOpenbankingOrgUkRty = httpColonOpenbankingOrgUkRty;
    }

    public OBEventSubject1 httpColonOpenbankingOrgUkRlk(List<@Valid OBEventLink1> httpColonOpenbankingOrgUkRlk) {
        this.httpColonOpenbankingOrgUkRlk = httpColonOpenbankingOrgUkRlk;
        return this;
    }

    public OBEventSubject1 addHttpColonOpenbankingOrgUkRlkItem(OBEventLink1 httpColonOpenbankingOrgUkRlkItem) {
        if (this.httpColonOpenbankingOrgUkRlk == null) {
            this.httpColonOpenbankingOrgUkRlk = new ArrayList<>();
        }
        this.httpColonOpenbankingOrgUkRlk.add(httpColonOpenbankingOrgUkRlkItem);
        return this;
    }

    /**
     * Resource links to other available versions of the resource.
     *
     * @return httpColonOpenbankingOrgUkRlk
     */
    @NotNull
    @Valid
    @Size(min = 1)
    @Schema(name = "http://openbanking.org.uk/rlk", description = "Resource links to other available versions of the resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("http://openbanking.org.uk/rlk")
    public List<@Valid OBEventLink1> getHttpColonOpenbankingOrgUkRlk() {
        return httpColonOpenbankingOrgUkRlk;
    }

    public void setHttpColonOpenbankingOrgUkRlk(List<@Valid OBEventLink1> httpColonOpenbankingOrgUkRlk) {
        this.httpColonOpenbankingOrgUkRlk = httpColonOpenbankingOrgUkRlk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubject1 obEventSubject1 = (OBEventSubject1) o;
        return Objects.equals(this.subjectType, obEventSubject1.subjectType) &&
                Objects.equals(this.httpColonOpenbankingOrgUkRid, obEventSubject1.httpColonOpenbankingOrgUkRid) &&
                Objects.equals(this.httpColonOpenbankingOrgUkRty, obEventSubject1.httpColonOpenbankingOrgUkRty) &&
                Objects.equals(this.httpColonOpenbankingOrgUkRlk, obEventSubject1.httpColonOpenbankingOrgUkRlk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectType, httpColonOpenbankingOrgUkRid, httpColonOpenbankingOrgUkRty, httpColonOpenbankingOrgUkRlk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubject1 {\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
        sb.append("    httpColonOpenbankingOrgUkRid: ").append(toIndentedString(httpColonOpenbankingOrgUkRid)).append("\n");
        sb.append("    httpColonOpenbankingOrgUkRty: ").append(toIndentedString(httpColonOpenbankingOrgUkRty)).append("\n");
        sb.append("    httpColonOpenbankingOrgUkRlk: ").append(toIndentedString(httpColonOpenbankingOrgUkRlk)).append("\n");
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

