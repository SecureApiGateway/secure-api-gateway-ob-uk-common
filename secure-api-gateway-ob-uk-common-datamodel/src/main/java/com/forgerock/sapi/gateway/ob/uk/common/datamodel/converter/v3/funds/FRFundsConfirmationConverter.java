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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.funds;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.funds.FRFundsConfirmationData;
import uk.org.openbanking.datamodel.v3.fund.OBFundsConfirmation1;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAmountConverter.toFRAmount;

public class FRFundsConfirmationConverter {

    public static FRFundsConfirmationData toFRFundsConfirmationData(OBFundsConfirmation1 obFundsConfirmation) {
        return obFundsConfirmation == null ? null : FRFundsConfirmationData.builder()
                .consentId(obFundsConfirmation.getData().getConsentId())
                .reference(obFundsConfirmation.getData().getReference())
                .instructedAmount(toFRAmount(obFundsConfirmation.getData().getInstructedAmount()))
                .build();
    }
}
