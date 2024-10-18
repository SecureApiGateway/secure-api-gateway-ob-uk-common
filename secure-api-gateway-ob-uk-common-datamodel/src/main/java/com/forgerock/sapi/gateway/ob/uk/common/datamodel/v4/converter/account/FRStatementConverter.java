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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.account.FRStatementData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.common.FRAmountConverter;
import lombok.extern.slf4j.Slf4j;
import uk.org.openbanking.datamodel.v4.account.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account.FRCreditDebitIndicatorConverter.*;

/**
 * Converter for 'FRStatement' documents.
 */
@Slf4j
public class FRStatementConverter {

    // FR to OB
    public static OBStatement2 toOBStatement2(FRStatementData frStatementData) {
        return frStatementData == null ? null : new OBStatement2()
                .accountId(frStatementData.getAccountId())
                .statementId(frStatementData.getStatementId())
                .statementReference(frStatementData.getStatementReference())
                .type(toOBExternalStatementType1Code(frStatementData.getType()))
                .startDateTime(frStatementData.getStartDateTime())
                .endDateTime(frStatementData.getEndDateTime())
                .creationDateTime(frStatementData.getCreationDateTime())
                .statementDescription(frStatementData.getStatementDescriptions())
                .statementBenefit(toOBStatement2StatementBenefitList(frStatementData.getStatementBenefits()))
                .statementFee(toOBStatementFee2List(frStatementData.getStatementFees()))
                .statementInterest(toOBStatement2StatementInterestList(frStatementData.getStatementInterests()))
                .statementDateTime(toOBStatement2StatementDateTimeList(frStatementData.getStatementDateTimes()))
                .statementRate(toOBStatement2StatementRateList(frStatementData.getStatementRates()))
                .statementValue(toOBStatement2StatementValueList(frStatementData.getStatementValues()))
                .totalValue(toOBReadBalance1DataTotalValue(frStatementData.getTotalValues()))
                .statementAmount(toOBStatement2StatementAmountList(frStatementData.getStatementAmounts()));
    }

    public static OBInternalStatementType1Code toOBExternalStatementType1Code(FRStatementData.FRStatementType type) {
        return type == null ? null : OBInternalStatementType1Code.valueOf(type.name());
    }

