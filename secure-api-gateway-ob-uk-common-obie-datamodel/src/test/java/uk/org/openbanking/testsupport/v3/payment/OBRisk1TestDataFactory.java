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
package uk.org.openbanking.testsupport.v3.payment;

import java.util.Collections;

import uk.org.openbanking.datamodel.v3.common.OBExternalPaymentContext1Code;
import uk.org.openbanking.datamodel.v3.common.OBRisk1;
import uk.org.openbanking.datamodel.v3.common.OBRisk1DeliveryAddress;
import uk.org.openbanking.datamodel.v3.payment.OBExternalExtendedAccountType1Code;

/**
 * Test data factory for {@link OBRisk1}.
 */
public class OBRisk1TestDataFactory {

    public static OBRisk1 aValidOBRisk1() {
        return new OBRisk1()
                .merchantCustomerIdentification("merchantId123")
                .merchantCategoryCode("mct1")
                .paymentContextCode(OBExternalPaymentContext1Code.OTHER)
                .deliveryAddress(aValidOBRisk1DeliveryAddress())
                .paymentPurposeCode("pain")
                .contractPresentInidicator(false)
                .beneficiaryPrepopulatedIndicator(false)
                .beneficiaryAccountType(OBExternalExtendedAccountType1Code.PERSONAL);
    }

    public static OBRisk1 aValidOBRisk1MandatoryFields() {
        return new OBRisk1();
    }

    public static OBRisk1DeliveryAddress aValidOBRisk1DeliveryAddress() {
        return new OBRisk1DeliveryAddress()
                .addressLine(Collections.singletonList("60 Queens Sq"))
                .buildingNumber("60")
                .streetName("Queen Square")
                .townName("Bristol")
                .country("GB")
                .countrySubDivision("en")
                .postCode("BS1 1AA");
    }
}
