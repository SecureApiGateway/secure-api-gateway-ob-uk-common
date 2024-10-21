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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.common.FRExternalPaymentContextCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.common.FRPaymentRisk;

import static java.util.Collections.singletonList;

/**
 * Test data factory for {@link FRPaymentRisk}.
 */
public class FRPaymentRiskTestDataFactory {

    public static FRPaymentRisk aValidFRPaymentRisk() {
        return FRPaymentRisk.builder()
                .paymentContextCode(FRExternalPaymentContextCode.BILLPAYMENT)
                .merchantCategoryCode("ABCD")
                .deliveryAddress(FRPaymentRisk.FRRiskDeliveryAddress.builder()
                        .addressLine(singletonList("60 Queens Square"))
                        .townName("Bristol")
                        .postCode("BS1 4JZ")
                        .country("UK")
                        .build())
                .build();
    }
}
