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

import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;
import uk.org.openbanking.datamodel.v4.common.OBUltimateCreditor1;

public class OBUltimateCreditor1TestDataFactory {

    public static OBUltimateCreditor1 aValidOBUltimateCreditor1() {
        return (new OBUltimateCreditor1())
                .name("abcd")
                .identification("08080021325698")
                .LEI("blah")
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .postalAddress(new OBPostalAddress7()
                        .addressType(OBAddressType2Code.ADDR)
                        .department("abcd")
                        .subDepartment("1")
                        .streetName("blah")
                        .buildingNumber("22")
                        .buildingName("name2")
                        .floor("2")
                        .unitNumber("23")
                        .room("24")
                        .postBox("22")
                        .townLocationName("wxyz")
                        .districtName("blah")
                        .careOf("blah")
                        .postCode("4444")
                        .townName("blah")
                        .countrySubDivision("4")
                        .country("UK")
                );
    }
}
