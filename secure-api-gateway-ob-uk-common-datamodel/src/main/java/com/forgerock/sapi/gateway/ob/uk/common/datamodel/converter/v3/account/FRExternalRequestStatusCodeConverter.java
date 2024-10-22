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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRExternalRequestStatusCode;

import uk.org.openbanking.datamodel.v3.common.OBExternalRequestStatus1Code;

public class FRExternalRequestStatusCodeConverter {

    public static FRExternalRequestStatusCode toFRExternalRequestStatusCode(OBExternalRequestStatus1Code status) {
        return status == null ? null : FRExternalRequestStatusCode.valueOf(status.name());
    }

    public static OBExternalRequestStatus1Code toOBExternalRequestStatus1Code(FRExternalRequestStatusCode status) {
        return status == null ? null : OBExternalRequestStatus1Code.valueOf(status.name());
    }
}
