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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRBalanceType;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCashBalance;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditLine;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAmountConverter;
import uk.org.openbanking.datamodel.v4.account.OBBalanceType1Code;
import uk.org.openbanking.datamodel.v4.account.OBReadBalance1DataBalanceInner;
import uk.org.openbanking.datamodel.v4.account.OBReadBalance1DataBalanceInnerCreditLineInner;
import uk.org.openbanking.datamodel.v4.account.OBReadBalance1DataBalanceInnerCreditLineInnerType;

import java.util.List;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRCreditDebitIndicatorConverter.toFRCreditDebitIndicator;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAmountConverter.toFRAmount;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAmountConverter.toOBReadBalance1DataAmount;
import static java.util.stream.Collectors.toList;

public class FRCashBalanceConverter {

    // FR to OB
    public static OBReadBalance1DataBalanceInner toOBReadBalance1DataBalance(FRCashBalance balance) {
        return balance == null ? null : new OBReadBalance1DataBalanceInner()
                .accountId(balance.getAccountId())
                .creditDebitIndicator(FRCreditDebitIndicatorConverter.toOBCreditDebitCode2(balance.getCreditDebitIndicator()))
                .type(toOBBalanceType1Code(balance.getType()))
                .dateTime(balance.getDateTime())
                .amount(toOBReadBalance1DataAmount(balance.getAmount()))
                .creditLine(toOBReadBalance1DataCreditLineList(balance.getCreditLines()));
    }

    public static OBBalanceType1Code toOBBalanceType1Code(FRBalanceType type) {
        return type == null ? null : OBBalanceType1Code.valueOf(type.name());
    }

    public static List<OBReadBalance1DataBalanceInnerCreditLineInner> toOBReadBalance1DataCreditLineList(List<FRCreditLine> creditLines) {
        return creditLines == null ? null : creditLines.stream()
                .map(FRCashBalanceConverter::toOBReadBalance1DataCreditLine)
                .collect(toList());
    }

    public static OBReadBalance1DataBalanceInnerCreditLineInner toOBReadBalance1DataCreditLine(FRCreditLine creditLine) {
        return creditLine == null ? null : new OBReadBalance1DataBalanceInnerCreditLineInner()
                .included(creditLine.getIncluded())
                .type(toOBReadBalance1DataCreditLineType(creditLine.getType()))
                .amount(FRAmountConverter.toOBReadBalance1DataAmount1(creditLine.getAmount()));
    }

    public static OBReadBalance1DataBalanceInnerCreditLineInnerType toOBReadBalance1DataCreditLineType(FRCreditLine.FRLimitType type) {
        return type == null ? null : OBReadBalance1DataBalanceInnerCreditLineInnerType.valueOf(type.name());
    }

    // OB to FR
    public static FRBalanceType toFRBalanceType(OBBalanceType1Code type) {
        return type == null ? null : FRBalanceType.valueOf(type.name());
    }

    public static FRCashBalance toFRCashBalance(OBReadBalance1DataBalanceInner balance) {
        return balance == null ? null : FRCashBalance.builder()
                .creditDebitIndicator(toFRCreditDebitIndicator(balance.getCreditDebitIndicator()))
                .accountId(balance.getAccountId())
                .amount(toFRAmount(balance.getAmount()))
                .dateTime(balance.getDateTime())
                .creditLines(toFRCreditLines(balance.getCreditLine()))
                .type(toFRBalanceType(balance.getType()))
                .build();
    }


    public static List<FRCreditLine> toFRCreditLines(List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLines) {
        return creditLines == null ? null : creditLines.stream()
                .map(FRCashBalanceConverter::toFRCreditLine)
                .collect(toList());
    }

    public static FRCreditLine toFRCreditLine(OBReadBalance1DataBalanceInnerCreditLineInner creditLine) {
        return creditLine == null ? null : FRCreditLine.builder()
                .included(creditLine.getIncluded())
                .type(toFRLimitType(creditLine.getType()))
                .amount(toFRAmount(creditLine.getAmount()))
                .build();
    }

    public static FRCreditLine.FRLimitType toFRLimitType(OBReadBalance1DataBalanceInnerCreditLineInnerType type) {
        return type == null ? null : FRCreditLine.FRLimitType.valueOf(type.name());
    }
}
