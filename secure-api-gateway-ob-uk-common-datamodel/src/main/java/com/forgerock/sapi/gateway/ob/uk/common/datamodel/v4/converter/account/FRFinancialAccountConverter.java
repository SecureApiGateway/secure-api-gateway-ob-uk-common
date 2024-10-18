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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRFinancialAccount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAccountIdentifierConverter;
import uk.org.openbanking.datamodel.v4.account.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FRFinancialAccountConverter {

    // FR to OB
    public static OBAccount6 toOBAccount6(FRFinancialAccount account) {
        return account == null ? null : new OBAccount6()
                .accountId(account.getAccountId())
                .status(toOBAccountStatus1Code(account.getStatus()))
                .statusUpdateDateTime(account.getStatusUpdateDateTime())
                .currency(account.getCurrency())
                .accountCategory(toOBInternalAccountType1Code(account.getAccountType()))
                .accountTypeCode(toOBExternalAccountSubType1Code(account.getAccountSubType()))
                .description(account.getDescription())
                .nickname(account.getNickname())
                .openingDate(account.getOpeningDate())
                .maturityDate(account.getMaturityDate())
                .account(toOBAccount6AccountList(account.getAccounts()))
                .servicer(FRAccountServicerConverter.toOBBranchAndFinancialInstitutionIdentification50(account.getServicer()));
    }

    public static OBInternalAccountStatus1Code toOBAccountStatus1Code(FRFinancialAccount.FRAccountStatusCode status) {
        return status == null ? null : OBInternalAccountStatus1Code.valueOf(status.name());
    }

    public static OBInternalAccountType1Code toOBInternalAccountType1Code(FRFinancialAccount.FRAccountTypeCode accountType) {
        return accountType == null ? null : OBInternalAccountType1Code.valueOf(accountType.name());
    }

    public static OBExternalAccountSubType1Code toOBExternalAccountSubType1Code(FRFinancialAccount.FRAccountSubTypeCode accountSubType) {
        return accountSubType == null ? null : OBExternalAccountSubType1Code.valueOf(accountSubType.name());
    }

    private static List<OBAccount6AccountInner> toOBAccount6AccountList(List<FRAccountIdentifier> accounts) {
        return accounts == null ? null : accounts.stream()
                .map(FRAccountIdentifierConverter::toOBAccount6Account)
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
                .build();
    }

    public static FRFinancialAccount.FRAccountStatusCode toFRAccountStatusCode(OBInternalAccountStatus1Code status) {
        return status == null ? null : FRFinancialAccount.FRAccountStatusCode.valueOf(status.name());
    }

    public static FRFinancialAccount.FRAccountTypeCode toFRAccountTypeCode(OBInternalAccountType1Code accountType) {
        return accountType == null ? null : FRFinancialAccount.FRAccountTypeCode.valueOf(accountType.name());
    }

    public static FRFinancialAccount.FRAccountSubTypeCode toFRAccountSubTypeCode(OBExternalAccountSubType1Code accountSubType) {
        return accountSubType == null ? null : FRFinancialAccount.FRAccountSubTypeCode.valueOf(accountSubType.name());
    }

    public static <T> List<FRAccountIdentifier> toFRAccountIdentifierList(List<T> accounts, Function<T, FRAccountIdentifier> converter) {
        return accounts == null ? null : accounts.stream()
                .map(converter)
                .collect(Collectors.toList());
    }
}
