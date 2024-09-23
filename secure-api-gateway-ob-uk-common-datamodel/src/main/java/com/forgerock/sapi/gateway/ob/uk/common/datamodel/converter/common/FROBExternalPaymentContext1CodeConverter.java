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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRExternalPaymentContextCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRisk1PaymentContextCode;

import uk.org.openbanking.datamodel.v3.common.OBExternalPaymentContext1Code;
import uk.org.openbanking.datamodel.v4.common.OBRisk1PaymentContextCode;

public class FROBExternalPaymentContext1CodeConverter {

    // OB to FR
    public static FRExternalPaymentContextCode toFRExternalPaymentContextCode(OBExternalPaymentContext1Code obExternalPaymentContext1Code) {
        return obExternalPaymentContext1Code == null ? null : FRExternalPaymentContextCode.valueOf(obExternalPaymentContext1Code.name());
    }

    public static FRExternalPaymentContextCode toFRExternalPaymentContextCode(OBRisk1PaymentContextCode obRisk1PaymentContextCode) {
        return obRisk1PaymentContextCode == null ? null : FRExternalPaymentContextCode.valueOf(obRisk1PaymentContextCode.name());
    }

    // FR to OB
    public static OBExternalPaymentContext1Code toOBExternalPaymentContext1Code(FRExternalPaymentContextCode frExternalPaymentContextCode) {
        return frExternalPaymentContextCode == null ? null : OBExternalPaymentContext1Code.valueOf(frExternalPaymentContextCode.name());
    }

    public static OBExternalPaymentContext1Code toOBExternalPaymentContext1Code(FRRisk1PaymentContextCode frRisk1PaymentContextCode) {
        return frRisk1PaymentContextCode == null ? null : OBExternalPaymentContext1Code.valueOf(frRisk1PaymentContextCode.name());
    }
}
