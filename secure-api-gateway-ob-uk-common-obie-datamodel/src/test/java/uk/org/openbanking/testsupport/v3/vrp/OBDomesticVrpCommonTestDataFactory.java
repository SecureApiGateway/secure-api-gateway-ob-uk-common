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
package uk.org.openbanking.testsupport.v3.vrp;

import uk.org.openbanking.datamodel.v3.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v3.common.OBAddressTypeCode;
import uk.org.openbanking.datamodel.v3.common.OBBranchAndFinancialInstitutionIdentification6;
import uk.org.openbanking.datamodel.v3.common.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.v3.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.v3.common.OBPostalAddress6;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v3.vrp.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInitiation;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPResponseDataChargesInner;
import uk.org.openbanking.datamodel.v3.vrp.OBExternalPaymentChargeType1Code;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPRemittanceInformation;


public class OBDomesticVrpCommonTestDataFactory {

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
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBDomesticVRPInitiationRemittanceInformation());
    }

    public static OBDomesticVRPInitiation aValidOBDomesticVRPInitiationMandatoryFields() {
        return (new OBDomesticVRPInitiation());
    }

    public static OBDomesticVRPInitiationRemittanceInformation aValidOBDomesticVRPInitiationRemittanceInformation() {
        return (new OBDomesticVRPInitiationRemittanceInformation())
                .unstructured(ConstantsVrpTestData.UNSTRUCTURED)
                .reference(ConstantsVrpTestData.REFERENCE);
    }

    public static OBVRPRemittanceInformation aValidOBVRPRemittanceInformation() {
        return (new OBVRPRemittanceInformation())
                .unstructured(ConstantsVrpTestData.UNSTRUCTURED)
                .reference(ConstantsVrpTestData.REFERENCE);
    }

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

    public static OBBranchAndFinancialInstitutionIdentification6 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification6())
                .schemeName(ConstantsVrpTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVrpTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVrpTestData.ACCOUNT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBPostalAddress6 aValidOBPostalAddress6() {
        return (new OBPostalAddress6())
                .addressType(OBAddressTypeCode.RESIDENTIAL)
                .buildingNumber(ConstantsVrpTestData.BUILDING_NUMBER)
                .streetName(ConstantsVrpTestData.STREET_NAME)
                .postCode(ConstantsVrpTestData.POSTCODE)
                .townName(ConstantsVrpTestData.TOWN_NAME)
                .country(ConstantsVrpTestData.COUNTRY);
    }

    public static OBDomesticVRPResponseDataChargesInner aValidOBDomesticVRPResponseDataCharges() {
        return (new OBDomesticVRPResponseDataChargesInner())
                .amount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .chargeBearer(OBChargeBearerType1Code.BORNEBYCREDITOR)
                .type(OBExternalPaymentChargeType1Code.BALANCETRANSFEROUT);
    }

}
