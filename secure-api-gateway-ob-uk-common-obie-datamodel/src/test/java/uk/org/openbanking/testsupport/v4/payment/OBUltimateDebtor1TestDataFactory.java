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
package uk.org.openbanking.testsupport.v4.payment;

import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;
import uk.org.openbanking.datamodel.v4.common.OBUltimateDebtor1;

public class OBUltimateDebtor1TestDataFactory {

    public static OBUltimateDebtor1 aValidOBUltimateDebtor1() {
        return (new OBUltimateDebtor1())
                .name("Ultimate Debtor")
                .identification("08080021325698")
                .LEI("123400ABCDEF12345678")
                .schemeName("UK.OBIE.BICFI")
                .postalAddress(new OBPostalAddress7()
                        .addressType(OBAddressType2Code.ADDR)
                        .department("Finance")
                        .subDepartment("Payroll")
                        .streetName("Bank Street")
                        .buildingNumber("22")
                        .buildingName("Tower Bridges")
                        .floor("2")
                        .unitNumber("UNIT591")
                        .room("24")
                        .postBox("PO Box 123456")
                        .townLocationName("wxyz")
                        .districtName("blah")
                        .careOf("blah")
                        .postCode("4444")
                        .townName("London")
                        .countrySubDivision("4")
                        .country("UK")
                );
    }
}
