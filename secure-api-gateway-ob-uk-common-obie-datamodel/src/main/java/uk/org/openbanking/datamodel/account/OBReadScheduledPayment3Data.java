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
package uk.org.openbanking.datamodel.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBReadScheduledPayment3Data
 */

@JsonTypeName("OBReadScheduledPayment3_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBReadScheduledPayment3Data {

    @Valid
    private List<@Valid OBScheduledPayment3> scheduledPayment;

    public OBReadScheduledPayment3Data scheduledPayment(List<@Valid OBScheduledPayment3> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
        return this;
    }

    public OBReadScheduledPayment3Data addScheduledPaymentItem(OBScheduledPayment3 scheduledPaymentItem) {
        if (this.scheduledPayment == null) {
            this.scheduledPayment = new ArrayList<>();
        }
        this.scheduledPayment.add(scheduledPaymentItem);
        return this;
    }

    /**
     * Get scheduledPayment
     *
     * @return scheduledPayment
     */
    @Valid
    @Schema(name = "ScheduledPayment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ScheduledPayment")
    public List<@Valid OBScheduledPayment3> getScheduledPayment() {
        return scheduledPayment;
    }

    public void setScheduledPayment(List<@Valid OBScheduledPayment3> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadScheduledPayment3Data obReadScheduledPayment3Data = (OBReadScheduledPayment3Data) o;
        return Objects.equals(this.scheduledPayment, obReadScheduledPayment3Data.scheduledPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledPayment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadScheduledPayment3Data {\n");
        sb.append("    scheduledPayment: ").append(toIndentedString(scheduledPayment)).append("\n");
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

