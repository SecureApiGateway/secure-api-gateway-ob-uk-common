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

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBDomesticVRPInitiation;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVrpCommonTestDataFactory.aValidOBDomesticVRPInitiationMandatoryFields;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.common.OBVRPAuthenticationMethods;
import uk.org.openbanking.datamodel.common.OBVRPConsentType;
import uk.org.openbanking.datamodel.vrp.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPConsentRequest;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPConsentRequestData;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPControlParameters;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPControlParametersPeriodicLimitsInner;
import uk.org.openbanking.datamodel.vrp.OBPeriodAlignment;
import uk.org.openbanking.datamodel.vrp.OBPeriodType;
import uk.org.openbanking.datamodel.vrp.OBVRPInteractionTypes;

public class OBDomesticVrpConsentRequestTestDataFactory {

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequest() {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestData())
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequestMandatoryFields() {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestDataMandatoryFields())
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequest(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestData(psuAuthenticationMethods, vrpTypes))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequestMandatoryFields(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestDataMandatoryFields(psuAuthenticationMethods, vrpTypes))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestData() {
        return (new OBDomesticVRPConsentRequestData())
                .readRefundAccount(OBReadRefundAccount.YES)
                .controlParameters(aValidOBDomesticVRPControlParameters())
                .initiation(aValidOBDomesticVRPInitiation());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestDataMandatoryFields() {
        return (new OBDomesticVRPConsentRequestData())
                .controlParameters(aValidOBDomesticVRPControlParametersMandatoryFields())
                .initiation(aValidOBDomesticVRPInitiationMandatoryFields());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestData(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequestData())
                .readRefundAccount(OBReadRefundAccount.YES)
                .controlParameters(aValidOBDomesticVRPControlParameters(psuAuthenticationMethods, vrpTypes))
                .initiation(aValidOBDomesticVRPInitiation());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestDataMandatoryFields(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequestData())
                .controlParameters(aValidOBDomesticVRPControlParametersMandatoryFields(psuAuthenticationMethods, vrpTypes))
                .initiation(aValidOBDomesticVRPInitiationMandatoryFields());
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParameters() {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(Arrays.asList(OBVRPAuthenticationMethods.SCA_NOT_REQUIRED.getValue()))
                .psUInteractionTypes(Arrays.asList(OBVRPInteractionTypes.INSESSION))
                .vrPType(Arrays.asList(OBVRPConsentType.SWEEPING.getValue()))
                .validFromDateTime(now)
                .validToDateTime(now.plusDays(10))
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParametersMandatoryFields() {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(Arrays.asList(OBVRPAuthenticationMethods.SCA_NOT_REQUIRED.getValue()))
                .vrPType(Arrays.asList(OBVRPConsentType.SWEEPING.getValue()))
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits());
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParameters(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(psuAuthenticationMethods)
                .vrPType(vrpTypes)
                .validFromDateTime(now)
                .validToDateTime(now.plusDays(10))
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParametersMandatoryFields(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(psuAuthenticationMethods)
                .vrPType(vrpTypes)
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits());
    }


    public static OBCashAccountDebtorWithName aValidOBCashAccountDebtorWithName() {
        return (new OBCashAccountDebtorWithName())
                .schemeName(ConstantsVrpTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVrpTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVrpTestData.ACCOUNT_NAME)
                .secondaryIdentification(ConstantsVrpTestData.ACCOUNT_SECONDARY_IDENTIFICATION);
    }


    public static List<OBDomesticVRPControlParametersPeriodicLimitsInner> aValidOBDomesticVRPControlParametersPeriodicLimits() {
        return Arrays.asList((new OBDomesticVRPControlParametersPeriodicLimitsInner())
                .amount(ConstantsVrpTestData.AMOUNT)
                .currency(ConstantsVrpTestData.GBP)
                .periodAlignment(OBPeriodAlignment.CALENDAR)
                .periodType(OBPeriodType.MONTH));
    }
}
