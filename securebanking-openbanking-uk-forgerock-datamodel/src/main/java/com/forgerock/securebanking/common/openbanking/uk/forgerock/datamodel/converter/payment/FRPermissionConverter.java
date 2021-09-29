/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRPermission;
import uk.org.openbanking.datamodel.payment.*;

public class FRPermissionConverter {

    // OB to FR
    public static FRPermission toFRPermission(OBExternalPermissions2Code permission) {
        return permission == null ? null : FRPermission.valueOf(permission.name());
    }

    // FR to OB
    public static OBExternalPermissions2Code toOBExternalPermissions2Code(FRPermission permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }
}
