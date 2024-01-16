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

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.share.IntentType;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.common.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;

/**
 * Test data factory for the {@link OBWriteFileConsent3Data}.
 */
public class OBWriteFileConsentTestDataFactory {

    public static OBWriteFileConsent3 aValidOBWriteFileConsent3(String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        return new OBWriteFileConsent3().data(aValidOBWriteFileConsent3Data(
                        fileType,
                        fileHash,
                        numberOfTransactions,
                        controlSum.setScale(4, RoundingMode.HALF_EVEN)
                )
        );
    }

    public static OBWriteFileConsent3 aValidOBWriteFileConsent3MandatoryFields(String fileType, String fileHash) {
        return new OBWriteFileConsent3().data(aValidOBWriteFileConsent3DataMandatoryFields(fileType, fileHash));
    }

    public static OBWriteFileConsent3Data aValidOBWriteFileConsent3Data(String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        return new OBWriteFileConsent3Data()
                .initiation(aValidOBWriteFile2DataInitiation(
                                fileType,
                                fileHash,
                                numberOfTransactions,
                                controlSum.setScale(4, RoundingMode.HALF_EVEN),
                                DateTime.now()
                        )
                )
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1());
    }

    public static OBWriteFileConsent3Data aValidOBWriteFileConsent3DataMandatoryFields(String fileType, String fileHash) {
        return new OBWriteFileConsent3Data()
                .initiation(aValidOBWriteFile2DataInitiationMandatoryFields(fileType, fileHash));
    }

    public static OBWriteFile2DataInitiation aValidOBWriteFile2DataInitiation(
            String fileType,
            String fileHash,
            String numberOfTransactions,
            BigDecimal controlSum,
            DateTime requestedExecutionDateTime
    ) {
        return new OBWriteFile2DataInitiation()
                .fileType(fileType)
                .fileHash(fileHash)
                .fileReference("GB2OK238")
                .numberOfTransactions(numberOfTransactions)
                .controlSum(controlSum.setScale(4, RoundingMode.HALF_EVEN))
                .requestedExecutionDateTime(requestedExecutionDateTime)
                .localInstrument("UK.OBIE.CHAPS")
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteFile2DataInitiation aValidOBWriteFile2DataInitiationMandatoryFields(String fileType, String fileHash) {
        return new OBWriteFile2DataInitiation()
                .fileType(fileType)
                .fileHash(fileHash);
    }

    // response
    public static final String CHARGE_TYPE = "UK.OBIE.CHAPSOut";
    public static final String CHARGE_AMOUNT = "1.5";
    public static final String CHARGE_CURRENCY = "GBP";

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4(String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3(
                fileType,
                fileHash,
                numberOfTransactions,
                controlSum.setScale(4, RoundingMode.HALF_EVEN)
        );
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

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4MandatoryFields(String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3(
                fileType,
                fileHash,
                numberOfTransactions,
                controlSum.setScale(4, RoundingMode.HALF_EVEN)
        );
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(IntentType.PAYMENT_FILE_CONSENT.generateIntentId())
                        .initiation(consent3.getData().getInitiation())
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4(String consentId, String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3(
                fileType,
                fileHash,
                numberOfTransactions,
                controlSum.setScale(4, RoundingMode.HALF_EVEN)
        );
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

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4MandatoryFields(String consentId, String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3(
                fileType,
                fileHash,
                numberOfTransactions,
                controlSum.setScale(4, RoundingMode.HALF_EVEN)
        );
        return new OBWriteFileConsentResponse4()
                .data(new OBWriteFileConsentResponse4Data()
                        .consentId(consentId)
                        .creationDateTime(DateTime.now())
                        .status(OBWriteFileConsentResponse4Data.StatusEnum.AWAITINGUPLOAD)
                        .statusUpdateDateTime(DateTime.now())
                        .initiation(consent3.getData().getInitiation())
                );
    }

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4(String consentId, OBWriteFileConsentResponse4Data.StatusEnum status, String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3(
                fileType,
                fileHash,
                numberOfTransactions,
                controlSum.setScale(4, RoundingMode.HALF_EVEN)
        );
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

    public static OBWriteFileConsentResponse4 aValidOBWriteFileConsentResponse4MandatoryFields(String consentId, OBWriteFileConsentResponse4Data.StatusEnum status, String fileType, String fileHash, String numberOfTransactions, BigDecimal controlSum) {
        OBWriteFileConsent3 consent3 = aValidOBWriteFileConsent3(
                fileType,
                fileHash,
                numberOfTransactions,
                controlSum.setScale(4, RoundingMode.HALF_EVEN)
        );
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
