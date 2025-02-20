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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPermission;

import uk.org.openbanking.datamodel.v3.payment.OBWriteDomesticScheduledConsent4DataPermission;

public class FRPermissionConverter {

    // OB to FR
    public static FRPermission toFRPermission(OBWriteDomesticScheduledConsent4DataPermission permission) {
        return permission == null ? null : FRPermission.valueOf(permission.name());
    }

    // FR to OB
    public static OBWriteDomesticScheduledConsent4DataPermission toOBExternalPermissions2Code(FRPermission permission) {
        return permission == null ? null : OBWriteDomesticScheduledConsent4DataPermission.valueOf(permission.name());
    }
}
