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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRFinancialAccount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAccountIdentifierConverter;
import uk.org.openbanking.datamodel.v4.account.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toFRPostalAddress;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common.FRPostalAddressConverter.toOBPostalAddress7;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRAccountSubTypeConverter.toFRAccountSubTypeCodeV3;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRAccountSubTypeConverter.toOBExternalAccountSubType1CodeV4;

public class FRFinancialAccountConverter {

    // FR to OB
    public static OBAccount6 toOBAccount6(FRFinancialAccount account) {
        return account == null ? null : new OBAccount6()
                .accountId(account.getAccountId())
                .status(toOBAccountStatus1Code(account.getStatus()))
                .statusUpdateDateTime(account.getStatusUpdateDateTime())
                .currency(account.getCurrency())
                .accountCategory(toOBInternalAccountType1Code(account.getAccountType()))
                .accountTypeCode(toOBExternalAccountSubType1CodeV4(String.valueOf(account.getAccountSubType())))
                .description(account.getDescription())
                .nickname(account.getNickname())
                .openingDate(account.getOpeningDate())
                .maturityDate(account.getMaturityDate())
                .account(toOBAccount6AccountList(account.getAccounts()))
                .switchStatus(account.getSwitchStatus())
                .statementFrequencyAndFormat(toStatementFrequencyAndFormatInnerList(account.getStatementFrequencyAndFormat()))
                .servicer(FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification50(account.getServicer()));
    }

    public static OBInternalAccountStatus1Code toOBAccountStatus1Code(FRFinancialAccount.FRAccountStatusCode status) {
        return status == null ? null : OBInternalAccountStatus1Code.fromValue(status.name());
    }

    public static OBInternalAccountType1Code toOBInternalAccountType1Code(FRFinancialAccount.FRAccountTypeCode accountType) {
        return accountType == null ? null : OBInternalAccountType1Code.fromValue(accountType.name());
    }

    public static OBExternalAccountSubType1Code toOBExternalAccountSubType1Code(FRFinancialAccount.FRAccountSubTypeCode accountSubType) {
        return accountSubType == null ? null : OBExternalAccountSubType1Code.fromValue(accountSubType.name());
    }

    public static OBFrequency2 toOBFrequency2(FRFinancialAccount.FRStatementFrequency statementFrequency) {
        return statementFrequency == null ? null : OBFrequency2.fromValue(statementFrequency.name());
    }

    public static OBFileFormat toOBFileFormat(FRFinancialAccount.FRFormat statementFrequency) {
        return statementFrequency == null ? null : OBFileFormat.fromValue(statementFrequency.name());
    }

    public static OBCommunicationMethod toOBCommunicationMethod(FRFinancialAccount.FRCommunicationMethod communicationMethod) {
        return communicationMethod == null ? null : OBCommunicationMethod.fromValue(communicationMethod.name());
    }

    private static List<OBAccount6AccountInner> toOBAccount6AccountList(List<FRAccountIdentifier> accounts) {
        return accounts == null ? null : accounts.stream()
                .map(FRAccountIdentifierConverter::toOBAccount6Account)
                .collect(Collectors.toList());
    }

    public static StatementFrequencyAndFormatInner toStatementFrequencyAndFormatInner(FRFinancialAccount.FRStatementFrequencyAndFormat statementFrequencyAndFormat) {
        return statementFrequencyAndFormat == null ? null : new StatementFrequencyAndFormatInner()
                .frequency(toOBFrequency2(statementFrequencyAndFormat.getStatementFrequency()))
                .format(toOBFileFormat(statementFrequencyAndFormat.getFormat()))
                .communicationMethod(toOBCommunicationMethod(statementFrequencyAndFormat.getCommunicationMethod()))
                .deliveryAddress(toOBPostalAddress7(statementFrequencyAndFormat.getPostalAddress()));
    }

    private static List<StatementFrequencyAndFormatInner> toStatementFrequencyAndFormatInnerList(List<FRFinancialAccount.FRStatementFrequencyAndFormat> statementFrequencyAndFormatsList) {
        return statementFrequencyAndFormatsList == null ? null : statementFrequencyAndFormatsList.stream()
                .map(FRFinancialAccountConverter::toStatementFrequencyAndFormatInner)
                .collect(Collectors.toList());
    }

