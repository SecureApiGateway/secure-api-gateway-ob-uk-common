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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSupplementaryData;
import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;

public class FRSupplementaryDataConverter {

    public static FRSupplementaryData toFRSupplementaryData(OBSupplementaryData1 obSupplementaryData) {
        return obSupplementaryData == null ? null : FRSupplementaryData.builder()
                .data(obSupplementaryData.getData())
                .build();
    }

    public static OBSupplementaryData1 toOBSupplementaryData1(FRSupplementaryData frSupplementaryData) {
        if (frSupplementaryData == null) {
            return null;
        }
        OBSupplementaryData1 obSupplementaryData1 = new OBSupplementaryData1();
        obSupplementaryData1.setData(frSupplementaryData.getData());
        return obSupplementaryData1;
    }

    public static FRSupplementaryData toFRSupplementaryData(Object obSupplementaryData) {
        return obSupplementaryData == null ? null : FRSupplementaryData.builder()
                                                                       .data(obSupplementaryData.toString())
                                                                       .build();
    }
}
