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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRTotalValue;

import uk.org.openbanking.datamodel.account.OBReadBalance1DataTotalValue;

public class FRTotalValueConverter {

    public static FRTotalValue toFRTotalValue(OBReadBalance1DataTotalValue obTotalValue) {
        return obTotalValue == null ? null : FRTotalValue.builder()
                .amount(obTotalValue.getAmount())
                .currency(obTotalValue.getCurrency())
                .build();
    }

    public static OBReadBalance1DataTotalValue toOBReadBalance1DataTotalValue(FRTotalValue frTotalValue) {
        if (frTotalValue == null) {
            return null;
        }
        OBReadBalance1DataTotalValue obTotalValue = new OBReadBalance1DataTotalValue();
        obTotalValue.setAmount(frTotalValue.getAmount());
        obTotalValue.setCurrency(frTotalValue.getCurrency());
        return obTotalValue;
    }
}
