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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRResponseDataRefund;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRInternationalResponseDataRefund;

import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticResponse5DataRefund;
import uk.org.openbanking.datamodel.v4.payment.OBWriteDomesticResponse5DataRefundAccount;
import uk.org.openbanking.datamodel.v4.vrp.OBCashAccountDebtorWithName;

/**
 * Converter for {@link FRResponseDataRefund} and {@link FRInternationalResponseDataRefund} into equivalent OB objects.
 */
public class FRResponseDataRefundConverter {

    // FR to OB (only domestic transactions for now)
    public static OBWriteDomesticResponse5DataRefund toOBWriteDomesticResponse5DataRefund(FRResponseDataRefund refund) {
        return refund == null ? null : new OBWriteDomesticResponse5DataRefund()
                .account(toOBWriteDomesticResponse5DataRefundAccount(refund.getAccount()));
    }

    public static OBCashAccountDebtorWithName toOBCashAccountDebtorWithName(FRResponseDataRefund refund) {
        return refund == null ? null : toOBCashAccountDebtorWithNameAccount(refund.getAccount());
    }

    private static OBCashAccountDebtorWithName toOBCashAccountDebtorWithNameAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBCashAccountDebtorWithName()
                .identification(account.getIdentification())
                .name(account.getName())
                .schemeName(account.getSchemeName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }

    private static OBWriteDomesticResponse5DataRefundAccount toOBWriteDomesticResponse5DataRefundAccount(FRAccountIdentifier account) {
        return account == null ? null : new OBWriteDomesticResponse5DataRefundAccount()
                .schemeName(account.getSchemeName())
                .identification(account.getIdentification())
                .name(account.getName())
                .secondaryIdentification(account.getSecondaryIdentification());
    }
}
