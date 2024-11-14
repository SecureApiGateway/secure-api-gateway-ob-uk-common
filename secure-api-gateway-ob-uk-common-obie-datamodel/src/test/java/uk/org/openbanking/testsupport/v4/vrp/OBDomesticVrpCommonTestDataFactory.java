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
package uk.org.openbanking.testsupport.v4.vrp;

import static uk.org.openbanking.testsupport.v4.payment.OBRisk1TestDataFactory.aValidOBPostalAddress7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.v4.common.ExternalCreditorReferenceType1Code;
import uk.org.openbanking.datamodel.v4.common.ExternalDocumentType1Code;
import uk.org.openbanking.datamodel.v4.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.v4.common.OBAddressType2Code;
import uk.org.openbanking.datamodel.v4.common.OBBranchAndFinancialInstitutionIdentification60;
import uk.org.openbanking.datamodel.v4.common.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.v4.common.OBInternalChargeBearerType1Code;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;
import uk.org.openbanking.datamodel.v4.vrp.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPInitiation;
import uk.org.openbanking.datamodel.v4.vrp.OBDomesticVRPResponseDataChargesInner;
import uk.org.openbanking.datamodel.v4.vrp.OBInternalPaymentChargeType1Code;
import uk.org.openbanking.datamodel.v4.vrp.OBReferredDocumentInformation;
import uk.org.openbanking.datamodel.v4.vrp.OBRemittanceInformation2;
import uk.org.openbanking.datamodel.v4.vrp.OBRemittanceInformationStructured;
import uk.org.openbanking.datamodel.v4.vrp.OBRemittanceInformationStructuredCreditorReferenceInformation;
import uk.org.openbanking.testsupport.v3.vrp.ConstantsVrpTestData;


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
                .creditorPostalAddress(aValidOBPostalAddress7())
                .remittanceInformation(aValidOBRemittanceInformation2());
    }

    public static OBDomesticVRPInitiation aValidOBDomesticVRPInitiationMandatoryFields() {
        return (new OBDomesticVRPInitiation());
    }


    public static OBRemittanceInformation2 aValidOBRemittanceInformation2() {
        return (new OBRemittanceInformation2())
                .unstructured(Collections.singletonList("Internal ops code 5120103"))
                .structured(Collections.singletonList(aValidOBRemittanceInformationStructured()));
    }

    public static OBRemittanceInformationStructured aValidOBRemittanceInformationStructured() {
        return (new OBRemittanceInformationStructured())
                .referredDocumentInformation(Collections.singletonList(aValidOBReferredDocumentInformation()))
                .referredDocumentAmount(1)
                .creditorReferenceInformation(aValidOBRemittanceInformationStructuredCreditorReferenceInformation())
                .invoicee("INVE5161856")
                .invoicer("INVR51856")
                .taxRemittance("Tax Remittance related information")
                .additionalRemittanceInformation(Collections.singletonList("Free text for additional information"));
    }

    public static OBReferredDocumentInformation aValidOBReferredDocumentInformation() {
        return (new OBReferredDocumentInformation())
                .code(ExternalDocumentType1Code.CINV)
                .issuer("Issuer01")
                .number("Number_01")
                .relatedDate(new DateTime(DateTime.now()))
                .lineDetails(new ArrayList<>((Arrays.asList("Line1", "Line2"))));
    }

    private static OBRemittanceInformationStructuredCreditorReferenceInformation aValidOBRemittanceInformationStructuredCreditorReferenceInformation() {
        return (new OBRemittanceInformationStructuredCreditorReferenceInformation())
                .code(ExternalCreditorReferenceType1Code.DISP)
                .issuer("Issuer01")
                .reference("REF_26518");
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

    public static OBBranchAndFinancialInstitutionIdentification60 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification60())
                .schemeName(ConstantsVrpTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVrpTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVrpTestData.ACCOUNT_NAME)
                .postalAddress(aValidOBPostalAddress7());
    }

    public static OBPostalAddress7 aValidOBPostalAddress6() {
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
