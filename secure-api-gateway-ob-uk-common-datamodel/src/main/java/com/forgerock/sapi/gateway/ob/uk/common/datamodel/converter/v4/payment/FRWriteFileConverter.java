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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteDataFile;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteFile;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFile2;
import uk.org.openbanking.datamodel.v4.payment.OBWriteFile2Data;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment.FRWriteFileConsentConverter.*;

public class FRWriteFileConverter {

    // OB to FR
    public static FRWriteFile toFRWriteFile(OBWriteFile2 obWriteFile2) {
        return obWriteFile2 == null ? null : FRWriteFile.builder()
                .data(toFRWriteDataFile(obWriteFile2.getData()))
                .build();
    }

    public static FRWriteDataFile toFRWriteDataFile(OBWriteFile2Data data) {
        return data == null ? null : FRWriteDataFile.builder()
                .consentId(data.getConsentId())
                .initiation(toFRWriteFileDataInitiation(data.getInitiation()))
                .build();
    }

    // FR to OB
    public static OBWriteFile2 toOBWriteFile2(FRWriteFile filePayment) {
        return filePayment == null ? null : new OBWriteFile2()
                .data(toOBWriteFile2Data(filePayment.getData()));
    }

    public static OBWriteFile2Data toOBWriteFile2Data(FRWriteDataFile data) {
        return data == null ? null : new OBWriteFile2Data()
                .consentId(data.getConsentId())
                .initiation(toOBWriteFile2DataInitiation(data.getInitiation()));
    }
}
