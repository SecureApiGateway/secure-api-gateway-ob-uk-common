/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditDebitIndicator;
import uk.org.openbanking.datamodel.v4.account.OBCreditDebitCode0;
import uk.org.openbanking.datamodel.v4.account.OBCreditDebitCode1;
import uk.org.openbanking.datamodel.v4.account.OBCreditDebitCode2;

public class FRCreditDebitIndicatorConverter {

    // FR to OB
    public static OBCreditDebitCode1 toOBCreditDebitCode1(FRCreditDebitIndicator indicator) {
        return indicator == null ? null : OBCreditDebitCode1.valueOf(indicator.name());
    }

    public static OBCreditDebitCode2 toOBCreditDebitCode2(FRCreditDebitIndicator indicator) {
        return indicator == null ? null : OBCreditDebitCode2.valueOf(indicator.name());
    }

    public static OBCreditDebitCode0 toOBStatementFee2CreditDebitIndicatorEnum(FRCreditDebitIndicator indicator) {
        return indicator == null ? null : OBCreditDebitCode0.valueOf(indicator.name());
    }

    public static OBCreditDebitCode0 toOBCreditDebitCode0(FRCreditDebitIndicator indicator) {
        return indicator == null ? null : OBCreditDebitCode0.valueOf(indicator.name());
    }

    // OB to FR
    public static FRCreditDebitIndicator toFRCreditDebitIndicator(OBCreditDebitCode1 indicator) {
        return indicator == null ? null : FRCreditDebitIndicator.valueOf(indicator.name());
    }

    public static FRCreditDebitIndicator toFRCreditDebitIndicator(OBCreditDebitCode2 indicator) {
        return indicator == null ? null : FRCreditDebitIndicator.valueOf(indicator.name());
    }

    public static FRCreditDebitIndicator toFRCreditDebitIndicator(OBCreditDebitCode0 indicator) {
        return indicator == null ? null : FRCreditDebitIndicator.valueOf(indicator.name());
    }
}
