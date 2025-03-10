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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

/**
 * Represents an individual single payment in a payment file. This could be a domestic or international payment of
 * single, scheduled or standing order type so will abstract the values required for payment processing so that they
 * can be processed in a generic way
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FRFilePayment {
    private String instructionIdentification;
    private String endToEndIdentification;
    private PaymentStatus status;

    private DateTime created;

    private String remittanceReference;

    private String remittanceUnstructured;

    private FRAmount instructedAmount;

    private String creditorAccountIdentification;

    /**
     * Status of an individual entry in a file payment
     */
    public enum PaymentStatus {
        PENDING, COMPLETED, REJECTED;
    }

}
