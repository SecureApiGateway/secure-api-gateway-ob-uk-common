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

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;
import uk.org.openbanking.datamodel.v4.payment.OBExternalMandateClassification1Code;
import uk.org.openbanking.datamodel.v4.payment.OBFrequency6;
import uk.org.openbanking.datamodel.v4.payment.OBFrequency6Code;
import uk.org.openbanking.datamodel.v4.payment.OBMandateRelatedInformation1;

public class OBMandateRelatedInformationTestDataFactory {

    public static OBMandateRelatedInformation1 aValidOBMandateRelatedInformation1() {
        return (new OBMandateRelatedInformation1())
                .mandateIdentification("identification")
                .classification(OBExternalMandateClassification1Code.FIXE)
                .categoryPurposeCode(ExternalCategoryPurpose1Code.CCRD)
                .firstPaymentDateTime(new DateTime(DateTime.now()))
                .recurringPaymentDateTime(new DateTime(DateTime.now()))
                .finalPaymentDateTime(new DateTime(DateTime.now()))
                .frequency(new OBFrequency6()
                        .type(OBFrequency6Code.WEEK)
                        .countPerPeriod(2)
                        .pointInTime("blah")
                )
                .reason("random");
    }
}
