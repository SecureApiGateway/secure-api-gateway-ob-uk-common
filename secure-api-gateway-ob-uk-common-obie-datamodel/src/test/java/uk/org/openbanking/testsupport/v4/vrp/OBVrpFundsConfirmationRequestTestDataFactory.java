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
package uk.org.openbanking.testsupport.v4.vrp;

import java.util.UUID;

import uk.org.openbanking.datamodel.v3.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPFundsConfirmationRequest;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPFundsConfirmationRequestData;
import uk.org.openbanking.testsupport.v3.vrp.ConstantsVrpTestData;

public class OBVrpFundsConfirmationRequestTestDataFactory {

    public static OBVRPFundsConfirmationRequest aValidOBVRPFundsConfirmationRequest() {
        return new OBVRPFundsConfirmationRequest()
                .data(
                        new OBVRPFundsConfirmationRequestData()
                                .consentId(ConstantsVrpTestData.CONSENT_PREFIX + UUID.randomUUID().toString())
                                .reference(ConstantsVrpTestData.FUNDS_REFERENCE)
                                .instructedAmount(
                                        new OBActiveOrHistoricCurrencyAndAmount()
                                                .amount(ConstantsVrpTestData.AMOUNT)
                                                .currency(ConstantsVrpTestData.GBP)
                                )

                );
    }

    public static OBVRPFundsConfirmationRequest aValidOBVRPFundsConfirmationRequest(
            String consentId, String reference, String amount, String currency
    ) {
        return new OBVRPFundsConfirmationRequest()
                .data(
                        new OBVRPFundsConfirmationRequestData()
                                .consentId(consentId)
                                .reference(reference)
                                .instructedAmount(
                                        new OBActiveOrHistoricCurrencyAndAmount()
                                                .amount(amount)
                                                .currency(currency)
                                )

                );
    }
}
