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
package uk.org.openbanking.testsupport.v4.payment;

import uk.org.openbanking.datamodel.v4.common.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.v4.payment.OBCashAccountDebtor4;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiationCreditorAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomestic2DataInitiationDebtorAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import uk.org.openbanking.datamodel.v4.payment.OBWriteInternationalStandingOrder4DataInitiationCreditorAccount;

/**
 * Test data factory for various OB account types.
 */
public class OBAccountTestDataFactory {

    public static OBWriteDomestic2DataInitiationCreditorAccount aValidOBWriteDomestic2DataInitiationCreditorAccount() {
        return (new OBWriteDomestic2DataInitiationCreditorAccount())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("08080021325698")
                .name("Mr Tim Burgess")
                .secondaryIdentification("11");
    }

    public static OBWriteDomestic2DataInitiationCreditorAccount aValidOBWriteDomestic2DataInitiationCreditorAccountMandatoryFields() {
        return (new OBWriteDomestic2DataInitiationCreditorAccount())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("08080021325698")
                .name("Mr Tim Burgess");
    }

    public static OBWriteDomestic2DataInitiationDebtorAccount aValidOBWriteDomestic2DataInitiationDebtorAccount() {
        return (new OBWriteDomestic2DataInitiationDebtorAccount())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("11280001234567")
                .name("Mr Shaun Ryder")
                .secondaryIdentification("22");
    }

    public static OBWriteDomesticStandingOrder3DataInitiationCreditorAccount aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("18080021325694")
                .name("Mr Ian Brown")
                .secondaryIdentification("33");
    }

    public static OBWriteDomesticStandingOrder3DataInitiationDebtorAccount aValidOBWriteDomesticStandingOrder3DataInitiationDebtorAccount() {
        return (new OBWriteDomesticStandingOrder3DataInitiationDebtorAccount())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("90611424625555")
                .name("Mr Steven Morrissey")
                .secondaryIdentification("44");
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAccount aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount() {
        return (new OBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("90611424625555")
                .name("Mr Steven Morrissey")
                .secondaryIdentification("44");
    }

    public static OBCashAccountCreditor3 aValidOBCashAccountCreditor3() {
        return (new OBCashAccountCreditor3())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("18080021325677")
                .name("Mr Stephen Holt")
                .secondaryIdentification("66");
    }

    public static OBCashAccountDebtor4 aValidOBCashAccountDebtor4() {
        return (new OBCashAccountDebtor4())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("18080021325688")
                .name("Mr Bernard Sumner")
                .secondaryIdentification("77");
    }
}
