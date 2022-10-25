/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import com.forgerock.securebanking.openbanking.uk.common.api.meta.share.IntentType;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.*;

import java.math.BigDecimal;
import java.util.List;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;

/**
 * Test data factory for the {@link OBWriteFileConsent3Data}.
 */
public class OBWriteFileConsentTestDataFactory {

    public static OBWriteFileConsent3 aValidOBWriteFileConsent3() {
        return new OBWriteFileConsent3().data(aValidOBWriteFileConsent3Data());
    }

    public static OBWriteFileConsent3 aValidOBWriteFileConsent3MandatoryFields() {
        return new OBWriteFileConsent3().data(aValidOBWriteFileConsent3DataMandatoryFields());
    }

    public static OBWriteFileConsent3Data aValidOBWriteFileConsent3Data() {
        return new OBWriteFileConsent3Data()
                .initiation(aValidOBWriteFile2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1());
    }

    public static OBWriteFileConsent3Data aValidOBWriteFileConsent3DataMandatoryFields() {
        return new OBWriteFileConsent3Data()
                .initiation(aValidOBWriteFile2DataInitiationMandatoryFields());
    }

    public static OBWriteFile2DataInitiation aValidOBWriteFile2DataInitiation() {
        return new OBWriteFile2DataInitiation()
                .fileType("UK.OBIE.pain.001.001.08")
                .fileHash("m5ah/h1UjLvJYMxqAoZmj9dKdjZnsGNm+yMkJp/KuqQ")
                .fileReference("GB2OK238")
                .numberOfTransactions("1")
                .controlSum(BigDecimal.ONE)
                .requestedExecutionDateTime(DateTime.now())
                .localInstrument("UK.OBIE.CHAPS")
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteFile2DataInitiation aValidOBWriteFile2DataInitiationMandatoryFields() {
        return new OBWriteFile2DataInitiation()
                .fileType("UK.OBIE.pain.001.001.08")
                .fileHash("m5ah/h1UjLvJYMxqAoZmj9dKdjZnsGNm+yMkJp/KuqQ");
    }

    // response
    public static final String CHARGE_TYPE = "UK.OBIE.CHAPSOut";
    public static final String CHARGE_AMOUNT = "1.5";
    public static final String CHARGE_CURRENCY = "GBP";

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4() {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3();
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(IntentType.PAYMENT_FILE_CONSENT.generateIntentId())
                        .authorisation(consent3.getData().getAuthorisation())
                        .initiation(consent3.getData().getInitiation())
                        .scASupportData(consent3.getData().getScASupportData())
                        .charges(List.of(aValidOBWriteDomesticConsentResponse5DataCharges()))
                        .debtor(new OBCashAccountDebtor4()
                                .schemeName("UK.OBIE.SortCodeAccountNumber")
                                .identification("90611424625566")
                                .name("Mr Johnny Marr")
                                .secondaryIdentification("55")
                        )
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4MandatoryFields() {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3();
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(IntentType.PAYMENT_FILE_CONSENT.generateIntentId())
                        .initiation(consent3.getData().getInitiation())
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4(String consentId) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3();
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(consentId)
                        .creationDateTime(DateTime.now())
                        .cutOffDateTime(DateTime.now())
                        .status(OBWriteFileConsentResponse4Data.StatusEnum.AWAITINGUPLOAD)
                        .statusUpdateDateTime(DateTime.now())
                        .authorisation(consent3.getData().getAuthorisation())
                        .initiation(consent3.getData().getInitiation())
                        .scASupportData(consent3.getData().getScASupportData())
                        .charges(List.of(aValidOBWriteDomesticConsentResponse5DataCharges()))
                        .debtor(new OBCashAccountDebtor4()
                                .schemeName("UK.OBIE.SortCodeAccountNumber")
                                .identification("90611424625566")
                                .name("Mr Johnny Marr")
                                .secondaryIdentification("55")
                        )
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4MandatoryFields(String consentId) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3();
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(consentId)
                        .creationDateTime(DateTime.now())
                        .status(OBWriteFileConsentResponse4Data.StatusEnum.AWAITINGUPLOAD)
                        .statusUpdateDateTime(DateTime.now())
                        .initiation(consent3.getData().getInitiation())
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4(String consentId, OBWriteFileConsentResponse4Data.StatusEnum status) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3();
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(consentId)
                        .creationDateTime(DateTime.now())
                        .cutOffDateTime(DateTime.now())
                        .status(status)
                        .statusUpdateDateTime(DateTime.now())
                        .authorisation(consent3.getData().getAuthorisation())
                        .initiation(consent3.getData().getInitiation())
                        .scASupportData(consent3.getData().getScASupportData())
                        .charges(List.of(aValidOBWriteDomesticConsentResponse5DataCharges()))
                        .debtor(new OBCashAccountDebtor4()
                                .schemeName("UK.OBIE.SortCodeAccountNumber")
                                .identification("90611424625566")
                                .name("Mr Johnny Marr")
                                .secondaryIdentification("55")
                        )
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4MandatoryFields(String consentId, OBWriteFileConsentResponse4Data.StatusEnum status) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3();
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(consentId)
                        .creationDateTime(DateTime.now())
                        .status(status)
                        .statusUpdateDateTime(DateTime.now())
                        .initiation(consent3.getData().getInitiation())
                );
    }

    public static OBWriteDomesticConsentResponse5DataCharges aValidOBWriteDomesticConsentResponse5DataCharges() {
        return new OBWriteDomesticConsentResponse5DataCharges()
                .chargeBearer(OBChargeBearerType1Code.BORNEBYDEBTOR)
                .type(CHARGE_TYPE)
                .amount(
                        new OBActiveOrHistoricCurrencyAndAmount()
                                .amount(CHARGE_AMOUNT)
                                .currency(CHARGE_CURRENCY)
                );
    }

    public static OBWriteDomesticConsentResponse5DataCharges aValidOBWriteDomesticConsentResponse5DataChargesMandatoryFields() {
        return new OBWriteDomesticConsentResponse5DataCharges()
                .chargeBearer(OBChargeBearerType1Code.BORNEBYDEBTOR)
                .type(CHARGE_TYPE)
                .amount(
                        new OBActiveOrHistoricCurrencyAndAmount()
                                .amount(CHARGE_AMOUNT)
                                .currency(CHARGE_CURRENCY)
                );
    }

}
