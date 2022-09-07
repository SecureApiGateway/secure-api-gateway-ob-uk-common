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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRExternalPaymentContextCode;
import uk.org.openbanking.datamodel.common.OBExternalPaymentContext1Code;
import uk.org.openbanking.datamodel.common.OBRisk1.PaymentContextCodeEnum;

public class FROBExternalPaymentContext1CodeConverter {
    public static FRExternalPaymentContextCode toFRExternalPaymentContextCode(OBExternalPaymentContext1Code obExternalPaymentContext1Code) {
        return obExternalPaymentContext1Code == null ? null : FRExternalPaymentContextCode.valueOf(obExternalPaymentContext1Code.name());
    }

    public static FRExternalPaymentContextCode toFRExternalPaymentContextCode(PaymentContextCodeEnum paymentContextCodeEnum) {
        return paymentContextCodeEnum == null ? null : FRExternalPaymentContextCode.fromValue(paymentContextCodeEnum.getValue());
    }

    public static OBExternalPaymentContext1Code toOBExternalPaymentContext1Code(FRExternalPaymentContextCode frExternalPaymentContextCode) {
        return frExternalPaymentContextCode == null ? null : OBExternalPaymentContext1Code.valueOf(frExternalPaymentContextCode.name());
    }

    public static PaymentContextCodeEnum toPaymentContextCodeEnum(FRExternalPaymentContextCode frExternalPaymentContextCode) {
        return frExternalPaymentContextCode == null ? null : PaymentContextCodeEnum.fromValue(frExternalPaymentContextCode.getValue());
    }
}
