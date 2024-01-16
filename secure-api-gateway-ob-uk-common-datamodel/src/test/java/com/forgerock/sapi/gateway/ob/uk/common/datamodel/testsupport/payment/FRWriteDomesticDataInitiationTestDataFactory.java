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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticDataInitiation;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDomesticDataInitiation.FRWriteDomesticDataInitiationBuilder;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAccountIdentifierTestDataFactory;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRAmountTestDataFactory;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.FRPostalAddressTestDataFactory;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.payment.FRRemittanceInformationTestDataFactory.aValidFRRemittanceInformation;

/**
 * Test data factory for {@link FRWriteDomesticDataInitiation}.
 */
public class FRWriteDomesticDataInitiationTestDataFactory {

    public static FRWriteDomesticDataInitiation aValidFRWriteDomesticDataInitiation() {
        return aValidFRWriteDomesticDataInitiationBuilder().build();
    }

    public static FRWriteDomesticDataInitiationBuilder aValidFRWriteDomesticDataInitiationBuilder() {
        return FRWriteDomesticDataInitiation.builder()
                .instructionIdentification("12345678")
                .endToEndIdentification("12345")
                .localInstrument("UK.OBIE.CHAPS")
                .instructedAmount(FRAmountTestDataFactory.aValidFRAmount())
                .debtorAccount(FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier())
                .creditorAccount(FRAccountIdentifierTestDataFactory.aValidFRAccountIdentifier2())
                .creditorPostalAddress(FRPostalAddressTestDataFactory.aValidFRPostalAddress())
                .remittanceInformation(aValidFRRemittanceInformation());
    }
}
