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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Common representation of a Charge, typically used in the OBIE Payment API to indicate a cost incurred to a chargeBearer
 * in order for the transaction to be made.
 * <p>
 * Example OBIE schema type: {@link uk.org.openbanking.datamodel.payment.OBWriteDomesticConsentResponse5DataCharges}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRCharge {

    private FRChargeBearerType chargeBearer;
    private String type;
    private FRAmount amount;
}
