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
package uk.org.openbanking.testsupport.v4.payment;

import java.util.Collections;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v4.payment.OBRegulatoryAuthority2;
import uk.org.openbanking.datamodel.v4.payment.OBRegulatoryReporting1;
import uk.org.openbanking.datamodel.v4.payment.OBRegulatoryReporting1DebitCreditReportingIndicator;
import uk.org.openbanking.datamodel.v4.payment.OBStructuredRegulatoryReporting3;

public class OBRegulatoryReporting1TestDataFactory {

    private static final String GBP = "GBP";
    private static final String AMOUNT = "10.01";

    public static OBRegulatoryReporting1 aValidOBRegulatoryReporting1() {
        return (new OBRegulatoryReporting1())
                .debitCreditReportingIndicator(OBRegulatoryReporting1DebitCreditReportingIndicator.BOTH)
                .authority(new OBRegulatoryAuthority2()
                        .name("wxyz")
                        .countryCode("1234")
                )
                .details(Collections.singletonList(new OBStructuredRegulatoryReporting3()
                        .type("blah")
                        .date(new DateTime(DateTime.now()))
                        .country("UK")
                        .amount(new OBActiveOrHistoricCurrencyAndAmount()
                                .currency(GBP)
                                .amount(AMOUNT))
                        .information(Collections.singletonList("information")))
                );
    }
}
