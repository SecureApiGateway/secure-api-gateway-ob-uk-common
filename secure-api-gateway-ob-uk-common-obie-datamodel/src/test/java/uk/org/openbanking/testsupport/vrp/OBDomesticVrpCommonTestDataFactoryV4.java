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
package uk.org.openbanking.testsupport.vrp;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.*;
import uk.org.openbanking.datamodel.v4.vrp.*;

import java.util.Collections;


public class OBDomesticVrpCommonTestDataFactoryV4 {

    public static OBCashAccountDebtorWithName aValidOBCashAccountDebtorWithName() {
        return (new OBCashAccountDebtorWithName())
                .schemeName(ConstantsVrpTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVrpTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVrpTestData.ACCOUNT_NAME)
                .secondaryIdentification(ConstantsVrpTestData.ACCOUNT_SECONDARY_IDENTIFICATION);
    }

    public static OBDomesticVRPInitiation aValidOBDomesticVRPInitiation() {
        return (new OBDomesticVRPInitiation())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .creditorPostalAddress(aValidOBPostalAddress7())
                .remittanceInformation(aValidOBDomesticVRPInitiationRemittanceInformation());
    }

    public static OBDomesticVRPInitiation aValidOBDomesticVRPInitiationMandatoryFields() {
        return (new OBDomesticVRPInitiation());
    }

    public static OBRemittanceInformation2 aValidOBDomesticVRPInitiationRemittanceInformation() {
        return (new OBRemittanceInformation2())
                .unstructured(Collections.singletonList(ConstantsVrpTestData.UNSTRUCTURED));
    }

//    public static OBVRPRemittanceInformation aValidOBVRPRemittanceInformation() {
//        return (new OBVRPRemittanceInformation())
//                .unstructured(ConstantsVrpTestData.UNSTRUCTURED)
//                .reference(ConstantsVrpTestData.REFERENCE);
//    }

    public static OBSupplementaryData1 aValidOBSupplementaryData1() {
        OBSupplementaryData1 supplementaryData1 = new OBSupplementaryData1();
        supplementaryData1.setData(ConstantsVrpTestData.SUPPLEMENTARY_DATA);
        return supplementaryData1;
    }

    public static OBActiveOrHistoricCurrencyAndAmount aValidOBActiveOrHistoricCurrencyAndAmount() {
        return (new OBActiveOrHistoricCurrencyAndAmount())
                .amount(ConstantsVrpTestData.AMOUNT)
                .currency(ConstantsVrpTestData.GBP);
    }

    public static OBCashAccountCreditor3 aValidOBCashAccountCreditor3() {
        return (new OBCashAccountCreditor3())
                .identification(ConstantsVrpTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVrpTestData.ACCOUNT_NAME)
                .schemeName(ConstantsVrpTestData.ACCOUNT_SCHEME_NAME)
                .secondaryIdentification(ConstantsVrpTestData.ACCOUNT_SECONDARY_IDENTIFICATION);
    }

    public static OBPostalAddress7 aValidOBPostalAddress7() {
        return (new OBPostalAddress7())
                .addressType(OBAddressType2Code.HOME)
                .buildingNumber(ConstantsVrpTestData.BUILDING_NUMBER)
                .streetName(ConstantsVrpTestData.STREET_NAME)
                .postCode(ConstantsVrpTestData.POSTCODE)
                .townName(ConstantsVrpTestData.TOWN_NAME)
                .country(ConstantsVrpTestData.COUNTRY);
    }

    public static OBDomesticVRPResponseDataChargesInner aValidOBDomesticVRPResponseDataCharges() {
        return (new OBDomesticVRPResponseDataChargesInner())
                .amount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .chargeBearer(OBInternalChargeBearerType1Code.BORNEBYCREDITOR)
                .type(OBInternalPaymentChargeType1Code.BALANCETRANSFEROUT);
    }

}
