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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadScheduledPayment2Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBReadScheduledPayment2Data {
    @JsonProperty("ScheduledPayment")
    private List<OBScheduledPayment2> scheduledPayment = null;

    public OBReadScheduledPayment2Data scheduledPayment(List<OBScheduledPayment2> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
        return this;
    }

    public OBReadScheduledPayment2Data addScheduledPaymentItem(OBScheduledPayment2 scheduledPaymentItem) {
        if (this.scheduledPayment == null) {
            this.scheduledPayment = new ArrayList<OBScheduledPayment2>();
        }
        this.scheduledPayment.add(scheduledPaymentItem);
        return this;
    }

    /**
     * Get scheduledPayment
     *
     * @return scheduledPayment
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBScheduledPayment2> getScheduledPayment() {
        return scheduledPayment;
    }

    public void setScheduledPayment(List<OBScheduledPayment2> scheduledPayment) {
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
        OBReadScheduledPayment2Data obReadScheduledPayment2Data = (OBReadScheduledPayment2Data) o;
        return Objects.equals(this.scheduledPayment, obReadScheduledPayment2Data.scheduledPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledPayment);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadScheduledPayment2Data {\n");

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

