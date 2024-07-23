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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

/**
 * OBWritePaymentDetails1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWritePaymentDetails1 {

    private OBWritePaymentDetails1PaymentStatus paymentStatus;

    public OBWritePaymentDetails1 paymentStatus(OBWritePaymentDetails1PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Get paymentStatus
     *
     * @return paymentStatus
     */
    @Valid
    @Schema(name = "PaymentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PaymentStatus")
    public OBWritePaymentDetails1PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(OBWritePaymentDetails1PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWritePaymentDetails1 obWritePaymentDetails1 = (OBWritePaymentDetails1) o;
        return Objects.equals(this.paymentStatus, obWritePaymentDetails1.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetails1 {\n");
        sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