    // OB to FR

    public static FRFinancialAccount toFRFinancialAccount(OBAccount6 account) {
        return account == null ? null : FRFinancialAccount.builder()
                .accountId(account.getAccountId())
                .status(toFRAccountStatusCode(account.getStatus()))
                .statusUpdateDateTime(account.getStatusUpdateDateTime())
                .currency(account.getCurrency())
                .accountType(toFRAccountTypeCode(account.getAccountCategory()))
                .accountSubType(toFRAccountSubTypeCode(account.getAccountTypeCode()))
                .description(account.getDescription())
                .nickname(account.getNickname())
                .openingDate(account.getOpeningDate())
                .maturityDate(account.getMaturityDate())
                .accounts(toFRAccountIdentifierList(account.getAccount(), FRAccountIdentifierConverter::toFRAccountIdentifier))
                .servicer(FRAccountServicerConverter.toFRAccountServicer(account.getServicer()))
                .switchStatus(account.getSwitchStatus())
                .statementFrequencyAndFormat(toFRStatementFrequencyAndFormatList(account.getStatementFrequencyAndFormat(), FRFinancialAccountConverter::toFRStatementFrequencyAndFormat))
                .build();
    }

    public static FRFinancialAccount.FRAccountStatusCode toFRAccountStatusCode(OBInternalAccountStatus1Code status) {
        return status == null ? null : FRFinancialAccount.FRAccountStatusCode.fromValue(status.name());
    }

    public static FRFinancialAccount.FRAccountTypeCode toFRAccountTypeCode(OBInternalAccountType1Code accountType) {
        return accountType == null ? null : FRFinancialAccount.FRAccountTypeCode.fromValue(accountType.name());
    }

    public static FRFinancialAccount.FRAccountSubTypeCode toFRAccountSubTypeCode(OBExternalAccountSubType1Code accountSubType) {
        return accountSubType == null ? null : FRFinancialAccount.FRAccountSubTypeCode.fromValue(String.valueOf(toFRAccountSubTypeCodeV3(accountSubType.name())));
    }

    public static <T> List<FRAccountIdentifier> toFRAccountIdentifierList(List<T> accounts, Function<T, FRAccountIdentifier> converter) {
        return accounts == null ? null : accounts.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static FRFinancialAccount.FRStatementFrequencyAndFormat toFRStatementFrequencyAndFormat(StatementFrequencyAndFormatInner statementFrequencyAndFormatInner) {
        return statementFrequencyAndFormatInner == null ? null : FRFinancialAccount.FRStatementFrequencyAndFormat.builder()
                .postalAddress(toFRPostalAddress(statementFrequencyAndFormatInner.getDeliveryAddress()))
                .communicationMethod(toFRCommunicationMethod(statementFrequencyAndFormatInner.getCommunicationMethod()))
                .statementFrequency(toFRStatementFrequency(statementFrequencyAndFormatInner.getFrequency()))
                .format(toFRFormat(statementFrequencyAndFormatInner.getFormat()))
                .build();
    }

    public static FRFinancialAccount.FRFormat toFRFormat(OBFileFormat fileFormat) {
        return fileFormat == null ? null : FRFinancialAccount.FRFormat.fromValue(fileFormat.name());
    }

    public static FRFinancialAccount.FRCommunicationMethod toFRCommunicationMethod(OBCommunicationMethod communicationMethod) {
        return communicationMethod == null ? null : FRFinancialAccount.FRCommunicationMethod.fromValue(communicationMethod.name());
    }

    public static FRFinancialAccount.FRStatementFrequency toFRStatementFrequency(OBFrequency2 obFrequency2) {
        return obFrequency2 == null ? null : FRFinancialAccount.FRStatementFrequency.fromValue(obFrequency2.name());
    }

    public static <T> List<FRFinancialAccount.FRStatementFrequencyAndFormat> toFRStatementFrequencyAndFormatList(List<T> accounts, Function<T, FRFinancialAccount.FRStatementFrequencyAndFormat> converter) {
        return accounts == null ? null : accounts.stream()
                .map(converter)
                .collect(Collectors.toList());
    }
}
