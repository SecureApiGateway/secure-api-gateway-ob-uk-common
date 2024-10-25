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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import uk.org.openbanking.datamodel.v4.account.*;
import uk.org.openbanking.datamodel.v4.common.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.v4.fund.OBFundsConfirmationConsent1DataDebtorAccount;
import uk.org.openbanking.datamodel.v4.payment.*;
import uk.org.openbanking.datamodel.v4.vrp.OBCashAccountDebtorWithName;

public class FRAccountIdentifierConverter {

    // OB to FR
    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccount51 account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccount60 account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccount61 account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccountDebtor4 account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccountCreditor3 account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBWriteDomestic2DataInitiationCreditorAccount account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBWriteDomestic2DataInitiationDebtorAccount account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount account) {
        return FRModelMapper.map(account, FRAccountIdentifier.class);
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccountDebtorWithName account){
        return account == null ? null : FRAccountIdentifier.builder()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification())
                .build();
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBFundsConfirmationConsent1DataDebtorAccount account) {
        return account == null ? null :FRAccountIdentifier.builder()
                .schemeName(account.getSchemeName() == null ? null : account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification())
                .build();
    }

    // FR to OB
    public static OBFundsConfirmationConsent1DataDebtorAccount toOBFundsConfirmationConsent1DataDebtorAccount(FRAccountIdentifier account){
        return FRModelMapper.map(account, OBFundsConfirmationConsent1DataDebtorAccount.class);
    }
    public static OBCashAccountCreditor3 toOBCashAccountCreditor3(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBCashAccountCreditor3.class);
    }

    public static OBCashAccountDebtor4 toOBCashAccountDebtor4(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBCashAccountDebtor4.class);
    }

    public static OBCashAccountDebtorWithName toOBCashAccountDebtorWithName(FRAccountIdentifier accountIdentifier) {
        return accountIdentifier == null ? null : new OBCashAccountDebtorWithName()
                .identification(accountIdentifier.getIdentification())
                .name(accountIdentifier.getName())
                .schemeName(accountIdentifier.getSchemeName())
                .secondaryIdentification(accountIdentifier.getSecondaryIdentification());
    }

    public static OBCashAccount50 toOBCashAccount50(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBCashAccount50.class);
    }

    public static OBCashAccount51 toOBCashAccount51(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBCashAccount51.class);
    }

    public static OBCashAccount60 toOBCashAccount60(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBCashAccount60.class);
    }

    public static OBCashAccount61 toOBCashAccount61(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBCashAccount61.class);
    }

    public static OBAccount6AccountInner toOBAccount6Account(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBAccount6AccountInner.class);
    }

    public static OBWriteDomestic2DataInitiationCreditorAccount toOBWriteDomestic2DataInitiationCreditorAccount(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBWriteDomestic2DataInitiationCreditorAccount.class);
    }

    public static OBWriteDomestic2DataInitiationDebtorAccount toOBWriteDomestic2DataInitiationDebtorAccount(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBWriteDomestic2DataInitiationDebtorAccount.class);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationCreditorAccount toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBWriteDomesticStandingOrder3DataInitiationCreditorAccount.class);
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAccount toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBWriteInternationalStandingOrder4DataInitiationCreditorAccount.class);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationDebtorAccount toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(FRAccountIdentifier account) {
        return FRModelMapper.map(account, OBWriteDomesticStandingOrder3DataInitiationDebtorAccount.class);
    }
    // OB to FR

    public static FRAccountIdentifier toFRAccountIdentifier(OBAccount6AccountInner account) {
        return account == null ? null : FRAccountIdentifier.builder()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification())
                .build();
    }

    public static FRAccountIdentifier toFRAccountIdentifier(OBCashAccount50 account) {
        return account == null ? null : FRAccountIdentifier.builder()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification())
                .build();
    }
}
