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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.common.FRRisk1PaymentContextCode;
import uk.org.openbanking.datamodel.v4.common.OBRisk1PaymentContextCode;

public class FROBRisk1PaymentContextCodeConverter {

    public static FRRisk1PaymentContextCode toFRRisk1PaymentContextCode(OBRisk1PaymentContextCode obRisk1PaymentContextCode) {
        return obRisk1PaymentContextCode == null ? null : FRRisk1PaymentContextCode.valueOf(obRisk1PaymentContextCode.name());
    }

    public static OBRisk1PaymentContextCode toOBRisk1PaymentContextCode(FRRisk1PaymentContextCode frRisk1PaymentContextCode) {
        return frRisk1PaymentContextCode == null ? null : OBRisk1PaymentContextCode.valueOf(frRisk1PaymentContextCode.name());
    }

}
