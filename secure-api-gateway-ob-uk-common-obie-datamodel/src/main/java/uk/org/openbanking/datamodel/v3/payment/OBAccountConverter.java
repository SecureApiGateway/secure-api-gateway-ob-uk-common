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
package uk.org.openbanking.datamodel.v3.payment;

import uk.org.openbanking.datamodel.v3.common.OBCashAccountCreditor3;

public class OBAccountConverter {

    public static OBWriteDomesticStandingOrder3DataInitiationDebtorAccount toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(OBCashAccountDebtor4 debtorAccount) {
        return toAccount(new OBWriteDomesticStandingOrder3DataInitiationDebtorAccount(), debtorAccount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationCreditorAccount toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        return toAccount(new OBWriteDomesticStandingOrder3DataInitiationCreditorAccount(), creditorAccount);
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAccount toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        return toAccount(new OBWriteInternationalStandingOrder4DataInitiationCreditorAccount(), creditorAccount);
    }

    public static OBCashAccountDebtor4 toOBCashAccountDebtor4(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
        return toAccount(new OBCashAccountDebtor4(), debtorAccount);
    }

    public static OBCashAccountCreditor3 toOBCashAccountCreditor3(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccountCreditor3(), creditorAccount);
    }

    public static OBCashAccountCreditor3 toOBCashAccountCreditor3(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccountCreditor3(), creditorAccount);
    }

    private static <T, U> T toAccount(T newAccount, U originalAccount) {
        if (originalAccount == null) {
            return null;
        }
        ConverterHelper.copyField(newAccount, originalAccount, "schemeName");
        ConverterHelper.copyField(newAccount, originalAccount, "identification");
        ConverterHelper.copyField(newAccount, originalAccount, "name");
        ConverterHelper.copyField(newAccount, originalAccount, "secondaryIdentification");
        return newAccount;
    }

}
