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
package uk.org.openbanking.testsupport.payment;

import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformation2;

import java.util.Collections;

/**
 * Test data factory for the various OB classes representing payment remittance information.
 */
public class OBRemittanceInformationTestDataFactoryV4 {

    public static OBRemittanceInformation2 aValidOBRemittanceInformation2() {
        return (new OBRemittanceInformation2())
                .unstructured(Collections.singletonList("Internal ops code 5120103"));
    }

}
