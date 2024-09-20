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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FROfferData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRAmountConverter;

import uk.org.openbanking.datamodel.v3.account.OBReadOffer1DataOfferInner;
import uk.org.openbanking.datamodel.v3.account.OBReadOffer1DataOfferInnerOfferType;

public class FROfferConverter {

    // FR to OB

    public static OBReadOffer1DataOfferInner toOBReadOffer1DataOffer(FROfferData offerData) {
        return offerData == null ? null : new OBReadOffer1DataOfferInner()
                .accountId(offerData.getAccountId())
                .offerId(offerData.getOfferId())
                .offerType(toOBReadOffer1DataOfferType(offerData.getOfferType()))
                .description(offerData.getDescription())
                .startDateTime(offerData.getStartDateTime())
                .endDateTime(offerData.getEndDateTime())
                .rate(offerData.getRate())
                .value(offerData.getValue())
                .term(offerData.getTerm())
                .URL(offerData.getURL())
                .amount(FRAmountConverter.toOBReadOffer1DataAmount(offerData.getAmount()))
                .fee(FRAmountConverter.toOBReadOffer1DataFee(offerData.getFee()));
    }

    public static OBReadOffer1DataOfferInnerOfferType toOBReadOffer1DataOfferType(FROfferData.FROfferType offerType) {
        return offerType == null ? null : OBReadOffer1DataOfferInnerOfferType.valueOf(offerType.name());
    }

    // OB to FR
    public static FROfferData toFROfferData(OBReadOffer1DataOfferInner obOffer) {
        return obOffer == null ? null : FROfferData.builder()
                .accountId(obOffer.getAccountId())
                .offerId(obOffer.getOfferId())
                .offerType(toFROfferType(obOffer.getOfferType()))
                .description(obOffer.getDescription())
                .startDateTime(obOffer.getStartDateTime())
                .endDateTime(obOffer.getEndDateTime())
                .rate(obOffer.getRate())
                .value(obOffer.getValue())
                .term(obOffer.getTerm())
                .URL(obOffer.getURL())
                .amount(FRAmountConverter.toFRAmount(obOffer.getAmount()))
                .fee(FRAmountConverter.toFRAmount(obOffer.getFee()))
                .build();
    }

    public static FROfferData.FROfferType toFROfferType(OBReadOffer1DataOfferInnerOfferType offerType) {
        return offerType == null ? null : FROfferData.FROfferType.valueOf(offerType.name());
    }
}
