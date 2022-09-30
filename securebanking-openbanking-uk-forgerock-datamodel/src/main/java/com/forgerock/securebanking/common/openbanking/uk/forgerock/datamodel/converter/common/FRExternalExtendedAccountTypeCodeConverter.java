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

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRExternalExtendedAccountTypeCode;

import uk.org.openbanking.datamodel.payment.OBExternalExtendedAccountType1Code;

public class FRExternalExtendedAccountTypeCodeConverter {

    public static FRExternalExtendedAccountTypeCode toFRExternalExtendedAccountTypeCode(OBExternalExtendedAccountType1Code externalExtendedAccountType1Code) {
        return externalExtendedAccountType1Code == null ? null : FRExternalExtendedAccountTypeCode.fromValue(externalExtendedAccountType1Code.getValue());
    }

    public static OBExternalExtendedAccountType1Code toOBExternalExtendedAccountType1Code(FRExternalExtendedAccountTypeCode externalExtendedAccountTypeCode) {
        return externalExtendedAccountTypeCode == null ? null : OBExternalExtendedAccountType1Code.fromValue(externalExtendedAccountTypeCode.getValue());
    }

}