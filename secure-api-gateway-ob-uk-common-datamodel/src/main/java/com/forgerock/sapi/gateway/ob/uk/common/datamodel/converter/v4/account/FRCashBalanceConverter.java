/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRBalanceType;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCashBalance;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCashBalanceData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRCreditLine;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRTotalValue;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter;
import uk.org.openbanking.datamodel.v4.account.*;

import java.util.List;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRBalanceTypeConverter.toFRBalanceTypeV3;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRBalanceTypeConverter.toOBBalanceType1CodeV4;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account.FRCreditDebitIndicatorConverter.toFRCreditDebitIndicator;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRAmountConverter.*;
import static java.util.stream.Collectors.toList;

public class FRCashBalanceConverter {

    // FR to OB
    public static OBReadBalance1Data toOBReadBalance1DataBalance(FRCashBalanceData balanceData) {
        return balanceData == null ? null : new OBReadBalance1Data()
                .balance(toOBReadBalance1DataBalanceInnerList(balanceData.getBalance()))
                .totalValue(toOBReadBalance1DataTotalValue(balanceData.getTotalValue()))                ;
    }

    public static List<OBReadBalance1DataBalanceInner> toOBReadBalance1DataBalanceInnerList(List<FRCashBalance> balanceInner) {
        return balanceInner == null ? null : balanceInner.stream()
                .map(FRCashBalanceConverter::toOBReadBalance1DataBalanceInner)
                .collect(toList());
    }

    public static OBReadBalance1DataBalanceInner toOBReadBalance1DataBalanceInner(FRCashBalance balance) {
        return balance == null ? null : new OBReadBalance1DataBalanceInner()
                .accountId(balance.getAccountId())
                .creditDebitIndicator(FRCreditDebitIndicatorConverter.toOBCreditDebitCode2(balance.getCreditDebitIndicator()))
                .type(toOBBalanceType1CodeV4(String.valueOf(balance.getType())))
                .dateTime(balance.getDateTime())
                .amount(toOBReadBalance1DataAmount(balance.getAmount()))
                .localAmount(FRAmountConverter.toOBReadBalance1DataBalanceInnerLocalAmount(balance.getLocalAmount()))
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

    public static OBReadBalance1DataTotalValue toOBReadBalance1DataTotalValue(FRTotalValue totalValue) {
        return totalValue == null ? null : new OBReadBalance1DataTotalValue()
                .currency(totalValue.getCurrency())
                .amount(totalValue.getAmount());
    }

    // OB to FR
    public static FRBalanceType toFRBalanceType(OBBalanceType1Code type) {
        return type == null ? null : FRBalanceType.fromValue(String.valueOf(toFRBalanceTypeV3(type.name())));
    }

    public static FRCashBalanceData toFRCashBalanceData(OBReadBalance1Data balanceData) {
        return balanceData == null ? null : FRCashBalanceData.builder()
                .balance(toFRCashBalanceList(balanceData.getBalance()))
                .totalValue(toFRTotalValue(balanceData.getTotalValue()))
                .build();
    }

    public static List<FRCashBalance> toFRCashBalanceList(List<OBReadBalance1DataBalanceInner> creditLines) {
        return creditLines == null ? null : creditLines.stream()
                .map(FRCashBalanceConverter::toFRCashBalance)
                .collect(toList());
    }

    public static FRCashBalance toFRCashBalance(OBReadBalance1DataBalanceInner balance) {
        return balance == null ? null : FRCashBalance.builder()
                .creditDebitIndicator(toFRCreditDebitIndicator(balance.getCreditDebitIndicator()))
                .accountId(balance.getAccountId())
                .amount(toFRAmount(balance.getAmount()))
                .dateTime(balance.getDateTime())
                .creditLines(toFRCreditLines(balance.getCreditLine()))
                .type(toFRBalanceType(balance.getType()))
                .localAmount(toFRLocalAmount(balance.getLocalAmount()))
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

    public static FRTotalValue toFRTotalValue(OBReadBalance1DataTotalValue totalValue) {
        return totalValue == null ? null : FRTotalValue.builder()
                .currency(totalValue.getCurrency())
                .amount(totalValue.getAmount())
                .build();
    }
}
