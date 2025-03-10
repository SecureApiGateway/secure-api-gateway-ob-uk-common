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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.funds.FRFundsConfirmationConsent;
import uk.org.openbanking.datamodel.v3.fund.OBFundsConfirmationConsent1;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRAccountIdentifierConverter.toFRAccountIdentifier;

public class FRFundsConfirmationConsentConverter {

    public static FRFundsConfirmationConsent toFRFundsConfirmationConsent(OBFundsConfirmationConsent1 obFundsConfirmationConsent) {
        return FRModelMapper.map(obFundsConfirmationConsent, FRFundsConfirmationConsent.class);
    }

    public static OBFundsConfirmationConsent1 toOBFundsConfirmationConsent1(FRFundsConfirmationConsent fundsConfirmationConsent) {
        return FRModelMapper.map(fundsConfirmationConsent, OBFundsConfirmationConsent1.class);
    }
}