    public static List<OBStatement2StatementBenefitInner> toOBStatement2StatementBenefitList(List<FRStatementData.FRStatementBenefit> statementBenefit) {
        return statementBenefit == null ? null : statementBenefit.stream()
                .map(FRStatementConverter::toOBStatement2StatementBenefit)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementFeeInner> toOBStatementFee2List(List<FRStatementData.FRStatementFee> statementFee) {
        return statementFee == null ? null : statementFee.stream()
                .map(FRStatementConverter::toOBStatementFee2)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementInterestInner> toOBStatementInterest2List(List<FRStatementData.FRStatementInterest> statementInterest) {
        return statementInterest == null ? null : statementInterest.stream()
                .map(FRStatementConverter::toOBStatementInterest2)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementInterestInner> toOBStatement2StatementInterestList(List<FRStatementData.FRStatementInterest> statementInterest) {
        return statementInterest == null ? null : statementInterest.stream()
                .map(FRStatementConverter::toOBStatement2StatementInterest)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementDateTimeInner> toOBStatement2StatementDateTimeList(List<FRStatementData.FRStatementDateTime> statementDateTimes) {
        return statementDateTimes == null ? null : statementDateTimes.stream()
                .map(FRStatementConverter::toOBStatement2StatementDateTime)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementRateInner> toOBStatement2StatementRateList(List<FRStatementData.FRStatementRate> statementRate) {
        return statementRate == null ? null : statementRate.stream()
                .map(FRStatementConverter::toOBStatement2StatementRate)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementValueInner> toOBStatement2StatementValueList(List<FRStatementData.FRStatementValue> statementValue) {
        return statementValue == null ? null : statementValue.stream()
                .map(FRStatementConverter::toOBStatement2StatementValue)
                .collect(Collectors.toList());
    }

    public static List<OBStatement2StatementAmountInner> toOBStatement2StatementAmountList(List<FRStatementData.FRStatementAmount> statementAmount) {
        return statementAmount == null ? null : statementAmount.stream()
                .map(FRStatementConverter::toOBStatement2StatementAmount)
                .collect(Collectors.toList());
    }

    public static OBStatement2StatementBenefitInner toOBStatement2StatementBenefit(FRStatementData.FRStatementBenefit statementBenefit) {
        return statementBenefit == null ? null : new OBStatement2StatementBenefitInner()
                .type(statementBenefit.getType())
                .amount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount5(statementBenefit.getAmount()));
    }

    public static OBStatement2StatementFeeInner toOBStatementFee2(FRStatementData.FRStatementFee statementFee) {
        return statementFee == null ? null : new OBStatement2StatementFeeInner()
                .description(statementFee.getDescription())
                .creditDebitIndicator(toOBStatementFee2CreditDebitIndicatorEnum(statementFee.getCreditDebitIndicator()))
                .type(statementFee.getType())
                .rate(statementFee.getRate())
                .rateType(statementFee.getRateType())
                .frequency(statementFee.getFrequency())
                .amount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount6(statementFee.getAmount()));
    }

    public static OBStatement2StatementInterestInner toOBStatementInterest2(FRStatementData.FRStatementInterest statementInterest) {
        return statementInterest == null ? null : new OBStatement2StatementInterestInner()
                .description(statementInterest.getDescription())
                .creditDebitIndicator(toOBCreditDebitCode0(statementInterest.getCreditDebitIndicator()))
                .type(statementInterest.getType())
                .rate(statementInterest.getRate())
                .rateType(statementInterest.getRateType())
                .frequency(statementInterest.getFrequency())
                .amount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount7(statementInterest.getAmount()));
    }

    public static OBStatement2StatementInterestInner toOBStatement2StatementInterest(FRStatementData.FRStatementInterest statementInterest) {
        return statementInterest == null ? null : new OBStatement2StatementInterestInner()
                .description(statementInterest.getDescription())
                .creditDebitIndicator(toOBCreditDebitCode0(statementInterest.getCreditDebitIndicator()))
                .type(statementInterest.getType())
                .rate(statementInterest.getRate())
                .rateType(statementInterest.getRateType())
                .frequency(statementInterest.getFrequency())
                .amount(FRAmountConverter.toOBActiveOrHistoricCurrencyAndAmount7(statementInterest.getAmount()));
    }

    public static OBStatement2StatementDateTimeInner toOBStatement2StatementDateTime(FRStatementData.FRStatementDateTime statementDateTime) {
        return statementDateTime == null ? null : new OBStatement2StatementDateTimeInner()
                .dateTime(statementDateTime.getDateTime())
                .type(statementDateTime.getType());
    }

    public static OBStatement2StatementRateInner toOBStatement2StatementRate(FRStatementData.FRStatementRate statementRate) {
        return statementRate == null ? null : new OBStatement2StatementRateInner()
                .rate(statementRate.getRate())
                .type(statementRate.getType());
    }

    public static OBStatement2StatementValueInner toOBStatement2StatementValue(FRStatementData.FRStatementValue statementValue) {
        return statementValue == null ? null : new OBStatement2StatementValueInner()
                .value(String.valueOf(statementValue.getValue()))
                .type(statementValue.getType());
    }

    public static OBStatement2StatementAmountInner toOBStatement2StatementAmount(FRStatementData.FRStatementAmount statementAmount) {
        return statementAmount == null ? null : new OBStatement2StatementAmountInner()
                .creditDebitIndicator(toOBCreditDebitCode0(statementAmount.getCreditDebitIndicator()))
                .type(statementAmount.getType())
                .localAmount(FRAmountConverter.toOBStatement2StatementAmountInnerLocalAmount(statementAmount.getLocalAmount()))
                .amount(FRAmountConverter.toOBStatement2StatementAmountInnerAmount(statementAmount.getAmount()));
    }

    public static OBReadBalance1DataTotalValue toOBReadBalance1DataTotalValue(FRStatementData.FRTotalValue totalValue) {
        return totalValue == null ? null : new OBReadBalance1DataTotalValue()
                .currency(totalValue.getCurrency())
                .amount(String.valueOf(totalValue.getAmount()));
    }

    // OB to FR
    public static FRStatementData toFRStatementData(OBStatement2 obStatement) {
        return obStatement == null ? null : FRStatementData.builder()
                .accountId(obStatement.getAccountId())
                .statementId(obStatement.getStatementId())
                .statementReference(obStatement.getStatementReference())
                .type(toFRStatementType(obStatement.getType()))
                .startDateTime(obStatement.getStartDateTime())
                .endDateTime(obStatement.getEndDateTime())
                .creationDateTime(obStatement.getCreationDateTime())
                .statementDescriptions(obStatement.getStatementDescription())
                .statementBenefits(toStatementBenefitsList(obStatement.getStatementBenefit(), FRStatementConverter::toFRStatementBenefit))
                .statementFees(toStatementFeesList(obStatement.getStatementFee(), FRStatementConverter::toFRStatementFee))
                .statementInterests(toStatementInterestsList(obStatement.getStatementInterest(), FRStatementConverter::toFRStatementInterest))
                .statementDateTimes(toStatementDateTimesList(obStatement.getStatementDateTime(), FRStatementConverter::toFRStatementDateTime))
                .statementRates(toStatementRatesList(obStatement.getStatementRate(), FRStatementConverter::toFRStatementRate))
                .statementValues(toStatementValuesList(obStatement.getStatementValue(), FRStatementConverter::toFRStatementValue))
                .statementAmounts(toStatementAmountsList(obStatement.getStatementAmount(), FRStatementConverter::toFRStatementAmount))
                .build();
    }

    public static FRStatementData.FRStatementType toFRStatementType(OBInternalStatementType1Code type) {
        return type == null ? null : FRStatementData.FRStatementType.valueOf(type.name());
    }

    public static <T> List<FRStatementData.FRStatementBenefit> toStatementBenefitsList(List<T> statementBenefit, Function<T, FRStatementData.FRStatementBenefit> converter) {
        return statementBenefit == null ? null : statementBenefit.stream()
                .map(converter::apply)
                .collect(Collectors.toList());
    }

    public static <T> List<FRStatementData.FRStatementFee> toStatementFeesList(List<T> statementFee, Function<T, FRStatementData.FRStatementFee> converter) {
        return statementFee == null ? null : statementFee.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static <T> List<FRStatementData.FRStatementInterest> toStatementInterestsList(List<T> statementInterest, Function<T, FRStatementData.FRStatementInterest> converter) {
        return statementInterest == null ? null : statementInterest.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static <T> List<FRStatementData.FRStatementDateTime> toStatementDateTimesList(List<T> statementDateTime, Function<T, FRStatementData.FRStatementDateTime> converter) {
        return statementDateTime == null ? null : statementDateTime.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static <T> List<FRStatementData.FRStatementRate> toStatementRatesList(List<T> statementRate, Function<T, FRStatementData.FRStatementRate> converter) {
        return statementRate == null ? null : statementRate.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static <T> List<FRStatementData.FRStatementValue> toStatementValuesList(List<T> statementValue, Function<T, FRStatementData.FRStatementValue> converter) {
        return statementValue == null ? null : statementValue.stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    public static <T> List<FRStatementData.FRStatementAmount> toStatementAmountsList(List<T> statementAmount, Function<T, FRStatementData.FRStatementAmount> converter) {
        return statementAmount == null ? null : statementAmount.stream()
                .map(converter)
                .collect(Collectors.toList());
    }


    public static FRStatementData.FRStatementFee toFRStatementFee(OBStatement2StatementFeeInner statementFee) {
        return statementFee == null ? null : FRStatementData.FRStatementFee.builder()
                .description(statementFee.getDescription())
                .creditDebitIndicator(toFRCreditDebitIndicator(statementFee.getCreditDebitIndicator()))
                .type(statementFee.getType())
                .rate(statementFee.getRate())
                .rateType(statementFee.getRateType())
                .frequency(statementFee.getFrequency())
                .amount(FRAmountConverter.toFRAmount(statementFee.getAmount()))
                .build();
    }

    public static FRStatementData.FRStatementInterest toFRStatementInterest(OBStatement2StatementInterestInner statementInterest) {
        return statementInterest == null ? null : FRStatementData.FRStatementInterest.builder()
                .description(statementInterest.getDescription())
                .creditDebitIndicator(toFRCreditDebitIndicator(statementInterest.getCreditDebitIndicator()))
                .type(statementInterest.getType())
                .rate(statementInterest.getRate())
                .rateType(statementInterest.getRateType())
                .frequency(statementInterest.getFrequency())
                .amount(FRAmountConverter.toFRAmount(statementInterest.getAmount()))
                .build();
    }

    public static FRStatementData.FRStatementDateTime toFRStatementDateTime(OBStatement2StatementDateTimeInner statementDateTime) {
        return statementDateTime == null ? null : FRStatementData.FRStatementDateTime.builder()
                .dateTime(statementDateTime.getDateTime())
                .type(statementDateTime.getType())
                .build();
    }

    public static FRStatementData.FRStatementRate toFRStatementRate(OBStatement2StatementRateInner statementRate) {
        return statementRate == null ? null : FRStatementData.FRStatementRate.builder()
                .rate(statementRate.getRate())
                .type(statementRate.getType())
                .build();
    }

    public static FRStatementData.FRStatementBenefit toFRStatementBenefit(OBStatement2StatementBenefitInner statementBenefit) {
        return statementBenefit == null ? null : FRStatementData.FRStatementBenefit.builder()
                .type(statementBenefit.getType())
                .amount(FRAmountConverter.toFRAmount(statementBenefit.getAmount()))
                .build();
    }

    public static FRStatementData.FRStatementValue toFRStatementValue(OBStatement2StatementValueInner statementValue) {
        if (statementValue == null) {
            return null;
        } else {
            Integer value = null;
            try {
                value = Integer.valueOf(statementValue.getValue());
            } catch (NumberFormatException e) {
                log.warn("Unable to convert statementValue [{}] to Integer", statementValue.getValue());
            }
            return FRStatementData.FRStatementValue.builder()
                    .value(value)
                    .type(statementValue.getType())
                    .build();
        }
    }

    public static FRStatementData.FRStatementAmount toFRStatementAmount(OBStatement2StatementAmountInner statementAmount) {
        return statementAmount == null ? null : FRStatementData.FRStatementAmount.builder()
                .creditDebitIndicator(toFRCreditDebitIndicator(statementAmount.getCreditDebitIndicator()))
                .type(statementAmount.getType())
                .amount(FRAmountConverter.toFRAmount(statementAmount.getAmount()))
                .localAmount(FRAmountConverter.toFRAmount(statementAmount.getLocalAmount()))
                .build();
    }
}
