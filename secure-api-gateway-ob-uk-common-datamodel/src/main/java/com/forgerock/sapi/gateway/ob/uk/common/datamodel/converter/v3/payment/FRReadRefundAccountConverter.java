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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRReadRefundAccount;

import uk.org.openbanking.datamodel.v3.common.OBReadRefundAccount;

public class FRReadRefundAccountConverter {

    public static FRReadRefundAccount toFRReadRefundAccount(OBReadRefundAccount readRefundAccount) {
        return readRefundAccount == null ? null : FRReadRefundAccount.valueOf(readRefundAccount.name());
    }
}
